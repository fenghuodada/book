package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a */
    public boolean f2004a;

    public Guideline(Context context) {
        super(context);
        this.f2004a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2004a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f2004a = z;
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) getLayoutParams();
        if (this.f2004a && c0562a.f1952a == i) {
            return;
        }
        c0562a.f1952a = i;
        setLayoutParams(c0562a);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) getLayoutParams();
        if (this.f2004a && c0562a.f1954b == i) {
            return;
        }
        c0562a.f1954b = i;
        setLayoutParams(c0562a);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0562a c0562a = (ConstraintLayout.C0562a) getLayoutParams();
        if (this.f2004a && c0562a.f1956c == f) {
            return;
        }
        c0562a.f1956c = f;
        setLayoutParams(c0562a);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
