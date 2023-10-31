package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.material.floatingactionbutton.f */
/* loaded from: classes3.dex */
public final class ViewTreeObserver$OnPreDrawListenerC7737f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ C7726d f15004a;

    public ViewTreeObserver$OnPreDrawListenerC7737f(C7726d c7726d) {
        this.f15004a = c7726d;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C7726d c7726d = this.f15004a;
        float rotation = c7726d.f14981q.getRotation();
        if (c7726d.f14974j != rotation) {
            c7726d.f14974j = rotation;
            c7726d.mo4536m();
            return true;
        }
        return true;
    }
}
