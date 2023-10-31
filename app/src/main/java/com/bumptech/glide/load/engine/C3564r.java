package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.util.C3860j;

/* renamed from: com.bumptech.glide.load.engine.r */
/* loaded from: classes.dex */
public final class C3564r<Z> implements InterfaceC3573x<Z> {

    /* renamed from: a */
    public final boolean f9470a;

    /* renamed from: b */
    public final boolean f9471b;

    /* renamed from: c */
    public final InterfaceC3573x<Z> f9472c;

    /* renamed from: d */
    public final InterfaceC3565a f9473d;

    /* renamed from: e */
    public final InterfaceC3577g f9474e;

    /* renamed from: f */
    public int f9475f;

    /* renamed from: g */
    public boolean f9476g;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3565a {
        /* renamed from: a */
        void mo6619a(InterfaceC3577g interfaceC3577g, C3564r<?> c3564r);
    }

    public C3564r(InterfaceC3573x<Z> interfaceC3573x, boolean z, boolean z2, InterfaceC3577g interfaceC3577g, InterfaceC3565a interfaceC3565a) {
        C3860j.m6404b(interfaceC3573x);
        this.f9472c = interfaceC3573x;
        this.f9470a = z;
        this.f9471b = z2;
        this.f9474e = interfaceC3577g;
        C3860j.m6404b(interfaceC3565a);
        this.f9473d = interfaceC3565a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    /* renamed from: a */
    public final synchronized void mo6510a() {
        if (this.f9475f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f9476g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f9476g = true;
        if (this.f9471b) {
            this.f9472c.mo6510a();
        }
    }

    /* renamed from: b */
    public final synchronized void m6621b() {
        if (this.f9476g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f9475f++;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    /* renamed from: c */
    public final Class<Z> mo6509c() {
        return this.f9472c.mo6509c();
    }

    /* renamed from: d */
    public final void m6620d() {
        boolean z;
        synchronized (this) {
            int i = this.f9475f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f9475f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f9473d.mo6619a(this.f9474e, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    @NonNull
    public final Z get() {
        return this.f9472c.get();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3573x
    public final int getSize() {
        return this.f9472c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f9470a + ", listener=" + this.f9473d + ", key=" + this.f9474e + ", acquired=" + this.f9475f + ", isRecycled=" + this.f9476g + ", resource=" + this.f9472c + '}';
    }
}
