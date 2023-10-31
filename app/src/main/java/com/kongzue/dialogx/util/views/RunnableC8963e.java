package com.kongzue.dialogx.util.views;

import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: com.kongzue.dialogx.util.views.e */
/* loaded from: classes3.dex */
public final class RunnableC8963e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8955b f17132a;

    public RunnableC8963e(C8955b c8955b) {
        this.f17132a = c8955b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17132a.m2832c(1, new AccelerateDecelerateInterpolator());
    }
}
