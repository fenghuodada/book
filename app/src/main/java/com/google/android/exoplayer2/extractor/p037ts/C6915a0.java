package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.C6817b;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7436v;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.a0 */
/* loaded from: classes.dex */
public final class C6915a0 {

    /* renamed from: a */
    public final List<C7003m0> f11673a;

    /* renamed from: b */
    public final TrackOutput[] f11674b;

    public C6915a0(List<C7003m0> list) {
        this.f11673a = list;
        this.f11674b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public final void m5843a(long j, C7436v c7436v) {
        if (c7436v.f13980c - c7436v.f13979b < 9) {
            return;
        }
        int m5015c = c7436v.m5015c();
        int m5015c2 = c7436v.m5015c();
        int m5002p = c7436v.m5002p();
        if (m5015c == 434 && m5015c2 == 1195456820 && m5002p == 3) {
            C6817b.m5951b(j, c7436v, this.f11674b);
        }
    }

    /* renamed from: b */
    public final void m5842b(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        boolean z;
        String str;
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f11674b;
            if (i < trackOutputArr.length) {
                c6913d.m5845a();
                c6913d.m5844b();
                TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 3);
                C7003m0 c7003m0 = this.f11673a.get(i);
                String str2 = c7003m0.f12287l;
                if (!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) {
                    z = false;
                } else {
                    z = true;
                }
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "Invalid closed caption mime type provided: ".concat(valueOf);
                } else {
                    str = new String("Invalid closed caption mime type provided: ");
                }
                C7394a.m5133b(z, str);
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c6913d.m5844b();
                c7005b.f12306a = c6913d.f11669e;
                c7005b.f12316k = str2;
                c7005b.f12309d = c7003m0.f12279d;
                c7005b.f12308c = c7003m0.f12278c;
                c7005b.f12304C = c7003m0.f12273D;
                c7005b.f12318m = c7003m0.f12289n;
                mo5482p.mo5451e(new C7003m0(c7005b));
                trackOutputArr[i] = mo5482p;
                i++;
            } else {
                return;
            }
        }
    }
}
