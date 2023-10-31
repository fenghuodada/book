package com.unity3d.services.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.unity3d.services.core.properties.C9568a;

/* renamed from: com.unity3d.services.core.connectivity.a */
/* loaded from: classes3.dex */
public class C9486a extends BroadcastReceiver {

    /* renamed from: a */
    private static C9486a f18775a;

    /* renamed from: a */
    public static void m2194a() {
        if (f18775a == null) {
            f18775a = new C9486a();
            C9568a.m1959e().registerReceiver(f18775a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: b */
    public static void m2193b() {
        if (f18775a != null) {
            C9568a.m1959e().unregisterReceiver(f18775a);
            f18775a = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            C9488c.m2186c();
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        C9488c.m2192a();
    }
}
