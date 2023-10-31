package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;

/* renamed from: com.google.android.exoplayer2.metadata.dvbsi.a */
/* loaded from: classes.dex */
public final class C7049a implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7049a> CREATOR = new C7050a();

    /* renamed from: a */
    public final int f12493a;

    /* renamed from: b */
    public final String f12494b;

    /* renamed from: com.google.android.exoplayer2.metadata.dvbsi.a$a */
    /* loaded from: classes.dex */
    public class C7050a implements Parcelable.Creator<C7049a> {
        @Override // android.os.Parcelable.Creator
        public final C7049a createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new C7049a(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final C7049a[] newArray(int i) {
            return new C7049a[i];
        }
    }

    public C7049a(int i, String str) {
        this.f12493a = i;
        this.f12494b = str;
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

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String str = this.f12494b;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str, 33));
        sb.append("Ait(controlCode=");
        sb.append(this.f12493a);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12494b);
        parcel.writeInt(this.f12493a);
    }
}
