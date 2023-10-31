package com.google.android.datatransport.runtime;

import com.google.android.datatransport.AbstractC6430c;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.InterfaceC6465e;

/* renamed from: com.google.android.datatransport.runtime.c */
/* loaded from: classes.dex */
public final class C6495c extends AbstractC6521m {

    /* renamed from: a */
    public final AbstractC6522n f10223a;

    /* renamed from: b */
    public final String f10224b;

    /* renamed from: c */
    public final AbstractC6430c<?> f10225c;

    /* renamed from: d */
    public final InterfaceC6465e<?, byte[]> f10226d;

    /* renamed from: e */
    public final C6429b f10227e;

    public C6495c(AbstractC6522n abstractC6522n, String str, AbstractC6430c abstractC6430c, InterfaceC6465e interfaceC6465e, C6429b c6429b) {
        this.f10223a = abstractC6522n;
        this.f10224b = str;
        this.f10225c = abstractC6430c;
        this.f10226d = interfaceC6465e;
        this.f10227e = c6429b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6521m
    /* renamed from: a */
    public final C6429b mo6283a() {
        return this.f10227e;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6521m
    /* renamed from: b */
    public final AbstractC6430c<?> mo6282b() {
        return this.f10225c;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6521m
    /* renamed from: c */
    public final InterfaceC6465e<?, byte[]> mo6281c() {
        return this.f10226d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6521m
    /* renamed from: d */
    public final AbstractC6522n mo6280d() {
        return this.f10223a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC6521m
    /* renamed from: e */
    public final String mo6279e() {
        return this.f10224b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6521m) {
            AbstractC6521m abstractC6521m = (AbstractC6521m) obj;
            return this.f10223a.equals(abstractC6521m.mo6280d()) && this.f10224b.equals(abstractC6521m.mo6279e()) && this.f10225c.equals(abstractC6521m.mo6282b()) && this.f10226d.equals(abstractC6521m.mo6281c()) && this.f10227e.equals(abstractC6521m.mo6283a());
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f10223a.hashCode() ^ 1000003) * 1000003) ^ this.f10224b.hashCode()) * 1000003) ^ this.f10225c.hashCode()) * 1000003) ^ this.f10226d.hashCode()) * 1000003) ^ this.f10227e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f10223a + ", transportName=" + this.f10224b + ", event=" + this.f10225c + ", transformer=" + this.f10226d + ", encoding=" + this.f10227e + "}";
    }
}
