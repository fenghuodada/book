package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.color.C7661a;
import com.google.android.material.ripple.C7781a;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7813n;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.button.a */
/* loaded from: classes3.dex */
public final class C7620a {

    /* renamed from: a */
    public final MaterialButton f14559a;
    @NonNull

    /* renamed from: b */
    public C7801j f14560b;

    /* renamed from: c */
    public int f14561c;

    /* renamed from: d */
    public int f14562d;

    /* renamed from: e */
    public int f14563e;

    /* renamed from: f */
    public int f14564f;

    /* renamed from: g */
    public int f14565g;

    /* renamed from: h */
    public int f14566h;
    @Nullable

    /* renamed from: i */
    public PorterDuff.Mode f14567i;
    @Nullable

    /* renamed from: j */
    public ColorStateList f14568j;
    @Nullable

    /* renamed from: k */
    public ColorStateList f14569k;
    @Nullable

    /* renamed from: l */
    public ColorStateList f14570l;
    @Nullable

    /* renamed from: m */
    public MaterialShapeDrawable f14571m;

    /* renamed from: q */
    public boolean f14575q;

    /* renamed from: s */
    public RippleDrawable f14577s;

    /* renamed from: t */
    public int f14578t;

    /* renamed from: n */
    public boolean f14572n = false;

    /* renamed from: o */
    public boolean f14573o = false;

    /* renamed from: p */
    public boolean f14574p = false;

    /* renamed from: r */
    public boolean f14576r = true;

    public C7620a(MaterialButton materialButton, @NonNull C7801j c7801j) {
        this.f14559a = materialButton;
        this.f14560b = c7801j;
    }

    @Nullable
    /* renamed from: a */
    public final InterfaceC7813n m4719a() {
        RippleDrawable rippleDrawable = this.f14577s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (InterfaceC7813n) (this.f14577s.getNumberOfLayers() > 2 ? this.f14577s.getDrawable(2) : this.f14577s.getDrawable(1));
    }

    @Nullable
    /* renamed from: b */
    public final MaterialShapeDrawable m4718b(boolean z) {
        RippleDrawable rippleDrawable = this.f14577s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f14577s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    /* renamed from: c */
    public final void m4717c(@NonNull C7801j c7801j) {
        this.f14560b = c7801j;
        if (m4718b(false) != null) {
            m4718b(false).setShapeAppearanceModel(c7801j);
        }
        if (m4718b(true) != null) {
            m4718b(true).setShapeAppearanceModel(c7801j);
        }
        if (m4719a() != null) {
            m4719a().setShapeAppearanceModel(c7801j);
        }
    }

    /* renamed from: d */
    public final void m4716d(@Dimension int i, @Dimension int i2) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        MaterialButton materialButton = this.f14559a;
        int m11740f = ViewCompat.C0815e.m11740f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int m11741e = ViewCompat.C0815e.m11741e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f14563e;
        int i4 = this.f14564f;
        this.f14564f = i2;
        this.f14563e = i;
        if (!this.f14573o) {
            m4715e();
        }
        ViewCompat.C0815e.m11735k(materialButton, m11740f, (paddingTop + i) - i3, m11741e, (paddingBottom + i2) - i4);
    }

    /* renamed from: e */
    public final void m4715e() {
        int i;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f14560b);
        MaterialButton materialButton = this.f14559a;
        materialShapeDrawable.m4469i(materialButton.getContext());
        C0700a.C0702b.m11924h(materialShapeDrawable, this.f14568j);
        PorterDuff.Mode mode = this.f14567i;
        if (mode != null) {
            C0700a.C0702b.m11923i(materialShapeDrawable, mode);
        }
        ColorStateList colorStateList = this.f14569k;
        materialShapeDrawable.f15183a.f15216k = this.f14566h;
        materialShapeDrawable.invalidateSelf();
        MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
        if (c7791b.f15209d != colorStateList) {
            c7791b.f15209d = colorStateList;
            materialShapeDrawable.onStateChange(materialShapeDrawable.getState());
        }
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f14560b);
        materialShapeDrawable2.setTint(0);
        float f = this.f14566h;
        if (this.f14572n) {
            i = C7661a.m4621a(R.attr.colorSurface, materialButton);
        } else {
            i = 0;
        }
        materialShapeDrawable2.f15183a.f15216k = f;
        materialShapeDrawable2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        MaterialShapeDrawable.C7791b c7791b2 = materialShapeDrawable2.f15183a;
        if (c7791b2.f15209d != valueOf) {
            c7791b2.f15209d = valueOf;
            materialShapeDrawable2.onStateChange(materialShapeDrawable2.getState());
        }
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f14560b);
        this.f14571m = materialShapeDrawable3;
        C0700a.C0702b.m11925g(materialShapeDrawable3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C7781a.m4480a(this.f14570l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f14561c, this.f14563e, this.f14562d, this.f14564f), this.f14571m);
        this.f14577s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable m4718b = m4718b(false);
        if (m4718b != null) {
            m4718b.m4468j(this.f14578t);
            m4718b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m4714f() {
        int i = 0;
        MaterialShapeDrawable m4718b = m4718b(false);
        MaterialShapeDrawable m4718b2 = m4718b(true);
        if (m4718b != null) {
            ColorStateList colorStateList = this.f14569k;
            m4718b.f15183a.f15216k = this.f14566h;
            m4718b.invalidateSelf();
            MaterialShapeDrawable.C7791b c7791b = m4718b.f15183a;
            if (c7791b.f15209d != colorStateList) {
                c7791b.f15209d = colorStateList;
                m4718b.onStateChange(m4718b.getState());
            }
            if (m4718b2 != null) {
                float f = this.f14566h;
                if (this.f14572n) {
                    i = C7661a.m4621a(R.attr.colorSurface, this.f14559a);
                }
                m4718b2.f15183a.f15216k = f;
                m4718b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                MaterialShapeDrawable.C7791b c7791b2 = m4718b2.f15183a;
                if (c7791b2.f15209d != valueOf) {
                    c7791b2.f15209d = valueOf;
                    m4718b2.onStateChange(m4718b2.getState());
                }
            }
        }
    }
}
