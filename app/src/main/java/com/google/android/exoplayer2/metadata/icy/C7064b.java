package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.icy.b */
/* loaded from: classes.dex */
public final class C7064b implements C7042a.InterfaceC7044b {
    public static final Parcelable.Creator<C7064b> CREATOR = new C7065a();

    /* renamed from: a */
    public final int f12528a;
    @Nullable

    /* renamed from: b */
    public final String f12529b;
    @Nullable

    /* renamed from: c */
    public final String f12530c;
    @Nullable

    /* renamed from: d */
    public final String f12531d;

    /* renamed from: e */
    public final boolean f12532e;

    /* renamed from: f */
    public final int f12533f;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.b$a */
    /* loaded from: classes.dex */
    public class C7065a implements Parcelable.Creator<C7064b> {
        @Override // android.os.Parcelable.Creator
        public final C7064b createFromParcel(Parcel parcel) {
            return new C7064b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7064b[] newArray(int i) {
            return new C7064b[i];
        }
    }

    public C7064b(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        C7394a.m5134a(i2 == -1 || i2 > 0);
        this.f12528a = i;
        this.f12529b = str;
        this.f12530c = str2;
        this.f12531d = str3;
        this.f12532e = z;
        this.f12533f = i2;
    }

    public C7064b(Parcel parcel) {
        boolean z;
        this.f12528a = parcel.readInt();
        this.f12529b = parcel.readString();
        this.f12530c = parcel.readString();
        this.f12531d = parcel.readString();
        int i = C7408g0.f13905a;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12532e = z;
        this.f12533f = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.C7064b m5534b(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.C7064b.m5534b(java.util.Map):com.google.android.exoplayer2.metadata.icy.b");
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
        if (obj == null || C7064b.class != obj.getClass()) {
            return false;
        }
        C7064b c7064b = (C7064b) obj;
        return this.f12528a == c7064b.f12528a && C7408g0.m5105a(this.f12529b, c7064b.f12529b) && C7408g0.m5105a(this.f12530c, c7064b.f12530c) && C7408g0.m5105a(this.f12531d, c7064b.f12531d) && this.f12532e == c7064b.f12532e && this.f12533f == c7064b.f12533f;
    }

    public final int hashCode() {
        int i = (527 + this.f12528a) * 31;
        String str = this.f12529b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12530c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12531d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12532e ? 1 : 0)) * 31) + this.f12533f;
    }

    @Override // com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: o */
    public final /* synthetic */ C7003m0 mo5508o() {
        return null;
    }

    public final String toString() {
        String str = this.f12530c;
        int m12193a = C0552c.m12193a(str, 80);
        String str2 = this.f12529b;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str2, m12193a), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        m9043a.append("\", bitrate=");
        m9043a.append(this.f12528a);
        m9043a.append(", metadataInterval=");
        m9043a.append(this.f12533f);
        return m9043a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12528a);
        parcel.writeString(this.f12529b);
        parcel.writeString(this.f12530c);
        parcel.writeString(this.f12531d);
        int i2 = C7408g0.f13905a;
        parcel.writeInt(this.f12532e ? 1 : 0);
        parcel.writeInt(this.f12533f);
    }
}
