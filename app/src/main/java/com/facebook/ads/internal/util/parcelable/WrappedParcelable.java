package com.facebook.ads.internal.util.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class WrappedParcelable implements Parcelable {
    public static final Parcelable.Creator<WrappedParcelable> CREATOR = new C3905a();
    @Nullable

    /* renamed from: a */
    public final byte[] f10009a;

    /* renamed from: com.facebook.ads.internal.util.parcelable.WrappedParcelable$a */
    /* loaded from: classes.dex */
    public class C3905a implements Parcelable.Creator<WrappedParcelable> {
        @Override // android.os.Parcelable.Creator
        public final WrappedParcelable createFromParcel(Parcel parcel) {
            return new WrappedParcelable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final WrappedParcelable[] newArray(int i) {
            return new WrappedParcelable[i];
        }
    }

    public WrappedParcelable(Parcel parcel) {
        this.f10009a = parcel.createByteArray();
    }

    public WrappedParcelable(Parcelable parcelable) {
        this.f10009a = marshallParcelable(parcelable);
    }

    public WrappedParcelable(@Nullable byte[] bArr) {
        this.f10009a = bArr;
    }

    public static byte[] marshallParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Parcelable unwrap(ClassLoader classLoader) {
        Parcel obtain = Parcel.obtain();
        byte[] bArr = this.f10009a;
        if (bArr != null) {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(classLoader);
            obtain.recycle();
            return readParcelable;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f10009a);
    }
}
