package com.iab.omid.library.adcolony.adsession;

import android.view.View;
import androidx.fragment.C1349a;

/* renamed from: com.iab.omid.library.adcolony.adsession.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8712b {
    /* renamed from: b */
    public static C8722l m3194b(C8713c c8713c, C8714d c8714d) {
        if (C1349a.f3312a.f16590a) {
            return new C8722l(c8713c, c8714d);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: a */
    public abstract void mo3191a(View view, EnumC8717g enumC8717g);
}
