package com.google.android.exoplayer2.extractor.p037ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import com.google.android.exoplayer2.util.C7437w;

/* renamed from: com.google.android.exoplayer2.extractor.ts.k */
/* loaded from: classes.dex */
public final class C6928k implements InterfaceC6922h {

    /* renamed from: a */
    public final C6946x f11790a;

    /* renamed from: b */
    public final boolean f11791b;

    /* renamed from: c */
    public final boolean f11792c;

    /* renamed from: g */
    public long f11796g;

    /* renamed from: i */
    public String f11798i;

    /* renamed from: j */
    public TrackOutput f11799j;

    /* renamed from: k */
    public C6929a f11800k;

    /* renamed from: l */
    public boolean f11801l;

    /* renamed from: n */
    public boolean f11803n;

    /* renamed from: h */
    public final boolean[] f11797h = new boolean[3];

    /* renamed from: d */
    public final C6936p f11793d = new C6936p(7);

    /* renamed from: e */
    public final C6936p f11794e = new C6936p(8);

    /* renamed from: f */
    public final C6936p f11795f = new C6936p(6);

    /* renamed from: m */
    public long f11802m = -9223372036854775807L;

    /* renamed from: o */
    public final C7436v f11804o = new C7436v();

    /* renamed from: com.google.android.exoplayer2.extractor.ts.k$a */
    /* loaded from: classes.dex */
    public static final class C6929a {

        /* renamed from: a */
        public final TrackOutput f11805a;

        /* renamed from: b */
        public final boolean f11806b;

        /* renamed from: c */
        public final boolean f11807c;

        /* renamed from: f */
        public final C7437w f11810f;

        /* renamed from: g */
        public byte[] f11811g;

        /* renamed from: h */
        public int f11812h;

        /* renamed from: i */
        public int f11813i;

        /* renamed from: j */
        public long f11814j;

        /* renamed from: l */
        public long f11816l;

        /* renamed from: p */
        public long f11820p;

        /* renamed from: q */
        public long f11821q;

        /* renamed from: r */
        public boolean f11822r;

        /* renamed from: d */
        public final SparseArray<C7427r.C7429b> f11808d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C7427r.C7428a> f11809e = new SparseArray<>();

        /* renamed from: m */
        public C6930a f11817m = new C6930a();

        /* renamed from: n */
        public C6930a f11818n = new C6930a();

        /* renamed from: k */
        public boolean f11815k = false;

        /* renamed from: o */
        public boolean f11819o = false;

        /* renamed from: com.google.android.exoplayer2.extractor.ts.k$a$a */
        /* loaded from: classes.dex */
        public static final class C6930a {

            /* renamed from: a */
            public boolean f11823a;

            /* renamed from: b */
            public boolean f11824b;
            @Nullable

            /* renamed from: c */
            public C7427r.C7429b f11825c;

            /* renamed from: d */
            public int f11826d;

            /* renamed from: e */
            public int f11827e;

            /* renamed from: f */
            public int f11828f;

            /* renamed from: g */
            public int f11829g;

            /* renamed from: h */
            public boolean f11830h;

            /* renamed from: i */
            public boolean f11831i;

            /* renamed from: j */
            public boolean f11832j;

            /* renamed from: k */
            public boolean f11833k;

            /* renamed from: l */
            public int f11834l;

            /* renamed from: m */
            public int f11835m;

            /* renamed from: n */
            public int f11836n;

            /* renamed from: o */
            public int f11837o;

            /* renamed from: p */
            public int f11838p;
        }

        public C6929a(TrackOutput trackOutput, boolean z, boolean z2) {
            this.f11805a = trackOutput;
            this.f11806b = z;
            this.f11807c = z2;
            byte[] bArr = new byte[128];
            this.f11811g = bArr;
            this.f11810f = new C7437w(bArr, 0, 0);
            C6930a c6930a = this.f11818n;
            c6930a.f11824b = false;
            c6930a.f11823a = false;
        }
    }

    public C6928k(C6946x c6946x, boolean z, boolean z2) {
        this.f11790a = c6946x;
        this.f11791b = z;
        this.f11792c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5837a(int r18, byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6928k.m5837a(int, byte[], int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0267, code lost:
        if (r1 != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01af, code lost:
        if (r6.f11836n != r7.f11836n) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c0, code lost:
        if (r6.f11838p != r7.f11838p) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ce, code lost:
        if (r6.f11834l != r7.f11834l) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
        if (r6 == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0217  */
    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5835b(com.google.android.exoplayer2.util.C7436v r28) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.C6928k.mo5835b(com.google.android.exoplayer2.util.v):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: c */
    public final void mo5834c() {
        this.f11796g = 0L;
        this.f11803n = false;
        this.f11802m = -9223372036854775807L;
        C7427r.m5039a(this.f11797h);
        this.f11793d.m5828c();
        this.f11794e.m5828c();
        this.f11795f.m5828c();
        C6929a c6929a = this.f11800k;
        if (c6929a != null) {
            c6929a.f11815k = false;
            c6929a.f11819o = false;
            C6929a.C6930a c6930a = c6929a.f11818n;
            c6930a.f11824b = false;
            c6930a.f11823a = false;
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
        this.f11798i = c6913d.f11669e;
        c6913d.m5844b();
        TrackOutput mo5482p = interfaceC6833i.mo5482p(c6913d.f11668d, 2);
        this.f11799j = mo5482p;
        this.f11800k = new C6929a(mo5482p, this.f11791b, this.f11792c);
        this.f11790a.m5816a(interfaceC6833i, c6913d);
    }

    @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6922h
    /* renamed from: f */
    public final void mo5831f(int i, long j) {
        if (j != -9223372036854775807L) {
            this.f11802m = j;
        }
        this.f11803n = ((i & 2) != 0) | this.f11803n;
    }
}
