package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.model.C3614g;
import com.bumptech.glide.load.model.C3635s;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.model.InterfaceC3629p;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.model.stream.g */
/* loaded from: classes.dex */
public final class C3652g implements InterfaceC3627o<URL, InputStream> {

    /* renamed from: a */
    public final InterfaceC3627o<C3614g, InputStream> f9614a;

    /* renamed from: com.bumptech.glide.load.model.stream.g$a */
    /* loaded from: classes.dex */
    public static class C3653a implements InterfaceC3629p<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<URL, InputStream> mo6572b(C3635s c3635s) {
            return new C3652g(c3635s.m6585c(C3614g.class, InputStream.class));
        }
    }

    public C3652g(InterfaceC3627o<C3614g, InputStream> interfaceC3627o) {
        this.f9614a = interfaceC3627o;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull URL url) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<InputStream> mo6573b(@NonNull URL url, int i, int i2, @NonNull C3581i c3581i) {
        return this.f9614a.mo6573b(new C3614g(url), i, i2, c3581i);
    }
}
