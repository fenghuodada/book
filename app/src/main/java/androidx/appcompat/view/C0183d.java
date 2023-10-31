package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0309c;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.d */
/* loaded from: classes.dex */
public final class C0183d extends AbstractC0178a implements C0210g.InterfaceC0211a {

    /* renamed from: c */
    public final Context f514c;

    /* renamed from: d */
    public final ActionBarContextView f515d;

    /* renamed from: e */
    public final AbstractC0178a.InterfaceC0179a f516e;

    /* renamed from: f */
    public WeakReference<View> f517f;

    /* renamed from: g */
    public boolean f518g;

    /* renamed from: h */
    public final C0210g f519h;

    public C0183d(Context context, ActionBarContextView actionBarContextView, AbstractC0178a.InterfaceC0179a interfaceC0179a) {
        this.f514c = context;
        this.f515d = actionBarContextView;
        this.f516e = interfaceC0179a;
        C0210g c0210g = new C0210g(actionBarContextView.getContext());
        c0210g.f696l = 1;
        this.f519h = c0210g;
        c0210g.f689e = this;
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
    /* renamed from: a */
    public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
        return this.f516e.mo12878c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
    /* renamed from: b */
    public final void mo12746b(@NonNull C0210g c0210g) {
        mo12888i();
        C0309c c0309c = this.f515d.f1073d;
        if (c0309c != null) {
            c0309c.m12703l();
        }
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: c */
    public final void mo12894c() {
        if (this.f518g) {
            return;
        }
        this.f518g = true;
        this.f516e.mo12880a(this);
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: d */
    public final View mo12893d() {
        WeakReference<View> weakReference = this.f517f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: e */
    public final C0210g mo12892e() {
        return this.f519h;
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: f */
    public final MenuInflater mo12891f() {
        return new C0186f(this.f515d.getContext());
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: g */
    public final CharSequence mo12890g() {
        return this.f515d.getSubtitle();
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: h */
    public final CharSequence mo12889h() {
        return this.f515d.getTitle();
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: i */
    public final void mo12888i() {
        this.f516e.mo12877d(this, this.f519h);
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: j */
    public final boolean mo12887j() {
        return this.f515d.f812s;
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: k */
    public final void mo12886k(View view) {
        this.f515d.setCustomView(view);
        this.f517f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: l */
    public final void mo12885l(int i) {
        mo12884m(this.f514c.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: m */
    public final void mo12884m(CharSequence charSequence) {
        this.f515d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: n */
    public final void mo12883n(int i) {
        mo12882o(this.f514c.getString(i));
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: o */
    public final void mo12882o(CharSequence charSequence) {
        this.f515d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.AbstractC0178a
    /* renamed from: p */
    public final void mo12881p(boolean z) {
        this.f507b = z;
        this.f515d.setTitleOptional(z);
    }
}
