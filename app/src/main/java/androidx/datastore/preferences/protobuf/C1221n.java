package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.n */
/* loaded from: classes.dex */
public final class C1221n {

    /* renamed from: a */
    public final AbstractC1214m f3057a;

    public C1221n(AbstractC1214m abstractC1214m) {
        Charset charset = C1157b0.f2944a;
        if (abstractC1214m != null) {
            this.f3057a = abstractC1214m;
            abstractC1214m.f3047a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void m10895a(int i, boolean z) throws IOException {
        this.f3057a.mo10925A(i, z);
    }

    /* renamed from: b */
    public final void m10894b(int i, AbstractC1183i abstractC1183i) throws IOException {
        this.f3057a.mo10923C(i, abstractC1183i);
    }

    /* renamed from: c */
    public final void m10893c(double d, int i) throws IOException {
        AbstractC1214m abstractC1214m = this.f3057a;
        abstractC1214m.getClass();
        abstractC1214m.mo10919G(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void m10892d(int i, int i2) throws IOException {
        this.f3057a.mo10917I(i, i2);
    }

    /* renamed from: e */
    public final void m10891e(int i, int i2) throws IOException {
        this.f3057a.mo10921E(i, i2);
    }

    /* renamed from: f */
    public final void m10890f(int i, long j) throws IOException {
        this.f3057a.mo10919G(i, j);
    }

    /* renamed from: g */
    public final void m10889g(float f, int i) throws IOException {
        AbstractC1214m abstractC1214m = this.f3057a;
        abstractC1214m.getClass();
        abstractC1214m.mo10921E(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void m10888h(int i, InterfaceC1182h1 interfaceC1182h1, Object obj) throws IOException {
        AbstractC1214m abstractC1214m = this.f3057a;
        abstractC1214m.mo10909Q(i, 3);
        interfaceC1182h1.mo10723i((InterfaceC1240s0) obj, abstractC1214m.f3047a);
        abstractC1214m.mo10909Q(i, 4);
    }

    /* renamed from: i */
    public final void m10887i(int i, int i2) throws IOException {
        this.f3057a.mo10917I(i, i2);
    }

    /* renamed from: j */
    public final void m10886j(int i, long j) throws IOException {
        this.f3057a.mo10906T(i, j);
    }

    /* renamed from: k */
    public final void m10885k(int i, InterfaceC1182h1 interfaceC1182h1, Object obj) throws IOException {
        this.f3057a.mo10915K(i, (InterfaceC1240s0) obj, interfaceC1182h1);
    }

    /* renamed from: l */
    public final void m10884l(int i, Object obj) throws IOException {
        boolean z = obj instanceof AbstractC1183i;
        AbstractC1214m abstractC1214m = this.f3057a;
        if (z) {
            abstractC1214m.mo10912N(i, (AbstractC1183i) obj);
        } else {
            abstractC1214m.mo10913M(i, (InterfaceC1240s0) obj);
        }
    }

    /* renamed from: m */
    public final void m10883m(int i, int i2) throws IOException {
        this.f3057a.mo10921E(i, i2);
    }

    /* renamed from: n */
    public final void m10882n(int i, long j) throws IOException {
        this.f3057a.mo10919G(i, j);
    }

    /* renamed from: o */
    public final void m10881o(int i, int i2) throws IOException {
        this.f3057a.mo10908R(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void m10880p(int i, long j) throws IOException {
        this.f3057a.mo10906T(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void m10879q(int i, int i2) throws IOException {
        this.f3057a.mo10908R(i, i2);
    }

    /* renamed from: r */
    public final void m10878r(int i, long j) throws IOException {
        this.f3057a.mo10906T(i, j);
    }
}
