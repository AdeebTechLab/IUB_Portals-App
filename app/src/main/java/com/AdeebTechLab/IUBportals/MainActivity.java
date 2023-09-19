package com.AdeebTechLab.IUBportals;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.AdeebTechLab.IUBportals.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getSupportActionBar().setTitle("All Portal The Islamia University of Bahawalpur");

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(item -> {

            int itemId = item.getItemId();
            if (itemId == R.id.hh) {
                replaceFragment(new HomeFragment());
            } else if (itemId == R.id.dd) {
                replaceFragment(new DeveloperFragment());
            } else if (itemId == R.id.pp) {
                replaceFragment(new PolicyFragment());
            } else if (itemId == R.id.ss) {
                replaceFragment(new ShareFragment());
            } else if (itemId == R.id.aa) {
                replaceFragment(new OtherFragment());
            }


            return true;
        });



    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();

    }
}