package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.resources.C7774c;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* loaded from: classes3.dex */
class ClockFaceView extends C7907e implements ClockHandView.InterfaceC7901a {

    /* renamed from: A */
    public final float[] f15619A;

    /* renamed from: B */
    public final int f15620B;

    /* renamed from: C */
    public final int f15621C;

    /* renamed from: D */
    public final int f15622D;

    /* renamed from: E */
    public final int f15623E;

    /* renamed from: F */
    public String[] f15624F;

    /* renamed from: G */
    public float f15625G;

    /* renamed from: H */
    public final ColorStateList f15626H;

    /* renamed from: t */
    public final ClockHandView f15627t;

    /* renamed from: u */
    public final Rect f15628u;

    /* renamed from: v */
    public final RectF f15629v;

    /* renamed from: w */
    public final Rect f15630w;

    /* renamed from: x */
    public final SparseArray<TextView> f15631x;

    /* renamed from: y */
    public final C7905c f15632y;

    /* renamed from: z */
    public final int[] f15633z;

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f15628u = new Rect();
        this.f15629v = new RectF();
        this.f15630w = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f15631x = sparseArray;
        this.f15619A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14584d, R.attr.materialClockStyle, 2132018390);
        Resources resources = getResources();
        ColorStateList m4495a = C7774c.m4495a(context, obtainStyledAttributes, 1);
        this.f15626H = m4495a;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f15627t = clockHandView;
        this.f15620B = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = m4495a.getColorForState(new int[]{16842913}, m4495a.getDefaultColor());
        this.f15633z = new int[]{colorForState, colorForState, m4495a.getDefaultColor()};
        clockHandView.f15636c.add(this);
        int defaultColor = ContextCompat.m12039b(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList m4495a2 = C7774c.m4495a(context, obtainStyledAttributes, 0);
        setBackgroundColor(m4495a2 != null ? m4495a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC7904b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f15632y = new C7905c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f15624F = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f15624F.length, size); i++) {
            TextView textView = sparseArray.get(i);
            if (i >= this.f15624F.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f15624F[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                ViewCompat.m11771n(textView, this.f15632y);
                textView.setTextColor(this.f15626H);
            }
        }
        ClockHandView clockHandView2 = this.f15627t;
        if (clockHandView2.f15635b && !z) {
            clockHandView2.f15646m = 1;
        }
        clockHandView2.f15635b = z;
        clockHandView2.invalidate();
        this.f15621C = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f15622D = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f15623E = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC7901a
    /* renamed from: d */
    public final void mo4310d(float f) {
        if (Math.abs(this.f15625G - f) > 0.001f) {
            this.f15625G = f;
            m4314x();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f15624F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m4314x();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f15623E / Math.max(Math.max(this.f15621C / displayMetrics.heightPixels, this.f15622D / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.C7907e
    /* renamed from: w */
    public final void mo4306w() {
        super.mo4306w();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f15631x;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    /* renamed from: x */
    public final void m4314x() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        boolean z;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f15627t.f15640g;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f15631x;
            int size = sparseArray.size();
            rectF = this.f15629v;
            rect = this.f15628u;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f15630w);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f15633z, this.f15619A, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }
}
