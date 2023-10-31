package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.webview.bridge.f */
/* loaded from: classes3.dex */
public class C9633f {

    /* renamed from: a */
    private static AtomicInteger f19127a = new AtomicInteger(0);

    /* renamed from: b */
    private Method f19128b;

    /* renamed from: c */
    private String f19129c;

    public C9633f(Method method) {
        this.f19128b = method;
        this.f19129c = this.f19128b.getName().toUpperCase(Locale.US) + "_" + f19127a.getAndIncrement();
    }

    /* renamed from: a */
    public String m1758a() {
        return this.f19129c;
    }

    /* renamed from: a */
    public void m1757a(String str, Object... objArr) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
        Object[] array;
        try {
            EnumC9628a valueOf = EnumC9628a.valueOf(str);
            if (objArr == null) {
                array = new Object[]{valueOf};
            } else {
                ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
                arrayList.add(0, valueOf);
                array = arrayList.toArray();
            }
            this.f19128b.invoke(null, array);
            C9620a.m1774c().m1778b(this);
        } catch (Exception e) {
            C9549a.m2017c("Illegal status");
            C9620a.m1774c().m1778b(this);
            throw e;
        }
    }
}
