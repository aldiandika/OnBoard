package com.example.aldiandika.onboard;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Crew on 5/4/2017.
 */

public class RecyclerAdapterT extends RecyclerView.Adapter<RecyclerAdapterT.ViewHolder> {

    private int lastPosition = -1;

    private int[] poto = { R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name };

    private String[] nama = {"Felix",
            "Densup",
            "Densup",
            "Densup",
            "Densup"};

    private String[] kgt = {"Telah Menjawab Kuis Tentang Game Lead",
            "Telah Menyelesaikan Scan AR : ADITIA_DWIPERDANA",
            "Telah Menyelesaikan Scan AR : TEDY_ARIAN",
            "Telah Menyelesaikan Quest 1",
            "Telah Menyelesaikan Quest 2"};

    private String[] tanggal = {"2/4/2017",
            "2/4/2017",
            "2/4/2017",
            "2/4/2017",
            "2/4/2017",};


    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView namaTime;
        public TextView tgl;
        public ImageView imgT;
        public TextView kegiatan;


        public ViewHolder(View itemView) {
            super(itemView);
            namaTime = (TextView) itemView.findViewById(R.id.namaTime);
            tgl = (TextView)itemView.findViewById(R.id.tgl);
            imgT = (ImageView) itemView.findViewById(R.id.imgT);
            kegiatan = (TextView) itemView.findViewById(R.id.kegiatan);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                  int  posisi = getAdapterPosition();
                }

            });
        }
    }



    @Override
    public RecyclerAdapterT.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout_time, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterT.ViewHolder holder, int position) {
        holder.imgT.setImageResource(poto[position]);
        holder.namaTime.setText(nama[position]);
        holder.kegiatan.setText(kgt[position]);
        holder.tgl.setText(tanggal[position]);
        setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(),
                    android.R.anim.fade_in);
            animation.setDuration(1000);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return nama.length;
//        return pos;
    }
}
