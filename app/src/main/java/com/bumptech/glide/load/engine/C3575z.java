package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.util.C3856g;
import com.bumptech.glide.util.C3861k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.z */
/* loaded from: classes.dex */
public final class C3575z implements InterfaceC3577g {

    /* renamed from: j */
    public static final C3856g<Class<?>, byte[]> f9505j = new C3856g<>(50);

    /* renamed from: b */
    public final InterfaceC3483b f9506b;

    /* renamed from: c */
    public final InterfaceC3577g f9507c;

    /* renamed from: d */
    public final InterfaceC3577g f9508d;

    /* renamed from: e */
    public final int f9509e;

    /* renamed from: f */
    public final int f9510f;

    /* renamed from: g */
    public final Class<?> f9511g;

    /* renamed from: h */
    public final C3581i f9512h;

    /* renamed from: i */
    public final InterfaceC3585m<?> f9513i;

    public C3575z(InterfaceC3483b interfaceC3483b, InterfaceC3577g interfaceC3577g, InterfaceC3577g interfaceC3577g2, int i, int i2, InterfaceC3585m<?> interfaceC3585m, Class<?> cls, C3581i c3581i) {
        this.f9506b = interfaceC3483b;
        this.f9507c = interfaceC3577g;
        this.f9508d = interfaceC3577g2;
        this.f9509e = i;
        this.f9510f = i2;
        this.f9513i = interfaceC3585m;
        this.f9511g = cls;
        this.f9512h = c3581i;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        InterfaceC3483b interfaceC3483b = this.f9506b;
        byte[] bArr = (byte[]) interfaceC3483b.mo6701d();
        ByteBuffer.wrap(bArr).putInt(this.f9509e).putInt(this.f9510f).array();
        this.f9508d.mo6420b(messageDigest);
        this.f9507c.mo6420b(messageDigest);
        messageDigest.update(bArr);
        InterfaceC3585m<?> interfaceC3585m = this.f9513i;
        if (interfaceC3585m != null) {
            interfaceC3585m.mo6420b(messageDigest);
        }
        this.f9512h.mo6420b(messageDigest);
        C3856g<Class<?>, byte[]> c3856g = f9505j;
        Class<?> cls = this.f9511g;
        byte[] m6412a = c3856g.m6412a(cls);
        if (m6412a == null) {
            m6412a = cls.getName().getBytes(InterfaceC3577g.f9514a);
            c3856g.m6409d(cls, m6412a);
        }
        messageDigest.update(m6412a);
        interfaceC3483b.put(bArr);
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3575z) {
            C3575z c3575z = (C3575z) obj;
            return this.f9510f == c3575z.f9510f && this.f9509e == c3575z.f9509e && C3861k.m6403a(this.f9513i, c3575z.f9513i) && this.f9511g.equals(c3575z.f9511g) && this.f9507c.equals(c3575z.f9507c) && this.f9508d.equals(c3575z.f9508d) && this.f9512h.equals(c3575z.f9512h);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        int hashCode = ((((this.f9508d.hashCode() + (this.f9507c.hashCode() * 31)) * 31) + this.f9509e) * 31) + this.f9510f;
        InterfaceC3585m<?> interfaceC3585m = this.f9513i;
        if (interfaceC3585m != null) {
            hashCode = (hashCode * 31) + interfaceC3585m.hashCode();
        }
        int hashCode2 = this.f9511g.hashCode();
        return this.f9512h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9507c + ", signature=" + this.f9508d + ", width=" + this.f9509e + ", height=" + this.f9510f + ", decodedResourceClass=" + this.f9511g + ", transformation='" + this.f9513i + "', options=" + this.f9512h + '}';
    }
}
