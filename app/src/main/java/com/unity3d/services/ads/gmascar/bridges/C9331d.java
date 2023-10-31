package com.unity3d.services.ads.gmascar.bridges;

import com.google.android.gms.ads.initialization.InitializationStatus;
import com.unity3d.services.ads.gmascar.listeners.InterfaceC9345a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.reflection.AbstractC9574a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.d */
/* loaded from: classes3.dex */
public class C9331d extends AbstractC9574a {

    /* renamed from: e */
    private InterfaceC9345a f18228e;

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.d$a */
    /* loaded from: classes3.dex */
    public class C9332a extends HashMap<String, Class<?>[]> {
        public C9332a() throws RuntimeException, Error {
            try {
                put("onInitializationComplete", new Class[]{InitializationStatus.class});
            } catch (ClassNotFoundException e) {
                C9549a.m2022a("Could not find class \"com.google.android.gms.ads.initialization.InitializationStatus\" %s", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.d$b */
    /* loaded from: classes3.dex */
    public class C9333b implements InvocationHandler {
        public C9333b() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (!method.getName().equals("onInitializationComplete") || C9331d.this.f18228e == null) {
                return null;
            }
            C9331d.this.f18228e.mo2436a(objArr[0]);
            return null;
        }
    }

    public C9331d() {
        super(new C9332a());
    }

    /* renamed from: a */
    public void m2451a(InterfaceC9345a interfaceC9345a) {
        this.f18228e = interfaceC9345a;
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.google.android.gms.ads.initialization.OnInitializationCompleteListener";
    }

    /* renamed from: i */
    public Object m2450i() {
        try {
            return Proxy.newProxyInstance(m1913e().getClassLoader(), new Class[]{m1913e()}, new C9333b());
        } catch (Exception unused) {
            C9549a.m2019b("ERROR: Could not create InitializeCompletionListener");
            return null;
        }
    }
}
