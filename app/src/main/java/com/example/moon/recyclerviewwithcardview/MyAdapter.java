package com.example.moon.recyclerviewwithcardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<String> userNames;
    ArrayList<String> userImages;

    public MyAdapter(Context mContext, ArrayList<String> userNames, ArrayList<String> userImages) {
        this.mContext = mContext;
        this.userNames = userNames;
        this.userImages = userImages;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(userImages.get(position))
                .into(holder.userImage);
        holder.userName.setText(userNames.get(position));
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,userNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userImages.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        RelativeLayout parent_layout;
        CircleImageView userImage;
        TextView userName;

        public MyViewHolder(View itemView) {
            super(itemView);
            parent_layout = (RelativeLayout)itemView.findViewById(R.id.layout_parent);
            userImage = (CircleImageView)itemView.findViewById(R.id.iv_user);
            userName = (TextView)itemView.findViewById(R.id.tv_userName);
        }
    }
}
