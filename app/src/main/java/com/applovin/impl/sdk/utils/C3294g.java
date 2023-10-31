package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.StrictMode;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.applovin.impl.sdk.utils.g */
/* loaded from: classes.dex */
public class C3294g {
    /* renamed from: a */
    public static Point m7027a(Context context) {
        Point point = new Point();
        point.x = 480;
        point.y = 320;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (m7025b()) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    /* renamed from: a */
    public static void m7028a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m7026a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    /* renamed from: b */
    public static boolean m7025b() {
        return true;
    }

    /* renamed from: c */
    public static boolean m7024c() {
        return true;
    }

    /* renamed from: d */
    public static boolean m7023d() {
        return true;
    }

    /* renamed from: e */
    public static boolean m7022e() {
        return true;
    }

    /* renamed from: f */
    public static boolean m7021f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: g */
    public static boolean m7020g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: h */
    public static boolean m7019h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: i */
    public static boolean m7018i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: j */
    public static boolean m7017j() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
