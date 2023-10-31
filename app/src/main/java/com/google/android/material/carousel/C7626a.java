package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C1640o;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.carousel.a */
/* loaded from: classes3.dex */
public final class C7626a extends C1640o {

    /* renamed from: q */
    public final /* synthetic */ CarouselLayoutManager f14624q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7626a(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f14624q = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1591u
    @Nullable
    /* renamed from: a */
    public final PointF mo4686a(int i) {
        CarouselLayoutManager carouselLayoutManager = this.f14624q;
        C7631d c7631d = carouselLayoutManager.f14614u;
        if (c7631d == null) {
            return null;
        }
        return new PointF(carouselLayoutManager.m4704L0(c7631d.f14640a, i) - carouselLayoutManager.f14609p, 0.0f);
    }

    @Override // androidx.recyclerview.widget.C1640o
    /* renamed from: f */
    public final int mo4685f(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.f14624q;
        return (int) (carouselLayoutManager.f14609p - carouselLayoutManager.m4704L0(carouselLayoutManager.f14614u.f14640a, RecyclerView.LayoutManager.m10336K(view)));
    }
}
