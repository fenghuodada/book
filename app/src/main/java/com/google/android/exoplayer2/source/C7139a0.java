package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.RunnableC6543e;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.drm.InterfaceC6800u;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.icy.C7064b;
import com.google.android.exoplayer2.source.C7159e0;
import com.google.android.exoplayer2.source.C7171i;
import com.google.android.exoplayer2.source.InterfaceC7185n;
import com.google.android.exoplayer2.source.InterfaceC7196v;
import com.google.android.exoplayer2.trackselection.InterfaceC7296g;
import com.google.android.exoplayer2.upstream.C7349b0;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.C7375r;
import com.google.android.exoplayer2.upstream.C7385z;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.InterfaceC7363i;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7401d;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7424q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.google.android.exoplayer2.source.a0 */
/* loaded from: classes.dex */
public final class C7139a0 implements InterfaceC7185n, InterfaceC6833i, C7385z.InterfaceC7386a<C7140a>, C7385z.InterfaceC7390e, C7159e0.InterfaceC7162c {

    /* renamed from: M */
    public static final Map<String, String> f12704M;

    /* renamed from: N */
    public static final C7003m0 f12705N;

    /* renamed from: A */
    public boolean f12706A;

    /* renamed from: C */
    public boolean f12708C;

    /* renamed from: D */
    public boolean f12709D;

    /* renamed from: E */
    public int f12710E;

    /* renamed from: G */
    public long f12712G;

    /* renamed from: I */
    public boolean f12714I;

    /* renamed from: J */
    public int f12715J;

    /* renamed from: K */
    public boolean f12716K;

    /* renamed from: L */
    public boolean f12717L;

    /* renamed from: a */
    public final Uri f12718a;

    /* renamed from: b */
    public final InterfaceC7363i f12719b;

    /* renamed from: c */
    public final InterfaceC6792o f12720c;

    /* renamed from: d */
    public final LoadErrorHandlingPolicy f12721d;

    /* renamed from: e */
    public final InterfaceC7196v.C7197a f12722e;

    /* renamed from: f */
    public final InterfaceC6789n.C6790a f12723f;

    /* renamed from: g */
    public final InterfaceC7141b f12724g;

    /* renamed from: h */
    public final C7367l f12725h;
    @Nullable

    /* renamed from: i */
    public final String f12726i;

    /* renamed from: j */
    public final long f12727j;

    /* renamed from: l */
    public final InterfaceC7200x f12729l;
    @Nullable

    /* renamed from: q */
    public InterfaceC7185n.InterfaceC7186a f12734q;
    @Nullable

    /* renamed from: r */
    public C7064b f12735r;

    /* renamed from: u */
    public boolean f12738u;

    /* renamed from: v */
    public boolean f12739v;

    /* renamed from: w */
    public boolean f12740w;

    /* renamed from: x */
    public C7144e f12741x;

    /* renamed from: y */
    public InterfaceC6905t f12742y;

    /* renamed from: k */
    public final C7385z f12728k = new C7385z();

    /* renamed from: m */
    public final C7401d f12730m = new C7401d();

    /* renamed from: n */
    public final RunnableC7202y f12731n = new Runnable() { // from class: com.google.android.exoplayer2.source.y
        @Override // java.lang.Runnable
        public final void run() {
            C7139a0.this.m5477x();
        }
    };

    /* renamed from: o */
    public final RunnableC7203z f12732o = new Runnable() { // from class: com.google.android.exoplayer2.source.z
        @Override // java.lang.Runnable
        public final void run() {
            C7139a0 c7139a0 = C7139a0.this;
            if (!c7139a0.f12717L) {
                InterfaceC7185n.InterfaceC7186a interfaceC7186a = c7139a0.f12734q;
                interfaceC7186a.getClass();
                interfaceC7186a.mo5420a(c7139a0);
            }
        }
    };

    /* renamed from: p */
    public final Handler f12733p = C7408g0.m5097i(null);

    /* renamed from: t */
    public C7143d[] f12737t = new C7143d[0];

    /* renamed from: s */
    public C7159e0[] f12736s = new C7159e0[0];

    /* renamed from: H */
    public long f12713H = -9223372036854775807L;

    /* renamed from: F */
    public long f12711F = -1;

    /* renamed from: z */
    public long f12743z = -9223372036854775807L;

    /* renamed from: B */
    public int f12707B = 1;

    /* renamed from: com.google.android.exoplayer2.source.a0$a */
    /* loaded from: classes.dex */
    public final class C7140a implements C7385z.InterfaceC7389d, C7171i.InterfaceC7172a {

        /* renamed from: a */
        public final Uri f12744a;

        /* renamed from: b */
        public final C7349b0 f12745b;

