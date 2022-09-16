package com.example.exerciseactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText so1;
    EditText so2;
    Button buttonne;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so1 = (EditText) findViewById(R.id.giaTri_1);
        so2 = (EditText) findViewById(R.id.giaTri_2);
        buttonne = (Button) findViewById(R.id.button_tong);
        buttonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String giaTri1 = so1.getText().toString();
                String giaTri2 = so2.getText().toString();
                setButtonClick(giaTri1,giaTri2);
            }
        });
    }
    public void setButtonClick(String giaTri1, String giaTri2){

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("giaTri1",giaTri1);
        intent.putExtra("giaTri2",giaTri2);
        startActivity(intent);
    }
}