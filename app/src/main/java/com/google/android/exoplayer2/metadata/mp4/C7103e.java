package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;

/* renamed from: com.google.android.exoplayer2.metadata.mp4.e */
/* loaded from: classes.dex */
public final class C7103e implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7103e> CREATOR = new C7104a();

    /* renamed from: a */
    public final float f12593a;

    /* renamed from: b */
    public final int f12594b;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.e$a */
    /* loaded from: classes.dex */
    public class C7104a implements Parcelable.Creator<C7103e> {
        @Override // android.os.Parcelable.Creator
        public final C7103e createFromParcel(Parcel parcel) {
            return new C7103e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7103e[] newArray(int i) {
            return new C7103e[i];
        }
    }

    public C7103e(float f, int i) {
        this.f12593a = f;
        this.f12594b = i;
    }

    public C7103e(Parcel parcel) {
        this.f12593a = parcel.readFloat();
        this.f12594b = parcel.readInt();
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
        if (obj == null || C7103e.class != obj.getClass()) {
            return false;
        }
        C7103e c7103e = (C7103e) obj;
        return this.f12593a == c7103e.f12593a && this.f12594b == c7103e.f12594b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f12593a).hashCode() + 527) * 31) + this.f12594b;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(this.f12593a);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.f12594b);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f12593a);
        parcel.writeInt(this.f12594b);
    }
}
