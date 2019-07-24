package com.example.mtrsliit.tute1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //define text view object
    TextView txtView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the textview with in the layout
        txtView2=findViewById(R.id.textView5);

        //set the value of msg2 as the text String
        txtView2.setText(R.string.Msg2);


        Log.i("LifeCycle","onCreate() InVoked!!!");


    }

    public void onStart(){

        super.onStart();
        Log.i("LifeCycle","onStart() InVoked!!!");
    }

    public void onRestart(){
        super.onRestart();
        Log.i("LifeCycle","onRestart() InVoked!!!");
    }

    public void onResume(){
        super.onResume();
        Log.i("LifeCycle","onResume() InVoked!!!");
    }

    public void onStop(){
        super.onStop();
        Log.i("LifeCycle","onStop() InVoked!!!");
    }

}
