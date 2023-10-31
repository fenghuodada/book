package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* loaded from: classes3.dex */
public final class C8258m {

    /* renamed from: a */
    public final AbstractC8253l f16048a;

    public C8258m(AbstractC8253l abstractC8253l) {
        Charset charset = C8196a0.f15949a;
        if (abstractC8253l != null) {
            this.f16048a = abstractC8253l;
            abstractC8253l.f16042a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void m3667a(int i, boolean z) throws IOException {
        this.f16048a.mo3671z(i, z);
    }

    /* renamed from: b */
    public final void m3666b(int i, AbstractC8228i abstractC8228i) throws IOException {
        this.f16048a.mo3694A(i, abstractC8228i);
    }

    /* renamed from: c */
    public final void m3665c(double d, int i) throws IOException {
        AbstractC8253l abstractC8253l = this.f16048a;
        abstractC8253l.getClass();
        abstractC8253l.mo3691D(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void m3664d(int i, int i2) throws IOException {
        this.f16048a.mo3689F(i, i2);
    }

    /* renamed from: e */
    public final void m3663e(int i, int i2) throws IOException {
        this.f16048a.mo3693B(i, i2);
    }

    /* renamed from: f */
    public final void m3662f(int i, long j) throws IOException {
        this.f16048a.mo3691D(i, j);
    }

    /* renamed from: g */
    public final void m3661g(float f, int i) throws IOException {
        AbstractC8253l abstractC8253l = this.f16048a;
        abstractC8253l.getClass();
        abstractC8253l.mo3693B(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void m3660h(int i, InterfaceC8219f1 interfaceC8219f1, Object obj) throws IOException {
        AbstractC8253l abstractC8253l = this.f16048a;
        abstractC8253l.mo3683L(i, 3);
        interfaceC8219f1.mo3487h((InterfaceC8287r0) obj, abstractC8253l.f16042a);
        abstractC8253l.mo3683L(i, 4);
    }

    /* renamed from: i */
    public final void m3659i(int i, int i2) throws IOException {
        this.f16048a.mo3689F(i, i2);
    }

    /* renamed from: j */
    public final void m3658j(int i, long j) throws IOException {
        this.f16048a.mo3680O(i, j);
    }

    /* renamed from: k */
    public final void m3657k(int i, InterfaceC8219f1 interfaceC8219f1, Object obj) throws IOException {
        this.f16048a.mo3687H(i, (InterfaceC8287r0) obj, interfaceC8219f1);
    }

    /* renamed from: l */
    public final void m3656l(int i, Object obj) throws IOException {
        boolean z = obj instanceof AbstractC8228i;
        AbstractC8253l abstractC8253l = this.f16048a;
        if (z) {
            abstractC8253l.mo3685J(i, (AbstractC8228i) obj);
        } else {
            abstractC8253l.mo3686I(i, (InterfaceC8287r0) obj);
        }
    }

    /* renamed from: m */
    public final void m3655m(int i, int i2) throws IOException {
        this.f16048a.mo3693B(i, i2);
    }

    /* renamed from: n */
    public final void m3654n(int i, long j) throws IOException {
        this.f16048a.mo3691D(i, j);
    }

    /* renamed from: o */
    public final void m3653o(int i, int i2) throws IOException {
        this.f16048a.mo3682M(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void m3652p(int i, long j) throws IOException {
        this.f16048a.mo3680O(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void m3651q(int i, int i2) throws IOException {
        this.f16048a.mo3682M(i, i2);
    }

    /* renamed from: r */
    public final void m3650r(int i, long j) throws IOException {
        this.f16048a.mo3680O(i, j);
    }
}
