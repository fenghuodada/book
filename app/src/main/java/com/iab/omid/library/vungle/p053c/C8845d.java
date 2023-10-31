package com.iab.omid.library.vungle.p053c;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.vungle.p053c.InterfaceC8841a;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.walking.C8855b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.c.d */
/* loaded from: classes3.dex */
public final class C8845d implements InterfaceC8841a {

    /* renamed from: a */
    public final int[] f16850a = new int[2];

    @Override // com.iab.omid.library.vungle.p053c.InterfaceC8841a
    /* renamed from: a */
    public final JSONObject mo2935a(View view) {
        if (view == null) {
            return C8846a.m2933a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.f16850a;
        view.getLocationOnScreen(iArr);
        return C8846a.m2933a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.vungle.p053c.InterfaceC8841a
    /* renamed from: a */
    public final void mo2934a(View view, JSONObject jSONObject, InterfaceC8841a.InterfaceC8842a interfaceC8842a, boolean z) {
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
                    ((C8855b) interfaceC8842a).m2922b((View) it2.next(), this, jSONObject);
                }
            }
            return;
        }
        while (i < viewGroup.getChildCount()) {
            ((C8855b) interfaceC8842a).m2922b(viewGroup.getChildAt(i), this, jSONObject);
            i++;
        }
    }
}
