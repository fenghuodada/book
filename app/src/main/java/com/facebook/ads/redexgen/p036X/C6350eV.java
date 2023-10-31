package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.eV */
/* loaded from: assets/audience_network.dex */
public class C6350eV<ModelType, StateType> {
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    @Nullable
    public List<InterfaceC6352eX<ModelType, StateType>> A01 = null;
    public C6349eU A00 = C6349eU.A06;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public C6350eV(ModelType modeltype, StateType statetype, String str) {
        this.A02 = modeltype;
        this.A03 = statetype;
        this.A04 = str;
    }

    public static /* synthetic */ C6349eU A00(C6350eV c6350eV) {
        return c6350eV.A00;
    }

    public static /* synthetic */ Object A01(C6350eV c6350eV) {
        return c6350eV.A02;
    }

    public static /* synthetic */ Object A02(C6350eV c6350eV) {
        return c6350eV.A03;
    }

    public static /* synthetic */ String A03(C6350eV c6350eV) {
        return c6350eV.A04;
    }

    public static /* synthetic */ List A04(C6350eV c6350eV) {
        return c6350eV.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eX != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final C6350eV<ModelType, StateType> A05(InterfaceC6352eX<ModelType, StateType> interfaceC6352eX) {
        if (this.A01 == null) {
            this.A01 = new ArrayList();
        }
        this.A01.add(interfaceC6352eX);
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.eV != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    public final C6349eU<ModelType, StateType> A06() {
        return new C6349eU<>(this);
    }
}
