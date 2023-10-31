package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.icy.c */
/* loaded from: classes.dex */
public final class C7066c implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7066c> CREATOR = new C7067a();

    /* renamed from: a */
    public final byte[] f12534a;
    @Nullable

    /* renamed from: b */
    public final String f12535b;
    @Nullable

    /* renamed from: c */
    public final String f12536c;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.c$a */
    /* loaded from: classes.dex */
    public class C7067a implements Parcelable.Creator<C7066c> {
        @Override // android.os.Parcelable.Creator
        public final C7066c createFromParcel(Parcel parcel) {
            return new C7066c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7066c[] newArray(int i) {
            return new C7066c[i];
        }
    }

    public C7066c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f12534a = createByteArray;
        this.f12535b = parcel.readString();
        this.f12536c = parcel.readString();
    }

    public C7066c(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f12534a = bArr;
        this.f12535b = str;
        this.f12536c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final void mo5509a(MediaMetadata.C6623a c6623a) {
        String str = this.f12535b;
        if (str != null) {
            c6623a.f10512a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7066c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12534a, ((C7066c) obj).f12534a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12534a);
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f12535b, this.f12536c, Integer.valueOf(this.f12534a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f12534a);
        parcel.writeString(this.f12535b);
        parcel.writeString(this.f12536c);
    }
}
