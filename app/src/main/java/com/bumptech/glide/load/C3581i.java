package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.util.C3849b;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.i */
/* loaded from: classes.dex */
public final class C3581i implements InterfaceC3577g {

    /* renamed from: b */
    public final C3849b f9520b = new C3849b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C3849b c3849b = this.f9520b;
            if (i < c3849b.f1531c) {
                C3578h c3578h = (C3578h) c3849b.m12398h(i);
                V m12397l = this.f9520b.m12397l(i);
                C3578h.InterfaceC3580b<T> interfaceC3580b = c3578h.f9517b;
                if (c3578h.f9519d == null) {
                    c3578h.f9519d = c3578h.f9518c.getBytes(InterfaceC3577g.f9514a);
                }
                interfaceC3580b.mo6564a(c3578h.f9519d, m12397l, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    @Nullable
    /* renamed from: c */
    public final <T> T m6606c(@NonNull C3578h<T> c3578h) {
        C3849b c3849b = this.f9520b;
        if (c3849b.containsKey(c3578h)) {
            return (T) c3849b.getOrDefault(c3578h, null);
        }
        return c3578h.f9516a;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3581i) {
            return this.f9520b.equals(((C3581i) obj).f9520b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return this.f9520b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f9520b + '}';
    }
}
