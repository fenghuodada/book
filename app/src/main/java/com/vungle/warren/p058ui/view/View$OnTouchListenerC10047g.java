package com.vungle.warren.p058ui.view;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.vungle.warren.ui.view.g */
/* loaded from: classes3.dex */
public final class View$OnTouchListenerC10047g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ FullAdWidget f20229a;

    public View$OnTouchListenerC10047g(FullAdWidget fullAdWidget) {
        this.f20229a = fullAdWidget;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC10054k interfaceC10054k = this.f20229a.f20199l;
        if (interfaceC10054k != null) {
            interfaceC10054k.mo1296a(motionEvent);
        }
        return false;
    }
}
