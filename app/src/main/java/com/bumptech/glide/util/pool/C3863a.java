package com.bumptech.glide.util.pool;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.C0803g;
import androidx.core.util.InterfaceC0801e;
import com.bumptech.glide.util.pool.AbstractC3871d;

/* renamed from: com.bumptech.glide.util.pool.a */
/* loaded from: classes.dex */
public final class C3863a {

    /* renamed from: a */
    public static final C3864a f9960a = new C3864a();

    /* renamed from: com.bumptech.glide.util.pool.a$a */
    /* loaded from: classes.dex */
    public class C3864a implements InterfaceC3868e<Object> {
        @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3868e
        /* renamed from: a */
        public final void mo6391a(@NonNull Object obj) {
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3865b<T> {
        /* renamed from: a */
        T mo6392a();
    }

    /* renamed from: com.bumptech.glide.util.pool.a$c */
    /* loaded from: classes.dex */
    public static final class C3866c<T> implements InterfaceC0801e<T> {

        /* renamed from: a */
        public final InterfaceC3865b<T> f9961a;

        /* renamed from: b */
        public final InterfaceC3868e<T> f9962b;

        /* renamed from: c */
        public final InterfaceC0801e<T> f9963c;

        public C3866c(@NonNull C0803g c0803g, @NonNull InterfaceC3865b interfaceC3865b, @NonNull InterfaceC3868e interfaceC3868e) {
            this.f9963c = c0803g;
            this.f9961a = interfaceC3865b;
            this.f9962b = interfaceC3868e;
        }

        @Override // androidx.core.util.InterfaceC0801e
        /* renamed from: a */
        public final boolean mo6395a(@NonNull T t) {
            if (t instanceof InterfaceC3867d) {
                ((InterfaceC3867d) t).mo6393b().f9964a = true;
            }
            this.f9962b.mo6391a(t);
            return this.f9963c.mo6395a(t);
        }

        @Override // androidx.core.util.InterfaceC0801e
        /* renamed from: b */
        public final T mo6394b() {
            T mo6394b = this.f9963c.mo6394b();
            if (mo6394b == null) {
                mo6394b = this.f9961a.mo6392a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo6394b.getClass());
                }
            }
            if (mo6394b instanceof InterfaceC3867d) {
                ((InterfaceC3867d) mo6394b).mo6393b().f9964a = false;
            }
            return mo6394b;
        }
    }

    /* renamed from: com.bumptech.glide.util.pool.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3867d {
        @NonNull
        /* renamed from: b */
        AbstractC3871d.C3872a mo6393b();
    }

    /* renamed from: com.bumptech.glide.util.pool.a$e */
    /* loaded from: classes.dex */
    public interface InterfaceC3868e<T> {
        /* renamed from: a */
        void mo6391a(@NonNull T t);
    }

    @NonNull
    /* renamed from: a */
    public static C3866c m6396a(int i, @NonNull InterfaceC3865b interfaceC3865b) {
        return new C3866c(new C0803g(i), interfaceC3865b, f9960a);
    }
}
