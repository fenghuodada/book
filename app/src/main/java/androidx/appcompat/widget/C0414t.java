package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1060o;
import androidx.core.widget.InterfaceC1061p;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0414t extends RadioButton implements InterfaceC1060o, InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: a */
    public final C0355i f1385a;

    /* renamed from: b */
    public final C0326e f1386b;

    /* renamed from: c */
    public final C0327e0 f1387c;

    /* renamed from: d */
    public C0382m f1388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0414t(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        C0419u1.m12491a(context);
        C0413s1.m12501a(this, getContext());
        C0355i c0355i = new C0355i(this);
        this.f1385a = c0355i;
        c0355i.m12625b(attributeSet, R.attr.radioButtonStyle);
        C0326e c0326e = new C0326e(this);
        this.f1386b = c0326e;
        c0326e.m12684d(attributeSet, R.attr.radioButtonStyle);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f1387c = c0327e0;
        c0327e0.m12673f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m12579b(attributeSet, R.attr.radioButtonStyle);
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f1388d == null) {
            this.f1388d = new C0382m(this);
        }
        return this.f1388d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f1387c;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            c0355i.getClass();
        }
        return compoundPaddingLeft;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC1060o
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            return c0355i.f1266b;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            return c0355i.f1267c;
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1387c.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1387c.m12674e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(C0158a.m12920a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            if (c0355i.f1270f) {
                c0355i.f1270f = false;
                return;
            }
            c0355i.f1270f = true;
            c0355i.m12626a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1387c;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1387c;
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
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1386b;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1060o
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            c0355i.f1266b = colorStateList;
            c0355i.f1268d = true;
            c0355i.m12626a();
        }
    }

    @Override // androidx.core.widget.InterfaceC1060o
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C0355i c0355i = this.f1385a;
        if (c0355i != null) {
            c0355i.f1267c = mode;
            c0355i.f1269e = true;
            c0355i.m12626a();
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1387c;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1387c;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }
}
