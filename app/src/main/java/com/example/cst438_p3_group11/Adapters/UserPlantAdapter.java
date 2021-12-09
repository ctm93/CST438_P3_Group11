package com.example.cst438_p3_group11.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cst438_p3_group11.Plants.UserPlant;
import com.example.cst438_p3_group11.R;

import java.util.ArrayList;

public class UserPlantAdapter extends RecyclerView.Adapter<UserPlantAdapter.UserPlantViewHolder>{

    private ArrayList<UserPlant> mPlants;

    public static class UserPlantViewHolder extends RecyclerView.ViewHolder {
        private TextView mName;
        private TextView mDescription;
        private TextView mNotes;
        private TextView mWateringCycle;
        private TextView mFertilizingCycle;
        private ImageView mDelete;
        private ImageView mEdit;

        public UserPlantViewHolder(@NonNull View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.plant_name);
            mDescription = itemView.findViewById(R.id.plant_description);
            mNotes = itemView.findViewById(R.id.notes);
            mWateringCycle = itemView.findViewById(R.id.watering_cycle);
            mFertilizingCycle = itemView.findViewById(R.id.fertilize_cycle);
            mDelete = itemView.findViewById(R.id.delete);
            mEdit = itemView.findViewById(R.id.edit);
        }
    }

    public UserPlantAdapter(ArrayList<UserPlant> plants) {
        mPlants = plants;
    }

    @NonNull
    @Override
    public UserPlantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_plant_item, parent, false);
        return new UserPlantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserPlantViewHolder holder, int position) {
        UserPlant plant = mPlants.get(position);
        holder.mName.setText(plant.getmPlantName());
        holder.mDescription.setText(plant.getmDescription());
        holder.mNotes.setText(plant.getmNotes());
        holder.mWateringCycle.setText(plant.getmWateringCycle());
        holder.mFertilizingCycle.setText(plant.getmFertilizeCycle());
    }

    @Override
    public int getItemCount() {
        return mPlants.size();
    }

    public void filterList(ArrayList<UserPlant> plants) {
        mPlants = plants;
        notifyDataSetChanged();
    }
}
