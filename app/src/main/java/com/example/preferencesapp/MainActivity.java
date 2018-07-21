package com.example.preferencesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewName = findViewById(R.id.ma_name_tv);
        TextView textViewAge = findViewById(R.id.ma_age_tv);
        SharedPreferences sharedPreferences
                = getSharedPreferences(Constats.SHARED_PREFERENCES_NAME, MODE_PRIVATE);

        Button btn_newscreen = findViewById(R.id.ma_screen1_btn);
        btn_newscreen.setOnClickListener(view -> {



                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(Constats.USER_AGE_PREF, Integer.parseInt(textViewAge.getText().toString()));
                editor.putString(Constats.USER_NAME_PREF, textViewName.getText().toString());
                editor.apply();


            Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
            startActivity(intent);
        });

        Button btnNewScreen2 = findViewById(R.id.ma_scrent2_btn);
        btnNewScreen2.setOnClickListener(view -> {

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt(Constats.USER_AGE_PREF, Integer.parseInt(textViewAge.getText().toString()));
                editor.putString(Constats.USER_NAME_PREF, textViewName.getText().toString());
                editor.apply();


            Intent intent = new Intent(getApplicationContext(), NewActivity.class);
            startActivity(intent);
        });
    }
}
