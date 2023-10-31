package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
/* loaded from: classes.dex */
public final class C1647u extends AbstractC1612a0 {
    @Nullable

    /* renamed from: c */
    public C1644r f4005c;
    @Nullable

    /* renamed from: d */
    public C1643q f4006d;

    /* renamed from: c */
    public static int m10107c(@NonNull View view, AbstractC1645s abstractC1645s) {
        return ((abstractC1645s.mo10123c(view) / 2) + abstractC1645s.mo10121e(view)) - ((abstractC1645s.mo10114l() / 2) + abstractC1645s.mo10115k());
    }

    @Override // androidx.recyclerview.widget.AbstractC1612a0
    @Nullable
    /* renamed from: a */
    public final int[] mo10108a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo10232e()) {
            iArr[0] = m10107c(view, m10106d(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo10230f()) {
            iArr[1] = m10107c(view, m10105e(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @NonNull
    /* renamed from: d */
    public final AbstractC1645s m10106d(@NonNull RecyclerView.LayoutManager layoutManager) {
        C1643q c1643q = this.f4006d;
        if (c1643q == null || c1643q.f4001a != layoutManager) {
            this.f4006d = new C1643q(layoutManager);
        }
        return this.f4006d;
    }

    @NonNull
    /* renamed from: e */
    public final AbstractC1645s m10105e(@NonNull RecyclerView.LayoutManager layoutManager) {
        C1644r c1644r = this.f4005c;
        if (c1644r == null || c1644r.f4001a != layoutManager) {
            this.f4005c = new C1644r(layoutManager);
        }
        return this.f4005c;
    }
}
