package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TW */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5681TW extends RelativeLayout implements InterfaceC5270Mr {
    public static byte[] A0D;
    public static String[] A0E = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    @Nullable
    public C5202Ll A01;
    @Nullable
    public C5428PR A02;
    public boolean A03;
    public boolean A04;
    public C397619 A05;
    public final View$OnSystemUiVisibilityChangeListenerC5232MF A06;
    public final InterfaceC5269Mq A07;
    public final C6281dJ A08;
    public final C5953Xy A09;
    public final InterfaceC5080Jh A0A;
    public final C5088Jp A0B;
    public final AbstractC5268Mp A0C;

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0a();

    @ToolbarActionView$ToolbarActionMode
    public abstract int getCloseButtonStyle();

    static {
        A0O();
    }

    public AbstractC5681TW(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, C6281dJ c6281dJ) {
        super(c5953Xy);
        this.A04 = false;
        this.A03 = false;
        this.A09 = c5953Xy;
        this.A0A = interfaceC5080Jh;
        this.A07 = interfaceC5269Mq;
        this.A06 = new View$OnSystemUiVisibilityChangeListenerC5232MF(this);
        this.A08 = c6281dJ;
        this.A0B = new C5088Jp(this.A08.A0U(), this.A0A);
        this.A0C = new FullScreenAdToolbar(this.A09, getAudienceNetworkListener(), this.A0B, 0, this.A08.A0F());
    }

    private C39871K A0K(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        C397619 c397619 = this.A05;
        if (A0E[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0E[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return c397619.A00();
    }

    private void A0M() {
        removeAllViews();
        C5245MS.A0J(this);
    }

    private void A0N() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0X() && this.A02 == null) {
            this.A04 = true;
            this.A02 = new C5426PP(this.A09, this.A08.A0O().A0E(), this.A08.A0R()).A08(this.A08.A0N().A01()).A0B();
            C5090Jr.A04(this.A02, this.A0B, EnumC5087Jo.A0U);
            this.A07.A3H(this, 0, layoutParams);
            this.A07.A3H(this.A02, 1, layoutParams);
            this.A02.A04(new C5683TY(this));
            return;
        }
        this.A07.A3H(this, 0, layoutParams);
    }

    private void A0P(C39871K c39871k, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0C.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0C.A04(c39871k, z);
        addView(this.A0C, layoutParams);
    }

    public final void A0S() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC5381Of)) {
            return;
        }
        if (A0Y()) {
            ((AbstractC5381Of) this.A00).A0a();
        } else {
            ((AbstractC5381Of) this.A00).A0Z();
        }
    }

    public final void A0T(int i) {
        this.A01 = new C5202Ll(i, new C5682TX(this, i));
        this.A03 = true;
        A0S();
        this.A01.A07();
    }

    public final void A0U(View view, boolean z, int i) {
        this.A00 = view;
        this.A06.A05(EnumC5231ME.A03);
        A0M();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0C.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C39871K A0K = A0K(i);
        A0P(A0K, z);
        C5245MS.A0M(this, A0K.A07(false));
        if (this.A07 != null) {
            A0N();
            String[] strArr = A0E;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0E[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                View$OnSystemUiVisibilityChangeListenerC5232MF view$OnSystemUiVisibilityChangeListenerC5232MF = this.A06;
                if (A0E[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0E[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                view$OnSystemUiVisibilityChangeListenerC5232MF.A05(EnumC5231ME.A04);
            }
        }
    }

    public final void A0V(C422159 c422159) {
        this.A06.A04(c422159.A0H().getWindow());
        this.A05 = this.A08.A0N();
        C39781B c39781b = null;
        if (this.A08.A0O() != null && this.A08.A0O() != null) {
            c39781b = this.A08.A0O();
        }
        this.A0C.setPageDetails(this.A08.A0R(), this.A08.A0U(), c39781b != null ? c39781b.A0D().A03() : 0, this.A08.A0S());
        this.A0C.setToolbarListener(new C5685Ta(this, c422159));
    }

    public final void A0W(C422159 c422159) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new animationAnimation$AnimationListenerC5276Mx(this, this, c422159));
        startAnimation(alphaAnimation);
    }

    public final boolean A0X() {
        if (!this.A08.A0c().isEmpty()) {
            boolean A0P = this.A08.A0O().A0P();
            if (A0E[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0E[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A03;
    }

    public final boolean A0Z() {
        return this.A04;
    }

    public void ABj(boolean z) {
        C5202Ll c5202Ll = this.A01;
        if (c5202Ll != null && c5202Ll.A05()) {
            this.A01.A06();
        }
    }

    public void AC8(boolean z) {
        C5202Ll c5202Ll = this.A01;
        if (c5202Ll != null && !c5202Ll.A04()) {
            this.A01.A07();
        }
    }

    public InterfaceC5080Jh getAdEventManager() {
        return this.A0A;
    }

    public InterfaceC5269Mq getAudienceNetworkListener() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A06.A03();
        this.A0C.setToolbarListener(null);
        A0M();
    }

    public void setImpressionRecordingFlag(C5237MK c5237mk) {
        c5237mk.A05();
        if (getAudienceNetworkListener() != null) {
            getAudienceNetworkListener().A3s(A0L(0, 47, 106));
        }
    }

    public void setListener(InterfaceC5269Mq interfaceC5269Mq) {
    }
}
