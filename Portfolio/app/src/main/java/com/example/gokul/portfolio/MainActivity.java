package com.example.gokul.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void spotify(View view)
    {
        makeText(getApplicationContext(),
                "Spotify", Toast.LENGTH_LONG).show();

    }
    public void scores(View view)
    {
        makeText(getApplicationContext(),
                "Scores", Toast.LENGTH_LONG).show();

    }
    public void library(View view)
    {
        makeText(getApplicationContext(),
                "Library", Toast.LENGTH_LONG).show();

    }
    public void bigger(View view)
    {
        makeText(getApplicationContext(),
                "Bigger", Toast.LENGTH_LONG).show();

    }
    public void xyz(View view)
    {
        makeText(getApplicationContext(),
                "XYZ", Toast.LENGTH_LONG).show();

    }
    public void capstone(View view)
    {
        makeText(getApplicationContext(),
                "Capstone", Toast.LENGTH_LONG).show();

    }
}
