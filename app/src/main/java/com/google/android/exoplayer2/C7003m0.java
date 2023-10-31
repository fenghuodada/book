package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.drm.C6775c0;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.drm.InterfaceC6800u;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.C7445b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.m0 */
/* loaded from: classes.dex */
public final class C7003m0 implements Parcelable {
    public static final Parcelable.Creator<C7003m0> CREATOR = new C7004a();

    /* renamed from: A */
    public final int f12270A;

    /* renamed from: B */
    public final int f12271B;

    /* renamed from: C */
    public final int f12272C;

    /* renamed from: D */
    public final int f12273D;
    @Nullable

    /* renamed from: E */
    public final Class<? extends InterfaceC6800u> f12274E;

    /* renamed from: F */
    public int f12275F;
    @Nullable

    /* renamed from: a */
    public final String f12276a;
    @Nullable

    /* renamed from: b */
    public final String f12277b;
    @Nullable

    /* renamed from: c */
    public final String f12278c;

    /* renamed from: d */
    public final int f12279d;

    /* renamed from: e */
    public final int f12280e;

    /* renamed from: f */
    public final int f12281f;

    /* renamed from: g */
    public final int f12282g;

    /* renamed from: h */
    public final int f12283h;
    @Nullable

    /* renamed from: i */
    public final String f12284i;
    @Nullable

    /* renamed from: j */
    public final C7042a f12285j;
    @Nullable

    /* renamed from: k */
    public final String f12286k;
    @Nullable

    /* renamed from: l */
    public final String f12287l;

    /* renamed from: m */
    public final int f12288m;

    /* renamed from: n */
    public final List<byte[]> f12289n;
    @Nullable

    /* renamed from: o */
    public final C6779g f12290o;

    /* renamed from: p */
    public final long f12291p;

    /* renamed from: q */
    public final int f12292q;

    /* renamed from: r */
    public final int f12293r;

    /* renamed from: s */
    public final float f12294s;

    /* renamed from: t */
    public final int f12295t;

    /* renamed from: u */
    public final float f12296u;
    @Nullable

    /* renamed from: v */
    public final byte[] f12297v;

    /* renamed from: w */
    public final int f12298w;
    @Nullable

    /* renamed from: x */
    public final C7445b f12299x;

    /* renamed from: y */
    public final int f12300y;

    /* renamed from: z */
    public final int f12301z;

