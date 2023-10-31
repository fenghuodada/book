package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.util.h */
/* loaded from: classes.dex */
public final class C7409h {

    /* renamed from: a */
    public final SparseBooleanArray f13916a;

    /* renamed from: com.google.android.exoplayer2.util.h$a */
    /* loaded from: classes.dex */
    public static final class C7410a {

        /* renamed from: a */
        public final SparseBooleanArray f13917a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f13918b;

        /* renamed from: a */
        public final void m5077a(int i) {
            C7394a.m5131d(!this.f13918b);
            this.f13917a.append(i, true);
        }

        /* renamed from: b */
        public final C7409h m5076b() {
            C7394a.m5131d(!this.f13918b);
            this.f13918b = true;
            return new C7409h(this.f13917a);
        }
    }

    public C7409h(SparseBooleanArray sparseBooleanArray) {
        this.f13916a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int m5079a(int i) {
        C7394a.m5132c(i, m5078b());
        return this.f13916a.keyAt(i);
    }

    /* renamed from: b */
    public final int m5078b() {
        return this.f13916a.size();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7409h) {
            C7409h c7409h = (C7409h) obj;
            if (C7408g0.f13905a < 24) {
                if (m5078b() != c7409h.m5078b()) {
                    return false;
                }
                for (int i = 0; i < m5078b(); i++) {
                    if (m5079a(i) != c7409h.m5079a(i)) {
                        return false;
                    }
                }
                return true;
            }
            return this.f13916a.equals(c7409h.f13916a);
        }
        return false;
    }

    public final int hashCode() {
        if (C7408g0.f13905a < 24) {
            int m5078b = m5078b();
            for (int i = 0; i < m5078b(); i++) {
                m5078b = (m5078b * 31) + m5079a(i);
            }
            return m5078b;
        }
        return this.f13916a.hashCode();
    }
}
