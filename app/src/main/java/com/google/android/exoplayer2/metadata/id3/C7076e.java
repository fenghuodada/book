package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.id3.e */
/* loaded from: classes.dex */
public final class C7076e extends AbstractC7083h {
    public static final Parcelable.Creator<C7076e> CREATOR = new C7077a();

    /* renamed from: b */
    public final String f12553b;

    /* renamed from: c */
    public final String f12554c;

    /* renamed from: d */
    public final String f12555d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.e$a */
    /* loaded from: classes.dex */
    public class C7077a implements Parcelable.Creator<C7076e> {
        @Override // android.os.Parcelable.Creator
        public final C7076e createFromParcel(Parcel parcel) {
            return new C7076e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7076e[] newArray(int i) {
            return new C7076e[i];
        }
    }

    public C7076e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12553b = readString;
        this.f12554c = parcel.readString();
        this.f12555d = parcel.readString();
    }

    public C7076e(String str, String str2, String str3) {
        super("COMM");
        this.f12553b = str;
        this.f12554c = str2;
        this.f12555d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7076e.class != obj.getClass()) {
            return false;
        }
        C7076e c7076e = (C7076e) obj;
        return C7408g0.m5105a(this.f12554c, c7076e.f12554c) && C7408g0.m5105a(this.f12553b, c7076e.f12553b) && C7408g0.m5105a(this.f12555d, c7076e.f12555d);
    }

    public final int hashCode() {
        String str = this.f12553b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12554c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12555d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 25);
        String str2 = this.f12553b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12554c;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str3, m12193a2), str, ": language=", str2, ", description=");
        m9043a.append(str3);
        return m9043a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12565a);
        parcel.writeString(this.f12553b);
        parcel.writeString(this.f12555d);
    }
}
