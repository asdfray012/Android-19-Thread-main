package com.example.android_num_19_thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Massage = (TextView)findViewById(R.id.show);
        Massage.setText("Got Message");
        Handler TwoSecond = new Handler();
        TwoSecond.postDelayed(runTimer, 2000);
    }
    private final Runnable runTimer = new Runnable() {
        @Override
        public void run() {
            Message message = new Message();
            message .obj = "Got it";
            Handler handler = new Handler();
            TextView Massage = (TextView)findViewById(R.id.show);
            handler.sendMessage(message );
            Massage.setText("Got it");
        }
    };
}