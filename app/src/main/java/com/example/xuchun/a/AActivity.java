package com.example.xuchun.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AActivity extends AppCompatActivity {
    private static final String TAG = "ActivityWH";
    Button button_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this, "U R now in AActivity", Toast.LENGTH_SHORT).show();

        button_1 = (Button) findViewById(R.id.button_1);
        buttonOnClick();
    }


    public void buttonOnClick(){
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Log.d(TAG, "onClick Second: click button");
                Toast.makeText(AActivity.this,"shit A",Toast.LENGTH_SHORT).show();
                Intent intentToHomeActivity = new Intent(AActivity.this, HomeActivity.class);
                startActivity(intentToHomeActivity);
//                finish();
            }
        });
    }
}