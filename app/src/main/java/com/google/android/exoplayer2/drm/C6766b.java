package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.datastore.preferences.protobuf.C1194j;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.upstream.C7375r;
import com.google.android.exoplayer2.upstream.C7379t;
import com.google.android.exoplayer2.upstream.C7385z;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7405f;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.collect.AbstractC8013s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

@RequiresApi(18)
/* renamed from: com.google.android.exoplayer2.drm.b */
/* loaded from: classes.dex */
public final class C6766b implements DrmSession {
    @Nullable

    /* renamed from: a */
    public final List<C6779g.C6781b> f10983a;

    /* renamed from: b */
    public final ExoMediaDrm f10984b;

    /* renamed from: c */
    public final InterfaceC6767a f10985c;

    /* renamed from: d */
    public final InterfaceC6768b f10986d;

    /* renamed from: e */
    public final int f10987e;

    /* renamed from: f */
    public final boolean f10988f;

    /* renamed from: g */
    public final boolean f10989g;

    /* renamed from: h */
    public final HashMap<String, String> f10990h;

    /* renamed from: i */
    public final C7405f<InterfaceC6789n.C6790a> f10991i;

    /* renamed from: j */
    public final LoadErrorHandlingPolicy f10992j;

    /* renamed from: k */
    public final InterfaceC6765a0 f10993k;

    /* renamed from: l */
    public final UUID f10994l;

    /* renamed from: m */
    public final HandlerC6771e f10995m;

    /* renamed from: n */
    public int f10996n;

    /* renamed from: o */
    public int f10997o;
    @Nullable

    /* renamed from: p */
    public HandlerThread f10998p;
    @Nullable

    /* renamed from: q */
    public HandlerC6769c f10999q;
    @Nullable

    /* renamed from: r */
    public InterfaceC6800u f11000r;
    @Nullable

    /* renamed from: s */
    public DrmSession.C6760a f11001s;
    @Nullable

    /* renamed from: t */
    public byte[] f11002t;

    /* renamed from: u */
    public byte[] f11003u;
    @Nullable

    /* renamed from: v */
    public ExoMediaDrm.KeyRequest f11004v;
    @Nullable

    /* renamed from: w */
    public ExoMediaDrm.C6763c f11005w;

    /* renamed from: com.google.android.exoplayer2.drm.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6767a {
    }

    /* renamed from: com.google.android.exoplayer2.drm.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6768b {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.b$c */
    /* loaded from: classes.dex */
    public class HandlerC6769c extends Handler {
        @GuardedBy("this")

        /* renamed from: a */
        public boolean f11006a;

