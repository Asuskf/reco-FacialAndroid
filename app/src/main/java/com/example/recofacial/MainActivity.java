package com.example.recofacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.widget.Toast;


import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import org.opencv.android.OpenCVLoader;

import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug())
            Toast.makeText(getApplicationContext(),"Open cv inicializado", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(),"Open cv error", Toast.LENGTH_SHORT).show();

        try {
            MongoClientURI uri = new MongoClientURI( "mongodb://localhost/db-name" );
            MongoClient mongoClient = new MongoClient(uri);
            MongoDatabase db = mongoClient.getDatabase(uri.getDatabase());
        } catch (UnknownError e) {
            e.printStackTrace();
            Toast.makeText(getApplicationContext(),"Open cv error", Toast.LENGTH_SHORT).show();
        }


    }
}
