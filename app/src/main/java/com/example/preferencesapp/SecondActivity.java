package com.example.preferencesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewAge = findViewById(R.id.sa_age_tv);
        TextView textViewName = findViewById(R.id.sa_name_tv);
        int userAge =
                getSharedPreferences(Constats.SHARED_PREFERENCES_NAME, MODE_PRIVATE)
                .getInt(Constats.USER_AGE_PREF, 0);
        String userName = getSharedPreferences(Constats.SHARED_PREFERENCES_NAME, MODE_PRIVATE)
                .getString(Constats.USER_NAME_PREF, "User");

            textViewAge.setText(userAge == 0
                    ? "Возраст не задан"
                    : String.valueOf(userAge));

            textViewName.setText(userName);
    }
}
