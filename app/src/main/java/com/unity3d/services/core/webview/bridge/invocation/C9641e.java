package com.unity3d.services.core.webview.bridge.invocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.e */
/* loaded from: classes3.dex */
public class C9641e {

    /* renamed from: a */
    private static C9641e f19154a;

    /* renamed from: b */
    private ExecutorService f19155b = Executors.newSingleThreadExecutor();

    private C9641e() {
    }

    /* renamed from: b */
    public static C9641e m1743b() {
        if (f19154a == null) {
            f19154a = new C9641e();
        }
        return f19154a;
    }

    /* renamed from: a */
    public ExecutorService m1744a() {
        return this.f19155b;
    }
}
