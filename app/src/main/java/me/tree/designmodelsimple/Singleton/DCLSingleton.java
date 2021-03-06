package me.tree.designmodelsimple.Singleton;

import android.util.Log;

/**
 * Double check lock(DCL)
 * Created by tree on 4/26/2018.
 */

public class DCLSingleton {
    private static final String TAG = "DCLSingleton";
    private volatile static DCLSingleton mDCLSingleton = null;

    private DCLSingleton(){
        Log.i(TAG, "DCLSingleton:");
    }

    public static DCLSingleton getInstance(){
        if(null == mDCLSingleton){ // 避免重复不必要的同步
            synchronized (DCLSingleton.class){ // 确保多线程下对象唯一
                if (null == mDCLSingleton){ // 非空的情况下创建实例
                    mDCLSingleton = new DCLSingleton();
                }
            }
        }
        return mDCLSingleton;
    }

    @Override
    public String toString(){
        return "I am " + TAG + "!";
    }


}
