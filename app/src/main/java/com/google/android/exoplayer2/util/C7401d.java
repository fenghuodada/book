package com.google.android.exoplayer2.util;

/* renamed from: com.google.android.exoplayer2.util.d */
/* loaded from: classes.dex */
public final class C7401d {

    /* renamed from: a */
    public boolean f13891a;

    /* renamed from: a */
    public final synchronized void m5121a() throws InterruptedException {
        while (!this.f13891a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized void m5120b() {
        this.f13891a = false;
    }

    /* renamed from: c */
    public final synchronized boolean m5119c() {
        if (this.f13891a) {
            return false;
        }
        this.f13891a = true;
        notifyAll();
        return true;
    }
}
