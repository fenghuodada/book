package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.a */
/* loaded from: classes.dex */
public final class C7105a extends AbstractC7107b {
    public static final Parcelable.Creator<C7105a> CREATOR = new C7106a();

    /* renamed from: a */
    public final long f12595a;

    /* renamed from: b */
    public final long f12596b;

    /* renamed from: c */
    public final byte[] f12597c;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.a$a */
    /* loaded from: classes.dex */
    public class C7106a implements Parcelable.Creator<C7105a> {
        @Override // android.os.Parcelable.Creator
        public final C7105a createFromParcel(Parcel parcel) {
            return new C7105a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7105a[] newArray(int i) {
            return new C7105a[i];
        }
    }

    public C7105a(long j, byte[] bArr, long j2) {
        this.f12595a = j2;
        this.f12596b = j;
        this.f12597c = bArr;
    }

    public C7105a(Parcel parcel) {
        this.f12595a = parcel.readLong();
        this.f12596b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i = C7408g0.f13905a;
        this.f12597c = createByteArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12595a);
        parcel.writeLong(this.f12596b);
        parcel.writeByteArray(this.f12597c);
    }
}
