package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.e */
/* loaded from: classes3.dex */
public final class C8657e implements InterfaceC8676o<Object> {

    /* renamed from: a */
    public final AbstractC8685u f16448a;

    /* renamed from: b */
    public final /* synthetic */ Class f16449b;

    /* renamed from: c */
    public final /* synthetic */ Type f16450c;

    public C8657e(Class cls, Type type) {
        AbstractC8685u c8684t;
        this.f16449b = cls;
        this.f16450c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            c8684t = new C8678q(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    c8684t = new C8679r(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    c8684t = new C8683s(declaredMethod3);
                }
            } catch (Exception unused3) {
                c8684t = new C8684t();
            }
        }
        this.f16448a = c8684t;
    }

    @Override // com.google.gson.internal.InterfaceC8676o
    /* renamed from: a */
    public final Object mo3242a() {
        try {
            return this.f16448a.mo3238b(this.f16449b);
        } catch (Exception e) {
            throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16450c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
        }
    }
}
