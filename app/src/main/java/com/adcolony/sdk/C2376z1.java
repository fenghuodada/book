package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.z1 */
/* loaded from: classes.dex */
public final class C2376z1 {

    /* renamed from: a */
    public boolean f5701a;

    /* renamed from: a */
    public final synchronized void m9428a(long j) {
        if (!this.f5701a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m9427b(boolean z) {
        this.f5701a = z;
        if (z) {
            notifyAll();
        }
    }
}
