package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6740d1;
import com.google.android.exoplayer2.trackselection.AbstractC7300i;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.trackselection.n */
/* loaded from: classes.dex */
public final class C7308n {

    /* renamed from: a */
    public final int f13477a;

    /* renamed from: b */
    public final C6740d1[] f13478b;

    /* renamed from: c */
    public final InterfaceC7296g[] f13479c;
    @Nullable

    /* renamed from: d */
    public final Object f13480d;

    public C7308n(C6740d1[] c6740d1Arr, InterfaceC7296g[] interfaceC7296gArr, @Nullable AbstractC7300i.C7301a c7301a) {
        this.f13478b = c6740d1Arr;
        this.f13479c = (InterfaceC7296g[]) interfaceC7296gArr.clone();
        this.f13480d = c7301a;
        this.f13477a = c6740d1Arr.length;
    }

    /* renamed from: a */
    public final boolean m5254a(@Nullable C7308n c7308n, int i) {
        return c7308n != null && C7408g0.m5105a(this.f13478b[i], c7308n.f13478b[i]) && C7408g0.m5105a(this.f13479c[i], c7308n.f13479c[i]);
    }

    /* renamed from: b */
    public final boolean m5253b(int i) {
        return this.f13478b[i] != null;
    }
}
