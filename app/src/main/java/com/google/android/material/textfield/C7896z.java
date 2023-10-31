package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0320d;
import androidx.appcompat.widget.C0334e1;
import androidx.appcompat.widget.C0407r;
import androidx.core.graphics.C0689a;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.internal.C7758l;
import com.google.android.material.resources.C7774c;
import com.google.android.material.theme.overlay.C7899a;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.textfield.z */
/* loaded from: classes3.dex */
public final class C7896z extends C0320d {
    @NonNull

    /* renamed from: e */
    public final C0334e1 f15604e;
    @Nullable

    /* renamed from: f */
    public final AccessibilityManager f15605f;
    @NonNull

    /* renamed from: g */
    public final Rect f15606g;
    @LayoutRes

    /* renamed from: h */
    public final int f15607h;

    /* renamed from: i */
    public final float f15608i;

    /* renamed from: j */
    public int f15609j;
    @Nullable

    /* renamed from: k */
    public ColorStateList f15610k;

    /* renamed from: com.google.android.material.textfield.z$a */
    /* loaded from: classes3.dex */
    public class C7897a<T> extends ArrayAdapter<String> {
        @Nullable

        /* renamed from: a */
        public ColorStateList f15611a;
        @Nullable

        /* renamed from: b */
        public ColorStateList f15612b;

        public C7897a(@NonNull Context context, int i, @NonNull String[] strArr) {
            super(context, i, strArr);
            m4324a();
        }

        /* renamed from: a */
        public final void m4324a() {
            boolean z;
            ColorStateList colorStateList;
            boolean z2;
            boolean z3;
            C7896z c7896z = C7896z.this;
            ColorStateList colorStateList2 = c7896z.f15610k;
            if (colorStateList2 != null) {
                z = true;
            } else {
                z = false;
            }
            ColorStateList colorStateList3 = null;
            if (!z) {
                colorStateList = null;
            } else {
                int[] iArr = {16842919};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            }
            this.f15612b = colorStateList;
            if (c7896z.f15609j != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (c7896z.f15610k != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int[] iArr2 = {16843623, -16842919};
                    int[] iArr3 = {16842913, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C0689a.m11971b(c7896z.f15610k.getColorForState(iArr3, 0), c7896z.f15609j), C0689a.m11971b(c7896z.f15610k.getColorForState(iArr2, 0), c7896z.f15609j), c7896z.f15609j});
                }
            }
            this.f15611a = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, @Nullable View view, ViewGroup viewGroup) {
            boolean z;
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C7896z c7896z = C7896z.this;
                RippleDrawable rippleDrawable = null;
                if (c7896z.getText().toString().contentEquals(textView.getText())) {
                    if (c7896z.f15609j != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ColorDrawable colorDrawable = new ColorDrawable(c7896z.f15609j);
                        if (this.f15612b != null) {
                            C0700a.C0702b.m11924h(colorDrawable, this.f15611a);
                            rippleDrawable = new RippleDrawable(this.f15612b, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11748q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public C7896z(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f15606g = new Rect();
        Context context2 = getContext();
        TypedArray m4508d = C7758l.m4508d(context2, attributeSet, C7621c.f14589i, R.attr.autoCompleteTextViewStyle, 2132018040, new int[0]);
        if (m4508d.hasValue(0) && m4508d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f15607h = m4508d.getResourceId(2, R.layout.mtrl_auto_complete_simple_item);
        this.f15608i = m4508d.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f15609j = m4508d.getColor(3, 0);
        this.f15610k = C7774c.m4495a(context2, m4508d, 4);
        this.f15605f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0334e1 c0334e1 = new C0334e1(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f15604e = c0334e1;
        c0334e1.f1220y = true;
        C0407r c0407r = c0334e1.f1221z;
        c0407r.setFocusable(true);
        c0334e1.f1210o = this;
        c0407r.setInputMethodMode(2);
        c0334e1.mo12645o(getAdapter());
        c0334e1.f1211p = new C7895y(this);
        if (m4508d.hasValue(5)) {
            setSimpleItems(m4508d.getResourceId(5, 0));
        }
        m4508d.recycle();
    }

    /* renamed from: a */
    public static void m4326a(C7896z c7896z, Object obj) {
        c7896z.setText(c7896z.convertSelectionToString(obj), false);
    }

    @Nullable
    /* renamed from: b */
    public final TextInputLayout m4325b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f15605f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f15604e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout m4325b = m4325b();
        if (m4325b != null && m4325b.f15404C) {
            return m4325b.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f15608i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f15609j;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f15610k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m4325b = m4325b();
        if (m4325b != null && m4325b.f15404C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15604e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int selectedItemPosition;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m4325b = m4325b();
            int i3 = 0;
            if (adapter != null && m4325b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0334e1 c0334e1 = this.f15604e;
                if (!c0334e1.mo12653a()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c0334e1.f1198c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m4325b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable m12650g = c0334e1.m12650g();
                if (m12650g != null) {
                    Rect rect = this.f15606g;
                    m12650g.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = m4325b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean z2;
        AccessibilityManager accessibilityManager = this.f15605f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t) {
        super.setAdapter(t);
        this.f15604e.mo12645o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0334e1 c0334e1 = this.f15604e;
        if (c0334e1 != null) {
            c0334e1.m12648j(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f15604e.f1212q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout m4325b = m4325b();
        if (m4325b != null) {
            m4325b.m4391q();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f15609j = i;
        if (getAdapter() instanceof C7897a) {
            ((C7897a) getAdapter()).m4324a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f15610k = colorStateList;
        if (getAdapter() instanceof C7897a) {
            ((C7897a) getAdapter()).m4324a();
        }
    }

    public void setSimpleItems(@ArrayRes int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new C7897a(getContext(), this.f15607h, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        boolean z;
        AccessibilityManager accessibilityManager = this.f15605f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f15604e.show();
        } else {
            super.showDropDown();
        }
    }
}
