package com.vungle.warren.p058ui.view;

import android.view.MotionEvent;
import android.view.View;
import com.vungle.warren.p058ui.view.C10055l;

/* renamed from: com.vungle.warren.ui.view.m */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC10060m implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C10055l f20255a;

    public View$OnTouchListenerC10060m(C10055l c10055l) {
        this.f20255a = c10055l;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C10055l c10055l = this.f20255a;
        C10055l.C10056a c10056a = c10055l.f20250i;
        if (c10056a != null) {
            c10056a.mo1296a(motionEvent);
            return false;
        }
        return c10055l.onTouchEvent(motionEvent);
    }
}
