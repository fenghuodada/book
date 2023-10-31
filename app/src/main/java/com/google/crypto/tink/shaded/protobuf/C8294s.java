package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s */
/* loaded from: classes3.dex */
public final class C8294s extends AbstractC8286r<AbstractC8308y.C8312d> {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: a */
    public final void mo3555a(Map.Entry entry) {
        ((AbstractC8308y.C8312d) entry.getKey()).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: b */
    public final AbstractC8308y.C8313e mo3554b(C8277q c8277q, InterfaceC8287r0 interfaceC8287r0, int i) {
        c8277q.getClass();
        return c8277q.f16074a.get(new C8277q.C8278a(interfaceC8287r0, i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: c */
    public final C8299u<AbstractC8308y.C8312d> mo3553c(Object obj) {
        return ((AbstractC8308y.AbstractC8311c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: d */
    public final C8299u<AbstractC8308y.C8312d> mo3552d(Object obj) {
        AbstractC8308y.AbstractC8311c abstractC8311c = (AbstractC8308y.AbstractC8311c) obj;
        C8299u<AbstractC8308y.C8312d> c8299u = abstractC8311c.extensions;
        if (c8299u.f16096b) {
            abstractC8311c.extensions = c8299u.clone();
        }
        return abstractC8311c.extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: e */
    public final boolean mo3551e(InterfaceC8287r0 interfaceC8287r0) {
        return interfaceC8287r0 instanceof AbstractC8308y.AbstractC8311c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: f */
    public final void mo3550f(Object obj) {
        C8299u<AbstractC8308y.C8312d> c8299u = ((AbstractC8308y.AbstractC8311c) obj).extensions;
        if (!c8299u.f16096b) {
            c8299u.f16095a.mo3800g();
            c8299u.f16096b = true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: g */
    public final Object mo3549g(Object obj) throws IOException {
        AbstractC8308y.C8313e c8313e = (AbstractC8308y.C8313e) obj;
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: h */
    public final void mo3548h(Object obj) throws IOException {
        AbstractC8308y.C8313e c8313e = (AbstractC8308y.C8313e) obj;
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: i */
    public final void mo3547i(Object obj) throws IOException {
        AbstractC8308y.C8313e c8313e = (AbstractC8308y.C8313e) obj;
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8286r
    /* renamed from: j */
    public final void mo3546j(Map.Entry entry) throws IOException {
        ((AbstractC8308y.C8312d) entry.getKey()).getClass();
        throw null;
    }
}
