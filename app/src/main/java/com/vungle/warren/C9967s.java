package com.vungle.warren;

import androidx.annotation.Nullable;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.model.C9874j;

/* renamed from: com.vungle.warren.s */
/* loaded from: classes3.dex */
public final class C9967s {
    @SerializedName("enabled")

    /* renamed from: a */
    private final boolean f20012a;
    @SerializedName("clear_shared_cache_timestamp")

    /* renamed from: b */
    private final long f20013b;

    public C9967s(long j, boolean z) {
        this.f20012a = z;
        this.f20013b = j;
    }

    @Nullable
    /* renamed from: a */
    public static C9967s m1369a(C8695r c8695r) {
        boolean z;
        if (!C9874j.m1441c(c8695r, "clever_cache")) {
            return null;
        }
        C8695r m3211z = c8695r.m3211z("clever_cache");
        long j = -1;
        try {
            if (m3211z.m3219A("clear_shared_cache_timestamp")) {
                j = m3211z.m3213w("clear_shared_cache_timestamp").mo3203o();
            }
        } catch (NumberFormatException unused) {
        }
        if (m3211z.m3219A("enabled")) {
            AbstractC8692o m3213w = m3211z.m3213w("enabled");
            m3213w.getClass();
            if ((m3213w instanceof C8700u) && "false".equalsIgnoreCase(m3213w.mo3202p())) {
                z = false;
                return new C9967s(j, z);
            }
        }
        z = true;
        return new C9967s(j, z);
    }

    /* renamed from: b */
    public final long m1368b() {
        return this.f20013b;
    }

    /* renamed from: c */
    public final boolean m1367c() {
        return this.f20012a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9967s.class != obj.getClass()) {
            return false;
        }
        C9967s c9967s = (C9967s) obj;
        return this.f20012a == c9967s.f20012a && this.f20013b == c9967s.f20013b;
    }

    public final int hashCode() {
        long j = this.f20013b;
        return ((this.f20012a ? 1 : 0) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
