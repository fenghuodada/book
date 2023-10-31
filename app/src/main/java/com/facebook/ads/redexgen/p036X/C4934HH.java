package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.HH */
/* loaded from: assets/audience_network.dex */
public final class C4934HH implements Comparable<C4934HH> {
    public static String[] A07 = {"UOhnAWHUvWrKh39blc2", "rJoZ4rjs3", "mwxErCj8CFXQtRdeT7I", "OMBsSVN1m", "xKR0iM7hb", "rY23JmNnbt4", "7JhRM9", "FTdecT"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    public C4934HH(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = C4614Bk.A0H(i, false) ? 1 : 0;
        this.A03 = C4614Bk.A0K(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C4934HH c4934hh) {
        int A01;
        int A012;
        int A013;
        int A014;
        int A015;
        int A016;
        int A017;
        int i = this.A05;
        int i2 = c4934hh.A05;
        if (i != i2) {
            A017 = C4614Bk.A01(i, i2);
            return A017;
        }
        int i3 = this.A03;
        int i4 = c4934hh.A03;
        if (i3 != i4) {
            A016 = C4614Bk.A01(i3, i4);
            return A016;
        }
        int i5 = this.A02;
        int i6 = c4934hh.A02;
        if (i5 != i6) {
            A015 = C4614Bk.A01(i5, i6);
            return A015;
        } else if (this.A06.A0D) {
            A014 = C4614Bk.A01(c4934hh.A00, this.A00);
            return A014;
        } else {
            int i7 = this.A05 != 1 ? -1 : 1;
            int i8 = this.A01;
            int i9 = c4934hh.A01;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "q1nzmC2W0";
            if (i8 != i9) {
                A013 = C4614Bk.A01(i8, i9);
                return A013 * i7;
            }
            int i10 = this.A04;
            int i11 = c4934hh.A04;
            if (i10 != i11) {
                A012 = C4614Bk.A01(i10, i11);
                return A012 * i7;
            }
            A01 = C4614Bk.A01(this.A00, c4934hh.A00);
            return A01 * i7;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4934HH c4934hh = (C4934HH) obj;
        if (this.A05 == c4934hh.A05 && this.A03 == c4934hh.A03 && this.A02 == c4934hh.A02 && this.A01 == c4934hh.A01 && this.A04 == c4934hh.A04) {
            int i = this.A00;
            if (A07[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "5gFFNpUtyAKNtlVcilC";
            strArr[2] = "oFDw9vE2Y7jHYxyqfLD";
            if (i == c4934hh.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = this.A04;
        return (((((((((this.A05 * 31) + this.A03) * 31) + result) * 31) + this.A01) * 31) + result2) * 31) + this.A00;
    }
}
