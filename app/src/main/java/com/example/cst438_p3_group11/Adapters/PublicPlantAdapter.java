package com.example.cst438_p3_group11.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cst438_p3_group11.Plants.PublicPlant;
import com.example.cst438_p3_group11.R;

import java.util.ArrayList;

public class PublicPlantAdapter extends RecyclerView.Adapter<PublicPlantAdapter.PublicPlantViewHolder> {

    ArrayList<PublicPlant> mPlants;

    public static class PublicPlantViewHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        private TextView mDescription;

        public PublicPlantViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.plant_name);
            mDescription = itemView.findViewById(R.id.plant_description);
        }
    }

    public PublicPlantAdapter(ArrayList<PublicPlant> plants) {
        mPlants = plants;
    }

    @NonNull
    @Override
    public PublicPlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.public_plant_item, parent, false);
        return new PublicPlantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PublicPlantViewHolder holder, int position) {
        PublicPlant plant = mPlants.get(position);
        holder.mName.setText(plant.getPlantName());
        holder.mDescription.setText(plant.getDescription());
    }

    @Override
    public int getItemCount() {
        return mPlants.size();
    }

    public void filterList(ArrayList<PublicPlant> plants) {
        mPlants = plants;
        notifyDataSetChanged();
    }
}
