package com.books.bookzone.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.books.bookzone.R;
import com.books.bookzone.content.UploadedBookDetailActivity;

public class UploadedBooksAdapter extends RecyclerView.Adapter<UploadedBooksAdapter.BookViewHolder> {

    Context ct;
    int[] sampleimages;
    String[] samplenames;
    public UploadedBooksAdapter(FragmentActivity activity, int[] image, String[] names) {
    ct=activity;
    sampleimages=image;
    samplenames=names;
    }

    @NonNull
    @Override
    public UploadedBooksAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(ct).inflate(R.layout.books_display_row_design,viewGroup,false);

        return new BookViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UploadedBooksAdapter.BookViewHolder bookViewHolder, int i) {
        bookViewHolder.iv.setImageResource(sampleimages[i]);
        bookViewHolder.tv.setText(samplenames[i]);
        bookViewHolder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ct, UploadedBookDetailActivity.class);
                ct.startActivity(i);
            }
        });
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
