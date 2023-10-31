package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.HR */
/* loaded from: assets/audience_network.dex */
public final class C4942HR {
    public static String[] A03 = {"uPzvf3DrMkTy6OC2", "H2eIGrw6YlTuEfUMB", "p11InAYoC", "jGz94J", "ZtEJrdVWV1XC8XFg6mMZlCv5mMRi1ND1", "Ub1YY0rlTcSKb3yBclMaPE0dIwwpm8Yp", "Au1lLpT3HfOHruCfEBskEQ20fDVmu", "jui1pWNgNEO"};
    public int A00;
    public final int A01;
    public final InterfaceC4941HQ[] A02;

    public C4942HR(InterfaceC4941HQ... interfaceC4941HQArr) {
        this.A02 = interfaceC4941HQArr;
        this.A01 = interfaceC4941HQArr.length;
    }

    @Nullable
    public final InterfaceC4941HQ A00(int i) {
        return this.A02[i];
    }

    public final InterfaceC4941HQ[] A01() {
        return (InterfaceC4941HQ[]) this.A02.clone();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4942HR c4942hr = (C4942HR) obj;
        String[] strArr = A03;
        if (strArr[1].length() != strArr[6].length()) {
            String[] strArr2 = A03;
            strArr2[5] = "VymNKk7BYdZfYlSqFiIbjljOXHtGYALy";
            strArr2[4] = "eUsLwIc5zFGsQcnFIY6bSbYyt6aFMI1L";
            return Arrays.equals(this.A02, c4942hr.A02);
        }
        throw new RuntimeException();
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (17 * 31) + Arrays.hashCode(this.A02);
        }
        int result = this.A00;
        return result;
    }
}
