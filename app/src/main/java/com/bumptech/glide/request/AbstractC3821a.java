package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.EnumC3432i;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.AbstractC3543m;
import com.bumptech.glide.load.resource.bitmap.AbstractC3689f;
import com.bumptech.glide.load.resource.bitmap.AbstractC3710l;
import com.bumptech.glide.load.resource.bitmap.C3703j;
import com.bumptech.glide.load.resource.bitmap.C3725r;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.load.resource.gif.C3761f;
import com.bumptech.glide.request.AbstractC3821a;
import com.bumptech.glide.signature.C3844a;
import com.bumptech.glide.signature.C3845b;
import com.bumptech.glide.util.C3849b;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.C3861k;
import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;

/* renamed from: com.bumptech.glide.request.a */
/* loaded from: classes.dex */
public abstract class AbstractC3821a<T extends AbstractC3821a<T>> implements Cloneable {

    /* renamed from: a */
    public int f9848a;
    @Nullable

    /* renamed from: e */
    public Drawable f9852e;

    /* renamed from: f */
    public int f9853f;
    @Nullable

    /* renamed from: g */
    public Drawable f9854g;

    /* renamed from: h */
    public int f9855h;

    /* renamed from: m */
    public boolean f9860m;
    @Nullable

    /* renamed from: o */
    public Drawable f9862o;

    /* renamed from: p */
    public int f9863p;

    /* renamed from: t */
    public boolean f9867t;
    @Nullable

    /* renamed from: u */
    public Resources.Theme f9868u;

    /* renamed from: v */
    public boolean f9869v;

    /* renamed from: w */
    public boolean f9870w;

    /* renamed from: x */
    public boolean f9871x;

    /* renamed from: z */
    public boolean f9873z;

    /* renamed from: b */
    public float f9849b = 1.0f;
    @NonNull

    /* renamed from: c */
    public AbstractC3543m f9850c = AbstractC3543m.f9402c;
    @NonNull

    /* renamed from: d */
    public EnumC3432i f9851d = EnumC3432i.NORMAL;

    /* renamed from: i */
    public boolean f9856i = true;

    /* renamed from: j */
    public int f9857j = -1;

    /* renamed from: k */
    public int f9858k = -1;
    @NonNull

    /* renamed from: l */
    public InterfaceC3577g f9859l = C3844a.f9929b;

    /* renamed from: n */
    public boolean f9861n = true;
    @NonNull

    /* renamed from: q */
    public C3581i f9864q = new C3581i();
    @NonNull

    /* renamed from: r */
    public C3849b f9865r = new C3849b();
    @NonNull

    /* renamed from: s */
    public Class<?> f9866s = Object.class;

    /* renamed from: y */
    public boolean f9872y = true;

