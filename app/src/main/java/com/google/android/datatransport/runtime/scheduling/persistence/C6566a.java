package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.constraintlayout.core.widgets.C0539e;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a */
/* loaded from: classes.dex */
public final class C6566a extends AbstractC6576e {

    /* renamed from: b */
    public final long f10388b;

    /* renamed from: c */
    public final int f10389c;

    /* renamed from: d */
    public final int f10390d;

    /* renamed from: e */
    public final long f10391e;

    /* renamed from: f */
    public final int f10392f;

    public C6566a(long j, int i, int i2, long j2, int i3) {
        this.f10388b = j;
        this.f10389c = i;
        this.f10390d = i2;
        this.f10391e = j2;
        this.f10392f = i3;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6576e
    /* renamed from: a */
    public final int mo6239a() {
        return this.f10390d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6576e
    /* renamed from: b */
    public final long mo6238b() {
        return this.f10391e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6576e
    /* renamed from: c */
    public final int mo6237c() {
        return this.f10389c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6576e
    /* renamed from: d */
    public final int mo6236d() {
        return this.f10392f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6576e
    /* renamed from: e */
    public final long mo6235e() {
        return this.f10388b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6576e) {
            AbstractC6576e abstractC6576e = (AbstractC6576e) obj;
            return this.f10388b == abstractC6576e.mo6235e() && this.f10389c == abstractC6576e.mo6237c() && this.f10390d == abstractC6576e.mo6239a() && this.f10391e == abstractC6576e.mo6238b() && this.f10392f == abstractC6576e.mo6236d();
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10388b;
        long j2 = this.f10391e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f10389c) * 1000003) ^ this.f10390d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f10392f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f10388b);
        sb.append(", loadBatchSize=");
        sb.append(this.f10389c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f10390d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f10391e);
        sb.append(", maxBlobByteSizePerRow=");
        return C0539e.m12264b(sb, this.f10392f, "}");
    }
}
