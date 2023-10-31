package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0406q1;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.g */
/* loaded from: classes.dex */
public final class C6779g implements Comparator<C6781b>, Parcelable {
    public static final Parcelable.Creator<C6779g> CREATOR = new C6780a();

    /* renamed from: a */
    public final C6781b[] f11018a;

    /* renamed from: b */
    public int f11019b;
    @Nullable

    /* renamed from: c */
    public final String f11020c;

    /* renamed from: d */
    public final int f11021d;

    /* renamed from: com.google.android.exoplayer2.drm.g$a */
    /* loaded from: classes.dex */
    public class C6780a implements Parcelable.Creator<C6779g> {
        @Override // android.os.Parcelable.Creator
        public final C6779g createFromParcel(Parcel parcel) {
            return new C6779g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C6779g[] newArray(int i) {
            return new C6779g[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.g$b */
    /* loaded from: classes.dex */
    public static final class C6781b implements Parcelable {
        public static final Parcelable.Creator<C6781b> CREATOR = new C6782a();

        /* renamed from: a */
        public int f11022a;

        /* renamed from: b */
        public final UUID f11023b;
        @Nullable

        /* renamed from: c */
        public final String f11024c;

        /* renamed from: d */
        public final String f11025d;
        @Nullable

        /* renamed from: e */
        public final byte[] f11026e;

        /* renamed from: com.google.android.exoplayer2.drm.g$b$a */
        /* loaded from: classes.dex */
        public class C6782a implements Parcelable.Creator<C6781b> {
            @Override // android.os.Parcelable.Creator
            public final C6781b createFromParcel(Parcel parcel) {
                return new C6781b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final C6781b[] newArray(int i) {
                return new C6781b[i];
            }
        }

        public C6781b() {
            throw null;
        }

        public C6781b(Parcel parcel) {
            this.f11023b = new UUID(parcel.readLong(), parcel.readLong());
            this.f11024c = parcel.readString();
            String readString = parcel.readString();
            int i = C7408g0.f13905a;
            this.f11025d = readString;
            this.f11026e = parcel.createByteArray();
        }

        public C6781b(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            uuid.getClass();
            this.f11023b = uuid;
            this.f11024c = str;
            str2.getClass();
            this.f11025d = str2;
            this.f11026e = bArr;
        }

        /* renamed from: b */
        public final boolean m5993b(UUID uuid) {
            UUID uuid2 = C6622C.f10466a;
            UUID uuid3 = this.f11023b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj instanceof C6781b) {
                if (obj == this) {
                    return true;
                }
                C6781b c6781b = (C6781b) obj;
                return C7408g0.m5105a(this.f11024c, c6781b.f11024c) && C7408g0.m5105a(this.f11025d, c6781b.f11025d) && C7408g0.m5105a(this.f11023b, c6781b.f11023b) && Arrays.equals(this.f11026e, c6781b.f11026e);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f11022a == 0) {
                int hashCode2 = this.f11023b.hashCode() * 31;
                String str = this.f11024c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f11022a = Arrays.hashCode(this.f11026e) + C0406q1.m12537a(this.f11025d, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f11022a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f11023b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f11024c);
            parcel.writeString(this.f11025d);
            parcel.writeByteArray(this.f11026e);
        }
    }

    public C6779g() {
        throw null;
    }

    public C6779g(Parcel parcel) {
        this.f11020c = parcel.readString();
        C6781b[] c6781bArr = (C6781b[]) parcel.createTypedArray(C6781b.CREATOR);
        int i = C7408g0.f13905a;
        this.f11018a = c6781bArr;
        this.f11021d = c6781bArr.length;
    }

    public C6779g(@Nullable String str, boolean z, C6781b... c6781bArr) {
        this.f11020c = str;
        c6781bArr = z ? (C6781b[]) c6781bArr.clone() : c6781bArr;
        this.f11018a = c6781bArr;
        this.f11021d = c6781bArr.length;
        Arrays.sort(c6781bArr, this);
    }

    /* renamed from: b */
    public final C6779g m5994b(@Nullable String str) {
        return C7408g0.m5105a(this.f11020c, str) ? this : new C6779g(str, false, this.f11018a);
    }

    @Override // java.util.Comparator
    public final int compare(C6781b c6781b, C6781b c6781b2) {
        C6781b c6781b3 = c6781b;
        C6781b c6781b4 = c6781b2;
        UUID uuid = C6622C.f10466a;
        if (uuid.equals(c6781b3.f11023b)) {
            if (uuid.equals(c6781b4.f11023b)) {
                return 0;
            }
            return 1;
        }
        return c6781b3.f11023b.compareTo(c6781b4.f11023b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6779g.class != obj.getClass()) {
            return false;
        }
        C6779g c6779g = (C6779g) obj;
        return C7408g0.m5105a(this.f11020c, c6779g.f11020c) && Arrays.equals(this.f11018a, c6779g.f11018a);
    }

    public final int hashCode() {
        if (this.f11019b == 0) {
            String str = this.f11020c;
            this.f11019b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f11018a);
        }
        return this.f11019b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11020c);
        parcel.writeTypedArray(this.f11018a, 0);
    }
}
