package dk.dtu.rokas.datepickerdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.tsongkha.spinnerdatepicker.SpinnerDatePickerDialogBuilder;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity   {

    private int mYear;
    private int mMonth;
    private int mDay;
    private String date_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        DialogFragment dialogFragment = new FullDialog();
        dialogFragment.show(getSupportFragmentManager(), "fullDialog");



 /*       Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize a new date picker dialog fragment
                //DialogFragment dFragment = new DatePickerFragment();

                // Show the date picker dialog fragment
                //dFragment.show(getSupportFragmentManager(), "Date Picker");
                //dFragment.show(getFragmentManager(), "Date Picker");
                datePicker();
            }
        });*/
    }
/*
    private void datePicker(){

        // Get Current Date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,android.R.style.Theme_Material_Dialog,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year,int monthOfYear, int dayOfMonth) {

                        date_time = dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;
                        //*************Call Time Picker Here ********************
                        //tiemPicker(); // number of days pickker
                    }
                }, mYear, mMonth, mDay);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        datePickerDialog.show();
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
*/


}


