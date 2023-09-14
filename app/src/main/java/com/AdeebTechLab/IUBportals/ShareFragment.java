package com.AdeebTechLab.IUBportals;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ShareFragment extends Fragment {

    Button b111;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_share, container,false);


        b111 = view.findViewById(R.id.sharebutton);
        b111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Download THis App";
                String Sub = "Android Application: https://play.google.com/store/apps/details?id=com.AdeebTechLab.IUBportals                                             Windows' Software: https://islamia-university-of-bahawalpur-iub-portals-software-for-windo.en.uptodown.com/windows";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share Using"));

            }
        });


        return view;
    }
}