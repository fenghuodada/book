package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.accessibility.InterfaceC0883s;

/* renamed from: com.google.android.material.bottomsheet.c */
/* loaded from: classes3.dex */
public final class C7609c implements InterfaceC0883s {

    /* renamed from: b */
    public final /* synthetic */ int f14517b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetBehavior f14518c;

    public C7609c(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f14518c = bottomSheetBehavior;
        this.f14517b = i;
    }

    @Override // androidx.core.view.accessibility.InterfaceC0883s
    /* renamed from: a */
    public final boolean mo4734a(@NonNull View view) {
        this.f14518c.m4754E(this.f14517b);
        return true;
    }
}
