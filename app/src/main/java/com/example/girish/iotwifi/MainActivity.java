package com.example.girish.iotwifi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button S1_On, S2_On, S3_On, S4_On, S5_On, S6_On, S7_On, S8_On;
    Button S1_Off, S2_Off, S3_Off, S4_Off, S5_Off, S6_Off, S7_Off, S8_Off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        S1_On = (Button)findViewById(R.id.s1_On_id);
        S2_On = (Button)findViewById(R.id.s2_On_id);
        S3_On = (Button)findViewById(R.id.s3_On_id);
        S4_On = (Button)findViewById(R.id.s4_On_id);
        S5_On = (Button)findViewById(R.id.s5_On_id);
        S6_On = (Button)findViewById(R.id.s6_On_id);
        S7_On = (Button)findViewById(R.id.s7_On_id);
        S8_On = (Button)findViewById(R.id.s8_On_id);
        S1_Off = (Button)findViewById(R.id.s1_Off_id);
        S2_Off = (Button)findViewById(R.id.s2_Off_id);
        S3_Off = (Button)findViewById(R.id.s3_Off_id);
        S4_Off = (Button)findViewById(R.id.s4_Off_id);
        S5_Off = (Button)findViewById(R.id.s5_Off_id);
        S6_Off = (Button)findViewById(R.id.s6_Off_id);
        S7_Off = (Button)findViewById(R.id.s7_Off_id);
        S8_Off = (Button)findViewById(R.id.s8_Off_id);

        S1_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(1);
            }
        });
        S2_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S2");
                myRef.setValue(1);
            }
        });
        S3_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S3");
                myRef.setValue(1);
            }
        });
        S4_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S4");
                myRef.setValue(1);
            }
        });
        S5_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S5");
                myRef.setValue(1);
            }
        });
        S6_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S6");
                myRef.setValue(1);
            }
        });
        S7_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S7");
                myRef.setValue(1);
            }
        });
        S8_On.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S8");
                myRef.setValue(1);
            }
        });

        S1_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(0);
            }
        });
        S2_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S2");
                myRef.setValue(0);
            }
        });
        S3_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S3");
                myRef.setValue(0);
            }
        });
        S4_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S4");
                myRef.setValue(0);
            }
        });
        S5_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S5");
                myRef.setValue(0);
            }
        });
        S6_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S6");
                myRef.setValue(0);
            }
        });
        S7_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S7");
                myRef.setValue(0);
            }
        });
        S8_Off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S8");
                myRef.setValue(0);
            }
        });
    }
}
