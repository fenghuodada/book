package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.AbstractC6512h;
import com.google.android.datatransport.runtime.AbstractC6522n;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.b */
/* loaded from: classes.dex */
public final class C6570b extends AbstractC6591k {

    /* renamed from: a */
    public final long f10401a;

    /* renamed from: b */
    public final AbstractC6522n f10402b;

    /* renamed from: c */
    public final AbstractC6512h f10403c;

    public C6570b(long j, AbstractC6522n abstractC6522n, AbstractC6512h abstractC6512h) {
        this.f10401a = j;
        if (abstractC6522n == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f10402b = abstractC6522n;
        if (abstractC6512h == null) {
            throw new NullPointerException("Null event");
        }
        this.f10403c = abstractC6512h;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6591k
    /* renamed from: a */
    public final AbstractC6512h mo6232a() {
        return this.f10403c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6591k
    /* renamed from: b */
    public final long mo6231b() {
        return this.f10401a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6591k
    /* renamed from: c */
    public final AbstractC6522n mo6230c() {
        return this.f10402b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6591k) {
            AbstractC6591k abstractC6591k = (AbstractC6591k) obj;
            return this.f10401a == abstractC6591k.mo6231b() && this.f10402b.equals(abstractC6591k.mo6230c()) && this.f10403c.equals(abstractC6591k.mo6232a());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10401a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f10402b.hashCode()) * 1000003) ^ this.f10403c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f10401a + ", transportContext=" + this.f10402b + ", event=" + this.f10403c + "}";
    }
}
