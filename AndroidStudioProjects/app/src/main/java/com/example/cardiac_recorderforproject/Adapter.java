package com.example.cardiac_recorderforproject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userlist ;
    public  Adapter (List<ModelClass>userlist){this.userlist=userlist;}
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        String name1=userlist.get(position).getName();
        String time1=userlist.get(position).getTime();
        String comment1=userlist.get(position).getComment();
        String line1=userlist.get(position).getLine();
        /*String systolic1=userlist.get(position).getSystolic();
        String diastolic1=userlist.get(position).getDiastolic();
        String heart1=userlist.get(position).getHeart();*/
        holder.setData(name1,time1,comment1,line1/*systolic1,diastolic1,heart1*/);
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView time;
        private TextView comment;
        private TextView line;
        /*private TextView systolic;
        private TextView diastolic;
        private TextView heart;*/

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name= itemView.findViewById(R.id.name);
            time=itemView.findViewById(R.id.time);
            comment=itemView.findViewById(R.id.comment);
            line = itemView.findViewById(R.id.line);
            /*systolic = itemView.findViewById(R.id.systolic2);
            diastolic = itemView.findViewById(R.id.diastolic2);
            heart = itemView.findViewById(R.id.heart2);*/
        }

        public void setData(String name1, String time1, String comment1, String line1/*String systolic1, String diastolic1, String heart1*/) {
            name.setText(name1);
            time.setText(time1);
            comment.setText(comment1);
            line.setText(line1);
            /*systolic.setText(systolic1);
            diastolic.setText(diastolic1);
            heart.setText(heart1);*/
        }
    }
}
