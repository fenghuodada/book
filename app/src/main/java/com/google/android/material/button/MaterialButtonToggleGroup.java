package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C7758l;
import com.google.android.material.internal.C7764q;
import com.google.android.material.shape.C7792a;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7794c;
import com.google.android.material.theme.overlay.C7899a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f14540k = 0;

    /* renamed from: a */
    public final ArrayList f14541a;

    /* renamed from: b */
    public final C7619e f14542b;

    /* renamed from: c */
    public final LinkedHashSet<InterfaceC7618d> f14543c;

    /* renamed from: d */
    public final C7615a f14544d;

    /* renamed from: e */
    public Integer[] f14545e;

    /* renamed from: f */
    public boolean f14546f;

    /* renamed from: g */
    public boolean f14547g;

    /* renamed from: h */
    public boolean f14548h;
    @IdRes

    /* renamed from: i */
    public final int f14549i;

    /* renamed from: j */
    public HashSet f14550j;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes3.dex */
    public class C7615a implements Comparator<MaterialButton> {
        public C7615a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo == 0) {
                int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (compareTo2 == 0) {
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
                }
                return compareTo2;
            }
            return compareTo;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes3.dex */
    public class C7616b extends C0851a {
        public C7616b() {
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        public final void mo4308d(View view, @NonNull C0874o c0874o) {
            int i;
            this.f2597a.onInitializeAccessibilityNodeInfo(view, c0874o.f2606a);
            int i2 = MaterialButtonToggleGroup.f14540k;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i = 0;
                for (int i3 = 0; i3 < materialButtonToggleGroup.getChildCount(); i3++) {
                    if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.m4722d(i3)) {
                        i++;
                    }
                }
            }
            i = -1;
            c0874o.m11550h(C0874o.C0876b.m11544a(0, 1, i, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes3.dex */
    public static class C7617c {

        /* renamed from: e */
        public static final C7792a f14553e = new C7792a(0.0f);

        /* renamed from: a */
        public final InterfaceC7794c f14554a;

        /* renamed from: b */
        public final InterfaceC7794c f14555b;

        /* renamed from: c */
        public final InterfaceC7794c f14556c;

        /* renamed from: d */
        public final InterfaceC7794c f14557d;

        public C7617c(InterfaceC7794c interfaceC7794c, InterfaceC7794c interfaceC7794c2, InterfaceC7794c interfaceC7794c3, InterfaceC7794c interfaceC7794c4) {
            this.f14554a = interfaceC7794c;
            this.f14555b = interfaceC7794c3;
            this.f14556c = interfaceC7794c4;
            this.f14557d = interfaceC7794c2;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC7618d {
        /* renamed from: a */
        void mo4305a();
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes3.dex */
    public class C7619e implements MaterialButton.InterfaceC7612b {
        public C7619e() {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018330), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f14541a = new ArrayList();
        this.f14542b = new C7619e();
        this.f14543c = new LinkedHashSet<>();
        this.f14544d = new C7615a();
        this.f14546f = false;
        this.f14550j = new HashSet();
        TypedArray m4508d = C7758l.m4508d(getContext(), attributeSet, C7621c.f14591k, R.attr.materialButtonToggleGroupStyle, 2132018330, new int[0]);
        setSingleSelection(m4508d.getBoolean(3, false));
        this.f14549i = m4508d.getResourceId(1, -1);
        this.f14548h = m4508d.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m4508d.getBoolean(0, true));
        m4508d.recycle();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11746s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m4722d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m4722d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m4722d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            materialButton.setId(ViewCompat.C0815e.m11745a());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f14542b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m4725a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m4723c = m4723c(i);
            int min = Math.min(m4723c.getStrokeWidth(), m4723c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = m4723c.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                C0963l.m11417g(layoutParams, 0);
                C0963l.m11416h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                C0963l.m11416h(layoutParams, 0);
            }
            m4723c.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) m4723c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            C0963l.m11417g(layoutParams3, 0);
            C0963l.m11416h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m4724b(materialButton.getId(), materialButton.isChecked());
        C7801j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f14541a.add(new C7617c(shapeAppearanceModel.f15237e, shapeAppearanceModel.f15240h, shapeAppearanceModel.f15238f, shapeAppearanceModel.f15239g));
        materialButton.setEnabled(isEnabled());
        ViewCompat.m11771n(materialButton, new C7616b());
    }

    /* renamed from: b */
    public final void m4724b(@IdRes int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f14550j);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f14547g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.f14548h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m4721e(hashSet);
    }

    /* renamed from: c */
    public final MaterialButton m4723c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: d */
    public final boolean m4722d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f14544d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m4723c(i), Integer.valueOf(i));
        }
        this.f14545e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m4721e(Set<Integer> set) {
        HashSet hashSet = this.f14550j;
        this.f14550j = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = m4723c(i).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f14546f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f14546f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<InterfaceC7618d> it = this.f14543c.iterator();
                while (it.hasNext()) {
                    it.next().mo4305a();
                }
            }
        }
        invalidate();
    }

    @VisibleForTesting
    /* renamed from: f */
    public final void m4720f() {
        boolean z;
        C7617c c7617c;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m4723c = m4723c(i);
            if (m4723c.getVisibility() != 8) {
                C7801j shapeAppearanceModel = m4723c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C7801j.C7802a c7802a = new C7801j.C7802a(shapeAppearanceModel);
                C7617c c7617c2 = (C7617c) this.f14541a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C7792a c7792a = C7617c.f14553e;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (C7764q.m4505a(this)) {
                                c7617c = new C7617c(c7792a, c7792a, c7617c2.f14555b, c7617c2.f14556c);
                            } else {
                                c7617c = new C7617c(c7617c2.f14554a, c7617c2.f14557d, c7792a, c7792a);
                            }
                        } else {
                            c7617c = new C7617c(c7617c2.f14554a, c7792a, c7617c2.f14555b, c7792a);
                        }
                    } else if (i == lastVisibleChildIndex) {
                        if (z) {
                            if (C7764q.m4505a(this)) {
                                c7617c = new C7617c(c7617c2.f14554a, c7617c2.f14557d, c7792a, c7792a);
                            } else {
                                c7617c = new C7617c(c7792a, c7792a, c7617c2.f14555b, c7617c2.f14556c);
                            }
                        } else {
                            c7617c = new C7617c(c7792a, c7617c2.f14557d, c7792a, c7617c2.f14556c);
                        }
                    } else {
                        c7617c2 = null;
                    }
                    c7617c2 = c7617c;
                }
                if (c7617c2 == null) {
                    c7802a.f15249e = new C7792a(0.0f);
                    c7802a.f15250f = new C7792a(0.0f);
                    c7802a.f15251g = new C7792a(0.0f);
                    c7802a.f15252h = new C7792a(0.0f);
                } else {
                    c7802a.f15249e = c7617c2.f14554a;
                    c7802a.f15252h = c7617c2.f14557d;
                    c7802a.f15250f = c7617c2.f14555b;
                    c7802a.f15251g = c7617c2.f14556c;
                }
                m4723c.setShapeAppearanceModel(new C7801j(c7802a));
            }
        }
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f14547g || this.f14550j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f14550j.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = m4723c(i).getId();
            if (this.f14550j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f14545e;
        if (numArr == null || i2 >= numArr.length) {
            Log.w("MButtonToggleGroup", "Child order wasn't updated");
            return i2;
        }
        return numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f14549i;
        if (i != -1) {
            m4721e(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f14547g) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m4720f();
        m4725a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f14541a.remove(indexOfChild);
        }
        m4720f();
        m4725a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            m4723c(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f14548h = z;
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        Class cls;
        if (this.f14547g != z) {
            this.f14547g = z;
            m4721e(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            if (this.f14547g) {
                cls = RadioButton.class;
            } else {
                cls = ToggleButton.class;
            }
            m4723c(i).setA11yClassName(cls.getName());
        }
    }
}
