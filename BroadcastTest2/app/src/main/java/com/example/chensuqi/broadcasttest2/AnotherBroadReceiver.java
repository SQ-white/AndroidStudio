package com.example.chensuqi.broadcasttest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context,"received in AnotherBroaderReceiver",
                Toast.LENGTH_SHORT).show();
    }
}
