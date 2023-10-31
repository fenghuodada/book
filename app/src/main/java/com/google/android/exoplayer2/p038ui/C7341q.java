package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.google.android.exoplayer2.ui.q */
/* loaded from: classes.dex */
public final class C7341q extends WebView {
    public C7341q(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
