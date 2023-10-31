package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.util.C3860j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.signature.b */
/* loaded from: classes.dex */
public final class C3845b implements InterfaceC3577g {

    /* renamed from: b */
    public final Object f9930b;

    public C3845b(@NonNull Object obj) {
        C3860j.m6404b(obj);
        this.f9930b = obj;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f9930b.toString().getBytes(InterfaceC3577g.f9514a));
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3845b) {
            return this.f9930b.equals(((C3845b) obj).f9930b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        return this.f9930b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f9930b + '}';
    }
}
