package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* renamed from: androidx.transition.d0 */
/* loaded from: classes.dex */
public final class C1743d0 extends C1740c0 {
    @Override // androidx.transition.C1740c0, androidx.transition.C1749e0
    /* renamed from: a */
    public final void mo9989a(int i, @NonNull View view) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.C1775v
    /* renamed from: b */
    public final float mo9953b(@NonNull View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // androidx.transition.C1775v
    /* renamed from: c */
    public final void mo9952c(float f, @NonNull View view) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.C1778y
    /* renamed from: d */
    public final void mo9949d(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.C1778y
    /* renamed from: e */
    public final void mo9948e(@NonNull View view, @NonNull Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.C1727a0
    /* renamed from: f */
    public final void mo9990f(@NonNull View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
