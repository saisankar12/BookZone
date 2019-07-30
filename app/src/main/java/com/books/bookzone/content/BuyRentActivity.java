package com.books.bookzone.content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.books.bookzone.HomeActivity;
import com.books.bookzone.R;
import com.books.bookzone.data.UploadedProductsFragment;

public class BuyRentActivity extends AppCompatActivity {

    Button engin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_rent_others);
        engin=findViewById(R.id.engineering);
        engin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
