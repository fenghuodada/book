package com.qmuiteam.qmui.util;

import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.util.j */
/* loaded from: classes3.dex */
public final class C9150j {

    /* renamed from: a */
    public final View f17586a;

    /* renamed from: b */
    public int f17587b;

    /* renamed from: c */
    public int f17588c;

    /* renamed from: d */
    public int f17589d;

    /* renamed from: e */
    public int f17590e;

    public C9150j(View view) {
        this.f17586a = view;
    }

    /* renamed from: a */
    public final void m2626a() {
        int i = this.f17589d;
        View view = this.f17586a;
        int top = i - (view.getTop() - this.f17587b);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(this.f17590e - (view.getLeft() - this.f17588c));
    }

    /* renamed from: b */
    public final void m2625b(boolean z) {
        View view = this.f17586a;
        this.f17587b = view.getTop();
        this.f17588c = view.getLeft();
        if (z) {
            m2626a();
        }
    }

    /* renamed from: c */
    public final void m2624c(int i) {
        if (this.f17590e != i) {
            this.f17590e = i;
            m2626a();
        }
    }

    /* renamed from: d */
    public final boolean m2623d(int i) {
        if (this.f17589d != i) {
            this.f17589d = i;
            m2626a();
            return true;
        }
        return false;
    }
}
