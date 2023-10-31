package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.view.AbstractC0893b;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public final class C0203a implements InterfaceMenuItemC0726b {

    /* renamed from: a */
    public CharSequence f639a;

    /* renamed from: b */
    public CharSequence f640b;

    /* renamed from: c */
    public Intent f641c;

    /* renamed from: d */
    public char f642d;

    /* renamed from: f */
    public char f644f;

    /* renamed from: h */
    public Drawable f646h;

    /* renamed from: i */
    public final Context f647i;

    /* renamed from: j */
    public CharSequence f648j;

    /* renamed from: k */
    public CharSequence f649k;

    /* renamed from: e */
    public int f643e = 4096;

    /* renamed from: g */
    public int f645g = 4096;

    /* renamed from: l */
    public ColorStateList f650l = null;

    /* renamed from: m */
    public PorterDuff.Mode f651m = null;

    /* renamed from: n */
    public boolean f652n = false;

    /* renamed from: o */
    public boolean f653o = false;

    /* renamed from: p */
    public int f654p = 16;

    public C0203a(Context context, CharSequence charSequence) {
        this.f647i = context;
        this.f639a = charSequence;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b
    @NonNull
    /* renamed from: a */
    public final InterfaceMenuItemC0726b mo11872a(AbstractC0893b abstractC0893b) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b
    /* renamed from: b */
    public final AbstractC0893b mo11871b() {
        return null;
    }

    /* renamed from: c */
    public final void m12857c() {
        Drawable drawable = this.f646h;
        if (drawable != null) {
            if (this.f652n || this.f653o) {
                this.f646h = drawable;
                Drawable mutate = drawable.mutate();
                this.f646h = mutate;
                if (this.f652n) {
                    C0700a.C0702b.m11924h(mutate, this.f650l);
                }
                if (this.f653o) {
                    C0700a.C0702b.m11923i(this.f646h, this.f651m);
                }
            }
        }
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f645g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f644f;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f648j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f646h;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f650l;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f651m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f641c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f643e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f642d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f639a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f640b;
        return charSequence != null ? charSequence : this.f639a;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f649k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f654p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f654p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f654p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f654p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f644f = Character.toLowerCase(c);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f644f = Character.toLowerCase(c);
        this.f645g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f654p = (z ? 1 : 0) | (this.f654p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f654p = (z ? 2 : 0) | (this.f654p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f648j = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC0726b setContentDescription(CharSequence charSequence) {
        this.f648j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f654p = (z ? 16 : 0) | (this.f654p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Object obj = ContextCompat.f2323a;
        this.f646h = ContextCompat.C0651c.m12032b(this.f647i, i);
        m12857c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f646h = drawable;
        m12857c();
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f650l = colorStateList;
        this.f652n = true;
        m12857c();
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f651m = mode;
        this.f653o = true;
        m12857c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f641c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f642d = c;
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f642d = c;
        this.f643e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f642d = c;
        this.f644f = Character.toLowerCase(c2);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f642d = c;
        this.f643e = KeyEvent.normalizeMetaState(i);
        this.f644f = Character.toLowerCase(c2);
        this.f645g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f639a = this.f647i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f639a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f640b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f649k = charSequence;
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC0726b setTooltipText(CharSequence charSequence) {
        this.f649k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f654p = (this.f654p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
