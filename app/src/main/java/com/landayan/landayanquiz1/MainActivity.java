package com.landayan.landayanquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView androidListview;
    String[] android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
