package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
public final class C0302b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1109a;

    public C0302b(ActionBarContainer actionBarContainer) {
        this.f1109a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1109a;
        if (actionBarContainer.f799h) {
            Drawable drawable = actionBarContainer.f798g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f796e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f797f;
        if (drawable3 == null || !actionBarContainer.f800i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1109a;
        if (actionBarContainer.f799h) {
            if (actionBarContainer.f798g != null) {
                drawable = actionBarContainer.f796e;
            } else {
                return;
            }
        } else {
            drawable = actionBarContainer.f796e;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
