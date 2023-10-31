package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bv */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6198bv extends AbstractC41824W {
    public static byte[] A03;
    public static String[] A04 = {"WP5CpU5dCfM1vj2iCgRczyLeS833jqA7", "f0t6mABNpir4NiI1IJBR", "VMSqLwjWc3fXvu7D9B7JwatTJSWiKmSt", "2kGOlvpEajHcc9JJ5BV7kSrV8Uhb9VDh", "BGGgbgkg4NpzKA2XjpG6Q8iHB2GG9zH0", "ziOTckvigWpUqNYWulExTvMWDfbzI1Sq", "WkLWBkQ13lLgYVln8HDaQ7gYbGPRUWfj", "hZJ2tRP2pGaevCKAXmW2Fr9GhnOGACBf"};
    public C4804F9 A00;
    public Scroller A01;
    public final AbstractC41844Y A02 = new C6199bw(this);

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {-35, 10, -68, 5, 10, 15, 16, -3, 10, -1, 1, -68, 11, 2, -68, -21, 10, -30, 8, 5, 10, 3, -24, 5, 15, 16, 1, 10, 1, 14, -68, -3, 8, 14, 1, -3, 0, 21, -68, 15, 1, 16, -54};
        if (A04[2].length() != 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[3] = "Gfsvb5V6ZkZ1EjPhJmDEOg0wCX37AMGK";
        strArr[5] = "BogmwpJuEiSgKohE6B9VLJKkNQC2pxlX";
        A03 = bArr;
    }

    public abstract int A0C(AbstractC41794T abstractC41794T, int i, int i2);

    @Nullable
    public abstract View A0D(AbstractC41794T abstractC41794T);

    @Nullable
    public abstract int[] A0H(@NonNull AbstractC41794T abstractC41794T, @NonNull View view);

    static {
        A09();
    }

    @Nullable
    private final AbstractC41924g A05(AbstractC41794T abstractC41794T) {
        return A0E(abstractC41794T);
    }

    private void A07() {
        this.A00.A1k(this.A02);
        this.A00.setOnFlingListener(null);
    }

    private void A08() throws IllegalStateException {
        if (this.A00.getOnFlingListener() == null) {
            this.A00.A1j(this.A02);
            this.A00.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException(A06(0, 43, 103));
    }

    private boolean A0A(@NonNull AbstractC41794T abstractC41794T, int i, int i2) {
        AbstractC41924g A05;
        if ((abstractC41794T instanceof InterfaceC41914f) && (A05 = A05(abstractC41794T)) != null) {
            int A0C = A0C(abstractC41794T, i, i2);
            String[] strArr = A04;
            if (strArr[0].charAt(25) != strArr[7].charAt(25)) {
                String[] strArr2 = A04;
                strArr2[0] = "3QNQgzU1MIdfo8xP0zEWa1SfaSPVi8u7";
                strArr2[7] = "BhxrOivCOMjMD1hwED78TbVHZR3oyoMb";
                if (A0C == -1) {
                    return false;
                }
                A05.A0A(A0C);
                abstractC41794T.A1L(A05);
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41824W
    public final boolean A0B(int i, int i2) {
        AbstractC41794T layoutManager = this.A00.getLayoutManager();
        if (layoutManager == null || this.A00.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.A00.getMinFlingVelocity();
        int minFlingVelocity2 = Math.abs(i2);
        if (minFlingVelocity2 <= minFlingVelocity) {
            int minFlingVelocity3 = Math.abs(i);
            if (minFlingVelocity3 <= minFlingVelocity) {
                return false;
            }
        }
        return A0A(layoutManager, i, i2);
    }

    @Nullable
    @Deprecated
    public C6212cA A0E(AbstractC41794T abstractC41794T) {
        if (!(abstractC41794T instanceof InterfaceC41914f)) {
            return null;
        }
        return new C4803F8(this, this.A00.getContext());
    }

    public final void A0F() {
        AbstractC41794T layoutManager;
        View snapView;
        C4804F9 c4804f9 = this.A00;
        if (c4804f9 == null || (layoutManager = c4804f9.getLayoutManager()) == null || (snapView = A0D(layoutManager)) == null) {
            return;
        }
        int[] A0H = A0H(layoutManager, snapView);
        if (A0H[0] != 0 || A0H[1] != 0) {
            this.A00.A1e(A0H[0], A0H[1]);
        }
    }

    public final void A0G(@Nullable C4804F9 c4804f9) throws IllegalStateException {
        C4804F9 c4804f92 = this.A00;
        if (c4804f92 == c4804f9) {
            return;
        }
        if (c4804f92 != null) {
            A07();
        }
        this.A00 = c4804f9;
        if (this.A00 != null) {
            A08();
            this.A01 = new Scroller(this.A00.getContext(), new DecelerateInterpolator());
            A0F();
        }
    }
}
