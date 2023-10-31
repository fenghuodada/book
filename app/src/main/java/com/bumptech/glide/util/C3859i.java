package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.util.i */
/* loaded from: classes.dex */
public final class C3859i {

    /* renamed from: a */
    public Class<?> f9953a;

    /* renamed from: b */
    public Class<?> f9954b;

    /* renamed from: c */
    public Class<?> f9955c;

    public C3859i() {
    }

    public C3859i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f9953a = cls;
        this.f9954b = cls2;
        this.f9955c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3859i.class != obj.getClass()) {
            return false;
        }
        C3859i c3859i = (C3859i) obj;
        return this.f9953a.equals(c3859i.f9953a) && this.f9954b.equals(c3859i.f9954b) && C3861k.m6403a(this.f9955c, c3859i.f9955c);
    }

    public final int hashCode() {
        int hashCode = (this.f9954b.hashCode() + (this.f9953a.hashCode() * 31)) * 31;
        Class<?> cls = this.f9955c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f9953a + ", second=" + this.f9954b + '}';
    }
}
