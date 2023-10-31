package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.b */
/* loaded from: classes.dex */
public final class C7096b implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7096b> CREATOR = new C7097a();

    /* renamed from: a */
    public final long f12584a;

    /* renamed from: b */
    public final long f12585b;

    /* renamed from: c */
    public final long f12586c;

    /* renamed from: d */
    public final long f12587d;

    /* renamed from: e */
    public final long f12588e;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.b$a */
    /* loaded from: classes.dex */
    public class C7097a implements Parcelable.Creator<C7096b> {
        @Override // android.os.Parcelable.Creator
        public final C7096b createFromParcel(Parcel parcel) {
            return new C7096b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7096b[] newArray(int i) {
            return new C7096b[i];
        }
    }

    public C7096b(long j, long j2, long j3, long j4, long j5) {
        this.f12584a = j;
        this.f12585b = j2;
        this.f12586c = j3;
        this.f12587d = j4;
        this.f12588e = j5;
    }

    public C7096b(Parcel parcel) {
        this.f12584a = parcel.readLong();
        this.f12585b = parcel.readLong();
        this.f12586c = parcel.readLong();
        this.f12587d = parcel.readLong();
        this.f12588e = parcel.readLong();
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final /* synthetic */ void mo5509a(MediaMetadata.C6623a c6623a) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7096b.class != obj.getClass()) {
            return false;
        }
        C7096b c7096b = (C7096b) obj;
        return this.f12584a == c7096b.f12584a && this.f12585b == c7096b.f12585b && this.f12586c == c7096b.f12586c && this.f12587d == c7096b.f12587d && this.f12588e == c7096b.f12588e;
    }

    public final int hashCode() {
        long j = this.f12584a;
        long j2 = this.f12585b;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.f12586c;
        int i2 = (int) (j3 ^ (j3 >>> 32));
        long j4 = this.f12587d;
        int i3 = (int) (j4 ^ (j4 >>> 32));
        long j5 = this.f12588e;
        return ((int) (j5 ^ (j5 >>> 32))) + ((i3 + ((i2 + ((i + ((((int) (j ^ (j >>> 32))) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(this.f12584a);
        sb.append(", photoSize=");
        sb.append(this.f12585b);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.f12586c);
        sb.append(", videoStartPosition=");
        sb.append(this.f12587d);
        sb.append(", videoSize=");
        sb.append(this.f12588e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12584a);
        parcel.writeLong(this.f12585b);
        parcel.writeLong(this.f12586c);
        parcel.writeLong(this.f12587d);
        parcel.writeLong(this.f12588e);
    }
}
