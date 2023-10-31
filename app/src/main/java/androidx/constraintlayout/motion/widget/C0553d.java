package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.C0554e;
import androidx.constraintlayout.widget.AbstractC0566b;
import androidx.constraintlayout.widget.C0582i;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.motion.widget.d */
/* loaded from: classes.dex */
public final class C0553d extends AbstractC0566b implements C0554e.InterfaceC0557c {

    /* renamed from: i */
    public boolean f1872i;

    /* renamed from: j */
    public boolean f1873j;

    /* renamed from: k */
    public float f1874k;

    /* renamed from: l */
    public View[] f1875l;

    @Override // androidx.constraintlayout.motion.widget.C0554e.InterfaceC0557c
    /* renamed from: a */
    public final void mo12184a() {
    }

    @Override // androidx.constraintlayout.motion.widget.C0554e.InterfaceC0557c
    /* renamed from: b */
    public final void mo12183b() {
    }

    public float getProgress() {
        return this.f1874k;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: i */
    public final void mo12133i(AttributeSet attributeSet) {
        super.mo12133i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2180h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f1872i = obtainStyledAttributes.getBoolean(index, this.f1872i);
                } else if (index == 0) {
                    this.f1873j = obtainStyledAttributes.getBoolean(index, this.f1873j);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.f1874k = f;
        int i = 0;
        if (this.f2014b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f2019g;
            if (viewArr == null || viewArr.length != this.f2014b) {
                this.f2019g = new View[this.f2014b];
            }
            for (int i2 = 0; i2 < this.f2014b; i2++) {
                this.f2019g[i2] = constraintLayout.f1911a.get(this.f2013a[i2]);
            }
            this.f1875l = this.f2019g;
            while (i < this.f2014b) {
                View view = this.f1875l[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof C0553d;
            i++;
        }
    }
}
