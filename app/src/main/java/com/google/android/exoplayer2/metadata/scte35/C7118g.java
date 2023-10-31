package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.metadata.scte35.g */
/* loaded from: classes.dex */
public final class C7118g extends AbstractC7107b {
    public static final Parcelable.Creator<C7118g> CREATOR = new C7119a();

    /* renamed from: a */
    public final long f12631a;

    /* renamed from: b */
    public final long f12632b;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.g$a */
    /* loaded from: classes.dex */
    public class C7119a implements Parcelable.Creator<C7118g> {
        @Override // android.os.Parcelable.Creator
        public final C7118g createFromParcel(Parcel parcel) {
            return new C7118g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final C7118g[] newArray(int i) {
            return new C7118g[i];
        }
    }

    public C7118g(long j, long j2) {
        this.f12631a = j;
        this.f12632b = j2;
    }

    /* renamed from: b */
    public static long m5506b(long j, C7436v c7436v) {
        long m5002p = c7436v.m5002p();
        if ((128 & m5002p) != 0) {
            return 8589934591L & ((((m5002p & 1) << 32) | c7436v.m5001q()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12631a);
        parcel.writeLong(this.f12632b);
    }
}
