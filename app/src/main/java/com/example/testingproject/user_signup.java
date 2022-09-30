package com.example.testingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.ImageView;
import android.widget.TextView;

public class user_signup extends AppCompatActivity implements OnClickListener {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);
        tv=findViewById(R.id.sigsign);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"fonts/Lobster-Regular.ttf");
        tv.setTypeface(customfont);
        ImageView bksn=(ImageView) findViewById(R.id.backbuttsign);
        bksn.setOnClickListener(this);
    }
    public void onClick(View view) {
        startActivity(new Intent(user_signup.this,user_login.class));
    }
}