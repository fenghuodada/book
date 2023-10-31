package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.drm.C6766b;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.upstream.C7375r;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.android.exoplayer2.util.C7424q;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@RequiresApi(18)
/* loaded from: classes.dex */
public final class DefaultDrmSessionManager implements InterfaceC6792o {

    /* renamed from: b */
    public final UUID f10946b;

    /* renamed from: c */
    public final ExoMediaDrm.InterfaceC6762b f10947c;

    /* renamed from: d */
    public final InterfaceC6765a0 f10948d;

    /* renamed from: e */
    public final HashMap<String, String> f10949e;

    /* renamed from: f */
    public final boolean f10950f;

    /* renamed from: g */
    public final int[] f10951g;

    /* renamed from: h */
    public final boolean f10952h;

    /* renamed from: i */
    public final C6758e f10953i;

    /* renamed from: j */
    public final LoadErrorHandlingPolicy f10954j;

    /* renamed from: k */
    public final C6759f f10955k;

    /* renamed from: l */
    public final long f10956l;

    /* renamed from: m */
    public final ArrayList f10957m;

    /* renamed from: n */
    public final Set<C6757d> f10958n;

    /* renamed from: o */
    public final Set<C6766b> f10959o;

    /* renamed from: p */
    public int f10960p;
    @Nullable

    /* renamed from: q */
    public ExoMediaDrm f10961q;
    @Nullable

    /* renamed from: r */
    public C6766b f10962r;
    @Nullable

    /* renamed from: s */
    public C6766b f10963s;

    /* renamed from: t */
    public Looper f10964t;

    /* renamed from: u */
    public Handler f10965u;

    /* renamed from: v */
    public int f10966v;
    @Nullable

    /* renamed from: w */
    public byte[] f10967w;
    @Nullable

