package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.transition.d */
/* loaded from: classes.dex */
public final class C1741d extends Visibility {

    /* renamed from: androidx.transition.d$a */
    /* loaded from: classes.dex */
    public static class C1742a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f4240a;

        /* renamed from: b */
        public boolean f4241b = false;

        public C1742a(View view) {
            this.f4240a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C1740c0 c1740c0 = C1770s.f4286a;
            View view = this.f4240a;
            c1740c0.mo9952c(1.0f, view);
            if (this.f4241b) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            View view = this.f4240a;
            if (ViewCompat.C0814d.m11757h(view) && view.getLayerType() == 0) {
                this.f4241b = true;
                view.setLayerType(2, null);
            }
        }
    }

    public C1741d() {
    }

    public C1741d(int i) {
        if ((i & (-4)) == 0) {
            this.f4208x = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: K */
    public final ObjectAnimator m9991K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1770s.f4286a.mo9952c(f, view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1770s.f4287b, f2);
        ofFloat.addListener(new C1742a(view));
        mo9974a(new C1739c(view));
        return ofFloat;
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public final void mo9970h(@NonNull C1766o c1766o) {
        m9999I(c1766o);
        c1766o.f4278a.put("android:fade:transitionAlpha", Float.valueOf(C1770s.f4286a.mo9953b(c1766o.f4279b)));
    }
}
