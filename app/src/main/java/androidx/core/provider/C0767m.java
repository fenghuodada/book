package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.C0475g;
import androidx.collection.C0482i;
import androidx.core.graphics.C0711e;
import androidx.core.util.InterfaceC0797a;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.core.provider.m */
/* loaded from: classes.dex */
public final class C0767m {

    /* renamed from: a */
    public static final C0475g<String, Typeface> f2454a = new C0475g<>(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f2455b;

    /* renamed from: c */
    public static final Object f2456c;
    @GuardedBy("LOCK")

    /* renamed from: d */
    public static final C0482i<String, ArrayList<InterfaceC0797a<C0768a>>> f2457d;

    /* renamed from: androidx.core.provider.m$a */
    /* loaded from: classes.dex */
    public static final class C0768a {

        /* renamed from: a */
        public final Typeface f2458a;

        /* renamed from: b */
        public final int f2459b;

        public C0768a(int i) {
            this.f2458a = null;
            this.f2459b = i;
        }

        @SuppressLint({"WrongConstant"})
        public C0768a(@NonNull Typeface typeface) {
            this.f2458a = typeface;
            this.f2459b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0771p());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2455b = threadPoolExecutor;
        f2456c = new Object();
        f2457d = new C0482i<>();
    }

    @NonNull
    /* renamed from: a */
    public static C0768a m11823a(@NonNull String str, @NonNull Context context, @NonNull C0762h c0762h, int i) {
        int i2;
        C0475g<String, Typeface> c0475g = f2454a;
        Typeface typeface = c0475g.get(str);
        if (typeface != null) {
            return new C0768a(typeface);
        }
        try {
            C0769n m11826a = C0759f.m11826a(context, c0762h);
            int i3 = 1;
            C0770o[] c0770oArr = m11826a.f2461b;
            int i4 = m11826a.f2460a;
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                if (c0770oArr != null && c0770oArr.length != 0) {
                    i3 = 0;
                    for (C0770o c0770o : c0770oArr) {
                        int i5 = c0770o.f2466e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                }
                i2 = i3;
            }
            if (i2 != 0) {
                return new C0768a(i2);
            }
            Typeface mo11885b = C0711e.f2402a.mo11885b(context, c0770oArr, i);
            if (mo11885b != null) {
                c0475g.put(str, mo11885b);
                return new C0768a(mo11885b);
            }
            return new C0768a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0768a(-1);
        }
    }
}
