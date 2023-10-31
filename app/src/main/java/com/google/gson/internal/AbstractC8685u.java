package com.google.gson.internal;

import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.u */
/* loaded from: classes3.dex */
public abstract class AbstractC8685u {
    /* renamed from: a */
    public static void m3239a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: ".concat(cls.getName()));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: ".concat(cls.getName()));
        }
    }

    /* renamed from: b */
    public abstract <T> T mo3238b(Class<T> cls) throws Exception;
}
