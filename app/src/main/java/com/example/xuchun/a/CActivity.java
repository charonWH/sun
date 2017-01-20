package com.example.xuchun.a;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CActivity extends AppCompatActivity {

    Button button_1,button_2,button_3;
    EditText edtext;

    private static final String TAG="ActivityWH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

//        Toast.makeText(this, "u r now in C Activity", Toast.LENGTH_SHORT).show();
        initView();
        buttonOnClick();

        Getdata();
    }

    private void initView(){
        button_1= (Button) findViewById(R.id.button_1);
        button_2= (Button) findViewById(R.id.button_2);
        button_3= (Button) findViewById(R.id.button_3);
        edtext=(EditText) findViewById(R.id.edtext);
    }

    private void Getdata(){
        Intent intent = getIntent();
        String data = intent.getStringExtra("HometC");
        Toast.makeText(this, "Data received from Home:\n"+data, Toast.LENGTH_SHORT).show();
    }

    // Button
    private void buttonOnClick(){
        button_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button_1, C Activity");
                Intent intent=new Intent(CActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        button_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button_2, C Activity");
//                Toast.makeText(CActivity.this, "button_2, C Activity", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        button_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button_3, C Activity");
                String text=edtext.getText().toString();
                Toast.makeText(CActivity.this,text,Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.c, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.intent:
                Toast.makeText(this, "intent:C, no function", Toast.LENGTH_SHORT).show();
                break;
            case R.id.backHome:
                Toast.makeText(this, "intent back to home", Toast.LENGTH_SHORT).show();
                Log.d(TAG, "intent back to home: ");
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory("android.intent.category.LAUNCHER");
                startActivity(intent);

                finish();
                break;
            default:
        }
        return true;
    }
}
