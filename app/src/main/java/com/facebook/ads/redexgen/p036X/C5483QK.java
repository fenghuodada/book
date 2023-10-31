package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.QK */
/* loaded from: assets/audience_network.dex */
public class C5483QK extends RelativeLayout implements InterfaceC5519Qu, InterfaceC5462Pz, InterfaceC5517Qs {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final C5284N5 A0G;
    public static final C5215Ly A0H;
    public static final C5173LG A0I;
    public static final C5152Ku A0J;
    public static final C5150Kr A0K;
    public static final C5136Kd A0L;
    public static final C5134Kb A0M;
    public static final C5133Ka A0N;
    public int A00;
    public C5088Jp A01;
    public C5466Q3 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final C5953Xy A0A;
    public final C44829b<AbstractC44839c, C44819a> A0B;
    public final List<InterfaceC5470Q7> A0C;
    public final InterfaceC5516Qr A0D;

    public static String A0F(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new C5173LG();
        A0G = new C5284N5();
        A0J = new C5152Ku();
        A0K = new C5150Kr();
        A0H = new C5215Ly();
        A0L = new C5136Kd();
        A0N = new C5133Ka();
        A0M = new C5134Kb();
    }

    public C5483QK(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C44829b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC5461Py(this);
        this.A0A = c5953Xy;
        if (A0S(c5953Xy)) {
            this.A0D = new TextureView$SurfaceTextureListenerC4984I7(c5953Xy);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC4982I5(c5953Xy);
        }
        A0G();
    }

    public C5483QK(C5953Xy c5953Xy, AttributeSet attributeSet) {
        super(c5953Xy, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C44829b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC5461Py(this);
        this.A0A = c5953Xy;
        if (A0S(c5953Xy)) {
            this.A0D = new TextureView$SurfaceTextureListenerC4984I7(c5953Xy, attributeSet);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC4982I5(c5953Xy, attributeSet);
        }
        A0G();
    }

    public C5483QK(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C44829b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new View$OnTouchListenerC5461Py(this);
        this.A0A = c5953Xy;
        if (A0S(c5953Xy)) {
            this.A0D = new TextureView$SurfaceTextureListenerC4984I7(c5953Xy, attributeSet, i);
        } else {
            this.A0D = new TextureView$SurfaceTextureListenerC4982I5(c5953Xy, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ C5173LG A0C() {
        C5173LG c5173lg = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return c5173lg;
    }

    private void A0G() {
        this.A06 = C5064JR.A0m(this.A0A);
        this.A0A.A0D().A2q();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new C5466Q3(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new C5572Rl(this), this.A00);
    }

    private final void A0J() {
        for (InterfaceC5470Q7 plugin : this.A0C) {
            if (plugin instanceof AbstractC5304NQ) {
                A0Q((AbstractC5304NQ) plugin);
            }
            plugin.A8o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        if (C5064JR.A0p(this.A0A)) {
            C5953Xy c5953Xy = this.A0A;
            Toast.makeText(c5953Xy, A0F(21, 13, 124) + (i / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC5087Jo enumC5087Jo) {
        C5088Jp c5088Jp = this.A01;
        if (c5088Jp == null) {
            return;
        }
        c5088Jp.A02(enumC5087Jo, null);
    }

    private void A0P(InterfaceC5470Q7 interfaceC5470Q7) {
        if (interfaceC5470Q7 instanceof AbstractC5304NQ) {
            A0R((AbstractC5304NQ) interfaceC5470Q7);
        }
        interfaceC5470Q7.AFG(this);
    }

    private void A0Q(AbstractC5304NQ abstractC5304NQ) {
        if (abstractC5304NQ.getParent() == null) {
            if (abstractC5304NQ instanceof C43797m) {
                this.A02.A00(abstractC5304NQ);
            } else {
                addView(abstractC5304NQ);
            }
        }
    }

    private void A0R(AbstractC5304NQ abstractC5304NQ) {
        if (abstractC5304NQ instanceof C43797m) {
            this.A02.A01(abstractC5304NQ);
        } else {
            C5245MS.A0J(abstractC5304NQ);
        }
    }

    private boolean A0S(C5953Xy c5953Xy) {
        return C5064JR.A28(c5953Xy, C5505Qg.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A7u();
    }

    public final void A0X() {
        Iterator<InterfaceC5470Q7> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                InterfaceC5470Q7 plugin = it.next();
                A0P(plugin);
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AF3(i);
    }

    public final void A0a(EnumC5464Q1 enumC5464Q1) {
        C5485QM c5485qm = new C5485QM(this);
        if (this.A06) {
            ExecutorC5239MM.A00(c5485qm);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(c5485qm);
        }
        this.A0D.AEr(enumC5464Q1.A02());
    }

    public final void A0b(EnumC5469Q6 enumC5469Q6, int i) {
        if (this.A03 && this.A0D.getState() == EnumC5518Qt.A06) {
            this.A03 = false;
        }
        this.A0D.AEw(enumC5469Q6, i);
    }

    public final void A0c(InterfaceC5470Q7 interfaceC5470Q7) {
        this.A0C.add(interfaceC5470Q7);
    }

    public final void A0d(InterfaceC5470Q7 interfaceC5470Q7) {
        this.A0C.remove(interfaceC5470Q7);
        A0P(interfaceC5470Q7);
    }

    public final void A0e(boolean z, int i) {
        if (A0i()) {
            return;
        }
        this.A0D.AD5(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A85();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == EnumC5518Qt.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8b();
    }

    public final boolean A0k() {
        return getState() == EnumC5518Qt.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public final boolean A8T() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public final boolean A8W() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5519Qu
    public final void AAq(final long j, final long j2, final long j3, final float f) {
        if (!C5064JR.A1J(this.A0A)) {
            return;
        }
        this.A0B.A02(new AbstractC5293NF(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.86
        });
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5519Qu
    public final void ABR() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5519Qu
    public final void ABS() {
        A0b(EnumC5469Q6.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5519Qu
    public final void ACG(int i, int i2) {
        C5486QN c5486qn = new C5486QN(this, i, i2);
        if (this.A06) {
            ExecutorC5239MM.A00(c5486qn);
        } else {
            this.A08.post(c5486qn);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5519Qu
    public final void ACs(EnumC5518Qt enumC5518Qt) {
        C5524Qz c5524Qz = new C5524Qz(this, enumC5518Qt, getCurrentPositionInMillis(), getDuration());
        if (this.A06) {
            ExecutorC5239MM.A00(c5524Qz);
        } else {
            this.A08.post(c5524Qz);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    @NonNull
    public C44829b<AbstractC44839c, C44819a> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public EnumC5518Qt getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public EnumC5469Q6 getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5462Pz
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC5516Qr interfaceC5516Qr = this.A0D;
        if (interfaceC5516Qr != null) {
            interfaceC5516Qr.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C5088Jp c5088Jp) {
        this.A01 = c5088Jp;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A0A.A0D().A2x(str);
        setVideoURI(str != null ? C5191La.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(EnumC5087Jo.A0f);
            this.A0A.A0D().A31();
        } else {
            A0L(EnumC5087Jo.A0e);
            this.A0A.A0D().A30();
        }
        this.A0D.setRequestedVolume(f);
        C44829b<AbstractC44839c, C44819a> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
