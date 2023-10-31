package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.S3 */
/* loaded from: assets/audience_network.dex */
public final class C5590S3 extends AbstractC41974l {
    @Nullable
    @DoNotStrip
    public AbstractC5520Qv A00;
    public C5521Qw A01;
    @Nullable
    public C5521Qw A02;
    public final int A03;
    public final SparseBooleanArray A04;
    public final C5953Xy A05;
    public final C4518AB A06;

    public C5590S3(C4518AB c4518ab, SparseBooleanArray sparseBooleanArray, C5521Qw c5521Qw, int i, C5953Xy c5953Xy) {
        super(c4518ab);
        this.A05 = c5953Xy;
        this.A06 = c4518ab;
        this.A04 = sparseBooleanArray;
        this.A01 = c5521Qw;
        this.A03 = i;
    }

    private void A08(InterfaceC5080Jh interfaceC5080Jh, C5237MK c5237mk, String str, C5437Pa c5437Pa) {
        if (this.A04.get(c5437Pa.A02())) {
            return;
        }
        C5521Qw c5521Qw = this.A02;
        if (c5521Qw != null) {
            c5521Qw.A0V();
            this.A02 = null;
        }
        this.A00 = new C5592S5(this, str, c5437Pa, interfaceC5080Jh, c5437Pa.A04(), c5237mk);
        this.A02 = new C5521Qw(this.A06, 10, new WeakReference(this.A00), this.A05);
        this.A02.A0Y(false);
        this.A02.A0W(100);
        this.A02.A0X(100);
        this.A06.setOnAssetsLoadedListener(new C5591S4(this, c5437Pa));
    }

    public final void A0l(C5437Pa c5437Pa, InterfaceC5080Jh interfaceC5080Jh, C43657U c43657u, C5237MK c5237mk, String str, int i, int i2, int i3) {
        int A02 = c5437Pa.A02();
        this.A06.setTag(-1593835536, Integer.valueOf(A02));
        this.A06.setupNativeCtaExtension(c5437Pa);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = A02 == 0 ? i3 : i2;
        if (A02 < this.A03 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String A07 = c5437Pa.A03().A0D().A07();
        String A08 = c5437Pa.A03().A0D().A08();
        this.A06.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A06.A0i()) {
            this.A06.setVideoPlaceholderUrl(A07);
            this.A06.setVideoUrl(c43657u.A0S(A08));
        } else {
            this.A06.setImageUrl(A07);
        }
        this.A06.setLayoutParams(marginLayoutParams);
        this.A06.A0j(c5437Pa.A04());
        A08(interfaceC5080Jh, c5237mk, str, c5437Pa);
    }

    public final void A0m(C5521Qw c5521Qw) {
        this.A01 = c5521Qw;
    }
}
