package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.text.webvtt.C7270f;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.webvtt.a */
/* loaded from: classes.dex */
public final class C7265a extends AbstractC7207a {

    /* renamed from: m */
    public final C7436v f13326m = new C7436v();

    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    public final InterfaceC7209c mo5287h(byte[] bArr, int i, boolean z) throws C7234e {
        Cue m5372a;
        C7436v c7436v = this.f13326m;
        c7436v.m4994x(i, bArr);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = c7436v.f13980c - c7436v.f13979b;
            if (i2 > 0) {
                if (i2 >= 8) {
                    int m5015c = c7436v.m5015c() - 8;
                    if (c7436v.m5015c() == 1987343459) {
                        CharSequence charSequence = null;
                        Cue.C7206a c7206a = null;
                        while (m5015c > 0) {
                            if (m5015c >= 8) {
                                int m5015c2 = c7436v.m5015c();
                                int m5015c3 = c7436v.m5015c();
                                int i3 = m5015c2 - 8;
                                String m5095k = C7408g0.m5095k(c7436v.f13979b, c7436v.f13978a, i3);
                                c7436v.m5018A(i3);
                                m5015c = (m5015c - 8) - i3;
                                if (m5015c3 == 1937011815) {
                                    C7270f.C7274d c7274d = new C7270f.C7274d();
                                    C7270f.m5292e(m5095k, c7274d);
                                    c7206a = c7274d.m5288a();
                                } else if (m5015c3 == 1885436268) {
                                    charSequence = C7270f.m5291f(null, m5095k.trim(), Collections.emptyList());
                                }
                            } else {
                                throw new C7234e("Incomplete vtt cue box header found.");
                            }
                        }
                        if (charSequence == null) {
                            charSequence = "";
                        }
                        if (c7206a != null) {
                            c7206a.f12986a = charSequence;
                            m5372a = c7206a.m5372a();
                        } else {
                            Pattern pattern = C7270f.f13335a;
                            C7270f.C7274d c7274d2 = new C7270f.C7274d();
                            c7274d2.f13350c = charSequence;
                            m5372a = c7274d2.m5288a().m5372a();
                        }
                        arrayList.add(m5372a);
                    } else {
                        c7436v.m5018A(m5015c);
                    }
                } else {
                    throw new C7234e("Incomplete Mp4Webvtt Top Level box header found.");
                }
            } else {
                return new C7266b(arrayList);
            }
        }
    }
}
