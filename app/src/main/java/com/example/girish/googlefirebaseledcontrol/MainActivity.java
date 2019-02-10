package com.example.girish.googlefirebaseledcontrol;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {

    Button forward, backward, left, right, topL, topR, bottomL, botoomR;
    Switch speed;
    TextView text_temp;
    DatabaseReference myDB_Ref;
    String status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = (Button)findViewById(R.id.forward_id);
        backward = (Button)findViewById(R.id.backward_id);
        left = (Button)findViewById(R.id.left_id);
        right = (Button)findViewById(R.id.right_id);
        topL = (Button)findViewById(R.id.topL_id);
        topR = (Button)findViewById(R.id.topR_id);
        botoomR = (Button)findViewById(R.id.backR_id);
        bottomL = (Button)findViewById(R.id.backL_id);
        speed = (Switch)findViewById(R.id.speed_id);
        text_temp = (TextView)findViewById(R.id.txt_temp_id);
        myDB_Ref = FirebaseDatabase.getInstance().getReference();
        myDB_Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                status = dataSnapshot.child("Temperature").getValue().toString();
                text_temp.setText(status);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        forward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(1);
            }
        });
        backward.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(2);
            }
        });
        left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(3);
            }
        });
        right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(4);
            }
        });
        topL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(5);
            }
        });
        topR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(6);
            }
        });
        bottomL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(7);
            }
        });
        botoomR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("S1");
                myRef.setValue(8);
            }
        });



    }

    public void speed_control(View view) {
        String Switchstatus;
        if (speed.isChecked()){
            Switchstatus = speed.getTextOn().toString();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("Speed");
            myRef.setValue(2);
        }
        else {
            Switchstatus = speed.getTextOff().toString();
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("Speed");
            myRef.setValue(1);
        }
        Toast.makeText(getApplicationContext(), "Speed :" + Switchstatus, Toast.LENGTH_LONG).show();
    }
}

