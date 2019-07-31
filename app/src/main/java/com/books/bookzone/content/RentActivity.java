package com.books.bookzone.content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.books.bookzone.R;

public class RentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent);
    }

    public void upload(View view) {
        Intent i=new Intent(RentActivity.this, UploadBook.class);
        startActivity(i);
    }
}
