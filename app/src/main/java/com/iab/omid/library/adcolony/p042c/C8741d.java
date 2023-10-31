package com.iab.omid.library.adcolony.p042c;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.adcolony.p042c.InterfaceC8737a;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.walking.C8751b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.c.d */
/* loaded from: classes3.dex */
public final class C8741d implements InterfaceC8737a {

    /* renamed from: a */
    public final int[] f16622a = new int[2];

    @Override // com.iab.omid.library.adcolony.p042c.InterfaceC8737a
    /* renamed from: a */
    public final JSONObject mo3178a(View view) {
        if (view == null) {
            return C8742a.m3176a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f16622a;
        view.getLocationOnScreen(iArr);
        return C8742a.m3176a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.adcolony.p042c.InterfaceC8737a
    /* renamed from: a */
    public final void mo3177a(View view, JSONObject jSONObject, InterfaceC8737a.InterfaceC8738a interfaceC8738a, boolean z, boolean z2) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        if (z) {
            HashMap hashMap = new HashMap();
            while (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
                i++;
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                while (it2.hasNext()) {
                    ((C8751b) interfaceC8738a).m3164b((View) it2.next(), this, jSONObject, z2);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            ((C8751b) interfaceC8738a).m3164b(viewGroup.getChildAt(i), this, jSONObject, z2);
            i++;
        }
    }
}
