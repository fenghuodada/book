package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;
import com.bumptech.glide.C3422e;
import com.bumptech.glide.C3424g;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.C3566s;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.model.InterfaceC3623l;
import com.bumptech.glide.load.resource.drawable.C3742a;
import com.bumptech.glide.request.target.InterfaceC3836f;
import com.bumptech.glide.request.target.InterfaceC3837g;
import com.bumptech.glide.request.transition.C3841a;
import com.bumptech.glide.request.transition.InterfaceC3843b;
import com.bumptech.glide.util.C3852e;
import com.bumptech.glide.util.C3855f;
import com.bumptech.glide.util.C3861k;
import com.bumptech.glide.util.pool.AbstractC3871d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.request.i */
/* loaded from: classes.dex */
public final class C3829i<R> implements InterfaceC3823c, InterfaceC3836f, InterfaceC3828h {

    /* renamed from: D */
    public static final boolean f9880D = Log.isLoggable("Request", 2);
    @GuardedBy("requestLock")

    /* renamed from: A */
    public int f9881A;
    @GuardedBy("requestLock")

    /* renamed from: B */
    public boolean f9882B;
    @Nullable

    /* renamed from: C */
    public final RuntimeException f9883C;
    @Nullable

    /* renamed from: a */
    public final String f9884a;

    /* renamed from: b */
    public final AbstractC3871d.C3872a f9885b;

    /* renamed from: c */
    public final Object f9886c;
    @Nullable

    /* renamed from: d */
    public final InterfaceC3826f<R> f9887d;

    /* renamed from: e */
    public final InterfaceC3825e f9888e;

    /* renamed from: f */
    public final Context f9889f;

    /* renamed from: g */
    public final C3424g f9890g;
    @Nullable

    /* renamed from: h */
    public final Object f9891h;

    /* renamed from: i */
    public final Class<R> f9892i;

    /* renamed from: j */
    public final AbstractC3821a<?> f9893j;

    /* renamed from: k */
    public final int f9894k;

    /* renamed from: l */
    public final int f9895l;

    /* renamed from: m */
    public final EnumC3432i f9896m;

    /* renamed from: n */
    public final InterfaceC3837g<R> f9897n;
    @Nullable

    /* renamed from: o */
    public final List<InterfaceC3826f<R>> f9898o;

    /* renamed from: p */
    public final InterfaceC3843b<? super R> f9899p;

    /* renamed from: q */
    public final Executor f9900q;
    @GuardedBy("requestLock")

    /* renamed from: r */
    public InterfaceC3573x<R> f9901r;
    @GuardedBy("requestLock")

    /* renamed from: s */
    public C3549n.C3555d f9902s;
    @GuardedBy("requestLock")

    /* renamed from: t */
    public long f9903t;

    /* renamed from: u */
    public volatile C3549n f9904u;
    @GuardedBy("requestLock")

    /* renamed from: v */
    public int f9905v;
    @Nullable
    @GuardedBy("requestLock")

    /* renamed from: w */
    public Drawable f9906w;
    @Nullable
    @GuardedBy("requestLock")

    /* renamed from: x */
    public Drawable f9907x;
    @Nullable
    @GuardedBy("requestLock")

    /* renamed from: y */
    public Drawable f9908y;
    @GuardedBy("requestLock")

    /* renamed from: z */
    public int f9909z;

