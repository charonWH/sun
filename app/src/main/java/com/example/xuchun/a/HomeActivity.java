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
    Button button_1,button_2,button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: home!");

        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        buttonOnClick();

    }

    // Button
    public void buttonOnClick(){
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Log.d(TAG, "button_1, Home Activity");
//                Toast.makeText(HomeActivity.this,"button_1, Home Activity",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomeActivity.this, AActivity.class);
                startActivity(intent);
                finish();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button_2, Home Activity");
                Intent intent = new Intent(HomeActivity.this, CActivity.class);
                String data = "Transfer data from Home to C";   // Trans data
                intent.putExtra("HometC",data);                 // Trans data
                startActivity(intent);
//                finish();
            }
        });
        button_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Log.d(TAG, "button_3, Home Activity");
                Intent intent = new Intent(HomeActivity.this, DActivity.class);
                startActivity(intent);
//                finish();
            }
        });
    }


    // life cycle test
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: home!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: home!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: home!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: home!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: home!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: home!");
    }
    // life cycle test over

    // Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "about:WH", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onOptionsItemSelected: logout");
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory("android.intent.category.LAUNCHER");
                startActivity(intent);
                finish();
                break;
            default:
        }
        return true;
    }
}   // the biggest bracket


