package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.b */
/* loaded from: classes.dex */
public final class RunnableC2054b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2187l f4948a;

    /* renamed from: b */
    public final /* synthetic */ String f4949b;

    public RunnableC2054b(AbstractC2187l abstractC2187l, String str) {
        this.f4948a = abstractC2187l;
        this.f4949b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4948a.onRequestNotFilled(C2074d.m9676a(this.f4949b));
    }
}
