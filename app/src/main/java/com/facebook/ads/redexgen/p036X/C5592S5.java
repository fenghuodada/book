package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.S5 */
/* loaded from: assets/audience_network.dex */
public class C5592S5 extends AbstractC5520Qv {
    public static String[] A06 = {"9EcwbXL", "xSjvPMkgWWioBuUjephCpzaMcXmM2sD", "H", "Z0OwbQNEejaaYPjBGD9d9AX", "LifEXsQyKShCOMizwIOXiweZ0", "XJXBCYBKjtegaNwUZmi8zWUKmanAO", "UJgIUi3fLAa", "b39pUeydvHz6vxm1zIrt3qO8a47iYX"};
    public final /* synthetic */ InterfaceC5080Jh A00;
    public final /* synthetic */ C5237MK A01;
    public final /* synthetic */ C5437Pa A02;
    public final /* synthetic */ C5590S3 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C5592S5(C5590S3 c5590s3, String str, C5437Pa c5437Pa, InterfaceC5080Jh interfaceC5080Jh, Map map, C5237MK c5237mk) {
        this.A03 = c5590s3;
        this.A04 = str;
        this.A02 = c5437Pa;
        this.A00 = interfaceC5080Jh;
        this.A05 = map;
        this.A01 = c5237mk;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A02() {
        C5521Qw c5521Qw;
        SparseBooleanArray sparseBooleanArray;
        C5521Qw c5521Qw2;
        SparseBooleanArray sparseBooleanArray2;
        c5521Qw = this.A03.A01;
        if (c5521Qw.A0Z()) {
            return;
        }
        String str = this.A04;
        if (A06[0].length() != 7) {
            throw new RuntimeException();
        }
        A06[7] = "G0eOJNFPtps4qsYKpGpuAXPxSINW56";
        if (!TextUtils.isEmpty(str)) {
            sparseBooleanArray = this.A03.A04;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC5080Jh interfaceC5080Jh = this.A00;
                String str2 = this.A04;
                C5356OG c5356og = new C5356OG(this.A05);
                c5521Qw2 = this.A03.A02;
                interfaceC5080Jh.A93(str2, c5356og.A03(c5521Qw2).A02(this.A01).A05());
                sparseBooleanArray2 = this.A03.A04;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
