package com.google.android.material.internal;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.internal.p */
/* loaded from: classes3.dex */
public final class View$OnAttachStateChangeListenerC7763p implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0818h.m11722c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
