package com.books.bookzone.content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.books.bookzone.HomeActivity;
import com.books.bookzone.R;

public class OrderConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confirmation);
    }

    public void home(View view) {
        Intent i=new Intent(OrderConfirmation.this, HomeActivity.class);
        startActivity(i);
    }
}
