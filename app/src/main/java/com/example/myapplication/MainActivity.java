package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button_1;
    private Button button_2;

    public static final String KEY = "key";

    private TextView text_status;
    private ImageView image_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();


        text_status = findViewById(R.id.text_status);
        button_1 = findViewById(R.id.button_start);
        button_2 = findViewById(R.id.button_stop);
        image_view = findViewById(R.id.image_view);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(random.nextBoolean()) {
                    image_view.setImageResource(R.drawable.heads);
                    text_status.setText(R.string.button_heads);
                } else {
                    image_view.setImageResource(R.drawable.tails);
                    text_status.setText(R.string.button_tails);
                }
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(KEY, "gustav is the new heads meta");
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}