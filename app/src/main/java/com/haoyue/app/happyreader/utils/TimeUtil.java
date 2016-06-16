package com.haoyue.app.happyreader.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by joyo on 15/9/25.
 */
public class TimeUtil {

    public static String getCurrentTimeStr() {
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        return dateFormat.format(date);
    }

    public static String getCurrentYearMonthDay() {
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        return dateFormat.format(date);
    }

    public static String getCurrentMonthDay() {
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMdd");
        return dateFormat.format(date);
    }
}
