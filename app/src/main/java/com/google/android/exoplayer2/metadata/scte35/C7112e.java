package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.e */
/* loaded from: classes.dex */
public final class C7112e extends AbstractC7107b {
    public static final Parcelable.Creator<C7112e> CREATOR = new C7113a();

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.e$a */
    /* loaded from: classes.dex */
    public class C7113a implements Parcelable.Creator<C7112e> {
        @Override // android.os.Parcelable.Creator
        public final C7112e createFromParcel(Parcel parcel) {
            return new C7112e();
        }

        @Override // android.os.Parcelable.Creator
        public final C7112e[] newArray(int i) {
            return new C7112e[i];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
