package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C0548m;

/* renamed from: androidx.constraintlayout.widget.k */
/* loaded from: classes.dex */
public abstract class AbstractC0584k extends AbstractC0566b {

    /* renamed from: i */
    public boolean f2185i;

    /* renamed from: j */
    public boolean f2186j;

    public AbstractC0584k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: g */
    public final void mo12134g(ConstraintLayout constraintLayout) {
        m12160f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: i */
    public void mo12133i(AttributeSet attributeSet) {
        super.mo12133i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2174b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f2185i = true;
                } else if (index == 22) {
                    this.f2186j = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: l */
    public void mo12132l(C0548m c0548m, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2185i || this.f2186j) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f2014b; i++) {
                    View view = constraintLayout.f1911a.get(this.f2013a[i]);
                    if (view != null) {
                        if (this.f2185i) {
                            view.setVisibility(visibility);
                        }
                        if (this.f2186j && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m12160f((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            m12160f((ConstraintLayout) parent);
        }
    }
}