    /* renamed from: f */
    public static boolean m6467f(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    @CheckResult
    /* renamed from: a */
    public T mo6471a(@NonNull AbstractC3821a<?> abstractC3821a) {
        if (this.f9869v) {
            return (T) clone().mo6471a(abstractC3821a);
        }
        if (m6467f(abstractC3821a.f9848a, 2)) {
            this.f9849b = abstractC3821a.f9849b;
        }
        if (m6467f(abstractC3821a.f9848a, 262144)) {
            this.f9870w = abstractC3821a.f9870w;
        }
        if (m6467f(abstractC3821a.f9848a, 1048576)) {
            this.f9873z = abstractC3821a.f9873z;
        }
        if (m6467f(abstractC3821a.f9848a, 4)) {
            this.f9850c = abstractC3821a.f9850c;
        }
        if (m6467f(abstractC3821a.f9848a, 8)) {
            this.f9851d = abstractC3821a.f9851d;
        }
        if (m6467f(abstractC3821a.f9848a, 16)) {
            this.f9852e = abstractC3821a.f9852e;
            this.f9853f = 0;
            this.f9848a &= -33;
        }
        if (m6467f(abstractC3821a.f9848a, 32)) {
            this.f9853f = abstractC3821a.f9853f;
            this.f9852e = null;
            this.f9848a &= -17;
        }
        if (m6467f(abstractC3821a.f9848a, 64)) {
            this.f9854g = abstractC3821a.f9854g;
            this.f9855h = 0;
            this.f9848a &= -129;
        }
        if (m6467f(abstractC3821a.f9848a, 128)) {
            this.f9855h = abstractC3821a.f9855h;
            this.f9854g = null;
            this.f9848a &= -65;
        }
        if (m6467f(abstractC3821a.f9848a, 256)) {
            this.f9856i = abstractC3821a.f9856i;
        }
        if (m6467f(abstractC3821a.f9848a, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f9858k = abstractC3821a.f9858k;
            this.f9857j = abstractC3821a.f9857j;
        }
        if (m6467f(abstractC3821a.f9848a, 1024)) {
            this.f9859l = abstractC3821a.f9859l;
        }
        if (m6467f(abstractC3821a.f9848a, 4096)) {
            this.f9866s = abstractC3821a.f9866s;
        }
        if (m6467f(abstractC3821a.f9848a, 8192)) {
            this.f9862o = abstractC3821a.f9862o;
            this.f9863p = 0;
            this.f9848a &= -16385;
        }
        if (m6467f(abstractC3821a.f9848a, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f9863p = abstractC3821a.f9863p;
            this.f9862o = null;
            this.f9848a &= -8193;
        }
        if (m6467f(abstractC3821a.f9848a, 32768)) {
            this.f9868u = abstractC3821a.f9868u;
        }
        if (m6467f(abstractC3821a.f9848a, 65536)) {
            this.f9861n = abstractC3821a.f9861n;
        }
        if (m6467f(abstractC3821a.f9848a, 131072)) {
            this.f9860m = abstractC3821a.f9860m;
        }
        if (m6467f(abstractC3821a.f9848a, 2048)) {
            this.f9865r.putAll(abstractC3821a.f9865r);
            this.f9872y = abstractC3821a.f9872y;
        }
        if (m6467f(abstractC3821a.f9848a, 524288)) {
            this.f9871x = abstractC3821a.f9871x;
        }
        if (!this.f9861n) {
            this.f9865r.clear();
            this.f9860m = false;
            this.f9848a = this.f9848a & (-2049) & (-131073);
            this.f9872y = true;
        }
        this.f9848a |= abstractC3821a.f9848a;
        this.f9864q.f9520b.mo6417i(abstractC3821a.f9864q.f9520b);
        m6462k();
        return this;
    }

    @Override // 
    @CheckResult
    /* renamed from: b */
    public T clone() {
        try {
            T t = (T) super.clone();
            C3581i c3581i = new C3581i();
            t.f9864q = c3581i;
            c3581i.f9520b.mo6417i(this.f9864q.f9520b);
            C3849b c3849b = new C3849b();
            t.f9865r = c3849b;
            c3849b.putAll(this.f9865r);
            t.f9867t = false;
            t.f9869v = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    /* renamed from: c */
    public final T m6469c(@NonNull Class<?> cls) {
        if (this.f9869v) {
            return (T) clone().m6469c(cls);
        }
        this.f9866s = cls;
        this.f9848a |= 4096;
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: d */
    public final T m6468d(@NonNull AbstractC3543m abstractC3543m) {
        if (this.f9869v) {
            return (T) clone().m6468d(abstractC3543m);
        }
        C3860j.m6404b(abstractC3543m);
        this.f9850c = abstractC3543m;
        this.f9848a |= 4;
        m6462k();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC3821a) {
            AbstractC3821a abstractC3821a = (AbstractC3821a) obj;
            if (Float.compare(abstractC3821a.f9849b, this.f9849b) == 0 && this.f9853f == abstractC3821a.f9853f && C3861k.m6403a(this.f9852e, abstractC3821a.f9852e) && this.f9855h == abstractC3821a.f9855h && C3861k.m6403a(this.f9854g, abstractC3821a.f9854g) && this.f9863p == abstractC3821a.f9863p && C3861k.m6403a(this.f9862o, abstractC3821a.f9862o) && this.f9856i == abstractC3821a.f9856i && this.f9857j == abstractC3821a.f9857j && this.f9858k == abstractC3821a.f9858k && this.f9860m == abstractC3821a.f9860m && this.f9861n == abstractC3821a.f9861n && this.f9870w == abstractC3821a.f9870w && this.f9871x == abstractC3821a.f9871x && this.f9850c.equals(abstractC3821a.f9850c) && this.f9851d == abstractC3821a.f9851d && this.f9864q.equals(abstractC3821a.f9864q) && this.f9865r.equals(abstractC3821a.f9865r) && this.f9866s.equals(abstractC3821a.f9866s) && C3861k.m6403a(this.f9859l, abstractC3821a.f9859l) && C3861k.m6403a(this.f9868u, abstractC3821a.f9868u)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    @CheckResult
    /* renamed from: g */
    public final T m6466g() {
        T t = (T) m6465h(AbstractC3710l.f9671b, new C3703j());
        t.f9872y = true;
        return t;
    }

    @NonNull
    /* renamed from: h */
    public final AbstractC3821a m6465h(@NonNull AbstractC3710l abstractC3710l, @NonNull AbstractC3689f abstractC3689f) {
        if (this.f9869v) {
            return clone().m6465h(abstractC3710l, abstractC3689f);
        }
        C3578h c3578h = AbstractC3710l.f9675f;
        C3860j.m6404b(abstractC3710l);
        m6461l(c3578h, abstractC3710l);
        return m6458o(abstractC3689f, false);
    }

    public final int hashCode() {
        float f = this.f9849b;
        char[] cArr = C3861k.f9956a;
        return C3861k.m6398f(C3861k.m6398f(C3861k.m6398f(C3861k.m6398f(C3861k.m6398f(C3861k.m6398f(C3861k.m6398f((((((((((((((C3861k.m6398f((C3861k.m6398f((C3861k.m6398f(((Float.floatToIntBits(f) + 527) * 31) + this.f9853f, this.f9852e) * 31) + this.f9855h, this.f9854g) * 31) + this.f9863p, this.f9862o) * 31) + (this.f9856i ? 1 : 0)) * 31) + this.f9857j) * 31) + this.f9858k) * 31) + (this.f9860m ? 1 : 0)) * 31) + (this.f9861n ? 1 : 0)) * 31) + (this.f9870w ? 1 : 0)) * 31) + (this.f9871x ? 1 : 0), this.f9850c), this.f9851d), this.f9864q), this.f9865r), this.f9866s), this.f9859l), this.f9868u);
    }

    @NonNull
    @CheckResult
    /* renamed from: i */
    public final T m6464i(int i, int i2) {
        if (this.f9869v) {
            return (T) clone().m6464i(i, i2);
        }
        this.f9858k = i;
        this.f9857j = i2;
        this.f9848a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: j */
    public final AbstractC3821a m6463j() {
        EnumC3432i enumC3432i = EnumC3432i.LOW;
        if (this.f9869v) {
            return clone().m6463j();
        }
        this.f9851d = enumC3432i;
        this.f9848a |= 8;
        m6462k();
        return this;
    }

    @NonNull
    /* renamed from: k */
    public final void m6462k() {
        if (this.f9867t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    @NonNull
    @CheckResult
    /* renamed from: l */
    public final <Y> T m6461l(@NonNull C3578h<Y> c3578h, @NonNull Y y) {
        if (this.f9869v) {
            return (T) clone().m6461l(c3578h, y);
        }
        C3860j.m6404b(c3578h);
        C3860j.m6404b(y);
        this.f9864q.f9520b.put(c3578h, y);
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: m */
    public final AbstractC3821a m6460m(@NonNull C3845b c3845b) {
        if (this.f9869v) {
            return clone().m6460m(c3845b);
        }
        this.f9859l = c3845b;
        this.f9848a |= 1024;
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: n */
    public final AbstractC3821a m6459n() {
        if (this.f9869v) {
            return clone().m6459n();
        }
        this.f9856i = false;
        this.f9848a |= 256;
        m6462k();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* renamed from: o */
    public final T m6458o(@NonNull InterfaceC3585m<Bitmap> interfaceC3585m, boolean z) {
        if (this.f9869v) {
            return (T) clone().m6458o(interfaceC3585m, z);
        }
        C3725r c3725r = new C3725r(interfaceC3585m, z);
        m6457p(Bitmap.class, interfaceC3585m, z);
        m6457p(Drawable.class, c3725r, z);
        m6457p(BitmapDrawable.class, c3725r, z);
        m6457p(C3757c.class, new C3761f(interfaceC3585m), z);
        m6462k();
        return this;
    }

    @NonNull
    /* renamed from: p */
    public final <Y> T m6457p(@NonNull Class<Y> cls, @NonNull InterfaceC3585m<Y> interfaceC3585m, boolean z) {
        if (this.f9869v) {
            return (T) clone().m6457p(cls, interfaceC3585m, z);
        }
        C3860j.m6404b(interfaceC3585m);
        this.f9865r.put(cls, interfaceC3585m);
        this.f9861n = true;
        int i = this.f9848a | 2048 | 65536;
        this.f9848a = i;
        this.f9872y = false;
        if (z) {
            this.f9848a = i | 131072;
            this.f9860m = true;
        }
        m6462k();
        return this;
    }

    @NonNull
    @CheckResult
    /* renamed from: q */
    public final AbstractC3821a m6456q() {
        if (this.f9869v) {
            return clone().m6456q();
        }
        this.f9873z = true;
        this.f9848a |= 1048576;
        m6462k();
        return this;
    }
}
