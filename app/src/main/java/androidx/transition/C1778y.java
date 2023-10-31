package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.transition.y */
/* loaded from: classes.dex */
public class C1778y extends C1775v {

    /* renamed from: d */
    public static boolean f4289d = true;

    /* renamed from: e */
    public static boolean f4290e = true;

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public void mo9949d(@NonNull View view, @NonNull Matrix matrix) {
        if (f4289d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4289d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo9948e(@NonNull View view, @NonNull Matrix matrix) {
        if (f4290e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4290e = false;
            }
        }
    }
}
