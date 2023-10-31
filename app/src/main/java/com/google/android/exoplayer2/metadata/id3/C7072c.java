package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.c */
/* loaded from: classes.dex */
public final class C7072c extends AbstractC7083h {
    public static final Parcelable.Creator<C7072c> CREATOR = new C7073a();

    /* renamed from: b */
    public final String f12542b;

    /* renamed from: c */
    public final int f12543c;

    /* renamed from: d */
    public final int f12544d;

    /* renamed from: e */
    public final long f12545e;

    /* renamed from: f */
    public final long f12546f;

    /* renamed from: g */
    public final AbstractC7083h[] f12547g;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.c$a */
    /* loaded from: classes.dex */
    public class C7073a implements Parcelable.Creator<C7072c> {
        @Override // android.os.Parcelable.Creator
        public final C7072c createFromParcel(Parcel parcel) {
            return new C7072c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7072c[] newArray(int i) {
            return new C7072c[i];
        }
    }

    public C7072c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = C7408g0.f13905a;
        this.f12542b = readString;
        this.f12543c = parcel.readInt();
        this.f12544d = parcel.readInt();
        this.f12545e = parcel.readLong();
        this.f12546f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f12547g = new AbstractC7083h[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f12547g[i2] = (AbstractC7083h) parcel.readParcelable(AbstractC7083h.class.getClassLoader());
        }
    }

    public C7072c(String str, int i, int i2, long j, long j2, AbstractC7083h[] abstractC7083hArr) {
        super("CHAP");
        this.f12542b = str;
        this.f12543c = i;
        this.f12544d = i2;
        this.f12545e = j;
        this.f12546f = j2;
        this.f12547g = abstractC7083hArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7072c.class != obj.getClass()) {
            return false;
        }
        C7072c c7072c = (C7072c) obj;
        return this.f12543c == c7072c.f12543c && this.f12544d == c7072c.f12544d && this.f12545e == c7072c.f12545e && this.f12546f == c7072c.f12546f && C7408g0.m5105a(this.f12542b, c7072c.f12542b) && Arrays.equals(this.f12547g, c7072c.f12547g);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f12543c) * 31) + this.f12544d) * 31) + ((int) this.f12545e)) * 31) + ((int) this.f12546f)) * 31;
        String str = this.f12542b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12542b);
        parcel.writeInt(this.f12543c);
        parcel.writeInt(this.f12544d);
        parcel.writeLong(this.f12545e);
        parcel.writeLong(this.f12546f);
        AbstractC7083h[] abstractC7083hArr = this.f12547g;
        parcel.writeInt(abstractC7083hArr.length);
        for (AbstractC7083h abstractC7083h : abstractC7083hArr) {
            parcel.writeParcelable(abstractC7083h, 0);
        }
    }
}
