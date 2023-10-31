package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.k0 */
/* loaded from: classes.dex */
public final class C7178k0 implements Parcelable {

    /* renamed from: a */
    public final int f12905a;

    /* renamed from: b */
    public final C7175j0[] f12906b;

    /* renamed from: c */
    public int f12907c;

    /* renamed from: d */
    public static final C7178k0 f12904d = new C7178k0(new C7175j0[0]);
    public static final Parcelable.Creator<C7178k0> CREATOR = new C7179a();

    /* renamed from: com.google.android.exoplayer2.source.k0$a */
    /* loaded from: classes.dex */
    public class C7179a implements Parcelable.Creator<C7178k0> {
        @Override // android.os.Parcelable.Creator
        public final C7178k0 createFromParcel(Parcel parcel) {
            return new C7178k0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7178k0[] newArray(int i) {
            return new C7178k0[i];
        }
    }

    public C7178k0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f12905a = readInt;
        this.f12906b = new C7175j0[readInt];
        for (int i = 0; i < this.f12905a; i++) {
            this.f12906b[i] = (C7175j0) parcel.readParcelable(C7175j0.class.getClassLoader());
        }
    }

    public C7178k0(C7175j0... c7175j0Arr) {
        this.f12906b = c7175j0Arr;
        this.f12905a = c7175j0Arr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7178k0.class != obj.getClass()) {
            return false;
        }
        C7178k0 c7178k0 = (C7178k0) obj;
        return this.f12905a == c7178k0.f12905a && Arrays.equals(this.f12906b, c7178k0.f12906b);
    }

    public final int hashCode() {
        if (this.f12907c == 0) {
            this.f12907c = Arrays.hashCode(this.f12906b);
        }
        return this.f12907c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f12905a;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.f12906b[i3], 0);
        }
    }
}
