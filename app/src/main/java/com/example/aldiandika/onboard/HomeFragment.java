package com.example.aldiandika.onboard;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.renderscript.Sampler;
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
import android.widget.ProgressBar;
import android.widget.Toast;


/**
 * Created by Crew on 5/3/2017.
 */

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    int progres;
    ProgressBar progBawah;
    String tampil;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_fragment, container, false);

        progBawah = (ProgressBar) v.findViewById(R.id.progBawah);
        progBawah.getProgressDrawable().setColorFilter(Color.BLUE,
                android.graphics.PorterDuff.Mode.SRC_IN);
        progBawah.setMax(100);

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);

        DialogBox dialogBox = new DialogBox();

//        progres = dialogBox.selesai_culture*5;

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        DialogBox dialogBox = new DialogBox();
        if(dialogBox.selesai_culture<11){
            progres = dialogBox.selesai_culture*10;
            progBawah.setProgress(progres);
        }
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