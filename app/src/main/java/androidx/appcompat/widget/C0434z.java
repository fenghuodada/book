package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.view.menu.InterfaceC0231p;
import androidx.appcompat.widget.C0286a0;

/* renamed from: androidx.appcompat.widget.z */
/* loaded from: classes.dex */
public final class C0434z extends AbstractView$OnTouchListenerC0304b1 {

    /* renamed from: j */
    public final /* synthetic */ C0286a0.C0293g f1415j;

    /* renamed from: k */
    public final /* synthetic */ C0286a0 f1416k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0434z(C0286a0 c0286a0, View view, C0286a0.C0293g c0293g) {
        super(view);
        this.f1416k = c0286a0;
        this.f1415j = c0293g;
    }

    @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
    /* renamed from: b */
    public final InterfaceC0231p mo12457b() {
        return this.f1415j;
    }

    @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: c */
    public final boolean mo12456c() {
        C0286a0 c0286a0 = this.f1416k;
        if (!c0286a0.getInternalPopup().mo12725a()) {
            c0286a0.f1087f.mo12716m(C0286a0.C0289c.m12730b(c0286a0), C0286a0.C0289c.m12731a(c0286a0));
            return true;
        }
        return true;
    }
}
