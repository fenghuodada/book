package com.kongzue.dialogx.util.views;

import android.view.animation.DecelerateInterpolator;

/* renamed from: com.kongzue.dialogx.util.views.g */
/* loaded from: classes3.dex */
public final class RunnableC8965g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8955b f17134a;

    public RunnableC8965g(C8955b c8955b) {
        this.f17134a = c8955b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17134a.m2832c(3, new DecelerateInterpolator(2.0f));
    }
}
