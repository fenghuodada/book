package com.google.android.exoplayer2;

import androidx.core.view.accessibility.InterfaceC0883s;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.exoplayer2.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C7122o implements C7417m.InterfaceC7418a, InterfaceC0883s {

    /* renamed from: b */
    public final /* synthetic */ int f12635b;

    /* renamed from: c */
    public final /* synthetic */ Object f12636c;

    public /* synthetic */ C7122o(Object obj, int i) {
        this.f12636c = obj;
        this.f12635b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // androidx.core.view.accessibility.InterfaceC0883s
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo4734a(android.view.View r5) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.f12636c
            com.google.android.material.sidesheet.SideSheetBehavior r5 = (com.google.android.material.sidesheet.SideSheetBehavior) r5
            r5.getClass()
            r0 = 1
            int r1 = r4.f12635b
            if (r1 == r0) goto L4d
            r2 = 2
            if (r1 != r2) goto L10
            goto L4d
        L10:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f15310o
            if (r2 == 0) goto L49
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L1b
            goto L49
        L1b:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r5.f15310o
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            com.google.android.material.sidesheet.d r3 = new com.google.android.material.sidesheet.d
            r3.<init>()
            android.view.ViewParent r5 = r2.getParent()
            if (r5 == 0) goto L3e
            boolean r5 = r5.isLayoutRequested()
            if (r5 == 0) goto L3e
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r5 = androidx.core.view.ViewCompat.f2518a
            boolean r5 = androidx.core.view.ViewCompat.C0817g.m11730b(r2)
            if (r5 == 0) goto L3e
            r5 = r0
            goto L3f
        L3e:
            r5 = 0
        L3f:
            if (r5 == 0) goto L45
            r2.post(r3)
            goto L4c
        L45:
            r3.run()
            goto L4c
        L49:
            r5.m4439t(r1)
        L4c:
            return r0
        L4d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r1 != r0) goto L5b
            java.lang.String r0 = "DRAGGING"
            goto L5d
        L5b:
            java.lang.String r0 = "SETTLING"
        L5d:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r0 = androidx.concurrent.futures.C0484a.m12392a(r2, r0, r1)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C7122o.mo4734a(android.view.View):boolean");
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onTimelineChanged(((C7508z0) this.f12636c).f14256a, this.f12635b);
    }
}
