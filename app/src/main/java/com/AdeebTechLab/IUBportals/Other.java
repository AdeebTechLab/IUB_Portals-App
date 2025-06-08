package com.AdeebTechLab.IUBportals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Other extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);


        getSupportActionBar().hide();



        Button home, news, feedbaack, visit,iubwifi,googledrive,iubapp,teemaccunt,bigblubutton,attandunsapp,award1,award2,award3,dvelper;






        home = findViewById(R.id.home);


        iubwifi= findViewById(R.id.iubwifi);
        googledrive= findViewById(R.id.googledrive);
        iubapp= findViewById(R.id.iubapp);
        teemaccunt= findViewById(R.id.teemaccunt);
        bigblubutton= findViewById(R.id.bigblubutton);
        attandunsapp= findViewById(R.id.attandunsapp);

        award1= findViewById(R.id.award1);
        award2= findViewById(R.id.award2);
        award3= findViewById(R.id.award3);


        feedbaack= findViewById(R.id.feedbaack);
        visit= findViewById(R.id.visit);
        dvelper= findViewById(R.id.dvelper);




        //Button------------------------------------------------------------

        iubwifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/j_QMt4bJmtY?si=D5W8And4f75iWxRs";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------

        googledrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/Cx_9hTbVaLc?si=V7jmfQ2TYDPt9vua";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        iubapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/8gE_mTr3WR4?si=2COfqO7So7W3NGEa";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        teemaccunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/CmvD67O1XE4?si=kk8JBQ3JUKcIjOL2";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        bigblubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/gq3YdeDHRYQ?si=tz8d-XMEGoc-ZyE6";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        attandunsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/6MDcT5sxqDE?si=ATuOyXudumwhfti_";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        award1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.tiktok.com/@adeebtechnologylab/video/7213042177360858394";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        award2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.tiktok.com/@adeebtechnologylab/video/7208864547439004954";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        //Button------------------------------------------------------------

        award3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.tiktok.com/@adeebtechnologylab/video/7355161782673067270";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });









        //------------Button----------------------------------------

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Other.this, MainActivity.class);
                startActivity(intent);

            }
        });




        //Button------------------------------------------------------------

        feedbaack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBportals";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://iubportals.blogspot.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------

        dvelper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://adeebtechlab.blogspot.com/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}