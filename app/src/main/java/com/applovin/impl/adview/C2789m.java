package com.applovin.impl.adview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.AbstractC2774i;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.applovin.impl.adview.m */
/* loaded from: classes.dex */
public class C2789m extends FrameLayout {

    /* renamed from: a */
    private AbstractC2774i f6656a;

    /* renamed from: b */
    private int f6657b;

    public C2789m(AbstractC2774i.EnumC2775a enumC2775a, Activity activity) {
        super(activity);
        setBackgroundColor(0);
        AbstractC2774i m8948a = AbstractC2774i.m8948a(enumC2775a, activity);
        this.f6656a = m8948a;
        addView(m8948a);
    }

    /* renamed from: a */
    public void m8917a(int i, int i2, int i3, int i4) {
        this.f6657b = i;
        int i5 = i2 + i + i3;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i5;
            layoutParams.width = i5;
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i, i4);
        layoutParams2.setMargins(i3, i3, i3, 0);
        this.f6656a.setLayoutParams(layoutParams2);
        this.f6656a.mo8886a(i);
    }

    /* renamed from: a */
    public void m8916a(AbstractC2774i.EnumC2775a enumC2775a) {
        if (enumC2775a == null || enumC2775a == this.f6656a.getStyle()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f6656a.getLayoutParams();
        removeView(this.f6656a);
        AbstractC2774i m8948a = AbstractC2774i.m8948a(enumC2775a, getContext());
        this.f6656a = m8948a;
        addView(m8948a);
        this.f6656a.setLayoutParams(layoutParams);
        this.f6656a.mo8886a(this.f6657b);
    }
}
