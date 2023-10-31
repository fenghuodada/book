package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import java.lang.reflect.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.51 */
/* loaded from: assets/audience_network.dex */
public final class C421351 {
    @SuppressLint({"CatchGeneralException"})
    public static <T> T A00(T t, Class<T> cls) {
        ClassLoader classLoader = t.getClass().getClassLoader();
        return cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, new C421250(t, classLoader)));
    }
}
