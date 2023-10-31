package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;
import com.ambrose.overwall.R;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: a */
    public final C0326e f866a;

    /* renamed from: b */
    public final C0327e0 f867b;
    @NonNull

    /* renamed from: c */
    public C0382m f868c;

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0419u1.m12491a(context);
        C0413s1.m12501a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f866a = c0326e;
        c0326e.m12684d(attributeSet, i);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f867b = c0327e0;
        c0327e0.m12673f(attributeSet, i);
        c0327e0.m12677b();
        getEmojiTextViewHelper().m12579b(attributeSet, i);
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f868c == null) {
            this.f868c = new C0382m(this);
        }
        return this.f868c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1334e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeMinTextSize();
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1333d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeStepGranularity();
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1332c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            return c0327e0.f1184i.f1335f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (C0362i2.f1278b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 == null) {
            return 0;
        }
        return c0327e0.f1184i.f1330a;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m11299d(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f867b.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f867b.m12674e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null && !C0362i2.f1278b) {
            c0327e0.f1184i.m12564a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null && !C0362i2.f1278b) {
            C0389n0 c0389n0 = c0327e0.f1184i;
            if (c0389n0.m12556i() && c0389n0.f1330a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            c0327e0.f1184i.m12564a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.m12670i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.m12669j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.m12668k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m12577d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m12580a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.f1176a.setAllCaps(z);
        }
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f866a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f867b;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f867b;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null) {
            c0327e0.m12672g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = C0362i2.f1278b;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        C0327e0 c0327e0 = this.f867b;
        if (c0327e0 != null && !z2) {
            C0389n0 c0389n0 = c0327e0.f1184i;
            if (c0389n0.m12556i() && c0389n0.f1330a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c0389n0.m12559f(f, i);
            }
        }
    }
}
