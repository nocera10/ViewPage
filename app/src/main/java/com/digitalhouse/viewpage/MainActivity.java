package com.digitalhouse.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();

        FragmentBlue fragmentBlue = new FragmentBlue();
        FragmentRed fragmentRed = new FragmentRed();
        FragmentGreen fragmentGreen = new FragmentGreen();

        list.add(fragmentBlue);
        list.add(fragmentRed);
        list.add(fragmentGreen);

        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), list);
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(12);
    }
}
