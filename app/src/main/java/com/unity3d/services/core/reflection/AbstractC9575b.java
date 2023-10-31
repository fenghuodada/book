package com.unity3d.services.core.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.unity3d.services.core.reflection.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9575b implements InvocationHandler {
    /* renamed from: a */
    public abstract Class<?> mo1668a() throws ClassNotFoundException;

    /* renamed from: b */
    public Object m1910b() throws ClassNotFoundException {
        return Proxy.newProxyInstance(mo1668a().getClassLoader(), new Class[]{mo1668a()}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return method.invoke(this, objArr);
    }
}
