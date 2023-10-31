package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.flac.a */
/* loaded from: classes.dex */
public final class C7058a implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7058a> CREATOR = new C7059a();

    /* renamed from: a */
    public final int f12515a;

    /* renamed from: b */
    public final String f12516b;

    /* renamed from: c */
    public final String f12517c;

    /* renamed from: d */
    public final int f12518d;

    /* renamed from: e */
    public final int f12519e;

    /* renamed from: f */
    public final int f12520f;

    /* renamed from: g */
    public final int f12521g;

    /* renamed from: h */
    public final byte[] f12522h;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.a$a */
    /* loaded from: classes.dex */
    public class C7059a implements Parcelable.Creator<C7058a> {
        @Override // android.os.Parcelable.Creator
        public final C7058a createFromParcel(Parcel parcel) {
            return new C7058a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7058a[] newArray(int i) {
            return new C7058a[i];
        }
    }

    public C7058a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f12515a = i;
        this.f12516b = str;
        this.f12517c = str2;
        this.f12518d = i2;
        this.f12519e = i3;
        this.f12520f = i4;
        this.f12521g = i5;
        this.f12522h = bArr;
    }

    public C7058a(Parcel parcel) {
        this.f12515a = parcel.readInt();
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12516b = readString;
        this.f12517c = parcel.readString();
        this.f12518d = parcel.readInt();
        this.f12519e = parcel.readInt();
        this.f12520f = parcel.readInt();
        this.f12521g = parcel.readInt();
        this.f12522h = parcel.createByteArray();
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: G */
    public final /* synthetic */ byte[] mo5510G() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final void mo5509a(MediaMetadata.C6623a c6623a) {
        c6623a.m6213a(this.f12515a, this.f12522h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7058a.class != obj.getClass()) {
            return false;
        }
        C7058a c7058a = (C7058a) obj;
        return this.f12515a == c7058a.f12515a && this.f12516b.equals(c7058a.f12516b) && this.f12517c.equals(c7058a.f12517c) && this.f12518d == c7058a.f12518d && this.f12519e == c7058a.f12519e && this.f12520f == c7058a.f12520f && this.f12521g == c7058a.f12521g && Arrays.equals(this.f12522h, c7058a.f12522h);
    }

    public final int hashCode() {
        int m12537a = C0406q1.m12537a(this.f12516b, (this.f12515a + 527) * 31, 31);
        return Arrays.hashCode(this.f12522h) + ((((((((C0406q1.m12537a(this.f12517c, m12537a, 31) + this.f12518d) * 31) + this.f12519e) * 31) + this.f12520f) * 31) + this.f12521g) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String str = this.f12516b;
        int m12193a = C0552c.m12193a(str, 32);
        String str2 = this.f12517c;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str2, m12193a));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12515a);
        parcel.writeString(this.f12516b);
        parcel.writeString(this.f12517c);
        parcel.writeInt(this.f12518d);
        parcel.writeInt(this.f12519e);
        parcel.writeInt(this.f12520f);
        parcel.writeInt(this.f12521g);
        parcel.writeByteArray(this.f12522h);
    }
}
