package com.bumptech.glide.load;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
/* loaded from: classes.dex */
public final class C3578h<T> {

    /* renamed from: e */
    public static final C3579a f9515e = new C3579a();

    /* renamed from: a */
    public final T f9516a;

    /* renamed from: b */
    public final InterfaceC3580b<T> f9517b;

    /* renamed from: c */
    public final String f9518c;

    /* renamed from: d */
    public volatile byte[] f9519d;

    /* renamed from: com.bumptech.glide.load.h$a */
    /* loaded from: classes.dex */
    public class C3579a implements InterfaceC3580b<Object> {
        @Override // com.bumptech.glide.load.C3578h.InterfaceC3580b
        /* renamed from: a */
        public final void mo6564a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3580b<T> {
        /* renamed from: a */
        void mo6564a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    public C3578h(@NonNull String str, @Nullable T t, @NonNull InterfaceC3580b<T> interfaceC3580b) {
        if (!TextUtils.isEmpty(str)) {
            this.f9518c = str;
            this.f9516a = t;
            this.f9517b = interfaceC3580b;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* renamed from: a */
    public static C3578h m6607a(@NonNull Object obj, @NonNull String str) {
        return new C3578h(str, obj, f9515e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3578h) {
            return this.f9518c.equals(((C3578h) obj).f9518c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9518c.hashCode();
    }

    public final String toString() {
        return C0484a.m12392a(new StringBuilder("Option{key='"), this.f9518c, "'}");
    }
}
