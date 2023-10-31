package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.a */
/* loaded from: classes3.dex */
public final class C7792a implements InterfaceC7794c {

    /* renamed from: a */
    public final float f15227a;

    public C7792a(float f) {
        this.f15227a = f;
    }

    @Override // com.google.android.material.shape.InterfaceC7794c
    /* renamed from: a */
    public final float mo4460a(@NonNull RectF rectF) {
        return this.f15227a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7792a) && this.f15227a == ((C7792a) obj).f15227a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15227a)});
    }
}