    public C3829i(Context context, C3424g c3424g, @NonNull Object obj, @Nullable Object obj2, Class cls, AbstractC3821a abstractC3821a, int i, int i2, EnumC3432i enumC3432i, InterfaceC3837g interfaceC3837g, @Nullable ArrayList arrayList, InterfaceC3825e interfaceC3825e, C3549n c3549n, C3841a.C3842a c3842a) {
        C3852e.ExecutorC3853a executorC3853a = C3852e.f9943a;
        this.f9884a = f9880D ? String.valueOf(hashCode()) : null;
        this.f9885b = new AbstractC3871d.C3872a();
        this.f9886c = obj;
        this.f9889f = context;
        this.f9890g = c3424g;
        this.f9891h = obj2;
        this.f9892i = cls;
        this.f9893j = abstractC3821a;
        this.f9894k = i;
        this.f9895l = i2;
        this.f9896m = enumC3432i;
        this.f9897n = interfaceC3837g;
        this.f9887d = null;
        this.f9898o = arrayList;
        this.f9888e = interfaceC3825e;
        this.f9904u = c3549n;
        this.f9899p = c3842a;
        this.f9900q = executorC3853a;
        this.f9905v = 1;
        if (this.f9883C == null && c3424g.f9083h.f9132a.containsKey(C3422e.class)) {
            this.f9883C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: a */
    public final boolean mo6443a() {
        boolean z;
        synchronized (this.f9886c) {
            z = this.f9905v == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3836f
    /* renamed from: b */
    public final void mo6432b(int i, int i2) {
        Object obj;
        int round;
        int i3 = i;
        this.f9885b.m6390a();
        Object obj2 = this.f9886c;
        synchronized (obj2) {
            try {
                boolean z = f9880D;
                if (z) {
                    m6447k("Got onSizeReady in " + C3855f.m6413a(this.f9903t));
                }
                if (this.f9905v == 3) {
                    this.f9905v = 2;
                    float f = this.f9893j.f9849b;
                    if (i3 != Integer.MIN_VALUE) {
                        i3 = Math.round(i3 * f);
                    }
                    this.f9909z = i3;
                    if (i2 == Integer.MIN_VALUE) {
                        round = i2;
                    } else {
                        round = Math.round(f * i2);
                    }
                    this.f9881A = round;
                    if (z) {
                        m6447k("finished setup for calling load in " + C3855f.m6413a(this.f9903t));
                    }
                    C3549n c3549n = this.f9904u;
                    C3424g c3424g = this.f9890g;
                    Object obj3 = this.f9891h;
                    AbstractC3821a<?> abstractC3821a = this.f9893j;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                    try {
                        this.f9902s = c3549n.m6639b(c3424g, obj3, abstractC3821a.f9859l, this.f9909z, this.f9881A, abstractC3821a.f9866s, this.f9892i, this.f9896m, abstractC3821a.f9850c, abstractC3821a.f9865r, abstractC3821a.f9860m, abstractC3821a.f9872y, abstractC3821a.f9864q, abstractC3821a.f9856i, abstractC3821a.f9870w, abstractC3821a.f9873z, abstractC3821a.f9871x, this, this.f9900q);
                        if (this.f9905v != 2) {
                            this.f9902s = null;
                        }
                        if (z) {
                            m6447k("finished onSizeReady in " + C3855f.m6413a(this.f9903t));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: c */
    public final boolean mo6441c(InterfaceC3823c interfaceC3823c) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        AbstractC3821a<?> abstractC3821a;
        EnumC3432i enumC3432i;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        AbstractC3821a<?> abstractC3821a2;
        EnumC3432i enumC3432i2;
        int i6;
        boolean equals;
        if (!(interfaceC3823c instanceof C3829i)) {
            return false;
        }
        synchronized (this.f9886c) {
            i = this.f9894k;
            i2 = this.f9895l;
            obj = this.f9891h;
            cls = this.f9892i;
            abstractC3821a = this.f9893j;
            enumC3432i = this.f9896m;
            List<InterfaceC3826f<R>> list = this.f9898o;
            if (list != null) {
                i3 = list.size();
            } else {
                i3 = 0;
            }
        }
        C3829i c3829i = (C3829i) interfaceC3823c;
        synchronized (c3829i.f9886c) {
            i4 = c3829i.f9894k;
            i5 = c3829i.f9895l;
            obj2 = c3829i.f9891h;
            cls2 = c3829i.f9892i;
            abstractC3821a2 = c3829i.f9893j;
            enumC3432i2 = c3829i.f9896m;
            List<InterfaceC3826f<R>> list2 = c3829i.f9898o;
            if (list2 != null) {
                i6 = list2.size();
            } else {
                i6 = 0;
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = C3861k.f9956a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else if (obj instanceof InterfaceC3623l) {
                equals = ((InterfaceC3623l) obj).m6593a();
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2) && abstractC3821a.equals(abstractC3821a2) && enumC3432i == enumC3432i2 && i3 == i6) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0011, B:10:0x0013, B:12:0x001b, B:14:0x001f, B:16:0x0023, B:22:0x002f, B:23:0x0038, B:24:0x003a, B:28:0x0046, B:29:0x004d), top: B:33:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.bumptech.glide.request.InterfaceC3823c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9886c
            monitor-enter(r0)
            boolean r1 = r5.f9882B     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L46
            com.bumptech.glide.util.pool.d$a r1 = r5.f9885b     // Catch: java.lang.Throwable -> L4e
            r1.m6390a()     // Catch: java.lang.Throwable -> L4e
            int r1 = r5.f9905v     // Catch: java.lang.Throwable -> L4e
            r2 = 6
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            return
        L13:
            r5.m6451e()     // Catch: java.lang.Throwable -> L4e
            com.bumptech.glide.load.engine.x<R> r1 = r5.f9901r     // Catch: java.lang.Throwable -> L4e
            r3 = 0
            if (r1 == 0) goto L1e
            r5.f9901r = r3     // Catch: java.lang.Throwable -> L4e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            com.bumptech.glide.request.e r3 = r5.f9888e     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2c
            boolean r3 = r3.mo6434j(r5)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L2a
            goto L2c
        L2a:
            r3 = 0
            goto L2d
        L2c:
            r3 = 1
        L2d:
            if (r3 == 0) goto L38
            com.bumptech.glide.request.target.g<R> r3 = r5.f9897n     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r4 = r5.m6450f()     // Catch: java.lang.Throwable -> L4e
            r3.mo6425g(r4)     // Catch: java.lang.Throwable -> L4e
        L38:
            r5.f9905v = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L45
            com.bumptech.glide.load.engine.n r0 = r5.f9904u
            r0.getClass()
            com.bumptech.glide.load.engine.C3549n.m6634g(r1)
        L45:
            return
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
            throw r1     // Catch: java.lang.Throwable -> L4e
        L4e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C3829i.clear():void");
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: d */
    public final boolean mo6440d() {
        boolean z;
        synchronized (this.f9886c) {
            z = this.f9905v == 6;
        }
        return z;
    }

    @GuardedBy("requestLock")
    /* renamed from: e */
    public final void m6451e() {
        if (!this.f9882B) {
            this.f9885b.m6390a();
            this.f9897n.mo6428a(this);
            C3549n.C3555d c3555d = this.f9902s;
            if (c3555d != null) {
                synchronized (C3549n.this) {
                    c3555d.f9425a.m6623j(c3555d.f9426b);
                }
                this.f9902s = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @GuardedBy("requestLock")
    /* renamed from: f */
    public final Drawable m6450f() {
        int i;
        if (this.f9907x == null) {
            AbstractC3821a<?> abstractC3821a = this.f9893j;
            Drawable drawable = abstractC3821a.f9854g;
            this.f9907x = drawable;
            if (drawable == null && (i = abstractC3821a.f9855h) > 0) {
                this.f9907x = m6448j(i);
            }
        }
        return this.f9907x;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: g */
    public final void mo6437g() {
        int i;
        synchronized (this.f9886c) {
            try {
                if (!this.f9882B) {
                    this.f9885b.m6390a();
                    int i2 = C3855f.f9946b;
                    this.f9903t = SystemClock.elapsedRealtimeNanos();
                    int i3 = 3;
                    if (this.f9891h == null) {
                        if (C3861k.m6397g(this.f9894k, this.f9895l)) {
                            this.f9909z = this.f9894k;
                            this.f9881A = this.f9895l;
                        }
                        if (this.f9908y == null) {
                            AbstractC3821a<?> abstractC3821a = this.f9893j;
                            Drawable drawable = abstractC3821a.f9862o;
                            this.f9908y = drawable;
                            if (drawable == null && (i = abstractC3821a.f9863p) > 0) {
                                this.f9908y = m6448j(i);
                            }
                        }
                        if (this.f9908y == null) {
                            i3 = 5;
                        }
                        m6446l(new C3566s("Received null model"), i3);
                        return;
                    }
                    int i4 = this.f9905v;
                    if (i4 != 2) {
                        boolean z = false;
                        if (i4 == 4) {
                            m6445m(this.f9901r, EnumC3444a.MEMORY_CACHE, false);
                            return;
                        }
                        this.f9905v = 3;
                        if (C3861k.m6397g(this.f9894k, this.f9895l)) {
                            mo6432b(this.f9894k, this.f9895l);
                        } else {
                            this.f9897n.mo6424h(this);
                        }
                        int i5 = this.f9905v;
                        if (i5 == 2 || i5 == 3) {
                            InterfaceC3825e interfaceC3825e = this.f9888e;
                            if ((interfaceC3825e == null || interfaceC3825e.mo6439e(this)) ? true : true) {
                                this.f9897n.mo6429e(m6450f());
                            }
                        }
                        if (f9880D) {
                            m6447k("finished run method in " + C3855f.m6413a(this.f9903t));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: h */
    public final boolean m6449h() {
        InterfaceC3825e interfaceC3825e = this.f9888e;
        return interfaceC3825e == null || !interfaceC3825e.getRoot().mo6443a();
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: i */
    public final boolean mo6435i() {
        boolean z;
        synchronized (this.f9886c) {
            z = this.f9905v == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9886c) {
            int i = this.f9905v;
            z = i == 2 || i == 3;
        }
        return z;
    }

    @GuardedBy("requestLock")
    /* renamed from: j */
    public final Drawable m6448j(@DrawableRes int i) {
        Resources.Theme theme = this.f9893j.f9868u;
        if (theme == null) {
            theme = this.f9889f.getTheme();
        }
        C3424g c3424g = this.f9890g;
        return C3742a.m6520a(c3424g, c3424g, i, theme);
    }

    /* renamed from: k */
    public final void m6447k(String str) {
        StringBuilder m12339b = C0510h.m12339b(str, " this: ");
        m12339b.append(this.f9884a);
        Log.v("Request", m12339b.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x008e, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x0013, B:8:0x0042, B:9:0x0045, B:58:0x00d4, B:60:0x00da, B:61:0x00dd, B:11:0x004f, B:13:0x0053, B:14:0x0058, B:16:0x005e, B:18:0x006e, B:20:0x0072, B:24:0x007e, B:26:0x0081, B:28:0x0085, B:36:0x0093, B:38:0x0097, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:45:0x00ad, B:47:0x00b1, B:49:0x00b5, B:51:0x00bd, B:53:0x00c1, B:54:0x00c7, B:56:0x00cb, B:57:0x00cf), top: B:68:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[Catch: all -> 0x00e2, TryCatch #2 {, blocks: (B:4:0x000a, B:6:0x0013, B:8:0x0042, B:9:0x0045, B:58:0x00d4, B:60:0x00da, B:61:0x00dd, B:11:0x004f, B:13:0x0053, B:14:0x0058, B:16:0x005e, B:18:0x006e, B:20:0x0072, B:24:0x007e, B:26:0x0081, B:28:0x0085, B:36:0x0093, B:38:0x0097, B:40:0x009b, B:42:0x00a3, B:44:0x00a7, B:45:0x00ad, B:47:0x00b1, B:49:0x00b5, B:51:0x00bd, B:53:0x00c1, B:54:0x00c7, B:56:0x00cb, B:57:0x00cf), top: B:68:0x000a }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6446l(com.bumptech.glide.load.engine.C3566s r6, int r7) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C3829i.m6446l(com.bumptech.glide.load.engine.s, int):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b5 -> B:61:0x00b8). Please submit an issue!!! */
    /* renamed from: m */
    public final void m6445m(InterfaceC3573x<?> interfaceC3573x, EnumC3444a enumC3444a, boolean z) {
        C3829i<R> c3829i;
        C3829i<R> c3829i2;
        Throwable th;
        Object obj;
        String str;
        boolean z2;
        this.f9885b.m6390a();
        InterfaceC3573x<?> interfaceC3573x2 = null;
        try {
            synchronized (this.f9886c) {
                try {
                    this.f9902s = null;
                    if (interfaceC3573x == null) {
                        m6446l(new C3566s("Expected to receive a Resource<R> with an object of " + this.f9892i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = interfaceC3573x.get();
                    try {
                        if (obj2 != null && this.f9892i.isAssignableFrom(obj2.getClass())) {
                            InterfaceC3825e interfaceC3825e = this.f9888e;
                            if (interfaceC3825e != null && !interfaceC3825e.mo6438f(this)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                this.f9901r = null;
                                this.f9905v = 4;
                                this.f9904u.getClass();
                                C3549n.m6634g(interfaceC3573x);
                            }
                            m6444n(interfaceC3573x, obj2, enumC3444a);
                            return;
                        }
                        this.f9901r = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f9892i);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC3573x);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        m6446l(new C3566s(sb.toString()), 5);
                        this.f9904u.getClass();
                        C3549n.m6634g(interfaceC3573x);
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC3573x2 = interfaceC3573x;
                        c3829i = this;
                        try {
                        } catch (Throwable th3) {
                            c3829i2 = c3829i;
                            th = th3;
                            C3829i<R> c3829i3 = c3829i2;
                            th = th;
                            c3829i = c3829i3;
                            throw th;
                        }
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                            if (interfaceC3573x2 != null) {
                                c3829i.f9904u.getClass();
                                C3549n.m6634g(interfaceC3573x2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c3829i2 = this;
                    C3829i<R> c3829i32 = c3829i2;
                    th = th;
                    c3829i = c3829i32;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            c3829i = this;
        }
    }

    @GuardedBy("requestLock")
    /* renamed from: n */
    public final void m6444n(InterfaceC3573x interfaceC3573x, Object obj, EnumC3444a enumC3444a) {
        boolean z;
        m6449h();
        this.f9905v = 4;
        this.f9901r = interfaceC3573x;
        if (this.f9890g.f9084i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + enumC3444a + " for " + this.f9891h + " with size [" + this.f9909z + "x" + this.f9881A + "] in " + C3855f.m6413a(this.f9903t) + " ms");
        }
        boolean z2 = true;
        this.f9882B = true;
        try {
            List<InterfaceC3826f<R>> list = this.f9898o;
            if (list != null) {
                z = false;
                for (InterfaceC3826f<R> interfaceC3826f : list) {
                    z |= interfaceC3826f.m6453a();
                }
            } else {
                z = false;
            }
            InterfaceC3826f<R> interfaceC3826f2 = this.f9887d;
            if (interfaceC3826f2 == null || !interfaceC3826f2.m6453a()) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.f9899p.getClass();
                this.f9897n.mo6431b(obj);
            }
            this.f9882B = false;
            InterfaceC3825e interfaceC3825e = this.f9888e;
            if (interfaceC3825e != null) {
                interfaceC3825e.mo6436h(this);
            }
        } catch (Throwable th) {
            this.f9882B = false;
            throw th;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final void pause() {
        synchronized (this.f9886c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
