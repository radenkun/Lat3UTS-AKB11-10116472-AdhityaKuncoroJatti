package com.ayaya.myselfapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ayaya.myselfapp.Model.DailyModel;
import com.ayaya.myselfapp.R;
import java.util.ArrayList;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.DailyViewHolder> {

    private ArrayList<DailyModel> mDailyModel;

    public static class DailyViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView namaGambar;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.dailyImg);
            namaGambar = itemView.findViewById(R.id.namaDailyTxt);
        }
    }

    public DailyAdapter(ArrayList<DailyModel> dailyList){
        mDailyModel = dailyList;
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_daily,viewGroup,false);
        DailyViewHolder Da = new DailyViewHolder(v);
        return Da;
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder dailyViewHolder, int position) {
        DailyModel currentItem = mDailyModel.get(position);
        dailyViewHolder.mImageView.setImageResource(currentItem.getmImageResource());
        dailyViewHolder.namaGambar.setText(currentItem.getNamaGambar());
    }

    @Override
    public int getItemCount() {
        return mDailyModel.size();
    }

}
