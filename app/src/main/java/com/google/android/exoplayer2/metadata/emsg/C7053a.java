package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.a */
/* loaded from: classes.dex */
public final class C7053a implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7053a> CREATOR;

    /* renamed from: g */
    public static final C7003m0 f12495g;

    /* renamed from: h */
    public static final C7003m0 f12496h;

    /* renamed from: a */
    public final String f12497a;

    /* renamed from: b */
    public final String f12498b;

    /* renamed from: c */
    public final long f12499c;

    /* renamed from: d */
    public final long f12500d;

    /* renamed from: e */
    public final byte[] f12501e;

    /* renamed from: f */
    public int f12502f;

    /* renamed from: com.google.android.exoplayer2.metadata.emsg.a$a */
    /* loaded from: classes.dex */
    public class C7054a implements Parcelable.Creator<C7053a> {
        @Override // android.os.Parcelable.Creator
        public final C7053a createFromParcel(Parcel parcel) {
            return new C7053a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7053a[] newArray(int i) {
            return new C7053a[i];
        }
    }

    static {
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12316k = "application/id3";
        f12495g = c7005b.m5614a();
        C7003m0.C7005b c7005b2 = new C7003m0.C7005b();
        c7005b2.f12316k = "application/x-scte35";
        f12496h = c7005b2.m5614a();
        CREATOR = new C7054a();
    }

    public C7053a(Parcel parcel) {
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12497a = readString;
        this.f12498b = parcel.readString();
        this.f12499c = parcel.readLong();
        this.f12500d = parcel.readLong();
        this.f12501e = parcel.createByteArray();
    }

    public C7053a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f12497a = str;
        this.f12498b = str2;
        this.f12499c = j;
        this.f12500d = j2;
        this.f12501e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    @Nullable
    /* renamed from: G */
    public final byte[] mo5510G() {
        if (mo5508o() != null) {
            return this.f12501e;
        }
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
        if (obj == null || C7053a.class != obj.getClass()) {
            return false;
        }
        C7053a c7053a = (C7053a) obj;
        return this.f12499c == c7053a.f12499c && this.f12500d == c7053a.f12500d && C7408g0.m5105a(this.f12497a, c7053a.f12497a) && C7408g0.m5105a(this.f12498b, c7053a.f12498b) && Arrays.equals(this.f12501e, c7053a.f12501e);
    }

    public final int hashCode() {
        if (this.f12502f == 0) {
            String str = this.f12497a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f12498b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f12499c;
            long j2 = this.f12500d;
            this.f12502f = Arrays.hashCode(this.f12501e) + ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f12502f;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    @Nullable
    /* renamed from: o */
    public final C7003m0 mo5508o() {
        String str = this.f12497a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f12496h;
            case 1:
            case 2:
                return f12495g;
            default:
                return null;
        }
    }

    public final String toString() {
        String str = this.f12497a;
        int m12193a = C0552c.m12193a(str, 79);
        String str2 = this.f12498b;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str2, m12193a));
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.f12500d);
        sb.append(", durationMs=");
        sb.append(this.f12499c);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12497a);
        parcel.writeString(this.f12498b);
        parcel.writeLong(this.f12499c);
        parcel.writeLong(this.f12500d);
        parcel.writeByteArray(this.f12501e);
    }
}
