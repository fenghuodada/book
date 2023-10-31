package com.iab.omid.library.applovin.p047c;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.p047c.InterfaceC8784a;
import com.iab.omid.library.applovin.p048d.C8790b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.c.d */
/* loaded from: classes3.dex */
public class C8788d implements InterfaceC8784a {

    /* renamed from: a */
    private final int[] f16726a = new int[2];

    /* renamed from: a */
    private void m3068a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC8784a.InterfaceC8785a interfaceC8785a, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            interfaceC8785a.mo2995a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    @TargetApi(21)
    /* renamed from: b */
    private void m3067b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC8784a.InterfaceC8785a interfaceC8785a, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC8785a.mo2995a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.applovin.p047c.InterfaceC8784a
    /* renamed from: a */
    public JSONObject mo3070a(View view) {
        if (view == null) {
            return C8790b.m3061a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f16726a);
        int[] iArr = this.f16726a;
        return C8790b.m3061a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.applovin.p047c.InterfaceC8784a
    /* renamed from: a */
    public void mo3069a(View view, JSONObject jSONObject, InterfaceC8784a.InterfaceC8785a interfaceC8785a, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m3067b(viewGroup, jSONObject, interfaceC8785a, z2);
            } else {
                m3068a(viewGroup, jSONObject, interfaceC8785a, z2);
            }
        }
    }
}
