package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.model.InterfaceC3627o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import libv2ray.V2rayConfig;

/* renamed from: com.bumptech.glide.load.model.y */
/* loaded from: classes.dex */
public final class C3672y<Data> implements InterfaceC3627o<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f9631b = Collections.unmodifiableSet(new HashSet(Arrays.asList(V2rayConfig.HTTP, "https")));

    /* renamed from: a */
    public final InterfaceC3627o<C3614g, Data> f9632a;

    /* renamed from: com.bumptech.glide.load.model.y$a */
    /* loaded from: classes.dex */
    public static class C3673a implements InterfaceC3629p<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<Uri, InputStream> mo6572b(C3635s c3635s) {
            return new C3672y(c3635s.m6585c(C3614g.class, InputStream.class));
        }
    }

    public C3672y(InterfaceC3627o<C3614g, Data> interfaceC3627o) {
        this.f9632a = interfaceC3627o;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final boolean mo6574a(@NonNull Uri uri) {
        return f9631b.contains(uri.getScheme());
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a mo6573b(@NonNull Uri uri, int i, int i2, @NonNull C3581i c3581i) {
        return this.f9632a.mo6573b(new C3614g(uri.toString()), i, i2, c3581i);
    }
}
