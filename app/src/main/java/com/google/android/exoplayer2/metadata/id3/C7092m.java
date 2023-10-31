package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.motion.widget.C0552c;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.id3.m */
/* loaded from: classes.dex */
public final class C7092m extends AbstractC7083h {
    public static final Parcelable.Creator<C7092m> CREATOR = new C7093a();
    @Nullable

    /* renamed from: b */
    public final String f12578b;

    /* renamed from: c */
    public final String f12579c;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.m$a */
    /* loaded from: classes.dex */
    public class C7093a implements Parcelable.Creator<C7092m> {
        @Override // android.os.Parcelable.Creator
        public final C7092m createFromParcel(Parcel parcel) {
            return new C7092m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7092m[] newArray(int i) {
            return new C7092m[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7092m(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.C7408g0.f13905a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f12578b = r0
            java.lang.String r3 = r3.readString()
            r2.f12579c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7092m.<init>(android.os.Parcel):void");
    }

    public C7092m(String str, @Nullable String str2, String str3) {
        super(str);
        this.f12578b = str2;
        this.f12579c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7092m.class != obj.getClass()) {
            return false;
        }
        C7092m c7092m = (C7092m) obj;
        return this.f12565a.equals(c7092m.f12565a) && C7408g0.m5105a(this.f12578b, c7092m.f12578b) && C7408g0.m5105a(this.f12579c, c7092m.f12579c);
    }

    public final int hashCode() {
        int i;
        int m12537a = C0406q1.m12537a(this.f12565a, 527, 31);
        int i2 = 0;
        String str = this.f12578b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (m12537a + i) * 31;
        String str2 = this.f12579c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 6);
        String str2 = this.f12579c;
        StringBuilder sb = new StringBuilder(C0552c.m12193a(str2, m12193a));
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12565a);
        parcel.writeString(this.f12578b);
        parcel.writeString(this.f12579c);
    }
}
