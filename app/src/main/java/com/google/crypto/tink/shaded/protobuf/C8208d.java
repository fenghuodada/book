package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d */
/* loaded from: classes3.dex */
public final class C8208d {

    /* renamed from: a */
    public static final Class<?> f15971a;

    /* renamed from: b */
    public static final boolean f15972b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f15971a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f15972b = z;
    }

    /* renamed from: a */
    public static boolean m3919a() {
        return (f15971a == null || f15972b) ? false : true;
    }
}
