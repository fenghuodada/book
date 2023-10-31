package com.qmuiteam.qmui.arch;

import android.view.View;
import androidx.core.graphics.C0690b;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.WindowInsetsCompat;
import com.qmuiteam.qmui.arch.C9037l;

/* renamed from: com.qmuiteam.qmui.arch.k */
/* loaded from: classes3.dex */
public final class C9036k implements InterfaceC0932i0 {

    /* renamed from: a */
    public final /* synthetic */ C9037l f17260a;

    public C9036k(C9037l c9037l) {
        this.f17260a = c9037l;
    }

    @Override // androidx.core.view.InterfaceC0932i0
    /* renamed from: a */
    public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        C9037l.InterfaceC9040c interfaceC9040c = this.f17260a.f17266e;
        if (interfaceC9040c != null && AbstractC9008b.this.getParentFragment() == null) {
            i = 8;
        } else {
            i = 0;
        }
        if (i != 0) {
            C0690b m11643a = windowInsetsCompat.m11643a(i);
            view.setPadding(m11643a.f2384a, m11643a.f2385b, m11643a.f2386c, m11643a.f2387d);
        } else {
            view.setPadding(0, 0, 0, 0);
        }
        return windowInsetsCompat;
    }
}
