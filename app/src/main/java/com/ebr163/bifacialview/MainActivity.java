package com.ebr163.bifacialview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ebr163.bifacialview.custom.CustomActivity;
import com.ebr163.bifacialview.recyclerview.RecyclerViewActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.simple_screen) {
            startActivity(new Intent(this, SimpleActivity.class));
        } else if (v.getId() == R.id.vp_screen) {
            startActivity(new Intent(this, ViewPagerActivity.class));
        } else if (v.getId() == R.id.rv_screen) {
            startActivity(new Intent(this, RecyclerViewActivity.class));
        } else {
            startActivity(new Intent(this, CustomActivity.class));
        }
    }
}
