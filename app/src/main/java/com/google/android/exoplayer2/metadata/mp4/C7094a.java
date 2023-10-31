package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.a */
/* loaded from: classes.dex */
public final class C7094a implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7094a> CREATOR = new C7095a();

    /* renamed from: a */
    public final String f12580a;

    /* renamed from: b */
    public final byte[] f12581b;

    /* renamed from: c */
    public final int f12582c;

    /* renamed from: d */
    public final int f12583d;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.a$a */
    /* loaded from: classes.dex */
    public class C7095a implements Parcelable.Creator<C7094a> {
        @Override // android.os.Parcelable.Creator
        public final C7094a createFromParcel(Parcel parcel) {
            return new C7094a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7094a[] newArray(int i) {
            return new C7094a[i];
        }
    }

    public C7094a(Parcel parcel) {
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12580a = readString;
        this.f12581b = parcel.createByteArray();
        this.f12582c = parcel.readInt();
        this.f12583d = parcel.readInt();
    }

    public C7094a(String str, byte[] bArr, int i, int i2) {
        this.f12580a = str;
        this.f12581b = bArr;
        this.f12582c = i;
        this.f12583d = i2;
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
        if (obj == null || C7094a.class != obj.getClass()) {
            return false;
        }
        C7094a c7094a = (C7094a) obj;
        return this.f12580a.equals(c7094a.f12580a) && Arrays.equals(this.f12581b, c7094a.f12581b) && this.f12582c == c7094a.f12582c && this.f12583d == c7094a.f12583d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f12581b) + C0406q1.m12537a(this.f12580a, 527, 31)) * 31) + this.f12582c) * 31) + this.f12583d;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12580a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12580a);
        parcel.writeByteArray(this.f12581b);
        parcel.writeInt(this.f12582c);
        parcel.writeInt(this.f12583d);
    }
}
