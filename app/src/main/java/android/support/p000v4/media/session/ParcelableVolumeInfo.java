package android.support.p000v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0014a();

    /* renamed from: a */
    public final int f21a;

    /* renamed from: b */
    public final int f22b;

    /* renamed from: c */
    public final int f23c;

    /* renamed from: d */
    public final int f24d;

    /* renamed from: e */
    public final int f25e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    public class C0014a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f21a = parcel.readInt();
        this.f23c = parcel.readInt();
        this.f24d = parcel.readInt();
        this.f25e = parcel.readInt();
        this.f22b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21a);
        parcel.writeInt(this.f23c);
        parcel.writeInt(this.f24d);
        parcel.writeInt(this.f25e);
        parcel.writeInt(this.f22b);
    }
}
