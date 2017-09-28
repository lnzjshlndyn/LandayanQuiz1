package com.landayan.landayanquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class display2Activity extends AppCompatActivity {

    String[] codename, version, api, year;
    TextView CODENAME, VERSION, API, YEAR;
    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display2);

        codename = getResources().getStringArray(R.array.androidCodename);
        version = getResources().getStringArray(R.array.androidVersions);
        api = getResources().getStringArray(R.array.androidAPI);
        year = getResources().getStringArray(R.array.androidYear);

        CODENAME = (TextView)findViewById(R.id.androidCodename2);
        CODENAME.setText(codename[1]);

        VERSION = (TextView)findViewById(R.id.androidVersion2);
        VERSION.setText(version[1]);

        API = (TextView)findViewById(R.id.androidAPIlevel2);
        API.setText(api[1]);

        YEAR = (TextView)findViewById(R.id.androidReleasedate2);
        YEAR.setText(year[1]);
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
