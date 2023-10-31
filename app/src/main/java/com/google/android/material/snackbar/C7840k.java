package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.k */
/* loaded from: classes3.dex */
public final class C7840k implements SwipeDismissBehavior.InterfaceC7586b {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f15385a;

    public C7840k(BaseTransientBottomBar baseTransientBottomBar) {
        this.f15385a = baseTransientBottomBar;
    }

    /* renamed from: a */
    public final void m4415a(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f15385a.m4425b(0);
    }
}
