package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.trackselection.k */
/* loaded from: classes.dex */
public final class C7303k {

    /* renamed from: a */
    public final int f13437a;

    /* renamed from: b */
    public final InterfaceC7302j[] f13438b;

    /* renamed from: c */
    public int f13439c;

    public C7303k(InterfaceC7302j... interfaceC7302jArr) {
        this.f13438b = interfaceC7302jArr;
        this.f13437a = interfaceC7302jArr.length;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7303k.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13438b, ((C7303k) obj).f13438b);
    }

    public final int hashCode() {
        if (this.f13439c == 0) {
            this.f13439c = 527 + Arrays.hashCode(this.f13438b);
        }
        return this.f13439c;
    }
}
