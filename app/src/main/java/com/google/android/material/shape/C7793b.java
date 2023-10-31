package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.shape.b */
/* loaded from: classes3.dex */
public final class C7793b implements InterfaceC7794c {

    /* renamed from: a */
    public final InterfaceC7794c f15228a;

    /* renamed from: b */
    public final float f15229b;

    public C7793b(float f, @NonNull InterfaceC7794c interfaceC7794c) {
        while (interfaceC7794c instanceof C7793b) {
            interfaceC7794c = ((C7793b) interfaceC7794c).f15228a;
            f += ((C7793b) interfaceC7794c).f15229b;
        }
        this.f15228a = interfaceC7794c;
        this.f15229b = f;
    }

    @Override // com.google.android.material.shape.InterfaceC7794c
    /* renamed from: a */
    public final float mo4460a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f15228a.mo4460a(rectF) + this.f15229b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7793b) {
            C7793b c7793b = (C7793b) obj;
            return this.f15228a.equals(c7793b.f15228a) && this.f15229b == c7793b.f15229b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15228a, Float.valueOf(this.f15229b)});
    }
}
