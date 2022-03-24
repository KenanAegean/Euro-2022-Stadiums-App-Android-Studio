package com.example.kenanege_q4;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView stadiumNumber;
    ImageView likeButton;
    TextView stadiumName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.liste);
        stadiumNumber = (TextView) findViewById(R.id.stadiumNumber);
        likeButton = (ImageView) findViewById(R.id.likeButton);
        stadiumName = (TextView) findViewById(R.id.capacity);

        //stadiumNumber.setText(Product.stadiumNumber);


        ProductAdapter productAdapter = new ProductAdapter(this, Product.getData());
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));


        stadiumNumber.setText("12");



    }


    public void likeButtonPressed(final View view)
    {

        int currentID = 3;
        //int currentID = recyclerView.getId();

        Toast.makeText(getApplicationContext(), " You liked the " + Product.getData().get(currentID).getStadiumCapacity() +  ". Hope to see you there", Toast.LENGTH_LONG).show();
    }


}