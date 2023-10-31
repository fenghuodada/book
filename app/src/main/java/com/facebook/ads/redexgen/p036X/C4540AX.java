package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.AX */
/* loaded from: assets/audience_network.dex */
public class C4540AX implements Parcelable.Creator<Format> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final Format createFromParcel(Parcel parcel) {
        return new Format(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final Format[] newArray(int i) {
        return new Format[i];
    }
}
