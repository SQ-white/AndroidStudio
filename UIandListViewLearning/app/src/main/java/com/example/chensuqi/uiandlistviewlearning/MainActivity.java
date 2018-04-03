package com.example.chensuqi.uiandlistviewlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] nickname={"上官卉梓","杨雪慧","陈素琪","陈若潇"};
    private String[] summary={"你们快去洗澡吧，11点了","你们有没有人要去洗澡吖","只有半个小时了，赶紧吧","你们怎么还不去洗澡吖"};
    private String[] date={"23:00 ","23:15 ","23:30 ","23:45 "};

    private List<Contracts> contractsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("微信");
        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()){
                    case R.id.search:
                        Log.v("你点击我干嘛","search");
                        break;
                    case R.id.add:
                        Log.v("点了也不会让你添加的","add");
                        break;
                }
                return true;
            }
        });

        ListView listView=(ListView)findViewById(R.id.listview);

        for(int i=0;i<4;i++){
            Contracts contracts = new Contracts(nickname[i],summary[i],date[i]);
            contractsList.add(contracts);
        }

        ContractsAdapter contractsAdapter = new ContractsAdapter(MainActivity.this,R.layout.listview_item,contractsList);
        listView.setAdapter(contractsAdapter);
    }
}
