package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* renamed from: androidx.transition.r */
/* loaded from: classes.dex */
public final class C1769r {

    /* renamed from: a */
    public static boolean f4285a = true;

    /* renamed from: a */
    public static void m9957a(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (f4285a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f4285a = false;
            }
        }
    }
}
