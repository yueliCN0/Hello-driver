/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.app;
import android.annotation.SdkConstant;
import android.annotation.SystemApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.IHelloService;
import android.util.Log;

public class HelloManager {
    IHelloService mService;
    public HelloManager(Context ctx,IHelloService service){
        mService=service;
    }
    public void setVal(int value){
        try{
            mService.setVal(value);
        }catch(Exception e){
            Log.e("HelloManager",e.toString());
            e.printStackTrace();
        }

    }
    public int getVal(){
        try{
            return mService.getVal();
        }catch(Exception e){
            Log.e("HelloManager",e.toString());
            e.printStackTrace();
        }
        return 0;
    }
    

}

