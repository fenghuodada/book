package com.unity3d.services.core.webview.bridge.invocation;

import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.c */
/* loaded from: classes3.dex */
public class C9639c implements InterfaceC9637a {

    /* renamed from: a */
    private static InterfaceC9638b f19142a;

    /* renamed from: b */
    private InterfaceC9629b f19143b;

    /* renamed from: c */
    private ExecutorService f19144c;

    public C9639c(ExecutorService executorService, InterfaceC9629b interfaceC9629b, InterfaceC9638b interfaceC9638b) {
        this.f19144c = executorService;
        f19142a = interfaceC9638b;
        if (interfaceC9629b == null) {
            throw new IllegalArgumentException("webViewBridgeInvoker cannot be null");
        }
        this.f19143b = interfaceC9629b;
    }

    @Override // com.unity3d.services.core.webview.bridge.invocation.InterfaceC9637a
    /* renamed from: a */
    public synchronized void mo1746a(String str, String str2, int i, Object... objArr) {
        this.f19144c.submit(new RunnableC9640d(f19142a, this.f19143b, str, str2, i, objArr));
    }
}
