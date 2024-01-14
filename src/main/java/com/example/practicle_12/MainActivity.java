package com.example.practicle_12;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1= findViewById(R.id.tv1);
        TextView tv2= findViewById(R.id.tv2);

        String sname="Rakesh Bandi";
                int marks=85;

        tv1.setText("Student Name::"+sname);
        tv2.setText("Marks::"+marks);

    }
}