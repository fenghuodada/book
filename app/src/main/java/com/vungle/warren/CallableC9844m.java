package com.vungle.warren;

import android.util.Pair;
import com.vungle.warren.AdConfig;
import com.vungle.warren.model.Placement;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.m */
/* loaded from: classes3.dex */
public final class CallableC9844m implements Callable<Pair<Boolean, Placement>> {

    /* renamed from: a */
    public final /* synthetic */ String f19675a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC9782e0 f19676b;

    /* renamed from: c */
    public final /* synthetic */ C10114v0 f19677c;

    /* renamed from: d */
    public final /* synthetic */ AdConfig.AdSize f19678d;

    /* renamed from: e */
    public final /* synthetic */ String f19679e;

    public CallableC9844m(String str, C9785f0 c9785f0, C10114v0 c10114v0, AdConfig.AdSize adSize, String str2) {
        this.f19675a = str;
        this.f19676b = c9785f0;
        this.f19677c = c10114v0;
        this.f19678d = adSize;
        this.f19679e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<java.lang.Boolean, com.vungle.warren.model.Placement> call() throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = com.vungle.warren.Vungle.isInitialized()
            java.lang.String r1 = "n"
            r2 = 0
            com.vungle.warren.e0 r3 = r10.f19676b
            java.lang.String r4 = r10.f19675a
            if (r0 != 0) goto L22
            int r0 = com.vungle.warren.C9888n.f19867a
            java.lang.String r0 = "Vungle is not initialized."
            android.util.Log.e(r1, r0)
            r0 = 9
            com.vungle.warren.C9888n.m1436c(r4, r3, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r2)
            goto Lea
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5 = 13
            if (r0 == 0) goto L36
            com.vungle.warren.C9888n.m1436c(r4, r3, r5)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r2)
            goto Lea
        L36:
            com.vungle.warren.v0 r0 = r10.f19677c
            java.lang.Class<com.vungle.warren.persistence.h> r6 = com.vungle.warren.persistence.C9928h.class
            java.lang.Object r0 = r0.m1232c(r6)
            com.vungle.warren.persistence.h r0 = (com.vungle.warren.persistence.C9928h) r0
            java.lang.Class<com.vungle.warren.model.Placement> r6 = com.vungle.warren.model.Placement.class
            com.vungle.warren.persistence.f r0 = r0.m1383p(r6, r4)
            java.lang.Object r0 = r0.get()
            com.vungle.warren.model.Placement r0 = (com.vungle.warren.model.Placement) r0
            if (r0 != 0) goto L5a
            com.vungle.warren.C9888n.m1436c(r4, r3, r5)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r1, r2)
            goto Lea
        L5a:
            com.vungle.warren.AdConfig$AdSize r2 = r10.f19678d
            boolean r5 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r2)
            if (r5 != 0) goto L71
            r1 = 30
            com.vungle.warren.C9888n.m1436c(r4, r3, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
        L6e:
            r0 = r1
            goto Lea
        L71:
            boolean r5 = com.vungle.warren.AdConfig.AdSize.isBannerAdSize(r2)
            if (r5 != 0) goto L7a
            java.lang.String r2 = "Invalid Ad Size. Cannot check loaded status of non banner size placements."
            goto L98
        L7a:
            android.content.Context r5 = com.vungle.warren.Vungle.appContext()
            if (r5 != 0) goto L83
            java.lang.String r2 = "Context is null"
            goto L98
        L83:
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L8c
            java.lang.String r2 = "PlacementId is null"
            goto L98
        L8c:
            java.lang.String r6 = r10.f19679e
            com.vungle.warren.model.admarkup.a r7 = com.vungle.warren.utility.C10078c.m1278a(r6)
            if (r6 == 0) goto L9d
            if (r7 != 0) goto L9d
            java.lang.String r2 = "Invalid AdMarkup"
        L98:
            android.util.Log.e(r1, r2)
            r1 = 0
            goto Ld3
        L9d:
            com.vungle.warren.v0 r1 = com.vungle.warren.C10114v0.m1234a(r5)
            java.lang.Class<com.vungle.warren.utility.h> r6 = com.vungle.warren.utility.InterfaceC10086h.class
            java.lang.Object r6 = r1.m1232c(r6)
            com.vungle.warren.utility.h r6 = (com.vungle.warren.utility.InterfaceC10086h) r6
            java.lang.Class<com.vungle.warren.utility.v> r8 = com.vungle.warren.utility.InterfaceC10107v.class
            java.lang.Object r1 = r1.m1232c(r8)
            com.vungle.warren.utility.v r1 = (com.vungle.warren.utility.InterfaceC10107v) r1
            com.vungle.warren.persistence.f r8 = new com.vungle.warren.persistence.f
            com.vungle.warren.utility.y r6 = r6.mo1249a()
            com.vungle.warren.l r9 = new com.vungle.warren.l
            r9.<init>(r5, r7, r4, r2)
            java.util.concurrent.Future r2 = r6.submit(r9)
            r8.<init>(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            long r5 = r1.mo1238a()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r1 = r8.get(r5, r1)
            boolean r1 = r2.equals(r1)
        Ld3:
            if (r1 != 0) goto Le2
            r1 = 10
            com.vungle.warren.C9888n.m1436c(r4, r3, r1)
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2, r0)
            goto L6e
        Le2:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            goto L6e
        Lea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.CallableC9844m.call():java.lang.Object");
    }
}
