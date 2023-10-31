package com.google.android.datatransport.runtime.backends;

import android.support.p000v4.media.session.C0017a;
import androidx.constraintlayout.core.C0511i;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes.dex */
public final class C6480b extends AbstractC6487i {

    /* renamed from: a */
    public final int f10204a;

    /* renamed from: b */
    public final long f10205b;

    public C6480b(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f10204a = i;
        this.f10205b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6487i
    /* renamed from: a */
    public final long mo6310a() {
        return this.f10205b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6487i
    /* renamed from: b */
    public final int mo6309b() {
        return this.f10204a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6487i) {
            AbstractC6487i abstractC6487i = (AbstractC6487i) obj;
            return C0511i.m12338a(this.f10204a, abstractC6487i.mo6309b()) && this.f10205b == abstractC6487i.mo6310a();
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10205b;
        return ((C0511i.m12337b(this.f10204a) ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(C6486h.m6311a(this.f10204a));
        sb.append(", nextRequestWaitMillis=");
        return C0017a.m13071a(sb, this.f10205b, "}");
    }
}