    /* renamed from: com.google.android.exoplayer2.m0$a */
    /* loaded from: classes.dex */
    public class C7004a implements Parcelable.Creator<C7003m0> {
        @Override // android.os.Parcelable.Creator
        public final C7003m0 createFromParcel(Parcel parcel) {
            return new C7003m0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7003m0[] newArray(int i) {
            return new C7003m0[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.m0$b */
    /* loaded from: classes.dex */
    public static final class C7005b {

        /* renamed from: A */
        public int f12302A;

        /* renamed from: B */
        public int f12303B;

        /* renamed from: C */
        public int f12304C;
        @Nullable

        /* renamed from: D */
        public Class<? extends InterfaceC6800u> f12305D;
        @Nullable

        /* renamed from: a */
        public String f12306a;
        @Nullable

        /* renamed from: b */
        public String f12307b;
        @Nullable

        /* renamed from: c */
        public String f12308c;

        /* renamed from: d */
        public int f12309d;

        /* renamed from: e */
        public final int f12310e;

        /* renamed from: f */
        public int f12311f;

        /* renamed from: g */
        public int f12312g;
        @Nullable

        /* renamed from: h */
        public String f12313h;
        @Nullable

        /* renamed from: i */
        public C7042a f12314i;
        @Nullable

        /* renamed from: j */
        public String f12315j;
        @Nullable

        /* renamed from: k */
        public String f12316k;

        /* renamed from: l */
        public int f12317l;
        @Nullable

        /* renamed from: m */
        public List<byte[]> f12318m;
        @Nullable

        /* renamed from: n */
        public C6779g f12319n;

        /* renamed from: o */
        public long f12320o;

        /* renamed from: p */
        public int f12321p;

        /* renamed from: q */
        public int f12322q;

        /* renamed from: r */
        public float f12323r;

        /* renamed from: s */
        public int f12324s;

        /* renamed from: t */
        public float f12325t;
        @Nullable

        /* renamed from: u */
        public byte[] f12326u;

        /* renamed from: v */
        public int f12327v;
        @Nullable

        /* renamed from: w */
        public C7445b f12328w;

        /* renamed from: x */
        public int f12329x;

        /* renamed from: y */
        public int f12330y;

        /* renamed from: z */
        public int f12331z;

        public C7005b() {
            this.f12311f = -1;
            this.f12312g = -1;
            this.f12317l = -1;
            this.f12320o = Long.MAX_VALUE;
            this.f12321p = -1;
            this.f12322q = -1;
            this.f12323r = -1.0f;
            this.f12325t = 1.0f;
            this.f12327v = -1;
            this.f12329x = -1;
            this.f12330y = -1;
            this.f12331z = -1;
            this.f12304C = -1;
        }

        public C7005b(C7003m0 c7003m0) {
            this.f12306a = c7003m0.f12276a;
            this.f12307b = c7003m0.f12277b;
            this.f12308c = c7003m0.f12278c;
            this.f12309d = c7003m0.f12279d;
            this.f12310e = c7003m0.f12280e;
            this.f12311f = c7003m0.f12281f;
            this.f12312g = c7003m0.f12282g;
            this.f12313h = c7003m0.f12284i;
            this.f12314i = c7003m0.f12285j;
            this.f12315j = c7003m0.f12286k;
            this.f12316k = c7003m0.f12287l;
            this.f12317l = c7003m0.f12288m;
            this.f12318m = c7003m0.f12289n;
            this.f12319n = c7003m0.f12290o;
            this.f12320o = c7003m0.f12291p;
            this.f12321p = c7003m0.f12292q;
            this.f12322q = c7003m0.f12293r;
            this.f12323r = c7003m0.f12294s;
            this.f12324s = c7003m0.f12295t;
            this.f12325t = c7003m0.f12296u;
            this.f12326u = c7003m0.f12297v;
            this.f12327v = c7003m0.f12298w;
            this.f12328w = c7003m0.f12299x;
            this.f12329x = c7003m0.f12300y;
            this.f12330y = c7003m0.f12301z;
            this.f12331z = c7003m0.f12270A;
            this.f12302A = c7003m0.f12271B;
            this.f12303B = c7003m0.f12272C;
            this.f12304C = c7003m0.f12273D;
            this.f12305D = c7003m0.f12274E;
        }

        /* renamed from: a */
        public final C7003m0 m5614a() {
            return new C7003m0(this);
        }

        /* renamed from: b */
        public final void m5613b(int i) {
            this.f12306a = Integer.toString(i);
        }
    }

    public C7003m0(Parcel parcel) {
        this.f12276a = parcel.readString();
        this.f12277b = parcel.readString();
        this.f12278c = parcel.readString();
        this.f12279d = parcel.readInt();
        this.f12280e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f12281f = readInt;
        int readInt2 = parcel.readInt();
        this.f12282g = readInt2;
        this.f12283h = readInt2 != -1 ? readInt2 : readInt;
        this.f12284i = parcel.readString();
        this.f12285j = (C7042a) parcel.readParcelable(C7042a.class.getClassLoader());
        this.f12286k = parcel.readString();
        this.f12287l = parcel.readString();
        this.f12288m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f12289n = new ArrayList(readInt3);
        for (int i = 0; i < readInt3; i++) {
            List<byte[]> list = this.f12289n;
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            list.add(createByteArray);
        }
        C6779g c6779g = (C6779g) parcel.readParcelable(C6779g.class.getClassLoader());
        this.f12290o = c6779g;
        this.f12291p = parcel.readLong();
        this.f12292q = parcel.readInt();
        this.f12293r = parcel.readInt();
        this.f12294s = parcel.readFloat();
        this.f12295t = parcel.readInt();
        this.f12296u = parcel.readFloat();
        int i2 = C7408g0.f13905a;
        this.f12297v = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f12298w = parcel.readInt();
        this.f12299x = (C7445b) parcel.readParcelable(C7445b.class.getClassLoader());
        this.f12300y = parcel.readInt();
        this.f12301z = parcel.readInt();
        this.f12270A = parcel.readInt();
        this.f12271B = parcel.readInt();
        this.f12272C = parcel.readInt();
        this.f12273D = parcel.readInt();
        this.f12274E = c6779g != null ? C6775c0.class : null;
    }

    /* renamed from: b */
    public final C7005b m5616b() {
        return new C7005b(this);
    }

    /* renamed from: c */
    public final boolean m5615c(C7003m0 c7003m0) {
        List<byte[]> list = this.f12289n;
        if (list.size() != c7003m0.f12289n.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), c7003m0.f12289n.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7003m0.class != obj.getClass()) {
            return false;
        }
        C7003m0 c7003m0 = (C7003m0) obj;
        int i2 = this.f12275F;
        if (i2 == 0 || (i = c7003m0.f12275F) == 0 || i2 == i) {
            return this.f12279d == c7003m0.f12279d && this.f12280e == c7003m0.f12280e && this.f12281f == c7003m0.f12281f && this.f12282g == c7003m0.f12282g && this.f12288m == c7003m0.f12288m && this.f12291p == c7003m0.f12291p && this.f12292q == c7003m0.f12292q && this.f12293r == c7003m0.f12293r && this.f12295t == c7003m0.f12295t && this.f12298w == c7003m0.f12298w && this.f12300y == c7003m0.f12300y && this.f12301z == c7003m0.f12301z && this.f12270A == c7003m0.f12270A && this.f12271B == c7003m0.f12271B && this.f12272C == c7003m0.f12272C && this.f12273D == c7003m0.f12273D && Float.compare(this.f12294s, c7003m0.f12294s) == 0 && Float.compare(this.f12296u, c7003m0.f12296u) == 0 && C7408g0.m5105a(this.f12274E, c7003m0.f12274E) && C7408g0.m5105a(this.f12276a, c7003m0.f12276a) && C7408g0.m5105a(this.f12277b, c7003m0.f12277b) && C7408g0.m5105a(this.f12284i, c7003m0.f12284i) && C7408g0.m5105a(this.f12286k, c7003m0.f12286k) && C7408g0.m5105a(this.f12287l, c7003m0.f12287l) && C7408g0.m5105a(this.f12278c, c7003m0.f12278c) && Arrays.equals(this.f12297v, c7003m0.f12297v) && C7408g0.m5105a(this.f12285j, c7003m0.f12285j) && C7408g0.m5105a(this.f12299x, c7003m0.f12299x) && C7408g0.m5105a(this.f12290o, c7003m0.f12290o) && m5615c(c7003m0);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12275F == 0) {
            String str = this.f12276a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12277b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f12278c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f12279d) * 31) + this.f12280e) * 31) + this.f12281f) * 31) + this.f12282g) * 31;
            String str4 = this.f12284i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C7042a c7042a = this.f12285j;
            int hashCode5 = (hashCode4 + (c7042a == null ? 0 : c7042a.hashCode())) * 31;
            String str5 = this.f12286k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f12287l;
            int hashCode7 = str6 == null ? 0 : str6.hashCode();
            int floatToIntBits = (((((((((((((((Float.floatToIntBits(this.f12296u) + ((((Float.floatToIntBits(this.f12294s) + ((((((((((hashCode6 + hashCode7) * 31) + this.f12288m) * 31) + ((int) this.f12291p)) * 31) + this.f12292q) * 31) + this.f12293r) * 31)) * 31) + this.f12295t) * 31)) * 31) + this.f12298w) * 31) + this.f12300y) * 31) + this.f12301z) * 31) + this.f12270A) * 31) + this.f12271B) * 31) + this.f12272C) * 31) + this.f12273D) * 31;
            Class<? extends InterfaceC6800u> cls = this.f12274E;
            this.f12275F = floatToIntBits + (cls != null ? cls.hashCode() : 0);
        }
        return this.f12275F;
    }

    public final String toString() {
        String str = this.f12276a;
        int m12193a = C0552c.m12193a(str, 104);
        String str2 = this.f12277b;
        int m12193a2 = C0552c.m12193a(str2, m12193a);
        String str3 = this.f12286k;
        int m12193a3 = C0552c.m12193a(str3, m12193a2);
        String str4 = this.f12287l;
        int m12193a4 = C0552c.m12193a(str4, m12193a3);
        String str5 = this.f12284i;
        int m12193a5 = C0552c.m12193a(str5, m12193a4);
        String str6 = this.f12278c;
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str6, m12193a5), "Format(", str, ", ", str2);
        m9043a.append(", ");
        m9043a.append(str3);
        m9043a.append(", ");
        m9043a.append(str4);
        m9043a.append(", ");
        m9043a.append(str5);
        m9043a.append(", ");
        m9043a.append(this.f12283h);
        m9043a.append(", ");
        m9043a.append(str6);
        m9043a.append(", [");
        m9043a.append(this.f12292q);
        m9043a.append(", ");
        m9043a.append(this.f12293r);
        m9043a.append(", ");
        m9043a.append(this.f12294s);
        m9043a.append("], [");
        m9043a.append(this.f12300y);
        m9043a.append(", ");
        return C0539e.m12264b(m9043a, this.f12301z, "])");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12276a);
        parcel.writeString(this.f12277b);
        parcel.writeString(this.f12278c);
        parcel.writeInt(this.f12279d);
        parcel.writeInt(this.f12280e);
        parcel.writeInt(this.f12281f);
        parcel.writeInt(this.f12282g);
        parcel.writeString(this.f12284i);
        int i2 = 0;
        parcel.writeParcelable(this.f12285j, 0);
        parcel.writeString(this.f12286k);
        parcel.writeString(this.f12287l);
        parcel.writeInt(this.f12288m);
        List<byte[]> list = this.f12289n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(list.get(i3));
        }
        parcel.writeParcelable(this.f12290o, 0);
        parcel.writeLong(this.f12291p);
        parcel.writeInt(this.f12292q);
        parcel.writeInt(this.f12293r);
        parcel.writeFloat(this.f12294s);
        parcel.writeInt(this.f12295t);
        parcel.writeFloat(this.f12296u);
        byte[] bArr = this.f12297v;
        if (bArr != null) {
            i2 = 1;
        }
        int i4 = C7408g0.f13905a;
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f12298w);
        parcel.writeParcelable(this.f12299x, i);
        parcel.writeInt(this.f12300y);
        parcel.writeInt(this.f12301z);
        parcel.writeInt(this.f12270A);
        parcel.writeInt(this.f12271B);
        parcel.writeInt(this.f12272C);
        parcel.writeInt(this.f12273D);
    }

    public C7003m0(C7005b c7005b) {
        this.f12276a = c7005b.f12306a;
        this.f12277b = c7005b.f12307b;
        this.f12278c = C7408g0.m5084v(c7005b.f12308c);
        this.f12279d = c7005b.f12309d;
        this.f12280e = c7005b.f12310e;
        int i = c7005b.f12311f;
        this.f12281f = i;
        int i2 = c7005b.f12312g;
        this.f12282g = i2;
        this.f12283h = i2 != -1 ? i2 : i;
        this.f12284i = c7005b.f12313h;
        this.f12285j = c7005b.f12314i;
        this.f12286k = c7005b.f12315j;
        this.f12287l = c7005b.f12316k;
        this.f12288m = c7005b.f12317l;
        List<byte[]> list = c7005b.f12318m;
        this.f12289n = list == null ? Collections.emptyList() : list;
        C6779g c6779g = c7005b.f12319n;
        this.f12290o = c6779g;
        this.f12291p = c7005b.f12320o;
        this.f12292q = c7005b.f12321p;
        this.f12293r = c7005b.f12322q;
        this.f12294s = c7005b.f12323r;
        int i3 = c7005b.f12324s;
        this.f12295t = i3 == -1 ? 0 : i3;
        float f = c7005b.f12325t;
        this.f12296u = f == -1.0f ? 1.0f : f;
        this.f12297v = c7005b.f12326u;
        this.f12298w = c7005b.f12327v;
        this.f12299x = c7005b.f12328w;
        this.f12300y = c7005b.f12329x;
        this.f12301z = c7005b.f12330y;
        this.f12270A = c7005b.f12331z;
        int i4 = c7005b.f12302A;
        this.f12271B = i4 == -1 ? 0 : i4;
        int i5 = c7005b.f12303B;
        this.f12272C = i5 != -1 ? i5 : 0;
        this.f12273D = c7005b.f12304C;
        Class<? extends InterfaceC6800u> cls = c7005b.f12305D;
        if (cls == null && c6779g != null) {
            cls = C6775c0.class;
        }
        this.f12274E = cls;
    }
}
