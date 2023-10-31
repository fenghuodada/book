package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC6699h;
import com.google.android.exoplayer2.util.C7408g0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.m0 */
/* loaded from: classes.dex */
public final class C6712m0 extends AbstractC6725w {

    /* renamed from: i */
    public int f10797i;

    /* renamed from: j */
    public int f10798j;

    /* renamed from: k */
    public boolean f10799k;

    /* renamed from: l */
    public int f10800l;

    /* renamed from: m */
    public byte[] f10801m = C7408g0.f13910f;

    /* renamed from: n */
    public int f10802n;

    /* renamed from: o */
    public long f10803o;

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: a */
    public final InterfaceC6699h.C6700a mo6033a(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        if (c6700a.f10735c == 2) {
            this.f10799k = true;
            return (this.f10797i == 0 && this.f10798j == 0) ? InterfaceC6699h.C6700a.f10732e : c6700a;
        }
        throw new InterfaceC6699h.C6701b(c6700a);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w, com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: b */
    public final boolean mo6040b() {
        return super.mo6040b() && this.f10802n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w, com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: d */
    public final ByteBuffer mo6038d() {
        int i;
        if (super.mo6040b() && (i = this.f10802n) > 0) {
            m6034k(i).put(this.f10801m, 0, this.f10802n).flip();
            this.f10802n = 0;
        }
        return super.mo6038d();
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: e */
    public final void mo6032e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.f10800l);
        this.f10803o += min / this.f10865b.f10736d;
        this.f10800l -= min;
        byteBuffer.position(position + min);
        if (this.f10800l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.f10802n + i2) - this.f10801m.length;
        ByteBuffer m6034k = m6034k(length);
        int m5099g = C7408g0.m5099g(length, 0, this.f10802n);
        m6034k.put(this.f10801m, 0, m5099g);
        int m5099g2 = C7408g0.m5099g(length - m5099g, 0, i2);
        byteBuffer.limit(byteBuffer.position() + m5099g2);
        m6034k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - m5099g2;
        int i4 = this.f10802n - m5099g;
        this.f10802n = i4;
        byte[] bArr = this.f10801m;
        System.arraycopy(bArr, m5099g, bArr, 0, i4);
        byteBuffer.get(this.f10801m, this.f10802n, i3);
        this.f10802n += i3;
        m6034k.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: h */
    public final void mo6031h() {
        if (this.f10799k) {
            this.f10799k = false;
            int i = this.f10798j;
            int i2 = this.f10865b.f10736d;
            this.f10801m = new byte[i * i2];
            this.f10800l = this.f10797i * i2;
        }
        this.f10802n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: i */
    public final void mo6035i() {
        int i;
        if (this.f10799k) {
            if (this.f10802n > 0) {
                this.f10803o += i / this.f10865b.f10736d;
            }
            this.f10802n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: j */
    public final void mo6030j() {
        this.f10801m = C7408g0.f13910f;
    }
}
