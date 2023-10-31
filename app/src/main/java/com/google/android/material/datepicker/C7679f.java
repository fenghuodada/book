package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.C7666a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes3.dex */
public final class C7679f implements C7666a.InterfaceC7669c {
    public static final Parcelable.Creator<C7679f> CREATOR = new C7680a();

    /* renamed from: a */
    public final long f14846a;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes3.dex */
    public class C7680a implements Parcelable.Creator<C7679f> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7679f createFromParcel(@NonNull Parcel parcel) {
            return new C7679f(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final C7679f[] newArray(int i) {
            return new C7679f[i];
        }
    }

    public C7679f(long j) {
        this.f14846a = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7679f) && this.f14846a == ((C7679f) obj).f14846a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14846a)});
    }

    @Override // com.google.android.material.datepicker.C7666a.InterfaceC7669c
    /* renamed from: u */
    public final boolean mo4594u(long j) {
        return j >= this.f14846a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeLong(this.f14846a);
    }
}
