package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.InterfaceC0180b;
import androidx.appcompat.view.menu.C0214i;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.view.AbstractC0893b;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: classes.dex */
public final class MenuItemC0216j extends AbstractC0205c implements MenuItem {

    /* renamed from: d */
    public final InterfaceMenuItemC0726b f742d;

    /* renamed from: e */
    public Method f743e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: classes.dex */
    public class C0217a extends AbstractC0893b {

        /* renamed from: b */
        public final ActionProvider f744b;

        public C0217a(ActionProvider actionProvider) {
            this.f744b = actionProvider;
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: a */
        public final boolean mo11535a() {
            return this.f744b.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: c */
        public final View mo11533c() {
            return this.f744b.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: e */
        public final boolean mo11531e() {
            return this.f744b.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: f */
        public final void mo11530f(SubMenuC0236s subMenuC0236s) {
            this.f744b.onPrepareSubMenu(MenuItemC0216j.this.m12855d(subMenuC0236s));
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* loaded from: classes.dex */
    public class ActionProvider$VisibilityListenerC0218b extends C0217a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public AbstractC0893b.InterfaceC0894a f746d;

        public ActionProvider$VisibilityListenerC0218b(MenuItemC0216j menuItemC0216j, ActionProvider actionProvider) {
            super(actionProvider);
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: b */
        public final boolean mo11534b() {
            return this.f744b.isVisible();
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: d */
        public final View mo11532d(MenuItem menuItem) {
            return this.f744b.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: g */
        public final boolean mo11529g() {
            return this.f744b.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC0893b
        /* renamed from: h */
        public final void mo11528h(C0214i.C0215a c0215a) {
            this.f746d = c0215a;
            this.f744b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public final void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0893b.InterfaceC0894a interfaceC0894a = this.f746d;
            if (interfaceC0894a != null) {
                C0210g c0210g = C0214i.this.f728n;
                c0210g.f692h = true;
                c0210g.m12843p(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* loaded from: classes.dex */
    public static class C0219c extends FrameLayout implements InterfaceC0180b {

        /* renamed from: a */
        public final CollapsibleActionView f747a;

        public C0219c(View view) {
            super(view.getContext());
            this.f747a = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.InterfaceC0180b
        public final void onActionViewCollapsed() {
            this.f747a.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.InterfaceC0180b
        public final void onActionViewExpanded() {
            this.f747a.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* loaded from: classes.dex */
    public class MenuItem$OnActionExpandListenerC0220d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        public final MenuItem.OnActionExpandListener f748a;

        public MenuItem$OnActionExpandListenerC0220d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f748a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f748a.onMenuItemActionCollapse(MenuItemC0216j.this.m12856c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public final boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f748a.onMenuItemActionExpand(MenuItemC0216j.this.m12856c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* loaded from: classes.dex */
    public class MenuItem$OnMenuItemClickListenerC0221e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        public final MenuItem.OnMenuItemClickListener f750a;

        public MenuItem$OnMenuItemClickListenerC0221e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f750a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return this.f750a.onMenuItemClick(MenuItemC0216j.this.m12856c(menuItem));
        }
    }

    public MenuItemC0216j(Context context, InterfaceMenuItemC0726b interfaceMenuItemC0726b) {
        super(context);
        if (interfaceMenuItemC0726b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f742d = interfaceMenuItemC0726b;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f742d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f742d.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC0893b mo11871b = this.f742d.mo11871b();
        if (mo11871b instanceof C0217a) {
            return ((C0217a) mo11871b).f744b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f742d.getActionView();
        if (actionView instanceof C0219c) {
            return (View) ((C0219c) actionView).f747a;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f742d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f742d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f742d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f742d.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f742d.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f742d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f742d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f742d.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f742d.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f742d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f742d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f742d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f742d.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return m12855d(this.f742d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f742d.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f742d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f742d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f742d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f742d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f742d.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f742d.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f742d.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f742d.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC0218b actionProvider$VisibilityListenerC0218b = new ActionProvider$VisibilityListenerC0218b(this, actionProvider);
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC0218b = null;
        }
        this.f742d.mo11872a(actionProvider$VisibilityListenerC0218b);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC0726b interfaceMenuItemC0726b = this.f742d;
        interfaceMenuItemC0726b.setActionView(i);
        View actionView = interfaceMenuItemC0726b.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC0726b.setActionView(new C0219c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0219c(view);
        }
        this.f742d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f742d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f742d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f742d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f742d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f742d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f742d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f742d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f742d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f742d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f742d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f742d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f742d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f742d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f742d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC0220d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f742d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0221e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f742d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f742d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f742d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f742d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f742d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f742d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f742d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f742d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f742d.setVisible(z);
    }
}
