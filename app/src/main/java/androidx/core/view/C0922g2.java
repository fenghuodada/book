package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.g2 */
/* loaded from: classes.dex */
public final class C0922g2 {

    /* renamed from: a */
    public final WeakReference<View> f2634a;

    @RequiresApi(19)
    /* renamed from: androidx.core.view.g2$a */
    /* loaded from: classes.dex */
    public static class C0923a {
        @DoNotInline
        /* renamed from: a */
        public static ViewPropertyAnimator m11468a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public C0922g2(View view) {
        this.f2634a = new WeakReference<>(view);
    }

    @NonNull
    /* renamed from: a */
    public final void m11473a(float f) {
        View view = this.f2634a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* renamed from: b */
    public final void m11472b() {
        View view = this.f2634a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    @NonNull
    /* renamed from: c */
    public final void m11471c(long j) {
        View view = this.f2634a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    @NonNull
    /* renamed from: d */
    public final void m11470d(@Nullable InterfaceC0928h2 interfaceC0928h2) {
        View view = this.f2634a.get();
        if (view != null) {
            if (interfaceC0928h2 != null) {
                view.animate().setListener(new C0917f2(interfaceC0928h2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    @NonNull
    /* renamed from: e */
    public final void m11469e(float f) {
        View view = this.f2634a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
