package com.example.ma.makeshipei_screen.percent_method1.percent_method_one;

import android.content.Context;
import android.telephony.TelephonyManager;

/**
 * Created by ma on 2017/9/7.
 */
public class tools {
    /**
     * 获得手机IMEI
     * @param cx
     * @return
     */
    public static String getIMEI(Context context){
        try{
            TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            return tm.getDeviceId();
        }catch(Exception e){
//            Utilities.savaErrorLog("",e);
            return "";
        }
    }

    /**
     * 获得手机IMSI
     * @param cx
     * @return
     */
    public static String getIMSI(Context context){
        try{
            TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            return tm.getSubscriberId();
        }catch(Exception e){
//            Utilities.savaErrorLog("",e);
            return "";
        }
    }
}
