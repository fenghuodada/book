package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;

/* renamed from: com.google.android.datatransport.b */
/* loaded from: classes.dex */
public final class C6429b {

    /* renamed from: a */
    public final String f10059a;

    public C6429b(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10059a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6429b) {
            return this.f10059a.equals(((C6429b) obj).f10059a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10059a.hashCode() ^ 1000003;
    }

    @NonNull
    public final String toString() {
        return C0484a.m12392a(new StringBuilder("Encoding{name=\""), this.f10059a, "\"}");
    }
}
