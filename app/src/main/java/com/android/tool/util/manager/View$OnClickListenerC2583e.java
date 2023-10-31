package com.android.tool.util.manager;

import android.view.View;
import com.android.tool.util.manager.C2560c;
import com.qmuiteam.qmui.skin.C9108h;

/* renamed from: com.android.tool.util.manager.e */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2583e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2560c.C2565e f6083a;

    /* renamed from: b */
    public final /* synthetic */ C2560c.InterfaceC2563c f6084b;

    /* renamed from: c */
    public final /* synthetic */ C2560c f6085c;

    /* renamed from: com.android.tool.util.manager.e$a */
    /* loaded from: classes.dex */
    public class C2584a implements C2560c.InterfaceC2564d {
        public C2584a() {
        }
    }

    public View$OnClickListenerC2583e(C2560c c2560c, C2560c.C2565e c2565e, C2560c.InterfaceC2563c interfaceC2563c) {
        this.f6085c = c2560c;
        this.f6083a = c2565e;
        this.f6084b = interfaceC2563c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f6083a.f6075b;
        C2584a c2584a = new C2584a();
        C2560c c2560c = this.f6085c;
        c2560c.getClass();
        C2585f c2585f = new C2585f(view2.getContext(), c2560c.f6064d, c2584a);
        c2585f.f17898g = C9108h.m2670f(view2.getContext());
        c2585f.m2562c(view2);
    }
}
