package android.support.p000v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0006a();

    /* renamed from: a */
    public final int f2a;

    /* renamed from: b */
    public final MediaDescriptionCompat f3b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    /* loaded from: classes.dex */
    public class C0006a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f2a = parcel.readInt();
        this.f3b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NonNull
    public final String toString() {
        return "MediaItem{mFlags=" + this.f2a + ", mDescription=" + this.f3b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2a);
        this.f3b.writeToParcel(parcel, i);
    }
}
