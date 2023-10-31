package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.AbstractC3543m;
import com.bumptech.glide.manager.C3802r;
import com.bumptech.glide.request.AbstractC3821a;
import com.bumptech.glide.request.C3822b;
import com.bumptech.glide.request.C3827g;
import com.bumptech.glide.request.C3829i;
import com.bumptech.glide.request.C3830j;
import com.bumptech.glide.request.InterfaceC3823c;
import com.bumptech.glide.request.InterfaceC3825e;
import com.bumptech.glide.request.InterfaceC3826f;
import com.bumptech.glide.request.target.InterfaceC3837g;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.C3861k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.k */
/* loaded from: classes.dex */
public final class C3439k<TranscodeType> extends AbstractC3821a<C3439k<TranscodeType>> {

    /* renamed from: A */
    public final Context f9149A;

    /* renamed from: B */
    public final ComponentCallbacks2C3441l f9150B;

    /* renamed from: C */
    public final Class<TranscodeType> f9151C;

    /* renamed from: D */
    public final C3424g f9152D;
    @NonNull

    /* renamed from: E */
    public AbstractC3779m<?, ? super TranscodeType> f9153E;
    @Nullable

    /* renamed from: F */
    public Object f9154F;
    @Nullable

    /* renamed from: G */
    public ArrayList f9155G;
    @Nullable

    /* renamed from: H */
    public C3439k<TranscodeType> f9156H;
    @Nullable

    /* renamed from: I */
    public C3439k<TranscodeType> f9157I;

    /* renamed from: J */
    public final boolean f9158J = true;

    /* renamed from: K */
    public boolean f9159K;

    /* renamed from: L */
    public boolean f9160L;

    /* renamed from: com.bumptech.glide.k$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3440a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9161a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9162b;

        static {
            int[] iArr = new int[EnumC3432i.values().length];
            f9162b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9162b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9162b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9162b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f9161a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9161a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9161a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9161a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9161a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9161a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9161a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9161a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        C3827g c3827g = (C3827g) ((C3827g) new C3827g().m6468d(AbstractC3543m.f9401b).m6463j()).m6459n();
    }

    @SuppressLint({"CheckResult"})
    public C3439k(@NonNull ComponentCallbacks2C3409b componentCallbacks2C3409b, ComponentCallbacks2C3441l componentCallbacks2C3441l, Class<TranscodeType> cls, Context context) {
        C3827g c3827g;
        this.f9150B = componentCallbacks2C3441l;
        this.f9151C = cls;
        this.f9149A = context;
        Map<Class<?>, AbstractC3779m<?, ?>> map = componentCallbacks2C3441l.f9164a.f9035c.f9081f;
        C3408a c3408a = map.get(cls);
        if (c3408a == null) {
            for (Map.Entry<Class<?>, AbstractC3779m<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    c3408a = (AbstractC3779m<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.f9153E = (AbstractC3779m<?, ? super TranscodeType>) (c3408a == null ? C3424g.f9075k : c3408a);
        this.f9152D = componentCallbacks2C3409b.f9035c;
        Iterator<InterfaceC3826f<Object>> it = componentCallbacks2C3441l.f9172i.iterator();
        while (it.hasNext()) {
            m6737r(it.next());
        }
        synchronized (componentCallbacks2C3441l) {
            c3827g = componentCallbacks2C3441l.f9173j;
        }
        m6736s(c3827g);
    }

    @Override // com.bumptech.glide.request.AbstractC3821a
    @NonNull
    @CheckResult
    /* renamed from: a */
    public final AbstractC3821a mo6471a(@NonNull AbstractC3821a abstractC3821a) {
        C3860j.m6404b(abstractC3821a);
        return (C3439k) super.mo6471a(abstractC3821a);
    }

