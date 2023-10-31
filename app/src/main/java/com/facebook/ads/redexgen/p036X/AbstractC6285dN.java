package com.facebook.ads.redexgen.p036X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.dN */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6285dN extends AbstractC41674H<C5686Tc> {
    public static final int A05 = (int) (C5208Lr.A00 * 4.0f);
    @Nullable
    public InterfaceC397417 A00;
    public final List<C5721UB> A01;
    public final int A02;
    public final C5953Xy A03;
    @DoNotStrip
    public final AbstractC5520Qv A04 = new C6287dP(this);

    public AbstractC6285dN(C39771A c39771a, List<C5721UB> list, C5953Xy c5953Xy) {
        this.A03 = c5953Xy;
        this.A02 = c39771a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        C5721UB c5721ub = this.A01.get(i);
        C5104K5 adCoverImage = c5721ub.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC5652T3 A04 = new AsyncTaskC5652T3(imageView, this.A03).A04();
            A04.A06(new C6286dO(this, i, c5721ub));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(InterfaceC397417 interfaceC397417) {
        this.A00 = interfaceC397417;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41674H
    /* renamed from: A0H */
    public void A0E(C5686Tc c5686Tc, int i) {
        c5686Tc.A0l().setLayoutParams(A02(i));
    }
}
