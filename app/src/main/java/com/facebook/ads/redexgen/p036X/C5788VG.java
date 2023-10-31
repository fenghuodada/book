package com.facebook.ads.redexgen.p036X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.VG */
/* loaded from: assets/audience_network.dex */
public final class C5788VG implements InterfaceC4889GY {
    public static byte[] A04;
    public final int A00;
    public final List<C5789VH> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public C5788VG(List<C5789VH> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i = 0; i < this.A00; i++) {
            C5789VH c5789vh = list.get(i);
            int i2 = i * 2;
            this.A02[i2] = c5789vh.A01;
            this.A02[i2 + 1] = c5789vh.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final List<C4888GX> A6B(long j) {
        ArrayList arrayList = null;
        C5789VH cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i = 0; i < this.A00; i++) {
            long[] jArr = this.A02;
            if (jArr[i * 2] <= j && j < jArr[(i * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C5789VH c5789vh = this.A01.get(i);
                if (c5789vh.A00()) {
                    if (cue == null) {
                        cue = c5789vh;
                    } else {
                        String A00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) A00).append(c5789vh.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(c5789vh.A0C);
                        }
                    }
                } else {
                    arrayList.add(c5789vh);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new C5789VH(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final long A6b(int i) {
        boolean z = true;
        C4997IK.A03(i >= 0);
        if (i >= this.A03.length) {
            z = false;
        }
        C4997IK.A03(z);
        return this.A03[i];
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4889GY
    public final int A70(long j) {
        int A0A = C5038Iz.A0A(this.A03, j, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
