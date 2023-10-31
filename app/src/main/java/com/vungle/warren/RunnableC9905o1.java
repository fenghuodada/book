package com.vungle.warren;

import com.vungle.warren.Vungle;
import com.vungle.warren.network.C9901e;

/* renamed from: com.vungle.warren.o1 */
/* loaded from: classes3.dex */
public final class RunnableC9905o1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C9901e f19892a;

    /* renamed from: b */
    public final /* synthetic */ Vungle.RunnableC9721c.C9722a f19893b;

    public RunnableC9905o1(Vungle.RunnableC9721c.C9722a c9722a, C9901e c9901e) {
        this.f19893b = c9722a;
        this.f19892a = c9901e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.String r0 = "Vungle#playAd"
            com.vungle.warren.network.e r1 = r6.f19892a
            boolean r2 = r1.m1430a()
            com.vungle.warren.Vungle$c$a r3 = r6.f19893b
            r4 = 0
            if (r2 == 0) goto L70
            T r1 = r1.f19883b
            com.google.gson.r r1 = (com.google.gson.C8695r) r1
            if (r1 == 0) goto L70
            java.lang.String r2 = "ad"
            boolean r5 = r1.m3219A(r2)
            if (r5 == 0) goto L70
            com.google.gson.r r1 = r1.m3211z(r2)     // Catch: java.lang.Exception -> L42 java.lang.IllegalArgumentException -> L62
            com.vungle.warren.model.Advertisement r2 = new com.vungle.warren.model.Advertisement     // Catch: java.lang.Exception -> L42 java.lang.IllegalArgumentException -> L62
            r2.<init>(r1)     // Catch: java.lang.Exception -> L42 java.lang.IllegalArgumentException -> L62
            com.vungle.warren.Vungle$c r1 = com.vungle.warren.Vungle.RunnableC9721c.this     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            com.vungle.warren.AdConfig r1 = r1.f19322f     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            if (r1 != 0) goto L2f
            com.vungle.warren.AdConfig r1 = new com.vungle.warren.AdConfig     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            r1.<init>()     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
        L2f:
            r2.f19757v = r1     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            com.vungle.warren.Vungle$c r1 = com.vungle.warren.Vungle.RunnableC9721c.this     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            com.vungle.warren.persistence.h r4 = r1.f19321e     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            java.lang.String r1 = r1.f19318b     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            r5 = 0
            r4.m1374y(r2, r1, r5)     // Catch: java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L40
            r4 = r2
            goto L70
        L3d:
            r1 = move-exception
            r4 = r2
            goto L43
        L40:
            r4 = r2
            goto L62
        L42:
            r1 = move-exception
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "streaming ads Exception :"
            r2.<init>(r5)
            java.lang.String r5 = r1.getLocalizedMessage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.vungle.warren.VungleLogger.m1603c(r0, r2)
            java.lang.String r0 = com.vungle.warren.Vungle.access$1500()
            java.lang.String r2 = "Error using will_play_ad!"
            android.util.Log.e(r0, r2, r1)
            goto L70
        L62:
            java.lang.String r1 = "streaming ads IllegalArgumentException"
            com.vungle.warren.VungleLogger.m1604b(r0, r1)
            java.lang.String r0 = com.vungle.warren.Vungle.access$1500()
            java.lang.String r1 = "Will Play Ad did not respond with a replacement. Move on."
            android.util.Log.v(r0, r1)
        L70:
            boolean r0 = r3.f19326a
            com.vungle.warren.model.Placement r1 = r3.f19328c
            com.vungle.warren.AdRequest r2 = r3.f19327b
            com.vungle.warren.Vungle$c r5 = com.vungle.warren.Vungle.RunnableC9721c.this
            if (r0 == 0) goto L90
            if (r4 != 0) goto L8a
            java.lang.String r0 = r5.f19318b
            com.vungle.warren.error.VungleException r1 = new com.vungle.warren.error.VungleException
            r2 = 1
            r1.<init>(r2)
            com.vungle.warren.e0 r2 = r5.f19320d
            com.vungle.warren.Vungle.access$1600(r0, r2, r1)
            goto L97
        L8a:
            com.vungle.warren.e0 r0 = r5.f19320d
            com.vungle.warren.Vungle.access$1800(r2, r0, r1, r4)
            goto L97
        L90:
            com.vungle.warren.e0 r0 = r5.f19320d
            com.vungle.warren.model.Advertisement r3 = r3.f19329d
            com.vungle.warren.Vungle.access$1800(r2, r0, r1, r3)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.RunnableC9905o1.run():void");
    }
}
