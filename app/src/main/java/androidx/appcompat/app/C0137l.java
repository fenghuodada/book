package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.C0934i2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.app.l */
/* loaded from: classes.dex */
public final class C0137l extends C0934i2 {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater$Factory2C0114h f383a;

    public C0137l(LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h) {
        this.f383a = layoutInflater$Factory2C0114h;
    }

    @Override // androidx.core.view.C0934i2, androidx.core.view.InterfaceC0928h2
    /* renamed from: b */
    public final void mo11451b() {
        LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = this.f383a;
        layoutInflater$Factory2C0114h.f339v.setVisibility(0);
        if (layoutInflater$Factory2C0114h.f339v.getParent() instanceof View) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c((View) layoutInflater$Factory2C0114h.f339v.getParent());
        }
    }

    @Override // androidx.core.view.InterfaceC0928h2
    /* renamed from: c */
    public final void mo11463c() {
        LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = this.f383a;
        layoutInflater$Factory2C0114h.f339v.setAlpha(1.0f);
        layoutInflater$Factory2C0114h.f342y.m11470d(null);
        layoutInflater$Factory2C0114h.f342y = null;
    }
}
