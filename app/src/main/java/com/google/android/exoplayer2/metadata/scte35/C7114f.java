package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.f */
/* loaded from: classes.dex */
public final class C7114f extends AbstractC7107b {
    public static final Parcelable.Creator<C7114f> CREATOR = new C7115a();

    /* renamed from: a */
    public final List<C7117c> f12617a;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.f$a */
    /* loaded from: classes.dex */
    public class C7115a implements Parcelable.Creator<C7114f> {
        @Override // android.os.Parcelable.Creator
        public final C7114f createFromParcel(Parcel parcel) {
            return new C7114f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7114f[] newArray(int i) {
            return new C7114f[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.f$b */
    /* loaded from: classes.dex */
    public static final class C7116b {

        /* renamed from: a */
        public final int f12618a;

        /* renamed from: b */
        public final long f12619b;

        public C7116b(int i, long j) {
            this.f12618a = i;
            this.f12619b = j;
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.f$c */
    /* loaded from: classes.dex */
    public static final class C7117c {

        /* renamed from: a */
        public final long f12620a;

        /* renamed from: b */
        public final boolean f12621b;

        /* renamed from: c */
        public final boolean f12622c;

        /* renamed from: d */
        public final boolean f12623d;

        /* renamed from: e */
        public final long f12624e;

        /* renamed from: f */
        public final List<C7116b> f12625f;

        /* renamed from: g */
        public final boolean f12626g;

        /* renamed from: h */
        public final long f12627h;

        /* renamed from: i */
        public final int f12628i;

        /* renamed from: j */
        public final int f12629j;

        /* renamed from: k */
        public final int f12630k;

        public C7117c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f12620a = j;
            this.f12621b = z;
            this.f12622c = z2;
            this.f12623d = z3;
            this.f12625f = Collections.unmodifiableList(arrayList);
            this.f12624e = j2;
            this.f12626g = z4;
            this.f12627h = j3;
            this.f12628i = i;
            this.f12629j = i2;
            this.f12630k = i3;
        }

        public C7117c(Parcel parcel) {
            this.f12620a = parcel.readLong();
            this.f12621b = parcel.readByte() == 1;
            this.f12622c = parcel.readByte() == 1;
            this.f12623d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new C7116b(parcel.readInt(), parcel.readLong()));
            }
            this.f12625f = Collections.unmodifiableList(arrayList);
            this.f12624e = parcel.readLong();
            this.f12626g = parcel.readByte() == 1;
            this.f12627h = parcel.readLong();
            this.f12628i = parcel.readInt();
            this.f12629j = parcel.readInt();
            this.f12630k = parcel.readInt();
        }
    }

    public C7114f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C7117c(parcel));
        }
        this.f12617a = Collections.unmodifiableList(arrayList);
    }

    public C7114f(ArrayList arrayList) {
        this.f12617a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<C7117c> list = this.f12617a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C7117c c7117c = list.get(i2);
            parcel.writeLong(c7117c.f12620a);
            parcel.writeByte(c7117c.f12621b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c7117c.f12622c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c7117c.f12623d ? (byte) 1 : (byte) 0);
            List<C7116b> list2 = c7117c.f12625f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C7116b c7116b = list2.get(i3);
                parcel.writeInt(c7116b.f12618a);
                parcel.writeLong(c7116b.f12619b);
            }
            parcel.writeLong(c7117c.f12624e);
            parcel.writeByte(c7117c.f12626g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c7117c.f12627h);
            parcel.writeInt(c7117c.f12628i);
            parcel.writeInt(c7117c.f12629j);
            parcel.writeInt(c7117c.f12630k);
        }
    }
}
