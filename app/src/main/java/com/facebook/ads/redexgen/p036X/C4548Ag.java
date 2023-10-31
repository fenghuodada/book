package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Ag */
/* loaded from: assets/audience_network.dex */
public final class C4548Ag {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC4569B1 A03;
    public final C4829FY A04;
    public final TrackGroupArray A05;
    public final C4945HU A06;
    @Nullable
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C4548Ag(AbstractC4569B1 abstractC4569B1, long j, TrackGroupArray trackGroupArray, C4945HU c4945hu) {
        this(abstractC4569B1, null, new C4829FY(0), j, -9223372036854775807L, 1, false, trackGroupArray, c4945hu);
    }

    public C4548Ag(AbstractC4569B1 abstractC4569B1, @Nullable Object obj, C4829FY c4829fy, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C4945HU c4945hu) {
        this.A03 = abstractC4569B1;
        this.A07 = obj;
        this.A04 = c4829fy;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c4945hu;
    }

    public static void A00(C4548Ag c4548Ag, C4548Ag c4548Ag2) {
        c4548Ag2.A0A = c4548Ag.A0A;
        c4548Ag2.A09 = c4548Ag.A09;
    }

    public final C4548Ag A01(int i) {
        C4548Ag c4548Ag = new C4548Ag(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c4548Ag);
        return c4548Ag;
    }

    public final C4548Ag A02(int i) {
        C4548Ag c4548Ag = new C4548Ag(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, c4548Ag);
        return c4548Ag;
    }

    public final C4548Ag A03(AbstractC4569B1 abstractC4569B1, Object obj) {
        C4548Ag c4548Ag = new C4548Ag(abstractC4569B1, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c4548Ag);
        return c4548Ag;
    }

    public final C4548Ag A04(C4829FY c4829fy, long j, long j2) {
        long j3 = j2;
        AbstractC4569B1 abstractC4569B1 = this.A03;
        Object obj = this.A07;
        if (!c4829fy.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C4548Ag(abstractC4569B1, obj, c4829fy, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C4548Ag A05(TrackGroupArray trackGroupArray, C4945HU c4945hu) {
        C4548Ag c4548Ag = new C4548Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c4945hu);
        A00(this, c4548Ag);
        return c4548Ag;
    }

    public final C4548Ag A06(boolean z) {
        C4548Ag c4548Ag = new C4548Ag(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, c4548Ag);
        return c4548Ag;
    }
}
