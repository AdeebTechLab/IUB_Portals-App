package com.AdeebTechLab.IUBportals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Policy extends AppCompatActivity {

    public Policy(){}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);

        getSupportActionBar().hide();


        Button pol, oth, hom, dev,  sha;




        sha = findViewById(R.id.share);
        oth = findViewById(R.id.other);
        dev = findViewById(R.id.divelper);
        hom = findViewById(R.id.home);





        //------------Button----------------------------------------

        sha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Policy.this, Share.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        oth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Policy.this, Other.class);
                startActivity(intent);

            }
        });

        //------------Button----------------------------------------

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Policy.this, Developer.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        hom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Policy.this, MainActivity.class);
                startActivity(intent);

            }
        });








        WebView Polic = (WebView) findViewById(R.id.policyWeb);
        Polic.loadUrl("file:///android_asset/privacy_policy.html");
    }
}