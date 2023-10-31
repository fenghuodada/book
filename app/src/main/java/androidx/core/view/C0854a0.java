package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* renamed from: androidx.core.view.a0 */
/* loaded from: classes.dex */
public final class C0854a0 {
    @DoNotInline
    /* renamed from: a */
    public static int m11597a(MenuItem menuItem) {
        int alphabeticModifiers;
        alphabeticModifiers = menuItem.getAlphabeticModifiers();
        return alphabeticModifiers;
    }

    @DoNotInline
    /* renamed from: b */
    public static CharSequence m11596b(MenuItem menuItem) {
        CharSequence contentDescription;
        contentDescription = menuItem.getContentDescription();
        return contentDescription;
    }

    @DoNotInline
    /* renamed from: c */
    public static ColorStateList m11595c(MenuItem menuItem) {
        ColorStateList iconTintList;
        iconTintList = menuItem.getIconTintList();
        return iconTintList;
    }

    @DoNotInline
    /* renamed from: d */
    public static PorterDuff.Mode m11594d(MenuItem menuItem) {
        PorterDuff.Mode iconTintMode;
        iconTintMode = menuItem.getIconTintMode();
        return iconTintMode;
    }

    @DoNotInline
    /* renamed from: e */
    public static int m11593e(MenuItem menuItem) {
        int numericModifiers;
        numericModifiers = menuItem.getNumericModifiers();
        return numericModifiers;
    }

    @DoNotInline
    /* renamed from: f */
    public static CharSequence m11592f(MenuItem menuItem) {
        CharSequence tooltipText;
        tooltipText = menuItem.getTooltipText();
        return tooltipText;
    }

    @DoNotInline
    /* renamed from: g */
    public static MenuItem m11591g(MenuItem menuItem, char c, int i) {
        MenuItem alphabeticShortcut;
        alphabeticShortcut = menuItem.setAlphabeticShortcut(c, i);
        return alphabeticShortcut;
    }

    @DoNotInline
    /* renamed from: h */
    public static MenuItem m11590h(MenuItem menuItem, CharSequence charSequence) {
        MenuItem contentDescription;
        contentDescription = menuItem.setContentDescription(charSequence);
        return contentDescription;
    }

    @DoNotInline
    /* renamed from: i */
    public static MenuItem m11589i(MenuItem menuItem, ColorStateList colorStateList) {
        MenuItem iconTintList;
        iconTintList = menuItem.setIconTintList(colorStateList);
        return iconTintList;
    }

    @DoNotInline
    /* renamed from: j */
    public static MenuItem m11588j(MenuItem menuItem, PorterDuff.Mode mode) {
        MenuItem iconTintMode;
        iconTintMode = menuItem.setIconTintMode(mode);
        return iconTintMode;
    }

    @DoNotInline
    /* renamed from: k */
    public static MenuItem m11587k(MenuItem menuItem, char c, int i) {
        MenuItem numericShortcut;
        numericShortcut = menuItem.setNumericShortcut(c, i);
        return numericShortcut;
    }

    @DoNotInline
    /* renamed from: l */
    public static MenuItem m11586l(MenuItem menuItem, char c, char c2, int i, int i2) {
        MenuItem shortcut;
        shortcut = menuItem.setShortcut(c, c2, i, i2);
        return shortcut;
    }

    @DoNotInline
    /* renamed from: m */
    public static MenuItem m11585m(MenuItem menuItem, CharSequence charSequence) {
        MenuItem tooltipText;
        tooltipText = menuItem.setTooltipText(charSequence);
        return tooltipText;
    }
}
