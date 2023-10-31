package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C0482i;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.internal.view.InterfaceSubMenuC0727c;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public abstract class AbstractC0205c {

    /* renamed from: a */
    public final Context f663a;

    /* renamed from: b */
    public C0482i<InterfaceMenuItemC0726b, MenuItem> f664b;

    /* renamed from: c */
    public C0482i<InterfaceSubMenuC0727c, SubMenu> f665c;

    public AbstractC0205c(Context context) {
        this.f663a = context;
    }

    /* renamed from: c */
    public final MenuItem m12856c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC0726b) {
            InterfaceMenuItemC0726b interfaceMenuItemC0726b = (InterfaceMenuItemC0726b) menuItem;
            if (this.f664b == null) {
                this.f664b = new C0482i<>();
            }
            MenuItem orDefault = this.f664b.getOrDefault(interfaceMenuItemC0726b, null);
            if (orDefault == null) {
                MenuItemC0216j menuItemC0216j = new MenuItemC0216j(this.f663a, interfaceMenuItemC0726b);
                this.f664b.put(interfaceMenuItemC0726b, menuItemC0216j);
                return menuItemC0216j;
            }
            return orDefault;
        }
        return menuItem;
    }

    /* renamed from: d */
    public final SubMenu m12855d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC0727c) {
            InterfaceSubMenuC0727c interfaceSubMenuC0727c = (InterfaceSubMenuC0727c) subMenu;
            if (this.f665c == null) {
                this.f665c = new C0482i<>();
            }
            SubMenu orDefault = this.f665c.getOrDefault(interfaceSubMenuC0727c, null);
            if (orDefault == null) {
                SubMenuC0237t subMenuC0237t = new SubMenuC0237t(this.f663a, interfaceSubMenuC0727c);
                this.f665c.put(interfaceSubMenuC0727c, subMenuC0237t);
                return subMenuC0237t;
            }
            return orDefault;
        }
        return subMenu;
    }
}
