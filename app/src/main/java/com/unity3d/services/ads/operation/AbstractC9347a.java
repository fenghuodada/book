package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.InterfaceC9596c;
import com.unity3d.services.core.webview.bridge.AbstractC9643k;
import com.unity3d.services.core.webview.bridge.InterfaceC9631d;
import com.unity3d.services.core.webview.bridge.invocation.C9641e;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.operation.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9347a<T extends InterfaceC9631d, T2> extends AbstractC9643k<T> implements InterfaceC9349c<T, T2> {

    /* renamed from: b */
    protected InterfaceC9596c f18248b;

    /* renamed from: c */
    protected ExecutorService f18249c = C9641e.m1743b().m1744a();

    public AbstractC9347a(InterfaceC9596c interfaceC9596c) {
        this.f18248b = interfaceC9596c;
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9349c
    /* renamed from: a */
    public InterfaceC9596c mo2412a() {
        return this.f18248b;
    }
}
