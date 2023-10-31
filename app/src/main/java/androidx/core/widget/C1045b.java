package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.widget.b */
/* loaded from: classes.dex */
public final class C1045b {
    @DoNotInline
    /* renamed from: a */
    public static ColorStateList m11268a(CompoundButton compoundButton) {
        return compoundButton.getButtonTintList();
    }

    @DoNotInline
    /* renamed from: b */
    public static PorterDuff.Mode m11267b(CompoundButton compoundButton) {
        return compoundButton.getButtonTintMode();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11266c(CompoundButton compoundButton, ColorStateList colorStateList) {
        compoundButton.setButtonTintList(colorStateList);
    }

    @DoNotInline
    /* renamed from: d */
    public static void m11265d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        compoundButton.setButtonTintMode(mode);
    }
}
