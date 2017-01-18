package com.example.xuchun.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.id.button1;
import static android.R.id.switch_widget;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "ActivityWH";
    Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: run");

        button_1 =(Button) findViewById(R.id.button_1);
        buttonOnClick();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "about:WH", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onOptionsItemSelected: logout");
                finish();
                break;
            default:
        }
        return true;
    }

    public void buttonOnClick(){
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Log.d(TAG, "onClick: click button");
                Toast.makeText(HomeActivity.this,"shit",Toast.LENGTH_SHORT).show();
                Intent intentToAActivity = new Intent(HomeActivity.this, AActivity.class);
                startActivity(intentToAActivity);
//                finish();
            }
        });
    }
}   // the biggest bracket


