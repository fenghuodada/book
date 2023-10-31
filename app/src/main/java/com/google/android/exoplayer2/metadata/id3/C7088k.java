package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.k */
/* loaded from: classes.dex */
public final class C7088k extends AbstractC7083h {
    public static final Parcelable.Creator<C7088k> CREATOR = new C7089a();

    /* renamed from: b */
    public final String f12574b;

    /* renamed from: c */
    public final byte[] f12575c;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.k$a */
    /* loaded from: classes.dex */
    public class C7089a implements Parcelable.Creator<C7088k> {
        @Override // android.os.Parcelable.Creator
        public final C7088k createFromParcel(Parcel parcel) {
            return new C7088k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7088k[] newArray(int i) {
            return new C7088k[i];
        }
    }

    public C7088k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12574b = readString;
        this.f12575c = parcel.createByteArray();
    }

    public C7088k(String str, byte[] bArr) {
        super("PRIV");
        this.f12574b = str;
        this.f12575c = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7088k.class != obj.getClass()) {
            return false;
        }
        C7088k c7088k = (C7088k) obj;
        return C7408g0.m5105a(this.f12574b, c7088k.f12574b) && Arrays.equals(this.f12575c, c7088k.f12575c);
    }

    public final int hashCode() {
        String str = this.f12574b;
        return Arrays.hashCode(this.f12575c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 8);
        String str2 = this.f12574b;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str2, m12193a));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12574b);
        parcel.writeByteArray(this.f12575c);
    }
}
