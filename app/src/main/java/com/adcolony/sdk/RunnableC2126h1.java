package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.h1 */
/* loaded from: classes.dex */
public final class RunnableC2126h1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2088e1 f5163a;

    /* renamed from: b */
    public final /* synthetic */ String f5164b;

    public RunnableC2126h1(C2088e1 c2088e1, String str) {
        this.f5163a = c2088e1;
        this.f5164b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2088e1 c2088e1 = this.f5163a;
        if (c2088e1.getEnableMessages()) {
            c2088e1.m9573j("NativeLayer.dispatch_messages(ADC3_update(" + this.f5164b + "), '" + c2088e1.f5084y + "');");
        }
    }
}
