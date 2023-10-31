package com.qmuiteam.qmui.util;

import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.qmuiteam.qmui.util.g */
/* loaded from: classes3.dex */
public final class View$OnAttachStateChangeListenerC9146g implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Window f17581a;

    public View$OnAttachStateChangeListenerC9146g(Window window) {
        this.f17581a = window;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        DisplayCutout displayCutout;
        view.removeOnAttachStateChangeListener(this);
        if (view.getRootWindowInsets() != null) {
            displayCutout = view.getRootWindowInsets().getDisplayCutout();
            if (displayCutout != null) {
                Window window = this.f17581a;
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