        /* renamed from: c */
        public final InterfaceC7200x f12746c;

        /* renamed from: d */
        public final InterfaceC6833i f12747d;

        /* renamed from: e */
        public final C7401d f12748e;

        /* renamed from: g */
        public volatile boolean f12750g;

        /* renamed from: i */
        public long f12752i;

        /* renamed from: j */
        public DataSpec f12753j;
        @Nullable

        /* renamed from: l */
        public C7159e0 f12755l;

        /* renamed from: m */
        public boolean f12756m;

        /* renamed from: f */
        public final C6904s f12749f = new C6904s();

        /* renamed from: h */
        public boolean f12751h = true;

        /* renamed from: k */
        public long f12754k = -1;

        public C7140a(Uri uri, InterfaceC7363i interfaceC7363i, InterfaceC7200x interfaceC7200x, InterfaceC6833i interfaceC6833i, C7401d c7401d) {
            this.f12744a = uri;
            this.f12745b = new C7349b0(interfaceC7363i);
            this.f12746c = interfaceC7200x;
            this.f12747d = interfaceC6833i;
            this.f12748e = c7401d;
            C7174j.f12893a.getAndIncrement();
            this.f12753j = m5474a(0L);
        }

        /* renamed from: a */
        public final DataSpec m5474a(long j) {
            Collections.emptyMap();
            String str = C7139a0.this.f12726i;
            Map<String, String> map = C7139a0.f12704M;
            Uri uri = this.f12744a;
            C7394a.m5129f(uri, "The uri must be set.");
            return new DataSpec(uri, 0L, 1, null, map, j, -1L, str, 6, null);
        }

