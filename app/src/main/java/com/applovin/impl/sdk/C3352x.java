package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.x */
/* loaded from: classes.dex */
public class C3352x {

    /* renamed from: a */
    private final Queue<AppLovinAdImpl> f8832a = new LinkedList();

    /* renamed from: b */
    private final Object f8833b = new Object();

    /* renamed from: a */
    public int m6841a() {
        int size;
        synchronized (this.f8833b) {
            size = this.f8832a.size();
        }
        return size;
    }

    /* renamed from: a */
    public void m6840a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f8833b) {
            if (m6841a() <= 25) {
                this.f8832a.offer(appLovinAdImpl);
            } else if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdk", "Maximum queue capacity reached - discarding ad...");
            }
        }
    }

    /* renamed from: b */
    public boolean m6839b() {
        boolean z;
        synchronized (this.f8833b) {
            z = m6841a() == 0;
        }
        return z;
    }

    @Nullable
    /* renamed from: c */
    public AppLovinAdImpl m6838c() {
        AppLovinAdImpl poll;
        synchronized (this.f8833b) {
            poll = !m6839b() ? this.f8832a.poll() : null;
        }
        return poll;
    }

    @Nullable
    /* renamed from: d */
    public AppLovinAdImpl m6837d() {
        AppLovinAdImpl peek;
        synchronized (this.f8833b) {
            peek = this.f8832a.peek();
        }
        return peek;
    }
}
