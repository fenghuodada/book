package com.google.android.material.dialog;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.dialog.a */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC7713a implements View.OnTouchListener {
    @NonNull

    /* renamed from: a */
    public final Dialog f14919a;

    /* renamed from: b */
    public final int f14920b;

    /* renamed from: c */
    public final int f14921c;

    /* renamed from: d */
    public final int f14922d;

    public View$OnTouchListenerC7713a(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f14919a = dialog;
        this.f14920b = rect.left;
        this.f14921c = rect.top;
        this.f14922d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f14920b;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f14921c;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f14922d;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f14919a.onTouchEvent(obtain);
    }
}
