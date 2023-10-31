package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.C3564r;
import com.bumptech.glide.util.C3860j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bumptech.glide.load.engine.c */
/* loaded from: classes.dex */
public final class C3502c {

    /* renamed from: a */
    public final boolean f9273a;

    /* renamed from: b */
    public final Executor f9274b;
    @VisibleForTesting

    /* renamed from: c */
    public final HashMap f9275c;

    /* renamed from: d */
    public final ReferenceQueue<C3564r<?>> f9276d;

    /* renamed from: e */
    public C3564r.InterfaceC3565a f9277e;

    @VisibleForTesting
    /* renamed from: com.bumptech.glide.load.engine.c$a */
    /* loaded from: classes.dex */
    public static final class C3503a extends WeakReference<C3564r<?>> {

        /* renamed from: a */
        public final InterfaceC3577g f9278a;

        /* renamed from: b */
        public final boolean f9279b;
        @Nullable

        /* renamed from: c */
        public InterfaceC3573x<?> f9280c;

        public C3503a(@NonNull InterfaceC3577g interfaceC3577g, @NonNull C3564r<?> c3564r, @NonNull ReferenceQueue<? super C3564r<?>> referenceQueue, boolean z) {
            super(c3564r, referenceQueue);
            InterfaceC3573x<?> interfaceC3573x;
            C3860j.m6404b(interfaceC3577g);
            this.f9278a = interfaceC3577g;
            if (c3564r.f9470a && z) {
                interfaceC3573x = c3564r.f9472c;
                C3860j.m6404b(interfaceC3573x);
            } else {
                interfaceC3573x = null;
            }
            this.f9280c = interfaceC3573x;
            this.f9279b = c3564r.f9470a;
        }
    }

    public C3502c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3476a());
        this.f9275c = new HashMap();
        this.f9276d = new ReferenceQueue<>();
        this.f9273a = false;
        this.f9274b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new RunnableC3480b(this));
    }

    /* renamed from: a */
    public final synchronized void m6680a(InterfaceC3577g interfaceC3577g, C3564r<?> c3564r) {
        C3503a c3503a = (C3503a) this.f9275c.put(interfaceC3577g, new C3503a(interfaceC3577g, c3564r, this.f9276d, this.f9273a));
        if (c3503a != null) {
            c3503a.f9280c = null;
            c3503a.clear();
        }
    }

    /* renamed from: b */
    public final void m6679b(@NonNull C3503a c3503a) {
        InterfaceC3573x<?> interfaceC3573x;
        synchronized (this) {
            this.f9275c.remove(c3503a.f9278a);
            if (c3503a.f9279b && (interfaceC3573x = c3503a.f9280c) != null) {
                this.f9277e.mo6619a(c3503a.f9278a, new C3564r<>(interfaceC3573x, true, false, c3503a.f9278a, this.f9277e));
            }
        }
    }
}
