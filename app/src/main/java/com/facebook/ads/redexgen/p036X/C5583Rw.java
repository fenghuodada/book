package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Rw */
/* loaded from: assets/audience_network.dex */
public final class C5583Rw extends AbstractC41974l {
    public static String[] A0A = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    @DoNotStrip
    public AbstractC5520Qv A00;
    public C5521Qw A01;
    @Nullable
    public C5521Qw A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseBooleanArray A07;
    public final C5953Xy A08;
    public final AbstractC4510A3 A09;

    public C5583Rw(AbstractC4510A3 abstractC4510A3, SparseBooleanArray sparseBooleanArray, C5521Qw c5521Qw, int i, int i2, int i3, int i4, C5953Xy c5953Xy) {
        super(abstractC4510A3);
        this.A08 = c5953Xy;
        this.A09 = abstractC4510A3;
        this.A07 = sparseBooleanArray;
        this.A01 = c5521Qw;
        this.A03 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
    }

    private void A08(InterfaceC5080Jh interfaceC5080Jh, C5237MK c5237mk, String str, C5437Pa c5437Pa) {
        if (this.A07.get(c5437Pa.A02())) {
            return;
        }
        C5521Qw c5521Qw = this.A02;
        if (c5521Qw != null) {
            c5521Qw.A0V();
            if (A0A[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0A[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A02 = null;
        }
        this.A00 = new C5585Ry(this, str, c5437Pa, interfaceC5080Jh, c5437Pa.A04(), c5237mk);
        this.A02 = new C5521Qw(this.A09, 10, new WeakReference(this.A00), this.A08);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A09.setOnAssetsLoadedListener(new C5584Rx(this, c5437Pa));
    }

    public final void A0l(C5437Pa c5437Pa, InterfaceC5080Jh interfaceC5080Jh, C43657U c43657u, C5237MK c5237mk, String videoUrl) {
        int A02 = c5437Pa.A02();
        this.A09.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A03, -2);
        marginLayoutParams.setMargins(A02 == 0 ? this.A04 : this.A05, 0, A02 >= this.A06 + (-1) ? this.A04 : this.A05, 0);
        String A07 = c5437Pa.A03().A0D().A07();
        String A08 = c5437Pa.A03().A0D().A08();
        this.A09.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A09.A0i()) {
            this.A09.setVideoPlaceholderUrl(A07);
            this.A09.setVideoUrl(c43657u.A0S(A08));
        } else {
            this.A09.setImageUrl(A07);
        }
        this.A09.setLayoutParams(marginLayoutParams);
        this.A09.setAdTitleAndDescription(c5437Pa.A03().A0E().A06(), c5437Pa.A03().A0E().A01());
        this.A09.setCTAInfo(c5437Pa.A03().A0F(), c5437Pa.A04());
        this.A09.A0k(c5437Pa.A04());
        A08(interfaceC5080Jh, c5237mk, videoUrl, c5437Pa);
    }
}
