package com.kongzue.dialogx.util;

import android.app.Activity;
import android.view.View;

/* renamed from: com.kongzue.dialogx.util.c */
/* loaded from: classes3.dex */
public final class RunnableC8945c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Activity f17050a;

    /* renamed from: b */
    public final /* synthetic */ View f17051b;

    /* renamed from: c */
    public final /* synthetic */ boolean f17052c = true;

    public RunnableC8945c(Activity activity, View view) {
        this.f17050a = activity;
        this.f17051b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8946d.m2845b(this.f17050a, this.f17051b, this.f17052c);
    }
}
