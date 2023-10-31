package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import com.bumptech.glide.manager.InterfaceC3782c;
import com.bumptech.glide.util.C3860j;

/* renamed from: com.bumptech.glide.manager.e */
/* loaded from: classes.dex */
public final class C3785e implements InterfaceC3782c {

    /* renamed from: a */
    public final Context f9800a;

    /* renamed from: b */
    public final InterfaceC3782c.InterfaceC3783a f9801b;

    /* renamed from: c */
    public boolean f9802c;

    /* renamed from: d */
    public boolean f9803d;

    /* renamed from: e */
    public final C3786a f9804e = new C3786a();

    /* renamed from: com.bumptech.glide.manager.e$a */
    /* loaded from: classes.dex */
    public class C3786a extends BroadcastReceiver {
        public C3786a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, Intent intent) {
            C3785e c3785e = C3785e.this;
            boolean z = c3785e.f9802c;
            c3785e.f9802c = C3785e.m6493i(context);
            if (z != C3785e.this.f9802c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C3785e.this.f9802c);
                }
                C3785e c3785e2 = C3785e.this;
                ComponentCallbacks2C3441l.C3443b c3443b = (ComponentCallbacks2C3441l.C3443b) c3785e2.f9801b;
                if (c3785e2.f9802c) {
                    synchronized (ComponentCallbacks2C3441l.this) {
                        c3443b.f9175a.m6482b();
                    }
                    return;
                }
                c3443b.getClass();
            }
        }
    }

    public C3785e(@NonNull Context context, @NonNull ComponentCallbacks2C3441l.C3443b c3443b) {
        this.f9800a = context.getApplicationContext();
        this.f9801b = c3443b;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: i */
    public static boolean m6493i(@NonNull Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C3860j.m6404b(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStart() {
        if (this.f9803d) {
            return;
        }
        Context context = this.f9800a;
        this.f9802c = m6493i(context);
        try {
            context.registerReceiver(this.f9804e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f9803d = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStop() {
        if (this.f9803d) {
            this.f9800a.unregisterReceiver(this.f9804e);
            this.f9803d = false;
        }
    }
}
