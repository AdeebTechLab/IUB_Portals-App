package com.AdeebTechLab.IUBportals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView eportal, myiub,lms;




    Button ads_softwear,ads_extention,ads_app,ads_stiker;
    private CardView AdmissionLastDate, FeeStructure, MeritList, Student_Card, TransportSchedule, Download_Forms, Entry_Test, Generate_Challan, Class_Time, Admissions, My_Documents,Hostel, Hostel_Required_Items, Vehicle_Entry, My_Clearance, Roll_No_Slip, Repeat_Course, Scholarships, Short_Courses , IUB_Email, Students_Societies, Live_Chat, Announcements, Contact_No;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Dashboard");













//Button------------------------------------------------------------
        eportal=(TextView)findViewById(R.id.EPortal);
        eportal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        myiub=(TextView)findViewById(R.id.MyIUB);
        myiub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        lms=(TextView)findViewById(R.id.LMS);
        lms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://lms.iub.edu.pk/my/";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//--------------------------------------------------------------------------------------------------------------

//Button------------------------------------------------------------
        AdmissionLastDate=(CardView) findViewById(R.id.AdmissionLastDate);
        AdmissionLastDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/admissions";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        FeeStructure=(CardView) findViewById(R.id.FeeStructure);
        FeeStructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/fee-structure";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        MeritList=(CardView) findViewById(R.id.MeritList);
        MeritList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/meritlists/index.php?p=";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        TransportSchedule=(CardView) findViewById(R.id.TransportSchedule);
        TransportSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1Cte7DZAqOdvqTKsnzE8nQJPbgL2jFs3r/view?usp=sharing";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


//0000000000000000000000000000000000000000000000000000000 ADS 00000000000000000000000000000000000000000000000000000000000000



        //Button------------------------------------------------------------
        ads_softwear = findViewById(R.id.ads_softwear);
        ads_softwear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.microsoft.com/store/productId/9PL653TPWDCH?ocid=pdpshare";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        ads_extention = findViewById(R.id.ads_extention);
        ads_extention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://chromewebstore.google.com/detail/iub-portals-all-in-one/jdnbbflemleecikpjliaijdgijmmnjfk";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        ads_app = findViewById(R.id.ads_app);
        ads_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBportals";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        ads_stiker = findViewById(R.id.ads_stiker);
        ads_stiker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBWhatsAppSticker";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000







        //Button------------------------------------------------------------
        Hostel_Required_Items=(CardView) findViewById(R.id.Hostel_Required_Items);
        Hostel_Required_Items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1bezTSeYr4f6TmPcD84SXtRf1v3IS-dfP/view";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Student_Card=(CardView) findViewById(R.id.Student_Card);
        Student_Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cba/student/student_card";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Download_Forms=(CardView) findViewById(R.id.Download_Forms);
        Download_Forms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/downloads";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Entry_Test=(CardView) findViewById(R.id.Entry_Test);
        Entry_Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/its";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Generate_Challan=(CardView) findViewById(R.id.Generate_Challan);
        Generate_Challan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/academics/student/finance/my_vouchers";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Class_Time=(CardView) findViewById(R.id.Class_Time);
        Class_Time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/timetable/publics?filter=class&pdftype=&campus_id=1&timetable_id=163&department=Department+of+Information+Security&sets=BWP-BSINSC-6TH-1M&teacher=&room=&subject=";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Admissions=(CardView) findViewById(R.id.Admissions);
        Admissions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/admissions";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        My_Documents=(CardView) findViewById(R.id.My_Documents);
        My_Documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/cms/std_documents";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Hostel=(CardView) findViewById(R.id.Hostel);
        Hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/hostelportal";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Vehicle_Entry=(CardView) findViewById(R.id.Vehicle_Entry);
        Vehicle_Entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/security/vehicle";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        My_Clearance=(CardView) findViewById(R.id.My_Clearance);
        My_Clearance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/clearance";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        Roll_No_Slip=(CardView) findViewById(R.id.Roll_No_Slip);
        Roll_No_Slip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/student_survey";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

        //Button------------------------------------------------------------
        Repeat_Course=(CardView) findViewById(R.id.Repeat_Course);
        Repeat_Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/academics/student/enrollment/course_repeat_challan";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        Short_Courses=(CardView) findViewById(R.id.Short_Courses);
        Short_Courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/short_courses/std/students/apply";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        IUB_Email=(CardView) findViewById(R.id.IUB_Email);
        IUB_Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://mail.google.com/a/iub.edu.pk";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });


        //Button------------------------------------------------------------
        Students_Societies=(CardView) findViewById(R.id.Students_Societies);
        Students_Societies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/scholarship/profile";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });





























        //Button------------------------------------------------------------
        Live_Chat=(CardView) findViewById(R.id.Live_Chat);
        Live_Chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/livechat";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Announcements=(CardView) findViewById(R.id.Announcements);
        Announcements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/news-update";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });

//Button------------------------------------------------------------
        Contact_No=(CardView) findViewById(R.id.Contact_No);
        Contact_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/contact";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });




    }
}