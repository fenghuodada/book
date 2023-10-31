package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.OJ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5359OJ extends LinearLayout {
    public static final LinearLayout.LayoutParams A05 = new LinearLayout.LayoutParams(-2, -2);
    public final int A00;
    public final RelativeLayout A01;
    public final C5953Xy A02;
    public final View$OnClickListenerC5650T1 A03;
    public final C5372OW A04;

    public abstract void A0A(int i);

    public AbstractC5359OJ(C5953Xy c5953Xy, int i, C39871K c39871k, boolean z, String str, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, C5521Qw c5521Qw, C5237MK c5237mk) {
        super(c5953Xy);
        C5245MS.A0K(this);
        this.A02 = c5953Xy;
        this.A00 = i;
        this.A04 = new C5372OW(c5953Xy);
        C5245MS.A0M(this.A04, 0);
        C5245MS.A0K(this.A04);
        this.A03 = new View$OnClickListenerC5650T1(c5953Xy, str, c39871k, z, interfaceC5080Jh, interfaceC5269Mq, c5521Qw, c5237mk);
        C5245MS.A0G(1001, this.A03);
        this.A01 = new RelativeLayout(c5953Xy);
        this.A01.setLayoutParams(A05);
        C5245MS.A0K(this.A01);
    }

    public void A08() {
    }

    public void A09() {
    }

    public final View$OnClickListenerC5650T1 getCTAButton() {
        return this.A03;
    }

    public View getExpandableLayout() {
        return null;
    }

    @VisibleForTesting
    public final ImageView getIconView() {
        return this.A04;
    }

    public void setInfo(C39851I c39851i, C39881L c39881l, String str, String str2, @Nullable InterfaceC5362OM interfaceC5362OM) {
        this.A03.setCta(c39881l, str, new HashMap(), interfaceC5362OM);
        AsyncTaskC5652T3 asyncTaskC5652T3 = new AsyncTaskC5652T3(this.A04, this.A02);
        int i = this.A00;
        asyncTaskC5652T3.A05(i, i).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
