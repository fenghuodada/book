package com.bumptech.glide.load.resource.bytes;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.util.C3860j;

/* renamed from: com.bumptech.glide.load.resource.bytes.b */
/* loaded from: classes.dex */
public final class C3739b implements InterfaceC3573x<byte[]> {

    /* renamed from: a */
    public final byte[] f9721a;

    public C3739b(byte[] bArr) {
        C3860j.m6404b(bArr);
        this.f9721a = bArr;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final void mo6510a() {
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<byte[]> mo6509c() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final byte[] get() {
        return this.f9721a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        return this.f9721a.length;
    }
}
