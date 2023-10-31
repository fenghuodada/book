package com.adcolony.sdk;

import android.content.Context;
import androidx.constraintlayout.motion.widget.C0561g;
import androidx.datastore.preferences.protobuf.C1169e;
import androidx.fragment.C1349a;
import com.iab.omid.library.adcolony.adsession.C8720j;

/* renamed from: com.adcolony.sdk.x2 */
/* loaded from: classes.dex */
public final class RunnableC2361x2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5679a;

    public RunnableC2361x2(C2058b3 c2058b3) {
        this.f5679a = c2058b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = C2201m0.f5363a;
        C2058b3 c2058b3 = this.f5679a;
        if (!c2058b3.f4969K && context != null) {
            try {
                C1349a.m10609b(context.getApplicationContext());
                c2058b3.f4969K = true;
            } catch (IllegalArgumentException unused) {
                C1169e.m11129c("IllegalArgumentException when activating Omid", 0, 0, true);
                c2058b3.f4969K = false;
            }
        }
        if (c2058b3.f4969K && c2058b3.f4973O == null) {
            try {
                C0561g.m12181b("AdColony", "Name is null or empty");
                C0561g.m12181b("4.8.0", "Version is null or empty");
                c2058b3.f4973O = new C8720j();
            } catch (IllegalArgumentException unused2) {
                C1169e.m11129c("IllegalArgumentException when creating Omid Partner", 0, 0, true);
                c2058b3.f4969K = false;
            }
        }
    }
}
