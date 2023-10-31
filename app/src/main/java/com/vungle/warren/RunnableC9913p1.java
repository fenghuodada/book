package com.vungle.warren;

import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.p1 */
/* loaded from: classes3.dex */
public final class RunnableC9913p1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Vungle.RunnableC9721c.C9722a f19906a;

    public RunnableC9913p1(Vungle.RunnableC9721c.C9722a c9722a) {
        this.f19906a = c9722a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Vungle.RunnableC9721c.C9722a c9722a = this.f19906a;
        if (!c9722a.f19326a) {
            Vungle.renderAd(c9722a.f19327b, Vungle.RunnableC9721c.this.f19320d, c9722a.f19328c, c9722a.f19329d);
            return;
        }
        Vungle.RunnableC9721c runnableC9721c = Vungle.RunnableC9721c.this;
        Vungle.onPlayError(runnableC9721c.f19318b, runnableC9721c.f19320d, new VungleException(1));
    }
}
