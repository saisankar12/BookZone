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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    Context ct;
    int[] sampleimages;
    String[] samplenames;
    public BookAdapter(FragmentActivity activity, int[] image, String[] names) {
    ct=activity;
    sampleimages=image;
    samplenames=names;
    }

    @NonNull
    @Override
    public BookAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(ct).inflate(R.layout.books_display_row_design,viewGroup,false);

        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookAdapter.BookViewHolder bookViewHolder, int i) {
        bookViewHolder.iv.setImageResource(sampleimages[i]);
        bookViewHolder.tv.setText(samplenames[i]);
    }

    @Override
    public int getItemCount() {
        return sampleimages.length;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tv;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.book_row_image);
            tv=itemView.findViewById(R.id.book_row_title);

        }
    }
}