        /* renamed from: b */
        public final void m5473b() throws IOException {
            InterfaceC7363i interfaceC7363i;
            int i;
            int i2 = 0;
            while (i2 == 0 && !this.f12750g) {
                try {
                    long j = this.f12749f.f11618a;
                    DataSpec m5474a = m5474a(j);
                    this.f12753j = m5474a;
                    long mo5146g = this.f12745b.mo5146g(m5474a);
                    this.f12754k = mo5146g;
                    if (mo5146g != -1) {
                        this.f12754k = mo5146g + j;
                    }
                    C7139a0.this.f12735r = C7064b.m5534b(this.f12745b.mo5154h());
                    C7349b0 c7349b0 = this.f12745b;
                    C7064b c7064b = C7139a0.this.f12735r;
                    if (c7064b != null && (i = c7064b.f12533f) != -1) {
                        interfaceC7363i = new C7171i(c7349b0, i, this);
                        C7139a0 c7139a0 = C7139a0.this;
                        c7139a0.getClass();
                        C7159e0 m5487B = c7139a0.m5487B(new C7143d(0, true));
                        this.f12755l = m5487B;
                        m5487B.mo5451e(C7139a0.f12705N);
                    } else {
                        interfaceC7363i = c7349b0;
                    }
                    long j2 = j;
                    ((C7146b) this.f12746c).m5469b(interfaceC7363i, this.f12744a, this.f12745b.mo5154h(), j, this.f12754k, this.f12747d);
                    if (C7139a0.this.f12735r != null) {
                        Extractor extractor = ((C7146b) this.f12746c).f12782b;
                        if (extractor instanceof Mp3Extractor) {
                            ((Mp3Extractor) extractor).f11357r = true;
                        }
                    }
                    if (this.f12751h) {
                        InterfaceC7200x interfaceC7200x = this.f12746c;
                        long j3 = this.f12752i;
                        Extractor extractor2 = ((C7146b) interfaceC7200x).f12782b;
                        extractor2.getClass();
                        extractor2.mo5804g(j2, j3);
                        this.f12751h = false;
                    }
                    while (true) {
                        long j4 = j2;
                        while (i2 == 0 && !this.f12750g) {
                            try {
                                C7401d c7401d = this.f12748e;
                                synchronized (c7401d) {
                                    while (!c7401d.f13891a) {
                                        c7401d.wait();
                                    }
                                }
                                InterfaceC7200x interfaceC7200x2 = this.f12746c;
                                C6904s c6904s = this.f12749f;
                                C7146b c7146b = (C7146b) interfaceC7200x2;
                                Extractor extractor3 = c7146b.f12782b;
                                extractor3.getClass();
                                C6820e c6820e = c7146b.f12783c;
                                c6820e.getClass();
                                i2 = extractor3.mo5806e(c6820e, c6904s);
                                j2 = ((C7146b) this.f12746c).m5470a();
                                if (j2 > C7139a0.this.f12727j + j4) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f12748e.m5120b();
                        C7139a0 c7139a02 = C7139a0.this;
                        c7139a02.f12733p.post(c7139a02.f12732o);
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (((C7146b) this.f12746c).m5470a() != -1) {
                        this.f12749f.f11618a = ((C7146b) this.f12746c).m5470a();
                    }
                    C7349b0 c7349b02 = this.f12745b;
                    if (c7349b02 != null) {
                        try {
                            c7349b02.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (i2 != 1 && ((C7146b) this.f12746c).m5470a() != -1) {
                        this.f12749f.f11618a = ((C7146b) this.f12746c).m5470a();
                    }
                    C7349b0 c7349b03 = this.f12745b;
                    int i3 = C7408g0.f13905a;
                    if (c7349b03 != null) {
                        try {
                            c7349b03.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7141b {
    }

    /* renamed from: com.google.android.exoplayer2.source.a0$c */
    /* loaded from: classes.dex */
    public final class C7142c implements SampleStream {

        /* renamed from: a */
        public final int f12758a;

        public C7142c(int i) {
            this.f12758a = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ac A[Catch: all -> 0x012a, TryCatch #0 {, blocks: (B:11:0x002b, B:18:0x003c, B:21:0x0041, B:24:0x0047, B:44:0x00a1, B:51:0x00ae, B:53:0x00b6, B:55:0x00c6, B:59:0x00d1, B:62:0x00d8, B:64:0x00eb, B:50:0x00ac, B:27:0x004c, B:28:0x004f, B:30:0x005e, B:33:0x0063, B:35:0x006f, B:38:0x0075, B:40:0x0087, B:41:0x008c), top: B:89:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b6 A[Catch: all -> 0x012a, TryCatch #0 {, blocks: (B:11:0x002b, B:18:0x003c, B:21:0x0041, B:24:0x0047, B:44:0x00a1, B:51:0x00ae, B:53:0x00b6, B:55:0x00c6, B:59:0x00d1, B:62:0x00d8, B:64:0x00eb, B:50:0x00ac, B:27:0x004c, B:28:0x004f, B:30:0x005e, B:33:0x0063, B:35:0x006f, B:38:0x0075, B:40:0x0087, B:41:0x008c), top: B:89:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00eb A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x002b, B:18:0x003c, B:21:0x0041, B:24:0x0047, B:44:0x00a1, B:51:0x00ae, B:53:0x00b6, B:55:0x00c6, B:59:0x00d1, B:62:0x00d8, B:64:0x00eb, B:50:0x00ac, B:27:0x004c, B:28:0x004f, B:30:0x005e, B:33:0x0063, B:35:0x006f, B:38:0x0075, B:40:0x0087, B:41:0x008c), top: B:89:0x002b }] */
        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo5436a(com.google.android.exoplayer2.C7121n0 r17, com.google.android.exoplayer2.decoder.DecoderInputBuffer r18, int r19) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7139a0.C7142c.mo5436a(com.google.android.exoplayer2.n0, com.google.android.exoplayer2.decoder.DecoderInputBuffer, int):int");
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: b */
        public final void mo5435b() throws IOException {
            C7139a0 c7139a0 = C7139a0.this;
            C7159e0 c7159e0 = c7139a0.f12736s[this.f12758a];
            DrmSession drmSession = c7159e0.f12844i;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.C6760a error = c7159e0.f12844i.getError();
                error.getClass();
                throw error;
            }
            c7139a0.m5488A();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: c */
        public final int mo5434c(long j) {
            boolean z;
            C7139a0 c7139a0 = C7139a0.this;
            int i = this.f12758a;
            int i2 = 0;
            if (!c7139a0.m5485D()) {
                c7139a0.m5476y(i);
                C7159e0 c7159e0 = c7139a0.f12736s[i];
                boolean z2 = c7139a0.f12716K;
                synchronized (c7159e0) {
                    int m5445k = c7159e0.m5445k(c7159e0.f12855t);
                    int i3 = c7159e0.f12855t;
                    int i4 = c7159e0.f12852q;
                    if (i3 != i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && j >= c7159e0.f12850o[m5445k]) {
                        if (j > c7159e0.f12858w && z2) {
                            i2 = i4 - i3;
                        } else {
                            int m5448h = c7159e0.m5448h(m5445k, i4 - i3, j, true);
                            if (m5448h != -1) {
                                i2 = m5448h;
                            }
                        }
                    }
                }
                c7159e0.m5437s(i2);
                if (i2 == 0) {
                    c7139a0.m5475z(i);
                }
            }
            return i2;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        /* renamed from: d */
        public final boolean mo5433d() {
            C7139a0 c7139a0 = C7139a0.this;
            if (!c7139a0.m5485D() && c7139a0.f12736s[this.f12758a].m5443m(c7139a0.f12716K)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a0$d */
    /* loaded from: classes.dex */
    public static final class C7143d {

        /* renamed from: a */
        public final int f12760a;

        /* renamed from: b */
        public final boolean f12761b;

        public C7143d(int i, boolean z) {
            this.f12760a = i;
            this.f12761b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7143d.class != obj.getClass()) {
                return false;
            }
            C7143d c7143d = (C7143d) obj;
            return this.f12760a == c7143d.f12760a && this.f12761b == c7143d.f12761b;
        }

        public final int hashCode() {
            return (this.f12760a * 31) + (this.f12761b ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.a0$e */
    /* loaded from: classes.dex */
    public static final class C7144e {

        /* renamed from: a */
        public final C7178k0 f12762a;

        /* renamed from: b */
        public final boolean[] f12763b;

        /* renamed from: c */
        public final boolean[] f12764c;

        /* renamed from: d */
        public final boolean[] f12765d;

        public C7144e(C7178k0 c7178k0, boolean[] zArr) {
            this.f12762a = c7178k0;
            this.f12763b = zArr;
            int i = c7178k0.f12905a;
            this.f12764c = new boolean[i];
            this.f12765d = new boolean[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f12704M = Collections.unmodifiableMap(hashMap);
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12306a = "icy";
        c7005b.f12316k = "application/x-icy";
        f12705N = c7005b.m5614a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.exoplayer2.source.y] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.exoplayer2.source.z] */
    public C7139a0(Uri uri, InterfaceC7363i interfaceC7363i, C7146b c7146b, InterfaceC6792o interfaceC6792o, InterfaceC6789n.C6790a c6790a, LoadErrorHandlingPolicy loadErrorHandlingPolicy, InterfaceC7196v.C7197a c7197a, InterfaceC7141b interfaceC7141b, C7367l c7367l, @Nullable String str, int i) {
        this.f12718a = uri;
        this.f12719b = interfaceC7363i;
        this.f12720c = interfaceC6792o;
        this.f12723f = c6790a;
        this.f12721d = loadErrorHandlingPolicy;
        this.f12722e = c7197a;
        this.f12724g = interfaceC7141b;
        this.f12725h = c7367l;
        this.f12726i = str;
        this.f12727j = i;
        this.f12729l = c7146b;
    }

    /* renamed from: A */
    public final void m5488A() throws IOException {
        int i;
        int i2 = this.f12707B;
        ((C7375r) this.f12721d).getClass();
        if (i2 == 7) {
            i = 6;
        } else {
            i = 3;
        }
        C7385z c7385z = this.f12728k;
        IOException iOException = c7385z.f13857c;
        if (iOException == null) {
            C7385z.HandlerC7388c<? extends C7385z.InterfaceC7389d> handlerC7388c = c7385z.f13856b;
            if (handlerC7388c != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC7388c.f13860a;
                }
                IOException iOException2 = handlerC7388c.f13864e;
                if (iOException2 != null && handlerC7388c.f13865f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: B */
    public final C7159e0 m5487B(C7143d c7143d) {
        int length = this.f12736s.length;
        for (int i = 0; i < length; i++) {
            if (c7143d.equals(this.f12737t[i])) {
                return this.f12736s[i];
            }
        }
        Looper looper = this.f12733p.getLooper();
        looper.getClass();
        InterfaceC6792o interfaceC6792o = this.f12720c;
        interfaceC6792o.getClass();
        InterfaceC6789n.C6790a c6790a = this.f12723f;
        c6790a.getClass();
        C7159e0 c7159e0 = new C7159e0(this.f12725h, looper, interfaceC6792o, c6790a);
        c7159e0.f12842g = this;
        int i2 = length + 1;
        C7143d[] c7143dArr = (C7143d[]) Arrays.copyOf(this.f12737t, i2);
        c7143dArr[length] = c7143d;
        int i3 = C7408g0.f13905a;
        this.f12737t = c7143dArr;
        C7159e0[] c7159e0Arr = (C7159e0[]) Arrays.copyOf(this.f12736s, i2);
        c7159e0Arr[length] = c7159e0;
        this.f12736s = c7159e0Arr;
        return c7159e0;
    }

    /* renamed from: C */
    public final void m5486C() {
        int i;
        C7140a c7140a = new C7140a(this.f12718a, this.f12719b, this.f12729l, this, this.f12730m);
        if (this.f12739v) {
            C7394a.m5131d(m5478w());
            long j = this.f12743z;
            if (j != -9223372036854775807L && this.f12713H > j) {
                this.f12716K = true;
                this.f12713H = -9223372036854775807L;
                return;
            }
            InterfaceC6905t interfaceC6905t = this.f12742y;
            interfaceC6905t.getClass();
            long j2 = interfaceC6905t.mo5795h(this.f12713H).f11619a.f11976b;
            long j3 = this.f12713H;
            c7140a.f12749f.f11618a = j2;
            c7140a.f12752i = j3;
            c7140a.f12751h = true;
            c7140a.f12756m = false;
            for (C7159e0 c7159e0 : this.f12736s) {
                c7159e0.f12856u = this.f12713H;
            }
            this.f12713H = -9223372036854775807L;
        }
        this.f12715J = m5480u();
        int i2 = this.f12707B;
        ((C7375r) this.f12721d).getClass();
        if (i2 == 7) {
            i = 6;
        } else {
            i = 3;
        }
        C7385z c7385z = this.f12728k;
        c7385z.getClass();
        Looper myLooper = Looper.myLooper();
        C7394a.m5130e(myLooper);
        c7385z.f13857c = null;
        new C7385z.HandlerC7388c(myLooper, c7140a, this, i, SystemClock.elapsedRealtime()).m5137b(0L);
        C7174j c7174j = new C7174j(c7140a.f12753j);
        long j4 = c7140a.f12752i;
        long j5 = this.f12743z;
        InterfaceC7196v.C7197a c7197a = this.f12722e;
        c7197a.m5373f(c7174j, new C7184m(1, -1, null, 0, null, c7197a.m5378a(j4), c7197a.m5378a(j5)));
    }

    /* renamed from: D */
    public final boolean m5485D() {
        return this.f12709D || m5478w();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: a */
    public final void mo5484a(InterfaceC6905t interfaceC6905t) {
        this.f12733p.post(new RunnableC6543e(1, this, interfaceC6905t));
    }

    @Override // com.google.android.exoplayer2.upstream.C7385z.InterfaceC7386a
    /* renamed from: b */
    public final void mo5141b(C7140a c7140a, long j, long j2, boolean z) {
        C7140a c7140a2 = c7140a;
        Uri uri = c7140a2.f12745b.f13738c;
        C7174j c7174j = new C7174j();
        this.f12721d.getClass();
        long j3 = c7140a2.f12752i;
        long j4 = this.f12743z;
        InterfaceC7196v.C7197a c7197a = this.f12722e;
        c7197a.m5376c(c7174j, new C7184m(1, -1, null, 0, null, c7197a.m5378a(j3), c7197a.m5378a(j4)));
        if (!z) {
            if (this.f12711F == -1) {
                this.f12711F = c7140a2.f12754k;
            }
            for (C7159e0 c7159e0 : this.f12736s) {
                c7159e0.m5441o(false);
            }
            if (this.f12710E > 0) {
                InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12734q;
                interfaceC7186a.getClass();
                interfaceC7186a.mo5420a(this);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: c */
    public final long mo5408c() {
        if (this.f12710E == 0) {
            return Long.MIN_VALUE;
        }
        return mo5398q();
    }

    @Override // com.google.android.exoplayer2.upstream.C7385z.InterfaceC7386a
    /* renamed from: d */
    public final void mo5140d(C7140a c7140a, long j, long j2) {
        InterfaceC6905t interfaceC6905t;
        long j3;
        C7140a c7140a2 = c7140a;
        if (this.f12743z == -9223372036854775807L && (interfaceC6905t = this.f12742y) != null) {
            boolean mo5796c = interfaceC6905t.mo5796c();
            long m5479v = m5479v();
            if (m5479v == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = m5479v + 10000;
            }
            this.f12743z = j3;
            ((C7147b0) this.f12724g).m5467t(j3, mo5796c, this.f12706A);
        }
        Uri uri = c7140a2.f12745b.f13738c;
        C7174j c7174j = new C7174j();
        this.f12721d.getClass();
        long j4 = c7140a2.f12752i;
        long j5 = this.f12743z;
        InterfaceC7196v.C7197a c7197a = this.f12722e;
        c7197a.m5375d(c7174j, new C7184m(1, -1, null, 0, null, c7197a.m5378a(j4), c7197a.m5378a(j5)));
        if (this.f12711F == -1) {
            this.f12711F = c7140a2.f12754k;
        }
        this.f12716K = true;
        InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12734q;
        interfaceC7186a.getClass();
        interfaceC7186a.mo5420a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: e */
    public final void mo5407e() throws IOException {
        m5488A();
        if (this.f12716K && !this.f12739v) {
            throw C7506y0.m4869a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: f */
    public final long mo5406f(long j) {
        boolean z;
        m5481t();
        boolean[] zArr = this.f12741x.f12763b;
        if (!this.f12742y.mo5796c()) {
            j = 0;
        }
        this.f12709D = false;
        this.f12712G = j;
        if (m5478w()) {
            this.f12713H = j;
            return j;
        }
        boolean z2 = true;
        if (this.f12707B != 7) {
            int length = this.f12736s.length;
            for (int i = 0; i < length; i++) {
                if (!this.f12736s[i].m5438r(j, false) && (zArr[i] || !this.f12740w)) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return j;
            }
        }
        this.f12714I = false;
        this.f12713H = j;
        this.f12716K = false;
        C7385z c7385z = this.f12728k;
        if (c7385z.f13856b == null) {
            z2 = false;
        }
        if (z2) {
            for (C7159e0 c7159e0 : this.f12736s) {
                c7159e0.m5449g();
            }
            C7385z.HandlerC7388c<? extends C7385z.InterfaceC7389d> handlerC7388c = c7385z.f13856b;
            C7394a.m5130e(handlerC7388c);
            handlerC7388c.m5138a(false);
        } else {
            c7385z.f13857c = null;
            for (C7159e0 c7159e02 : this.f12736s) {
                c7159e02.m5441o(false);
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: g */
    public final boolean mo5405g(long j) {
        boolean z;
        boolean z2 = false;
        if (!this.f12716K) {
            C7385z c7385z = this.f12728k;
            if (c7385z.f13857c != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.f12714I && (!this.f12739v || this.f12710E != 0)) {
                boolean m5119c = this.f12730m.m5119c();
                if (c7385z.f13856b != null) {
                    z2 = true;
                }
                if (!z2) {
                    m5486C();
                    return true;
                }
                return m5119c;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: h */
    public final boolean mo5404h() {
        boolean z;
        boolean z2;
        if (this.f12728k.f13856b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C7401d c7401d = this.f12730m;
            synchronized (c7401d) {
                z2 = c7401d.f13891a;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (java.lang.Math.abs(r7 - r18) <= java.lang.Math.abs(r9 - r18)) goto L31;
     */
    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5403i(long r18, com.google.android.exoplayer2.C6966f1 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r17.m5481t()
            com.google.android.exoplayer2.extractor.t r4 = r0.f12742y
            boolean r4 = r4.mo5796c()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.google.android.exoplayer2.extractor.t r4 = r0.f12742y
            com.google.android.exoplayer2.extractor.t$a r4 = r4.mo5795h(r1)
            com.google.android.exoplayer2.extractor.u r7 = r4.f11619a
            long r7 = r7.f11975a
            com.google.android.exoplayer2.extractor.u r4 = r4.f11620b
            long r9 = r4.f11975a
            long r11 = r3.f12032a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            long r13 = r3.f12033b
            if (r4 != 0) goto L2f
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L2f
            goto L81
        L2f:
            int r3 = com.google.android.exoplayer2.util.C7408g0.f13905a
            long r3 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r3
            long r11 = r11 & r15
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r3 = -9223372036854775808
        L3d:
            long r11 = r1 + r13
            long r15 = r1 ^ r11
            long r13 = r13 ^ r11
            long r13 = r13 & r15
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r6 = 1
            r13 = 0
            if (r5 > 0) goto L58
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L58
            r5 = r6
            goto L59
        L58:
            r5 = r13
        L59:
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 > 0) goto L62
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 > 0) goto L62
            goto L63
        L62:
            r6 = r13
        L63:
            if (r5 == 0) goto L78
            if (r6 == 0) goto L78
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7e
            goto L7a
        L78:
            if (r5 == 0) goto L7c
        L7a:
            r1 = r7
            goto L81
        L7c:
            if (r6 == 0) goto L80
        L7e:
            r1 = r9
            goto L81
        L80:
            r1 = r3
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7139a0.mo5403i(long, com.google.android.exoplayer2.f1):long");
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: j */
    public final void mo5483j() {
        this.f12738u = true;
        this.f12733p.post(this.f12731n);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: k */
    public final long mo5402k() {
        if (this.f12709D) {
            if (this.f12716K || m5480u() > this.f12715J) {
                this.f12709D = false;
                return this.f12712G;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: l */
    public final void mo5401l(InterfaceC7185n.InterfaceC7186a interfaceC7186a, long j) {
        this.f12734q = interfaceC7186a;
        this.f12730m.m5119c();
        m5486C();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: m */
    public final long mo5400m(InterfaceC7296g[] interfaceC7296gArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        boolean[] zArr3;
        boolean z;
        boolean z2;
        InterfaceC7296g interfaceC7296g;
        boolean z3;
        boolean z4;
        m5481t();
        C7144e c7144e = this.f12741x;
        C7178k0 c7178k0 = c7144e.f12762a;
        int i = this.f12710E;
        int i2 = 0;
        while (true) {
            int length = interfaceC7296gArr.length;
            zArr3 = c7144e.f12764c;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            if (sampleStream != null && (interfaceC7296gArr[i2] == null || !zArr[i2])) {
                int i3 = ((C7142c) sampleStream).f12758a;
                C7394a.m5131d(zArr3[i3]);
                this.f12710E--;
                zArr3[i3] = false;
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        if (!this.f12708C ? j != 0 : i == 0) {
            z = true;
        } else {
            z = false;
        }
        for (int i4 = 0; i4 < interfaceC7296gArr.length; i4++) {
            if (sampleStreamArr[i4] == null && (interfaceC7296g = interfaceC7296gArr[i4]) != null) {
                if (interfaceC7296g.length() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C7394a.m5131d(z3);
                if (interfaceC7296g.mo5258h(0) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C7394a.m5131d(z4);
                C7175j0 mo5260b = interfaceC7296g.mo5260b();
                int i5 = 0;
                while (true) {
                    if (i5 < c7178k0.f12905a) {
                        if (c7178k0.f12906b[i5] == mo5260b) {
                            break;
                        }
                        i5++;
                    } else {
                        i5 = -1;
                        break;
                    }
                }
                C7394a.m5131d(!zArr3[i5]);
                this.f12710E++;
                zArr3[i5] = true;
                sampleStreamArr[i4] = new C7142c(i5);
                zArr2[i4] = true;
                if (!z) {
                    C7159e0 c7159e0 = this.f12736s[i5];
                    if (!c7159e0.m5438r(j, true) && c7159e0.f12853r + c7159e0.f12855t != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        }
        if (this.f12710E == 0) {
            this.f12714I = false;
            this.f12709D = false;
            C7385z c7385z = this.f12728k;
            if (c7385z.f13856b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (C7159e0 c7159e02 : this.f12736s) {
                    c7159e02.m5449g();
                }
                C7385z.HandlerC7388c<? extends C7385z.InterfaceC7389d> handlerC7388c = c7385z.f13856b;
                C7394a.m5130e(handlerC7388c);
                handlerC7388c.m5138a(false);
            } else {
                for (C7159e0 c7159e03 : this.f12736s) {
                    c7159e03.m5441o(false);
                }
            }
        } else if (z) {
            j = mo5406f(j);
            for (int i6 = 0; i6 < sampleStreamArr.length; i6++) {
                if (sampleStreamArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f12708C = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: n */
    public final C7178k0 mo5399n() {
        m5481t();
        return this.f12741x.f12762a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    @Override // com.google.android.exoplayer2.upstream.C7385z.InterfaceC7386a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.upstream.C7385z.C7387b mo5139o(com.google.android.exoplayer2.source.C7139a0.C7140a r21, long r22, long r24, java.io.IOException r26, int r27) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7139a0.mo5139o(com.google.android.exoplayer2.upstream.z$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.z$b");
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC6833i
    /* renamed from: p */
    public final TrackOutput mo5482p(int i, int i2) {
        return m5487B(new C7143d(i, false));
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: q */
    public final long mo5398q() {
        long j;
        boolean z;
        m5481t();
        boolean[] zArr = this.f12741x.f12763b;
        if (this.f12716K) {
            return Long.MIN_VALUE;
        }
        if (m5478w()) {
            return this.f12713H;
        }
        if (this.f12740w) {
            int length = this.f12736s.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    C7159e0 c7159e0 = this.f12736s[i];
                    synchronized (c7159e0) {
                        z = c7159e0.f12859x;
                    }
                    if (!z) {
                        j = Math.min(j, this.f12736s[i].m5447i());
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m5479v();
        }
        if (j == Long.MIN_VALUE) {
            return this.f12712G;
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: r */
    public final void mo5397r(long j, boolean z) {
        long j2;
        int i;
        int i2;
        m5481t();
        if (m5478w()) {
            return;
        }
        boolean[] zArr = this.f12741x.f12764c;
        int length = this.f12736s.length;
        for (int i3 = 0; i3 < length; i3++) {
            C7159e0 c7159e0 = this.f12736s[i3];
            boolean z2 = zArr[i3];
            C7154d0 c7154d0 = c7159e0.f12836a;
            synchronized (c7159e0) {
                int i4 = c7159e0.f12852q;
                if (i4 != 0) {
                    long[] jArr = c7159e0.f12850o;
                    int i5 = c7159e0.f12854s;
                    if (j >= jArr[i5]) {
                        if (z2 && (i2 = c7159e0.f12855t) != i4) {
                            i = i2 + 1;
                        } else {
                            i = i4;
                        }
                        int m5448h = c7159e0.m5448h(i5, i, j, z);
                        if (m5448h != -1) {
                            j2 = c7159e0.m5450f(m5448h);
                        }
                    }
                }
                j2 = -1;
            }
            c7154d0.m5465a(j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC7185n
    /* renamed from: s */
    public final void mo5396s(long j) {
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: t */
    public final void m5481t() {
        C7394a.m5131d(this.f12739v);
        this.f12741x.getClass();
        this.f12742y.getClass();
    }

    /* renamed from: u */
    public final int m5480u() {
        C7159e0[] c7159e0Arr;
        int i = 0;
        for (C7159e0 c7159e0 : this.f12736s) {
            i += c7159e0.f12853r + c7159e0.f12852q;
        }
        return i;
    }

    /* renamed from: v */
    public final long m5479v() {
        long j = Long.MIN_VALUE;
        for (C7159e0 c7159e0 : this.f12736s) {
            j = Math.max(j, c7159e0.m5447i());
        }
        return j;
    }

    /* renamed from: w */
    public final boolean m5478w() {
        return this.f12713H != -9223372036854775807L;
    }

    /* renamed from: x */
    public final void m5477x() {
        boolean z;
        C7042a m5539b;
        int i;
        if (!this.f12717L && !this.f12739v && this.f12738u && this.f12742y != null) {
            for (C7159e0 c7159e0 : this.f12736s) {
                if (c7159e0.m5444l() == null) {
                    return;
                }
            }
            C7401d c7401d = this.f12730m;
            synchronized (c7401d) {
                c7401d.f13891a = false;
            }
            int length = this.f12736s.length;
            C7175j0[] c7175j0Arr = new C7175j0[length];
            boolean[] zArr = new boolean[length];
            for (int i2 = 0; i2 < length; i2++) {
                C7003m0 m5444l = this.f12736s[i2].m5444l();
                m5444l.getClass();
                String str = m5444l.f12287l;
                boolean m5042h = C7424q.m5042h(str);
                if (!m5042h && !C7424q.m5040j(str)) {
                    z = false;
                } else {
                    z = true;
                }
                zArr[i2] = z;
                this.f12740w = z | this.f12740w;
                C7064b c7064b = this.f12735r;
                if (c7064b != null) {
                    if (m5042h || this.f12737t[i2].f12761b) {
                        C7042a c7042a = m5444l.f12285j;
                        if (c7042a == null) {
                            m5539b = new C7042a(c7064b);
                        } else {
                            m5539b = c7042a.m5539b(c7064b);
                        }
                        C7003m0.C7005b c7005b = new C7003m0.C7005b(m5444l);
                        c7005b.f12314i = m5539b;
                        m5444l = new C7003m0(c7005b);
                    }
                    if (m5042h && m5444l.f12281f == -1 && m5444l.f12282g == -1 && (i = c7064b.f12528a) != -1) {
                        C7003m0.C7005b c7005b2 = new C7003m0.C7005b(m5444l);
                        c7005b2.f12311f = i;
                        m5444l = new C7003m0(c7005b2);
                    }
                }
                Class<? extends InterfaceC6800u> mo5984c = this.f12720c.mo5984c(m5444l);
                C7003m0.C7005b m5616b = m5444l.m5616b();
                m5616b.f12305D = mo5984c;
                c7175j0Arr[i2] = new C7175j0(m5616b.m5614a());
            }
            this.f12741x = new C7144e(new C7178k0(c7175j0Arr), zArr);
            this.f12739v = true;
            InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12734q;
            interfaceC7186a.getClass();
            interfaceC7186a.mo5395b(this);
        }
    }

    /* renamed from: y */
    public final void m5476y(int i) {
        m5481t();
        C7144e c7144e = this.f12741x;
        boolean[] zArr = c7144e.f12765d;
        if (!zArr[i]) {
            C7003m0 c7003m0 = c7144e.f12762a.f12906b[i].f12895b[0];
            int m5043g = C7424q.m5043g(c7003m0.f12287l);
            long j = this.f12712G;
            InterfaceC7196v.C7197a c7197a = this.f12722e;
            c7197a.m5377b(new C7184m(1, m5043g, c7003m0, 0, null, c7197a.m5378a(j), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    /* renamed from: z */
    public final void m5475z(int i) {
        m5481t();
        boolean[] zArr = this.f12741x.f12763b;
        if (this.f12714I && zArr[i] && !this.f12736s[i].m5443m(false)) {
            this.f12713H = 0L;
            this.f12714I = false;
            this.f12709D = true;
            this.f12712G = 0L;
            this.f12715J = 0;
            for (C7159e0 c7159e0 : this.f12736s) {
                c7159e0.m5441o(false);
            }
            InterfaceC7185n.InterfaceC7186a interfaceC7186a = this.f12734q;
            interfaceC7186a.getClass();
            interfaceC7186a.mo5420a(this);
        }
    }
}
