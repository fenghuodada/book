package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Ed */
/* loaded from: assets/audience_network.dex */
public final class C4774Ed {
    public final int A00;
    public final long A01;

    public C4774Ed(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C4774Ed(int i, long j, C4773Ec c4773Ec) {
        this(i, j);
    }

    public static C4774Ed A00(Parcel parcel) {
        return new C4774Ed(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
