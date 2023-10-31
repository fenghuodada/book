package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.d */
/* loaded from: classes.dex */
public final class C7109d extends AbstractC7107b {
    public static final Parcelable.Creator<C7109d> CREATOR = new C7110a();

    /* renamed from: a */
    public final long f12601a;

    /* renamed from: b */
    public final boolean f12602b;

    /* renamed from: c */
    public final boolean f12603c;

    /* renamed from: d */
    public final boolean f12604d;

    /* renamed from: e */
    public final boolean f12605e;

    /* renamed from: f */
    public final long f12606f;

    /* renamed from: g */
    public final long f12607g;

    /* renamed from: h */
    public final List<C7111b> f12608h;

    /* renamed from: i */
    public final boolean f12609i;

    /* renamed from: j */
    public final long f12610j;

    /* renamed from: k */
    public final int f12611k;

    /* renamed from: l */
    public final int f12612l;

    /* renamed from: m */
    public final int f12613m;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.d$a */
    /* loaded from: classes.dex */
    public class C7110a implements Parcelable.Creator<C7109d> {
        @Override // android.os.Parcelable.Creator
        public final C7109d createFromParcel(Parcel parcel) {
            return new C7109d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7109d[] newArray(int i) {
            return new C7109d[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.d$b */
    /* loaded from: classes.dex */
    public static final class C7111b {

        /* renamed from: a */
        public final int f12614a;

        /* renamed from: b */
        public final long f12615b;

        /* renamed from: c */
        public final long f12616c;

        public C7111b(int i, long j, long j2) {
            this.f12614a = i;
            this.f12615b = j;
            this.f12616c = j2;
        }
    }

    public C7109d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C7111b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f12601a = j;
        this.f12602b = z;
        this.f12603c = z2;
        this.f12604d = z3;
        this.f12605e = z4;
        this.f12606f = j2;
        this.f12607g = j3;
        this.f12608h = Collections.unmodifiableList(list);
        this.f12609i = z5;
        this.f12610j = j4;
        this.f12611k = i;
        this.f12612l = i2;
        this.f12613m = i3;
    }

    public C7109d(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f12601a = parcel.readLong();
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f12602b = z;
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f12603c = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f12604d = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f12605e = z4;
        this.f12606f = parcel.readLong();
        this.f12607g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new C7111b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f12608h = Collections.unmodifiableList(arrayList);
        this.f12609i = parcel.readByte() == 1;
        this.f12610j = parcel.readLong();
        this.f12611k = parcel.readInt();
        this.f12612l = parcel.readInt();
        this.f12613m = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12601a);
        parcel.writeByte(this.f12602b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12603c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12604d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f12605e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12606f);
        parcel.writeLong(this.f12607g);
        List<C7111b> list = this.f12608h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C7111b c7111b = list.get(i2);
            parcel.writeInt(c7111b.f12614a);
            parcel.writeLong(c7111b.f12615b);
            parcel.writeLong(c7111b.f12616c);
        }
        parcel.writeByte(this.f12609i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f12610j);
        parcel.writeInt(this.f12611k);
        parcel.writeInt(this.f12612l);
        parcel.writeInt(this.f12613m);
    }
}
