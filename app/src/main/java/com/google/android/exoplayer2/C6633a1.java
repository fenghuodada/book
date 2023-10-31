package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.a1 */
/* loaded from: classes.dex */
public final class C6633a1 {

    /* renamed from: d */
    public static final C6633a1 f10556d = new C6633a1(1.0f, 1.0f);

    /* renamed from: a */
    public final float f10557a;

    /* renamed from: b */
    public final float f10558b;

    /* renamed from: c */
    public final int f10559c;

    public C6633a1(float f, float f2) {
        C7394a.m5134a(f > 0.0f);
        C7394a.m5134a(f2 > 0.0f);
        this.f10557a = f;
        this.f10558b = f2;
        this.f10559c = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6633a1.class != obj.getClass()) {
            return false;
        }
        C6633a1 c6633a1 = (C6633a1) obj;
        return this.f10557a == c6633a1.f10557a && this.f10558b == c6633a1.f10558b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f10558b) + ((Float.floatToRawIntBits(this.f10557a) + 527) * 31);
    }

    public final String toString() {
        return C7408g0.m5096j("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f10557a), Float.valueOf(this.f10558b));
    }
}
