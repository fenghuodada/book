package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.bi */
/* loaded from: assets/audience_network.dex */
public class C6185bi implements InterfaceC5401Oz {
    public final /* synthetic */ NativeAd A00;
    public final /* synthetic */ C6180bd A01;
    public final /* synthetic */ C5721UB A02;

    public C6185bi(C6180bd c6180bd, C5721UB c5721ub, NativeAd nativeAd) {
        this.A01 = c6180bd;
        this.A02 = c5721ub;
        this.A00 = nativeAd;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void A8i() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void AAf(C4508A1 c4508a1) {
        new Handler(Looper.getMainLooper()).postDelayed(new C6186bj(this, c4508a1), 1L);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void AAt() {
        C4508A1 c4508a1;
        C4508A1 c4508a12;
        c4508a1 = this.A01.A0A;
        if (c4508a1 != null) {
            c4508a12 = this.A01.A0A;
            c4508a12.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5401Oz
    public final void ACX(View view, MotionEvent motionEvent) {
        C5953Xy c5953Xy;
        boolean A0J;
        C5237MK A19 = this.A02.A19();
        c5953Xy = this.A01.A07;
        A19.A06(c5953Xy, motionEvent, view, view);
        if (motionEvent.getAction() == 1) {
            A0J = this.A01.A0J(this.A00);
            if (!A0J && this.A02.A12() != null) {
                this.A02.A12().onClick(view);
            }
        }
    }
}
