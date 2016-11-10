package com.example.user.yvd111001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        LinearLayout ll = (LinearLayout) findViewById(R.id.layout2_linear);
        Button btn = new Button(MainActivity.this);
        btn.setText("Button!!");
        ll.addView(btn);
        Button btn2 = new Button(MainActivity.this);
        btn2.setText("Button 22 !!");
        ll.addView(btn2);
//        Button btn = new Button(MainActivity.this);
//        btn.setText("Click me!");
//        setContentView(btn);
    }
}
