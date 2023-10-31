package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.A2 */
/* loaded from: assets/audience_network.dex */
public final class C4509A2 extends FrameLayout implements InterfaceC5270Mr, InterfaceC5619SW {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public InterfaceC421957 A00;
    @Nullable
    public C422159 A01;
    @Nullable
    public InterfaceC5421PK A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC397518 A06;
    public final C5953Xy A07;
    public final InterfaceC5080Jh A08;
    public final C5088Jp A09;
    public final View$OnSystemUiVisibilityChangeListenerC5232MF A0A;
    public final C5237MK A0B;
    public final InterfaceC5269Mq A0C;
    public final InterfaceC5296NI A0D;
    @Nullable
    public final C5404P2 A0E;
    public final C5411PA A0F;
    @DoNotStrip
    public final AbstractC5520Qv A0G;
    public final C5521Qw A0H;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98};
    }

    static {
        A0D();
    }

    public C4509A2(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, AbstractC397518 abstractC397518, InterfaceC5296NI interfaceC5296NI, @DynamicWebViewController$AdFormatType int i) {
        super(c5953Xy);
        this.A00 = new C5632Sj(this);
        this.A0G = new C5631Si(this);
        this.A03 = true;
        this.A07 = c5953Xy;
        this.A08 = interfaceC5080Jh;
        this.A0C = interfaceC5269Mq;
        this.A06 = abstractC397518;
        this.A0D = interfaceC5296NI;
        C5411PA A02 = C5412PB.A02(abstractC397518.A0Z());
        if (A02 == null) {
            this.A0F = new C5411PA(this.A07, abstractC397518, interfaceC5080Jh, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C5630Sh(this));
        C5245MS.A0G(1003, this.A0F.A0O());
        if (this.A06.A0o()) {
            C5953Xy c5953Xy2 = this.A07;
            this.A0E = new C5404P2(c5953Xy2, this.A08, this.A06, new C43657U(c5953Xy2), this.A09, this.A0C, this.A0D, new C5629Sg(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new View$OnTouchListenerC5400Oy(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C5521Qw(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0H());
        this.A0H.A0X(this.A06.A0I());
        this.A0F.A0e(this.A0H);
        this.A0A = new View$OnSystemUiVisibilityChangeListenerC5232MF(this);
        this.A0A.A05(EnumC5231ME.A03);
        setBackgroundColor(0);
        if (C5064JR.A1I(c5953Xy)) {
            c5953Xy.A09().AFR(mediaView, abstractC397518.A0U(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A0q = abstractC397518.A0q();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (!A0q) {
                if (C5192Lb.A05(abstractC397518.A0X())) {
                    jSONObject.put(A0B4, true);
                    jSONObject.put(A0B3, 2);
                    jSONObject.put(A0B2, 1);
                    jSONObject.put(A0B, this.A06.A0L());
                }
            } else {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, 0);
                jSONObject.put(A0B, this.A06.A0L());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            C5411PA preloadedDynamicWebViewController = this.A0F;
            preloadedDynamicWebViewController.A0M().A04(C44458z.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        C5428PR A0B = new C5426PP(this.A07, this.A06.A0O().A0E(), this.A06.A0R()).A08(this.A06.A0N().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new C5627Se(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0D().A4w();
            this.A0F.A0X();
        } else {
            this.A07.A0D().A4x();
            if (this.A0F.A0k()) {
                AF2();
                C5953Xy c5953Xy = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (C5064JR.A1I(c5953Xy)) {
                    this.A07.A09().AAT();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0p()) {
            this.A0A.A05(EnumC5231ME.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new C5363ON(this.A07, this.A0D.A64(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A06.A0U(), str, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A7w() {
        A0F(this.A06.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A7x(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A81() {
        this.A0C.A3s(this.A0D.A5a());
        new C5454Pr(this.A07, this.A0D, this.A06.A0a(), this.A0C).A05();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new C5628Sf(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, C422159 c422159) {
        C5411PA.A0B().incrementAndGet();
        c422159.A0K(this.A00);
        this.A01 = c422159;
        A0E();
        if (this.A06.A0O().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AAr() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AAv() {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ABZ(boolean z) {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0T(z);
        }
        boolean z2 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z2) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACK() {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACn(boolean z) {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACp(boolean z) {
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AD2(String str) {
        String A0b = this.A06.A0b(str);
        if (A0b == null) {
            return;
        }
        C5190LZ.A0E(new C5190LZ(), this.A07, C5191La.A00(A0b), this.A06.A0U());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AEI(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AF2() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void close() {
        C422159 c422159 = this.A01;
        if (c422159 == null) {
            return;
        }
        c422159.finish(4);
    }

    private ViewGroup getMediaView() {
        C5404P2 c5404p2 = this.A0E;
        return c5404p2 != null ? c5404p2 : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        if (C5064JR.A1I(this.A07)) {
            this.A07.A09().AFF(getMediaView());
        }
        C5404P2 c5404p2 = this.A0E;
        if (c5404p2 != null) {
            c5404p2.A0O();
        }
        this.A0A.A03();
        this.A08.A8v(this.A06.A0U(), new C5356OG().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        C5412PB.A04(this.A06.A0Z());
        C5411PA.A0B().decrementAndGet();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC5269Mq interfaceC5269Mq) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC5421PK interfaceC5421PK) {
        this.A02 = interfaceC5421PK;
    }
}
