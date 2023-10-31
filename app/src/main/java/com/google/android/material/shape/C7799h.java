package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: com.google.android.material.shape.h */
/* loaded from: classes3.dex */
public final class C7799h implements InterfaceC7794c {

    /* renamed from: a */
    public final float f15231a;

    public C7799h(@FloatRange(from = 0.0d, m13045to = 1.0d) float f) {
        this.f15231a = f;
    }

    @Override // com.google.android.material.shape.InterfaceC7794c
    /* renamed from: a */
    public final float mo4460a(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f15231a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7799h) && this.f15231a == ((C7799h) obj).f15231a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15231a)});
    }
}
