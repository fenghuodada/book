package androidx.core.internal.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC0893b;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.internal.view.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0726b extends MenuItem {
    @NonNull
    /* renamed from: a */
    InterfaceMenuItemC0726b mo11872a(@Nullable AbstractC0893b abstractC0893b);

    @Nullable
    /* renamed from: b */
    AbstractC0893b mo11871b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @Nullable
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @Nullable
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @Nullable
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @Nullable
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setActionView(@Nullable View view);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    InterfaceMenuItemC0726b setContentDescription(@Nullable CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(@Nullable ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(@Nullable PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    @NonNull
    InterfaceMenuItemC0726b setTooltipText(@Nullable CharSequence charSequence);
}
