package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0383m0;
import androidx.appcompat.widget.C0430x1;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.internal.C7764q;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C7774c;
import java.util.WeakHashMap;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.d0 */
/* loaded from: classes3.dex */
public final class C7867d0 extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f15489a;

    /* renamed from: b */
    public final C0383m0 f15490b;
    @Nullable

    /* renamed from: c */
    public CharSequence f15491c;

    /* renamed from: d */
    public final CheckableImageButton f15492d;

    /* renamed from: e */
    public ColorStateList f15493e;

    /* renamed from: f */
    public PorterDuff.Mode f15494f;

    /* renamed from: g */
    public int f15495g;
    @NonNull

    /* renamed from: h */
    public ImageView.ScaleType f15496h;

    /* renamed from: i */
    public View.OnLongClickListener f15497i;

    /* renamed from: j */
    public boolean f15498j;

    public C7867d0(TextInputLayout textInputLayout, C0430x1 c0430x1) {
        super(textInputLayout.getContext());
        CharSequence m12467k;
        this.f15489a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f15492d = checkableImageButton;
        C0383m0 c0383m0 = new C0383m0(getContext(), null);
        this.f15490b = c0383m0;
        if (C7774c.m4492d(getContext())) {
            C0963l.m11417g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f15497i;
        checkableImageButton.setOnClickListener(null);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
        this.f15497i = null;
        checkableImageButton.setOnLongClickListener(null);
        C7891v.m4336d(checkableImageButton, null);
        if (c0430x1.m12466l(67)) {
            this.f15493e = C7774c.m4494b(getContext(), c0430x1, 67);
        }
        if (c0430x1.m12466l(68)) {
            this.f15494f = C7764q.m4504b(c0430x1.m12470h(68, -1), null);
        }
        if (c0430x1.m12466l(64)) {
            m4383a(c0430x1.m12473e(64));
            if (c0430x1.m12466l(63) && checkableImageButton.getContentDescription() != (m12467k = c0430x1.m12467k(63))) {
                checkableImageButton.setContentDescription(m12467k);
            }
            checkableImageButton.setCheckable(c0430x1.m12477a(62, true));
        }
        int m12474d = c0430x1.m12474d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (m12474d >= 0) {
            if (m12474d != this.f15495g) {
                this.f15495g = m12474d;
                checkableImageButton.setMinimumWidth(m12474d);
                checkableImageButton.setMinimumHeight(m12474d);
            }
            if (c0430x1.m12466l(66)) {
                ImageView.ScaleType m4338b = C7891v.m4338b(c0430x1.m12470h(66, -1));
                this.f15496h = m4338b;
                checkableImageButton.setScaleType(m4338b);
            }
            c0383m0.setVisibility(8);
            c0383m0.setId(R.id.textinput_prefix_text);
            c0383m0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0817g.m11726f(c0383m0, 1);
            c0383m0.setTextAppearance(c0430x1.m12469i(58, 0));
            if (c0430x1.m12466l(59)) {
                c0383m0.setTextColor(c0430x1.m12476b(59));
            }
            CharSequence m12467k2 = c0430x1.m12467k(57);
            this.f15491c = TextUtils.isEmpty(m12467k2) ? null : m12467k2;
            c0383m0.setText(m12467k2);
            m4380d();
            addView(checkableImageButton);
            addView(c0383m0);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* renamed from: a */
    public final void m4383a(@Nullable Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15492d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f15493e;
            PorterDuff.Mode mode = this.f15494f;
            TextInputLayout textInputLayout = this.f15489a;
            C7891v.m4339a(textInputLayout, checkableImageButton, colorStateList, mode);
            m4382b(true);
            C7891v.m4337c(textInputLayout, checkableImageButton, this.f15493e);
            return;
        }
        m4382b(false);
        View.OnLongClickListener onLongClickListener = this.f15497i;
        checkableImageButton.setOnClickListener(null);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
        this.f15497i = null;
        checkableImageButton.setOnLongClickListener(null);
        C7891v.m4336d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: b */
    public final void m4382b(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.f15492d;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m4381c();
            m4380d();
        }
    }

    /* renamed from: c */
    public final void m4381c() {
        boolean z;
        EditText editText = this.f15489a.f15428d;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (this.f15492d.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            i = ViewCompat.C0815e.m11740f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
        ViewCompat.C0815e.m11735k(this.f15490b, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: d */
    public final void m4380d() {
        int i = (this.f15491c == null || this.f15498j) ? 8 : 0;
        setVisibility(this.f15492d.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f15490b.setVisibility(i);
        this.f15489a.m4393o();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4381c();
    }
}