    @NonNull
    @CheckResult
    /* renamed from: r */
    public final C3439k<TranscodeType> m6737r(@Nullable InterfaceC3826f<TranscodeType> interfaceC3826f) {
        if (this.f9869v) {
            return clone().m6737r(interfaceC3826f);
        }
        if (interfaceC3826f != null) {
            if (this.f9155G == null) {
                this.f9155G = new ArrayList();
            }
            this.f9155G.add(interfaceC3826f);
        }
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: s */
    public final C3439k<TranscodeType> m6736s(@NonNull AbstractC3821a<?> abstractC3821a) {
        C3860j.m6404b(abstractC3821a);
        return (C3439k) super.mo6471a(abstractC3821a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final InterfaceC3823c m6735t(int i, int i2, EnumC3432i enumC3432i, AbstractC3779m abstractC3779m, AbstractC3821a abstractC3821a, @Nullable InterfaceC3825e interfaceC3825e, InterfaceC3837g interfaceC3837g, Object obj) {
        C3822b c3822b;
        C3822b c3822b2;
        C3829i m6730y;
        int i3;
        AbstractC3779m<?, ? super TranscodeType> abstractC3779m2;
        EnumC3432i enumC3432i2;
        int i4;
        int i5;
        if (this.f9157I != null) {
            C3822b c3822b3 = new C3822b(obj, interfaceC3825e);
            c3822b = c3822b3;
            c3822b2 = c3822b3;
        } else {
            c3822b = null;
            c3822b2 = interfaceC3825e;
        }
        C3439k<TranscodeType> c3439k = this.f9156H;
        if (c3439k != null) {
            if (!this.f9160L) {
                AbstractC3779m<?, ? super TranscodeType> abstractC3779m3 = c3439k.f9153E;
                if (c3439k.f9158J) {
                    abstractC3779m2 = abstractC3779m;
                } else {
                    abstractC3779m2 = abstractC3779m3;
                }
                if (AbstractC3821a.m6467f(c3439k.f9848a, 8)) {
                    enumC3432i2 = this.f9156H.f9851d;
                } else {
                    int ordinal = enumC3432i.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                enumC3432i2 = EnumC3432i.NORMAL;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f9851d);
                            }
                        } else {
                            enumC3432i2 = EnumC3432i.HIGH;
                        }
                    } else {
                        enumC3432i2 = EnumC3432i.IMMEDIATE;
                    }
                }
                EnumC3432i enumC3432i3 = enumC3432i2;
                C3439k<TranscodeType> c3439k2 = this.f9156H;
                int i6 = c3439k2.f9858k;
                int i7 = c3439k2.f9857j;
                if (C3861k.m6397g(i, i2)) {
                    C3439k<TranscodeType> c3439k3 = this.f9156H;
                    if (!C3861k.m6397g(c3439k3.f9858k, c3439k3.f9857j)) {
                        i5 = abstractC3821a.f9858k;
                        i4 = abstractC3821a.f9857j;
                        C3830j c3830j = new C3830j(obj, c3822b2);
                        C3829i m6730y2 = m6730y(i, i2, enumC3432i, abstractC3779m, abstractC3821a, c3830j, interfaceC3837g, obj);
                        this.f9160L = true;
                        C3439k<TranscodeType> c3439k4 = this.f9156H;
                        InterfaceC3823c m6735t = c3439k4.m6735t(i5, i4, enumC3432i3, abstractC3779m2, c3439k4, c3830j, interfaceC3837g, obj);
                        this.f9160L = false;
                        c3830j.f9912c = m6730y2;
                        c3830j.f9913d = m6735t;
                        m6730y = c3830j;
                    }
                }
                i4 = i7;
                i5 = i6;
                C3830j c3830j2 = new C3830j(obj, c3822b2);
                C3829i m6730y22 = m6730y(i, i2, enumC3432i, abstractC3779m, abstractC3821a, c3830j2, interfaceC3837g, obj);
                this.f9160L = true;
                C3439k<TranscodeType> c3439k42 = this.f9156H;
                InterfaceC3823c m6735t2 = c3439k42.m6735t(i5, i4, enumC3432i3, abstractC3779m2, c3439k42, c3830j2, interfaceC3837g, obj);
                this.f9160L = false;
                c3830j2.f9912c = m6730y22;
                c3830j2.f9913d = m6735t2;
                m6730y = c3830j2;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            m6730y = m6730y(i, i2, enumC3432i, abstractC3779m, abstractC3821a, c3822b2, interfaceC3837g, obj);
        }
        if (c3822b == null) {
            return m6730y;
        }
        C3439k<TranscodeType> c3439k5 = this.f9157I;
        int i8 = c3439k5.f9858k;
        int i9 = c3439k5.f9857j;
        if (C3861k.m6397g(i, i2)) {
            C3439k<TranscodeType> c3439k6 = this.f9157I;
            if (!C3861k.m6397g(c3439k6.f9858k, c3439k6.f9857j)) {
                int i10 = abstractC3821a.f9858k;
                i3 = abstractC3821a.f9857j;
                i8 = i10;
                C3439k<TranscodeType> c3439k7 = this.f9157I;
                InterfaceC3823c m6735t3 = c3439k7.m6735t(i8, i3, c3439k7.f9851d, c3439k7.f9153E, c3439k7, c3822b, interfaceC3837g, obj);
                c3822b.f9876c = m6730y;
                c3822b.f9877d = m6735t3;
                return c3822b;
            }
        }
        i3 = i9;
        C3439k<TranscodeType> c3439k72 = this.f9157I;
        InterfaceC3823c m6735t32 = c3439k72.m6735t(i8, i3, c3439k72.f9851d, c3439k72.f9153E, c3439k72, c3822b, interfaceC3837g, obj);
        c3822b.f9876c = m6730y;
        c3822b.f9877d = m6735t32;
        return c3822b;
    }

