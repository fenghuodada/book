package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.metadata.a */
/* loaded from: classes.dex */
public final class C7042a implements Parcelable {
    public static final Parcelable.Creator<C7042a> CREATOR = new C7043a();

    /* renamed from: a */
    public final InterfaceC7044b[] f12490a;

    /* renamed from: com.google.android.exoplayer2.metadata.a$a */
    /* loaded from: classes.dex */
    public class C7043a implements Parcelable.Creator<C7042a> {
        @Override // android.os.Parcelable.Creator
        public final C7042a createFromParcel(Parcel parcel) {
            return new C7042a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7042a[] newArray(int i) {
            return new C7042a[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7044b extends Parcelable {
        @Nullable
        /* renamed from: G */
        byte[] mo5510G();

        /* renamed from: a */
        void mo5509a(MediaMetadata.C6623a c6623a);

        @Nullable
        /* renamed from: o */
        C7003m0 mo5508o();
    }

    public C7042a(Parcel parcel) {
        this.f12490a = new InterfaceC7044b[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC7044b[] interfaceC7044bArr = this.f12490a;
            if (i >= interfaceC7044bArr.length) {
                return;
            }
            interfaceC7044bArr[i] = (InterfaceC7044b) parcel.readParcelable(InterfaceC7044b.class.getClassLoader());
            i++;
        }
    }

    public C7042a(ArrayList arrayList) {
        this.f12490a = (InterfaceC7044b[]) arrayList.toArray(new InterfaceC7044b[0]);
    }

    public C7042a(InterfaceC7044b... interfaceC7044bArr) {
        this.f12490a = interfaceC7044bArr;
    }

    /* renamed from: b */
    public final C7042a m5539b(InterfaceC7044b... interfaceC7044bArr) {
        if (interfaceC7044bArr.length == 0) {
            return this;
        }
        int i = C7408g0.f13905a;
        InterfaceC7044b[] interfaceC7044bArr2 = this.f12490a;
        Object[] copyOf = Arrays.copyOf(interfaceC7044bArr2, interfaceC7044bArr2.length + interfaceC7044bArr.length);
        System.arraycopy(interfaceC7044bArr, 0, copyOf, interfaceC7044bArr2.length, interfaceC7044bArr.length);
        return new C7042a((InterfaceC7044b[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7042a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12490a, ((C7042a) obj).f12490a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12490a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f12490a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC7044b[] interfaceC7044bArr = this.f12490a;
        parcel.writeInt(interfaceC7044bArr.length);
        for (InterfaceC7044b interfaceC7044b : interfaceC7044bArr) {
            parcel.writeParcelable(interfaceC7044b, 0);
        }
    }
}
