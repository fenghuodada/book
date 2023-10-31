package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.InterfaceC7361g;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.e */
/* loaded from: classes.dex */
public final class C6820e implements InterfaceC6832h {

    /* renamed from: b */
    public final InterfaceC7361g f11124b;

    /* renamed from: c */
    public final long f11125c;

    /* renamed from: d */
    public long f11126d;

    /* renamed from: f */
    public int f11128f;

    /* renamed from: g */
    public int f11129g;

    /* renamed from: e */
    public byte[] f11127e = new byte[65536];

    /* renamed from: a */
    public final byte[] f11123a = new byte[4096];

    public C6820e(InterfaceC7363i interfaceC7363i, long j, long j2) {
        this.f11124b = interfaceC7363i;
        this.f11126d = j;
        this.f11125c = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: a */
    public final boolean mo5930a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int min;
        int i3 = this.f11129g;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.f11127e, 0, bArr, i, min);
            m5945q(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = m5947o(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.f11126d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: b */
    public final void mo5929b(int i, byte[] bArr, int i2) throws IOException {
        mo5928d(bArr, i, i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: d */
    public final boolean mo5928d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (m5950l(i2, z)) {
            System.arraycopy(this.f11127e, this.f11128f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: e */
    public final long mo5927e() {
        return this.f11126d + this.f11128f;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: f */
    public final void mo5926f(int i) throws IOException {
        m5950l(i, false);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final long getLength() {
        return this.f11125c;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final long getPosition() {
        return this.f11126d;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: i */
    public final void mo5925i() {
        this.f11128f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    /* renamed from: j */
    public final void mo5924j(int i) throws IOException {
        int min = Math.min(this.f11129g, i);
        m5945q(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = m5947o(this.f11123a, -i2, Math.min(i, this.f11123a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.f11126d += i2;
        }
    }

    /* renamed from: l */
    public final boolean m5950l(int i, boolean z) throws IOException {
        m5949m(i);
        int i2 = this.f11129g - this.f11128f;
        while (i2 < i) {
            i2 = m5947o(this.f11127e, this.f11128f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f11129g = this.f11128f + i2;
        }
        this.f11128f += i;
        return true;
    }

    /* renamed from: m */
    public final void m5949m(int i) {
        int i2 = this.f11128f + i;
        byte[] bArr = this.f11127e;
        if (i2 > bArr.length) {
            this.f11127e = Arrays.copyOf(this.f11127e, C7408g0.m5099g(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: n */
    public final int m5948n(int i, byte[] bArr, int i2) throws IOException {
        int min;
        m5949m(i2);
        int i3 = this.f11129g;
        int i4 = this.f11128f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = m5947o(this.f11127e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f11129g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.f11127e, this.f11128f, bArr, i, min);
        this.f11128f += min;
        return min;
    }

    /* renamed from: o */
    public final int m5947o(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f11124b.read(bArr, i + i3, i2 - i3);
        if (read == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + read;
    }

    /* renamed from: p */
    public final int m5946p() throws IOException {
        int min = Math.min(this.f11129g, 1);
        m5945q(min);
        if (min == 0) {
            byte[] bArr = this.f11123a;
            min = m5947o(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f11126d += min;
        }
        return min;
    }

    /* renamed from: q */
    public final void m5945q(int i) {
        int i2 = this.f11129g - i;
        this.f11129g = i2;
        this.f11128f = 0;
        byte[] bArr = this.f11127e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f11127e = bArr2;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h, com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f11129g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f11127e, 0, bArr, i, min);
            m5945q(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = m5947o(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.f11126d += i4;
        }
        return i4;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6832h
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo5930a(bArr, i, i2, false);
    }
}
