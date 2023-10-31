package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qk */
/* loaded from: assets/audience_network.dex */
public final class C5509Qk {
    public static C5509Qk A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C4795F0 A00;
    @Nullable
    public InterfaceC4981I4 A01;
    public File A02;
    public boolean A03;
    public final C5952Xx A06;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C5507Qi> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC5506Qh(this);
    public final InterfaceC4788Et A07 = new C4990ID(this);

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C5813Vf.A03};
    }

    @VisibleForTesting
    public C5509Qk(C5952Xx c5952Xx, @Nullable C4795F0 c4795f0) {
        this.A06 = c5952Xx;
        if (c4795f0 != null) {
            this.A00 = c4795f0;
            c4795f0.A0Q(this.A07);
        }
        A01().A0P();
    }

    private synchronized C4795F0 A01() {
        if (this.A00 == null) {
            this.A00 = new C4795F0(new C4800F5(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00.A0Q(this.A07);
        }
        return this.A00;
    }

    private InterfaceC5772V0 A02() {
        return new C40522N(A07(78, 3, 89), null);
    }

    private final synchronized InterfaceC4981I4 A03() {
        if (this.A01 == null) {
            this.A01 = new C5758Um(new File(A06(), A07(64, 14, 16)), new C4586BI(C5064JR.A0N(this.A06)));
        }
        return this.A01;
    }

    public static C5761Up A04(C5778V6 c5778v6, InterfaceC4981I4 interfaceC4981I4) {
        return new C5761Up(interfaceC4981I4, c5778v6, new C5774V2(), null, 2, null);
    }

    public static synchronized C5509Qk A05(C5952Xx c5952Xx) {
        C5509Qk c5509Qk;
        synchronized (C5509Qk.class) {
            if (A09 == null) {
                A09 = new C5509Qk(c5952Xx, null);
            }
            c5509Qk = A09;
        }
        return c5509Qk;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    @Nullable
    public static String A08(C5952Xx c5952Xx, Uri uri) {
        try {
            if (!C5064JR.A1F(c5952Xx)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            c5952Xx.A06().A8y(A07(81, 5, 14), C44458z.A0u, new C444690(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C4794Ez[] A0S;
        for (C4794Ez c4794Ez : A01().A0S()) {
            int state = c4794Ez.A02;
            C5507Qi c5507Qi = this.A05.get(state);
            if (c5507Qi != null) {
                int i = c4794Ez.A01;
                if (i == 2 || c4794Ez.A03 > c5507Qi.A00) {
                    String str = A07(15, 19, 61) + i + A07(0, 8, 18) + c4794Ez.A03;
                    c5507Qi.A01.AAY(c5507Qi.A02);
                    this.A05.remove(state);
                } else if (i == 4 || i == 3) {
                    String str2 = A07(34, 14, 111) + i;
                    c5507Qi.A01.AAk(c4794Ez.A05);
                    this.A05.remove(state);
                }
            }
            String str3 = A07(48, 4, 25) + state + A07(8, 7, 52) + c4794Ez.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final InterfaceC4954Hd A0F(Context context) {
        return A04(new C5778V6(context, (InterfaceC4977I0<? super InterfaceC4955He>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC5508Qj interfaceC5508Qj, long j) {
        String cacheKey = A08(this.A06, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean cacheHit = A0H(cacheKey);
        C5813Vf c5813Vf = new C5813Vf(uri, false, null, cacheKey);
        C4795F0 downloadManager = A01();
        int actionId = downloadManager.A0O(c5813Vf);
        this.A05.put(actionId, new C5507Qi(interfaceC5508Qj, j, cacheHit, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A5w(str, 0L, 1L) > 0;
    }
}
