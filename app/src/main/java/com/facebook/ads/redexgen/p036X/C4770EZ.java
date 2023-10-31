package com.facebook.ads.redexgen.p036X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.scte35.SpliceInsertCommand;

/* renamed from: com.facebook.ads.redexgen.X.EZ */
/* loaded from: assets/audience_network.dex */
public class C4770EZ implements Parcelable.Creator<SpliceInsertCommand> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final SpliceInsertCommand createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final SpliceInsertCommand[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
