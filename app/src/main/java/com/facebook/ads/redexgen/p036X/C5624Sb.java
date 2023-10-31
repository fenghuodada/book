package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sb */
/* loaded from: assets/audience_network.dex */
public final class C5624Sb extends FrameLayout implements InterfaceC5270Mr {
    public final InterfaceC5269Mq A00;
    public final C5411PA A01;

    public C5624Sb(C5953Xy c5953Xy, InterfaceC5269Mq interfaceC5269Mq, C5411PA c5411pa) {
        super(c5953Xy);
        this.A01 = c5411pa;
        this.A00 = interfaceC5269Mq;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, C422159 c422159) {
        C5411PA.A0B().incrementAndGet();
        this.A01.A0V();
        C5245MS.A0J(this.A01.A0O());
        addView(this.A01.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A00.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        this.A01.A0U();
        if (this.A01.A0N() != null) {
            this.A01.A0N().AAt();
        }
        C5411PA.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC5269Mq interfaceC5269Mq) {
    }
}
