package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1273z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* renamed from: androidx.datastore.preferences.protobuf.r */
/* loaded from: classes.dex */
public final class C1233r {

    /* renamed from: b */
    public static volatile C1233r f3069b;

    /* renamed from: c */
    public static final C1233r f3070c;

    /* renamed from: a */
    public final Map<C1234a, AbstractC1273z.C1278e<?, ?>> f3071a;

    /* renamed from: androidx.datastore.preferences.protobuf.r$a */
    /* loaded from: classes.dex */
    public static final class C1234a {

        /* renamed from: a */
        public final Object f3072a;

        /* renamed from: b */
        public final int f3073b;

        public C1234a(Object obj, int i) {
            this.f3072a = obj;
            this.f3073b = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C1234a) {
                C1234a c1234a = (C1234a) obj;
                return this.f3072a == c1234a.f3072a && this.f3073b == c1234a.f3073b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f3072a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f3073b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f3070c = new C1233r(0);
    }

    public C1233r() {
        this.f3071a = new HashMap();
    }

    public C1233r(int i) {
        this.f3071a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C1233r m10842a() {
        C1233r c1233r = f3069b;
        if (c1233r == null) {
            synchronized (C1233r.class) {
                c1233r = f3069b;
                if (c1233r == null) {
                    Class<?> cls = C1230q.f3068a;
                    if (cls != null) {
                        try {
                            c1233r = (C1233r) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f3069b = c1233r;
                    }
                    c1233r = f3070c;
                    f3069b = c1233r;
                }
            }
        }
        return c1233r;
    }
}
