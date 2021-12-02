package com.example.cst438_p3_group11;

public class TempPlantClass {
    //TODO: Make Final Plant Class
    private int mImage;
    private String mPlantName;
    private String mPlantDescription;

    public TempPlantClass(int mImage, String mPlantName, String mPlantDescription) {
        this.mImage = mImage;
        this.mPlantName = mPlantName;
        this.mPlantDescription = mPlantDescription;
    }

    public int getImage() {
        return mImage;
    }

    public String getPlantName() {
        return mPlantName;
    }

    public String getPlantDescription() {
        return mPlantDescription;
    }
}
