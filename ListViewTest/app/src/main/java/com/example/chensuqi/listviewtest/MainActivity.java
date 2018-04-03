package com.example.chensuqi.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruits() {
        for(int i=0;i<2;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit lemon=new Fruit("Lemon",R.drawable.apple_pic);
            fruitList.add(lemon);
            Fruit orange=new Fruit("Orange",R.drawable.apple_pic);
            fruitList.add(orange);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.apple_pic);
            fruitList.add(watermelon);
            Fruit pear=new Fruit("Pear",R.drawable.apple_pic);
            fruitList.add(pear);
            Fruit grape=new Fruit("Grape",R.drawable.apple_pic);
            fruitList.add(grape);
            Fruit pineapple=new Fruit("Pineapple",R.drawable.apple_pic);
            fruitList.add(pineapple);
            Fruit strawberry=new Fruit("Strawberry",R.drawable.apple_pic);
            fruitList.add(strawberry);
            Fruit pomegrante=new Fruit("Pomegrante",R.drawable.apple_pic);
            fruitList.add(pomegrante);
            Fruit mango=new Fruit("Mango",R.drawable.apple_pic);
            fruitList.add(mango);
        }
    }
}
