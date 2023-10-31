package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.d1 */
/* loaded from: classes.dex */
public final class C6740d1 {

    /* renamed from: b */
    public static final C6740d1 f10901b = new C6740d1(false);

    /* renamed from: a */
    public final boolean f10902a;

    public C6740d1(boolean z) {
        this.f10902a = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6740d1.class == obj.getClass() && this.f10902a == ((C6740d1) obj).f10902a;
    }

    public final int hashCode() {
        return !this.f10902a ? 1 : 0;
    }
}
