package com.example.android.jamboafrica;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }


    // Category Selection

    public void categorySelection(View view){

        // Start Button
        Button startButton = findViewById(R.id.start_btn);

        // Categories

        CheckBox cat1 = findViewById(R.id.arts);
        CheckBox cat2 = findViewById(R.id.biz);
        CheckBox cat3 = findViewById(R.id.culture);
        CheckBox cat4 = findViewById(R.id.geo);
        CheckBox cat5 = findViewById(R.id.histo);
        CheckBox cat6 = findViewById(R.id.leadership);
        CheckBox cat7 = findViewById(R.id.tech);
        CheckBox cat8 = findViewById(R.id.others);

        // If a category is checked, the truthy is stored in a variable

        Boolean isArts = cat1.isChecked();
        Boolean isBiz = cat2.isChecked();
        Boolean isCulture = cat3.isChecked();
        Boolean isGeography = cat4.isChecked();
        Boolean isHistory = cat5.isChecked();
        Boolean isLeadership = cat6.isChecked();
        Boolean isTech = cat7.isChecked();
        Boolean isOthers = cat8.isChecked();


        // Limiting Category Selection

        Boolean limitCategory [] = {isArts,isBiz,isCulture,isGeography,isHistory,isLeadership,isTech,isOthers};

        int numberOfCheckBox = limitCategory.length;

        if(numberOfCheckBox > 1){
            switch (view.getId()){
                case R.id.arts:
                    if(isArts){
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.biz:
                    if(isBiz){
                        cat1.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.culture:
                    if(isCulture){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.geo:
                    if(isGeography){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.histo:
                    if(isCulture){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.leadership:
                    if(isLeadership){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat7.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.tech:
                    if(isTech){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat8.setChecked(false);
                    }
                    break;
                case R.id.others:
                    if(isOthers){
                        cat1.setChecked(false);
                        cat2.setChecked(false);
                        cat3.setChecked(false);
                        cat4.setChecked(false);
                        cat5.setChecked(false);
                        cat6.setChecked(false);
                        cat7.setChecked(false);
                    }

            }
        }


        // Using Conditional statements to limit category selected, currently Geography is the only category supported

        if(isGeography){

            // Set Button to Visible

            startButton.setVisibility(View.VISIBLE);


        }else if(isArts || isBiz || isCulture || isHistory || isLeadership || isTech || isOthers){


            // Message to Display

            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Only Geography Category is Active. Check back later!");

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 600);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }

    }

    // Start Quiz Button

    public void startQuiz(View view){

        // Changing Activity

        Button proceed = findViewById(R.id.start_btn);

            proceed.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Intent quiz = new Intent(getApplicationContext(),QuizPage.class);
                    startActivity(quiz);
                }
            });

    }


}