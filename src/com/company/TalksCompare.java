package com.company;


import java.util.Comparator;

public class TalksCompare implements Comparator<Talk> {


    @Override
    public int compare(Talk t1, Talk t2) {
        if(t1.getMinutes() < t2.getMinutes()){
            return 1;
        } else {
            return -1;
        }
    }
}
