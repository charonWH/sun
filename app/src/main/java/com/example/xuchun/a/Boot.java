package com.example.xuchun.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class Boot extends BroadcastReceiver {
    public Boot() {
    }

    private static final String TAG = "ActivityWH";

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");
        Toast.makeText(context,"I'm boot",Toast.LENGTH_LONG).show();
        Log.d(TAG, "onReceive: Boot!");
        Intent intent1 = new Intent("WTF.C");
        intent.addCategory("WTF.C");
//        startActivity(intent);

    }
}
