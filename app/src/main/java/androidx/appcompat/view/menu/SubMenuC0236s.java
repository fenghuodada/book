package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: classes.dex */
public final class SubMenuC0236s extends C0210g implements SubMenu {

    /* renamed from: A */
    public final C0214i f789A;

    /* renamed from: z */
    public final C0210g f790z;

    public SubMenuC0236s(Context context, C0210g c0210g, C0214i c0214i) {
        super(context);
        this.f790z = c0210g;
        this.f789A = c0214i;
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: d */
    public final boolean mo12815d(C0214i c0214i) {
        return this.f790z.mo12815d(c0214i);
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: e */
    public final boolean mo12814e(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
        return super.mo12814e(c0210g, menuItem) || this.f790z.mo12814e(c0210g, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: f */
    public final boolean mo12813f(C0214i c0214i) {
        return this.f790z.mo12813f(c0214i);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f789A;
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: j */
    public final String mo12812j() {
        int i;
        C0214i c0214i = this.f789A;
        if (c0214i != null) {
            i = c0214i.f715a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return C0235r.m12816a("android:menu:actionviewstates:", i);
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: k */
    public final C0210g mo12811k() {
        return this.f790z.mo12811k();
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: m */
    public final boolean mo12810m() {
        return this.f790z.mo12810m();
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: n */
    public final boolean mo12809n() {
        return this.f790z.mo12809n();
    }

    @Override // androidx.appcompat.view.menu.C0210g
    /* renamed from: o */
    public final boolean mo12808o() {
        return this.f790z.mo12808o();
    }

    @Override // androidx.appcompat.view.menu.C0210g, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f790z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        m12838u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        m12838u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        m12838u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f789A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f789A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0210g, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f790z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        m12838u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m12838u(0, charSequence, 0, null, null);
        return this;
    }
}
