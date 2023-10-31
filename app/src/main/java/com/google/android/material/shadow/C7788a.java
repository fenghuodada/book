package com.google.android.material.shadow;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0689a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.shadow.a */
/* loaded from: classes3.dex */
public final class C7788a {

    /* renamed from: i */
    public static final int[] f15170i = new int[3];

    /* renamed from: j */
    public static final float[] f15171j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f15172k = new int[4];

    /* renamed from: l */
    public static final float[] f15173l = {0.0f, 0.0f, 0.5f, 1.0f};
    @NonNull

    /* renamed from: a */
    public final Paint f15174a;
    @NonNull

    /* renamed from: b */
    public final Paint f15175b;
    @NonNull

    /* renamed from: c */
    public final Paint f15176c;

    /* renamed from: d */
    public int f15177d;

    /* renamed from: e */
    public int f15178e;

    /* renamed from: f */
    public int f15179f;

    /* renamed from: g */
    public final Path f15180g = new Path();

    /* renamed from: h */
    public final Paint f15181h;

    public C7788a() {
        Paint paint = new Paint();
        this.f15181h = paint;
        this.f15174a = new Paint();
        m4476a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f15175b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f15176c = new Paint(paint2);
    }

    /* renamed from: a */
    public final void m4476a(int i) {
        this.f15177d = C0689a.m11970c(i, 68);
        this.f15178e = C0689a.m11970c(i, 20);
        this.f15179f = C0689a.m11970c(i, 0);
        this.f15174a.setColor(this.f15177d);
    }
}
