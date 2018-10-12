package com.example.nitza.menu;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg = (LinearLayout) findViewById(R.id.bg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menui) {
            bg.setBackgroundColor(Color.BLACK);

        }
        if (id == R.id.menui1) {
            bg.setBackgroundColor(Color.BLUE);

        }
        if (id == R.id.menui2) {
            bg.setBackgroundColor(Color.YELLOW);

        }
        return  super.onOptionsItemSelected(item);
    }

    public void go(View view) {
        Intent t=new Intent(this,Main2Activity.class);

        startActivity(t);

    }



}