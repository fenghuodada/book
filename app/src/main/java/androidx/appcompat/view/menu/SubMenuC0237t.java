package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.InterfaceSubMenuC0727c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.t */
/* loaded from: classes.dex */
public final class SubMenuC0237t extends MenuC0230o implements SubMenu {

    /* renamed from: e */
    public final InterfaceSubMenuC0727c f791e;

    public SubMenuC0237t(Context context, InterfaceSubMenuC0727c interfaceSubMenuC0727c) {
        super(context, interfaceSubMenuC0727c);
        this.f791e = interfaceSubMenuC0727c;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f791e.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m12856c(this.f791e.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f791e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f791e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f791e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f791e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f791e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f791e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f791e.setIcon(drawable);
        return this;
    }
}
