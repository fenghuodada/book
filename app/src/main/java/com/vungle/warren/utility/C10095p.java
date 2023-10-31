package com.vungle.warren.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.content.PermissionChecker;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vungle.warren.utility.p */
/* loaded from: classes3.dex */
public final class C10095p {

    /* renamed from: i */
    public static C10095p f20321i;

    /* renamed from: a */
    public final Context f20322a;
    @Nullable

    /* renamed from: b */
    public final ConnectivityManager f20323b;

    /* renamed from: c */
    public final AtomicInteger f20324c;

    /* renamed from: d */
    public C10093n f20325d;

    /* renamed from: e */
    public final CopyOnWriteArraySet f20326e;

    /* renamed from: f */
    public boolean f20327f;

    /* renamed from: g */
    public final Handler f20328g;

    /* renamed from: h */
    public final RunnableC10096a f20329h;

    /* renamed from: com.vungle.warren.utility.p$a */
    /* loaded from: classes3.dex */
    public class RunnableC10096a implements Runnable {
        public RunnableC10096a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10095p c10095p = C10095p.this;
            if (!c10095p.f20326e.isEmpty()) {
                c10095p.m1263a();
                c10095p.f20328g.postDelayed(c10095p.f20329h, 30000L);
            }
        }
    }

    /* renamed from: com.vungle.warren.utility.p$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10097b {
        /* renamed from: a */
        void mo1260a(int i);
    }

    public C10095p(Context context) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.f20324c = atomicInteger;
        this.f20326e = new CopyOnWriteArraySet();
        this.f20328g = new Handler(Looper.getMainLooper());
        this.f20329h = new RunnableC10096a();
        Context applicationContext = context.getApplicationContext();
        this.f20322a = applicationContext;
        this.f20323b = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        atomicInteger.set(m1263a());
    }

    /* renamed from: b */
    public static synchronized C10095p m1262b(Context context) {
        C10095p c10095p;
        synchronized (C10095p.class) {
            if (f20321i == null) {
                f20321i = new C10095p(context);
            }
            c10095p = f20321i;
        }
        return c10095p;
    }

    /* renamed from: a */
    public final int m1263a() {
        AtomicInteger atomicInteger = this.f20324c;
        int i = -1;
        ConnectivityManager connectivityManager = this.f20323b;
        if (connectivityManager != null && PermissionChecker.m12018a(this.f20322a, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                i = activeNetworkInfo.getType();
            }
            int andSet = atomicInteger.getAndSet(i);
            if (i != andSet) {
                Log.d("p", "on network changed: " + andSet + "->" + i);
                this.f20328g.post(new RunnableC10094o(this, i));
            }
            m1261c(!this.f20326e.isEmpty());
            return i;
        }
        atomicInteger.set(-1);
        return -1;
    }

    @SuppressLint({"newApi"})
    /* renamed from: c */
    public final synchronized void m1261c(boolean z) {
        if (this.f20327f == z) {
            return;
        }
        this.f20327f = z;
        ConnectivityManager connectivityManager = this.f20323b;
        if (connectivityManager != null) {
            try {
                if (z) {
                    NetworkRequest.Builder builder = new NetworkRequest.Builder();
                    builder.addCapability(12);
                    ConnectivityManager connectivityManager2 = this.f20323b;
                    NetworkRequest build = builder.build();
                    C10093n c10093n = this.f20325d;
                    if (c10093n == null) {
                        c10093n = new C10093n(this);
                        this.f20325d = c10093n;
                    }
                    connectivityManager2.registerNetworkCallback(build, c10093n);
                } else {
                    C10093n c10093n2 = this.f20325d;
                    if (c10093n2 == null) {
                        c10093n2 = new C10093n(this);
                        this.f20325d = c10093n2;
                    }
                    connectivityManager.unregisterNetworkCallback(c10093n2);
                }
            } catch (Exception e) {
                Log.e("p", e.getMessage());
            }
        }
    }
}
