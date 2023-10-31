package com.google.android.exoplayer2.extractor.p037ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.j */
/* loaded from: classes.dex */
public final class C6925j implements InterfaceC6922h {

    /* renamed from: l */
    public static final float[] f11764l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @Nullable

    /* renamed from: a */
    public final C6915a0 f11765a;

    /* renamed from: f */
    public C6927b f11770f;

    /* renamed from: g */
    public long f11771g;

    /* renamed from: h */
    public String f11772h;

    /* renamed from: i */
    public TrackOutput f11773i;

    /* renamed from: j */
    public boolean f11774j;

    /* renamed from: c */
    public final boolean[] f11767c = new boolean[4];

    /* renamed from: d */
    public final C6926a f11768d = new C6926a();

    /* renamed from: k */
    public long f11775k = -9223372036854775807L;
    @Nullable

    /* renamed from: e */
    public final C6936p f11769e = new C6936p(178);
    @Nullable

    /* renamed from: b */
    public final C7436v f11766b = new C7436v();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.j$a */
    /* loaded from: classes.dex */
    public static final class C6926a {

        /* renamed from: f */
        public static final byte[] f11776f = {0, 0, 1};

        /* renamed from: a */
        public boolean f11777a;

        /* renamed from: b */
        public int f11778b;

        /* renamed from: c */
        public int f11779c;

        /* renamed from: d */
        public int f11780d;

        /* renamed from: e */
        public byte[] f11781e = new byte[128];

        /* renamed from: a */
        public final void m5839a(int i, byte[] bArr, int i2) {
            if (this.f11777a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f11781e;
                int length = bArr2.length;
                int i4 = this.f11779c;
                if (length < i4 + i3) {
                    this.f11781e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f11781e, this.f11779c, i3);
                this.f11779c += i3;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.j$b */
    /* loaded from: classes.dex */
    public static final class C6927b {

        /* renamed from: a */
        public final TrackOutput f11782a;

        /* renamed from: b */
        public boolean f11783b;

        /* renamed from: c */
        public boolean f11784c;

        /* renamed from: d */
        public boolean f11785d;

        /* renamed from: e */
        public int f11786e;

        /* renamed from: f */
        public int f11787f;

        /* renamed from: g */
        public long f11788g;

        /* renamed from: h */
        public long f11789h;

        public C6927b(TrackOutput trackOutput) {
            this.f11782a = trackOutput;
        }

        /* renamed from: a */
        public final void m5838a(int i, byte[] bArr, int i2) {
            if (this.f11784c) {
                int i3 = this.f11787f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f11787f = (i2 - i) + i3;
                    return;
                }
                this.f11785d = ((bArr[i4] & 192) >> 6) == 0;
                this.f11784c = false;
            }
        }
    }

    public C6925j(@Nullable C6915a0 c6915a0) {
        this.f11765a = c6915a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r22) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6925j.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        C7427r.m5039a(this.f11767c);
        C6926a c6926a = this.f11768d;
        c6926a.f11777a = false;
        c6926a.f11779c = 0;
        c6926a.f11778b = 0;
        C6927b c6927b = this.f11770f;
        if (c6927b != null) {
            c6927b.f11783b = false;
            c6927b.f11784c = false;
            c6927b.f11785d = false;
            c6927b.f11786e = -1;
        }
        C6936p c6936p = this.f11769e;
        if (c6936p != null) {
            c6936p.m5828c();
        }
        this.f11771g = 0L;
        this.f11775k = -9223372036854775807L;
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
        this.f11772h = c6913d.f11669e;
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 2);
        this.f11773i = mo5482p;
        this.f11770f = new C6927b(mo5482p);
        C6915a0 c6915a0 = this.f11765a;
        if (c6915a0 != null) {
            c6915a0.m5842b(interfaceC6833i, c6913d);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11775k = j;
        }
    }
}
