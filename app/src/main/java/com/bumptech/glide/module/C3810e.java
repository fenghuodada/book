package com.bumptech.glide.module;

import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: com.bumptech.glide.module.e */
/* loaded from: classes.dex */
public final class C3810e {
    /* renamed from: a */
    public static InterfaceC3808c m6479a(String str) {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        try {
            try {
                Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (newInstance instanceof InterfaceC3808c) {
                    return (InterfaceC3808c) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (IllegalAccessException e) {
                m6478b(cls4, e);
                throw null;
            } catch (InstantiationException e2) {
                m6478b(cls3, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                m6478b(cls2, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                m6478b(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: b */
    public static void m6478b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
