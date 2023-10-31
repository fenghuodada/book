package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0343f;
import androidx.concurrent.futures.C0484a;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.widget.C1045b;
import androidx.core.widget.C1046c;
import androidx.vectordrawable.graphics.drawable.AbstractC1782c;
import androidx.vectordrawable.graphics.drawable.C1781b;
import androidx.vectordrawable.graphics.drawable.C1783d;
import androidx.vectordrawable.graphics.drawable.C1787e;
import com.ambrose.overwall.R;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.material.color.C7661a;
import com.google.android.material.internal.C7764q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class MaterialCheckBox extends C0343f {
    @NonNull

    /* renamed from: e */
    public final LinkedHashSet<InterfaceC7637c> f14661e;
    @NonNull

    /* renamed from: f */
    public final LinkedHashSet<InterfaceC7636b> f14662f;
    @Nullable

    /* renamed from: g */
    public ColorStateList f14663g;

    /* renamed from: h */
    public boolean f14664h;

    /* renamed from: i */
    public boolean f14665i;

    /* renamed from: j */
    public boolean f14666j;
    @Nullable

    /* renamed from: k */
    public CharSequence f14667k;
    @Nullable

    /* renamed from: l */
    public Drawable f14668l;
    @Nullable

    /* renamed from: m */
    public Drawable f14669m;

    /* renamed from: n */
    public boolean f14670n;
    @Nullable

    /* renamed from: o */
    public ColorStateList f14671o;
    @Nullable

    /* renamed from: p */
    public ColorStateList f14672p;
    @NonNull

    /* renamed from: q */
    public PorterDuff.Mode f14673q;

    /* renamed from: r */
    public int f14674r;

    /* renamed from: s */
    public int[] f14675s;

    /* renamed from: t */
    public boolean f14676t;
    @Nullable

    /* renamed from: u */
    public CharSequence f14677u;
    @Nullable

    /* renamed from: v */
    public CompoundButton.OnCheckedChangeListener f14678v;
    @Nullable

    /* renamed from: w */
    public final C1783d f14679w;

    /* renamed from: x */
    public final C7635a f14680x;

    /* renamed from: y */
    public static final int[] f14659y = {R.attr.state_indeterminate};

    /* renamed from: z */
    public static final int[] f14660z = {R.attr.state_error};

    /* renamed from: A */
    public static final int[][] f14657A = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @SuppressLint({"DiscouragedApi"})

    /* renamed from: B */
    public static final int f14658B = Resources.getSystem().getIdentifier("btn_check_material_anim", AppIntroBaseFragmentKt.ARG_DRAWABLE, "android");

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface CheckedState {
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    /* loaded from: classes3.dex */
    public class C7635a extends AbstractC1782c {
        public C7635a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1782c
        /* renamed from: a */
        public final void mo4673a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f14671o;
            if (colorStateList != null) {
                C0700a.C0702b.m11924h(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1782c
        /* renamed from: b */
        public final void mo4672b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f14671o;
            if (colorStateList != null) {
                C0700a.C0702b.m11925g(drawable, colorStateList.getColorForState(materialCheckBox.f14675s, colorStateList.getDefaultColor()));
            }
        }
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7636b {
        /* renamed from: a */
        void m4671a();
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7637c {
        /* renamed from: a */
        void m4670a();
    }

    /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$d */
    /* loaded from: classes3.dex */
    public static class C7638d extends View.BaseSavedState {
        @NonNull
        public static final Parcelable.Creator<C7638d> CREATOR = new C7639a();

        /* renamed from: a */
        public int f14682a;

        /* renamed from: com.google.android.material.checkbox.MaterialCheckBox$d$a */
        /* loaded from: classes3.dex */
        public class C7639a implements Parcelable.Creator<C7638d> {
            @Override // android.os.Parcelable.Creator
            public final C7638d createFromParcel(Parcel parcel) {
                return new C7638d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C7638d[] newArray(int i) {
                return new C7638d[i];
            }
        }

        public C7638d(Parcel parcel) {
            super(parcel);
            this.f14682a = ((Integer) parcel.readValue(C7638d.class.getClassLoader())).intValue();
        }

        public C7638d(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.f14682a;
            if (i != 1) {
                if (i != 2) {
                    str = "unchecked";
                } else {
                    str = "indeterminate";
                }
            } else {
                str = "checked";
            }
            return C0484a.m12392a(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f14682a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCheckBox(android.content.Context r14, @androidx.annotation.Nullable android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private String getButtonStateDescription() {
        Resources resources;
        int i;
        int i2 = this.f14674r;
        if (i2 == 1) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_checked;
        } else if (i2 == 0) {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_unchecked;
        } else {
            resources = getResources();
            i = R.string.mtrl_checkbox_state_description_indeterminate;
        }
        return resources.getString(i);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f14663g == null) {
            int m4621a = C7661a.m4621a(R.attr.colorControlActivated, this);
            int m4621a2 = C7661a.m4621a(R.attr.colorError, this);
            int m4621a3 = C7661a.m4621a(R.attr.colorSurface, this);
            int m4621a4 = C7661a.m4621a(R.attr.colorOnSurface, this);
            this.f14663g = new ColorStateList(f14657A, new int[]{C7661a.m4618d(m4621a3, 1.0f, m4621a2), C7661a.m4618d(m4621a3, 1.0f, m4621a), C7661a.m4618d(m4621a3, 0.54f, m4621a4), C7661a.m4618d(m4621a3, 0.38f, m4621a4), C7661a.m4618d(m4621a3, 0.38f, m4621a4)});
        }
        return this.f14663g;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f14671o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: b */
    public final void m4674b() {
        int intrinsicHeight;
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1787e c1787e;
        Drawable drawable = this.f14668l;
        ColorStateList colorStateList3 = this.f14671o;
        PorterDuff.Mode m11267b = C1045b.m11267b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (m11267b != null) {
                C0700a.C0702b.m11923i(drawable, m11267b);
            }
        }
        this.f14668l = drawable;
        Drawable drawable2 = this.f14669m;
        ColorStateList colorStateList4 = this.f14672p;
        PorterDuff.Mode mode = this.f14673q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                C0700a.C0702b.m11923i(drawable2, mode);
            }
        }
        this.f14669m = drawable2;
        if (this.f14670n) {
            C1783d c1783d = this.f14679w;
            if (c1783d != null) {
                Drawable drawable3 = c1783d.f4319a;
                C7635a c7635a = this.f14680x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c7635a.f4303a == null) {
                        c7635a.f4303a = new C1781b(c7635a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c7635a.f4303a);
                }
                ArrayList<AbstractC1782c> arrayList = c1783d.f4308e;
                C1783d.C1785b c1785b = c1783d.f4305b;
                if (arrayList != null && c7635a != null) {
                    arrayList.remove(c7635a);
                    if (c1783d.f4308e.size() == 0 && (c1787e = c1783d.f4307d) != null) {
                        c1785b.f4312b.removeListener(c1787e);
                        c1783d.f4307d = null;
                    }
                }
                Drawable drawable4 = c1783d.f4319a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c7635a.f4303a == null) {
                        c7635a.f4303a = new C1781b(c7635a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c7635a.f4303a);
                } else if (c7635a != null) {
                    if (c1783d.f4308e == null) {
                        c1783d.f4308e = new ArrayList<>();
                    }
                    if (!c1783d.f4308e.contains(c7635a)) {
                        c1783d.f4308e.add(c7635a);
                        if (c1783d.f4307d == null) {
                            c1783d.f4307d = new C1787e(c1783d);
                        }
                        c1785b.f4312b.addListener(c1783d.f4307d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f14668l;
                if ((drawable5 instanceof AnimatedStateListDrawable) && c1783d != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c1783d, false);
                    ((AnimatedStateListDrawable) this.f14668l).addTransition(R.id.indeterminate, R.id.unchecked, c1783d, false);
                }
            }
        }
        Drawable drawable6 = this.f14668l;
        if (drawable6 != null && (colorStateList2 = this.f14671o) != null) {
            C0700a.C0702b.m11924h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f14669m;
        if (drawable7 != null && (colorStateList = this.f14672p) != null) {
            C0700a.C0702b.m11924h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f14668l;
        Drawable drawable9 = this.f14669m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            if (drawable9.getIntrinsicWidth() != -1 && drawable9.getIntrinsicHeight() != -1) {
                if (drawable9.getIntrinsicWidth() <= drawable8.getIntrinsicWidth() && drawable9.getIntrinsicHeight() <= drawable8.getIntrinsicHeight()) {
                    i = drawable9.getIntrinsicWidth();
                    intrinsicHeight = drawable9.getIntrinsicHeight();
                } else {
                    float intrinsicWidth = drawable9.getIntrinsicWidth() / drawable9.getIntrinsicHeight();
                    if (intrinsicWidth >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                        i = drawable8.getIntrinsicWidth();
                        intrinsicHeight = (int) (i / intrinsicWidth);
                    } else {
                        intrinsicHeight = drawable8.getIntrinsicHeight();
                        i = (int) (intrinsicWidth * intrinsicHeight);
                    }
                }
            } else {
                int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                intrinsicHeight = drawable8.getIntrinsicHeight();
                i = intrinsicWidth2;
            }
            layerDrawable.setLayerSize(1, i, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f14668l;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f14669m;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f14672p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f14673q;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f14671o;
    }

    public int getCheckedState() {
        return this.f14674r;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f14667k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f14674r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f14664h && this.f14671o == null && this.f14672p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f14659y);
        }
        if (this.f14666j) {
            View.mergeDrawableStates(onCreateDrawableState, f14660z);
        }
        int i2 = 0;
        while (true) {
            if (i2 < onCreateDrawableState.length) {
                int i3 = onCreateDrawableState[i2];
                if (i3 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                } else if (i3 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i2] = 16842912;
                    break;
                } else {
                    i2++;
                }
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f14675s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m11264a;
        int i;
        if (this.f14665i && TextUtils.isEmpty(getText()) && (m11264a = C1046c.m11264a(this)) != null) {
            if (C7764q.m4505a(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - m11264a.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = m11264a.getBounds();
                C0700a.C0702b.m11926f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f14666j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f14667k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C7638d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7638d c7638d = (C7638d) parcelable;
        super.onRestoreInstanceState(c7638d.getSuperState());
        setCheckedState(c7638d.f14682a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        C7638d c7638d = new C7638d(super.onSaveInstanceState());
        c7638d.f14682a = getCheckedState();
        return c7638d;
    }

    @Override // androidx.appcompat.widget.C0343f, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(C0158a.m12920a(getContext(), i));
    }

    @Override // androidx.appcompat.widget.C0343f, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f14668l = drawable;
        this.f14670n = false;
        m4674b();
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f14669m = drawable;
        m4674b();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i) {
        setButtonIconDrawable(C0158a.m12920a(getContext(), i));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f14672p == colorStateList) {
            return;
        }
        this.f14672p = colorStateList;
        m4674b();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f14673q == mode) {
            return;
        }
        this.f14673q = mode;
        m4674b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f14671o == colorStateList) {
            return;
        }
        this.f14671o = colorStateList;
        m4674b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m4674b();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f14665i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f14674r != i) {
            this.f14674r = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f14677u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f14676t) {
                return;
            }
            this.f14676t = true;
            LinkedHashSet<InterfaceC7636b> linkedHashSet = this.f14662f;
            if (linkedHashSet != null) {
                Iterator<InterfaceC7636b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m4671a();
                }
            }
            if (this.f14674r != 2 && (onCheckedChangeListener = this.f14678v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f14676t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f14667k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f14666j == z) {
            return;
        }
        this.f14666j = z;
        refreshDrawableState();
        Iterator<InterfaceC7637c> it = this.f14661e.iterator();
        while (it.hasNext()) {
            it.next().m4670a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14678v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f14677u = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f14664h = z;
        if (z) {
            colorStateList = getMaterialThemeColorsTintList();
        } else {
            colorStateList = null;
        }
        C1045b.m11266c(this, colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
