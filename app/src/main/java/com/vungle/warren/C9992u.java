package com.vungle.warren;

import androidx.annotation.NonNull;
import com.vungle.warren.persistence.C9914a;

/* renamed from: com.vungle.warren.u */
/* loaded from: classes3.dex */
public final class C9992u {

    /* renamed from: a */
    public final C9914a f20087a;

    /* renamed from: b */
    public final C9822k0 f20088b;

    public C9992u(@NonNull C9914a c9914a, @NonNull C9822k0 c9822k0) {
        this.f20087a = c9914a;
        this.f20088b = c9822k0;
    }

    /* renamed from: a */
    public final long m1354a() {
        C10118v1 c10118v1 = this.f20088b.f19612c.get();
        if (c10118v1 == null) {
            return 0L;
        }
        long m1418c = this.f20087a.m1418c(1) / 2;
        long max = Math.max(0L, c10118v1.f20364b - m1418c);
        float min = (float) Math.min(c10118v1.f20365c, m1418c);
        return Math.max(0L, (min - (0.1f * min)) - max);
    }
}
