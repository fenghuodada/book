package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
/* renamed from: androidx.transition.a0 */
/* loaded from: classes.dex */
public class C1727a0 extends C1778y {

    /* renamed from: f */
    public static boolean f4221f = true;

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo9990f(@NonNull View view, int i, int i2, int i3, int i4) {
        if (f4221f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f4221f = false;
            }
        }
    }
}
