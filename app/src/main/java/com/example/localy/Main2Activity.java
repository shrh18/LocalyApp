package com.example.localy;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button MoveToMobilePhones;
    private Button MoveToAutomobiles;
    private Button MoveToHomeAppliances;
    private Button MoveToFashion;
    private Button MoveToElectricals;
    private Button MoveToFurniture;
    private Button MoveToLaptops;
    private Button MoveToAudioSystems;
    private Button MoveToActionCams;
    private Button MoveToVideoSurveillance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MoveToMobilePhones = findViewById(R.id.button2);
        MoveToMobilePhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain3Activity();
            }
        });

        MoveToAutomobiles = findViewById(R.id.button3);
        MoveToAutomobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain4Activity();
            }
        });

        MoveToHomeAppliances = findViewById(R.id.button4);
        MoveToHomeAppliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain5Activity();
            }
        });

        MoveToFashion = findViewById(R.id.button5);
        MoveToFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain6Activity();
            }
        });

        MoveToElectricals = findViewById(R.id.button8);
        MoveToElectricals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain7Activity();


            }
        });

        MoveToFurniture = findViewById(R.id.button9);
        MoveToFurniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain8Activity();
            }
        });

        MoveToLaptops = findViewById(R.id.button10);
        MoveToLaptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain9Activity();
            }
        });

        MoveToAudioSystems = findViewById(R.id.button11);
        MoveToAudioSystems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain10Activity();
            }
        });

        MoveToActionCams = findViewById(R.id.button12);
        MoveToActionCams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain11Activity();
            }
        });

        MoveToVideoSurveillance = findViewById(R.id.button13);
        MoveToVideoSurveillance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToMain12Activity();
            }
        });

    }


    private void moveToMain3Activity() {
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }

    private void moveToMain4Activity() {
        Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(intent);
    }

    private void moveToMain5Activity() {
        Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(intent);
    }

    private void moveToMain6Activity() {
        Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
        startActivity(intent);
    }

    private void moveToMain7Activity() {
        Intent intent = new Intent(Main2Activity.this, Main7Activity.class);
        startActivity(intent);
    }

    private void moveToMain8Activity() {
        Intent intent = new Intent(Main2Activity.this, Main8Activity.class);
        startActivity(intent);
    }

    private void moveToMain9Activity() {
        Intent intent = new Intent(Main2Activity.this, Main9Activity.class);
        startActivity(intent);
    }

    private void moveToMain10Activity() {
        Intent intent = new Intent(Main2Activity.this, Main10Activity.class);
        startActivity(intent);
    }

    private void moveToMain11Activity() {
        Intent intent = new Intent(Main2Activity.this, Main11Activity.class);
        startActivity(intent);
    }

    private void moveToMain12Activity() {
        Intent intent = new Intent(Main2Activity.this, Main12Activity.class);
        startActivity(intent);
    }
}