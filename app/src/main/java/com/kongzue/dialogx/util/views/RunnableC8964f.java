package com.kongzue.dialogx.util.views;

import android.view.animation.AccelerateInterpolator;

/* renamed from: com.kongzue.dialogx.util.views.f */
/* loaded from: classes3.dex */
public final class RunnableC8964f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8955b f17133a;

    public RunnableC8964f(C8955b c8955b) {
        this.f17133a = c8955b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17133a.m2832c(2, new AccelerateInterpolator(2.0f));
    }
}
