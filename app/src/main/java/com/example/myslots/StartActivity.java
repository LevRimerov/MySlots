package com.example.myslots;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private TextView loadProgressBar;
    private int mProgressStatus;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
            progressBar = findViewById(R.id.progress_bar);
            loadProgressBar = findViewById(R.id.loadingComplitedTextView);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (mProgressStatus<100){
                        mProgressStatus++;
                        android.os.SystemClock.sleep(50);
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setProgress(mProgressStatus);
                            }
                        });
                    }
                    Intent intent = new Intent(StartActivity.this, MainActivity.class);
                    startActivity(intent);

                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            loadProgressBar.setVisibility(View.VISIBLE);
                        }
                    });
                }
            }).start();

    }
}
