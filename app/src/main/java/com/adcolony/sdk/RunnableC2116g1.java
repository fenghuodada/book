package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.g1 */
/* loaded from: classes.dex */
public final class RunnableC2116g1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2088e1 f5123a;

    public RunnableC2116g1(C2088e1 c2088e1) {
        this.f5123a = c2088e1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5123a.removeJavascriptInterface("NativeLayer");
    }
}
