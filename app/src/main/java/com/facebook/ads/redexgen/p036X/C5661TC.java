package com.facebook.ads.redexgen.p036X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.TC */
/* loaded from: assets/audience_network.dex */
public final class C5661TC extends AbstractC41674H<C5590S3> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC5269Mq A03;
    public C5521Qw A04;
    public String A05;
    public List<C5437Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC397518 A08;
    public final C43657U A09;
    public final C5953Xy A0A;
    public final InterfaceC5080Jh A0B;
    public final C5721UB A0C;
    public final C5237MK A0D;
    public final C4525AI A0E;
    public final C5036Ix A0F;

    public C5661TC(C5953Xy c5953Xy, List<C5437Pa> list, AbstractC397518 abstractC397518, InterfaceC5080Jh interfaceC5080Jh, C5721UB c5721ub, InterfaceC5269Mq interfaceC5269Mq, String str, C4525AI c4525ai, @Nullable C5036Ix c5036Ix) {
        this.A0A = c5953Xy;
        this.A0B = interfaceC5080Jh;
        this.A0C = c5721ub;
        this.A09 = c5721ub.A10();
        this.A04 = c5721ub.A1A();
        this.A0D = c5721ub.A19();
        this.A03 = interfaceC5269Mq;
        this.A08 = abstractC397518;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c4525ai;
        this.A0F = c5036Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A01 */
    public final C5590S3 A06(ViewGroup viewGroup, int i) {
        return new C5590S3(C5364OO.A00(new C5384Oi(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A02 */
    public final void A0E(C5590S3 c5590s3, int i) {
        c5590s3.A0m(this.A04);
        c5590s3.A0l(this.A06.get(i), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean z = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (z) {
            A07();
        }
    }

    public final void A0G(C5521Qw c5521Qw) {
        this.A04 = c5521Qw;
    }
}
