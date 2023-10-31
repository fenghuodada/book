package com.unity3d.services.ads.operation;

import com.unity3d.services.core.webview.bridge.invocation.InterfaceC9637a;

/* renamed from: com.unity3d.services.ads.operation.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9348b implements InterfaceC9350d {

    /* renamed from: a */
    private static String f18250a = "webview";

    /* renamed from: b */
    private InterfaceC9637a f18251b;

    /* renamed from: c */
    private String f18252c;

    public AbstractC9348b(InterfaceC9637a interfaceC9637a, String str) throws NullPointerException {
        this.f18252c = str;
        if (str == null || str == "") {
            throw new IllegalArgumentException("invocationMethodName cannot be null");
        }
        this.f18251b = interfaceC9637a;
        if (interfaceC9637a == null) {
            throw new IllegalArgumentException("webViewBridgeInvocation cannot be null");
        }
    }

    @Override // com.unity3d.services.ads.operation.InterfaceC9350d
    /* renamed from: a */
    public void mo2434a(int i, Object... objArr) {
        this.f18251b.mo1746a(f18250a, this.f18252c, i, objArr);
    }
}
