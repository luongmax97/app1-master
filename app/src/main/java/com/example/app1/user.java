package com.example.app1;

public class user {
    private String mAnh;
    private String mTen, mDiaChi;
    private String mGender;

    public user(String mAnh, String mTen, String mDiaChi, String mGender) {
        this.mAnh = mAnh;
        this.mTen = mTen;
        this.mDiaChi = mDiaChi;
        this.mGender = mGender;
    }

    public user() {
    }

    public String getmAnh() {
        return mAnh;
    }

    public void setmAnh(String mAnh) {
        this.mAnh = mAnh;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public String getmDiaChi() {
        return mDiaChi;
    }

    public void setmDiaChi(String mDiaChi) {
        this.mDiaChi = mDiaChi;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }
}
