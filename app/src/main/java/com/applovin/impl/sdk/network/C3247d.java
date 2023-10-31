package com.applovin.impl.sdk.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.network.d */
/* loaded from: classes.dex */
public class C3247d extends BroadcastReceiver {

    /* renamed from: a */
    private final List<InterfaceC3248a> f8542a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.sdk.network.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3248a {
        /* renamed from: a */
        void mo7301a();

        /* renamed from: b */
        void mo7300b();
    }

    public C3247d(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: a */
    private static boolean m7304a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("networkInfo");
            if (obj instanceof NetworkInfo) {
                return ((NetworkInfo) obj).isConnected();
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m7303a(InterfaceC3248a interfaceC3248a) {
        this.f8542a.add(interfaceC3248a);
    }

    /* renamed from: b */
    public void m7302b(InterfaceC3248a interfaceC3248a) {
        this.f8542a.remove(interfaceC3248a);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE") || isInitialStickyBroadcast()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8542a);
        boolean m7304a = m7304a(intent);
        Iterator it = arrayList.iterator();
        if (m7304a) {
            while (it.hasNext()) {
                ((InterfaceC3248a) it.next()).mo7301a();
            }
            return;
        }
        while (it.hasNext()) {
            ((InterfaceC3248a) it.next()).mo7300b();
        }
    }
}
