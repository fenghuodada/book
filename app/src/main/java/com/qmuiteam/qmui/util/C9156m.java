package com.qmuiteam.qmui.util;

import android.view.View;
import androidx.core.graphics.C0690b;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.WindowInsetsCompat;
import com.qmuiteam.qmui.util.C9152l;

/* renamed from: com.qmuiteam.qmui.util.m */
/* loaded from: classes3.dex */
public final class C9156m implements InterfaceC0932i0 {

    /* renamed from: a */
    public final /* synthetic */ boolean f17597a;

    /* renamed from: b */
    public final /* synthetic */ int f17598b;

    /* renamed from: c */
    public final /* synthetic */ C9152l.InterfaceC9155c f17599c;

    /* renamed from: d */
    public final /* synthetic */ boolean f17600d;

    public C9156m() {
        C9152l.C9153a c9153a = C9152l.f17591a;
        this.f17597a = false;
        this.f17598b = 129;
        this.f17599c = c9153a;
        this.f17600d = false;
    }

    @Override // androidx.core.view.InterfaceC0932i0
    /* renamed from: a */
    public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
        C0690b m11643a;
        if (view.getFitsSystemWindows()) {
            boolean z = this.f17597a;
            int i = this.f17598b;
            if (z) {
                m11643a = windowInsetsCompat.f2565a.mo11612g(i);
            } else {
                m11643a = windowInsetsCompat.m11643a(i);
            }
            this.f17599c.mo2620a(view, m11643a);
            if (this.f17600d) {
                return WindowInsetsCompat.f2564b;
            }
        }
        return windowInsetsCompat;
    }
}
