package com.unity3d.services.core.connectivity;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.unity3d.services.core.properties.C9568a;

@TargetApi(21)
/* renamed from: com.unity3d.services.core.connectivity.d */
/* loaded from: classes3.dex */
public class C9490d extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    private static C9490d f18787a;

    /* renamed from: a */
    public static synchronized void m2180a() {
        synchronized (C9490d.class) {
            if (f18787a == null) {
                f18787a = new C9490d();
                ((ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), f18787a);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m2179b() {
        synchronized (C9490d.class) {
            if (f18787a != null) {
                ((ConnectivityManager) C9568a.m1959e().getSystemService("connectivity")).unregisterNetworkCallback(f18787a);
                f18787a = null;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        C9488c.m2192a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C9488c.m2188b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        C9488c.m2188b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        C9488c.m2186c();
    }
}
