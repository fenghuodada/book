package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.id3.j */
/* loaded from: classes.dex */
public final class C7086j extends AbstractC7083h {
    public static final Parcelable.Creator<C7086j> CREATOR = new C7087a();

    /* renamed from: b */
    public final int f12569b;

    /* renamed from: c */
    public final int f12570c;

    /* renamed from: d */
    public final int f12571d;

    /* renamed from: e */
    public final int[] f12572e;

    /* renamed from: f */
    public final int[] f12573f;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.j$a */
    /* loaded from: classes.dex */
    public class C7087a implements Parcelable.Creator<C7086j> {
        @Override // android.os.Parcelable.Creator
        public final C7086j createFromParcel(Parcel parcel) {
            return new C7086j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7086j[] newArray(int i) {
            return new C7086j[i];
        }
    }

    public C7086j(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f12569b = i;
        this.f12570c = i2;
        this.f12571d = i3;
        this.f12572e = iArr;
        this.f12573f = iArr2;
    }

    public C7086j(Parcel parcel) {
        super("MLLT");
        this.f12569b = parcel.readInt();
        this.f12570c = parcel.readInt();
        this.f12571d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = C7408g0.f13905a;
        this.f12572e = createIntArray;
        this.f12573f = parcel.createIntArray();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.AbstractC7083h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7086j.class != obj.getClass()) {
            return false;
        }
        C7086j c7086j = (C7086j) obj;
        return this.f12569b == c7086j.f12569b && this.f12570c == c7086j.f12570c && this.f12571d == c7086j.f12571d && Arrays.equals(this.f12572e, c7086j.f12572e) && Arrays.equals(this.f12573f, c7086j.f12573f);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f12572e);
        return Arrays.hashCode(this.f12573f) + ((hashCode + ((((((527 + this.f12569b) * 31) + this.f12570c) * 31) + this.f12571d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12569b);
        parcel.writeInt(this.f12570c);
        parcel.writeInt(this.f12571d);
        parcel.writeIntArray(this.f12572e);
        parcel.writeIntArray(this.f12573f);
    }
}
