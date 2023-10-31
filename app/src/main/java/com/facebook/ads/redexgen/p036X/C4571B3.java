package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.B3 */
/* loaded from: assets/audience_network.dex */
public final class C4571B3 {
    public static String[] A06 = {"KiEP2P9b6TLdkEYwaN5ndNVtk9NQ5Y9p", "yrQkoPMIPCp0FUw5bDslSTdDJuyK", "OV0qCkDU4pR0s48LAW0LoXOWDo4ZunO9", "CNzCLbPvty9jTQMUswZxpqZWQtb7JEv9", "Vf", "ol3MR5ayifXszMqJK7WjfrE4Lr8bJhi8", "Hh8EscwfVF04VFT3j4sJSJqD2SmetI3K", "DN3PdRai96zSFxDytd4qNigxYecPuw8S"};
    public C4572B4 A01;
    public C4572B4 A02;
    public boolean A03;
    public final ArrayList<C4572B4> A05 = new ArrayList<>();
    public final C4567Az A04 = new C4567Az();
    public AbstractC4569B1 A00 = AbstractC4569B1.A01;

    private C4572B4 A00(C4572B4 c4572b4, AbstractC4569B1 abstractC4569B1) {
        if (abstractC4569B1.A0E() || this.A00.A0E()) {
            return c4572b4;
        }
        int A04 = abstractC4569B1.A04(this.A00.A0A(c4572b4.A01.A02, this.A04, true).A03);
        if (A04 == -1) {
            return c4572b4;
        }
        return new C4572B4(abstractC4569B1.A09(A04, this.A04).A00, c4572b4.A01.A00(A04));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    @Nullable
    public final C4572B4 A03() {
        return this.A01;
    }

    @Nullable
    public final C4572B4 A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<C4572B4> arrayList = this.A05;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    public final C4572B4 A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    @Nullable
    public final C4572B4 A06() {
        return this.A02;
    }

    @Nullable
    public final C4829FY A07(int timelinePeriodCount) {
        C4829FY c4829fy = null;
        AbstractC4569B1 abstractC4569B1 = this.A00;
        if (abstractC4569B1 != null) {
            int periodIndex = abstractC4569B1.A00();
            for (int i = 0; i < this.A05.size(); i++) {
                C4572B4 c4572b4 = this.A05.get(i);
                int i2 = c4572b4.A01.A02;
                if (i2 < periodIndex && this.A00.A09(i2, this.A04).A00 == timelinePeriodCount) {
                    if (c4829fy != null) {
                        return null;
                    }
                    c4829fy = c4572b4.A01;
                }
            }
        }
        return c4829fy;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, C4829FY c4829fy) {
        this.A05.add(new C4572B4(i, c4829fy));
        if (this.A05.size() == 1) {
            boolean A0E = this.A00.A0E();
            if (A06[0].charAt(21) == 'U') {
                throw new RuntimeException();
            }
            A06[0] = "SFS5Xb2c2LrmqtbhPrHYALinOi1MehvJ";
            if (!A0E) {
                A02();
            }
        }
    }

    public final void A0C(int i, C4829FY c4829fy) {
        C4572B4 c4572b4 = new C4572B4(i, c4829fy);
        this.A05.remove(c4572b4);
        if (!c4572b4.equals(this.A02)) {
            return;
        }
        this.A02 = this.A05.isEmpty() ? null : this.A05.get(0);
    }

    public final void A0D(int i, C4829FY c4829fy) {
        this.A02 = new C4572B4(i, c4829fy);
    }

    public final void A0E(AbstractC4569B1 abstractC4569B1) {
        for (int i = 0; i < this.A05.size(); i++) {
            ArrayList<C4572B4> arrayList = this.A05;
            arrayList.set(i, A00(arrayList.get(i), abstractC4569B1));
        }
        C4572B4 c4572b4 = this.A02;
        if (A06[0].charAt(21) == 'U') {
            throw new RuntimeException();
        }
        A06[1] = "OE27bQwCbSc4SHZoCTNTYydrCDTv";
        if (c4572b4 != null) {
            this.A02 = A00(c4572b4, abstractC4569B1);
        }
        this.A00 = abstractC4569B1;
        A02();
    }

    public final boolean A0F() {
        return this.A03;
    }
}
