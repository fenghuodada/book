package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.d */
/* loaded from: classes.dex */
public final class C7074d extends AbstractC7083h {
    public static final Parcelable.Creator<C7074d> CREATOR = new C7075a();

    /* renamed from: b */
    public final String f12548b;

    /* renamed from: c */
    public final boolean f12549c;

    /* renamed from: d */
    public final boolean f12550d;

    /* renamed from: e */
    public final String[] f12551e;

    /* renamed from: f */
    public final AbstractC7083h[] f12552f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.d$a */
    /* loaded from: classes.dex */
    public class C7075a implements Parcelable.Creator<C7074d> {
        @Override // android.os.Parcelable.Creator
        public final C7074d createFromParcel(Parcel parcel) {
            return new C7074d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7074d[] newArray(int i) {
            return new C7074d[i];
        }
    }

    public C7074d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12548b = readString;
        this.f12549c = parcel.readByte() != 0;
        this.f12550d = parcel.readByte() != 0;
        this.f12551e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f12552f = new AbstractC7083h[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f12552f[i2] = (AbstractC7083h) parcel.readParcelable(AbstractC7083h.class.getClassLoader());
        }
    }

    public C7074d(String str, boolean z, boolean z2, String[] strArr, AbstractC7083h[] abstractC7083hArr) {
        super("CTOC");
        this.f12548b = str;
        this.f12549c = z;
        this.f12550d = z2;
        this.f12551e = strArr;
        this.f12552f = abstractC7083hArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7074d.class != obj.getClass()) {
            return false;
        }
        C7074d c7074d = (C7074d) obj;
        return this.f12549c == c7074d.f12549c && this.f12550d == c7074d.f12550d && C7408g0.m5105a(this.f12548b, c7074d.f12548b) && Arrays.equals(this.f12551e, c7074d.f12551e) && Arrays.equals(this.f12552f, c7074d.f12552f);
    }

    public final int hashCode() {
        int i = (((527 + (this.f12549c ? 1 : 0)) * 31) + (this.f12550d ? 1 : 0)) * 31;
        String str = this.f12548b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12548b);
        parcel.writeByte(this.f12549c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12550d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f12551e);
        AbstractC7083h[] abstractC7083hArr = this.f12552f;
        parcel.writeInt(abstractC7083hArr.length);
        for (AbstractC7083h abstractC7083h : abstractC7083hArr) {
            parcel.writeParcelable(abstractC7083h, 0);
        }
    }
}
