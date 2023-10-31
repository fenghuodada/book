package com.kongzue.dialogx.interfaces;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.kongzue.dialogx.interfaces.b */
/* loaded from: classes3.dex */
public final class RunnableC8930b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f17041a;

    /* renamed from: b */
    public final /* synthetic */ BaseDialog f17042b;

    /* renamed from: c */
    public final /* synthetic */ FrameLayout f17043c;

    public RunnableC8930b(View view, BaseDialog baseDialog, FrameLayout frameLayout) {
        this.f17041a = view;
        this.f17042b = baseDialog;
        this.f17043c = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f17041a;
        if (view.getParent() != this.f17042b.m2868n()) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f17043c.addView(view);
            return;
        }
        BaseDialog.m2877e(((BaseDialog) view.getTag()).mo2879c() + "已处于显示状态，请勿重复执行 show() 指令。");
    }
}
