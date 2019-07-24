package com.example.mtrsliit.usingstrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView4 = findViewById(R.id.textView4);
        txtView4.setText(R.string.Msg2);

        Log.i("LifeCycle","OnCreate() Invoked!!!");
    }
    public void onStart()
    {
        super.onStart();
        Log.i("LifeCycle", "OnStart() Invoked!!!");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.i("LifeCycle", "OnRestart() Invoked!!!");
    }
    public void onStop()
    {
        super.onStop();
        Log.i("LifeCycle", "OnStop() Invoked!!!");
    }
    public void onResume()
    {
        super.onResume();
        Log.i("LifeCycle", "OnResume() Invoked!!!");
    }
    public void onPause()
    {
        super.onPause();
        Log.i("LifeCycle", "OnPause() Invoked!!!");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.i("LifeCycle", "OnDestroy() Invoked!!!");
    }
}
