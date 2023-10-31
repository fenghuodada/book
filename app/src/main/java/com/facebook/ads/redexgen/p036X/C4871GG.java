package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.GG */
/* loaded from: assets/audience_network.dex */
public class C4871GG extends AbstractC6315dr<EnumC39320Q> {
    public static byte[] A00;
    public static String[] A01 = {"jR7SgdIzlKHk76CXDj7yskV4BbEyGCpu", "dz14xHNKN2eKa", "osoaj0nOm4U0DksUsx9ydi6yveTqdDmo", "CW4NBbEoC8f", "oKML8tkCm175rZI2zBYjmvrxKy9flX2h", "0JuTJ32H1trbcwgA0tUu0T5MtnfghwR4", "xx3SSYxbJNPIpDYr1BHpXDm7lAtLM5T8", "wtTCE0DbZnhIRkOUKlXj85m9jjBjTzDL"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
            String[] strArr = A01;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "RdAktgh8TRx4T7uGZoOvXD5Nm8OQ26SP";
            strArr2[4] = "NAulEfMGB5fp7nDMqJdUUmABB5JXpKUM";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{17, 10, 19, 19};
    }

    static {
        A01();
    }

    public C4871GG(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6315dr
    /* renamed from: A05 */
    public final C39380W A04(@Nullable EnumC39320Q enumC39320Q) {
        String str;
        if (enumC39320Q == null) {
            str = A00(0, 4, 74);
        } else {
            str = A00(0, 0, 56) + enumC39320Q.A02();
        }
        return new C39380W(this, str);
    }
}
