package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.google.android.exoplayer2.extractor.ts.l */
/* loaded from: classes.dex */
public final class C6931l implements InterfaceC6922h {

    /* renamed from: a */
    public final C6946x f11839a;

    /* renamed from: b */
    public String f11840b;

    /* renamed from: c */
    public TrackOutput f11841c;

    /* renamed from: d */
    public C6932a f11842d;

    /* renamed from: e */
    public boolean f11843e;

    /* renamed from: l */
    public long f11850l;

    /* renamed from: f */
    public final boolean[] f11844f = new boolean[3];

    /* renamed from: g */
    public final C6936p f11845g = new C6936p(32);

    /* renamed from: h */
    public final C6936p f11846h = new C6936p(33);

    /* renamed from: i */
    public final C6936p f11847i = new C6936p(34);

    /* renamed from: j */
    public final C6936p f11848j = new C6936p(39);

    /* renamed from: k */
    public final C6936p f11849k = new C6936p(40);

    /* renamed from: m */
    public long f11851m = -9223372036854775807L;

    /* renamed from: n */
    public final C7436v f11852n = new C7436v();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.l$a */
    /* loaded from: classes.dex */
    public static final class C6932a {

        /* renamed from: a */
        public final TrackOutput f11853a;

        /* renamed from: b */
        public long f11854b;

        /* renamed from: c */
        public boolean f11855c;

        /* renamed from: d */
        public int f11856d;

        /* renamed from: e */
        public long f11857e;

        /* renamed from: f */
        public boolean f11858f;

        /* renamed from: g */
        public boolean f11859g;

        /* renamed from: h */
        public boolean f11860h;

        /* renamed from: i */
        public boolean f11861i;

        /* renamed from: j */
        public boolean f11862j;

        /* renamed from: k */
        public long f11863k;

        /* renamed from: l */
        public long f11864l;

        /* renamed from: m */
        public boolean f11865m;

        public C6932a(TrackOutput trackOutput) {
            this.f11853a = trackOutput;
        }
    }

    public C6931l(C6946x c6946x) {
        this.f11839a = c6946x;
    }

    @RequiresNonNull({"sampleReader"})
    /* renamed from: a */
    public final void m5836a(int i, byte[] bArr, int i2) {
        boolean z;
        C6932a c6932a = this.f11842d;
        if (c6932a.f11858f) {
            int i3 = c6932a.f11856d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                if ((bArr[i4] & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c6932a.f11859g = z;
                c6932a.f11858f = false;
            } else {
                c6932a.f11856d = (i2 - i) + i3;
            }
        }
        if (!this.f11843e) {
            this.f11845g.m5830a(i, bArr, i2);
            this.f11846h.m5830a(i, bArr, i2);
            this.f11847i.m5830a(i, bArr, i2);
        }
        this.f11848j.m5830a(i, bArr, i2);
        this.f11849k.m5830a(i, bArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r32) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6931l.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11850l = 0L;
        this.f11851m = -9223372036854775807L;
        C7427r.m5039a(this.f11844f);
        this.f11845g.m5828c();
        this.f11846h.m5828c();
        this.f11847i.m5828c();
        this.f11848j.m5828c();
        this.f11849k.m5828c();
        C6932a c6932a = this.f11842d;
        if (c6932a != null) {
            c6932a.f11858f = false;
            c6932a.f11859g = false;
            c6932a.f11860h = false;
            c6932a.f11861i = false;
            c6932a.f11862j = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: d */
    public final void mo5833d() {
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: e */
    public final void mo5832e(InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        c6913d.m5845a();
        c6913d.m5844b();
        this.f11840b = c6913d.f11669e;
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 2);
        this.f11841c = mo5482p;
        this.f11842d = new C6932a(mo5482p);
        this.f11839a.m5816a(interfaceC6833i, c6913d);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11851m = j;
        }
    }
}
