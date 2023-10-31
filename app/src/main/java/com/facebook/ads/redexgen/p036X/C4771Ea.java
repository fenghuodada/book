package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Ea */
/* loaded from: assets/audience_network.dex */
public final class C4771Ea {
    public final int A00;
    public final long A01;
    public final long A02;

    public C4771Ea(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C4771Ea(int i, long j, long j2, C4770EZ c4770ez) {
        this(i, j, j2);
    }

    public static C4771Ea A00(Parcel parcel) {
        return new C4771Ea(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
