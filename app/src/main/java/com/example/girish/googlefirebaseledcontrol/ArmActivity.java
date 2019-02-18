package com.example.girish.googlefirebaseledcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ArmActivity extends AppCompatActivity {

    TextView seekbar1_txt, seekbar2_txt, seekbar3_txt, seekbar4_txt, seekbar5_txt;
    SeekBar seekbar1, seekbar2, seekbar3, seekbar4, seekbar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm);

        seekbar1_txt = findViewById(R.id.seekbar1_Tv_id);
        seekbar2_txt = findViewById(R.id.seekbar2_Tv_id);
        seekbar3_txt = findViewById(R.id.seekbar3_Tv_id);
        seekbar4_txt = findViewById(R.id.seekbar4_Tv_id);
        seekbar5_txt = findViewById(R.id.seekbar5_Tv_id);
        seekbar1 = findViewById(R.id.seekBar1_id);
        seekbar2 = findViewById(R.id.seekBar2_id);
        seekbar3 = findViewById(R.id.seekBar3_id);
        seekbar4 = findViewById(R.id.seekBar4_id);
        seekbar5 = findViewById(R.id.seekBar5_id);

        seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbar1_txt.setText("" + progress + "");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Servo1");
                myRef.setValue(seekbar1_txt.getText().toString());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbar2_txt.setText("" + progress + "");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Servo2");
                myRef.setValue(seekbar2_txt.getText().toString());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbar3_txt.setText("" + progress + "");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Servo3");
                myRef.setValue(seekbar3_txt.getText().toString());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbar4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbar4_txt.setText("" + progress + "");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Servo4");
                myRef.setValue(seekbar4_txt.getText().toString());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekbar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekbar5_txt.setText("" + progress + "");
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Servo5");
                myRef.setValue(seekbar5_txt.getText().toString());
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
