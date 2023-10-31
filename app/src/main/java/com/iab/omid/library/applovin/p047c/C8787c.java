package com.iab.omid.library.applovin.p047c;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.p047c.InterfaceC8784a;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8795f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.c.c */
/* loaded from: classes3.dex */
public class C8787c implements InterfaceC8784a {

    /* renamed from: a */
    private final InterfaceC8784a f16725a;

    public C8787c(InterfaceC8784a interfaceC8784a) {
        this.f16725a = interfaceC8784a;
    }

    @NonNull
    /* renamed from: a */
    public ArrayList<View> m3071a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C8775a m3126a = C8775a.m3126a();
        if (m3126a != null) {
            Collection<C8773a> m3122c = m3126a.m3122c();
            IdentityHashMap identityHashMap = new IdentityHashMap((m3122c.size() * 2) + 3);
            for (C8773a c8773a : m3122c) {
                View m3140e = c8773a.m3140e();
                if (m3140e != null && C8795f.m3026c(m3140e) && (rootView = m3140e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float m3028a = C8795f.m3028a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C8795f.m3028a(arrayList.get(size - 1)) > m3028a) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.p047c.InterfaceC8784a
    /* renamed from: a */
    public JSONObject mo3070a(View view) {
        return C8790b.m3061a(0, 0, 0, 0);
    }

    @Override // com.iab.omid.library.applovin.p047c.InterfaceC8784a
    /* renamed from: a */
    public void mo3069a(View view, JSONObject jSONObject, InterfaceC8784a.InterfaceC8785a interfaceC8785a, boolean z, boolean z2) {
        Iterator<View> it = m3071a().iterator();
        while (it.hasNext()) {
            interfaceC8785a.mo2995a(it.next(), this.f16725a, jSONObject, z2);
        }
    }
}
