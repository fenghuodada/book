package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.x */
/* loaded from: classes.dex */
public final class C6946x {

    /* renamed from: a */
    public final List<C7003m0> f11959a;

    /* renamed from: b */
    public final TrackOutput[] f11960b;

    public C6946x(List<C7003m0> list) {
        this.f11959a = list;
        this.f11960b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    public final void m5816a(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        boolean z;
        String str;
        int i = 0;
        while (true) {
            TrackOutput[] trackOutputArr = this.f11960b;
            if (i < trackOutputArr.length) {
                c6913d.m5845a();
                c6913d.m5844b();
                TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 3);
                C7003m0 c7003m0 = this.f11959a.get(i);
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
                String str3 = c7003m0.f12276a;
                if (str3 == null) {
                    c6913d.m5844b();
                    str3 = c6913d.f11669e;
                }
                C7003m0.C7005b c7005b = new C7003m0.C7005b();
                c7005b.f12306a = str3;
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
