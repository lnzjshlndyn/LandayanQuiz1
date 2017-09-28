package com.landayan.landayanquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.landayan.landayanquiz1.Adapter.customAdapter;
import com.landayan.landayanquiz1.Model.androidVersions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] versions;
    ListView androidListview;
    customAdapter adapter;
    ArrayList<androidVersions> android;
    int[] logos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        versions = getResources().getStringArray(R.array.androidVersions);
        androidListview = (ListView) findViewById(R.id.androidListview);
        logos = new int[]{R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop};

        android = new ArrayList<androidVersions>();

        for(int i = 0; i < versions.length; i++){
            android.add(new androidVersions(logos[i], versions[i]));
        }

        adapter = new customAdapter(MainActivity.this, android);
        androidListview.setAdapter(adapter);

        androidListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(versions[i].equalsIgnoreCase("Jellybean")){
                    Intent intent = new Intent(androidListview.getContext(), display1Activity.class);
                    androidListview.getContext().startActivity(intent);
                }
                if(versions[i].equalsIgnoreCase("Kitkat")){
                    Intent intent = new Intent(androidListview.getContext(), display2Activity.class);
                    androidListview.getContext().startActivity(intent);
                }
                if(versions[i].equalsIgnoreCase("Lollipop")){
                    Intent intent = new Intent(androidListview.getContext(), display3Activity.class);
                    androidListview.getContext().startActivity(intent);
                }
            }
        });

    }

    public void goHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void goFirst(View view){
        Intent intent = new Intent(this, display1Activity.class);
        startActivity(intent);
        finish();
    }
    public void goSecond(View view){
        Intent intent = new Intent(this, display2Activity.class);
        startActivity(intent);
        finish();
    }
    public void goThird(View view){
        Intent intent = new Intent(this, display3Activity.class);
        startActivity(intent);
        finish();
    }
}
