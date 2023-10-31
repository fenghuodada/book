package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.os.SystemClock;
import android.view.OrientationEventListener;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6Y */
/* loaded from: assets/audience_network.dex */
public final class C43076Y {
    @Nullable
    public static OrientationEventListener A02;
    public final C43056W A00;
    public final EnumC43346z A01;

    public C43076Y(C43056W c43056w, EnumC43346z enumC43346z) {
        this.A00 = c43056w;
        this.A01 = enumC43346z;
    }

    public final synchronized void A01() {
        if (A02 != null) {
            A02.disable();
            A02 = null;
        }
    }

    public final synchronized void A02(final Context context) {
        final C434378 c434378;
        if (A02 != null) {
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String packageName = context == null ? "" : context.getPackageName();
        if (this.A01 == EnumC43346z.A0G) {
            c434378 = null;
        } else {
            c434378 = new C434378(packageName);
        }
        A02 = new OrientationEventListener(context, 3) { // from class: com.facebook.ads.redexgen.X.6X
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                C43056W c43056w;
                C5965YA c5965ya = new C5965YA(elapsedRealtime, c434378, i);
                c43056w = C43076Y.this.A00;
                c43056w.A02(c5965ya, EnumC43046V.A0A);
            }
        };
        A02.enable();
    }
}
