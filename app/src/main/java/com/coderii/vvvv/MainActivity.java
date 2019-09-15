package com.coderii.vvvv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.btn_play) {
                    String url = "https://firebasestorage.googleapis.com/v0/b/dsaapp-534ce.appspot.com/o/An%20Overview%20of%20Arrays%20and%20Memory%20(Data%20Structures%20%26%20Algorithms%20%232).mp4?alt=media&token=66c0ea57-3d84-4843-a258-3d7652b46e7d";
                    Intent i=new Intent(MainActivity.this,videoplayer.class);
                    i.putExtra("url",url);
                    startActivity(i);
                }
            }
        };
        findViewById(R.id.btn_play).setOnClickListener(clickListener);
    }
}
