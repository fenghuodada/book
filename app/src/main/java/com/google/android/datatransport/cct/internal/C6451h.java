package com.google.android.datatransport.cct.internal;

import android.support.p000v4.media.session.C0017a;

/* renamed from: com.google.android.datatransport.cct.internal.h */
/* loaded from: classes.dex */
public final class C6451h extends AbstractC6459n {

    /* renamed from: a */
    public final long f10153a;

    public C6451h(long j) {
        this.f10153a = j;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6459n
    /* renamed from: b */
    public final long mo6319b() {
        return this.f10153a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC6459n) && this.f10153a == ((AbstractC6459n) obj).mo6319b();
    }

    public final int hashCode() {
        long j = this.f10153a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return C0017a.m13071a(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.f10153a, "}");
    }
}
