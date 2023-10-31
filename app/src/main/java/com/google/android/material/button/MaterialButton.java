package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.internal.C7758l;
import com.google.android.material.internal.C7764q;
import com.google.android.material.resources.C7774c;
import com.google.android.material.ripple.C7781a;
import com.google.android.material.shape.C7792a;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7813n;
import com.google.android.material.theme.overlay.C7899a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC7813n {

    /* renamed from: r */
    public static final int[] f14523r = {16842911};

    /* renamed from: s */
    public static final int[] f14524s = {16842912};
    @NonNull

    /* renamed from: d */
    public final C7620a f14525d;
    @NonNull

    /* renamed from: e */
    public final LinkedHashSet<InterfaceC7611a> f14526e;
    @Nullable

    /* renamed from: f */
    public InterfaceC7612b f14527f;
    @Nullable

    /* renamed from: g */
    public PorterDuff.Mode f14528g;
    @Nullable

    /* renamed from: h */
    public ColorStateList f14529h;
    @Nullable

    /* renamed from: i */
    public Drawable f14530i;
    @Nullable

    /* renamed from: j */
    public String f14531j;
    @InterfaceC0074Px

    /* renamed from: k */
    public int f14532k;
    @InterfaceC0074Px

    /* renamed from: l */
    public int f14533l;
    @InterfaceC0074Px

    /* renamed from: m */
    public int f14534m;
    @InterfaceC0074Px

    /* renamed from: n */
    public int f14535n;

    /* renamed from: o */
    public boolean f14536o;

    /* renamed from: p */
    public boolean f14537p;

    /* renamed from: q */
    public int f14538q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IconGravity {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7611a {
        /* renamed from: a */
        void m4726a();
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7612b {
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    /* loaded from: classes3.dex */
    public static class C7613c extends AbstractC1068a {
        public static final Parcelable.Creator<C7613c> CREATOR = new C7614a();

        /* renamed from: c */
        public boolean f14539c;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        /* loaded from: classes3.dex */
        public class C7614a implements Parcelable.ClassLoaderCreator<C7613c> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7613c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7613c[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7613c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7613c(parcel, classLoader);
            }
        }

        public C7613c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C7613c.class.getClassLoader();
            }
            this.f14539c = parcel.readInt() == 1;
        }

        public C7613c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            parcel.writeInt(this.f14539c ? 1 : 0);
        }
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.materialButtonStyle, 2132018298), attributeSet, R.attr.materialButtonStyle);
        this.f14526e = new LinkedHashSet<>();
        this.f14536o = false;
        this.f14537p = false;
        Context context2 = getContext();
        TypedArray m4508d = C7758l.m4508d(context2, attributeSet, C7621c.f14590j, R.attr.materialButtonStyle, 2132018298, new int[0]);
        this.f14535n = m4508d.getDimensionPixelSize(12, 0);
        this.f14528g = C7764q.m4504b(m4508d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f14529h = C7774c.m4495a(getContext(), m4508d, 14);
        this.f14530i = C7774c.m4493c(getContext(), m4508d, 10);
        this.f14538q = m4508d.getInteger(11, 1);
        this.f14532k = m4508d.getDimensionPixelSize(13, 0);
        C7620a c7620a = new C7620a(this, new C7801j(C7801j.m4457b(context2, attributeSet, R.attr.materialButtonStyle, 2132018298)));
        this.f14525d = c7620a;
        c7620a.f14561c = m4508d.getDimensionPixelOffset(1, 0);
        c7620a.f14562d = m4508d.getDimensionPixelOffset(2, 0);
        c7620a.f14563e = m4508d.getDimensionPixelOffset(3, 0);
        c7620a.f14564f = m4508d.getDimensionPixelOffset(4, 0);
        if (m4508d.hasValue(8)) {
            int dimensionPixelSize = m4508d.getDimensionPixelSize(8, -1);
            c7620a.f14565g = dimensionPixelSize;
            C7801j c7801j = c7620a.f14560b;
            float f = dimensionPixelSize;
            c7801j.getClass();
            C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
            c7802a.f15249e = new C7792a(f);
            c7802a.f15250f = new C7792a(f);
            c7802a.f15251g = new C7792a(f);
            c7802a.f15252h = new C7792a(f);
            c7620a.m4717c(new C7801j(c7802a));
            c7620a.f14574p = true;
        }
        c7620a.f14566h = m4508d.getDimensionPixelSize(20, 0);
        c7620a.f14567i = C7764q.m4504b(m4508d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c7620a.f14568j = C7774c.m4495a(getContext(), m4508d, 6);
        c7620a.f14569k = C7774c.m4495a(getContext(), m4508d, 19);
        c7620a.f14570l = C7774c.m4495a(getContext(), m4508d, 16);
        c7620a.f14575q = m4508d.getBoolean(5, false);
        c7620a.f14578t = m4508d.getDimensionPixelSize(9, 0);
        c7620a.f14576r = m4508d.getBoolean(21, true);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int m11740f = ViewCompat.C0815e.m11740f(this);
        int paddingTop = getPaddingTop();
        int m11741e = ViewCompat.C0815e.m11741e(this);
        int paddingBottom = getPaddingBottom();
        if (m4508d.hasValue(0)) {
            c7620a.f14573o = true;
            setSupportBackgroundTintList(c7620a.f14568j);
            setSupportBackgroundTintMode(c7620a.f14567i);
        } else {
            c7620a.m4715e();
        }
        ViewCompat.C0815e.m11735k(this, m11740f + c7620a.f14561c, paddingTop + c7620a.f14563e, m11741e + c7620a.f14562d, paddingBottom + c7620a.f14564f);
        m4508d.recycle();
        setCompoundDrawablePadding(this.f14535n);
        m4728j(this.f14530i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    /* renamed from: d */
    public final boolean m4730d() {
        C7620a c7620a = this.f14525d;
        if (c7620a != null && !c7620a.f14573o) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m4729f() {
        boolean z;
        boolean z2;
        int i = this.f14538q;
        boolean z3 = false;
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            TextViewCompat.C1037b.m11290e(this, this.f14530i, null, null, null);
            return;
        }
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            TextViewCompat.C1037b.m11290e(this, null, null, this.f14530i, null);
            return;
        }
        if (i == 16 || i == 32) {
            z3 = true;
        }
        if (z3) {
            TextViewCompat.C1037b.m11290e(this, null, this.f14530i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        boolean z;
        Class cls;
        if (!TextUtils.isEmpty(this.f14531j)) {
            return this.f14531j;
        }
        C7620a c7620a = this.f14525d;
        if (c7620a != null && c7620a.f14575q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @InterfaceC0074Px
    public int getCornerRadius() {
        if (m4730d()) {
            return this.f14525d.f14565g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f14530i;
    }

    public int getIconGravity() {
        return this.f14538q;
    }

    @InterfaceC0074Px
    public int getIconPadding() {
        return this.f14535n;
    }

    @InterfaceC0074Px
    public int getIconSize() {
        return this.f14532k;
    }

    public ColorStateList getIconTint() {
        return this.f14529h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14528g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f14525d.f14564f;
    }

    @Dimension
    public int getInsetTop() {
        return this.f14525d.f14563e;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m4730d()) {
            return this.f14525d.f14570l;
        }
        return null;
    }

    @NonNull
    public C7801j getShapeAppearanceModel() {
        if (m4730d()) {
            return this.f14525d.f14560b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m4730d()) {
            return this.f14525d.f14569k;
        }
        return null;
    }

    @InterfaceC0074Px
    public int getStrokeWidth() {
        if (m4730d()) {
            return this.f14525d.f14566h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (m4730d()) {
            return this.f14525d.f14568j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m4730d()) {
            return this.f14525d.f14567i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14536o;
    }

    /* renamed from: j */
    public final void m4728j(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Drawable drawable = this.f14530i;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f14530i = mutate;
            C0700a.C0702b.m11924h(mutate, this.f14529h);
            PorterDuff.Mode mode = this.f14528g;
            if (mode != null) {
                C0700a.C0702b.m11923i(this.f14530i, mode);
            }
            int i = this.f14532k;
            if (i == 0) {
                i = this.f14530i.getIntrinsicWidth();
            }
            int i2 = this.f14532k;
            if (i2 == 0) {
                i2 = this.f14530i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f14530i;
            int i3 = this.f14533l;
            int i4 = this.f14534m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f14530i.setVisible(true, z);
        }
        if (z) {
            m4729f();
            return;
        }
        Drawable[] m11294a = TextViewCompat.C1037b.m11294a(this);
        Drawable drawable3 = m11294a[0];
        Drawable drawable4 = m11294a[1];
        Drawable drawable5 = m11294a[2];
        int i5 = this.f14538q;
        if (i5 != 1 && i5 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || drawable3 == this.f14530i) {
            if (i5 != 3 && i5 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || drawable5 == this.f14530i) {
                if (i5 != 16 && i5 != 32) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4 || drawable4 == this.f14530i) {
                    z5 = false;
                }
            }
        }
        if (z5) {
            m4729f();
        }
    }

    /* renamed from: k */
    public final void m4727k(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f14530i != null && getLayout() != null) {
            int i3 = this.f14538q;
            boolean z4 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (i3 != 3 && i3 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (i3 != 16 && i3 != 32) {
                        z4 = false;
                    }
                    if (z4) {
                        this.f14533l = 0;
                        if (i3 == 16) {
                            this.f14534m = 0;
                            m4728j(false);
                        }
                        int i4 = this.f14532k;
                        if (i4 == 0) {
                            i4 = this.f14530i.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f14535n) - getPaddingBottom()) / 2);
                        if (this.f14534m != max) {
                            this.f14534m = max;
                            m4728j(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f14534m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.f14538q;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.f14532k;
                if (i6 == 0) {
                    i6 = this.f14530i.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                int m11741e = (((textLayoutWidth - ViewCompat.C0815e.m11741e(this)) - i6) - this.f14535n) - ViewCompat.C0815e.m11740f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    m11741e /= 2;
                }
                if (ViewCompat.C0815e.m11742d(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f14538q != 4) {
                    z4 = false;
                }
                if (z2 != z4) {
                    m11741e = -m11741e;
                }
                if (this.f14533l != m11741e) {
                    this.f14533l = m11741e;
                    m4728j(false);
                    return;
                }
                return;
            }
            this.f14533l = 0;
            m4728j(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m4730d()) {
            C7798g.m4461b(this, this.f14525d.m4718b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C7620a c7620a = this.f14525d;
        if (c7620a != null && c7620a.f14575q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f14523r);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f14524s);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C7620a c7620a = this.f14525d;
        if (c7620a != null && c7620a.f14575q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m4727k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C7613c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7613c c7613c = (C7613c) parcelable;
        super.onRestoreInstanceState(c7613c.f2747a);
        setChecked(c7613c.f14539c);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        C7613c c7613c = new C7613c(super.onSaveInstanceState());
        c7613c.f14539c = this.f14536o;
        return c7613c;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m4727k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f14525d.f14576r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f14530i != null) {
            if (this.f14530i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.f14531j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.m4718b(false) != null) {
                c7620a.m4718b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (m4730d()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                C7620a c7620a = this.f14525d;
                c7620a.f14573o = true;
                ColorStateList colorStateList = c7620a.f14568j;
                MaterialButton materialButton = c7620a.f14559a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(c7620a.f14567i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        setBackgroundDrawable(i != 0 ? C0158a.m12920a(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m4730d()) {
            this.f14525d.f14575q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        boolean z2;
        C7620a c7620a = this.f14525d;
        if (c7620a != null && c7620a.f14575q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && isEnabled() && this.f14536o != z) {
            this.f14536o = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f14536o;
                if (!materialButtonToggleGroup.f14546f) {
                    materialButtonToggleGroup.m4724b(getId(), z3);
                }
            }
            if (this.f14537p) {
                return;
            }
            this.f14537p = true;
            Iterator<InterfaceC7611a> it = this.f14526e.iterator();
            while (it.hasNext()) {
                it.next().m4726a();
            }
            this.f14537p = false;
        }
    }

    public void setCornerRadius(@InterfaceC0074Px int i) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (!c7620a.f14574p || c7620a.f14565g != i) {
                c7620a.f14565g = i;
                c7620a.f14574p = true;
                C7801j c7801j = c7620a.f14560b;
                float f = i;
                c7801j.getClass();
                C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
                c7802a.f15249e = new C7792a(f);
                c7802a.f15250f = new C7792a(f);
                c7802a.f15251g = new C7792a(f);
                c7802a.f15252h = new C7792a(f);
                c7620a.m4717c(new C7801j(c7802a));
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int i) {
        if (m4730d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if (m4730d()) {
            this.f14525d.m4718b(false).m4468j(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f14530i != drawable) {
            this.f14530i = drawable;
            m4728j(true);
            m4727k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f14538q != i) {
            this.f14538q = i;
            m4727k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@InterfaceC0074Px int i) {
        if (this.f14535n != i) {
            this.f14535n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@DrawableRes int i) {
        setIcon(i != 0 ? C0158a.m12920a(getContext(), i) : null);
    }

    public void setIconSize(@InterfaceC0074Px int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f14532k != i) {
            this.f14532k = i;
            m4728j(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f14529h != colorStateList) {
            this.f14529h = colorStateList;
            m4728j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14528g != mode) {
            this.f14528g = mode;
            m4728j(false);
        }
    }

    public void setIconTintResource(@ColorRes int i) {
        setIconTint(ContextCompat.m12039b(getContext(), i));
    }

    public void setInsetBottom(@Dimension int i) {
        C7620a c7620a = this.f14525d;
        c7620a.m4716d(c7620a.f14563e, i);
    }

    public void setInsetTop(@Dimension int i) {
        C7620a c7620a = this.f14525d;
        c7620a.m4716d(i, c7620a.f14564f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable InterfaceC7612b interfaceC7612b) {
        this.f14527f = interfaceC7612b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC7612b interfaceC7612b = this.f14527f;
        if (interfaceC7612b != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.f14570l != colorStateList) {
                c7620a.f14570l = colorStateList;
                MaterialButton materialButton = c7620a.f14559a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C7781a.m4480a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        if (m4730d()) {
            setRippleColor(ContextCompat.m12039b(getContext(), i));
        }
    }

    @Override // com.google.android.material.shape.InterfaceC7813n
    public void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        if (!m4730d()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f14525d.m4717c(c7801j);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            c7620a.f14572n = z;
            c7620a.m4714f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.f14569k != colorStateList) {
                c7620a.f14569k = colorStateList;
                c7620a.m4714f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int i) {
        if (m4730d()) {
            setStrokeColor(ContextCompat.m12039b(getContext(), i));
        }
    }

    public void setStrokeWidth(@InterfaceC0074Px int i) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.f14566h != i) {
                c7620a.f14566h = i;
                c7620a.m4714f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        if (m4730d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.f14568j != colorStateList) {
                c7620a.f14568j = colorStateList;
                if (c7620a.m4718b(false) != null) {
                    C0700a.C0702b.m11924h(c7620a.m4718b(false), c7620a.f14568j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (m4730d()) {
            C7620a c7620a = this.f14525d;
            if (c7620a.f14567i != mode) {
                c7620a.f14567i = mode;
                if (c7620a.m4718b(false) != null && c7620a.f14567i != null) {
                    C0700a.C0702b.m11923i(c7620a.m4718b(false), c7620a.f14567i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m4727k(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f14525d.f14576r = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14536o);
    }
}
