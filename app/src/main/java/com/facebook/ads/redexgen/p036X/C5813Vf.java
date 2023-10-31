package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vf */
/* loaded from: assets/audience_network.dex */
public final class C5813Vf extends DownloadAction {
    public static byte[] A01;
    public static String[] A02 = {"zIk8lFjKPo5VqXBeAWetc3TePOqewtK4", "Krv9CUV84BxP4tXlBDsVq5ZfguHkkPOw", "qZweMgdQpTvQjM16IN332AToX", "5wIly2IGyFbenCO8uByiE", "WVTy90LHtMArJ1Mx15Navn95RKOGxxfC", "YMittl3f14YbQo67yPLY6h3Kxcx5v1", "fVvKsKq8KPyH9", "YcDFZjjwvX0vuueDfq7B81mncQMZao1W"};
    public static final DownloadAction.Deserializer A03;
    @Nullable
    public final String A00;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{3, 1, 28, 20, 1, 22, 0, 0, 26, 5, 22};
    }

    static {
        A06();
        A03 = new C5814Vg(A05(0, 11, 68), 0);
    }

    public C5813Vf(Uri uri, boolean z, @Nullable byte[] bArr, @Nullable String str) {
        super(A05(0, 11, 68), 0, uri, z, bArr);
        this.A00 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    /* renamed from: A02 */
    public final C5812Ve A07(C4800F5 c4800f5) {
        return new C5812Ve(this.A01, this.A00, c4800f5);
    }

    private String A04() {
        String str = this.A00;
        return str != null ? str : C4987IA.A01(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final void A08(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeUTF(this.A01.toString());
        dataOutputStream.writeBoolean(this.A03);
        dataOutputStream.writeInt(this.A04.length);
        dataOutputStream.write(this.A04);
        boolean z = this.A00 != null;
        dataOutputStream.writeBoolean(z);
        if (z) {
            dataOutputStream.writeUTF(this.A00);
        }
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean A09(DownloadAction downloadAction) {
        return (downloadAction instanceof C5813Vf) && A04().equals(((C5813Vf) downloadAction).A04());
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        boolean equals = super.equals(obj);
        String[] strArr = A02;
        if (strArr[0].charAt(3) != strArr[1].charAt(3)) {
            A02[3] = "S1dYnav0YyHlHBWJfncCN";
            if (!equals) {
                return false;
            }
            return C5038Iz.A0g(this.A00, ((C5813Vf) obj).A00);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.offline.DownloadAction
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.A00;
        int result = str != null ? str.hashCode() : 0;
        int i = hashCode + result;
        String[] strArr = A02;
        if (strArr[6].length() != strArr[2].length()) {
            A02[4] = "5idVnwwxM2TXqOP7ezpSPuxFrlenP4PE";
            return i;
        }
        throw new RuntimeException();
    }
}
