package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.2M */
/* loaded from: assets/audience_network.dex */
public class C40512M extends C4804F9 {
    public C40512M(C5953Xy c5953Xy) {
        super(c5953Xy);
        setCarouselLayoutManager(c5953Xy);
    }

    @Nullable
    public C5596S9 getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C5596S9) {
            return (C5596S9) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.p036X.C4804F9
    public C6213cB getLayoutManager() {
        return (C6213cB) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C5953Xy c5953Xy) {
        C6213cB c6213cB = new C6213cB(c5953Xy, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c6213cB.A1V(true);
        }
        super.setLayoutManager(c6213cB);
    }

    @Override // com.facebook.ads.redexgen.p036X.C4804F9
    public void setLayoutManager(AbstractC41794T abstractC41794T) {
    }
}
