package com.example.gittest1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;


        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("dfdfdf");
                text.setText("sksksksk");
                text.setText("123123");
                text.setText("14554545");

            }
        });

    }
}
