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

public class RecyclerAdapterT extends RecyclerView.Adapter<RecyclerAdapterT.ViewHolder> {

    public int pos;
    public static int posisi;

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
                    posisi = getAdapterPosition();

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
    public RecyclerAdapterT.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout1, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapterT.ViewHolder holder, int position) {
        holder.txtHome.setText(Ket[position]);
        holder.txtAng.setText(Prog[position]);
        holder.img1.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return Ket.length;
//        return pos;
    }
}
