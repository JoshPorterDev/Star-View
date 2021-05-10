package com.example.starview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_StarView);
        setContentView(R.layout.activity_main);

        findViewById(R.id.submitGeographicalDataButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText cityStateEditText = findViewById(R.id.cityStateEditText);

                // Test output
                TextView testTextView = findViewById(R.id.testTextView);
                testTextView.setText(cityStateEditText.getText());
            }
        });
    }
}