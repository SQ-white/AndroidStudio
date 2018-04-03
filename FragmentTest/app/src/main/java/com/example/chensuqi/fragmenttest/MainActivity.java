package com.example.chensuqi.fragmenttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        //replaceFragment(new RightFragment());
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                //replaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }

//    private void replaceFragment(android.support.v4.app.Fragment fragment) {
//        android.support.v4.app.FragmentManager fragmentManager=getSupportFragmentManager();
//        android.support.v4.app.FragmentTransaction transaction=fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_fragment,fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}
