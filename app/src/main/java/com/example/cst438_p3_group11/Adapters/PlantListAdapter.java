package com.example.cst438_p3_group11.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cst438_p3_group11.R;
import com.example.cst438_p3_group11.TempPlantClass;

import java.util.ArrayList;

public class PlantListAdapter extends RecyclerView.Adapter<PlantListAdapter.PlantViewHolder> {

    public ArrayList<TempPlantClass> mPlantList;

    public static class PlantViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImage;
        public TextView mName;
        public TextView mDescription;
        public ImageView mFavorite;
        public ImageView mEdit;
        public ImageView mDelete;

        public PlantViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage = itemView.findViewById(R.id.plant_image);
            mName = itemView.findViewById(R.id.plant_name);
            mDescription = itemView.findViewById(R.id.plant_description);
            mFavorite = itemView.findViewById(R.id.favorite);
            mEdit = itemView.findViewById(R.id.edit);
            mDelete = itemView.findViewById(R.id.delete);
        }
    }

    public PlantListAdapter(ArrayList<TempPlantClass> plants) {
        mPlantList = plants;
    }


    @NonNull
    @Override
    public PlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plant_item, parent, false);
        return new PlantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlantViewHolder holder, int position) {
        TempPlantClass item = mPlantList.get(position);
        holder.mImage.setImageResource(item.getImage());
        holder.mName.setText(item.getPlantName());
        holder.mDescription.setText(item.getPlantDescription());

    }

    @Override
    public int getItemCount() {
        return mPlantList.size();
    }

    public void filterList(ArrayList<TempPlantClass> plants) {
        mPlantList = plants;
        notifyDataSetChanged();
    }
}
