package com.sunmi.info;

import com.facebook.react.bridge.*;
import android.os.SystemProperties;


/**
 * Created by januslo on 2017/4/6.
 */
public class SunmiInfoModule extends ReactContextBaseJavaModule {
    private static final String TAG = "SunmiInfo";


    @Override
    public String getName() {
        return TAG;
    }

    public SunmiInfoModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void getBrand(Callback callBack){
        callBack.invoke(SystemProperties.get("ro.product.brand"));
    }

    @ReactMethod
    public void getModel(Callback callBack){
        callBack.invoke(SystemProperties.get("ro.product.model"));
    }
    @ReactMethod
    public void getSN(Callback callBack){
        callBack.invoke(SystemProperties.get("ro.serialno"));
    }
}
