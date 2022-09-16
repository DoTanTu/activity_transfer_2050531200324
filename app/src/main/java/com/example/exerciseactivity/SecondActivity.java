package com.example.exerciseactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = (TextView) findViewById(R.id.id_text_display);
        displayResult();
    }
    public void displayResult(){
        Intent intent = getIntent();
        int soThuNhat = Integer.parseInt(intent.getStringExtra("giaTri1"));
        int soThuHai = Integer.parseInt(intent.getStringExtra("giaTri2"));
        int sum = soThuNhat + soThuHai;
        textView.setText(" Tong cua 2 so : " + soThuNhat + " va " + soThuHai + " la :" + sum);

    }
}