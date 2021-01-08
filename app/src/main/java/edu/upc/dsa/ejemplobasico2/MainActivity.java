package edu.upc.dsa.ejemplobasico2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void followerClick(android.view.View v) {
        Intent intent = new Intent(MainActivity.this, infoFollowers.class);
        startActivity(intent);;
    }
}