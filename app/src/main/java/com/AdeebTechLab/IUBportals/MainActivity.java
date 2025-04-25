package com.AdeebTechLab.IUBportals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();


        Button news,  help,ads_softwear,ads_extention,ads_app,ads_stiker, admition_open, fee_stucher, point_time, merit_list,   b1, b2, b3, b4, b5, b6, b7, downlord_form, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18,rat, s_cou, fee, clearance;





        news = findViewById(R.id.news);
        help = findViewById(R.id.help);



        ads_softwear = findViewById(R.id.ads_softwear);
        ads_extention = findViewById(R.id.ads_extention);
        ads_app = findViewById(R.id.ads_app);
        ads_stiker = findViewById(R.id.ads_stiker);






        //Button------------------------------------------------------------

        ads_softwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.microsoft.com/store/productId/9PL653TPWDCH?ocid=pdpshare";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Button------------------------------------------------------------

        ads_extention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://chromewebstore.google.com/detail/iub-portals-all-in-one/jdnbbflemleecikpjliaijdgijmmnjfk";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Button------------------------------------------------------------

        ads_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBportals";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //Button------------------------------------------------------------

        ads_stiker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBWhatsAppSticker";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });




        //------------Button----------------------------------------

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Share.class);
                startActivity(intent);

            }
        });


        //------------Button----------------------------------------

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Other.class);
                startActivity(intent);

            }
        });















        merit_list = findViewById(R.id.merit_list);
        merit_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/meritlists/index.php?p=";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        point_time = findViewById(R.id.point_time);
        point_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1uN8A9nVhuYIQD6snZfh28q7L2aI8v2No/view?usp=sharing";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        fee_stucher = findViewById(R.id.fee_stucher);
        fee_stucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/fee-structure";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




        admition_open = findViewById(R.id.admition_open);
        admition_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/admissions";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




        b1 = findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/its";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/admissions";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/hostelportal";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b5 = findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b6 = findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://lms.iub.edu.pk/my/";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b7 = findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/timetable/publics?filter=class&pdftype=&campus_id=1&timetable_id=163&department=Department+of+Information+Security&sets=BWP-BSINSC-6TH-1M&teacher=&room=&subject=";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        downlord_form = findViewById(R.id.downlord_form);
        downlord_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/downloads";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b9 = findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/security/vehicle";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b10 = findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/cms/std_documents";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        b11= findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/scholarship/apply";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b12 = findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/academics/student/enrollment/course_repeat_challan";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        b13 = findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/student_survey";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b14 = findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://mail.google.com/a/iub.edu.pk";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b15 = findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/dsa/student/application#step-1";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        b16 = findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/livechat";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




        rat = findViewById(R.id.rating);
        rat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://whatsapp.com/channel/0029VaF6qjjJZg44rpOzhf1O";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        b17 = findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/news-update";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        //Button------------------------------------------------------------
        b18 = findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/contact";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        fee = findViewById(R.id.fee_vouchers);
        fee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/academics/student/finance/my_vouchers";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        s_cou = findViewById(R.id.short_courses);
        s_cou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/short_courses/std/students/apply";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        clearance = findViewById(R.id.clearance);
        clearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/clearance";
                Intent i = new Intent(MainActivity.this, website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });








    }
}