package com.example.recofacial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    Button initialRecoFacial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialRecoFacial = findViewById(R.id.btnInicialReconocimiento);

        initialRecoFacial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOpenCv = new Intent(MainActivity.this, recoFacial.class);
                startActivity(goOpenCv);
            }
            MongoClient mongoClient = new MongoClient("192.168.122.1",27017);
            MongoDatabase database = mongoClient.getDatabase("test");
            MongoCollection coll = database.getCollection("myTestCollection");
        });

    }


}
