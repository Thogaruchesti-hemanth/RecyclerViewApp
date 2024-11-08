package com.example.foodList;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.friendslist.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FoodAdapter foodAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(new Food(R.drawable.food1,"morning"));
        foodList.add(new Food(R.drawable.food2,"morning"));
        foodList.add(new Food(R.drawable.food3,"morning"));
        foodList.add(new Food(R.drawable.food4,"morning"));
        foodList.add(new Food(R.drawable.food5,"morning"));
        foodList.add(new Food(R.drawable.food6,"morning"));
        foodList.add(new Food(R.drawable.food7,"morning"));


//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);


//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        recyclerView.setLayoutManager(gridLayoutManager);

        foodAdapter = new FoodAdapter(foodList,this);
        recyclerView.setAdapter(foodAdapter);





    }
}