package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* renamed from: com.google.crypto.tink.shaded.protobuf.q */
/* loaded from: classes3.dex */
public final class C8277q {

    /* renamed from: b */
    public static volatile C8277q f16072b;

    /* renamed from: c */
    public static final C8277q f16073c = new C8277q(0);

    /* renamed from: a */
    public final Map<C8278a, AbstractC8308y.C8313e<?, ?>> f16074a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.q$a */
    /* loaded from: classes3.dex */
    public static final class C8278a {

        /* renamed from: a */
        public final Object f16075a;

        /* renamed from: b */
        public final int f16076b;

        public C8278a(Object obj, int i) {
            this.f16075a = obj;
            this.f16076b = i;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C8278a) {
                C8278a c8278a = (C8278a) obj;
                return this.f16075a == c8278a.f16075a && this.f16076b == c8278a.f16076b;
            }
            return false;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16075a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f16076b;
        }
    }

    public C8277q() {
        this.f16074a = new HashMap();
    }

    public C8277q(int i) {
        this.f16074a = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C8277q m3569a() {
        C8277q c8277q = f16072b;
        if (c8277q == null) {
            synchronized (C8277q.class) {
                c8277q = f16072b;
                if (c8277q == null) {
                    Class<?> cls = C8269p.f16062a;
                    C8277q c8277q2 = null;
                    if (cls != null) {
                        try {
                            c8277q2 = (C8277q) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (c8277q2 == null) {
                        c8277q2 = f16073c;
                    }
                    f16072b = c8277q2;
                    c8277q = c8277q2;
                }
            }
        }
        return c8277q;
    }
}
