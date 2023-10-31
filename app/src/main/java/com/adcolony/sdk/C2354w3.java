package com.adcolony.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.datastore.preferences.protobuf.C1169e;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.adcolony.sdk.w3 */
/* loaded from: classes.dex */
public final class C2354w3 {

    /* renamed from: a */
    public ScheduledExecutorService f5667a;

    /* renamed from: b */
    public ScheduledFuture<?> f5668b;

    /* renamed from: c */
    public String f5669c;

    /* renamed from: b */
    public static String m9463b() {
        NetworkInfo activeNetworkInfo;
        Context context = C2201m0.f5363a;
        if (context != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager == null) {
                    activeNetworkInfo = null;
                } else {
                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                }
                if (activeNetworkInfo != null) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        return "wifi";
                    }
                    if (type == 0 || type >= 2) {
                        return "cell";
                    }
                }
            } catch (SecurityException e) {
                C1169e.m11129c("SecurityException - please ensure you added the ACCESS_NETWORK_STATE permission: " + e.toString(), 0, 0, false);
            } catch (Exception e2) {
                C1169e.m11129c("Exception occurred when retrieving activeNetworkInfo in ADCNetwork.getConnectivityStatus(): " + e2.toString(), 0, 0, true);
            }
        }
        return SchedulerSupport.NONE;
    }

    /* renamed from: a */
    public final void m9464a() {
        String m9463b = m9463b();
        if (!m9463b.equals(this.f5669c)) {
            this.f5669c = m9463b;
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, "network_type", m9463b);
            new C2100e2(1, c2367y1, "Network.on_status_change").m9640b();
        }
    }
}
