package com.books.bookzone.data;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.books.bookzone.content.BuylendActivity;
import com.books.bookzone.content.InternTrainingActivity;
import com.books.bookzone.R;
import com.books.bookzone.content.SellRentActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

Button buy_lend,sell_rent,intern_training;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        buy_lend=v.findViewById(R.id.buy_lend);
        sell_rent=v.findViewById(R.id.sell_rent);
        intern_training=v.findViewById(R.id.intern_training);
        buy_lend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BuylendActivity.class));
            }
        });
        sell_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), SellRentActivity.class));
            }
        });
        intern_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), InternTrainingActivity.class));
            }
        });

        return v;
    }

}
