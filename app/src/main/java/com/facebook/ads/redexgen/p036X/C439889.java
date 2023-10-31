package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.89 */
/* loaded from: assets/audience_network.dex */
public final class C439889 extends C5358OI {
    public int A00;
    public boolean A01;
    public final AbstractC44839c<C439788> A02;
    public final AbstractC44839c<C439585> A03;
    public final AbstractC44839c<C5215Ly> A04;
    public final AbstractC44839c<C439484> A05;
    public final AbstractC44839c<C5159L1> A06;
    public final AbstractC44839c<C5152Ku> A07;
    public final AbstractC44839c<C5150Kr> A08;
    public final AbstractC44839c<C5134Kb> A09;
    public final AbstractC44839c<C5133Ka> A0A;
    public final C5483QK A0B;
    public final AbstractC5161L4 A0C;
    public final AbstractC5135Kc A0D;

    public C439889(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, String str) {
        this(c5953Xy, interfaceC5080Jh, c5483qk, new ArrayList(), str);
    }

    public C439889(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, String str, @Nullable Bundle bundle) {
        this(c5953Xy, interfaceC5080Jh, c5483qk, new ArrayList(), str, bundle, null);
    }

    public C439889(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, String str, @Nullable Map<String, String> extraParams) {
        this(c5953Xy, interfaceC5080Jh, c5483qk, new ArrayList(), str, null, extraParams);
    }

    public C439889(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, List<AbstractC40392A> list, String str) {
        super(c5953Xy, interfaceC5080Jh, c5483qk, list, str, !c5483qk.A0h(), new C5339Nz(c5953Xy, c5483qk));
        this.A0D = new AbstractC5135Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5136Kd c5136Kd) {
                C439889.this.A0Z();
            }
        };
        this.A07 = new C5476QD(this);
        this.A03 = new C5475QC(this);
        this.A04 = new C5474QB(this);
        this.A05 = new C5473QA(this);
        this.A02 = new C5457Pu(this);
        this.A06 = new C5433PW(this);
        this.A09 = new C5432PV(this);
        this.A0A = new C5391Op(this);
        this.A08 = new C5478QF(this);
        this.A0C = new AbstractC5161L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5173LG c5173lg) {
                C5483QK c5483qk2;
                C439889 c439889 = C439889.this;
                c5483qk2 = c439889.A0B;
                c439889.A00 = c5483qk2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c5483qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A0C, this.A08);
    }

    public C439889(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, List<AbstractC40392A> list, String str, @Nullable Bundle bundle, @Nullable Map<String, String> extraParams) {
        super(c5953Xy, interfaceC5080Jh, c5483qk, list, str, !c5483qk.A0h(), bundle, extraParams, new C5339Nz(c5953Xy, c5483qk));
        this.A0D = new AbstractC5135Kc() { // from class: com.facebook.ads.redexgen.X.8C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5136Kd c5136Kd) {
                C439889.this.A0Z();
            }
        };
        this.A07 = new C5476QD(this);
        this.A03 = new C5475QC(this);
        this.A04 = new C5474QB(this);
        this.A05 = new C5473QA(this);
        this.A02 = new C5457Pu(this);
        this.A06 = new C5433PW(this);
        this.A09 = new C5432PV(this);
        this.A0A = new C5391Op(this);
        this.A08 = new C5478QF(this);
        this.A0C = new AbstractC5161L4() { // from class: com.facebook.ads.redexgen.X.8D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5173LG c5173lg) {
                C5483QK c5483qk2;
                C439889 c439889 = C439889.this;
                c5483qk2 = c439889.A0B;
                c439889.A00 = c5483qk2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c5483qk;
        this.A0B.getEventBus().A03(this.A0D, this.A05, this.A07, this.A04, this.A03, this.A02, this.A06, this.A09, this.A0A, this.A08);
    }

    public final void A0g() {
        C5477QE c5477qe = new C5477QE(this);
        if (this.A0B.A0l()) {
            ExecutorC5239MM.A00(c5477qe);
        } else {
            this.A0B.getStateHandler().post(c5477qe);
        }
    }
}
