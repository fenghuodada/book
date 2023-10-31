package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.SQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5613SQ extends FrameLayout implements InterfaceC5270Mr {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC397518 A01;
    public final C43657U A02;
    public final C5953Xy A03;
    public final InterfaceC5080Jh A04;
    public final C5088Jp A05;
    public final C5237MK A06;
    public final AbstractC5268Mp A07;
    public final InterfaceC5269Mq A08;
    public final InterfaceC5296NI A09;
    public final C5521Qw A0A;
    public final View$OnSystemUiVisibilityChangeListenerC5232MF A0B;
    @DoNotStrip
    public final AbstractC5520Qv A0C;

    public abstract void A0Q();

    public abstract void A0S(C422159 c422159);

    public abstract boolean A0T();

    public AbstractC5613SQ(C5953Xy c5953Xy, InterfaceC5296NI interfaceC5296NI, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518, C43657U c43657u, InterfaceC5269Mq interfaceC5269Mq) {
        super(c5953Xy);
        this.A0C = new C5617SU(this);
        this.A06 = new C5237MK();
        this.A00 = false;
        this.A03 = c5953Xy;
        this.A09 = interfaceC5296NI;
        this.A04 = interfaceC5080Jh;
        this.A01 = abstractC397518;
        this.A02 = c43657u;
        this.A08 = interfaceC5269Mq;
        this.A05 = new C5088Jp(this.A01.A0U(), this.A04);
        this.A0A = new C5521Qw(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0W(this.A01.A0H());
        this.A0A.A0X(this.A01.A0I());
        this.A07 = A0N();
        this.A0B = new View$OnSystemUiVisibilityChangeListenerC5232MF(this);
        this.A0B.A05(EnumC5231ME.A03);
    }

    private AbstractC5268Mp A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0F());
        int A03 = this.A01.A0O().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0R(), this.A01.A0U(), A03, this.A01.A0S());
        fullScreenAdToolbar.A04(this.A01.A0N().A01(), true);
        if (A03 < 0 && this.A01.A0O().A0M()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new C5614SR(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0O().A0P()) {
            C5428PR A0B = new C5426PP(this.A03, this.A01.A0O().A0E(), this.A01.A0R()).A08(this.A01.A0N().A01()).A0B();
            C5090Jr.A04(A0B, this.A05, EnumC5087Jo.A0U);
            addView(A0B, A0D);
            A0B.A04(new C5615SS(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, AbstractRunnableC5165L8 abstractRunnableC5165L8) {
        new C5202Ll(i, new C5616ST(this, i, abstractRunnableC5165L8)).A07();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, C422159 c422159) {
        this.A08.A3I(this, A0D);
        A0S(c422159);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0U())) {
            this.A04.A8v(this.A01.A0U(), new C5356OG().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC5269Mq interfaceC5269Mq) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC5231ME enumC5231ME;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            enumC5231ME = EnumC5231ME.A04;
        } else {
            enumC5231ME = EnumC5231ME.A03;
        }
        this.A0B.A05(enumC5231ME);
    }
}
