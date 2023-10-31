package com.bumptech.glide.gifdecoder;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.gifdecoder.c */
/* loaded from: classes.dex */
public final class C3428c {

    /* renamed from: b */
    public ByteBuffer f9109b;

    /* renamed from: c */
    public C3427b f9110c;

    /* renamed from: a */
    public final byte[] f9108a = new byte[256];

    /* renamed from: d */
    public int f9111d = 0;

    /* renamed from: a */
    public final boolean m6763a() {
        return this.f9110c.f9098b != 0;
    }

    @NonNull
    /* renamed from: b */
    public final C3427b m6762b() {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        boolean z4;
        if (this.f9109b != null) {
            if (m6763a()) {
                return this.f9110c;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) m6761c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f9110c.f9098b = 1;
            } else {
                this.f9110c.f9102f = m6758f();
                this.f9110c.f9103g = m6758f();
                int m6761c = m6761c();
                C3427b c3427b = this.f9110c;
                if ((m6761c & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c3427b.f9104h = z;
                c3427b.f9105i = (int) Math.pow(2.0d, (m6761c & 7) + 1);
                this.f9110c.f9106j = m6761c();
                C3427b c3427b2 = this.f9110c;
                m6761c();
                c3427b2.getClass();
                if (this.f9110c.f9104h && !m6763a()) {
                    C3427b c3427b3 = this.f9110c;
                    c3427b3.f9097a = m6759e(c3427b3.f9105i);
                    C3427b c3427b4 = this.f9110c;
                    c3427b4.f9107k = c3427b4.f9097a[c3427b4.f9106j];
                }
            }
            if (!m6763a()) {
                boolean z5 = false;
                while (!z5 && !m6763a() && this.f9110c.f9099c <= Integer.MAX_VALUE) {
                    int m6761c2 = m6761c();
                    if (m6761c2 != 33) {
                        if (m6761c2 != 44) {
                            if (m6761c2 != 59) {
                                this.f9110c.f9098b = 1;
                            } else {
                                z5 = true;
                            }
                        } else {
                            C3427b c3427b5 = this.f9110c;
                            if (c3427b5.f9100d == null) {
                                c3427b5.f9100d = new C3426a();
                            }
                            this.f9110c.f9100d.f9086a = m6758f();
                            this.f9110c.f9100d.f9087b = m6758f();
                            this.f9110c.f9100d.f9088c = m6758f();
                            this.f9110c.f9100d.f9089d = m6758f();
                            int m6761c3 = m6761c();
                            if ((m6761c3 & 128) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (m6761c3 & 7) + 1);
                            C3426a c3426a = this.f9110c.f9100d;
                            if ((m6761c3 & 64) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c3426a.f9090e = z3;
                            if (z2) {
                                c3426a.f9096k = m6759e(pow);
                            } else {
                                c3426a.f9096k = null;
                            }
                            this.f9110c.f9100d.f9095j = this.f9109b.position();
                            m6761c();
                            m6757g();
                            if (!m6763a()) {
                                C3427b c3427b6 = this.f9110c;
                                c3427b6.f9099c++;
                                c3427b6.f9101e.add(c3427b6.f9100d);
                            }
                        }
                    } else {
                        int m6761c4 = m6761c();
                        if (m6761c4 != 1) {
                            if (m6761c4 != 249) {
                                if (m6761c4 != 254 && m6761c4 == 255) {
                                    m6760d();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i2 = 0;
                                    while (true) {
                                        bArr = this.f9108a;
                                        if (i2 >= 11) {
                                            break;
                                        }
                                        sb2.append((char) bArr[i2]);
                                        i2++;
                                    }
                                    if (sb2.toString().equals("NETSCAPE2.0")) {
                                        do {
                                            m6760d();
                                            if (bArr[0] == 1) {
                                                byte b = bArr[1];
                                                byte b2 = bArr[2];
                                                this.f9110c.getClass();
                                            }
                                            if (this.f9111d > 0) {
                                            }
                                        } while (!m6763a());
                                    }
                                }
                            } else {
                                this.f9110c.f9100d = new C3426a();
                                m6761c();
                                int m6761c5 = m6761c();
                                C3426a c3426a2 = this.f9110c.f9100d;
                                int i3 = (m6761c5 & 28) >> 2;
                                c3426a2.f9092g = i3;
                                if (i3 == 0) {
                                    c3426a2.f9092g = 1;
                                }
                                if ((m6761c5 & 1) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                c3426a2.f9091f = z4;
                                int m6758f = m6758f();
                                if (m6758f < 2) {
                                    m6758f = 10;
                                }
                                C3426a c3426a3 = this.f9110c.f9100d;
                                c3426a3.f9094i = m6758f * 10;
                                c3426a3.f9093h = m6761c();
                                m6761c();
                            }
                        }
                        m6757g();
                    }
                }
                C3427b c3427b7 = this.f9110c;
                if (c3427b7.f9099c < 0) {
                    c3427b7.f9098b = 1;
                }
            }
            return this.f9110c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    /* renamed from: c */
    public final int m6761c() {
        try {
            return this.f9109b.get() & 255;
        } catch (Exception unused) {
            this.f9110c.f9098b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final void m6760d() {
        int m6761c = m6761c();
        this.f9111d = m6761c;
        if (m6761c > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    i2 = this.f9111d;
                    if (i < i2) {
                        i2 -= i;
                        this.f9109b.get(this.f9108a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder m11130b = C1169e.m11130b("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                        m11130b.append(this.f9111d);
                        Log.d("GifHeaderParser", m11130b.toString(), e);
                    }
                    this.f9110c.f9098b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    /* renamed from: e */
    public final int[] m6759e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f9109b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f9110c.f9098b = 1;
        }
        return iArr;
    }

    /* renamed from: f */
    public final int m6758f() {
        return this.f9109b.getShort();
    }

    /* renamed from: g */
    public final void m6757g() {
        int m6761c;
        do {
            m6761c = m6761c();
            this.f9109b.position(Math.min(this.f9109b.position() + m6761c, this.f9109b.limit()));
        } while (m6761c > 0);
    }
}
