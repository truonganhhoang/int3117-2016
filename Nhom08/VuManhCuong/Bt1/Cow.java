package com.gemvietnam.timekeeper.login;

/**
 * Created by Stork on 19/09/2016.
 */
public class Cow {
    private String mName;
    private String mWeight;

    public Cow() {
    }

    public Cow(String mName, String mWeight) {
        this.mName = mName;
        this.mWeight = mWeight;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmWeight() {
        return mWeight;
    }

    public void setmWeight(String mWeight) {
        this.mWeight = mWeight;
    }
    public String makeSound(){
        return "Moo...";
    }
}
