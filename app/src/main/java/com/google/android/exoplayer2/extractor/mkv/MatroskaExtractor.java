package com.google.android.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.analytics.C6660u;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7422o;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.p064ws.RealWebSocket;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class MatroskaExtractor implements Extractor {

    /* renamed from: b0 */
    public static final byte[] f11207b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0 */
    public static final byte[] f11208c0 = C7408g0.m5088r("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    public static final byte[] f11209d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0 */
    public static final UUID f11210e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0 */
    public static final Map<String, Integer> f11211f0;

    /* renamed from: A */
    public long f11212A;

    /* renamed from: B */
    public long f11213B;
    @Nullable

    /* renamed from: C */
    public C7422o f11214C;
    @Nullable

    /* renamed from: D */
    public C7422o f11215D;

    /* renamed from: E */
    public boolean f11216E;

    /* renamed from: F */
    public boolean f11217F;

    /* renamed from: G */
    public int f11218G;

    /* renamed from: H */
    public long f11219H;

    /* renamed from: I */
    public long f11220I;

    /* renamed from: J */
    public int f11221J;

    /* renamed from: K */
    public int f11222K;

    /* renamed from: L */
    public int[] f11223L;

    /* renamed from: M */
    public int f11224M;

    /* renamed from: N */
    public int f11225N;

    /* renamed from: O */
    public int f11226O;

    /* renamed from: P */
    public int f11227P;

    /* renamed from: Q */
    public boolean f11228Q;

    /* renamed from: R */
    public int f11229R;

    /* renamed from: S */
    public int f11230S;

    /* renamed from: T */
    public int f11231T;

    /* renamed from: U */
    public boolean f11232U;

    /* renamed from: V */
    public boolean f11233V;

    /* renamed from: W */
    public boolean f11234W;

    /* renamed from: X */
    public int f11235X;

    /* renamed from: Y */
    public byte f11236Y;

    /* renamed from: Z */
    public boolean f11237Z;

    /* renamed from: a */
    public final InterfaceC6852b f11238a;

    /* renamed from: a0 */
    public InterfaceC6833i f11239a0;

    /* renamed from: b */
    public final C6854d f11240b;

    /* renamed from: c */
    public final SparseArray<C6848b> f11241c;

    /* renamed from: d */
    public final boolean f11242d;

    /* renamed from: e */
    public final C7436v f11243e;

    /* renamed from: f */
    public final C7436v f11244f;

    /* renamed from: g */
    public final C7436v f11245g;

    /* renamed from: h */
    public final C7436v f11246h;

    /* renamed from: i */
    public final C7436v f11247i;

    /* renamed from: j */
    public final C7436v f11248j;

    /* renamed from: k */
    public final C7436v f11249k;

    /* renamed from: l */
    public final C7436v f11250l;

    /* renamed from: m */
    public final C7436v f11251m;

    /* renamed from: n */
    public final C7436v f11252n;

    /* renamed from: o */
    public ByteBuffer f11253o;

    /* renamed from: p */
    public long f11254p;

    /* renamed from: q */
    public long f11255q;

    /* renamed from: r */
    public long f11256r;

    /* renamed from: s */
    public long f11257s;

    /* renamed from: t */
    public long f11258t;
    @Nullable

    /* renamed from: u */
    public C6848b f11259u;

    /* renamed from: v */
    public boolean f11260v;

    /* renamed from: w */
    public int f11261w;

    /* renamed from: x */
    public long f11262x;

    /* renamed from: y */
    public boolean f11263y;

    /* renamed from: z */
    public long f11264z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$a */
    /* loaded from: classes.dex */
    public final class C6847a implements EbmlProcessor {
        public C6847a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:478:0x0893, code lost:
            if (r0.m5008j() == r3.getLeastSignificantBits()) goto L340;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:482:0x089a  */
        /* JADX WARN: Removed duplicated region for block: B:487:0x08c2  */
        /* JADX WARN: Removed duplicated region for block: B:500:0x08f2  */
        /* JADX WARN: Removed duplicated region for block: B:505:0x0909  */
        /* JADX WARN: Removed duplicated region for block: B:506:0x090b  */
        /* JADX WARN: Removed duplicated region for block: B:509:0x0918  */
        /* JADX WARN: Removed duplicated region for block: B:510:0x0925  */
        /* JADX WARN: Removed duplicated region for block: B:598:0x0ada  */
        /* JADX WARN: Type inference failed for: r0v82 */
        /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.RuntimeException] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m5909a(int r41) throws com.google.android.exoplayer2.C7506y0 {
            /*
                Method dump skipped, instructions count: 3332
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C6847a.m5909a(int):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$b */
    /* loaded from: classes.dex */
    public static final class C6848b {

        /* renamed from: N */
        public byte[] f11279N;

        /* renamed from: T */
        public C6849c f11285T;

        /* renamed from: U */
        public boolean f11286U;

        /* renamed from: X */
        public TrackOutput f11289X;

        /* renamed from: Y */
        public int f11290Y;

        /* renamed from: a */
        public String f11291a;

        /* renamed from: b */
        public String f11292b;

        /* renamed from: c */
        public int f11293c;

        /* renamed from: d */
        public int f11294d;

        /* renamed from: e */
        public int f11295e;

        /* renamed from: f */
        public int f11296f;

        /* renamed from: g */
        public int f11297g;

        /* renamed from: h */
        public boolean f11298h;

        /* renamed from: i */
        public byte[] f11299i;

        /* renamed from: j */
        public TrackOutput.C6809a f11300j;

        /* renamed from: k */
        public byte[] f11301k;

        /* renamed from: l */
        public C6779g f11302l;

        /* renamed from: m */
        public int f11303m = -1;

        /* renamed from: n */
        public int f11304n = -1;

        /* renamed from: o */
        public int f11305o = -1;

        /* renamed from: p */
        public int f11306p = -1;

        /* renamed from: q */
        public int f11307q = 0;

        /* renamed from: r */
        public int f11308r = -1;

        /* renamed from: s */
        public float f11309s = 0.0f;

        /* renamed from: t */
        public float f11310t = 0.0f;

        /* renamed from: u */
        public float f11311u = 0.0f;

        /* renamed from: v */
        public byte[] f11312v = null;

        /* renamed from: w */
        public int f11313w = -1;

        /* renamed from: x */
        public boolean f11314x = false;

        /* renamed from: y */
        public int f11315y = -1;

        /* renamed from: z */
        public int f11316z = -1;

        /* renamed from: A */
        public int f11266A = -1;

        /* renamed from: B */
        public int f11267B = 1000;

        /* renamed from: C */
        public int f11268C = 200;

        /* renamed from: D */
        public float f11269D = -1.0f;

        /* renamed from: E */
        public float f11270E = -1.0f;

        /* renamed from: F */
        public float f11271F = -1.0f;

        /* renamed from: G */
        public float f11272G = -1.0f;

        /* renamed from: H */
        public float f11273H = -1.0f;

        /* renamed from: I */
        public float f11274I = -1.0f;

        /* renamed from: J */
        public float f11275J = -1.0f;

        /* renamed from: K */
        public float f11276K = -1.0f;

        /* renamed from: L */
        public float f11277L = -1.0f;

        /* renamed from: M */
        public float f11278M = -1.0f;

        /* renamed from: O */
        public int f11280O = 1;

        /* renamed from: P */
        public int f11281P = -1;

        /* renamed from: Q */
        public int f11282Q = 8000;

        /* renamed from: R */
        public long f11283R = 0;

        /* renamed from: S */
        public long f11284S = 0;

        /* renamed from: V */
        public boolean f11287V = true;

        /* renamed from: W */
        public String f11288W = "eng";

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: a */
        public final byte[] m5908a(String str) throws C7506y0 {
            byte[] bArr = this.f11301k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                throw C7506y0.m4869a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
            }
            return bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$c */
    /* loaded from: classes.dex */
    public static final class C6849c {

        /* renamed from: a */
        public final byte[] f11317a = new byte[10];

        /* renamed from: b */
        public boolean f11318b;

        /* renamed from: c */
        public int f11319c;

        /* renamed from: d */
        public long f11320d;

        /* renamed from: e */
        public int f11321e;

        /* renamed from: f */
        public int f11322f;

        /* renamed from: g */
        public int f11323g;
    }

    static {
        HashMap hashMap = new HashMap();
        C6660u.m6129a(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11211f0 = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor() {
        C6850a c6850a = new C6850a();
        this.f11255q = -1L;
        this.f11256r = -9223372036854775807L;
        this.f11257s = -9223372036854775807L;
        this.f11258t = -9223372036854775807L;
        this.f11264z = -1L;
        this.f11212A = -1L;
        this.f11213B = -9223372036854775807L;
        this.f11238a = c6850a;
        c6850a.f11327d = new C6847a();
        this.f11242d = true;
        this.f11240b = new C6854d();
        this.f11241c = new SparseArray<>();
        this.f11245g = new C7436v(4);
        this.f11246h = new C7436v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11247i = new C7436v(4);
        this.f11243e = new C7436v(C7427r.f13945a);
        this.f11244f = new C7436v(4);
        this.f11248j = new C7436v();
        this.f11249k = new C7436v();
        this.f11250l = new C7436v(8);
        this.f11251m = new C7436v();
        this.f11252n = new C7436v();
        this.f11223L = new int[1];
    }

    /* renamed from: h */
    public static byte[] m5915h(long j, String str, long j2) {
        C7394a.m5134a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C7408g0.m5088r(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: a */
    public final void m5918a(int i) throws C7506y0 {
        if (this.f11214C == null || this.f11215D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw C7506y0.m4869a(sb.toString(), null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        long m5907a;
        int i;
        C6853c c6853c = new C6853c();
        C6820e c6820e = (C6820e) interfaceC6832h;
        long j = c6820e.f11125c;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (i2 != 0 && j <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = j;
        }
        int i3 = (int) j2;
        C7436v c7436v = c6853c.f11333a;
        c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
        c6853c.f11334b = 4;
        for (long m5001q = c7436v.m5001q(); m5001q != 440786851; m5001q = ((m5001q << 8) & (-256)) | (c7436v.f13978a[0] & 255)) {
            int i4 = c6853c.f11334b + 1;
            c6853c.f11334b = i4;
            if (i4 == i3) {
                return false;
            }
            c6820e.mo5928d(c7436v.f13978a, 0, 1, false);
        }
        long m5907a2 = c6853c.m5907a(c6820e);
        long j3 = c6853c.f11334b;
        if (m5907a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + m5907a2 >= j) {
            return false;
        }
        while (true) {
            int i5 = (c6853c.f11334b > (j3 + m5907a2) ? 1 : (c6853c.f11334b == (j3 + m5907a2) ? 0 : -1));
            if (i5 < 0) {
                if (c6853c.m5907a(c6820e) == Long.MIN_VALUE || (c6853c.m5907a(c6820e)) < 0 || m5907a > 2147483647L) {
                    return false;
                }
                if (i != 0) {
                    int i6 = (int) m5907a;
                    c6820e.m5950l(i6, false);
                    c6853c.f11334b += i6;
                }
            } else if (i5 != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: c */
    public final void m5917c(int i) throws C7506y0 {
        if (this.f11259u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i);
        sb.append(" must be in a TrackEntry");
        throw C7506y0.m4869a(sb.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5916d(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C6848b r16, long r17, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.m5916d(com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$b, long, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f8, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04b4, code lost:
        throw com.google.android.exoplayer2.C7506y0.m4869a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x078f, code lost:
        r1 = new java.lang.StringBuilder(53);
        r1.append("DocTypeReadVersion ");
        r1.append(r10);
        r1.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x07aa, code lost:
        throw com.google.android.exoplayer2.C7506y0.m4869a(r1.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x09ee, code lost:
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x09f0, code lost:
        r2 = ((com.google.android.exoplayer2.extractor.C6820e) r35).f11126d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x09f8, code lost:
        if (r34.f11263y == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x09fa, code lost:
        r34.f11212A = r2;
        r36.f11618a = r34.f11264z;
        r34.f11263y = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0a06, code lost:
        if (r34.f11260v == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0a08, code lost:
        r2 = r34.f11212A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0a0e, code lost:
        if (r2 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a10, code lost:
        r36.f11618a = r2;
        r34.f11212A = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0a14, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a16, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0a17, code lost:
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0a19, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0a36, code lost:
        if (r4 != false) goto L526;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a38, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0a39, code lost:
        r1 = r34.f11241c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0a3f, code lost:
        if (r3 >= r1.size()) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0a41, code lost:
        r1 = r1.valueAt(r3);
        r1.f11289X.getClass();
        r2 = r1.f11285T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0a4e, code lost:
        if (r2 == null) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a52, code lost:
        if (r2.f11319c <= 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a54, code lost:
        r1.f11289X.mo5452d(r2.f11320d, r2.f11321e, r2.f11322f, r2.f11323g, r1.f11300j);
        r2.f11319c = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a68, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a6b, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0a6d, code lost:
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d8  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r35, com.google.android.exoplayer2.extractor.C6904s r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11239a0 = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        this.f11213B = -9223372036854775807L;
        this.f11218G = 0;
        C6850a c6850a = (C6850a) this.f11238a;
        c6850a.f11328e = 0;
        c6850a.f11325b.clear();
        C6854d c6854d = c6850a.f11326c;
        c6854d.f11337b = 0;
        c6854d.f11338c = 0;
        C6854d c6854d2 = this.f11240b;
        c6854d2.f11337b = 0;
        c6854d2.f11338c = 0;
        m5913j();
        int i = 0;
        while (true) {
            SparseArray<C6848b> sparseArray = this.f11241c;
            if (i < sparseArray.size()) {
                C6849c c6849c = sparseArray.valueAt(i).f11285T;
                if (c6849c != null) {
                    c6849c.f11318b = false;
                    c6849c.f11319c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: i */
    public final void m5914i(C6820e c6820e, int i) throws IOException {
        C7436v c7436v = this.f11245g;
        if (c7436v.f13980c >= i) {
            return;
        }
        byte[] bArr = c7436v.f13978a;
        if (bArr.length < i) {
            c7436v.m5017a(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = c7436v.f13978a;
        int i2 = c7436v.f13980c;
        c6820e.mo5930a(bArr2, i2, i - i2, false);
        c7436v.m4993y(i);
    }

    /* renamed from: j */
    public final void m5913j() {
        this.f11229R = 0;
        this.f11230S = 0;
        this.f11231T = 0;
        this.f11232U = false;
        this.f11233V = false;
        this.f11234W = false;
        this.f11235X = 0;
        this.f11236Y = (byte) 0;
        this.f11237Z = false;
        this.f11248j.m4995w(0);
    }

    /* renamed from: k */
    public final long m5912k(long j) throws C7506y0 {
        long j2 = this.f11256r;
        if (j2 != -9223372036854775807L) {
            return C7408g0.m5081y(j, j2, 1000L);
        }
        throw C7506y0.m4869a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0203  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m5911l(int r18, com.google.android.exoplayer2.extractor.C6820e r19, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.C6848b r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.m5911l(int, com.google.android.exoplayer2.extractor.e, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$b):int");
    }

    /* renamed from: m */
    public final void m5910m(C6820e c6820e, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        C7436v c7436v = this.f11249k;
        byte[] bArr2 = c7436v.f13978a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            c7436v.m4994x(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c6820e.mo5930a(c7436v.f13978a, bArr.length, i, false);
        c7436v.m4992z(0);
        c7436v.m4993y(length);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
