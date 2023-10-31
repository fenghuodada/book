package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.collection.C0482i;
import androidx.core.internal.view.InterfaceMenuC0725a;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.internal.view.InterfaceSubMenuC0727c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: classes.dex */
public class MenuC0230o extends AbstractC0205c implements Menu {

    /* renamed from: d */
    public final InterfaceMenuC0725a f766d;

    public MenuC0230o(Context context, InterfaceMenuC0725a interfaceMenuC0725a) {
        super(context);
        if (interfaceMenuC0725a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f766d = interfaceMenuC0725a;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m12856c(this.f766d.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m12856c(this.f766d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m12856c(this.f766d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m12856c(this.f766d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f766d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m12856c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m12855d(this.f766d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m12855d(this.f766d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m12855d(this.f766d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m12855d(this.f766d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C0482i<InterfaceMenuItemC0726b, MenuItem> c0482i = this.f664b;
        if (c0482i != null) {
            c0482i.clear();
        }
        C0482i<InterfaceSubMenuC0727c, SubMenu> c0482i2 = this.f665c;
        if (c0482i2 != null) {
            c0482i2.clear();
        }
        this.f766d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f766d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m12856c(this.f766d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m12856c(this.f766d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f766d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f766d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f766d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f766d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f664b != null) {
            int i2 = 0;
            while (true) {
                C0482i<InterfaceMenuItemC0726b, MenuItem> c0482i = this.f664b;
                if (i2 >= c0482i.f1531c) {
                    break;
                }
                if (c0482i.m12398h(i2).getGroupId() == i) {
                    this.f664b.mo6416j(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f766d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f664b != null) {
            int i2 = 0;
            while (true) {
                C0482i<InterfaceMenuItemC0726b, MenuItem> c0482i = this.f664b;
                if (i2 >= c0482i.f1531c) {
                    break;
                } else if (c0482i.m12398h(i2).getItemId() == i) {
                    this.f664b.mo6416j(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f766d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f766d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f766d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f766d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f766d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f766d.size();
    }
}
