package com.example.agiletech.testandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.react.ReactActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), ReactMainActivity.class);
                startActivity(i);
            }

        });
    }




}


