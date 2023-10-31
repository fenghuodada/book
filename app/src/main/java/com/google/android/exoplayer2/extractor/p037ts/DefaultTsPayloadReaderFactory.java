package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7436v;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory */
/* loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.InterfaceC6912c {

    /* renamed from: a */
    public final int f11632a;

    /* renamed from: b */
    public final List<C7003m0> f11633b;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory$Flags */
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
        C7998n0 c7998n0 = C7998n0.f15785e;
        this.f11632a = 0;
        this.f11633b = c7998n0;
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader.InterfaceC6912c
    @Nullable
    /* renamed from: a */
    public final TsPayloadReader mo5846a(int i, TsPayloadReader.C6911b c6911b) {
        if (i != 2) {
            String str = c6911b.f11662a;
            if (i != 3 && i != 4) {
                if (i != 21) {
                    if (i != 27) {
                        if (i != 36) {
                            if (i != 89) {
                                if (i != 138) {
                                    if (i != 172) {
                                        if (i != 257) {
                                            if (i != 129) {
                                                if (i != 130) {
                                                    if (i != 134) {
                                                        if (i != 135) {
                                                            switch (i) {
                                                                case 15:
                                                                    if (m5847c(2)) {
                                                                        return null;
                                                                    }
                                                                    return new C6938r(new C6919e(false, str));
                                                                case 16:
                                                                    return new C6938r(new C6925j(new C6915a0(m5848b(c6911b))));
                                                                case 17:
                                                                    if (m5847c(2)) {
                                                                        return null;
                                                                    }
                                                                    return new C6938r(new C6934n(str));
                                                                default:
                                                                    return null;
                                                            }
                                                        }
                                                    } else if (m5847c(16)) {
                                                        return null;
                                                    } else {
                                                        return new C6945w(new C6937q("application/x-scte35"));
                                                    }
                                                } else if (!m5847c(64)) {
                                                    return null;
                                                }
                                            }
                                            return new C6938r(new C6916b(str));
                                        }
                                        return new C6945w(new C6937q("application/vnd.dvb.ait"));
                                    }
                                    return new C6938r(new C6918d(str));
                                }
                                return new C6938r(new C6920f(str));
                            }
                            return new C6938r(new C6921g(c6911b.f11663b));
                        }
                        return new C6938r(new C6931l(new C6946x(m5848b(c6911b))));
                    } else if (m5847c(4)) {
                        return null;
                    } else {
                        return new C6938r(new C6928k(new C6946x(m5848b(c6911b)), m5847c(1), m5847c(8)));
                    }
                }
                return new C6938r(new C6933m());
            }
            return new C6938r(new C6935o(str));
        }
        return new C6938r(new C6923i(new C6915a0(m5848b(c6911b))));
    }

    /* renamed from: b */
    public final List<C7003m0> m5848b(TsPayloadReader.C6911b c6911b) {
        boolean z;
        String str;
        int i;
        List<byte[]> list;
        boolean z2;
        boolean m5847c = m5847c(32);
        List<C7003m0> list2 = this.f11633b;
        if (m5847c) {
            return list2;
        }
        C7436v c7436v = new C7436v(c6911b.f11664c);
        while (c7436v.f13980c - c7436v.f13979b > 0) {
            int m5002p = c7436v.m5002p();
            int m5002p2 = c7436v.f13979b + c7436v.m5002p();
            if (m5002p == 134) {
                ArrayList arrayList = new ArrayList();
                int m5002p3 = c7436v.m5002p() & 31;
                for (int i2 = 0; i2 < m5002p3; i2++) {
                    String m5005m = c7436v.m5005m(3);
                    int m5002p4 = c7436v.m5002p();
                    if ((m5002p4 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = m5002p4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte m5002p5 = (byte) c7436v.m5002p();
                    c7436v.m5018A(1);
                    if (z) {
                        if ((m5002p5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C7003m0.C7005b c7005b = new C7003m0.C7005b();
                    c7005b.f12316k = str;
                    c7005b.f12308c = m5005m;
                    c7005b.f12304C = i;
                    c7005b.f12318m = list;
                    arrayList.add(new C7003m0(c7005b));
                }
                list2 = arrayList;
            }
            c7436v.m4992z(m5002p2);
        }
        return list2;
    }

    /* renamed from: c */
    public final boolean m5847c(int i) {
        return (i & this.f11632a) != 0;
    }
}
