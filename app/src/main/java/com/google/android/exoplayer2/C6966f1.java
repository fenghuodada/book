package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;

/* renamed from: com.google.android.exoplayer2.f1 */
/* loaded from: classes.dex */
public final class C6966f1 {

    /* renamed from: c */
    public static final C6966f1 f12031c;

    /* renamed from: a */
    public final long f12032a;

    /* renamed from: b */
    public final long f12033b;

    static {
        C6966f1 c6966f1 = new C6966f1(0L, 0L);
        new C6966f1(Long.MAX_VALUE, Long.MAX_VALUE);
        new C6966f1(Long.MAX_VALUE, 0L);
        new C6966f1(0L, Long.MAX_VALUE);
        f12031c = c6966f1;
    }

    public C6966f1(long j, long j2) {
        C7394a.m5134a(j >= 0);
        C7394a.m5134a(j2 >= 0);
        this.f12032a = j;
        this.f12033b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6966f1.class != obj.getClass()) {
            return false;
        }
        C6966f1 c6966f1 = (C6966f1) obj;
        return this.f12032a == c6966f1.f12032a && this.f12033b == c6966f1.f12033b;
    }

    public final int hashCode() {
        return (((int) this.f12032a) * 31) + ((int) this.f12033b);
    }
}
