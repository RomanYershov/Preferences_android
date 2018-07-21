package com.example.preferencesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        TextView textViewName = findViewById(R.id.new_name_tv);
        TextView textViewAge = findViewById(R.id.new_age_tv);

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
