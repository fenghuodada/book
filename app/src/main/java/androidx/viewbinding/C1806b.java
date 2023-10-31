package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

/* renamed from: androidx.viewbinding.b */
/* loaded from: classes.dex */
public final class C1806b {
    @Nullable
    /* renamed from: a */
    public static View m9912a(@IdRes int i, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View findViewById = viewGroup.getChildAt(i2).findViewById(i);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }
}