    @Override // com.bumptech.glide.request.AbstractC3821a
    @CheckResult
    /* renamed from: u */
    public final C3439k<TranscodeType> clone() {
        C3439k<TranscodeType> c3439k = (C3439k) super.clone();
        c3439k.f9153E = (AbstractC3779m<?, ? super TranscodeType>) c3439k.f9153E.clone();
        if (c3439k.f9155G != null) {
            c3439k.f9155G = new ArrayList(c3439k.f9155G);
        }
        C3439k<TranscodeType> c3439k2 = c3439k.f9156H;
        if (c3439k2 != null) {
            c3439k.f9156H = c3439k2.clone();
        }
        C3439k<TranscodeType> c3439k3 = c3439k.f9157I;
        if (c3439k3 != null) {
            c3439k.f9157I = c3439k3.clone();
        }
        return c3439k;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    @androidx.annotation.NonNull
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6733v(@androidx.annotation.NonNull android.widget.ImageView r5) {
        /*
            r4 = this;
            char[] r0 = com.bumptech.glide.util.C3861k.f9956a
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            if (r0 != r1) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto La6
            com.bumptech.glide.util.C3860j.m6404b(r5)
            int r0 = r4.f9848a
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = com.bumptech.glide.request.AbstractC3821a.m6467f(r0, r1)
            if (r0 != 0) goto L64
            boolean r0 = r4.f9861n
            if (r0 == 0) goto L64
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L64
            int[] r0 = com.bumptech.glide.C3439k.C3440a.f9161a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L54;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L4b;
                default: goto L38;
            }
        L38:
            goto L64
        L39:
            com.bumptech.glide.k r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.l$e r1 = com.bumptech.glide.load.resource.bitmap.AbstractC3710l.f9670a
            com.bumptech.glide.load.resource.bitmap.t r3 = new com.bumptech.glide.load.resource.bitmap.t
            r3.<init>()
            com.bumptech.glide.request.a r0 = r0.m6465h(r1, r3)
            r0.f9872y = r2
            goto L65
        L4b:
            com.bumptech.glide.k r0 = r4.clone()
            com.bumptech.glide.request.a r0 = r0.m6466g()
            goto L65
        L54:
            com.bumptech.glide.k r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.l$d r1 = com.bumptech.glide.load.resource.bitmap.AbstractC3710l.f9672c
            com.bumptech.glide.load.resource.bitmap.i r2 = new com.bumptech.glide.load.resource.bitmap.i
            r2.<init>()
            com.bumptech.glide.request.a r0 = r0.m6465h(r1, r2)
            goto L65
        L64:
            r0 = r4
        L65:
            com.bumptech.glide.g r1 = r4.f9152D
            cn.hutool.core.codec.c r1 = r1.f9078c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class<TranscodeType> r2 = r4.f9151C
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7c
            com.bumptech.glide.request.target.b r1 = new com.bumptech.glide.request.target.b
            r1.<init>(r5)
            goto L89
        L7c:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L8d
            com.bumptech.glide.request.target.d r1 = new com.bumptech.glide.request.target.d
            r1.<init>(r5)
        L89:
            r4.m6732w(r1, r0)
            return
        L8d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        La6:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You must call this method on the main thread"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C3439k.m6733v(android.widget.ImageView):void");
    }

    /* renamed from: w */
    public final void m6732w(@NonNull InterfaceC3837g interfaceC3837g, AbstractC3821a abstractC3821a) {
        boolean z;
        C3860j.m6404b(interfaceC3837g);
        if (this.f9159K) {
            Object obj = new Object();
            AbstractC3779m<?, ? super TranscodeType> abstractC3779m = this.f9153E;
            InterfaceC3823c m6735t = m6735t(abstractC3821a.f9858k, abstractC3821a.f9857j, abstractC3821a.f9851d, abstractC3779m, abstractC3821a, null, interfaceC3837g, obj);
            InterfaceC3823c mo6426f = interfaceC3837g.mo6426f();
            if (m6735t.mo6441c(mo6426f)) {
                if (!abstractC3821a.f9856i && mo6426f.mo6435i()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C3860j.m6404b(mo6426f);
                    if (!mo6426f.isRunning()) {
                        mo6426f.mo6437g();
                        return;
                    }
                    return;
                }
            }
            this.f9150B.m6729i(interfaceC3837g);
            interfaceC3837g.mo6427c(m6735t);
            ComponentCallbacks2C3441l componentCallbacks2C3441l = this.f9150B;
            synchronized (componentCallbacks2C3441l) {
                componentCallbacks2C3441l.f9169f.f9830a.add(interfaceC3837g);
                C3802r c3802r = componentCallbacks2C3441l.f9167d;
                c3802r.f9820a.add(m6735t);
                if (!c3802r.f9822c) {
                    m6735t.mo6437g();
                } else {
                    m6735t.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    c3802r.f9821b.add(m6735t);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @NonNull
    /* renamed from: x */
    public final C3439k<TranscodeType> m6731x(@Nullable Object obj) {
        if (this.f9869v) {
            return clone().m6731x(obj);
        }
        this.f9154F = obj;
        this.f9159K = true;
        m6462k();
        return this;
    }

    /* renamed from: y */
    public final C3829i m6730y(int i, int i2, EnumC3432i enumC3432i, AbstractC3779m abstractC3779m, AbstractC3821a abstractC3821a, InterfaceC3825e interfaceC3825e, InterfaceC3837g interfaceC3837g, Object obj) {
        Context context = this.f9149A;
        Object obj2 = this.f9154F;
        Class<TranscodeType> cls = this.f9151C;
        ArrayList arrayList = this.f9155G;
        C3424g c3424g = this.f9152D;
        return new C3829i(context, c3424g, obj, obj2, cls, abstractC3821a, i, i2, enumC3432i, interfaceC3837g, arrayList, interfaceC3825e, c3424g.f9082g, abstractC3779m.f9796a);
    }
}
