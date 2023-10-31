package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.GE */
/* loaded from: assets/audience_network.dex */
public class C4869GE extends AbstractC6315dr<EnumC39440c> {
    public static byte[] A00;
    public static String[] A01 = {"nfOmdPRKy6dJXhDeozy3bec4eprLIoSQ", "SpNSu", "KnwtHm0RppTzgOMyhwsp1PpmZykcOlps", "rm2Q4", "VxhbZsLUCIIY3eK9iwu", "VDpaDUxovSHskE3K7Rzj9CiAPD6OjiUH", "VHZOT7bXdVoDaPP", "SrW2lLCi4fFkH4TY8LZz6iOiSZQwKo1F"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A01[5] = "VLAsB6FpgF6HHUeMgZV0uCFNDiYuOANh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 46);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{19, 26, 17, 17};
    }

    static {
        A01();
    }

    public C4869GE(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6315dr
    /* renamed from: A05 */
    public final C39380W A04(@Nullable EnumC39440c enumC39440c) {
        String A02;
        if (enumC39440c != null) {
            A02 = enumC39440c.A02();
        } else if (A01[0].charAt(24) == 'c') {
            throw new RuntimeException();
        } else {
            A01[2] = "FtIMifYPiEAUkOQozBm9Vw11LGuuRK56";
            A02 = A00(0, 4, 119);
        }
        return new C39380W(this, A02);
    }
}
