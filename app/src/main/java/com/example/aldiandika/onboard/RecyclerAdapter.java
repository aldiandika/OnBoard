package com.example.aldiandika.onboard;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Crew on 5/4/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] Ket = {"Perkenalan: Game Lead",
            "Perkenalan: Kepala Departemen",
            "Company Culture"};

    private int[] images = { R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name };

    private String[] Prog = {"0/2",
            "0/2",
            "0/2"};


    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView txtHome;
        public TextView txtAng;
        public ImageView img1;

        public ViewHolder(View itemView) {
            super(itemView);
            txtHome = (TextView) itemView.findViewById(R.id.txtHome);
            txtAng = (TextView)itemView.findViewById(R.id.txtAng);
            img1 = (ImageView) itemView.findViewById(R.id.img1);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
    }
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout1, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.txtHome.setText(Ket[position]);
        holder.txtAng.setText(Prog[position]);
        holder.img1.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return Ket.length;
    }
}
