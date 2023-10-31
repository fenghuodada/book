package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0343f;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.graphics.drawable.InterfaceC0710h;
import androidx.core.text.C0775a;
import androidx.core.text.C0795m;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.customview.widget.AbstractC1071a;
import com.ambrose.overwall.R;
import com.facebook.ads.AdError;
import com.google.android.material.animation.C7563h;
import com.google.android.material.chip.C7645d;
import com.google.android.material.internal.C7754j;
import com.google.android.material.internal.InterfaceC7748g;
import com.google.android.material.resources.AbstractC7778f;
import com.google.android.material.resources.C7775d;
import com.google.android.material.ripple.C7781a;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7813n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class Chip extends C0343f implements C7645d.InterfaceC7646a, InterfaceC7813n, Checkable {

    /* renamed from: w */
    public static final Rect f14683w = new Rect();

    /* renamed from: x */
    public static final int[] f14684x = {16842913};

    /* renamed from: y */
    public static final int[] f14685y = {16842911};
    @Nullable

    /* renamed from: e */
    public C7645d f14686e;
    @Nullable

    /* renamed from: f */
    public InsetDrawable f14687f;
    @Nullable

    /* renamed from: g */
    public RippleDrawable f14688g;
    @Nullable

    /* renamed from: h */
    public View.OnClickListener f14689h;
    @Nullable

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f14690i;

    /* renamed from: j */
    public boolean f14691j;

    /* renamed from: k */
    public boolean f14692k;

    /* renamed from: l */
    public boolean f14693l;

    /* renamed from: m */
    public boolean f14694m;

    /* renamed from: n */
    public boolean f14695n;

    /* renamed from: o */
    public int f14696o;
    @Dimension(unit = 1)

    /* renamed from: p */
    public int f14697p;
    @Nullable

    /* renamed from: q */
    public CharSequence f14698q;
    @NonNull

    /* renamed from: r */
    public final C7641b f14699r;

    /* renamed from: s */
    public boolean f14700s;

    /* renamed from: t */
    public final Rect f14701t;

    /* renamed from: u */
    public final RectF f14702u;

    /* renamed from: v */
    public final C7640a f14703v;

    /* renamed from: com.google.android.material.chip.Chip$a */
    /* loaded from: classes3.dex */
    public class C7640a extends AbstractC7778f {
        public C7640a() {
        }

        @Override // com.google.android.material.resources.AbstractC7778f
        /* renamed from: a */
        public final void mo4484a(int i) {
        }

        @Override // com.google.android.material.resources.AbstractC7778f
        /* renamed from: b */
        public final void mo4483b(@NonNull Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            C7645d c7645d = chip.f14686e;
            if (c7645d.f14723G0) {
                text = c7645d.f14718E;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            chip.requestLayout();
            chip.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    /* loaded from: classes3.dex */
    public class C7641b extends AbstractC1071a {
        public C7641b(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.AbstractC1071a
        /* renamed from: l */
        public final void mo4662l(@NonNull ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            Rect rect = Chip.f14683w;
            Chip chip = Chip.this;
            if (chip.m4667d()) {
                C7645d c7645d = chip.f14686e;
                if (c7645d != null && c7645d.f14729K) {
                    z = true;
                }
                if (z && chip.f14689h != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // androidx.customview.widget.AbstractC1071a
        /* renamed from: o */
        public final void mo4661o(int i, @NonNull C0874o c0874o) {
            AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
            String str = "";
            if (i == 1) {
                Chip chip = Chip.this;
                CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
                } else {
                    CharSequence text = chip.getText();
                    Context context = chip.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
                c0874o.m11556b(C0874o.C0875a.f2609e);
                accessibilityNodeInfo.setEnabled(chip.isEnabled());
                return;
            }
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.f14683w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f14702u;
        rectF.setEmpty();
        if (m4667d() && this.f14689h != null) {
            C7645d c7645d = this.f14686e;
            Rect bounds = c7645d.getBounds();
            rectF.setEmpty();
            if (c7645d.m4639U()) {
                float f = c7645d.f14748g0 + c7645d.f14747f0 + c7645d.f14733O + c7645d.f14746e0 + c7645d.f14745d0;
                if (C0700a.C0703c.m11922a(c7645d) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f14701t;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    @Nullable
    private C7775d getTextAppearance() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14755n0.f15118f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f14693l != z) {
            this.f14693l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f14692k != z) {
            this.f14692k = z;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.C7645d.InterfaceC7646a
    /* renamed from: a */
    public final void mo4625a() {
        m4668c(this.f14697p);
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: c */
    public final void m4668c(@Dimension int i) {
        int i2;
        this.f14697p = i;
        int i3 = 0;
        if (!this.f14695n) {
            InsetDrawable insetDrawable = this.f14687f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f14687f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = C7781a.f15157a;
                    m4665f();
                    return;
                }
                return;
            }
            int[] iArr2 = C7781a.f15157a;
            m4665f();
            return;
        }
        int max = Math.max(0, i - ((int) this.f14686e.f14769z));
        int max2 = Math.max(0, i - this.f14686e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f14687f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f14687f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = C7781a.f15157a;
                    m4665f();
                    return;
                }
                return;
            }
            int[] iArr4 = C7781a.f15157a;
            m4665f();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        int i4 = i3;
        if (this.f14687f != null) {
            Rect rect = new Rect();
            this.f14687f.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = C7781a.f15157a;
                m4665f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f14687f = new InsetDrawable((Drawable) this.f14686e, i2, i4, i2, i4);
        int[] iArr6 = C7781a.f15157a;
        m4665f();
    }

    /* renamed from: d */
    public final boolean m4667d() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            Drawable drawable = c7645d.f14730L;
            if (drawable != null) {
                if (drawable instanceof InterfaceC0710h) {
                    drawable = ((InterfaceC0710h) drawable).m11908b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f14700s
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            com.google.android.material.chip.Chip$b r0 = r10.f14699r
            android.view.accessibility.AccessibilityManager r1 = r0.f2755h
            boolean r2 = r1.isEnabled()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.f2760m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.f2760m = r7
            r0.m11232q(r7, r5)
            r0.m11232q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r9 = r8.m4667d()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = r3
            goto L5f
        L5e:
            r1 = r4
        L5f:
            int r6 = r0.f2760m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.f2760m = r1
            r0.m11232q(r1, r5)
            r0.m11232q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = r3
            goto L71
        L70:
            r0 = r4
        L71:
            if (r0 != 0) goto L7b
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
            goto L7b
        L7a:
            r3 = r4
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f14700s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C7641b c7641b = this.f14699r;
        c7641b.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && c7641b.m11235m(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = c7641b.f2759l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = Chip.this;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f14689h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f14700s) {
                                chip.f14699r.m11232q(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = c7641b.m11235m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = c7641b.m11235m(1, null);
            }
        }
        if (z && c7641b.f2759l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.C0343f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C7645d c7645d = this.f14686e;
        boolean z = false;
        if (c7645d != null && C7645d.m4631u(c7645d.f14730L)) {
            C7645d c7645d2 = this.f14686e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f14694m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f14693l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f14692k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f14694m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f14693l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f14692k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c7645d2.f14713B0, iArr)) {
                c7645d2.f14713B0 = iArr;
                if (c7645d2.m4639U()) {
                    z = c7645d2.m4629w(c7645d2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m4666e() {
        boolean z;
        boolean z2 = false;
        if (m4667d()) {
            C7645d c7645d = this.f14686e;
            if (c7645d != null && c7645d.f14729K) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f14689h != null) {
                ViewCompat.m11771n(this, this.f14699r);
                z2 = true;
                this.f14700s = z2;
            }
        }
        ViewCompat.m11771n(this, null);
        this.f14700s = z2;
    }

    /* renamed from: f */
    public final void m4665f() {
        this.f14688g = new RippleDrawable(C7781a.m4480a(this.f14686e.f14716D), getBackgroundDrawable(), null);
        C7645d c7645d = this.f14686e;
        if (c7645d.f14715C0) {
            c7645d.f14715C0 = false;
            c7645d.f14717D0 = null;
            c7645d.onStateChange(c7645d.getState());
        }
        RippleDrawable rippleDrawable = this.f14688g;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(this, rippleDrawable);
        m4664g();
    }

    /* renamed from: g */
    public final void m4664g() {
        C7645d c7645d;
        if (!TextUtils.isEmpty(getText()) && (c7645d = this.f14686e) != null) {
            int m4634r = (int) (c7645d.m4634r() + c7645d.f14748g0 + c7645d.f14745d0);
            C7645d c7645d2 = this.f14686e;
            int m4635q = (int) (c7645d2.m4635q() + c7645d2.f14741W + c7645d2.f14744Z);
            if (this.f14687f != null) {
                Rect rect = new Rect();
                this.f14687f.getPadding(rect);
                m4635q += rect.left;
                m4634r += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0815e.m11735k(this, m4635q, paddingTop, m4634r, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        boolean z;
        if (!TextUtils.isEmpty(this.f14698q)) {
            return this.f14698q;
        }
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14735Q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ViewParent parent = getParent();
            if (!(parent instanceof C7647e)) {
                return "android.widget.Button";
            }
            ((C7647e) parent).getClass();
            throw null;
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f14687f;
        return insetDrawable == null ? this.f14686e : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14737S;
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14738T;
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14767y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return Math.max(0.0f, c7645d.m4633s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f14686e;
    }

    public float getChipEndPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14748g0;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable;
        C7645d c7645d = this.f14686e;
        if (c7645d == null || (drawable = c7645d.f14722G) == null) {
            return null;
        }
        if (drawable instanceof InterfaceC0710h) {
            drawable = ((InterfaceC0710h) drawable).m11908b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14726I;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14724H;
        }
        return null;
    }

    public float getChipMinHeight() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14769z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14741W;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14712B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14714C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable;
        C7645d c7645d = this.f14686e;
        if (c7645d == null || (drawable = c7645d.f14730L) == null) {
            return null;
        }
        if (drawable instanceof InterfaceC0710h) {
            drawable = ((InterfaceC0710h) drawable).m11908b();
        }
        return drawable;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14734P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14747f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14733O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14746e0;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14732N;
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14721F0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@NonNull Rect rect) {
        if (this.f14700s) {
            C7641b c7641b = this.f14699r;
            if (c7641b.f2759l == 1 || c7641b.f2758k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Nullable
    public C7563h getHideMotionSpec() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14740V;
        }
        return null;
    }

    public float getIconEndPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14743Y;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14742X;
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14716D;
        }
        return null;
    }

    @NonNull
    public C7801j getShapeAppearanceModel() {
        return this.f14686e.f15183a.f15206a;
    }

    @Nullable
    public C7563h getShowMotionSpec() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14739U;
        }
        return null;
    }

    public float getTextEndPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14745d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            return c7645d.f14744Z;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m4663h() {
        TextPaint paint = getPaint();
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            paint.drawableState = c7645d.getState();
        }
        C7775d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m4487e(getContext(), paint, this.f14703v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7798g.m4461b(this, this.f14686e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f14684x);
        }
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14735Q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f14685y);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f14700s) {
            C7641b c7641b = this.f14699r;
            int i2 = c7641b.f2759l;
            if (i2 != Integer.MIN_VALUE) {
                c7641b.m11237j(i2);
            }
            if (z) {
                c7641b.m11235m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14735Q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C7647e) {
            C7647e c7647e = (C7647e) getParent();
            int i2 = -1;
            if (c7647e.f15089c) {
                i = 0;
                for (int i3 = 0; i3 < c7647e.getChildCount(); i3++) {
                    View childAt = c7647e.getChildAt(i3);
                    if (childAt instanceof Chip) {
                        if (c7647e.getChildAt(i3).getVisibility() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            continue;
                        } else if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0874o.C0876b.m11544a(i2, 1, i, 1, isChecked()).f2621a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @Nullable
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            systemIcon = PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
            return systemIcon;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f14696o != i) {
            this.f14696o = i;
            m4664g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f14692k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.f14692k
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f14689h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f14700s
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.f14699r
            r0.m11232q(r2, r2)
        L42:
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = r2
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f14698q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14688g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0343f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f14688g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0343f, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4628x(z);
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4628x(c7645d.f14749h0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        C7645d c7645d = this.f14686e;
        if (c7645d == null) {
            this.f14691j = z;
        } else if (c7645d.f14735Q) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4627y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4627y(C0158a.m12920a(c7645d.f14749h0, i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4626z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4626z(ContextCompat.m12039b(c7645d.f14749h0, i));
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4659A(c7645d.f14749h0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4659A(z);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14767y != colorStateList) {
            c7645d.f14767y = colorStateList;
            c7645d.onStateChange(c7645d.getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        ColorStateList m12039b;
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14767y != (m12039b = ContextCompat.m12039b(c7645d.f14749h0, i))) {
            c7645d.f14767y = m12039b;
            c7645d.onStateChange(c7645d.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4658B(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4658B(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull C7645d c7645d) {
        C7645d c7645d2 = this.f14686e;
        if (c7645d2 != c7645d) {
            if (c7645d2 != null) {
                c7645d2.f14719E0 = new WeakReference<>(null);
            }
            this.f14686e = c7645d;
            c7645d.f14723G0 = false;
            c7645d.f14719E0 = new WeakReference<>(this);
            m4668c(this.f14697p);
        }
    }

    public void setChipEndPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14748g0 != f) {
            c7645d.f14748g0 = f;
            c7645d.invalidateSelf();
            c7645d.m4630v();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float dimension = c7645d.f14749h0.getResources().getDimension(i);
            if (c7645d.f14748g0 != dimension) {
                c7645d.f14748g0 = dimension;
                c7645d.invalidateSelf();
                c7645d.m4630v();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4657C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4657C(C0158a.m12920a(c7645d.f14749h0, i));
        }
    }

    public void setChipIconSize(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4656D(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4656D(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4655E(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4655E(ContextCompat.m12039b(c7645d.f14749h0, i));
        }
    }

    public void setChipIconVisible(@BoolRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4654F(c7645d.f14749h0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4654F(z);
        }
    }

    public void setChipMinHeight(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14769z != f) {
            c7645d.f14769z = f;
            c7645d.invalidateSelf();
            c7645d.m4630v();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float dimension = c7645d.f14749h0.getResources().getDimension(i);
            if (c7645d.f14769z != dimension) {
                c7645d.f14769z = dimension;
                c7645d.invalidateSelf();
                c7645d.m4630v();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14741W != f) {
            c7645d.f14741W = f;
            c7645d.invalidateSelf();
            c7645d.m4630v();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float dimension = c7645d.f14749h0.getResources().getDimension(i);
            if (c7645d.f14741W != dimension) {
                c7645d.f14741W = dimension;
                c7645d.invalidateSelf();
                c7645d.m4630v();
            }
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4653G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4653G(ContextCompat.m12039b(c7645d.f14749h0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4652H(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4652H(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4651I(drawable);
        }
        m4666e();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        C0775a c0775a;
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14734P != charSequence) {
            String str = C0775a.f2475d;
            Locale locale = Locale.getDefault();
            int i = C0795m.f2499a;
            boolean z = true;
            if (C0795m.C0796a.m11797a(locale) != 1) {
                z = false;
            }
            if (z) {
                c0775a = C0775a.f2478g;
            } else {
                c0775a = C0775a.f2477f;
            }
            c7645d.f14734P = c0775a.m11820c(charSequence, c0775a.f2481c);
            c7645d.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4650J(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4650J(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(@DrawableRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4651I(C0158a.m12920a(c7645d.f14749h0, i));
        }
        m4666e();
    }

    public void setCloseIconSize(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4649K(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4649K(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4648L(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4648L(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4647M(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4647M(ContextCompat.m12039b(c7645d.f14749h0, i));
        }
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4646N(z);
        }
        m4666e();
    }

    @Override // androidx.appcompat.widget.C0343f, android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.C0343f, android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4468j(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f14686e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            C7645d c7645d = this.f14686e;
            if (c7645d != null) {
                c7645d.f14721F0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f14695n = z;
        m4668c(this.f14697p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@Nullable C7563h c7563h) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.f14740V = c7563h;
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.f14740V = C7563h.m4807a(c7645d.f14749h0, i);
        }
    }

    public void setIconEndPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4645O(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4645O(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4644P(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4644P(c7645d.f14749h0.getResources().getDimension(i));
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable InterfaceC7748g<Chip> interfaceC7748g) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f14686e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@InterfaceC0074Px int i) {
        super.setMaxWidth(i);
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.f14725H0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14690i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f14689h = onClickListener;
        m4666e();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4643Q(colorStateList);
        }
        if (!this.f14686e.f14715C0) {
            m4665f();
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4643Q(ContextCompat.m12039b(c7645d.f14749h0, i));
            if (!this.f14686e.f14715C0) {
                m4665f();
            }
        }
    }

    @Override // com.google.android.material.shape.InterfaceC7813n
    public void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        this.f14686e.setShapeAppearanceModel(c7801j);
    }

    public void setShowMotionSpec(@Nullable C7563h c7563h) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.f14739U = c7563h;
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.f14739U = C7563h.m4807a(c7645d.f14749h0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C7645d c7645d = this.f14686e;
        if (c7645d == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (c7645d.f14723G0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        C7645d c7645d2 = this.f14686e;
        if (c7645d2 != null && !TextUtils.equals(c7645d2.f14718E, charSequence)) {
            c7645d2.f14718E = charSequence;
            c7645d2.f14755n0.f15116d = true;
            c7645d2.invalidateSelf();
            c7645d2.m4630v();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4642R(new C7775d(c7645d.f14749h0, i));
        }
        m4663h();
    }

    public void setTextAppearance(@Nullable C7775d c7775d) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4642R(c7775d);
        }
        m4663h();
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14745d0 != f) {
            c7645d.f14745d0 = f;
            c7645d.invalidateSelf();
            c7645d.m4630v();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float dimension = c7645d.f14749h0.getResources().getDimension(i);
            if (c7645d.f14745d0 != dimension) {
                c7645d.f14745d0 = dimension;
                c7645d.invalidateSelf();
                c7645d.m4630v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            C7754j c7754j = c7645d.f14755n0;
            C7775d c7775d = c7754j.f15118f;
            if (c7775d != null) {
                c7775d.f15147k = applyDimension;
                c7754j.f15113a.setTextSize(applyDimension);
                c7645d.mo4512a();
            }
        }
        m4663h();
    }

    public void setTextStartPadding(float f) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null && c7645d.f14744Z != f) {
            c7645d.f14744Z = f;
            c7645d.invalidateSelf();
            c7645d.m4630v();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            float dimension = c7645d.f14749h0.getResources().getDimension(i);
            if (c7645d.f14744Z != dimension) {
                c7645d.f14744Z = dimension;
                c7645d.invalidateSelf();
                c7645d.m4630v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7645d c7645d = this.f14686e;
        if (c7645d != null) {
            c7645d.m4642R(new C7775d(c7645d.f14749h0, i));
        }
        m4663h();
    }
}
