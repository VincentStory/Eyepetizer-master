package com.vincent.main.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.vincent.library_base.storage.MmkvHelper;
import com.vincent.myapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);

    }



    public static void start(Context context){
        context.startActivity(new Intent(context,MainActivity.class));
    }


}