package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.cG */
/* loaded from: assets/audience_network.dex */
public class C6218cG implements InterfaceC41293e {
    public final /* synthetic */ C4808FD A00;
    public final /* synthetic */ C41243Z A01;

    public C6218cG(C4808FD c4808fd, C41243Z c41243z) {
        this.A00 = c4808fd;
        this.A01 = c41243z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41293e
    public final Object A4D(int i) {
        C41223X A00 = this.A01.A00(i);
        if (A00 == null) {
            return null;
        }
        return A00.A0M();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41293e
    public final List<Object> A5O(String str, int i) {
        List<C41223X> A03 = this.A01.A03(str, i);
        if (A03 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = A03.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(A03.get(i2).A0M());
        }
        return arrayList;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41293e
    public final Object A5P(int i) {
        C41223X A01 = this.A01.A01(i);
        if (A01 == null) {
            return null;
        }
        return A01.A0M();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41293e
    public final boolean AD9(int i, int i2, Bundle bundle) {
        return this.A01.A04(i, i2, bundle);
    }
}
