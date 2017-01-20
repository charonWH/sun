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
    Button button_1,button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: run");

        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
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
                finish();
            }
        });
    }


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


