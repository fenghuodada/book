package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2275r2;
import com.vungle.warren.VungleApiClient;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

@SuppressLint({"ObsoleteSdkInt"})
/* renamed from: com.adcolony.sdk.p4 */
/* loaded from: classes.dex */
public final class C2247p4 {

    /* renamed from: d */
    public boolean f5468d;

    /* renamed from: a */
    public final C2376z1 f5465a = new C2376z1();

    /* renamed from: b */
    public final C2376z1 f5466b = new C2376z1();

    /* renamed from: c */
    public String f5467c = "";

    /* renamed from: e */
    public String f5469e = "";

    /* renamed from: f */
    public C2367y1 f5470f = new C2367y1();

    /* renamed from: g */
    public String f5471g = "";

    /* renamed from: e */
    public static double m9526e() {
        Context context = C2201m0.f5363a;
        if (context == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return intExtra / intExtra2;
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* renamed from: f */
    public static String m9525f() {
        Context context = C2201m0.f5363a;
        String str = "";
        if (context == null) {
            return "";
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        if (str.length() == 0) {
            return VungleApiClient.ConnectionTypeDetail.UNKNOWN;
        }
        return str;
    }

    /* renamed from: g */
    public static float m9524g() {
        Context context = C2201m0.f5363a;
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: h */
    public static Rect m9523h() {
        Rect rect = new Rect();
        Context context = C2201m0.f5363a;
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                return rect;
            } catch (RuntimeException unused) {
                return rect;
            }
        }
        return rect;
    }

    /* renamed from: i */
    public static Rect m9522i() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        int statusBars;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        int i;
        int i2;
        Rect bounds2;
        int i3;
        int i4;
        Rect rect;
        Display display;
        Rect bounds3;
        Rect bounds4;
        Point point;
        int i5;
        Resources resources;
        String str;
        int i6;
        Rect rect2;
        Rect rect3 = new Rect();
        Context context = C2201m0.f5363a;
        if (context != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    boolean z = true;
                    if (Build.VERSION.SDK_INT < 30) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getMetrics(displayMetrics);
                        defaultDisplay.getRealMetrics(displayMetrics2);
                        ThreadPoolExecutor threadPoolExecutor = C2232o6.f5446a;
                        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                        if (identifier > 0) {
                            i5 = context.getResources().getDimensionPixelSize(identifier);
                        } else {
                            i5 = 0;
                        }
                        if (context.getResources().getConfiguration().orientation == 1) {
                            resources = context.getResources();
                            str = "navigation_bar_height";
                        } else {
                            resources = context.getResources();
                            str = "navigation_bar_height_landscape";
                        }
                        int identifier2 = resources.getIdentifier(str, "dimen", "android");
                        if (identifier2 > 0) {
                            i6 = context.getResources().getDimensionPixelSize(identifier2);
                        } else {
                            i6 = 0;
                        }
                        int i7 = displayMetrics2.heightPixels - displayMetrics.heightPixels;
                        if (i7 <= 0) {
                            rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels - i5);
                        } else {
                            if (i6 > 0 && (i7 > i5 || i6 <= i5)) {
                                rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - (i6 + i5));
                            }
                            rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics2.heightPixels - i5);
                        }
                        return rect2;
                    }
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    try {
                        Point point2 = new Point();
                        Point point3 = new Point();
                        display = context.getDisplay();
                        display.getCurrentSizeRange(point2, point3);
                        bounds3 = currentWindowMetrics.getBounds();
                        int width = bounds3.width();
                        bounds4 = currentWindowMetrics.getBounds();
                        if (width > bounds4.height()) {
                            z = true;
                        }
                        if (z) {
                            point = new Point(point3.x, point2.y);
                        } else {
                            point = new Point(point2.x, point3.y);
                        }
                        rect = new Rect(0, 0, point.x, point.y);
                    } catch (UnsupportedOperationException unused) {
                        windowInsets = currentWindowMetrics.getWindowInsets();
                        navigationBars = WindowInsets.Type.navigationBars();
                        displayCutout = WindowInsets.Type.displayCutout();
                        int i8 = navigationBars | displayCutout;
                        statusBars = WindowInsets.Type.statusBars();
                        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(i8 | statusBars);
                        bounds = currentWindowMetrics.getBounds();
                        int width2 = bounds.width();
                        i = insetsIgnoringVisibility.right;
                        i2 = insetsIgnoringVisibility.left;
                        int i9 = width2 - (i + i2);
                        bounds2 = currentWindowMetrics.getBounds();
                        int height = bounds2.height();
                        i3 = insetsIgnoringVisibility.top;
                        i4 = insetsIgnoringVisibility.bottom;
                        rect = new Rect(0, 0, i9, height - (i3 + i4));
                    }
                    return rect;
                }
                return rect3;
            } catch (RuntimeException unused2) {
                return rect3;
            }
        }
        return rect3;
    }

    /* renamed from: a */
    public final void m9530a(@Nullable Context context, @Nullable C2275r2.C2276a c2276a) {
        boolean z;
        Throwable th;
        C2376z1 c2376z1 = this.f5465a;
        if (context == null) {
            if (c2276a != null) {
                th = new Throwable("Context cannot be null.");
                c2276a.m9510b(th);
            }
            c2376z1.m9427b(true);
        }
        if (this.f5467c.isEmpty()) {
            c2376z1.m9427b(false);
        }
        try {
            C2232o6.f5446a.execute(new RunnableC2197l4(this, context, c2276a));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (z) {
            return;
        }
        C1169e.m11129c("Executing Query Advertising ID failed.", 0, 0, true);
        if (c2276a != null) {
            th = new Throwable("Query Advertising ID failed on execute.");
            c2276a.m9510b(th);
        }
        c2376z1.m9427b(true);
    }

    /* renamed from: b */
    public final C2367y1 m9529b() {
        String string;
        C2367y1 c2367y1 = new C2367y1();
        String str = this.f5467c;
        C2080d1.m9660h(c2367y1, "advertiser_id", str);
        C2080d1.m9656l(c2367y1, "limit_tracking", this.f5468d);
        if (str == null || str.isEmpty()) {
            Context context = C2201m0.f5363a;
            if (context == null) {
                string = "";
            } else {
                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            C2080d1.m9660h(c2367y1, "android_id_sha1", C2232o6.m9550m(string));
        }
        return c2367y1;
    }

    /* renamed from: c */
    public final C2367y1 m9528c() {
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, "app_set_id", this.f5469e);
        return c2367y1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:87)|4|(2:6|(33:8|(1:10)(1:85)|11|(1:15)(1:84)|16|17|18|113|22|23|(1:25)|26|(6:28|(1:30)(1:37)|31|32|33|34)|38|(1:42)|43|(1:45)(1:80)|46|(2:48|(1:(1:51))(1:52))|53|(1:61)|62|(1:64)|65|(1:67)|68|(1:70)|71|(1:73)|74|(1:76)|77|78))|86|(0)(0)|11|(6:13|15|16|17|18|113)|84|16|17|18|113) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011e, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011f, code lost:
        r7 = new java.lang.StringBuilder("JSON error in ADCJSON putLong(): ");
        r7.append(r2.toString());
        r7.append(" with key: memory_used_mb");
        r7.append(" and value: " + r5);
        androidx.datastore.preferences.protobuf.C1169e.m11129c(r7.toString(), 0, 0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114 A[Catch: all -> 0x011b, TRY_ENTER, TryCatch #2 {JSONException -> 0x011e, blocks: (B:24:0x0111, B:25:0x0113, B:26:0x0114, B:27:0x0119), top: B:98:0x0111 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.adcolony.sdk.C2367y1 m9527d() {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2247p4.m9527d():com.adcolony.sdk.y1");
    }
}
