package com.applovin.sdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.Dimension;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkUtils {

    /* renamed from: a */
    private static final Handler f8976a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a */
        private int f8977a;

        /* renamed from: b */
        private int f8978b;

        private Size() {
        }

        public Size(int i, int i2) {
            this.f8977a = i;
            this.f8978b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Size) {
                Size size = (Size) obj;
                return this.f8977a == size.getWidth() && this.f8978b == size.getHeight();
            }
            return false;
        }

        public int getHeight() {
            return this.f8978b;
        }

        public int getWidth() {
            return this.f8977a;
        }

        public int hashCode() {
            int i = this.f8978b;
            int i2 = this.f8977a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public String toString() {
            return this.f8977a + "x" + this.f8978b;
        }
    }

    /* renamed from: a */
    private static boolean m6792a(String str, String str2) {
        for (String str3 : CollectionUtils.explode(str2)) {
            if (str.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    @Dimension(unit = 1)
    public static int dpToPx(Context context, @Dimension(unit = 0) int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean isEmulator() {
        return m6792a(Build.DEVICE, "goldfish,vbox") || m6792a(Build.HARDWARE, "ranchu,generic,vbox") || m6792a(Build.MANUFACTURER, "Genymotion") || m6792a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str);
    }

    public static boolean isTablet(Context context) {
        Point m7027a = C3294g.m7027a(context);
        return Math.min(m7027a.x, m7027a.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature(C3294g.m7023d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    @Dimension(unit = 0)
    public static int pxToDp(Context context, @Dimension(unit = 1) int i) {
        return (int) Math.ceil(i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (z || !Utils.isMainThread()) {
            f8976a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f8976a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (Utils.isMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }
}
