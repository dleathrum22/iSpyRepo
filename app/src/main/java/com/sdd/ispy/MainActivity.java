package com.sdd.ispy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cameraButton;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cameraButton = (Button)findViewById(R.id.to_camera_activity);
        tv = (TextView)findViewById(R.id.text_box);


        cameraButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("Button Press");
                Intent intent = new Intent(getApplicationContext(), cameraActivity.class);
                startActivity(intent);

            }
        });



    }
}
