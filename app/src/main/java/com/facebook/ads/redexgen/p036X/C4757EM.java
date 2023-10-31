package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;

/* renamed from: com.facebook.ads.redexgen.X.EM */
/* loaded from: assets/audience_network.dex */
public class C4757EM implements Parcelable.Creator<ApicFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ApicFrame createFromParcel(Parcel parcel) {
        return new ApicFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ApicFrame[] newArray(int i) {
        return new ApicFrame[i];
    }
}
