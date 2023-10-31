package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;

/* renamed from: com.facebook.ads.redexgen.X.J2 */
/* loaded from: assets/audience_network.dex */
public class C5041J2 implements Parcelable.Creator<ColorInfo> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final ColorInfo createFromParcel(Parcel parcel) {
        return new ColorInfo(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final ColorInfo[] newArray(int i) {
        return new ColorInfo[0];
    }
}
