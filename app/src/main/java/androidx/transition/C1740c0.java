package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: androidx.transition.c0 */
/* loaded from: classes.dex */
public class C1740c0 extends C1727a0 {

    /* renamed from: g */
    public static boolean f4239g = true;

    @Override // androidx.transition.C1749e0
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo9989a(int i, @NonNull View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo9989a(i, view);
        } else if (f4239g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f4239g = false;
            }
        }
    }
}
