package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.FL */
/* loaded from: assets/audience_network.dex */
public final class C4816FL extends AbstractC6264d2 {
    public static byte[] A00;
    public static String[] A01 = {"QPajxPBXawZguZvIACdyFqOYUKJhGG1P", "5fhxQ1wmDDZwcYW6vVZtBFGAbpCppeaF", "0C8PIOmzvjBgpmOh8JUWA", "4kKOVZ4CcWBKVljagfvAN2XyBryastSO", "Oy7EzKzQwTS7e9udIDBq4FtqglrDvqBF", "BZaaKRqUw", "6zOS7wuF6dlGz7u6SsHniaRnv53e8kon", "jwUp8OtoUlvjJY1bP74aKb8UsU7a0Ko9"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[7].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "Dg0tZg7IxBj4D2AEunqK4FRxjbaI0pzK";
            strArr2[4] = "5sVR5Q40j80Tm4EH72ZLdFDAQDj0jOHn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 112);
            i4++;
        }
    }

    public static void A02() {
        A00 = new byte[]{-11, -13, 0, -78, 1, 0, -2, 11, -78, 5, -9, 6, -78, 1, 0, -78, 4, -9, 9, -13, 4, -10, -9, -10, -78, 8, -5, -10, -9, 1, -78, -13, -10, 5, -15, -14, -93, -28, -25, -28, -13, -9, -24, -11, -93, -11, -24, -28, -25, -4, -93, -9, -14, -93, -10, -24, -9, -93, -11, -24, -6, -28, -11, -25, -93, -14, -15};
    }

    static {
        A02();
    }

    public C4816FL(C5953Xy c5953Xy, C40181p c40181p) {
        super(c5953Xy, c40181p);
    }

    private InterfaceC397114 A00(Runnable runnable) {
        return new C6256cu(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0J() {
        AbstractC6288dQ abstractC6288dQ = (AbstractC6288dQ) this.A01;
        abstractC6288dQ.A00(this.A07.A00);
        abstractC6288dQ.A01(this.A07.A01);
        abstractC6288dQ.A0F();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0L(InterfaceC39540n interfaceC39540n, C44639H c44639h, C44619F c44619f, C40191q c40191q) {
        C4839Fi c4839Fi = (C4839Fi) interfaceC39540n;
        Runnable rewardedVideoTimeout = new C6257cv(this, c40191q, c4839Fi);
        if (C5064JR.A1n(this.A0B)) {
            A0C().postDelayed(rewardedVideoTimeout, c44639h.A05().A05());
        }
        C5953Xy c5953Xy = this.A0B;
        InterfaceC397114 A002 = A00(rewardedVideoTimeout);
        boolean z = this.A07.A06;
        String str = this.A07.A04;
        C40181p c40181p = this.A07;
        String[] strArr = A01;
        if (strArr[3].charAt(31) == strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "qv162d7nxdmOCgZ5HSNnY6lM4lD0tO4m";
        strArr2[0] = "JwvltbAvbK0MQjlZGmmyrgC4vpl52SAH";
        c4839Fi.A0G(c5953Xy, A002, c40191q, z, str, c40181p.A05);
    }

    public final AbstractC397518 A0T() {
        return ((AbstractC6288dQ) this.A01).A0E();
    }

    public final void A0U(RewardData rewardData) {
        if (this.A01 != null) {
            if (this.A01.A7B() == AdPlacementType.REWARDED_VIDEO) {
                ((AbstractC6288dQ) this.A01).A02(rewardData);
                return;
            }
            throw new IllegalStateException(A01(0, 34, 34));
        }
        throw new IllegalStateException(A01(34, 33, 19));
    }
}
