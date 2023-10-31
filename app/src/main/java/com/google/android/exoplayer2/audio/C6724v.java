package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.audio.v */
/* loaded from: classes.dex */
public final class C6724v {

    /* renamed from: a */
    public final int f10863a = 0;

    /* renamed from: b */
    public final float f10864b = 0.0f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6724v.class != obj.getClass()) {
            return false;
        }
        C6724v c6724v = (C6724v) obj;
        return this.f10863a == c6724v.f10863a && Float.compare(c6724v.f10864b, this.f10864b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f10864b) + ((527 + this.f10863a) * 31);
    }
}
