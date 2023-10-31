package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public final class C0426x extends SeekBar {

    /* renamed from: a */
    public final C0431y f1395a;

    public C0426x(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        C0413s1.m12501a(this, getContext());
        C0431y c0431y = new C0431y(this);
        this.f1395a = c0431y;
        c0431y.mo12463a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0431y c0431y = this.f1395a;
        Drawable drawable = c0431y.f1409e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = c0431y.f1408d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1395a.f1409e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1395a.m12461d(canvas);
    }
}
