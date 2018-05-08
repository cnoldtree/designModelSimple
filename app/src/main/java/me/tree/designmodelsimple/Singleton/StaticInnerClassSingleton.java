package me.tree.designmodelsimple.Singleton;

import android.util.Log;

/**
 * Created by tree on 4/26/2018.
 */

public class StaticInnerClassSingleton {
    private static final String TAG = "StaticInnerClassSingleton";

    private StaticInnerClassSingleton(){
        Log.i(TAG, "StaticInnerClassSingleton: ");
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingletonHolder.staticInnerClassSingleton;
    }

    private static class SingletonHolder{
        private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    @Override
    public String toString(){
        return "I am " + TAG + "!";
    }
}
