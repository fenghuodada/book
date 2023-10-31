package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.Log;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import com.google.common.base.C7935d;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.tx3g.a */
/* loaded from: classes.dex */
public final class C7263a extends AbstractC7207a {

    /* renamed from: m */
    public final C7436v f13300m = new C7436v();

    /* renamed from: n */
    public final boolean f13301n;

    /* renamed from: o */
    public final int f13302o;

    /* renamed from: p */
    public final int f13303p;

    /* renamed from: q */
    public final String f13304q;

    /* renamed from: r */
    public final float f13305r;

    /* renamed from: s */
    public final int f13306s;

    public C7263a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f13302o = 0;
            this.f13303p = -1;
            this.f13304q = "sans-serif";
            this.f13301n = false;
            this.f13305r = 0.85f;
            this.f13306s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f13302o = bArr[24];
        this.f13303p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f13304q = "Serif".equals(C7408g0.m5095k(43, bArr, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f13306s = i;
        boolean z = (bArr[0] & 32) != 0;
        this.f13301n = z;
        if (z) {
            this.f13305r = C7408g0.m5100f(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f13305r = 0.85f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m5301i(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 1
            r1 = 0
            if (r10 == 0) goto Lc
            r10 = r0
            goto Ld
        Lc:
            r10 = r1
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r0
            goto L14
        L13:
            r2 = r1
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r0)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r0 = r1
        L34:
            if (r0 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r0 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r1)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.tx3g.C7263a.m5301i(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    public final InterfaceC7209c mo5287h(byte[] bArr, int i, boolean z) throws C7234e {
        boolean z2;
        Charset charset;
        String m5004n;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        C7436v c7436v = this.f13300m;
        c7436v.m4994x(i, bArr);
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        if (c7436v.f13980c - c7436v.f13979b >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int m4997u = c7436v.m4997u();
            int i13 = 8;
            if (m4997u == 0) {
                m5004n = "";
            } else {
                int i14 = c7436v.f13980c;
                int i15 = c7436v.f13979b;
                if (i14 - i15 >= 2) {
                    byte[] bArr2 = c7436v.f13978a;
                    char c = (char) ((bArr2[i15 + 1] & 255) | ((bArr2[i15] & 255) << 8));
                    if (c == 65279 || c == 65534) {
                        charset = C7935d.f15695e;
                        m5004n = c7436v.m5004n(m4997u, charset);
                    }
                }
                charset = C7935d.f15693c;
                m5004n = c7436v.m5004n(m4997u, charset);
            }
            if (m5004n.isEmpty()) {
                return C7264b.f13307b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m5004n);
            m5301i(spannableStringBuilder, this.f13302o, 0, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i16 = this.f13303p;
            if (i16 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((i16 & 255) << 24) | (i16 >>> 8)), 0, length, 16711713);
            }
            int length2 = spannableStringBuilder.length();
            String str = this.f13304q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
            }
            float f2 = this.f13305r;
            while (true) {
                int i17 = c7436v.f13980c;
                int i18 = c7436v.f13979b;
                if (i17 - i18 >= i13) {
                    int m5015c = c7436v.m5015c();
                    int m5015c2 = c7436v.m5015c();
                    if (m5015c2 == 1937013100) {
                        if (c7436v.f13980c - c7436v.f13979b >= i10) {
                            i3 = i11;
                        } else {
                            i3 = i12;
                        }
                        if (i3 != 0) {
                            int m4997u2 = c7436v.m4997u();
                            int i19 = i12;
                            while (i19 < m4997u2) {
                                if (c7436v.f13980c - c7436v.f13979b >= 12) {
                                    i4 = i11;
                                } else {
                                    i4 = i12;
                                }
                                if (i4 != 0) {
                                    int m4997u3 = c7436v.m4997u();
                                    int m4997u4 = c7436v.m4997u();
                                    c7436v.m5018A(i10);
                                    int m5002p = c7436v.m5002p();
                                    c7436v.m5018A(i11);
                                    int m5015c3 = c7436v.m5015c();
                                    if (m4997u4 > spannableStringBuilder.length()) {
                                        int length3 = spannableStringBuilder.length();
                                        i5 = i19;
                                        i6 = m4997u2;
                                        StringBuilder sb = new StringBuilder(68);
                                        sb.append("Truncating styl end (");
                                        sb.append(m4997u4);
                                        sb.append(") to cueText.length() (");
                                        sb.append(length3);
                                        sb.append(").");
                                        Log.w("Tx3gDecoder", sb.toString());
                                        m4997u4 = spannableStringBuilder.length();
                                    } else {
                                        i5 = i19;
                                        i6 = m4997u2;
                                    }
                                    int i20 = m4997u4;
                                    if (m4997u3 >= i20) {
                                        StringBuilder sb2 = new StringBuilder(60);
                                        sb2.append("Ignoring styl with start (");
                                        sb2.append(m4997u3);
                                        sb2.append(") >= end (");
                                        sb2.append(i20);
                                        sb2.append(").");
                                        Log.w("Tx3gDecoder", sb2.toString());
                                        i9 = i18;
                                        i7 = i5;
                                        i8 = i6;
                                        f = f2;
                                    } else {
                                        i7 = i5;
                                        i8 = i6;
                                        f = f2;
                                        i9 = i18;
                                        m5301i(spannableStringBuilder, m5002p, this.f13302o, m4997u3, i20, 0);
                                        if (m5015c3 != i16) {
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan((m5015c3 >>> 8) | ((m5015c3 & 255) << 24)), m4997u3, i20, 33);
                                        }
                                    }
                                    i19 = i7 + 1;
                                    m4997u2 = i8;
                                    f2 = f;
                                    i18 = i9;
                                    i10 = 2;
                                    i11 = 1;
                                    i12 = 0;
                                } else {
                                    throw new C7234e("Unexpected subtitle format.");
                                }
                            }
                            i2 = i18;
                        } else {
                            throw new C7234e("Unexpected subtitle format.");
                        }
                    } else {
                        float f3 = f2;
                        i2 = i18;
                        if (m5015c2 == 1952608120 && this.f13301n) {
                            i10 = 2;
                            if (c7436v.f13980c - c7436v.f13979b >= 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                f2 = C7408g0.m5100f(c7436v.m4997u() / this.f13306s, 0.0f, 0.95f);
                            } else {
                                throw new C7234e("Unexpected subtitle format.");
                            }
                        } else {
                            i10 = 2;
                            f2 = f3;
                        }
                    }
                    c7436v.m4992z(i2 + m5015c);
                    i11 = 1;
                    i12 = 0;
                    i13 = 8;
                } else {
                    float f4 = f2;
                    Cue.C7206a c7206a = new Cue.C7206a();
                    c7206a.f12986a = spannableStringBuilder;
                    c7206a.f12990e = f4;
                    c7206a.f12991f = 0;
                    c7206a.f12992g = 0;
                    return new C7264b(c7206a.m5372a());
                }
            }
        } else {
            throw new C7234e("Unexpected subtitle format.");
        }
    }
}
