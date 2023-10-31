package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.b */
/* loaded from: classes.dex */
public final class C7070b extends AbstractC7083h {
    public static final Parcelable.Creator<C7070b> CREATOR = new C7071a();

    /* renamed from: b */
    public final byte[] f12541b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.b$a */
    /* loaded from: classes.dex */
    public class C7071a implements Parcelable.Creator<C7070b> {
        @Override // android.os.Parcelable.Creator
        public final C7070b createFromParcel(Parcel parcel) {
            return new C7070b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7070b[] newArray(int i) {
            return new C7070b[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7070b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f12541b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7070b.<init>(android.os.Parcel):void");
    }

    public C7070b(String str, byte[] bArr) {
        super(str);
        this.f12541b = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7070b.class != obj.getClass()) {
            return false;
        }
        C7070b c7070b = (C7070b) obj;
        return this.f12565a.equals(c7070b.f12565a) && Arrays.equals(this.f12541b, c7070b.f12541b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12541b) + C0406q1.m12537a(this.f12565a, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12565a);
        parcel.writeByteArray(this.f12541b);
    }
}
