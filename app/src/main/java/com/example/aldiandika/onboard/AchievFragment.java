package com.example.aldiandika.onboard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Crew on 5/5/2017.
 */

public class AchievFragment extends Fragment {

    RecyclerView recyclerViewA;
    RecyclerView.LayoutManager layoutManagerA;
    RecyclerView.Adapter adapterA;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.achiev_fragment, container, false);

        recyclerViewA = (RecyclerView) v.findViewById(R.id.recycler_viewA);

        layoutManagerA = new LinearLayoutManager(getActivity());
        recyclerViewA.setLayoutManager(layoutManagerA);

        adapterA = new RecyclerAdapterA();
        recyclerViewA.setAdapter(adapterA);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        layoutManagerA = new LinearLayoutManager(getActivity());
        recyclerViewA.setLayoutManager(layoutManagerA);

        adapterA = new RecyclerAdapterA();
        recyclerViewA.setAdapter(adapterA);
    }
}
