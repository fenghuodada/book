package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.view.c2 */
/* loaded from: classes.dex */
public final class C0902c2 {
    @DoNotInline
    /* renamed from: a */
    public static int m11516a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m11515b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11514c(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }
}
