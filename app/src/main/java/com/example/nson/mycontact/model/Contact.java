package com.example.nson.mycontact.model;

/**
 * Created by NSON on 30-03-2017.
 */

public class Contact {
    private Boolean isMale;
    private String mName;
    private String mPhone;

    public Contact(Boolean isMale, String mName, String mPhone) {
        this.isMale = isMale;
        this.mName = mName;
        this.mPhone = mPhone;
    }

    public Boolean getMale() {
        return isMale;
    }

    public void setMale(Boolean male) {
        isMale = male;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }
}