    /* renamed from: x */
    public volatile HandlerC6755b f10968x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a */
    /* loaded from: classes.dex */
    public class C6754a implements ExoMediaDrm.InterfaceC6761a {
        public C6754a() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    /* loaded from: classes.dex */
    public class HandlerC6755b extends Handler {
        public HandlerC6755b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = DefaultDrmSessionManager.this.f10957m.iterator();
            while (it.hasNext()) {
                C6766b c6766b = (C6766b) it.next();
                if (Arrays.equals(c6766b.f11002t, bArr)) {
                    if (message.what == 2 && c6766b.f10987e == 0 && c6766b.f10996n == 4) {
                        int i = C7408g0.f13905a;
                        c6766b.m6003g(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    /* loaded from: classes.dex */
    public static final class C6756c extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C6756c(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 29
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Media does not support uuid: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C6756c.<init>(java.util.UUID):void");
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    /* loaded from: classes.dex */
    public class C6757d implements InterfaceC6792o.InterfaceC6794b {
        @Nullable

        /* renamed from: b */
        public final InterfaceC6789n.C6790a f10971b;
        @Nullable

        /* renamed from: c */
        public DrmSession f10972c;

        /* renamed from: d */
        public boolean f10973d;

        public C6757d(@Nullable InterfaceC6789n.C6790a c6790a) {
            this.f10971b = c6790a;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o.InterfaceC6794b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f10965u;
            handler.getClass();
            C7408g0.m5082x(handler, new Runnable() { // from class: com.google.android.exoplayer2.drm.c
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.C6757d c6757d = DefaultDrmSessionManager.C6757d.this;
                    if (!c6757d.f10973d) {
                        DrmSession drmSession = c6757d.f10972c;
                        if (drmSession != null) {
                            drmSession.mo5977b(c6757d.f10971b);
                        }
                        DefaultDrmSessionManager.this.f10958n.remove(c6757d);
                        c6757d.f10973d = true;
                    }
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    /* loaded from: classes.dex */
    public class C6758e implements C6766b.InterfaceC6767a {

        /* renamed from: a */
        public final HashSet f10975a = new HashSet();
        @Nullable

        /* renamed from: b */
        public C6766b f10976b;

        /* renamed from: a */
        public final void m6006a(Exception exc, boolean z) {
            int i;
            this.f10976b = null;
            HashSet hashSet = this.f10975a;
            AbstractC8013s m4246p = AbstractC8013s.m4246p(hashSet);
            hashSet.clear();
            AbstractC8013s.C8015b listIterator = m4246p.listIterator(0);
            while (listIterator.hasNext()) {
                C6766b c6766b = (C6766b) listIterator.next();
                c6766b.getClass();
                if (z) {
                    i = 1;
                } else {
                    i = 3;
                }
                c6766b.m6001i(i, exc);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$f */
    /* loaded from: classes.dex */
    public class C6759f implements C6766b.InterfaceC6768b {
        public C6759f() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.InterfaceC6762b interfaceC6762b, C6804y c6804y, HashMap hashMap, boolean z, int[] iArr, boolean z2, C7375r c7375r, long j) {
        uuid.getClass();
        C7394a.m5133b(!C6622C.f10467b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f10946b = uuid;
        this.f10947c = interfaceC6762b;
        this.f10948d = c6804y;
        this.f10949e = hashMap;
        this.f10950f = z;
        this.f10951g = iArr;
        this.f10952h = z2;
        this.f10954j = c7375r;
        this.f10953i = new C6758e();
        this.f10955k = new C6759f();
        this.f10966v = 0;
        this.f10957m = new ArrayList();
        this.f10958n = Collections.newSetFromMap(new IdentityHashMap());
        this.f10959o = Collections.newSetFromMap(new IdentityHashMap());
        this.f10956l = j;
    }

    /* renamed from: e */
    public static boolean m6012e(C6766b c6766b) {
        if (c6766b.f10996n == 1) {
            if (C7408g0.f13905a < 19) {
                return true;
            }
            DrmSession.C6760a error = c6766b.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static ArrayList m6009h(C6779g c6779g, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(c6779g.f11021d);
        for (int i = 0; i < c6779g.f11021d; i++) {
            C6779g.C6781b c6781b = c6779g.f11018a[i];
            if (!c6781b.m5993b(uuid) && (!C6622C.f10468c.equals(uuid) || !c6781b.m5993b(C6622C.f10467b))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (c6781b.f11026e != null || z)) {
                arrayList.add(c6781b);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
    /* renamed from: a */
    public final InterfaceC6792o.InterfaceC6794b mo5986a(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, final C7003m0 c7003m0) {
        boolean z;
        if (this.f10960p > 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        m6008i(looper);
        final C6757d c6757d = new C6757d(c6790a);
        Handler handler = this.f10965u;
        handler.getClass();
        handler.post(new Runnable() { // from class: com.google.android.exoplayer2.drm.d
            @Override // java.lang.Runnable
            public final void run() {
                DefaultDrmSessionManager.C6757d c6757d2 = DefaultDrmSessionManager.C6757d.this;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f10960p != 0 && !c6757d2.f10973d) {
                    Looper looper2 = defaultDrmSessionManager.f10964t;
                    looper2.getClass();
                    c6757d2.f10972c = defaultDrmSessionManager.m6013d(looper2, c6757d2.f10971b, c7003m0, false);
                    defaultDrmSessionManager.f10958n.add(c6757d2);
                }
            }
        });
        return c6757d;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
    @Nullable
    /* renamed from: b */
    public final DrmSession mo5985b(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0) {
        C7394a.m5131d(this.f10960p > 0);
        m6008i(looper);
        return m6013d(looper, c6790a, c7003m0, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Class<? extends com.google.android.exoplayer2.drm.InterfaceC6800u> mo5984c(com.google.android.exoplayer2.C7003m0 r7) {
        /*
            r6 = this;
            com.google.android.exoplayer2.drm.ExoMediaDrm r0 = r6.f10961q
            r0.getClass()
            java.lang.Class r0 = r0.mo5973a()
            com.google.android.exoplayer2.drm.g r1 = r7.f12290o
            r2 = 0
            if (r1 != 0) goto L2a
            java.lang.String r7 = r7.f12287l
            int r7 = com.google.android.exoplayer2.util.C7424q.m5043g(r7)
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
        L16:
            int[] r1 = r6.f10951g
            int r3 = r1.length
            r4 = -1
            if (r2 >= r3) goto L24
            r1 = r1[r2]
            if (r1 != r7) goto L21
            goto L25
        L21:
            int r2 = r2 + 1
            goto L16
        L24:
            r2 = r4
        L25:
            if (r2 == r4) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
        L2a:
            byte[] r7 = r6.f10967w
            r3 = 1
            if (r7 == 0) goto L30
            goto L99
        L30:
            java.util.UUID r7 = r6.f10946b
            java.util.ArrayList r4 = m6009h(r1, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L6c
            int r4 = r1.f11021d
            if (r4 != r3) goto L9a
            com.google.android.exoplayer2.drm.g$b[] r4 = r1.f11018a
            r4 = r4[r2]
            java.util.UUID r5 = com.google.android.exoplayer2.C6622C.f10467b
            boolean r4 = r4.m5993b(r5)
            if (r4 == 0) goto L9a
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r4 = r7.length()
            int r4 = r4 + 72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            android.util.Log.w(r4, r7)
        L6c:
            java.lang.String r7 = r1.f11020c
            if (r7 == 0) goto L99
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L79
            goto L99
        L79:
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L88
            int r7 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r1 = 25
            if (r7 < r1) goto L9a
            goto L99
        L88:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L9a
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L99
            goto L9a
        L99:
            r2 = r3
        L9a:
            if (r2 == 0) goto L9d
            goto L9f
        L9d:
            java.lang.Class<com.google.android.exoplayer2.drm.c0> r0 = com.google.android.exoplayer2.drm.C6775c0.class
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.mo5984c(com.google.android.exoplayer2.m0):java.lang.Class");
    }

    @Nullable
    /* renamed from: d */
    public final DrmSession m6013d(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0, boolean z) {
        ArrayList arrayList;
        boolean z2;
        if (this.f10968x == null) {
            this.f10968x = new HandlerC6755b(looper);
        }
        C6779g c6779g = c7003m0.f12290o;
        int i = 0;
        C6766b c6766b = null;
        if (c6779g == null) {
            int m5043g = C7424q.m5043g(c7003m0.f12287l);
            ExoMediaDrm exoMediaDrm = this.f10961q;
            exoMediaDrm.getClass();
            if (C6801v.class.equals(exoMediaDrm.mo5973a()) && C6801v.f11049d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            int[] iArr = this.f10951g;
            int i2 = C7408g0.f13905a;
            while (true) {
                if (i < iArr.length) {
                    if (iArr[i] == m5043g) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1 || C6775c0.class.equals(exoMediaDrm.mo5973a())) {
                return null;
            }
            C6766b c6766b2 = this.f10962r;
            if (c6766b2 == null) {
                AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
                C6766b m6010g = m6010g(C7998n0.f15785e, true, null, z);
                this.f10957m.add(m6010g);
                this.f10962r = m6010g;
            } else {
                c6766b2.mo5978a(null);
            }
            return this.f10962r;
        }
        if (this.f10967w == null) {
            arrayList = m6009h(c6779g, this.f10946b, false);
            if (arrayList.isEmpty()) {
                C6756c c6756c = new C6756c(this.f10946b);
                C7421n.m5056b("DefaultDrmSessionMgr", "DRM error", c6756c);
                if (c6790a != null) {
                    c6790a.m5988e(c6756c);
                }
                return new C6799t(new DrmSession.C6760a(c6756c, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayList = null;
        }
        if (!this.f10950f) {
            c6766b = this.f10963s;
        } else {
            Iterator it = this.f10957m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6766b c6766b3 = (C6766b) it.next();
                if (C7408g0.m5105a(c6766b3.f10983a, arrayList)) {
                    c6766b = c6766b3;
                    break;
                }
            }
        }
        if (c6766b == null) {
            c6766b = m6010g(arrayList, false, c6790a, z);
            if (!this.f10950f) {
                this.f10963s = c6766b;
            }
            this.f10957m.add(c6766b);
        } else {
            c6766b.mo5978a(c6790a);
        }
        return c6766b;
    }

    /* renamed from: f */
    public final C6766b m6011f(@Nullable List<C6779g.C6781b> list, boolean z, @Nullable InterfaceC6789n.C6790a c6790a) {
        this.f10961q.getClass();
        UUID uuid = this.f10946b;
        ExoMediaDrm exoMediaDrm = this.f10961q;
        C6758e c6758e = this.f10953i;
        C6759f c6759f = this.f10955k;
        int i = this.f10966v;
        byte[] bArr = this.f10967w;
        HashMap<String, String> hashMap = this.f10949e;
        InterfaceC6765a0 interfaceC6765a0 = this.f10948d;
        Looper looper = this.f10964t;
        looper.getClass();
        C6766b c6766b = new C6766b(uuid, exoMediaDrm, c6758e, c6759f, list, i, this.f10952h | z, z, bArr, hashMap, interfaceC6765a0, looper, this.f10954j);
        c6766b.mo5978a(c6790a);
        if (this.f10956l != -9223372036854775807L) {
            c6766b.mo5978a(null);
        }
        return c6766b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r8.mo4224m() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.mo4224m() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
        if (r14.mo4224m() == false) goto L45;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.drm.C6766b m6010g(@androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.C6779g.C6781b> r11, boolean r12, @androidx.annotation.Nullable com.google.android.exoplayer2.drm.InterfaceC6789n.C6790a r13, boolean r14) {
        /*
            r10 = this;
            com.google.android.exoplayer2.drm.b r0 = r10.m6011f(r11, r12, r13)
            boolean r1 = m6012e(r0)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r4 = r10.f10956l
            r6 = 0
            java.util.Set<com.google.android.exoplayer2.drm.b> r7 = r10.f10959o
            if (r1 == 0) goto L5c
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L5c
            r1 = r7
            java.util.Set r1 = (java.util.Set) r1
            int r8 = com.google.common.collect.AbstractC8031x.f15839c
            boolean r8 = r1 instanceof com.google.common.collect.AbstractC8031x
            if (r8 == 0) goto L31
            boolean r8 = r1 instanceof java.util.SortedSet
            if (r8 != 0) goto L31
            r8 = r1
            com.google.common.collect.x r8 = (com.google.common.collect.AbstractC8031x) r8
            boolean r9 = r8.mo4224m()
            if (r9 != 0) goto L31
            goto L3a
        L31:
            java.lang.Object[] r1 = r1.toArray()
            int r8 = r1.length
            com.google.common.collect.x r8 = com.google.common.collect.AbstractC8031x.m4215p(r8, r1)
        L3a:
            com.google.common.collect.x0 r1 = r8.iterator()
        L3e:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L4e
            java.lang.Object r8 = r1.next()
            com.google.android.exoplayer2.drm.DrmSession r8 = (com.google.android.exoplayer2.drm.DrmSession) r8
            r8.mo5977b(r6)
            goto L3e
        L4e:
            r0.mo5977b(r13)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L58
            r0.mo5977b(r6)
        L58:
            com.google.android.exoplayer2.drm.b r0 = r10.m6011f(r11, r12, r13)
        L5c:
            boolean r1 = m6012e(r0)
            if (r1 == 0) goto Le6
            if (r14 == 0) goto Le6
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d> r14 = r10.f10958n
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto Le6
            java.util.Set r14 = (java.util.Set) r14
            int r1 = com.google.common.collect.AbstractC8031x.f15839c
            boolean r1 = r14 instanceof com.google.common.collect.AbstractC8031x
            if (r1 == 0) goto L82
            boolean r1 = r14 instanceof java.util.SortedSet
            if (r1 != 0) goto L82
            r1 = r14
            com.google.common.collect.x r1 = (com.google.common.collect.AbstractC8031x) r1
            boolean r8 = r1.mo4224m()
            if (r8 != 0) goto L82
            goto L8b
        L82:
            java.lang.Object[] r14 = r14.toArray()
            int r1 = r14.length
            com.google.common.collect.x r1 = com.google.common.collect.AbstractC8031x.m4215p(r1, r14)
        L8b:
            com.google.common.collect.x0 r14 = r1.iterator()
        L8f:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r14.next()
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d r1 = (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C6757d) r1
            r1.release()
            goto L8f
        L9f:
            boolean r14 = r7.isEmpty()
            if (r14 != 0) goto Ld8
            java.util.Set r7 = (java.util.Set) r7
            int r14 = com.google.common.collect.AbstractC8031x.f15839c
            boolean r14 = r7 instanceof com.google.common.collect.AbstractC8031x
            if (r14 == 0) goto Lbb
            boolean r14 = r7 instanceof java.util.SortedSet
            if (r14 != 0) goto Lbb
            r14 = r7
            com.google.common.collect.x r14 = (com.google.common.collect.AbstractC8031x) r14
            boolean r1 = r14.mo4224m()
            if (r1 != 0) goto Lbb
            goto Lc4
        Lbb:
            java.lang.Object[] r14 = r7.toArray()
            int r1 = r14.length
            com.google.common.collect.x r14 = com.google.common.collect.AbstractC8031x.m4215p(r1, r14)
        Lc4:
            com.google.common.collect.x0 r14 = r14.iterator()
        Lc8:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto Ld8
            java.lang.Object r1 = r14.next()
            com.google.android.exoplayer2.drm.DrmSession r1 = (com.google.android.exoplayer2.drm.DrmSession) r1
            r1.mo5977b(r6)
            goto Lc8
        Ld8:
            r0.mo5977b(r13)
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto Le2
            r0.mo5977b(r6)
        Le2:
            com.google.android.exoplayer2.drm.b r0 = r10.m6011f(r11, r12, r13)
        Le6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.m6010g(java.util.List, boolean, com.google.android.exoplayer2.drm.n$a, boolean):com.google.android.exoplayer2.drm.b");
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    /* renamed from: i */
    public final synchronized void m6008i(Looper looper) {
        boolean z;
        Looper looper2 = this.f10964t;
        if (looper2 == null) {
            this.f10964t = looper;
            this.f10965u = new Handler(looper);
        } else {
            if (looper2 == looper) {
                z = true;
            } else {
                z = false;
            }
            C7394a.m5131d(z);
            this.f10965u.getClass();
        }
    }

    /* renamed from: j */
    public final void m6007j() {
        if (this.f10961q != null && this.f10960p == 0 && this.f10957m.isEmpty() && this.f10958n.isEmpty()) {
            ExoMediaDrm exoMediaDrm = this.f10961q;
            exoMediaDrm.getClass();
            exoMediaDrm.release();
            this.f10961q = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
    public final void prepare() {
        int i = this.f10960p;
        this.f10960p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.f10961q == null) {
            ExoMediaDrm mo6005a = this.f10947c.mo6005a(this.f10946b);
            this.f10961q = mo6005a;
            mo6005a.mo5964j(new C6754a());
        } else if (this.f10956l == -9223372036854775807L) {
        } else {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.f10957m;
                if (i2 >= arrayList.size()) {
                    return;
                }
                ((C6766b) arrayList.get(i2)).mo5978a(null);
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1.mo4224m() == false) goto L18;
     */
    @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void release() {
        /*
            r4 = this;
            int r0 = r4.f10960p
            int r0 = r0 + (-1)
            r4.f10960p = r0
            if (r0 == 0) goto L9
            return
        L9:
            long r0 = r4.f10956l
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2f
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r4.f10957m
            r0.<init>(r1)
            r1 = 0
        L1c:
            int r2 = r0.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r0.get(r1)
            com.google.android.exoplayer2.drm.b r2 = (com.google.android.exoplayer2.drm.C6766b) r2
            r3 = 0
            r2.mo5977b(r3)
            int r1 = r1 + 1
            goto L1c
        L2f:
            java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d> r0 = r4.f10958n
            java.util.Set r0 = (java.util.Set) r0
            int r1 = com.google.common.collect.AbstractC8031x.f15839c
            boolean r1 = r0 instanceof com.google.common.collect.AbstractC8031x
            if (r1 == 0) goto L47
            boolean r1 = r0 instanceof java.util.SortedSet
            if (r1 != 0) goto L47
            r1 = r0
            com.google.common.collect.x r1 = (com.google.common.collect.AbstractC8031x) r1
            boolean r2 = r1.mo4224m()
            if (r2 != 0) goto L47
            goto L50
        L47:
            java.lang.Object[] r0 = r0.toArray()
            int r1 = r0.length
            com.google.common.collect.x r1 = com.google.common.collect.AbstractC8031x.m4215p(r1, r0)
        L50:
            com.google.common.collect.x0 r0 = r1.iterator()
        L54:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d r1 = (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.C6757d) r1
            r1.release()
            goto L54
        L64:
            r4.m6007j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.release():void");
    }
}
