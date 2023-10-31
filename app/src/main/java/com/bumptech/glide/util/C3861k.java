package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.bumptech.glide.util.k */
/* loaded from: classes.dex */
public final class C3861k {

    /* renamed from: a */
    public static final char[] f9956a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f9957b = new char[64];
    @Nullable

    /* renamed from: c */
    public static volatile Handler f9958c;

    /* renamed from: com.bumptech.glide.util.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3862a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9959a;

        static {
            Bitmap.Config config;
            int[] iArr = new int[Bitmap.Config.values().length];
            f9959a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9959a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9959a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr2 = f9959a;
                config = Bitmap.Config.RGBA_F16;
                iArr2[config.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9959a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m6403a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static int m6402b(int i, int i2, @Nullable Bitmap.Config config) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i4 = C3862a.f9959a[config.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2 && i4 != 3) {
                i5 = 4;
                if (i4 == 4) {
                    i5 = 8;
                }
            }
        }
        return i3 * i5;
    }

    @TargetApi(19)
    /* renamed from: c */
    public static int m6401c(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    @NonNull
    /* renamed from: d */
    public static ArrayList m6400d(@NonNull Set set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (Object obj : set) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Handler m6399e() {
        if (f9958c == null) {
            synchronized (C3861k.class) {
                if (f9958c == null) {
                    f9958c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f9958c;
    }

    /* renamed from: f */
    public static int m6398f(int i, @Nullable Object obj) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: g */
    public static boolean m6397g(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }
}
