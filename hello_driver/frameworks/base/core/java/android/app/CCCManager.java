package android.app;

/**
 * Created by liam on 16/10/2.
 */
import android.annotation.SdkConstant;
import android.annotation.SystemApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ICCCService;
import android.util.Log;

public class CCCManager {
    ICCCService mService;
    public CCCManager(Context ctx,ICCCService service){
        mService=service;
    }
    public void setVal(String key,String value){
        try{
            mService.setVal(key,value);
        }catch(Exception e){
            Log.e("CCCManager",e.toString());
            e.printStackTrace();
        }

    }
    public String getVal(String key){
        try{
            return mService.getVal(key);
        }catch(Exception e){
            Log.e("CCCManager",e.toString());
            e.printStackTrace();
        }
        return null;
    }
    public void appendLog(String log){
        try{
            mService.appendLog(log);
        }catch(Exception e){
            Log.e("CCCManager",e.toString());
            e.printStackTrace();
        }
    }
    public void clearLog(){
        try{
            mService.clearLog();
        }catch(Exception e){
            Log.e("CCCManager",e.toString());
            e.printStackTrace();
        }
    }
    public String readLog(){
        try{
            return mService.readLog();
        }catch(Exception e){
            Log.e("CCCManager",e.toString());
            e.printStackTrace();
        }
        return null;
    }
}
