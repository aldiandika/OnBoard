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
 * Created by Crew on 5/3/2017.
 */

public class TimeFragment extends Fragment {

    RecyclerView recyclerViewT;
    RecyclerView.LayoutManager layoutManagerT;
    RecyclerView.Adapter adapterT;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.timeline_fragment, container, false);

        recyclerViewT = (RecyclerView) v.findViewById(R.id.recycler_viewT);

        layoutManagerT = new LinearLayoutManager(getActivity());
        recyclerViewT.setLayoutManager(layoutManagerT);

        adapterT = new RecyclerAdapterT();
        recyclerViewT.setAdapter(adapterT);
        return v;
    }
}
