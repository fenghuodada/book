package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.fragment.app.strictmode.d */
/* loaded from: classes.dex */
public final class C1419d extends AbstractC1428m {
    @Nullable

    /* renamed from: b */
    public final ViewGroup f3361b;

    public C1419d(@NotNull Fragment fragment, @Nullable ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        this.f3361b = viewGroup;
    }
}
