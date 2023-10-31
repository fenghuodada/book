package com.vungle.warren.utility;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.RequiresApi;

/* renamed from: com.vungle.warren.utility.n */
/* loaded from: classes3.dex */
public final class C10093n extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C10095p f20318a;

    public C10093n(C10095p c10095p) {
        this.f20318a = c10095p;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    @RequiresApi(api = 21)
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        this.f20318a.m1263a();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    @RequiresApi(api = 21)
    public final void onLost(Network network) {
        super.onLost(network);
        this.f20318a.m1263a();
    }
}
