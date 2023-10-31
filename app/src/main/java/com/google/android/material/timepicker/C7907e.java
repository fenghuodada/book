package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.C0570d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.shape.C7799h;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.timepicker.e */
/* loaded from: classes3.dex */
public class C7907e extends ConstraintLayout {

    /* renamed from: q */
    public final RunnableC7906d f15653q;

    /* renamed from: r */
    public int f15654r;

    /* renamed from: s */
    public MaterialShapeDrawable f15655s;

    public C7907e(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.material.timepicker.d] */
    public C7907e(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f15655s = materialShapeDrawable;
        C7799h c7799h = new C7799h(0.5f);
        C7801j c7801j = materialShapeDrawable.f15183a.f15206a;
        c7801j.getClass();
        C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
        c7802a.f15249e = c7799h;
        c7802a.f15250f = c7799h;
        c7802a.f15251g = c7799h;
        c7802a.f15252h = c7799h;
        materialShapeDrawable.setShapeAppearanceModel(new C7801j(c7802a));
        this.f15655s.m4467k(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f15655s;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(this, materialShapeDrawable2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14600t, i, 0);
        this.f15654r = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f15653q = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                C7907e.this.mo4306w();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            view.setId(ViewCompat.C0815e.m11745a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC7906d runnableC7906d = this.f15653q;
            handler.removeCallbacks(runnableC7906d);
            handler.post(runnableC7906d);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo4306w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC7906d runnableC7906d = this.f15653q;
            handler.removeCallbacks(runnableC7906d);
            handler.post(runnableC7906d);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(@ColorInt int i) {
        this.f15655s.m4467k(ColorStateList.valueOf(i));
    }

    /* renamed from: w */
    public void mo4306w() {
        int i;
        C0570d c0570d = new C0570d();
        c0570d.m12152c(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(this.f15654r * 0.66f);
            } else {
                i = this.f15654r;
            }
            float f = 0.0f;
            for (View view : list) {
                int id = view.getId();
                HashMap<Integer, C0570d.C0571a> hashMap2 = c0570d.f2041c;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new C0570d.C0571a());
                }
                C0570d.C0573b c0573b = hashMap2.get(Integer.valueOf(id)).f2045d;
                c0573b.f2127z = R.id.circle_center;
                c0573b.f2061A = i;
                c0573b.f2062B = f;
                f += 360.0f / list.size();
            }
        }
        c0570d.m12154a(this);
    }
}
