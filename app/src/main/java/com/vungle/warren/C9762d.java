package com.vungle.warren;

import com.vungle.warren.AdConfig;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.C9928h;

/* renamed from: com.vungle.warren.d */
/* loaded from: classes3.dex */
public final class C9762d implements C9928h.InterfaceC9942m<Placement> {

    /* renamed from: a */
    public final /* synthetic */ AdConfig.AdSize f19435a;

    /* renamed from: b */
    public final /* synthetic */ AdLoader f19436b;

    public C9762d(AdLoader adLoader, AdConfig.AdSize adSize) {
        this.f19436b = adLoader;
        this.f19435a = adSize;
    }

    @Override // com.vungle.warren.persistence.C9928h.InterfaceC9942m
    /* renamed from: a */
    public final void mo1373a(Placement placement) {
        Placement placement2 = placement;
        if (placement2 != null && placement2.m1458c() && placement2.f19777i == 1) {
            AdConfig.AdSize m1460a = placement2.m1460a();
            AdConfig.AdSize adSize = this.f19435a;
            if (m1460a != adSize) {
                placement2.f19778j = adSize;
                this.f19436b.f19272f.m1375x(placement2, null, false);
            }
        }
    }
}
