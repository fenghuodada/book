package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
/* loaded from: classes.dex */
public final class C1781b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1782c f4302a;

    public C1781b(AbstractC1782c abstractC1782c) {
        this.f4302a = abstractC1782c;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f4302a.mo4673a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f4302a.mo4672b(drawable);
    }
}
