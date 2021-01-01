package com.tejeet.meetly_clone.Data;

public class SuggestedProfileData {

    private int mpath;
    private String name;
    private String age;
    private int distance;

    public SuggestedProfileData(int mpath, String name, String age, int distance) {
        this.mpath = mpath;
        this.name = name;
        this.age = age;
        this.distance = distance;
    }

    public int getMpath() {
        return mpath;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getDistance() {
        return distance;
    }
}
