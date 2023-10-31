package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* renamed from: androidx.vectordrawable.graphics.drawable.e */
/* loaded from: classes.dex */
public final class C1787e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C1783d f4316a;

    public C1787e(C1783d c1783d) {
        this.f4316a = c1783d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1783d c1783d = this.f4316a;
        ArrayList arrayList = new ArrayList(c1783d.f4308e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1782c) arrayList.get(i)).mo4673a(c1783d);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C1783d c1783d = this.f4316a;
        ArrayList arrayList = new ArrayList(c1783d.f4308e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1782c) arrayList.get(i)).mo4672b(c1783d);
        }
    }
}
