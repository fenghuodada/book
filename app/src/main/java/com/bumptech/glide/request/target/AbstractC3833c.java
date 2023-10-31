package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.InterfaceC3823c;
import com.bumptech.glide.util.C3861k;

/* renamed from: com.bumptech.glide.request.target.c */
/* loaded from: classes.dex */
public abstract class AbstractC3833c<T> implements InterfaceC3837g<T> {

    /* renamed from: a */
    public final int f9917a;

    /* renamed from: b */
    public final int f9918b;
    @Nullable

    /* renamed from: c */
    public InterfaceC3823c f9919c;

    public AbstractC3833c() {
        if (!C3861k.m6397g(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f9917a = Integer.MIN_VALUE;
        this.f9918b = Integer.MIN_VALUE;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: a */
    public final void mo6428a(@NonNull InterfaceC3836f interfaceC3836f) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: c */
    public final void mo6427c(@Nullable InterfaceC3823c interfaceC3823c) {
        this.f9919c = interfaceC3823c;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: d */
    public final void mo6430d(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: e */
    public final void mo6429e(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    @Nullable
    /* renamed from: f */
    public final InterfaceC3823c mo6426f() {
        return this.f9919c;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3837g
    /* renamed from: h */
    public final void mo6424h(@NonNull InterfaceC3836f interfaceC3836f) {
        interfaceC3836f.mo6432b(this.f9917a, this.f9918b);
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStop() {
    }
}
