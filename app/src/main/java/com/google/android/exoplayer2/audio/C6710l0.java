package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.InterfaceC6699h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.exoplayer2.audio.l0 */
/* loaded from: classes.dex */
public final class C6710l0 implements InterfaceC6699h {

    /* renamed from: b */
    public int f10780b;

    /* renamed from: c */
    public float f10781c = 1.0f;

    /* renamed from: d */
    public float f10782d = 1.0f;

    /* renamed from: e */
    public InterfaceC6699h.C6700a f10783e;

    /* renamed from: f */
    public InterfaceC6699h.C6700a f10784f;

    /* renamed from: g */
    public InterfaceC6699h.C6700a f10785g;

    /* renamed from: h */
    public InterfaceC6699h.C6700a f10786h;

    /* renamed from: i */
    public boolean f10787i;
    @Nullable

    /* renamed from: j */
    public C6708k0 f10788j;

    /* renamed from: k */
    public ByteBuffer f10789k;

    /* renamed from: l */
    public ShortBuffer f10790l;

    /* renamed from: m */
    public ByteBuffer f10791m;

    /* renamed from: n */
    public long f10792n;

    /* renamed from: o */
    public long f10793o;

    /* renamed from: p */
    public boolean f10794p;

    public C6710l0() {
        InterfaceC6699h.C6700a c6700a = InterfaceC6699h.C6700a.f10732e;
        this.f10783e = c6700a;
        this.f10784f = c6700a;
        this.f10785g = c6700a;
        this.f10786h = c6700a;
        ByteBuffer byteBuffer = InterfaceC6699h.f10731a;
        this.f10789k = byteBuffer;
        this.f10790l = byteBuffer.asShortBuffer();
        this.f10791m = byteBuffer;
        this.f10780b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: b */
    public final boolean mo6040b() {
        C6708k0 c6708k0;
        if (this.f10794p && ((c6708k0 = this.f10788j) == null || c6708k0.f10768m * c6708k0.f10757b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: c */
    public final boolean mo6039c() {
        return this.f10784f.f10733a != -1 && (Math.abs(this.f10781c - 1.0f) >= 1.0E-4f || Math.abs(this.f10782d - 1.0f) >= 1.0E-4f || this.f10784f.f10733a != this.f10783e.f10733a);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: d */
    public final ByteBuffer mo6038d() {
        C6708k0 c6708k0 = this.f10788j;
        if (c6708k0 != null) {
            int i = c6708k0.f10768m;
            int i2 = c6708k0.f10757b;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.f10789k.capacity() < i3) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.f10789k = order;
                    this.f10790l = order.asShortBuffer();
                } else {
                    this.f10789k.clear();
                    this.f10790l.clear();
                }
                ShortBuffer shortBuffer = this.f10790l;
                int min = Math.min(shortBuffer.remaining() / i2, c6708k0.f10768m);
                int i4 = min * i2;
                shortBuffer.put(c6708k0.f10767l, 0, i4);
                int i5 = c6708k0.f10768m - min;
                c6708k0.f10768m = i5;
                short[] sArr = c6708k0.f10767l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.f10793o += i3;
                this.f10789k.limit(i3);
                this.f10791m = this.f10789k;
            }
        }
        ByteBuffer byteBuffer = this.f10791m;
        this.f10791m = InterfaceC6699h.f10731a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: e */
    public final void mo6032e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        C6708k0 c6708k0 = this.f10788j;
        c6708k0.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f10792n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i = c6708k0.f10757b;
        int i2 = remaining2 / i;
        short[] m6055b = c6708k0.m6055b(c6708k0.f10765j, c6708k0.f10766k, i2);
        c6708k0.f10765j = m6055b;
        asShortBuffer.get(m6055b, c6708k0.f10766k * i, ((i2 * i) * 2) / 2);
        c6708k0.f10766k += i2;
        c6708k0.m6052e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: f */
    public final InterfaceC6699h.C6700a mo6037f(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        if (c6700a.f10735c == 2) {
            int i = this.f10780b;
            if (i == -1) {
                i = c6700a.f10733a;
            }
            this.f10783e = c6700a;
            InterfaceC6699h.C6700a c6700a2 = new InterfaceC6699h.C6700a(i, c6700a.f10734b, 2);
            this.f10784f = c6700a2;
            this.f10787i = true;
            return c6700a2;
        }
        throw new InterfaceC6699h.C6701b(c6700a);
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    public final void flush() {
        if (mo6039c()) {
            InterfaceC6699h.C6700a c6700a = this.f10783e;
            this.f10785g = c6700a;
            InterfaceC6699h.C6700a c6700a2 = this.f10784f;
            this.f10786h = c6700a2;
            if (this.f10787i) {
                this.f10788j = new C6708k0(c6700a.f10733a, c6700a.f10734b, this.f10781c, this.f10782d, c6700a2.f10733a);
            } else {
                C6708k0 c6708k0 = this.f10788j;
                if (c6708k0 != null) {
                    c6708k0.f10766k = 0;
                    c6708k0.f10768m = 0;
                    c6708k0.f10770o = 0;
                    c6708k0.f10771p = 0;
                    c6708k0.f10772q = 0;
                    c6708k0.f10773r = 0;
                    c6708k0.f10774s = 0;
                    c6708k0.f10775t = 0;
                    c6708k0.f10776u = 0;
                    c6708k0.f10777v = 0;
                }
            }
        }
        this.f10791m = InterfaceC6699h.f10731a;
        this.f10792n = 0L;
        this.f10793o = 0L;
        this.f10794p = false;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: g */
    public final void mo6036g() {
        C6708k0 c6708k0 = this.f10788j;
        if (c6708k0 != null) {
            int i = c6708k0.f10766k;
            float f = c6708k0.f10758c;
            float f2 = c6708k0.f10759d;
            int i2 = c6708k0.f10768m + ((int) ((((i / (f / f2)) + c6708k0.f10770o) / (c6708k0.f10760e * f2)) + 0.5f));
            short[] sArr = c6708k0.f10765j;
            int i3 = c6708k0.f10763h * 2;
            c6708k0.f10765j = c6708k0.m6055b(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = c6708k0.f10757b;
                if (i4 >= i3 * i5) {
                    break;
                }
                c6708k0.f10765j[(i5 * i) + i4] = 0;
                i4++;
            }
            c6708k0.f10766k = i3 + c6708k0.f10766k;
            c6708k0.m6052e();
            if (c6708k0.f10768m > i2) {
                c6708k0.f10768m = i2;
            }
            c6708k0.f10766k = 0;
            c6708k0.f10773r = 0;
            c6708k0.f10770o = 0;
        }
        this.f10794p = true;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    public final void reset() {
        this.f10781c = 1.0f;
        this.f10782d = 1.0f;
        InterfaceC6699h.C6700a c6700a = InterfaceC6699h.C6700a.f10732e;
        this.f10783e = c6700a;
        this.f10784f = c6700a;
        this.f10785g = c6700a;
        this.f10786h = c6700a;
        ByteBuffer byteBuffer = InterfaceC6699h.f10731a;
        this.f10789k = byteBuffer;
        this.f10790l = byteBuffer.asShortBuffer();
        this.f10791m = byteBuffer;
        this.f10780b = -1;
        this.f10787i = false;
        this.f10788j = null;
        this.f10792n = 0L;
        this.f10793o = 0L;
        this.f10794p = false;
    }
}
