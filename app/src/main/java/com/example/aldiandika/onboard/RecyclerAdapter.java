package com.example.aldiandika.onboard;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Crew on 5/4/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    public static int posisi;
    public int itungBeresA;
    public int itungBeresB;
    public static int itungBeresC;
    public  String brpQuestA;
    public  String brpQuestB;
    public  String brpQuestC;


    private String[] Ket = {"Perkenalan: Game Lead",
            "Perkenalan: Kepala Departemen",
            "Company Culture"};

    private int[] images = { R.drawable.ic_action_name,
            R.drawable.ic_action_name,
            R.drawable.ic_action_name };

    private String[] Prog = {"0",
            "0",
            "0"};

    private String[] target = {"2",
            "2",
            "2"};

    public String[] tampil = {"0",
            "0",
            "0"};

    public int[] klik = new int[target.length];

    class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtHome;
        public TextView txtAng;
        public TextView txtAng1;
        public ImageView img1;


        public ViewHolder(View itemView) {
            super(itemView);
            img1 = (ImageView) itemView.findViewById(R.id.img1);
            txtHome = (TextView) itemView.findViewById(R.id.txtHome);
            txtAng = (TextView)itemView.findViewById(R.id.txtAng);
            txtAng1 = (TextView)itemView.findViewById(R.id.txtAng1);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    posisi = getAdapterPosition();

                    DialogBox dialogBox = new DialogBox();
                    itungBeresA = dialogBox.udah_questA;
                    itungBeresB = dialogBox.udah_questB;
                    itungBeresC = dialogBox.udah_questC;
//
//                    klik[posisi] += 1;
                    klik[0] = itungBeresA;
                    klik[1] = itungBeresB;
                    klik[2] = itungBeresC;

                    if(posisi == 0){
                        if(klik[posisi]<2){
                            Context context = v.getContext();
                            Intent i = new Intent(context,DialogBox.class);
                            context.startActivity(i);
                        }
                    }
                    else if(posisi == 1){
                        if(klik[posisi]<2){
                            Context context = v.getContext();
                            Intent i = new Intent(context,DialogBox.class);
                            context.startActivity(i);
                        }
                    }
                    else if(posisi == 2){
                        if(klik[posisi]<2){
                            Context context = v.getContext();
                            Intent i = new Intent(context,DialogBox.class);
                            context.startActivity(i);
                        }
                    }
                    else{
                        Context context = v.getContext();
                        Intent i = new Intent(context,DialogBox.class);
                        context.startActivity(i);
                    }


//                    Snackbar.make(v, "Click detected on item " + posisi,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
//                    Dialog dialog;
//                    dialog = new Dialog(v.getContext());
//                    dialog.setContentView(R.layout.dialog_company);
//                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                    dialog.show();
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
        DialogBox dialogBox = new DialogBox();
        itungBeresA = dialogBox.udah_questA;
        itungBeresB = dialogBox.udah_questB;
        itungBeresC = dialogBox.udah_questC;

        Prog[0] = String.valueOf(itungBeresA);
        Prog[1] = String.valueOf(itungBeresB);
        Prog[2] = String.valueOf(itungBeresC);

        holder.txtHome.setText(Ket[position]);
        holder.txtAng.setText(Prog[position]);
        holder.txtAng1.setText(target[position]);
        holder.img1.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return Ket.length;
//        return pos;
    }
}
