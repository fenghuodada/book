package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.fragment.app.C1431t;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.f */
/* loaded from: classes.dex */
public final class C7078f extends AbstractC7083h {
    public static final Parcelable.Creator<C7078f> CREATOR = new C7079a();

    /* renamed from: b */
    public final String f12556b;

    /* renamed from: c */
    public final String f12557c;

    /* renamed from: d */
    public final String f12558d;

    /* renamed from: e */
    public final byte[] f12559e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.f$a */
    /* loaded from: classes.dex */
    public class C7079a implements Parcelable.Creator<C7078f> {
        @Override // android.os.Parcelable.Creator
        public final C7078f createFromParcel(Parcel parcel) {
            return new C7078f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7078f[] newArray(int i) {
            return new C7078f[i];
        }
    }

    public C7078f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12556b = readString;
        this.f12557c = parcel.readString();
        this.f12558d = parcel.readString();
        this.f12559e = parcel.createByteArray();
    }

    public C7078f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12556b = str;
        this.f12557c = str2;
        this.f12558d = str3;
        this.f12559e = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7078f.class != obj.getClass()) {
            return false;
        }
        C7078f c7078f = (C7078f) obj;
        return C7408g0.m5105a(this.f12556b, c7078f.f12556b) && C7408g0.m5105a(this.f12557c, c7078f.f12557c) && C7408g0.m5105a(this.f12558d, c7078f.f12558d) && Arrays.equals(this.f12559e, c7078f.f12559e);
    }

    public final int hashCode() {
        String str = this.f12556b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12557c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12558d;
        return Arrays.hashCode(this.f12559e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 36);
        String str2 = this.f12556b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12557c;
        int m12193a3 = C0552c.m12193a(str3, m12193a2);
        String str4 = this.f12558d;
        return C1431t.m10577a(C2745h.m9043a(C0552c.m12193a(str4, m12193a3), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12556b);
        parcel.writeString(this.f12557c);
        parcel.writeString(this.f12558d);
        parcel.writeByteArray(this.f12559e);
    }
}
