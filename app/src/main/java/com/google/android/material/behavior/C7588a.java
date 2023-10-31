package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.InterfaceC0883s;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C7840k;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.behavior.a */
/* loaded from: classes3.dex */
public final class C7588a implements InterfaceC0883s {

    /* renamed from: b */
    public final /* synthetic */ SwipeDismissBehavior f14404b;

    public C7588a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f14404b = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.InterfaceC0883s
    /* renamed from: a */
    public final boolean mo4734a(@NonNull View view) {
        boolean z;
        SwipeDismissBehavior swipeDismissBehavior = this.f14404b;
        boolean z2 = false;
        if (!swipeDismissBehavior.mo4420t(view)) {
            return false;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = swipeDismissBehavior.f14393e;
        if ((i == 0 && z) || (i == 1 && !z)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.InterfaceC7586b interfaceC7586b = swipeDismissBehavior.f14390b;
        if (interfaceC7586b != null) {
            ((C7840k) interfaceC7586b).m4415a(view);
        }
        return true;
    }
}
