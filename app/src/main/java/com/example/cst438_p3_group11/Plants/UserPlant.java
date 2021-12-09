package com.example.cst438_p3_group11.Plants;

public class UserPlant {
    private int mUserId;
    private String mPlantName;
    private String mDescription;
    private String mNotes;
    private String mWateringCycle;
    private String mFertilizeCycle;

    public UserPlant(int mUserId, String mPlantName, String mDescription, String mNotes, String mWateringCycle, String mFertilizeCycle) {
        this.mUserId = mUserId;
        this.mPlantName = mPlantName;
        this.mDescription = mDescription;
        this.mNotes = mNotes;
        this.mWateringCycle = mWateringCycle;
        this.mFertilizeCycle = mFertilizeCycle;
    }

    public int getmUserId() {
        return mUserId;
    }

    public void setmUserId(int mUserId) {
        this.mUserId = mUserId;
    }

    public String getmPlantName() {
        return mPlantName;
    }

    public void setmPlantName(String mPlantName) {
        this.mPlantName = mPlantName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmNotes() {
        return mNotes;
    }

    public void setmNotes(String mNotes) {
        this.mNotes = mNotes;
    }

    public String getmWateringCycle() {
        return mWateringCycle;
    }

    public void setmWateringCycle(String mWateringCycle) {
        this.mWateringCycle = mWateringCycle;
    }

    public String getmFertilizeCycle() {
        return mFertilizeCycle;
    }

    public void setmFertilizeCycle(String mFertilizeCycle) {
        this.mFertilizeCycle = mFertilizeCycle;
    }
}
