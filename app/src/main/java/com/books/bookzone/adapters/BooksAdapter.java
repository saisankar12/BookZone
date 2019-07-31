package com.books.bookzone.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.books.bookzone.R;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BookViewHolder> {

    @NonNull
    @Override
    public BooksAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksAdapter.BookViewHolder bookViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {


        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
