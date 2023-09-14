package com.AdeebTechLab.IUBportals;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;


public class HomeFragment extends Fragment {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;

    LinearLayout layout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_home, container,false);



        b1 = view.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b2 = view.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/its";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b3 = view.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/admissions";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b4 = view.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://eportal.iub.edu.pk/eportal/hostelportal";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b5 = view.findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b6 = view.findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://lms.iub.edu.pk/my/";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b7 = view.findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/timetable/publics?filter=class&pdftype=&campus_id=1&timetable_id=163&department=Department+of+Information+Security&sets=BWP-BSINSC-6TH-1M&teacher=&room=&subject=";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b8 = view.findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/file/d/1uN8A9nVhuYIQD6snZfh28q7L2aI8v2No/view?usp=sharing";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b9 = view.findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/security/vehicle";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b10 = view.findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/cms/std_documents";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        b11= view.findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/scholarship/apply";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b12 = view.findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/academics/student/enrollment/course_repeat_challan";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        b13 = view.findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://my.iub.edu.pk/cms/student_survey";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b14 = view.findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://mail.google.com/a/iub.edu.pk";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b15 = view.findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://drive.google.com/drive/u/1/my-drive";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b16 = view.findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://salmanadeeb.wixsite.com/livechat";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        b17 = view.findViewById(R.id.button17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/news-update";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b18 = view.findViewById(R.id.button18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.iub.edu.pk/contact";
                Intent i = new Intent(getActivity(), website.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



        layout = view.findViewById(R.id.ads);
        //Button------------------------------------------------------------

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.adeebtechlab.apps";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });



        return view;

    }
}