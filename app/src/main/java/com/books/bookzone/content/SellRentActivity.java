package com.books.bookzone.content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.books.bookzone.R;

public class SellRentActivity extends AppCompatActivity {

    Button rent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_rent);
        rent=findViewById(R.id.product_rent);
        rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SellRentActivity.this,RentActivity.class);
                startActivity(i);
            }
        });
    }
}
