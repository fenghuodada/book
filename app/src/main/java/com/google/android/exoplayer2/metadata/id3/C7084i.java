package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.metadata.id3.i */
/* loaded from: classes.dex */
public final class C7084i extends AbstractC7083h {
    public static final Parcelable.Creator<C7084i> CREATOR = new C7085a();

    /* renamed from: b */
    public final String f12566b;

    /* renamed from: c */
    public final String f12567c;

    /* renamed from: d */
    public final String f12568d;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.i$a */
    /* loaded from: classes.dex */
    public class C7085a implements Parcelable.Creator<C7084i> {
        @Override // android.os.Parcelable.Creator
        public final C7084i createFromParcel(Parcel parcel) {
            return new C7084i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7084i[] newArray(int i) {
            return new C7084i[i];
        }
    }

    public C7084i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12566b = readString;
        this.f12567c = parcel.readString();
        this.f12568d = parcel.readString();
    }

    public C7084i(String str, String str2, String str3) {
        super("----");
        this.f12566b = str;
        this.f12567c = str2;
        this.f12568d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7084i.class != obj.getClass()) {
            return false;
        }
        C7084i c7084i = (C7084i) obj;
        return C7408g0.m5105a(this.f12567c, c7084i.f12567c) && C7408g0.m5105a(this.f12566b, c7084i.f12566b) && C7408g0.m5105a(this.f12568d, c7084i.f12568d);
    }

    public final int hashCode() {
        String str = this.f12566b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12567c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12568d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h
    public final String toString() {
        String str = this.f12565a;
        int m12193a = C0552c.m12193a(str, 23);
        String str2 = this.f12566b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12567c;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str3, m12193a2), str, ": domain=", str2, ", description=");
        m9043a.append(str3);
        return m9043a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12565a);
        parcel.writeString(this.f12566b);
        parcel.writeString(this.f12568d);
    }
}
