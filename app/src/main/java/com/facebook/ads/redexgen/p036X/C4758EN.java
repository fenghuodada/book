package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;

/* renamed from: com.facebook.ads.redexgen.X.EN */
/* loaded from: assets/audience_network.dex */
public class C4758EN implements Parcelable.Creator<BinaryFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final BinaryFrame createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final BinaryFrame[] newArray(int i) {
        return new BinaryFrame[i];
    }
}
