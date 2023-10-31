package com.unity3d.services.core.webview.bridge.invocation;

import android.os.ConditionVariable;
import com.unity3d.services.core.webview.bridge.EnumC9628a;
import com.unity3d.services.core.webview.bridge.InterfaceC9629b;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.services.core.webview.bridge.invocation.d */
/* loaded from: classes3.dex */
public class RunnableC9640d implements Runnable {

    /* renamed from: a */
    private static ConditionVariable f19145a;

    /* renamed from: b */
    private static EnumC9628a f19146b;

    /* renamed from: c */
    private InterfaceC9638b f19147c;

    /* renamed from: d */
    private InterfaceC9629b f19148d;

    /* renamed from: e */
    private Method f19149e;

    /* renamed from: f */
    private String f19150f;

    /* renamed from: g */
    private String f19151g;

    /* renamed from: h */
    private int f19152h;

    /* renamed from: i */
    private Object[] f19153i;

    public RunnableC9640d(InterfaceC9638b interfaceC9638b, InterfaceC9629b interfaceC9629b, String str, String str2, int i, Object... objArr) {
        try {
            this.f19149e = RunnableC9640d.class.getMethod("a", EnumC9628a.class);
            this.f19147c = interfaceC9638b;
            this.f19148d = interfaceC9629b;
            this.f19150f = str;
            this.f19151g = str2;
            this.f19152h = i;
            this.f19153i = objArr;
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("WebViewBridgeInvocation callback method cannot be found", e);
        }
    }

    /* renamed from: a */
    public static synchronized void m1745a(EnumC9628a enumC9628a) {
        synchronized (RunnableC9640d.class) {
            f19146b = enumC9628a;
            ConditionVariable conditionVariable = f19145a;
            if (conditionVariable != null) {
                conditionVariable.open();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        f19146b = null;
        f19145a = new ConditionVariable();
        boolean mo1742a = this.f19148d.mo1742a(this.f19150f, this.f19151g, this.f19149e, this.f19153i);
        InterfaceC9638b interfaceC9638b = this.f19147c;
        if (interfaceC9638b == null) {
            return;
        }
        if (!mo1742a) {
            interfaceC9638b.mo1748a("WebViewBridgeInvocationRunnable:run: invokeMethod failure", null);
        } else if (!f19145a.block(this.f19152h)) {
            this.f19147c.mo1747b();
        } else if (f19146b == EnumC9628a.OK) {
            this.f19147c.mo1749a();
        } else {
            this.f19147c.mo1748a("WebViewBridgeInvocationRunnable:run CallbackStatus.Error", f19146b);
        }
    }
}
