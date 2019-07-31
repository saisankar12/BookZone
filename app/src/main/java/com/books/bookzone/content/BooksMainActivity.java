package com.books.bookzone.content;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.books.bookzone.R;
import com.books.bookzone.adapters.BooksAdapter;

public class BooksMainActivity extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_main);
        rv=findViewById(R.id.recyclerview);
        rv.setLayoutManager(new GridLayoutManager(BooksMainActivity.this,2));
        rv.setAdapter(new BooksAdapter());
        String s=getIntent().getStringExtra("sai");
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }
}
