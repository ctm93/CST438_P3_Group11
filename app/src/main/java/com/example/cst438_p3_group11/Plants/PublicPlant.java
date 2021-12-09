package com.example.cst438_p3_group11.Plants;

public class PublicPlant {

    private int mPlantId;
    private int mUserId;
    private String mUsername;
    private String mPlantName;
    private String mDescription;

    public PublicPlant(int mPlantId, int mUserId, String mUsername, String mPlantName, String mDescription) {
        this.mPlantId = mPlantId;
        this.mUserId = mUserId;
        this.mUsername = mUsername;
        this.mPlantName = mPlantName;
        this.mDescription = mDescription;
    }

    public int getPlantId() {
        return mPlantId;
    }

    public void setPlantId(int mPlantId) {
        this.mPlantId = mPlantId;
    }

    public int getUserId() {
        return mUserId;
    }

    public void setUserId(int mUserId) {
        this.mUserId = mUserId;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String mUsername) {
        this.mUsername = mUsername;
    }

    public String getPlantName() {
        return mPlantName;
    }

    public void setPlantName(String mPlantName) {
        this.mPlantName = mPlantName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
