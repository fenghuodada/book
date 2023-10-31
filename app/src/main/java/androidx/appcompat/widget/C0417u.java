package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.u */
/* loaded from: classes.dex */
public final class C0417u extends RatingBar {

    /* renamed from: a */
    public final C0411s f1389a;

    public C0417u(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        C0413s1.m12501a(this, getContext());
        C0411s c0411s = new C0411s(this);
        this.f1389a = c0411s;
        c0411s.mo12463a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1389a.f1377b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
