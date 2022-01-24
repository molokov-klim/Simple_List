package com.kawaii.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plList = findViewById(R.id.tv_pl_names);

        String[] names = {"Java", "C++", "JavaScript", "Delphi", "PHP", "GNU bc", "Euphoria", "C#", "ColdFusion", "D", "Dart", "Object Pascal", "Dylan", "Eiffel", "Groovy", "Haxe", "Io", "MC#"};

        plList.setText("");
        for(String name : names) {
            plList.append(name + "\n");
        }


    }
}



