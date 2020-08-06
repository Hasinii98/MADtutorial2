package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //calling the text view through the java code
        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate...");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle", "OnStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle", "OnResume...");

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle", "OnPause...");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle", "OnStop...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle", "OnDestroy...");

    }
}