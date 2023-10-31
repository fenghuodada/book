package com.facebook.ads.redexgen.p036X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.A3 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4510A3 extends AbstractC5634Sl {
    public RelativeLayout A00;
    public C5287N8 A01;
    public InterfaceC5394Os A02;
    public C5598SB A03;
    public C5439Pc A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C5953Xy A0B;
    public final AbstractC5285N6 A0C;
    public final AbstractC5216Lz A0D;
    public final AbstractC5200Lj A0E;
    public final AbstractC5161L4 A0F;
    public final AbstractC5135Kc A0G;
    public final String A0H;
    public static final int A0J = (int) (C5208Lr.A00 * 1.0f);
    public static final int A0K = (int) (C5208Lr.A00 * 4.0f);
    public static final int A0I = (int) (C5208Lr.A00 * 6.0f);

    public abstract void A0j(C5953Xy c5953Xy);

    public AbstractC4510A3(C5385Oj c5385Oj, boolean z, String str, C5598SB c5598sb) {
        super(c5385Oj, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0G = new C4515A8(this);
        this.A0C = new C4514A7(this);
        this.A0E = new C4513A6(this);
        this.A0D = new C4512A5(this);
        this.A0F = new C4511A4(this);
        this.A03 = c5598sb;
        this.A0H = str;
        this.A0B = c5385Oj.A05();
        setGravity(17);
        int i = A0J;
        setPadding(i, 0, i, i);
        C5245MS.A0M(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(-16777216);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A02 == null) {
            return;
        }
        if ((A0i() && this.A07) || (!A0i() && this.A06)) {
            this.A02.AA3();
        }
    }

    private void A02(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        C5245MS.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
    public final void A0e() {
        if (A0i()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
    public final void A0f() {
        if (A0i()) {
            A0g();
            this.A04.A05(EnumC5469Q6.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
    public final void A0g() {
        float volume = this.A03.A0P().getVolume();
        if (A0i() && volume != this.A04.getVolume()) {
            this.A04.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
    public final boolean A0h() {
        return A0i() && this.A04.A06();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
    public final boolean A0i() {
        return this.A05;
    }

    public final void A0k(Map<String, String> map) {
        this.A04.A02();
        if (A0i()) {
            this.A04.A04(getAdEventManager(), this.A0H, map);
        }
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C5439Pc getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.A09;
        RectF rectF = this.A0A;
        int i = A0I;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0J, 0.0f, getWidth() - A0J, getHeight() - A0J);
        Path path2 = this.A09;
        RectF rectF2 = this.A0A;
        int i2 = A0K;
        path2.addRoundRect(rectF2, i2, i2, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A01(str, str2, null, true, false);
    }

    public void setCTAInfo(C39881L c39881l, Map<String, String> map) {
        getCtaButton().setCta(c39881l, this.A0H, map);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC5652T3(this.A01, this.A0B).A04().A06(new C5633Sk(this, null)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC5394Os interfaceC5394Os) {
        this.A02 = interfaceC5394Os;
    }

    public void setUpImageView(C5953Xy c5953Xy) {
        this.A01 = new C5287N8(c5953Xy);
        A02(this.A01);
    }

    public void setUpMediaContainer(C5953Xy c5953Xy) {
        this.A00 = new RelativeLayout(c5953Xy);
        A02(this.A00);
    }

    public void setUpVideoView(C5953Xy c5953Xy) {
        this.A04 = new C5439Pc(c5953Xy, new C5088Jp(this.A0H, getAdEventManager()));
        A02(this.A04);
    }

    private void setUpView(C5953Xy c5953Xy) {
        setUpImageView(c5953Xy);
        setUpVideoView(c5953Xy);
        setUpMediaContainer(c5953Xy);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A0j(c5953Xy);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0C);
        this.A04.A03(this.A0E);
        this.A04.A03(this.A0D);
        this.A04.A03(this.A0F);
    }
}
