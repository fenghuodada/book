package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.transition.v */
/* loaded from: classes.dex */
public class C1775v extends C1749e0 {

    /* renamed from: c */
    public static boolean f4288c = true;

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo9953b(@NonNull View view) {
        float transitionAlpha;
        if (f4288c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f4288c = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo9952c(float f, @NonNull View view) {
        if (f4288c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f4288c = false;
            }
        }
        view.setAlpha(f);
    }
}
