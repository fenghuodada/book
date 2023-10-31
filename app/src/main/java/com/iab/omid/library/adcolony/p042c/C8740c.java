package com.iab.omid.library.adcolony.p042c;

import android.view.View;
import com.iab.omid.library.adcolony.p043d.C8742a;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.c */
/* loaded from: classes3.dex */
public final class C8740c implements InterfaceC8737a {

    /* renamed from: a */
    public final InterfaceC8737a f16621a;

    public C8740c(C8741d c8741d) {
        this.f16621a = c8741d;
    }

    @Override // com.iab.omid.library.adcolony.p042c.InterfaceC8737a
    /* renamed from: a */
    public final JSONObject mo3178a(View view) {
        return C8742a.m3176a(0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    @Override // com.iab.omid.library.adcolony.p042c.InterfaceC8737a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3177a(android.view.View r7, org.json.JSONObject r8, com.iab.omid.library.adcolony.p042c.InterfaceC8737a.InterfaceC8738a r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.iab.omid.library.adcolony.b.a r10 = com.iab.omid.library.adcolony.p041b.C8728a.f16591c
            if (r10 == 0) goto L91
            java.util.ArrayList<com.iab.omid.library.adcolony.adsession.l> r10 = r10.f16593b
            java.util.Collection r10 = java.util.Collections.unmodifiableCollection(r10)
            int r0 = r10.size()
            int r0 = r0 * 2
            int r0 = r0 + 3
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L20:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r10.next()
            com.iab.omid.library.adcolony.adsession.l r0 = (com.iab.omid.library.adcolony.adsession.C8722l) r0
            com.iab.omid.library.adcolony.e.a r0 = r0.f16572d
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L20
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L3d
            goto L50
        L3d:
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L44
            goto L50
        L44:
            r2 = r0
        L45:
            if (r2 == 0) goto L5f
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L52
        L50:
            r2 = 0
            goto L60
        L52:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L5d
            android.view.View r2 = (android.view.View) r2
            goto L45
        L5d:
            r2 = 0
            goto L45
        L5f:
            r2 = 1
        L60:
            if (r2 == 0) goto L20
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L20
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L20
            r1.put(r0, r0)
            float r2 = r0.getZ()
            int r3 = r7.size()
        L79:
            if (r3 <= 0) goto L8d
            int r4 = r3 + (-1)
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            float r5 = r5.getZ()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L8d
            r3 = r4
            goto L79
        L8d:
            r7.add(r3, r0)
            goto L20
        L91:
            java.util.Iterator r7 = r7.iterator()
        L95:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r7.next()
            android.view.View r10 = (android.view.View) r10
            com.iab.omid.library.adcolony.c.a r0 = r6.f16621a
            r1 = r9
            com.iab.omid.library.adcolony.walking.b r1 = (com.iab.omid.library.adcolony.walking.C8751b) r1
            r1.m3164b(r10, r0, r8, r11)
            goto L95
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iab.omid.library.adcolony.p042c.C8740c.mo3177a(android.view.View, org.json.JSONObject, com.iab.omid.library.adcolony.c.a$a, boolean, boolean):void");
    }
}
