package com.example.recofacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.mongodb.MongoClient;

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
        MongoClient mongoClient = null;
        try{
            Toast.makeText(getApplicationContext(),"mongo conect", Toast.LENGTH_SHORT).show();
            mongoClient= new MongoClient("localhost", 27017);
        }catch(UnknownError error){
            error.printStackTrace();
        }
    }
}
