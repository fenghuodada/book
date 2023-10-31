package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.core.widgets.C0514a;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0566b {

    /* renamed from: i */
    public int f1907i;

    /* renamed from: j */
    public int f1908j;

    /* renamed from: k */
    public C0514a f1909k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1909k.f1617v0;
    }

    public int getMargin() {
        return this.f1909k.f1618w0;
    }

    public int getType() {
        return this.f1907i;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: i */
    public final void mo12133i(AttributeSet attributeSet) {
        super.mo12133i(attributeSet);
        this.f1909k = new C0514a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2174b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1909k.f1617v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1909k.f1618w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2016d = this.f1909k;
        m12157k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12158j(androidx.constraintlayout.core.widgets.C0540f r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1907i
            r3.f1908j = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L14
        Lb:
            if (r0 != r1) goto L17
            goto L10
        Le:
            if (r0 != r2) goto L12
        L10:
            r5 = 0
            goto L15
        L12:
            if (r0 != r1) goto L17
        L14:
            r5 = 1
        L15:
            r3.f1908j = r5
        L17:
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.C0514a
            if (r5 == 0) goto L21
            androidx.constraintlayout.core.widgets.a r4 = (androidx.constraintlayout.core.widgets.C0514a) r4
            int r5 = r3.f1908j
            r4.f1616u0 = r5
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.mo12158j(androidx.constraintlayout.core.widgets.f, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1909k.f1617v0 = z;
    }

    public void setDpMargin(int i) {
        this.f1909k.f1618w0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1909k.f1618w0 = i;
    }

    public void setType(int i) {
        this.f1907i = i;
    }
}
