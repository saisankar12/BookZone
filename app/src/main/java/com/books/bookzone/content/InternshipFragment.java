package com.books.bookzone.content;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.books.bookzone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InternshipFragment extends Fragment {


    public InternshipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_internship, container, false);

        return v;
    }

}
