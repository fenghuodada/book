package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.a */
/* loaded from: classes.dex */
public final class C7068a extends AbstractC7083h {
    public static final Parcelable.Creator<C7068a> CREATOR = new C7069a();

    /* renamed from: b */
    public final String f12537b;
    @Nullable

    /* renamed from: c */
    public final String f12538c;

    /* renamed from: d */
    public final int f12539d;

    /* renamed from: e */
    public final byte[] f12540e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$a */
    /* loaded from: classes.dex */
    public class C7069a implements Parcelable.Creator<C7068a> {
        @Override // android.os.Parcelable.Creator
        public final C7068a createFromParcel(Parcel parcel) {
            return new C7068a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7068a[] newArray(int i) {
            return new C7068a[i];
        }
    }

    public C7068a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12537b = readString;
        this.f12538c = parcel.readString();
        this.f12539d = parcel.readInt();
        this.f12540e = parcel.createByteArray();
    }

    public C7068a(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f12537b = str;
        this.f12538c = str2;
        this.f12539d = i;
        this.f12540e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h, com.google.android.exoplayer2.metadata.C7042a.InterfaceC7044b
    /* renamed from: a */
    public final void mo5509a(MediaMetadata.C6623a c6623a) {
        c6623a.m6213a(this.f12539d, this.f12540e);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7068a.class != obj.getClass()) {
            return false;
        }
        C7068a c7068a = (C7068a) obj;
        return this.f12539d == c7068a.f12539d && C7408g0.m5105a(this.f12537b, c7068a.f12537b) && C7408g0.m5105a(this.f12538c, c7068a.f12538c) && Arrays.equals(this.f12540e, c7068a.f12540e);
    }

    public final int hashCode() {
        int i = (527 + this.f12539d) * 31;
        String str = this.f12537b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12538c;
        return Arrays.hashCode(this.f12540e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 25);
        String str2 = this.f12537b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12538c;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str3, m12193a2), str, ": mimeType=", str2, ", description=");
        m9043a.append(str3);
        return m9043a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12537b);
        parcel.writeString(this.f12538c);
        parcel.writeInt(this.f12539d);
        parcel.writeByteArray(this.f12540e);
    }
}
