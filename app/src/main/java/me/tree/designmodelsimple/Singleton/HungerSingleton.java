package me.tree.designmodelsimple.Singleton;

import android.util.Log;

/**
 * Created by tree on 4/26/2018.
 */

public class HungerSingleton {
    private static final String TAG = "HungerSingleton";
    private static final HungerSingleton mHungerSingleton = new HungerSingleton();

    private HungerSingleton(){
        Log.i(TAG, "HungerSingleton: ");
    }

    public static HungerSingleton getInstance(){
        return mHungerSingleton;
    }

    @Override
    public String toString(){
        return "I am " + TAG + "!";
    }
}
