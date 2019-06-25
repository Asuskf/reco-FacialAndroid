package com.example.recofacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug())
            Toast.makeText(getApplicationContext(),"Open cv inicializado", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"Open cv error", Toast.LENGTH_SHORT).show();
    }
}
