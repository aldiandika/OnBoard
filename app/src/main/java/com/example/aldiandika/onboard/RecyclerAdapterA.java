package com.example.aldiandika.onboard;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Crew on 5/4/2017.
 */

public class RecyclerAdapterA extends RecyclerView.Adapter<RecyclerAdapterA.ViewHolder> {

    private int[] potoA = { R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name };

    private String[] namaA = {"First Time AR!",
            "First Timer Quiz!",
            "First Time Reading!"};

    private String[] kegA = {"scan AR 2 kali",
            "Jawab kuis 2 kali",
            "Baca Company Culture"};


    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView namaAchiev;
        public TextView kegiatanAchiev;
        public ImageView imgA;


        public ViewHolder(View itemView) {
            super(itemView);
            imgA = (ImageView) itemView.findViewById(R.id.imgA);
            namaAchiev = (TextView) itemView.findViewById(R.id.namaAchiev);
            kegiatanAchiev = (TextView)itemView.findViewById(R.id.kegiatanAchiev);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int posisi = getAdapterPosition();

//                    Context context = v.getContext();
//                    Intent i = new Intent(context,DialogBox.class);
//                    context.startActivity(i);
//                    Snackbar.make(v, "Click detected on item " + posisi,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                }

            });
        }
    }



    @Override
    public RecyclerAdapterA.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout_achiev, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterA.ViewHolder holder, int position) {
        holder.imgA.setImageResource(potoA[position]);
        holder.namaAchiev.setText(namaA[position]);
        holder.kegiatanAchiev.setText(kegA[position]);

    }

    @Override
    public int getItemCount() {
        return namaA.length;
//        return pos;
    }
}
