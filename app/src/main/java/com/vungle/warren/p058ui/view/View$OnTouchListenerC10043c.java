package com.vungle.warren.p058ui.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.vungle.warren.ui.view.c */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC10043c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ FullAdWidget f20225a;

    public View$OnTouchListenerC10043c(FullAdWidget fullAdWidget) {
        this.f20225a = fullAdWidget;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f20225a.f20204q.onTouchEvent(motionEvent);
        return true;
    }
}
