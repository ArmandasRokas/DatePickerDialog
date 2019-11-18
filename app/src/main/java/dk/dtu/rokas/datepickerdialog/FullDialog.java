package dk.dtu.rokas.datepickerdialog;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.tsongkha.spinnerdatepicker.SpinnerDatePickerDialogBuilder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FullDialog extends DialogFragment  implements com.tsongkha.spinnerdatepicker.DatePickerDialog.OnDateSetListener{

    final Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);
    Button startDate;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {







        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = requireActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_signin, null);

        startDate = view.findViewById(R.id.username);
        startDate.setHint("bla");
        startDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showDateSpinner();
            }

        });
        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                // Add action buttons
                .setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // sign in the user ...
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        builder.setView(view);
        return builder.create();
    }

    @Override
    public void onDateSet(com.tsongkha.spinnerdatepicker.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Calendar cal = new GregorianCalendar(year, monthOfYear, dayOfMonth);
        String s = (new SimpleDateFormat("dd-MMM-YYYY").format(cal.getTime()));
                startDate.setText(s);
    }

    public void showDateSpinner(){
        new SpinnerDatePickerDialogBuilder()
                .context(this.getContext())
                .callback(this)
                .spinnerTheme(R.style.NumberPickerStyle)
                .showTitle(true)
                .showDaySpinner(true)
                .defaultDate(year, month, day)
                .maxDate(year, month, day)
                .minDate(2000, 0, 1)
                .build()
                .show();
    }
}
