package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;

/* renamed from: com.facebook.ads.redexgen.X.EV */
/* loaded from: assets/audience_network.dex */
public class C4766EV implements Parcelable.Creator<PrivFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final PrivFrame createFromParcel(Parcel parcel) {
        return new PrivFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final PrivFrame[] newArray(int i) {
        return new PrivFrame[i];
    }
}
