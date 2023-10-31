package com.vungle.warren.network;

import androidx.annotation.Nullable;
import okhttp3.Response;

/* renamed from: com.vungle.warren.network.e */
/* loaded from: classes3.dex */
public final class C9901e<T> {

    /* renamed from: a */
    public final Response f19882a;
    @Nullable

    /* renamed from: b */
    public final T f19883b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9901e(Response response, @Nullable Object obj) {
        this.f19882a = response;
        this.f19883b = obj;
    }

    /* renamed from: a */
    public final boolean m1430a() {
        return this.f19882a.isSuccessful();
    }

    public final String toString() {
        return this.f19882a.toString();
    }
}
