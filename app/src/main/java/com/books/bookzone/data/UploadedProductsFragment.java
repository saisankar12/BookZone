package com.books.bookzone.data;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.books.bookzone.R;
import com.books.bookzone.adapters.BookAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class UploadedProductsFragment extends Fragment {


    public UploadedProductsFragment() {
        // Required empty public constructor
    }

    RecyclerView rv;

    int[] image={R.drawable.background,R.drawable.ic_menu_camera};
    String[] names={"sai","sankar"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_uploaded_products, container, false);

        rv=v.findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new BookAdapter(getActivity(),image,names));

        return v;
    }

}
