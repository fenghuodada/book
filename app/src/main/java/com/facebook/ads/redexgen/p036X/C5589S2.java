package com.facebook.ads.redexgen.p036X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.S2 */
/* loaded from: assets/audience_network.dex */
public final class C5589S2 extends AbstractC41674H<C5583Rw> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    @Nullable
    public InterfaceC5269Mq A04;
    public String A05;
    public List<C5437Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC397518 A08;
    public final C43657U A09;
    public final C5953Xy A0A;
    public final InterfaceC5080Jh A0B;
    public final C5237MK A0C;
    public final C5598SB A0D;
    public final C5521Qw A0E;

    public C5589S2(C5953Xy c5953Xy, List<C5437Pa> list, AbstractC397518 abstractC397518, InterfaceC5080Jh interfaceC5080Jh, C43657U c43657u, C5521Qw c5521Qw, C5237MK c5237mk, InterfaceC5269Mq interfaceC5269Mq, String str, int i, int i2, int i3, int i4, C5598SB c5598sb) {
        this.A0A = c5953Xy;
        this.A0B = interfaceC5080Jh;
        this.A09 = c43657u;
        this.A0E = c5521Qw;
        this.A0C = c5237mk;
        this.A04 = interfaceC5269Mq;
        this.A08 = abstractC397518;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = c5598sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A01 */
    public final C5583Rw A06(ViewGroup viewGroup, int i) {
        return new C5583Rw(C5398Ow.A00(new C5384Oi(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A02 */
    public final void A0E(C5583Rw c5583Rw, int i) {
        c5583Rw.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    public final int A0D() {
        return this.A06.size();
    }
}
