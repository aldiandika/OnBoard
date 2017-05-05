package com.example.aldiandika.onboard;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by Crew on 5/3/2017.
 */

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    int pos;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment, container, false);

//        Dialog dialog;
//        dialog = new Dialog(getActivity());
//        udahBaca = (Button) dialog.findViewById(R.id.udahBaca);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);

        return v;
    }
}

//pos = adapter.getItemCount();
//        switch (pos){
//        case 0 :
//        Dialog dialog;
//        dialog = new Dialog(getActivity());
//        dialog.setContentView(R.layout.dialog_company);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.show();
//        break;
//        }