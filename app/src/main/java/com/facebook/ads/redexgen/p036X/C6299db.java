package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.db */
/* loaded from: assets/audience_network.dex */
public class C6299db extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C6298da A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ Map A02;

    public C6299db(C6298da c6298da, Map map, Map map2) {
        this.A00 = c6298da;
        this.A02 = map;
        this.A01 = map2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C396811 c396811;
        C5953Xy c5953Xy;
        C396811 c3968112;
        c396811 = this.A00.A01;
        if (!TextUtils.isEmpty(c396811.A0Y())) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.A02);
            hashMap.putAll(this.A01);
            c5953Xy = this.A00.A09;
            InterfaceC5080Jh A08 = c5953Xy.A08();
            c3968112 = this.A00.A01;
            A08.A9L(c3968112.A0Y(), hashMap);
        }
    }
}
