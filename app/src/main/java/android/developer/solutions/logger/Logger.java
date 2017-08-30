package android.developer.solutions.logger;

import android.util.Log;

/**
 * Created by Mukesh on 4/8/17.
 * Affle Appstudioz S/W Pvt. Ltd.
 * mukesh.yadav@affle.com
 */

public class Logger {
    private static boolean isLogEnable = false;
    private static String TAG = "";

    private Logger() {
        throw new RuntimeException("Private constructor cannot be accessed");
    }


    public static void w(final String TAG,final String s) {
        if (isLogEnable) {
            Log.w(TAG, ":->" + s);
        }
    }
    public static void w(final String s) {
        if (isLogEnable) {
            Log.w(TAG, ":->" + s);
        }
    }
    public static void warn(final String s) {
        if (isLogEnable) {
            Log.w(TAG, ":->" + s);
        }
    }


    public static void i(final String TAG,final String s) {
        if (isLogEnable) {
            Log.i(TAG, ":->" + s);
        }
    }
    public static void i(final String s) {
        if (isLogEnable) {
            Log.i(TAG, ":->" + s);
        }
    }

    public static void info(final String s) {
        if (isLogEnable) {
            Log.i(TAG, ":->" + s);
        }
    }

    public static void info(final String s, final Throwable throwable) {
        if (isLogEnable) {
            Log.i(TAG, s, throwable);
        }
    }

    public static void e(final String TAG,final String s) {
        if (isLogEnable) {
            Log.e(TAG, ":->" + s);
        }
    }

    public static void e(final String s) {
        if (isLogEnable) {
            Log.e(TAG, ":->" + s);
        }
    }

    public static void error(final String s) {
        if (isLogEnable) {
            Log.e(TAG, ":->" + s);
        }
    }

    public static void error(final String tag, final String s) {
        if (isLogEnable) {
            Log.e(tag, ":->" + s);
        }
    }


    public static void error(final Throwable throwable) {
        if (isLogEnable) {
            Log.e(TAG, null, throwable);
        }
    }

    public static void error(final String s, final Throwable throwable) {
        if (isLogEnable) {
            Log.e(TAG, s, throwable);
        }
    }

    public static void d(final String TAG,final String s) {
        if (isLogEnable) {
            Log.d(TAG, ":->" + s);
        }
    }
    public static void d(final String s) {
        if (isLogEnable) {
            Log.d(TAG, ":->" + s);
        }
    }

    public static void init(boolean isDebugable,String tag) {
        isLogEnable = isDebugable;
        tag = tag;
    }
}
