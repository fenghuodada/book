package com.vungle.warren.model.admarkup;

import androidx.annotation.NonNull;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8695r;
import com.google.gson.C8699t;
import com.vungle.warren.model.Advertisement;

/* renamed from: com.vungle.warren.model.admarkup.c */
/* loaded from: classes3.dex */
public final class C9855c extends AbstractC9853a {

    /* renamed from: b */
    public final String f19811b;

    /* renamed from: c */
    public final String f19812c;

    public C9855c(C8695r c8695r, String[] strArr) {
        this.f19809a = strArr;
        AbstractC8692o m3222t = c8695r.m3212y("ads").m3222t(0);
        this.f19812c = m3222t.m3220n().m3213w("placement_reference_id").mo3202p();
        this.f19811b = m3222t.m3220n().toString();
    }

    @Override // com.vungle.warren.model.admarkup.AbstractC9853a
    /* renamed from: a */
    public final String mo1452a() {
        return m1450c().getId();
    }

    @Override // com.vungle.warren.model.admarkup.AbstractC9853a
    /* renamed from: b */
    public final int mo1451b() {
        return 2;
    }

    @NonNull
    /* renamed from: c */
    public final Advertisement m1450c() {
        Advertisement advertisement = new Advertisement(C8699t.m3209b(this.f19811b).m3220n());
        advertisement.f19726N = this.f19812c;
        advertisement.f19724L = true;
        return advertisement;
    }
}
