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
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_rent_others);
        i=new Intent(BuyRentActivity.this,BooksMainActivity.class);
    }

    public void booksMain(View view) {
      switch (view.getId()){
          case R.id.engineering:
              i.putExtra("sai","sankar");
              startActivity(i);
              break;
          case R.id.medicine:
              i.putExtra("sai","sankar1");
              startActivity(i);
              break;
          case R.id.civils:
              i.putExtra("sai","sankar2");
              startActivity(i);
              break;
      }
    }
}
