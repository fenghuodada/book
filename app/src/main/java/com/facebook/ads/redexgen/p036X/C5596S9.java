package com.facebook.ads.redexgen.p036X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.S9 */
/* loaded from: assets/audience_network.dex */
public final class C5596S9 extends AbstractC41674H<C5590S3> {
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public InterfaceC5269Mq A03;
    public String A04;
    public List<C5437Pa> A05;
    public final SparseBooleanArray A06 = new SparseBooleanArray();
    public final AbstractC397518 A07;
    public final C43657U A08;
    public final C5953Xy A09;
    public final InterfaceC5080Jh A0A;
    public final C5237MK A0B;
    public final C5598SB A0C;
    public final C5036Ix A0D;
    public final C5521Qw A0E;

    public C5596S9(C5953Xy c5953Xy, List<C5437Pa> list, AbstractC397518 abstractC397518, InterfaceC5080Jh interfaceC5080Jh, C43657U c43657u, C5521Qw c5521Qw, C5237MK c5237mk, InterfaceC5269Mq interfaceC5269Mq, String str, C5598SB c5598sb, C5036Ix c5036Ix) {
        this.A09 = c5953Xy;
        this.A0A = interfaceC5080Jh;
        this.A08 = c43657u;
        this.A0E = c5521Qw;
        this.A0B = c5237mk;
        this.A03 = interfaceC5269Mq;
        this.A07 = abstractC397518;
        this.A05 = list;
        this.A04 = str;
        this.A0C = c5598sb;
        this.A0D = c5036Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    @Nullable
    /* renamed from: A01 */
    public final C5590S3 A06(ViewGroup viewGroup, int i) {
        InterfaceC5269Mq interfaceC5269Mq = this.A03;
        if (interfaceC5269Mq == null || this.A00 == 0) {
            return null;
        }
        return new C5590S3(C5364OO.A01(new C5384Oi(this.A09, this.A0A, interfaceC5269Mq, this.A07, null, this.A0E, this.A0B).A0I(this.A0D).A0J(), this.A04, this.A0C), this.A06, this.A0E, this.A05.size(), this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A02 */
    public final void A0E(C5590S3 c5590s3, int i) {
        c5590s3.A0l(this.A05.get(i), this.A0A, this.A08, this.A0B, this.A04, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    public final int A0D() {
        return this.A05.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
