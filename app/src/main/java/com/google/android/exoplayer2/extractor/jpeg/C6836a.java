package com.google.android.exoplayer2.extractor.jpeg;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.jpeg.C6837b;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.mp4.C7096b;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.exoplayer2.extractor.jpeg.a */
/* loaded from: classes.dex */
public final class C6836a implements Extractor {

    /* renamed from: b */
    public InterfaceC6833i f11183b;

    /* renamed from: c */
    public int f11184c;

    /* renamed from: d */
    public int f11185d;

    /* renamed from: e */
    public int f11186e;
    @Nullable

    /* renamed from: g */
    public C7096b f11188g;

    /* renamed from: h */
    public InterfaceC6832h f11189h;

    /* renamed from: i */
    public C6839c f11190i;
    @Nullable

    /* renamed from: j */
    public Mp4Extractor f11191j;

    /* renamed from: a */
    public final C7436v f11182a = new C7436v(6);

    /* renamed from: f */
    public long f11187f = -1;

    /* renamed from: a */
    public final void m5933a() {
        m5932c(new C7042a.InterfaceC7044b[0]);
        InterfaceC6833i interfaceC6833i = this.f11183b;
        interfaceC6833i.getClass();
        interfaceC6833i.mo5483j();
        this.f11183b.mo5484a(new InterfaceC6905t.C6907b(-9223372036854775807L));
        this.f11184c = 6;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        C6820e c6820e = (C6820e) interfaceC6832h;
        if (m5931d(c6820e) != 65496) {
            return false;
        }
        int m5931d = m5931d(c6820e);
        this.f11185d = m5931d;
        C7436v c7436v = this.f11182a;
        if (m5931d == 65504) {
            c7436v.m4995w(2);
            c6820e.mo5928d(c7436v.f13978a, 0, 2, false);
            c6820e.m5950l(c7436v.m4997u() - 2, false);
            this.f11185d = m5931d(c6820e);
        }
        if (this.f11185d != 65505) {
            return false;
        }
        c6820e.m5950l(2, false);
        c7436v.m4995w(6);
        c6820e.mo5928d(c7436v.f13978a, 0, 6, false);
        if (c7436v.m5001q() != 1165519206 || c7436v.m4997u() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m5932c(C7042a.InterfaceC7044b... interfaceC7044bArr) {
        InterfaceC6833i interfaceC6833i = this.f11183b;
        interfaceC6833i.getClass();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(1024, 4);
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12315j = "image/jpeg";
        c7005b.f12314i = new C7042a(interfaceC7044bArr);
        mo5482p.mo5451e(new C7003m0(c7005b));
    }

    /* renamed from: d */
    public final int m5931d(C6820e c6820e) throws IOException {
        C7436v c7436v = this.f11182a;
        c7436v.m4995w(2);
        c6820e.mo5928d(c7436v.f13978a, 0, 2, false);
        return c7436v.m4997u();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        int i;
        String m5095k;
        String m5095k2;
        C6837b c6837b;
        long j;
        int i2 = this.f11184c;
        int i3 = 4;
        C7436v c7436v = this.f11182a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f11190i == null || interfaceC6832h != this.f11189h) {
                            this.f11189h = interfaceC6832h;
                            this.f11190i = new C6839c((C6820e) interfaceC6832h, this.f11187f);
                        }
                        Mp4Extractor mp4Extractor = this.f11191j;
                        mp4Extractor.getClass();
                        int mo5806e = mp4Extractor.mo5806e(this.f11190i, c6904s);
                        if (mo5806e == 1) {
                            c6904s.f11618a += this.f11187f;
                        }
                        return mo5806e;
                    }
                    C6820e c6820e = (C6820e) interfaceC6832h;
                    long j2 = c6820e.f11126d;
                    long j3 = this.f11187f;
                    if (j2 != j3) {
                        c6904s.f11618a = j3;
                        return 1;
                    }
                    if (c6820e.mo5928d(c7436v.f13978a, 0, 1, true)) {
                        c6820e.f11128f = 0;
                        if (this.f11191j == null) {
                            this.f11191j = new Mp4Extractor();
                        }
                        C6839c c6839c = new C6839c(c6820e, this.f11187f);
                        this.f11190i = c6839c;
                        if (this.f11191j.mo5807b(c6839c)) {
                            Mp4Extractor mp4Extractor2 = this.f11191j;
                            long j4 = this.f11187f;
                            InterfaceC6833i interfaceC6833i = this.f11183b;
                            interfaceC6833i.getClass();
                            mp4Extractor2.f11441r = new C6840d(j4, interfaceC6833i);
                            C7096b c7096b = this.f11188g;
                            c7096b.getClass();
                            m5932c(c7096b);
                            this.f11184c = 5;
                            return 0;
                        }
                    }
                    m5933a();
                    return 0;
                }
                if (this.f11185d == 65505) {
                    int i4 = this.f11186e;
                    byte[] bArr = new byte[i4];
                    C6820e c6820e2 = (C6820e) interfaceC6832h;
                    c6820e2.mo5930a(bArr, 0, i4, false);
                    if (this.f11188g == null) {
                        C7096b c7096b2 = null;
                        if (i4 + 0 == 0) {
                            m5095k = null;
                            i = 0;
                        } else {
                            i = 0;
                            while (i < i4 && bArr[i] != 0) {
                                i++;
                            }
                            m5095k = C7408g0.m5095k(0, bArr, i + 0);
                            if (i < i4) {
                                i++;
                            }
                        }
                        if ("http://ns.adobe.com/xap/1.0/".equals(m5095k)) {
                            if (i4 - i == 0) {
                                m5095k2 = null;
                            } else {
                                int i5 = i;
                                while (i5 < i4 && bArr[i5] != 0) {
                                    i5++;
                                }
                                m5095k2 = C7408g0.m5095k(i, bArr, i5 - i);
                            }
                            if (m5095k2 != null) {
                                long j5 = c6820e2.f11125c;
                                if (j5 != -1) {
                                    try {
                                        c6837b = C6842e.m5923a(m5095k2);
                                    } catch (C7506y0 | NumberFormatException | XmlPullParserException unused) {
                                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                        c6837b = null;
                                    }
                                    if (c6837b != null) {
                                        List<C6837b.C6838a> list = c6837b.f11193b;
                                        if (list.size() >= 2) {
                                            long j6 = -1;
                                            long j7 = -1;
                                            long j8 = -1;
                                            long j9 = -1;
                                            boolean z = false;
                                            for (int size = list.size() - 1; size >= 0; size--) {
                                                C6837b.C6838a c6838a = list.get(size);
                                                z |= "video/mp4".equals(c6838a.f11194a);
                                                if (size == 0) {
                                                    j5 -= c6838a.f11196c;
                                                    j = 0;
                                                } else {
                                                    j = j5 - c6838a.f11195b;
                                                }
                                                long j10 = j;
                                                long j11 = j5;
                                                j5 = j10;
                                                if (z && j5 != j11) {
                                                    j9 = j11 - j5;
                                                    z = false;
                                                    j8 = j5;
                                                }
                                                if (size == 0) {
                                                    j7 = j11;
                                                    j6 = j5;
                                                }
                                            }
                                            if (j8 != -1 && j9 != -1 && j6 != -1 && j7 != -1) {
                                                c7096b2 = new C7096b(j6, j7, c6837b.f11192a, j8, j9);
                                            }
                                        }
                                    }
                                }
                                this.f11188g = c7096b2;
                                if (c7096b2 != null) {
                                    this.f11187f = c7096b2.f12587d;
                                }
                            }
                        }
                    }
                } else {
                    ((C6820e) interfaceC6832h).mo5924j(this.f11186e);
                }
                this.f11184c = 0;
                return 0;
            }
            c7436v.m4995w(2);
            ((C6820e) interfaceC6832h).mo5930a(c7436v.f13978a, 0, 2, false);
            this.f11186e = c7436v.m4997u() - 2;
            this.f11184c = 2;
            return 0;
        }
        c7436v.m4995w(2);
        ((C6820e) interfaceC6832h).mo5930a(c7436v.f13978a, 0, 2, false);
        int m4997u = c7436v.m4997u();
        this.f11185d = m4997u;
        if (m4997u == 65498) {
            if (this.f11187f == -1) {
                m5933a();
            }
            this.f11184c = i3;
        } else if ((m4997u < 65488 || m4997u > 65497) && m4997u != 65281) {
            i3 = 1;
            this.f11184c = i3;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11183b = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        if (j == 0) {
            this.f11184c = 0;
            this.f11191j = null;
        } else if (this.f11184c == 5) {
            Mp4Extractor mp4Extractor = this.f11191j;
            mp4Extractor.getClass();
            mp4Extractor.mo5804g(j, j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.f11191j;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }
}
