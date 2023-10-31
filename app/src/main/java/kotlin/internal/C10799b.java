package kotlin.internal;

import kotlin.internal.jdk7.C10801a;
import kotlin.internal.jdk8.C10803a;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.internal.b */
/* loaded from: classes3.dex */
public final class C10799b {
    @JvmField
    @NotNull

    /* renamed from: a */
    public static final C10797a f21392a;

    static {
        C10797a c10797a;
        Object newInstance;
        try {
            newInstance = C10803a.class.newInstance();
            C10843j.m431e(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
        } catch (ClassNotFoundException unused) {
            Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C10843j.m431e(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c10797a = (C10797a) newInstance2;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                    ClassLoader classLoader2 = C10797a.class.getClassLoader();
                    if (C10843j.m435a(classLoader, classLoader2)) {
                        throw e;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C10843j.m431e(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c10797a = (C10797a) newInstance3;
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = C10797a.class.getClassLoader();
                    if (C10843j.m435a(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
        }
        try {
            try {
                c10797a = (C10797a) newInstance;
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = C10801a.class.newInstance();
                C10843j.m431e(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c10797a = (C10797a) newInstance4;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C10797a.class.getClassLoader();
                        if (C10843j.m435a(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                } catch (ClassNotFoundException unused4) {
                    c10797a = new C10797a();
                }
            }
            f21392a = c10797a;
        } catch (ClassCastException e4) {
            ClassLoader classLoader7 = newInstance.getClass().getClassLoader();
            ClassLoader classLoader8 = C10797a.class.getClassLoader();
            if (C10843j.m435a(classLoader7, classLoader8)) {
                throw e4;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
        }
    }
}
