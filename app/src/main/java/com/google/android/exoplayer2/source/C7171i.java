package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.C7139a0;
import com.google.android.exoplayer2.source.C7154d0;
import com.google.android.exoplayer2.upstream.C7344a;
import com.google.android.exoplayer2.upstream.C7349b0;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.InterfaceC7351c0;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;
import com.google.android.exoplayer2.util.C7394a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.source.i */
/* loaded from: classes.dex */
public final class C7171i implements InterfaceC7363i {

    /* renamed from: a */
    public final InterfaceC7363i f12885a;

    /* renamed from: b */
    public final int f12886b;

    /* renamed from: c */
    public final InterfaceC7172a f12887c;

    /* renamed from: d */
    public final byte[] f12888d;

    /* renamed from: e */
    public int f12889e;

    /* renamed from: com.google.android.exoplayer2.source.i$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7172a {
    }

    public C7171i(C7349b0 c7349b0, int i, C7139a0.C7140a c7140a) {
        C7394a.m5134a(i > 0);
        this.f12885a = c7349b0;
        this.f12886b = i;
        this.f12887c = c7140a;
        this.f12888d = new byte[1];
        this.f12889e = i;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: c */
    public final void mo5158c(InterfaceC7351c0 interfaceC7351c0) {
        interfaceC7351c0.getClass();
        this.f12885a.mo5158c(interfaceC7351c0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: h */
    public final Map<String, List<String>> mo5154h() {
        return this.f12885a.mo5154h();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f12885a.mo5145k();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long max;
        C7154d0 c7154d0;
        int i4;
        int i5 = this.f12889e;
        InterfaceC7363i interfaceC7363i = this.f12885a;
        if (i5 == 0) {
            byte[] bArr2 = this.f12888d;
            int i6 = 0;
            if (interfaceC7363i.read(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    int i9 = 0;
                    while (i8 > 0) {
                        int read = interfaceC7363i.read(bArr3, i9, i8);
                        if (read == -1) {
                            break;
                        }
                        i9 += read;
                        i8 -= read;
                    }
                    while (i7 > 0) {
                        int i10 = i7 - 1;
                        if (bArr3[i10] != 0) {
                            break;
                        }
                        i7 = i10;
                    }
                    if (i7 > 0) {
                        C7139a0.C7140a c7140a = (C7139a0.C7140a) this.f12887c;
                        if (!c7140a.f12756m) {
                            max = c7140a.f12752i;
                        } else {
                            Map<String, String> map = C7139a0.f12704M;
                            max = Math.max(C7139a0.this.m5479v(), c7140a.f12752i);
                        }
                        long j = max;
                        int i11 = i7 + 0;
                        C7159e0 c7159e0 = c7140a.f12755l;
                        c7159e0.getClass();
                        int i12 = i11;
                        while (true) {
                            c7154d0 = c7159e0.f12836a;
                            if (i12 <= 0) {
                                break;
                            }
                            int m5464b = c7154d0.m5464b(i12);
                            C7154d0.C7155a c7155a = c7154d0.f12814f;
                            C7344a c7344a = c7155a.f12819d;
                            int i13 = i11;
                            bArr3 = bArr3;
                            System.arraycopy(bArr3, i6, c7344a.f13722a, ((int) (c7154d0.f12815g - c7155a.f12816a)) + c7344a.f13723b, m5464b);
                            int i14 = i6 + m5464b;
                            i12 -= m5464b;
                            long j2 = c7154d0.f12815g + m5464b;
                            c7154d0.f12815g = j2;
                            C7154d0.C7155a c7155a2 = c7154d0.f12814f;
                            if (j2 == c7155a2.f12817b) {
                                c7154d0.f12814f = c7155a2.f12820e;
                            }
                            i6 = i14;
                            i11 = i13;
                        }
                        c7154d0.getClass();
                        c7159e0.mo5452d(j, 1, i11, 0, null);
                        i4 = 1;
                        c7140a.f12756m = true;
                        i6 = i4;
                    }
                }
                i4 = 1;
                i6 = i4;
            }
            if (i6 != 0) {
                this.f12889e = this.f12886b;
                i3 = -1;
            } else {
                return -1;
            }
        } else {
            i3 = -1;
        }
        int read2 = interfaceC7363i.read(bArr, i, Math.min(this.f12889e, i2));
        if (read2 != i3) {
            this.f12889e -= read2;
        }
        return read2;
    }
}
