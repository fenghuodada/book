package com.vungle.warren.model;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0511i;
import androidx.work.C1828a;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8695r;

/* renamed from: com.vungle.warren.model.m */
/* loaded from: classes3.dex */
public final class C9879m {

    /* renamed from: d */
    public static final C8686j f19838d = new C8686j();

    /* renamed from: a */
    public final int f19839a;

    /* renamed from: b */
    public int f19840b;

    /* renamed from: c */
    public final C8695r f19841c;

    public C9879m(int i, C8695r c8695r) {
        this.f19839a = i;
        this.f19841c = c8695r;
        c8695r.m3216t(C1828a.m9909a(2), Long.valueOf(System.currentTimeMillis()));
    }

    public C9879m(String str, int i) {
        this.f19841c = (C8695r) f19838d.m3235c(C8695r.class, str);
        this.f19840b = i;
    }

    /* renamed from: a */
    public final String m1440a(int i) {
        AbstractC8692o m3213w = this.f19841c.m3213w(C1828a.m9908b(i).toLowerCase());
        if (m3213w != null) {
            return m3213w.mo3202p();
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C9879m)) {
            return false;
        }
        C9879m c9879m = (C9879m) obj;
        return C0511i.m12338a(this.f19839a, c9879m.f19839a) && this.f19841c.equals(c9879m.f19841c);
    }
}
