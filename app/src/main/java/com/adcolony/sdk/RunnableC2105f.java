package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.f */
/* loaded from: classes.dex */
public final class RunnableC2105f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC2317u f5103a;

    /* renamed from: b */
    public final /* synthetic */ String f5104b;

    public RunnableC2105f(AbstractC2317u abstractC2317u, String str) {
        this.f5103a = abstractC2317u;
        this.f5104b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5103a.onRequestNotFilled(C2074d.m9676a(this.f5104b));
    }
}
