package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.i */
/* loaded from: classes.dex */
public final class C6923i implements InterfaceC6922h {

    /* renamed from: q */
    public static final double[] f11742q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f11743a;

    /* renamed from: b */
    public TrackOutput f11744b;
    @Nullable

    /* renamed from: c */
    public final C6915a0 f11745c;
    @Nullable

    /* renamed from: d */
    public final C7436v f11746d;
    @Nullable

    /* renamed from: e */
    public final C6936p f11747e;

    /* renamed from: f */
    public final boolean[] f11748f = new boolean[4];

    /* renamed from: g */
    public final C6924a f11749g = new C6924a();

    /* renamed from: h */
    public long f11750h;

    /* renamed from: i */
    public boolean f11751i;

    /* renamed from: j */
    public boolean f11752j;

    /* renamed from: k */
    public long f11753k;

    /* renamed from: l */
    public long f11754l;

    /* renamed from: m */
    public long f11755m;

    /* renamed from: n */
    public long f11756n;

    /* renamed from: o */
    public boolean f11757o;

    /* renamed from: p */
    public boolean f11758p;

    /* renamed from: com.google.android.exoplayer2.extractor.ts.i$a */
    /* loaded from: classes.dex */
    public static final class C6924a {

        /* renamed from: e */
        public static final byte[] f11759e = {0, 0, 1};

        /* renamed from: a */
        public boolean f11760a;

        /* renamed from: b */
        public int f11761b;

        /* renamed from: c */
        public int f11762c;

        /* renamed from: d */
        public byte[] f11763d = new byte[128];

        /* renamed from: a */
        public final void m5840a(int i, byte[] bArr, int i2) {
            if (this.f11760a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f11763d;
                int length = bArr2.length;
                int i4 = this.f11761b;
                if (length < i4 + i3) {
                    this.f11763d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f11763d, this.f11761b, i3);
                this.f11761b += i3;
            }
        }
    }

    public C6923i(@Nullable C6915a0 c6915a0) {
        C7436v c7436v;
        this.f11745c = c6915a0;
        if (c6915a0 != null) {
            this.f11747e = new C6936p(178);
            c7436v = new C7436v();
        } else {
            c7436v = null;
            this.f11747e = null;
        }
        this.f11746d = c7436v;
        this.f11754l = -9223372036854775807L;
        this.f11756n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r21) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6923i.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        C7427r.m5039a(this.f11748f);
        C6924a c6924a = this.f11749g;
        c6924a.f11760a = false;
        c6924a.f11761b = 0;
        c6924a.f11762c = 0;
        C6936p c6936p = this.f11747e;
        if (c6936p != null) {
            c6936p.m5828c();
        }
        this.f11750h = 0L;
        this.f11751i = false;
        this.f11754l = -9223372036854775807L;
        this.f11756n = -9223372036854775807L;
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
        this.f11743a = c6913d.f11669e;
        c6913d.m5844b();
        this.f11744b = interfaceC6833i.mo5482p(c6913d.f11668d, 2);
        C6915a0 c6915a0 = this.f11745c;
        if (c6915a0 != null) {
            c6915a0.m5842b(interfaceC6833i, c6913d);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        this.f11754l = j;
    }
}
