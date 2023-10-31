package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1801a();

    /* renamed from: a */
    public final InterfaceC1804c f4385a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: classes.dex */
    public static class C1801a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f4385a = new C1803b(parcel).m9931n();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1803b(parcel).m9929w(this.f4385a);
    }
}