        public HandlerC6769c(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final boolean m5996a(Message message, C6773b0 c6773b0) {
            IOException c6772f;
            long j;
            C6770d c6770d = (C6770d) message.obj;
            if (!c6770d.f11009b) {
                return false;
            }
            int i = c6770d.f11011d + 1;
            c6770d.f11011d = i;
            ((C7375r) C6766b.this.f10992j).getClass();
            if (i > 3) {
                return false;
            }
            SystemClock.elapsedRealtime();
            SystemClock.elapsedRealtime();
            if (c6773b0.getCause() instanceof IOException) {
                c6772f = (IOException) c6773b0.getCause();
            } else {
                c6772f = new C6772f(c6773b0.getCause());
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = C6766b.this.f10992j;
            int i2 = c6770d.f11011d;
            ((C7375r) loadErrorHandlingPolicy).getClass();
            if (!(c6772f instanceof C7506y0) && !(c6772f instanceof FileNotFoundException) && !(c6772f instanceof C7379t) && !(c6772f instanceof C7385z.C7392g)) {
                j = Math.min((i2 - 1) * 1000, 5000);
            } else {
                j = -9223372036854775807L;
            }
            if (j == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f11006a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), j);
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr;
            C6770d c6770d = (C6770d) message.obj;
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        C6766b c6766b = C6766b.this;
                        bArr = ((C6804y) c6766b.f10993k).m5962a(c6766b.f10994l, (ExoMediaDrm.KeyRequest) c6770d.f11010c);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    bArr = ((C6804y) C6766b.this.f10993k).m5960c((ExoMediaDrm.C6763c) c6770d.f11010c);
                }
            } catch (C6773b0 e) {
                boolean m5996a = m5996a(message, e);
                bArr = e;
                if (m5996a) {
                    return;
                }
            } catch (Exception e2) {
                C7421n.m5055c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = C6766b.this.f10992j;
            long j = c6770d.f11008a;
            loadErrorHandlingPolicy.getClass();
            synchronized (this) {
                if (!this.f11006a) {
                    C6766b.this.f10995m.obtainMessage(message.what, Pair.create(c6770d.f11010c, bArr)).sendToTarget();
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.b$d */
    /* loaded from: classes.dex */
    public static final class C6770d {

        /* renamed from: a */
        public final long f11008a;

        /* renamed from: b */
        public final boolean f11009b;

        /* renamed from: c */
        public final Object f11010c;

        /* renamed from: d */
        public int f11011d;

        public C6770d(long j, boolean z, long j2, Object obj) {
            this.f11008a = j;
            this.f11009b = z;
            this.f11010c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.b$e */
    /* loaded from: classes.dex */
    public class HandlerC6771e extends Handler {
        public HandlerC6771e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<InterfaceC6789n.C6790a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    C6766b c6766b = C6766b.this;
                    if (obj == c6766b.f11004v && c6766b.m6002h()) {
                        c6766b.f11004v = null;
                        if (obj2 instanceof Exception) {
                            c6766b.m6000j((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (c6766b.f10987e == 3) {
                                ExoMediaDrm exoMediaDrm = c6766b.f10984b;
                                byte[] bArr2 = c6766b.f11003u;
                                int i2 = C7408g0.f13905a;
                                exoMediaDrm.mo5966h(bArr2, bArr);
                                c6766b.m6004f(new C1194j());
                                return;
                            }
                            byte[] mo5966h = c6766b.f10984b.mo5966h(c6766b.f11002t, bArr);
                            int i3 = c6766b.f10987e;
                            if ((i3 == 2 || (i3 == 0 && c6766b.f11003u != null)) && mo5966h != null && mo5966h.length != 0) {
                                c6766b.f11003u = mo5966h;
                            }
                            c6766b.f10996n = 4;
                            C7405f<InterfaceC6789n.C6790a> c7405f = c6766b.f10991i;
                            synchronized (c7405f.f13900a) {
                                set = c7405f.f13902c;
                            }
                            for (InterfaceC6789n.C6790a c6790a : set) {
                                c6790a.m5992a();
                            }
                            return;
                        } catch (Exception e) {
                            c6766b.m6000j(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            C6766b c6766b2 = C6766b.this;
            if (obj == c6766b2.f11005w) {
                if (c6766b2.f10996n == 2 || c6766b2.m6002h()) {
                    c6766b2.f11005w = null;
                    boolean z = obj2 instanceof Exception;
                    InterfaceC6767a interfaceC6767a = c6766b2.f10985c;
                    if (z) {
                        ((DefaultDrmSessionManager.C6758e) interfaceC6767a).m6006a((Exception) obj2, false);
                        return;
                    }
                    try {
                        c6766b2.f10984b.mo5965i((byte[]) obj2);
                        DefaultDrmSessionManager.C6758e c6758e = (DefaultDrmSessionManager.C6758e) interfaceC6767a;
                        c6758e.f10976b = null;
                        HashSet hashSet = c6758e.f10975a;
                        AbstractC8013s m4246p = AbstractC8013s.m4246p(hashSet);
                        hashSet.clear();
                        AbstractC8013s.C8015b listIterator = m4246p.listIterator(0);
                        while (listIterator.hasNext()) {
                            C6766b c6766b3 = (C6766b) listIterator.next();
                            if (c6766b3.m5999k()) {
                                c6766b3.m6003g(true);
                            }
                        }
                    } catch (Exception e2) {
                        ((DefaultDrmSessionManager.C6758e) interfaceC6767a).m6006a(e2, true);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.b$f */
    /* loaded from: classes.dex */
    public static final class C6772f extends IOException {
        public C6772f(@Nullable Throwable th) {
            super(th);
        }
    }

    public C6766b(UUID uuid, ExoMediaDrm exoMediaDrm, DefaultDrmSessionManager.C6758e c6758e, DefaultDrmSessionManager.C6759f c6759f, @Nullable List list, int i, boolean z, boolean z2, @Nullable byte[] bArr, HashMap hashMap, InterfaceC6765a0 interfaceC6765a0, Looper looper, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        List<C6779g.C6781b> unmodifiableList;
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.f10994l = uuid;
        this.f10985c = c6758e;
        this.f10986d = c6759f;
        this.f10984b = exoMediaDrm;
        this.f10987e = i;
        this.f10988f = z;
        this.f10989g = z2;
        if (bArr != null) {
            this.f11003u = bArr;
            unmodifiableList = null;
        } else {
            list.getClass();
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f10983a = unmodifiableList;
        this.f10990h = hashMap;
        this.f10993k = interfaceC6765a0;
        this.f10991i = new C7405f<>();
        this.f10992j = loadErrorHandlingPolicy;
        this.f10996n = 2;
        this.f10995m = new HandlerC6771e(looper);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: a */
    public final void mo5978a(@Nullable InterfaceC6789n.C6790a c6790a) {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.f10997o >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        if (c6790a != null) {
            C7405f<InterfaceC6789n.C6790a> c7405f = this.f10991i;
            synchronized (c7405f.f13900a) {
                ArrayList arrayList = new ArrayList(c7405f.f13903d);
                arrayList.add(c6790a);
                c7405f.f13903d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) c7405f.f13901b.get(c6790a);
                if (num == null) {
                    HashSet hashSet = new HashSet(c7405f.f13902c);
                    hashSet.add(c6790a);
                    c7405f.f13902c = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = c7405f.f13901b;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(c6790a, Integer.valueOf(i));
            }
        }
        int i2 = this.f10997o + 1;
        this.f10997o = i2;
        if (i2 == 1) {
            if (this.f10996n == 2) {
                z2 = true;
            }
            C7394a.m5131d(z2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f10998p = handlerThread;
            handlerThread.start();
            this.f10999q = new HandlerC6769c(this.f10998p.getLooper());
            if (m5999k()) {
                m6003g(true);
            }
        } else if (c6790a != null && m6002h() && this.f10991i.m5107a(c6790a) == 1) {
            c6790a.m5989d(this.f10996n);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f10956l != -9223372036854775807L) {
            defaultDrmSessionManager.f10959o.remove(this);
            Handler handler = defaultDrmSessionManager.f10965u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: b */
    public final void mo5977b(@Nullable InterfaceC6789n.C6790a c6790a) {
        boolean z;
        if (this.f10997o > 0) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        int i = this.f10997o - 1;
        this.f10997o = i;
        if (i == 0) {
            this.f10996n = 0;
            HandlerC6771e handlerC6771e = this.f10995m;
            int i2 = C7408g0.f13905a;
            handlerC6771e.removeCallbacksAndMessages(null);
            HandlerC6769c handlerC6769c = this.f10999q;
            synchronized (handlerC6769c) {
                handlerC6769c.removeCallbacksAndMessages(null);
                handlerC6769c.f11006a = true;
            }
            this.f10999q = null;
            this.f10998p.quit();
            this.f10998p = null;
            this.f11000r = null;
            this.f11001s = null;
            this.f11004v = null;
            this.f11005w = null;
            byte[] bArr = this.f11002t;
            if (bArr != null) {
                this.f10984b.mo5967g(bArr);
                this.f11002t = null;
            }
        }
        if (c6790a != null) {
            this.f10991i.m5106b(c6790a);
            if (this.f10991i.m5107a(c6790a) == 0) {
                c6790a.m5987f();
            }
        }
        InterfaceC6768b interfaceC6768b = this.f10986d;
        int i3 = this.f10997o;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i3 == 1 && defaultDrmSessionManager.f10960p > 0 && defaultDrmSessionManager.f10956l != -9223372036854775807L) {
            defaultDrmSessionManager.f10959o.add(this);
            Handler handler = defaultDrmSessionManager.f10965u;
            handler.getClass();
            handler.postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    C6766b.this.mo5977b(null);
                }
            }, this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f10956l);
        } else if (i3 == 0) {
            defaultDrmSessionManager.f10957m.remove(this);
            if (defaultDrmSessionManager.f10962r == this) {
                defaultDrmSessionManager.f10962r = null;
            }
            if (defaultDrmSessionManager.f10963s == this) {
                defaultDrmSessionManager.f10963s = null;
            }
            DefaultDrmSessionManager.C6758e c6758e = defaultDrmSessionManager.f10953i;
            HashSet hashSet = c6758e.f10975a;
            hashSet.remove(this);
            if (c6758e.f10976b == this) {
                c6758e.f10976b = null;
                if (!hashSet.isEmpty()) {
                    C6766b c6766b = (C6766b) hashSet.iterator().next();
                    c6758e.f10976b = c6766b;
                    ExoMediaDrm.C6763c mo5970d = c6766b.f10984b.mo5970d();
                    c6766b.f11005w = mo5970d;
                    HandlerC6769c handlerC6769c2 = c6766b.f10999q;
                    int i4 = C7408g0.f13905a;
                    mo5970d.getClass();
                    handlerC6769c2.getClass();
                    handlerC6769c2.obtainMessage(0, new C6770d(C7174j.f12893a.getAndIncrement(), true, SystemClock.elapsedRealtime(), mo5970d)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f10956l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.f10965u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f10959o.remove(this);
            }
        }
        defaultDrmSessionManager.m6007j();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: c */
    public final UUID mo5976c() {
        return this.f10994l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: d */
    public final boolean mo5975d() {
        return this.f10988f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: e */
    public final InterfaceC6800u mo5974e() {
        return this.f11000r;
    }

    /* renamed from: f */
    public final void m6004f(C1194j c1194j) {
        Set<InterfaceC6789n.C6790a> set;
        C7405f<InterfaceC6789n.C6790a> c7405f = this.f10991i;
        synchronized (c7405f.f13900a) {
            set = c7405f.f13902c;
        }
        for (InterfaceC6789n.C6790a c6790a : set) {
            c1194j.accept(c6790a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:63|(2:64|65)|(6:67|68|69|70|(1:72)|74)|77|68|69|70|(0)|74) */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[Catch: NumberFormatException -> 0x0099, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0099, blocks: (B:44:0x008d, B:46:0x0095), top: B:76:0x008d }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6003g(boolean r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C6766b.m6003g(boolean):void");
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.C6760a getError() {
        if (this.f10996n == 1) {
            return this.f11001s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f10996n;
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: h */
    public final boolean m6002h() {
        int i = this.f10996n;
        return i == 3 || i == 4;
    }

    /* renamed from: i */
    public final void m6001i(int i, Exception exc) {
        int i2;
        Set<InterfaceC6789n.C6790a> set;
        int i3 = C7408g0.f13905a;
        if (i3 >= 21 && C6796q.m5981a(exc)) {
            i2 = C6796q.m5980b(exc);
        } else {
            if (i3 < 23 || !C6797r.m5979a(exc)) {
                if (i3 < 18 || !C6795p.m5982b(exc)) {
                    if (i3 >= 18 && C6795p.m5983a(exc)) {
                        i2 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i2 = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
                    } else if (exc instanceof DefaultDrmSessionManager.C6756c) {
                        i2 = AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
                    } else if (exc instanceof C6805z) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.f11001s = new DrmSession.C6760a(exc, i2);
        C7421n.m5056b("DefaultDrmSession", "DRM session error", exc);
        C7405f<InterfaceC6789n.C6790a> c7405f = this.f10991i;
        synchronized (c7405f.f13900a) {
            set = c7405f.f13902c;
        }
        for (InterfaceC6789n.C6790a c6790a : set) {
            c6790a.m5988e(exc);
        }
        if (this.f10996n != 4) {
            this.f10996n = 1;
        }
    }

    /* renamed from: j */
    public final void m6000j(Exception exc, boolean z) {
        int i;
        if (exc instanceof NotProvisionedException) {
            DefaultDrmSessionManager.C6758e c6758e = (DefaultDrmSessionManager.C6758e) this.f10985c;
            c6758e.f10975a.add(this);
            if (c6758e.f10976b == null) {
                c6758e.f10976b = this;
                ExoMediaDrm.C6763c mo5970d = this.f10984b.mo5970d();
                this.f11005w = mo5970d;
                HandlerC6769c handlerC6769c = this.f10999q;
                int i2 = C7408g0.f13905a;
                mo5970d.getClass();
                handlerC6769c.getClass();
                handlerC6769c.obtainMessage(0, new C6770d(C7174j.f12893a.getAndIncrement(), true, SystemClock.elapsedRealtime(), mo5970d)).sendToTarget();
                return;
            }
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        m6001i(i, exc);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* renamed from: k */
    public final boolean m5999k() {
        Set<InterfaceC6789n.C6790a> set;
        if (m6002h()) {
            return true;
        }
        try {
            byte[] mo5969e = this.f10984b.mo5969e();
            this.f11002t = mo5969e;
            this.f11000r = this.f10984b.mo5971c(mo5969e);
            this.f10996n = 3;
            C7405f<InterfaceC6789n.C6790a> c7405f = this.f10991i;
            synchronized (c7405f.f13900a) {
                set = c7405f.f13902c;
            }
            for (InterfaceC6789n.C6790a c6790a : set) {
                c6790a.m5989d(3);
            }
            this.f11002t.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.C6758e c6758e = (DefaultDrmSessionManager.C6758e) this.f10985c;
            c6758e.f10975a.add(this);
            if (c6758e.f10976b == null) {
                c6758e.f10976b = this;
                ExoMediaDrm.C6763c mo5970d = this.f10984b.mo5970d();
                this.f11005w = mo5970d;
                HandlerC6769c handlerC6769c = this.f10999q;
                int i = C7408g0.f13905a;
                mo5970d.getClass();
                handlerC6769c.getClass();
                handlerC6769c.obtainMessage(0, new C6770d(C7174j.f12893a.getAndIncrement(), true, SystemClock.elapsedRealtime(), mo5970d)).sendToTarget();
            }
            return false;
        } catch (Exception e) {
            m6001i(1, e);
            return false;
        }
    }

    /* renamed from: l */
    public final void m5998l(byte[] bArr, int i, boolean z) {
        try {
            ExoMediaDrm.KeyRequest mo5963k = this.f10984b.mo5963k(bArr, this.f10983a, i, this.f10990h);
            this.f11004v = mo5963k;
            HandlerC6769c handlerC6769c = this.f10999q;
            int i2 = C7408g0.f13905a;
            mo5963k.getClass();
            handlerC6769c.getClass();
            handlerC6769c.obtainMessage(1, new C6770d(C7174j.f12893a.getAndIncrement(), z, SystemClock.elapsedRealtime(), mo5963k)).sendToTarget();
        } catch (Exception e) {
            m6000j(e, true);
        }
    }

    @Nullable
    /* renamed from: m */
    public final Map<String, String> m5997m() {
        byte[] bArr = this.f11002t;
        if (bArr == null) {
            return null;
        }
        return this.f10984b.mo5972b(bArr);
    }
}
