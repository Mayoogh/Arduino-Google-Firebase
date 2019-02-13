package com.example.girish.googlefirebaseledcontrol;

import java.util.ArrayList;
import java.util.Locale;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.text.InputType;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.speech.RecognizerIntent;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {


    Button forward, backward, left, right, topL, topR, bottomL, bottomR;
    ImageButton micBtn, cammeraBtn;
    Switch speed;
    TextView text_temp, speech_txt, smoke_txt, humidity_txt;
    DatabaseReference myDB_Ref;
    WebView myWebView;
    String temp_status, smoke_status, humidity_status;
    private final int REQ_CODE_SPEECH_INPUT = 100;



    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hideNavigationBar();

        forward = findViewById(R.id.forward_id);
        backward = findViewById(R.id.backward_id);
        left = findViewById(R.id.left_id);
        right =  findViewById(R.id.right_id);
        topL =  findViewById(R.id.topL_id);
        topR =  findViewById(R.id.topR_id);
        bottomR =  findViewById(R.id.backR_id);
        bottomL = findViewById(R.id.backL_id);
        micBtn =  findViewById(R.id.btnSpeak_id);
        speed =  findViewById(R.id.speed_id);
        humidity_txt = findViewById(R.id.humidity_txt_id);
        speech_txt =  findViewById(R.id.speech_id);
        text_temp =  findViewById(R.id.txt_temp_id);
        smoke_txt = findViewById(R.id.smoke_id);
        cammeraBtn =  findViewById(R.id.camera_btn_id);

        /**
         * Pulling data from firebase
         **/
        myDB_Ref = FirebaseDatabase.getInstance().getReference();
        myDB_Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                temp_status = dataSnapshot.child("Temperature").getValue().toString();
                text_temp.setText(temp_status);
                smoke_status = dataSnapshot.child("Smoke").getValue().toString();
                smoke_txt.setText(smoke_status);
                humidity_status = dataSnapshot.child("Humidity").getValue().toString();
                humidity_txt.setText(humidity_status);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        /**
         * Button Movements
         **/
        forward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(1);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        backward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(2);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(3);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(4);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        topL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(5);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        topR.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(6);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        bottomL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(7);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });
        bottomR.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(8);
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("S1");
                    myRef.setValue(0);
                }
                return true;

            }
        });

        micBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                promptSpeechInput();
            }
        });
    }

    /**
     * FullScreen
     **/
    @Override
    protected void onResume() {
        super.onResume();
        hideNavigationBar();
    }

    private void hideNavigationBar() {
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }

    /**
     * Showing google speech input dialog
     */
    private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Receiving speech input
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    speech_txt.setText(result.get(0));
                    speech_txt.setInputType(InputType.TYPE_CLASS_TEXT);
                    if (result.get(0).equals("forward")){
                        Toast.makeText(getApplicationContext(), "Moving Forward", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(1);
                    }
                    else if (result.get(0).equals("backward")){
                        Toast.makeText(getApplicationContext(), "Moving Backward", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(2);
                    }
                    else if (result.get(0).equals("right")){
                        Toast.makeText(getApplicationContext(), "Making hard right", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(3);
                    }
                    else if (result.get(0).equals("left")){
                        Toast.makeText(getApplicationContext(), "Making hard left", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(4);
                    }
                    else if (result.get(0).equals("top left")){
                        Toast.makeText(getApplicationContext(), "Turning left in forward direction", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(5);
                    }
                    else if (result.get(0).equals("top right")){
                        Toast.makeText(getApplicationContext(), "Turning right in forward direction ", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(6);
                    }
                    else if (result.get(0).equals("bottom left")){
                        Toast.makeText(getApplicationContext(), "Turning left in backward direction", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(7);
                    }
                    else if (result.get(0).equals("bottom right")){
                        Toast.makeText(getApplicationContext(), "Turning right in backward direction", Toast.LENGTH_SHORT).show();
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference("S1");
                        myRef.setValue(8);
                    }
                    else
                        Toast.makeText(getApplicationContext(), "Unknown command", Toast.LENGTH_SHORT).show();
                }
                break;
            }

        }
    }

    /**
     * Speed Switch
     **/
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


    public void start_camera_activity(View view) {

    }

    public void On_Click_Camera(View view) {

        Intent myIntent = new Intent(MainActivity.this,
                CameraActivity.class);
        startActivity(myIntent);
    }
}

