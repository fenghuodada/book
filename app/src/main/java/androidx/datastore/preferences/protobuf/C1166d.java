package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d */
/* loaded from: classes.dex */
public final class C1166d {

    /* renamed from: a */
    public static final Class<?> f2948a;

    /* renamed from: b */
    public static final boolean f2949b;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2948a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f2949b = z;
    }

    /* renamed from: a */
    public static boolean m11133a() {
        return (f2948a == null || f2949b) ? false : true;
    }
}
