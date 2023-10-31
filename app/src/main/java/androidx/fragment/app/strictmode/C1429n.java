package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.n */
/* loaded from: classes.dex */
public final class C1429n extends AbstractC1428m {
    @NotNull

    /* renamed from: b */
    public final ViewGroup f3363b;

    public C1429n(@NotNull Fragment fragment, @NotNull ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        this.f3363b = viewGroup;
    }
}
