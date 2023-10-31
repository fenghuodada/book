package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1061p;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public final class C0405q0 extends ToggleButton implements InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: a */
    public final C0326e f1353a;

    /* renamed from: b */
    public final C0327e0 f1354b;

    /* renamed from: c */
    public C0382m f1355c;

    public C0405q0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        C0413s1.m12501a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1353a = c0326e;
        c0326e.m12684d(attributeSet, 16842827);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f1354b = c0327e0;
        c0327e0.m12673f(attributeSet, 16842827);
        getEmojiTextViewHelper().m12579b(attributeSet, 16842827);
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f1355c == null) {
            this.f1355c = new C0382m(this);
        }
        return this.f1355c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f1354b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1354b.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1354b.m12674e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1354b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1354b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m12577d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m12580a(inputFilterArr));
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1353a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1354b;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1354b;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }
}
