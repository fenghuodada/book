package com.ambrose.overwall.fragment;

import android.view.View;

/* renamed from: com.ambrose.overwall.fragment.m0 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2469m0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2451e0 f5897a;

    public View$OnClickListenerC2469m0(C2451e0 c2451e0) {
        this.f5897a = c2451e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f5897a.getActivity().finish();
        System.exit(0);
    }
}
