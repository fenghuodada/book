package com.google.gson.internal.reflect;

import com.google.gson.C8693p;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.reflect.c */
/* loaded from: classes3.dex */
public final class C8682c extends AbstractC8681b {

    /* renamed from: d */
    public static Class f16486d;

    /* renamed from: b */
    public final Object f16487b;

    /* renamed from: c */
    public final Field f16488c;

    public C8682c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f16486d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f16487b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f16488c = field;
    }

    @Override // com.google.gson.internal.reflect.AbstractC8681b
    /* renamed from: a */
    public final void mo3240a(AccessibleObject accessibleObject) {
        Field field;
        boolean z = false;
        Object obj = this.f16487b;
        if (obj != null && (field = this.f16488c) != null) {
            try {
                f16486d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, Long.valueOf(((Long) f16486d.getMethod("objectFieldOffset", Field.class).invoke(obj, field)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C8693p("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
