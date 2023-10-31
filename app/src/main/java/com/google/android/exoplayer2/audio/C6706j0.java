package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.InterfaceC6699h;
import com.google.android.exoplayer2.util.C7408g0;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.audio.j0 */
/* loaded from: classes.dex */
public final class C6706j0 extends AbstractC6725w {

    /* renamed from: i */
    public final long f10742i = 150000;

    /* renamed from: j */
    public final long f10743j = 20000;

    /* renamed from: k */
    public final short f10744k = 1024;

    /* renamed from: l */
    public int f10745l;

    /* renamed from: m */
    public boolean f10746m;

    /* renamed from: n */
    public byte[] f10747n;

    /* renamed from: o */
    public byte[] f10748o;

    /* renamed from: p */
    public int f10749p;

    /* renamed from: q */
    public int f10750q;

    /* renamed from: r */
    public int f10751r;

    /* renamed from: s */
    public boolean f10752s;

    /* renamed from: t */
    public long f10753t;

    public C6706j0() {
        byte[] bArr = C7408g0.f13910f;
        this.f10747n = bArr;
        this.f10748o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: a */
    public final InterfaceC6699h.C6700a mo6033a(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        if (c6700a.f10735c == 2) {
            return this.f10746m ? c6700a : InterfaceC6699h.C6700a.f10732e;
        }
        throw new InterfaceC6699h.C6701b(c6700a);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w, com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: c */
    public final boolean mo6039c() {
        return this.f10746m;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: e */
    public final void mo6032e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f10870g.hasRemaining()) {
            int i = this.f10749p;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int limit = byteBuffer.limit();
                        int m6059l = m6059l(byteBuffer);
                        byteBuffer.limit(m6059l);
                        this.f10753t += byteBuffer.remaining() / this.f10745l;
                        m6057n(byteBuffer, this.f10748o, this.f10751r);
                        if (m6059l < limit) {
                            m6058m(this.f10751r, this.f10748o);
                            this.f10749p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m6059l2 = m6059l(byteBuffer);
                    int position2 = m6059l2 - byteBuffer.position();
                    byte[] bArr = this.f10747n;
                    int length = bArr.length;
                    int i2 = this.f10750q;
                    int i3 = length - i2;
                    if (m6059l2 < limit2 && position2 < i3) {
                        m6058m(i2, bArr);
                        this.f10750q = 0;
                        this.f10749p = 0;
                    } else {
                        int min = Math.min(position2, i3);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f10747n, this.f10750q, min);
                        int i4 = this.f10750q + min;
                        this.f10750q = i4;
                        byte[] bArr2 = this.f10747n;
                        if (i4 == bArr2.length) {
                            if (this.f10752s) {
                                m6058m(this.f10751r, bArr2);
                                this.f10753t += (this.f10750q - (this.f10751r * 2)) / this.f10745l;
                            } else {
                                this.f10753t += (i4 - this.f10751r) / this.f10745l;
                            }
                            m6057n(byteBuffer, this.f10747n, this.f10750q);
                            this.f10750q = 0;
                            this.f10749p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f10747n.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f10744k) {
                            int i5 = this.f10745l;
                            position = ((limit4 / i5) * i5) + i5;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f10749p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m6034k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f10752s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: h */
    public final void mo6031h() {
        if (this.f10746m) {
            InterfaceC6699h.C6700a c6700a = this.f10865b;
            int i = c6700a.f10736d;
            this.f10745l = i;
            int i2 = c6700a.f10733a;
            int i3 = ((int) ((this.f10742i * i2) / 1000000)) * i;
            if (this.f10747n.length != i3) {
                this.f10747n = new byte[i3];
            }
            int i4 = ((int) ((this.f10743j * i2) / 1000000)) * i;
            this.f10751r = i4;
            if (this.f10748o.length != i4) {
                this.f10748o = new byte[i4];
            }
        }
        this.f10749p = 0;
        this.f10753t = 0L;
        this.f10750q = 0;
        this.f10752s = false;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: i */
    public final void mo6035i() {
        int i = this.f10750q;
        if (i > 0) {
            m6058m(i, this.f10747n);
        }
        if (this.f10752s) {
            return;
        }
        this.f10753t += this.f10751r / this.f10745l;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC6725w
    /* renamed from: j */
    public final void mo6030j() {
        this.f10746m = false;
        this.f10751r = 0;
        byte[] bArr = C7408g0.f13910f;
        this.f10747n = bArr;
        this.f10748o = bArr;
    }

    /* renamed from: l */
    public final int m6059l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f10744k) {
                int i = this.f10745l;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    public final void m6058m(int i, byte[] bArr) {
        m6034k(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f10752s = true;
        }
    }

    /* renamed from: n */
    public final void m6057n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f10751r);
        int i2 = this.f10751r - min;
        System.arraycopy(bArr, i - i2, this.f10748o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f10748o, i2, min);
    }
}
