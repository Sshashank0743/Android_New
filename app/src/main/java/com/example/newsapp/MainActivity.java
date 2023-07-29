package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void redPressed(View view){
        showCustomToast();
    }

    public void showCustomToast(){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_layout, findViewById(R.id.toast_root));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }


//    public void redPressed(View view){
//        showCustomToast("Customized Toast");
//    }
//
//    public void showCustomToast(String string){
//        LayoutInflater inflater = getLayoutInflater();
//        View layout = inflater.inflate(R.layout.custom_layout, findViewById(R.id.toast_root));
//
//        TextView toastText = layout.findViewById(R.id.txt_bday);
//        toastText.setText(string);
//
//
//        Toast toast = new Toast(getApplicationContext());
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(layout);
//        toast.show();
//    }
}