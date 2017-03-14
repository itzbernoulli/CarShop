package com.oyinloyeayodeji.www.mycarshop;

import java.io.Serializable;

/**
 * Created by Ayo on 13/03/2017.
 */

public class CarShop implements Serializable{
    private String mServiceName;
    private int mCost;
    private int mCode;
    private String mDescription;

    public String getmServiceName() {
        return mServiceName;
    }

    public void setmServiceName(String mServiceName) {
        this.mServiceName = mServiceName;
    }

    public int getmCost() {
        return mCost;
    }

    public void setmCost(int mCost) {
        this.mCost = mCost;
    }

    public int getmCode() {
        return mCode;
    }

    public void setmCode(int mCode) {
        this.mCode = mCode;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public CarShop(String servicename, int cost, int code, String description){
        mServiceName = servicename;
        mCost = cost;

        mCode = code;
        mDescription = description;
    }
}
