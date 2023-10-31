package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p036X.C4773Ec;
import com.facebook.ads.redexgen.p036X.C4775Ee;
import com.facebook.ads.redexgen.p036X.C5022Ij;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static String[] A01 = {"it7lS", "DDMagQqfA6bdQNmcbGVHnHFBEyEyV1CV", "yj1Kd0vDyL1u2mFRENQtUt5M23mLahBX", "Jtl9O", "DzPPQsDVYOU8bWKOfUnj4CDUSnJ2WnBZ", "jfx4iKnVrCrKgyd9K0RyokJ5bMLL728G", "aEdAaZwrqc10hFo35SyTbuIH90C1HKve", "av2CnTBgmmUyqozc6FxJU9F0Qf7BUN36"};
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C4773Ec();
    public final List<C4775Ee> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(C4775Ee.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C4773Ec c4773Ec) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C4775Ee> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C5022Ij c5022Ij) {
        int A0E = c5022Ij.A0E();
        ArrayList arrayList = new ArrayList(A0E);
        for (int i = 0; i < A0E; i++) {
            arrayList.add(C4775Ee.A03(c5022Ij));
            if (A01[1].charAt(15) == 'W') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "d2FIwqylvh7iXAJnxNkaidieKhP3pOaB";
            strArr[4] = "dE1dCXJBgr8GZeSYP1l3R34BwUsmGXNG";
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C4775Ee.A05(this.A00.get(i2), parcel);
        }
    }
}
