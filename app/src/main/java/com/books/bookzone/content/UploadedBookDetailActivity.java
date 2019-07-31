package com.books.bookzone.content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.books.bookzone.R;

public class UploadedBookDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploaded_book_detail);
    }

    public void addtocart(View view) {

    }

    public void rentitnow(View view) {
        Intent i=new Intent(UploadedBookDetailActivity.this,AddressActivity.class);
        startActivity(i);
    }
}
