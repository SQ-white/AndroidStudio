package com.example.chensuqi.multimedialearning;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chensuqi.multimedialearning.fragment.FragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.sendNotification);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AnotherActivity.class);
                PendingIntent pendingIntent=PendingIntent.getActivity(MainActivity.this,10,intent,0);
                NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notification=new NotificationCompat.Builder(MainActivity.this,"1")
                        .setContentTitle("this is Notification Title")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher))
                        .setContentIntent(pendingIntent)
                        .setAutoCancel(true)
                        .setStyle(new NotificationCompat.BigTextStyle().bigText("this is notification text.this is notification text.this is notification text.this is notification text.this is notification text.this is notification text.this is notification text.this is notification text."))
                        .build();
                notificationManager.notify(1,notification);
            }
        });

        Button button1=(Button)findViewById(R.id.jumpToTakePhoto);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,TakePhoto.class);
                startActivity(intent);
            }
        });

        Button button2=(Button)findViewById(R.id.jumpToSelectPhoto);
                button2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent(MainActivity.this,SelectPhoto.class);
                        startActivity(intent);
                    }

                });

        findViewById(R.id.btn_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentActivity.class));
            }
        });
    }

}
