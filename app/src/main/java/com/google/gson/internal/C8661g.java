package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.gson.internal.g */
/* loaded from: classes3.dex */
public final class C8661g implements InterfaceC8676o<Object> {

    /* renamed from: a */
    public final /* synthetic */ Constructor f16455a;

    public C8661g(Constructor constructor) {
        this.f16455a = constructor;
    }

    @Override // com.google.gson.internal.InterfaceC8676o
    /* renamed from: a */
    public final Object mo3242a() {
        Constructor constructor = this.f16455a;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke " + constructor + " with no args", e3.getTargetException());
        }
    }
}
