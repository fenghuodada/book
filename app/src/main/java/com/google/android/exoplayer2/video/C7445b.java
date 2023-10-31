package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.video.b */
/* loaded from: classes.dex */
public final class C7445b implements Parcelable {
    public static final Parcelable.Creator<C7445b> CREATOR = new C7446a();

    /* renamed from: a */
    public final int f14006a;

    /* renamed from: b */
    public final int f14007b;

    /* renamed from: c */
    public final int f14008c;
    @Nullable

    /* renamed from: d */
    public final byte[] f14009d;

    /* renamed from: e */
    public int f14010e;

    /* renamed from: com.google.android.exoplayer2.video.b$a */
    /* loaded from: classes.dex */
    public class C7446a implements Parcelable.Creator<C7445b> {
        @Override // android.os.Parcelable.Creator
        public final C7445b createFromParcel(Parcel parcel) {
            return new C7445b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7445b[] newArray(int i) {
            return new C7445b[i];
        }
    }

    public C7445b(int i, int i2, int i3, @Nullable byte[] bArr) {
        this.f14006a = i;
        this.f14007b = i2;
        this.f14008c = i3;
        this.f14009d = bArr;
    }

    public C7445b(Parcel parcel) {
        boolean z;
        byte[] bArr;
        this.f14006a = parcel.readInt();
        this.f14007b = parcel.readInt();
        this.f14008c = parcel.readInt();
        int i = C7408g0.f13905a;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.f14009d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7445b.class != obj.getClass()) {
            return false;
        }
        C7445b c7445b = (C7445b) obj;
        return this.f14006a == c7445b.f14006a && this.f14007b == c7445b.f14007b && this.f14008c == c7445b.f14008c && Arrays.equals(this.f14009d, c7445b.f14009d);
    }

    public final int hashCode() {
        if (this.f14010e == 0) {
            this.f14010e = Arrays.hashCode(this.f14009d) + ((((((527 + this.f14006a) * 31) + this.f14007b) * 31) + this.f14008c) * 31);
        }
        return this.f14010e;
    }

    public final String toString() {
        boolean z = this.f14009d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(this.f14006a);
        sb.append(", ");
        sb.append(this.f14007b);
        sb.append(", ");
        sb.append(this.f14008c);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f14006a);
        parcel.writeInt(this.f14007b);
        parcel.writeInt(this.f14008c);
        byte[] bArr = this.f14009d;
        if (bArr != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = C7408g0.f13905a;
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
