package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.sidesheet.a */
/* loaded from: classes3.dex */
public final class C7818a extends AbstractC7820c {

    /* renamed from: a */
    public final SideSheetBehavior<? extends View> f15323a;

    public C7818a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f15323a = sideSheetBehavior;
    }

    /* renamed from: a */
    public final int m4428a() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f15323a;
        return Math.max(0, (sideSheetBehavior.f15308m - sideSheetBehavior.f15307l) - sideSheetBehavior.f15309n);
    }
}
