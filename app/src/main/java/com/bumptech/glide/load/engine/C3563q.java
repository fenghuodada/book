package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.util.C3849b;
import com.bumptech.glide.util.C3860j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.q */
/* loaded from: classes.dex */
public final class C3563q implements InterfaceC3577g {

    /* renamed from: b */
    public final Object f9461b;

    /* renamed from: c */
    public final int f9462c;

    /* renamed from: d */
    public final int f9463d;

    /* renamed from: e */
    public final Class<?> f9464e;

    /* renamed from: f */
    public final Class<?> f9465f;

    /* renamed from: g */
    public final InterfaceC3577g f9466g;

    /* renamed from: h */
    public final Map<Class<?>, InterfaceC3585m<?>> f9467h;

    /* renamed from: i */
    public final C3581i f9468i;

    /* renamed from: j */
    public int f9469j;

    public C3563q(Object obj, InterfaceC3577g interfaceC3577g, int i, int i2, C3849b c3849b, Class cls, Class cls2, C3581i c3581i) {
        C3860j.m6404b(obj);
        this.f9461b = obj;
        if (interfaceC3577g != null) {
            this.f9466g = interfaceC3577g;
            this.f9462c = i;
            this.f9463d = i2;
            C3860j.m6404b(c3849b);
            this.f9467h = c3849b;
            if (cls != null) {
                this.f9464e = cls;
                if (cls2 != null) {
                    this.f9465f = cls2;
                    C3860j.m6404b(c3581i);
                    this.f9468i = c3581i;
                    return;
                }
                throw new NullPointerException("Transcode class must not be null");
            }
            throw new NullPointerException("Resource class must not be null");
        }
        throw new NullPointerException("Signature must not be null");
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3563q) {
            C3563q c3563q = (C3563q) obj;
            return this.f9461b.equals(c3563q.f9461b) && this.f9466g.equals(c3563q.f9466g) && this.f9463d == c3563q.f9463d && this.f9462c == c3563q.f9462c && this.f9467h.equals(c3563q.f9467h) && this.f9464e.equals(c3563q.f9464e) && this.f9465f.equals(c3563q.f9465f) && this.f9468i.equals(c3563q.f9468i);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        if (this.f9469j == 0) {
            int hashCode = this.f9461b.hashCode();
            this.f9469j = hashCode;
            int hashCode2 = ((((this.f9466g.hashCode() + (hashCode * 31)) * 31) + this.f9462c) * 31) + this.f9463d;
            this.f9469j = hashCode2;
            int hashCode3 = this.f9467h.hashCode() + (hashCode2 * 31);
            this.f9469j = hashCode3;
            int hashCode4 = this.f9464e.hashCode() + (hashCode3 * 31);
            this.f9469j = hashCode4;
            int hashCode5 = this.f9465f.hashCode() + (hashCode4 * 31);
            this.f9469j = hashCode5;
            this.f9469j = this.f9468i.hashCode() + (hashCode5 * 31);
        }
        return this.f9469j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9461b + ", width=" + this.f9462c + ", height=" + this.f9463d + ", resourceClass=" + this.f9464e + ", transcodeClass=" + this.f9465f + ", signature=" + this.f9466g + ", hashCode=" + this.f9469j + ", transformations=" + this.f9467h + ", options=" + this.f9468i + '}';
    }
}
