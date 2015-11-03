package com.owen.codeframework.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Owen on 2015/11/3.
 */
public class BaseModel implements Parcelable {

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public BaseModel() {
    }

    protected BaseModel(Parcel in) {
    }

    public static final Parcelable.Creator<BaseModel> CREATOR = new Parcelable.Creator<BaseModel>() {
        public BaseModel createFromParcel(Parcel source) {
            return new BaseModel(source);
        }

        public BaseModel[] newArray(int size) {
            return new BaseModel[size];
        }
    };

}
