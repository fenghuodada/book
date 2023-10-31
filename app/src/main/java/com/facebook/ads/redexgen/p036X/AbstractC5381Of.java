package com.facebook.ads.redexgen.p036X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Of */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5381Of extends RelativeLayout {
    public static final int A08 = (int) (C5208Lr.A00 * 16.0f);
    public static final int A09 = (int) (C5208Lr.A00 * 28.0f);
    public C39871K A00;
    public boolean A01;
    public boolean A02;
    public final C5953Xy A03;
    public final InterfaceC5080Jh A04;
    public final View$OnClickListenerC5650T1 A05;
    public final C5378Oc A06;
    public final C5385Oj A07;

    public abstract boolean A0c();

    public AbstractC5381Of(C5385Oj c5385Oj, boolean z) {
        super(c5385Oj.A05());
        C39871K A00;
        this.A01 = false;
        this.A07 = c5385Oj;
        this.A03 = c5385Oj.A05();
        this.A04 = c5385Oj.A06();
        if (c5385Oj.A00() == 1) {
            A00 = c5385Oj.A04().A0N().A01();
        } else {
            A00 = c5385Oj.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A02 = z;
        this.A05 = new View$OnClickListenerC5650T1(c5385Oj.A05(), c5385Oj.A04().A0T(), this.A00, c5385Oj.A04().A0O().A0F().A06(), c5385Oj.A06(), c5385Oj.A09(), c5385Oj.A0B(), c5385Oj.A07());
        this.A05.setRoundedCornersEnabled(A00());
        this.A05.setViewShowsOverMedia(A0B());
        C5245MS.A0G(1001, this.A05);
        this.A06 = new C5378Oc(this.A03, this.A00, this.A02, A01(), A02());
        C5245MS.A0K(this.A06);
    }

    public boolean A00() {
        return true;
    }

    public boolean A01() {
        return true;
    }

    public boolean A02() {
        return true;
    }

    public void A09(C439788 c439788) {
        this.A01 = true;
    }

    public void A0A(C439484 c439484) {
    }

    public boolean A0B() {
        return true;
    }

    public void A0W() {
    }

    public void A0X() {
    }

    public void A0Y() {
    }

    public void A0Z() {
    }

    public void A0a() {
    }

    public void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        this.A06.A01(c39781b.A0E().A05(), c39781b.A0E().A01(), null, false, !A0c() && d > 0.0d && d < 1.0d);
        this.A05.setCta(c39781b.A0F(), str, new HashMap());
    }

    public boolean A0d(boolean z) {
        return false;
    }

    public C5953Xy getAdContextWrapper() {
        return this.A03;
    }

    public InterfaceC5080Jh getAdEventManager() {
        return this.A04;
    }

    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    public C39871K getColors() {
        return this.A00;
    }

    public View$OnClickListenerC5650T1 getCtaButton() {
        return this.A05;
    }

    public C5378Oc getTitleDescContainer() {
        return this.A06;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        C39871K A00;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            A00 = this.A07.A04().A0N().A01();
        } else {
            A00 = this.A07.A04().A0N().A00();
        }
        this.A00 = A00;
        this.A05.setViewShowsOverMedia(A0B());
        this.A05.setUpButtonColors(this.A00);
        this.A06.A00(this.A00, this.A02);
    }
}
