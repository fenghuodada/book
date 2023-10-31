package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0546k;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.b */
/* loaded from: classes.dex */
public abstract class AbstractC0566b extends View {

    /* renamed from: a */
    public int[] f2013a;

    /* renamed from: b */
    public int f2014b;

    /* renamed from: c */
    public final Context f2015c;

    /* renamed from: d */
    public C0546k f2016d;

    /* renamed from: e */
    public String f2017e;

    /* renamed from: f */
    public String f2018f;

    /* renamed from: g */
    public View[] f2019g;

    /* renamed from: h */
    public final HashMap<Integer, String> f2020h;

    public AbstractC0566b(Context context) {
        super(context);
        this.f2013a = new int[32];
        this.f2019g = null;
        this.f2020h = new HashMap<>();
        this.f2015c = context;
        mo12133i(null);
    }

    public AbstractC0566b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2013a = new int[32];
        this.f2019g = null;
        this.f2020h = new HashMap<>();
        this.f2015c = context;
        mo12133i(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12163c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f2015c
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1923m
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f1923m
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.m12159h(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<androidx.constraintlayout.widget.h> r1 = androidx.constraintlayout.widget.C0581h.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.f2020h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m12162d(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.AbstractC0566b.m12163c(java.lang.String):void");
    }

    /* renamed from: d */
    public final void m12162d(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f2014b + 1;
        int[] iArr = this.f2013a;
        if (i2 > iArr.length) {
            this.f2013a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2013a;
        int i3 = this.f2014b;
        iArr2[i3] = i;
        this.f2014b = i3 + 1;
    }

    /* renamed from: e */
    public final void m12161e(String str) {
        if (str == null || str.length() == 0 || this.f2015c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.C0562a) && trim.equals(((ConstraintLayout.C0562a) layoutParams).f1950Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m12162d(childAt.getId());
                }
            }
        }
    }

    /* renamed from: f */
    public final void m12160f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f2014b; i++) {
            View view = constraintLayout.f1911a.get(this.f2013a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo12134g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2013a, this.f2014b);
    }

    /* renamed from: h */
    public final int m12159h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f2015c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: i */
    public void mo12133i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2174b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2017e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2018f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public void mo12158j(C0540f c0540f, boolean z) {
    }

    /* renamed from: k */
    public final void m12157k() {
        if (this.f2016d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0562a) {
            ((ConstraintLayout.C0562a) layoutParams).f1985q0 = this.f2016d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2017e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2018f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2017e = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2014b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m12163c(str.substring(i));
                return;
            } else {
                m12163c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2018f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f2014b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m12161e(str.substring(i));
                return;
            } else {
                m12161e(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2017e = null;
        this.f2014b = 0;
        for (int i : iArr) {
            m12162d(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f2017e == null) {
            m12162d(i);
        }
    }
}
