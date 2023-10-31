package kotlin.jvm.internal;

import kotlin.reflect.InterfaceC10885c;

/* renamed from: kotlin.jvm.internal.y */
/* loaded from: classes3.dex */
public final class C10860y {

    /* renamed from: a */
    public static final C10861z f21411a;

    /* renamed from: b */
    public static final InterfaceC10885c[] f21412b;

    static {
        C10861z c10861z = null;
        try {
            c10861z = (C10861z) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c10861z == null) {
            c10861z = new C10861z();
        }
        f21411a = c10861z;
        f21412b = new InterfaceC10885c[0];
    }

    /* renamed from: a */
    public static C10837d m422a(Class cls) {
        f21411a.getClass();
        return new C10837d(cls);
    }
}
