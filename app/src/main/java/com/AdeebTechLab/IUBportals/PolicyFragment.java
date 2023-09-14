package com.AdeebTechLab.IUBportals;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import java.security.Policy;

public class PolicyFragment extends Fragment {

    public PolicyFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_policy, container, false);
        WebView PolicyFragment = (WebView) rootView.findViewById(R.id.policyWeb);
        PolicyFragment.loadUrl("file:///android_asset/privacy_policy.html");
        return rootView;
    }
}