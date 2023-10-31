package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;

/* renamed from: androidx.core.view.l0 */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0964l0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f2653a;

    /* renamed from: b */
    public ViewTreeObserver f2654b;

    /* renamed from: c */
    public final Runnable f2655c;

    public ViewTreeObserver$OnPreDrawListenerC0964l0(View view, Runnable runnable) {
        this.f2653a = view;
        this.f2654b = view.getViewTreeObserver();
        this.f2655c = runnable;
    }

    @NonNull
    /* renamed from: a */
    public static void m11415a(@NonNull View view, @NonNull Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserver$OnPreDrawListenerC0964l0 viewTreeObserver$OnPreDrawListenerC0964l0 = new ViewTreeObserver$OnPreDrawListenerC0964l0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0964l0);
        view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0964l0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f2654b.isAlive();
        View view = this.f2653a;
        if (isAlive) {
            viewTreeObserver = this.f2654b;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f2655c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        this.f2654b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NonNull View view) {
        boolean isAlive = this.f2654b.isAlive();
        View view2 = this.f2653a;
        (isAlive ? this.f2654b : view2.getViewTreeObserver()).removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
