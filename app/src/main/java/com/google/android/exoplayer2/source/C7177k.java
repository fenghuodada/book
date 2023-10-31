package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6966f1;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.k */
/* loaded from: classes.dex */
public final class C7177k implements InterfaceC7185n, InterfaceC7185n.InterfaceC7186a {

    /* renamed from: a */
    public final InterfaceC7188p.C7189a f12897a;

    /* renamed from: b */
    public final long f12898b;

    /* renamed from: c */
    public final C7367l f12899c;

    /* renamed from: d */
    public InterfaceC7188p f12900d;

    /* renamed from: e */
    public InterfaceC7185n f12901e;
    @Nullable

    /* renamed from: f */
    public InterfaceC7185n.InterfaceC7186a f12902f;

    /* renamed from: g */
    public long f12903g = -9223372036854775807L;

    public C7177k(InterfaceC7188p.C7189a c7189a, C7367l c7367l, long j) {
        this.f12897a = c7189a;
        this.f12899c = c7367l;
        this.f12898b = j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7164f0.InterfaceC7165a
    /* renamed from: a */
    public final void mo5420a(InterfaceC7185n interfaceC7185n) {
        InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12902f;
        int i = C7408g0.f13905a;
        interfaceC7186a.mo5420a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n.InterfaceC7186a
    /* renamed from: b */
    public final void mo5395b(InterfaceC7185n interfaceC7185n) {
        InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12902f;
        int i = C7408g0.f13905a;
        interfaceC7186a.mo5395b(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: c */
    public final long mo5408c() {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5408c();
    }

    /* renamed from: d */
    public final long m5419d(long j) {
        long j2 = this.f12903g;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: e */
    public final void mo5407e() throws IOException {
        try {
            InterfaceC7185n interfaceC7185n = this.f12901e;
            if (interfaceC7185n != null) {
                interfaceC7185n.mo5407e();
                return;
            }
            InterfaceC7188p interfaceC7188p = this.f12900d;
            if (interfaceC7188p != null) {
                interfaceC7188p.mo5386h();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: f */
    public final long mo5406f(long j) {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5406f(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: g */
    public final boolean mo5405g(long j) {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        return interfaceC7185n != null && interfaceC7185n.mo5405g(j);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: h */
    public final boolean mo5404h() {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        return interfaceC7185n != null && interfaceC7185n.mo5404h();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: i */
    public final long mo5403i(long j, C6966f1 c6966f1) {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5403i(j, c6966f1);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: k */
    public final long mo5402k() {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5402k();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: l */
    public final void mo5401l(InterfaceC7185n.InterfaceC7186a interfaceC7186a, long j) {
        this.f12902f = interfaceC7186a;
        InterfaceC7185n interfaceC7185n = this.f12901e;
        if (interfaceC7185n != null) {
            long j2 = this.f12903g;
            if (j2 == -9223372036854775807L) {
                j2 = this.f12898b;
            }
            interfaceC7185n.mo5401l(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: m */
    public final long mo5400m(InterfaceC7296g[] interfaceC7296gArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f12903g;
        if (j3 == -9223372036854775807L || j != this.f12898b) {
            j2 = j;
        } else {
            this.f12903g = -9223372036854775807L;
            j2 = j3;
        }
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5400m(interfaceC7296gArr, zArr, sampleStreamArr, zArr2, j2);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: n */
    public final C7178k0 mo5399n() {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5399n();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: q */
    public final long mo5398q() {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        return interfaceC7185n.mo5398q();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: r */
    public final void mo5397r(long j, boolean z) {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        interfaceC7185n.mo5397r(j, z);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: s */
    public final void mo5396s(long j) {
        InterfaceC7185n interfaceC7185n = this.f12901e;
        int i = C7408g0.f13905a;
        interfaceC7185n.mo5396s(j);
    }
}
