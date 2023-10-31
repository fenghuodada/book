package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.chip.c */
/* loaded from: classes3.dex */
public final class C7644c extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f14707a;

    public C7644c(Chip chip) {
        this.f14707a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(21)
    public final void getOutline(View view, @NonNull Outline outline) {
        C7645d c7645d = this.f14707a.f14686e;
        if (c7645d != null) {
            c7645d.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
