package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.cache.j */
/* loaded from: classes.dex */
public final class C3519j {

    /* renamed from: a */
    public final int f9303a;

    /* renamed from: b */
    public final int f9304b;

    /* renamed from: c */
    public final int f9305c;

    /* renamed from: com.bumptech.glide.load.engine.cache.j$a */
    /* loaded from: classes.dex */
    public static final class C3520a {

        /* renamed from: e */
        public static final int f9306e;

        /* renamed from: a */
        public final Context f9307a;

        /* renamed from: b */
        public final ActivityManager f9308b;

        /* renamed from: c */
        public final C3521b f9309c;

        /* renamed from: d */
        public final float f9310d;

        static {
            f9306e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public C3520a(Context context) {
            this.f9310d = f9306e;
            this.f9307a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f9308b = activityManager;
            this.f9309c = new C3521b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
                this.f9310d = 0.0f;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.j$b */
    /* loaded from: classes.dex */
    public static final class C3521b {

        /* renamed from: a */
        public final DisplayMetrics f9311a;

        public C3521b(DisplayMetrics displayMetrics) {
            this.f9311a = displayMetrics;
        }
    }

    public C3519j(C3520a c3520a) {
        int i;
        float f;
        boolean z;
        Context context = c3520a.f9307a;
        ActivityManager activityManager = c3520a.f9308b;
        if (activityManager.isLowRamDevice()) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        this.f9305c = i;
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (isLowRamDevice) {
            f = 0.33f;
        } else {
            f = 0.4f;
        }
        int round = Math.round(memoryClass * f);
        DisplayMetrics displayMetrics = c3520a.f9309c.f9311a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f3 = c3520a.f9310d;
        int round2 = Math.round(f2 * f3);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.f9304b = round3;
            this.f9303a = round2;
        } else {
            float f4 = i2 / (f3 + 2.0f);
            this.f9304b = Math.round(2.0f * f4);
            this.f9303a = Math.round(f4 * f3);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f9304b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f9303a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i));
            sb.append(", memory class limited? ");
            if (i3 > round) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
