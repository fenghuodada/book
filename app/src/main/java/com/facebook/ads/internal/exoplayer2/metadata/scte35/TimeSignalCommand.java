package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p036X.C4776Ef;
import com.facebook.ads.redexgen.p036X.C5022Ij;
import com.facebook.ads.redexgen.p036X.C5034Iv;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C4776Ef();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C4776Ef c4776Ef) {
        this(j, j2);
    }

    public static long A00(C5022Ij c5022Ij, long j) {
        long A0E = c5022Ij.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        return (((ptsTime << 32) | c5022Ij.A0M()) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C5022Ij c5022Ij, long j, C5034Iv c5034Iv) {
        long A00 = A00(c5022Ij, j);
        return new TimeSignalCommand(A00, c5034Iv.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
