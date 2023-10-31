package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
/* loaded from: classes.dex */
public final class C6481c extends AbstractC6488j {

    /* renamed from: a */
    public final Context f10206a;

    /* renamed from: b */
    public final InterfaceC6611a f10207b;

    /* renamed from: c */
    public final InterfaceC6611a f10208c;

    /* renamed from: d */
    public final String f10209d;

    public C6481c(Context context, InterfaceC6611a interfaceC6611a, InterfaceC6611a interfaceC6611a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f10206a = context;
        if (interfaceC6611a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f10207b = interfaceC6611a;
        if (interfaceC6611a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f10208c = interfaceC6611a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f10209d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6488j
    /* renamed from: a */
    public final Context mo6308a() {
        return this.f10206a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6488j
    @NonNull
    /* renamed from: b */
    public final String mo6307b() {
        return this.f10209d;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6488j
    /* renamed from: c */
    public final InterfaceC6611a mo6306c() {
        return this.f10208c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC6488j
    /* renamed from: d */
    public final InterfaceC6611a mo6305d() {
        return this.f10207b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6488j) {
            AbstractC6488j abstractC6488j = (AbstractC6488j) obj;
            return this.f10206a.equals(abstractC6488j.mo6308a()) && this.f10207b.equals(abstractC6488j.mo6305d()) && this.f10208c.equals(abstractC6488j.mo6306c()) && this.f10209d.equals(abstractC6488j.mo6307b());
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f10206a.hashCode() ^ 1000003) * 1000003) ^ this.f10207b.hashCode()) * 1000003) ^ this.f10208c.hashCode()) * 1000003) ^ this.f10209d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f10206a);
        sb.append(", wallClock=");
        sb.append(this.f10207b);
        sb.append(", monotonicClock=");
        sb.append(this.f10208c);
        sb.append(", backendName=");
        return C0484a.m12392a(sb, this.f10209d, "}");
    }
}
