package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.t */
/* loaded from: classes.dex */
public final class RunnableC2291t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2317u f5583a;

    /* renamed from: b */
    public final /* synthetic */ C2249q f5584b;

    public RunnableC2291t(C2249q c2249q, AbstractC2317u abstractC2317u) {
        this.f5584b = c2249q;
        this.f5583a = abstractC2317u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5583a.onRequestNotFilled(C2074d.m9676a(this.f5584b.f5484i));
    }
}
