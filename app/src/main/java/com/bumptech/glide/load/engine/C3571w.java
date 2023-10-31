package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.pool.AbstractC3871d;
import com.bumptech.glide.util.pool.C3863a;

/* renamed from: com.bumptech.glide.load.engine.w */
/* loaded from: classes.dex */
public final class C3571w<Z> implements InterfaceC3573x<Z>, C3863a.InterfaceC3867d {

    /* renamed from: e */
    public static final C3863a.C3866c f9490e = C3863a.m6396a(20, new C3572a());

    /* renamed from: a */
    public final AbstractC3871d.C3872a f9491a = new AbstractC3871d.C3872a();

    /* renamed from: b */
    public InterfaceC3573x<Z> f9492b;

    /* renamed from: c */
    public boolean f9493c;

    /* renamed from: d */
    public boolean f9494d;

    /* renamed from: com.bumptech.glide.load.engine.w$a */
    /* loaded from: classes.dex */
    public class C3572a implements C3863a.InterfaceC3865b<C3571w<?>> {
        @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3865b
        /* renamed from: a */
        public final C3571w<?> mo6392a() {
            return new C3571w<>();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final synchronized void mo6510a() {
        this.f9491a.m6390a();
        this.f9494d = true;
        if (!this.f9493c) {
            this.f9492b.mo6510a();
            this.f9492b = null;
            f9490e.mo6395a(this);
        }
    }

    @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3867d
    @NonNull
    /* renamed from: b */
    public final AbstractC3871d.C3872a mo6393b() {
        return this.f9491a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<Z> mo6509c() {
        return this.f9492b.mo6509c();
    }

    /* renamed from: d */
    public final synchronized void m6611d() {
        this.f9491a.m6390a();
        if (!this.f9493c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9493c = false;
        if (this.f9494d) {
            mo6510a();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final Z get() {
        return this.f9492b.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        return this.f9492b.getSize();
    }
}
