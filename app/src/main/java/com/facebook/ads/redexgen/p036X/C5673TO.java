package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor"})
@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.TO */
/* loaded from: assets/audience_network.dex */
public final class C5673TO extends RelativeLayout implements InterfaceC5270Mr {
    public static byte[] A0W;
    public static String[] A0X = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final RelativeLayout.LayoutParams A0h;
    @Nullable
    public View A00;
    @Nullable
    public RelativeLayout A01;
    @Nullable
    public RelativeLayout A02;
    public Toast A03;
    @Nullable
    public C422159 A04;
    @Nullable
    public View$OnClickListenerC5650T1 A05;
    public C5448Pl A06;
    public C5454Pr A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AbstractC397518 A0D;
    public final C39991W A0E;
    public final InterfaceC421957 A0F;
    public final C5953Xy A0G;
    public final InterfaceC5080Jh A0H;
    public final C5088Jp A0I;
    public final C5202Ll A0J;
    public final View$OnSystemUiVisibilityChangeListenerC5232MF A0K;
    public final InterfaceC5269Mq A0L;
    public final InterfaceC5296NI A0M;
    public final InterfaceC5369OT A0N;
    public final C5370OU A0O;
    public final C5453Pq A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    @VisibleForTesting
    public final AbstractC5268Mp A0V;

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0W = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, -6, -19, 0, -11, 2, -15, -21, -17, -8, -11, -17, -9, -53, -57, -68, -66, -64, -56, -64, -55, -49, -41, -54, -36, -58, -41, -55, -54, -55, -60, -37, -50, -55, -54, -44, -60, -78, -81, -61, -74, -78, -60, -84, -80, -71, -74, -80, -72};
    }

    static {
        A0P();
        A0f = (int) (C5208Lr.A00 * 64.0f);
        A0a = (int) (C5208Lr.A00 * 16.0f);
        A0g = (int) (C5208Lr.A00 * 12.0f);
        A0Y = (int) (C5208Lr.A00 * 10.0f);
        A0h = new RelativeLayout.LayoutParams(-1, -1);
        A0b = (int) (C5208Lr.A00 * 48.0f);
        A0c = (int) (C5208Lr.A00 * 16.0f);
        A0e = (int) (C5208Lr.A00 * 14.0f);
        A0d = C40592U.A01(-1, 77);
        A0Z = (int) (C5208Lr.A00 * 8.0f);
    }

    public C5673TO(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq, AbstractC397518 abstractC397518, @Nullable String str, InterfaceC5296NI interfaceC5296NI) {
        super(c5953Xy);
        int A07;
        this.A0F = new C5680TV(this);
        this.A0R = new AtomicBoolean(false);
        this.A0Q = new AtomicBoolean(false);
        this.A0A = false;
        this.A0C = true;
        this.A0G = c5953Xy;
        this.A0L = interfaceC5269Mq;
        this.A0H = interfaceC5080Jh;
        this.A0D = abstractC397518;
        this.A0E = abstractC397518.A0O().A0D().A06();
        this.A0I = new C5088Jp(this.A0D.A0U(), this.A0H);
        this.A0M = interfaceC5296NI;
        this.A07 = new C5454Pr(c5953Xy, this.A0M, str, this.A0L);
        this.A09 = this.A0D.A0O().A0M() && this.A0D.A0O().A0D().A02() > 0;
        this.A0U = this.A0D.A0O().A0D().A0A();
        if (this.A0E == null) {
            this.A0L.A3s(this.A0M.A6Z());
            this.A0L.A3s(this.A0M.A6U());
        }
        if (this.A09 && this.A0U) {
            A07 = this.A0D.A0O().A0D().A02();
        } else {
            A07 = this.A0E.A07();
        }
        this.A0R.set(!this.A0E.A0I());
        this.A0J = new C5202Ll(A07, new C5675TQ(this, null));
        this.A0T = C5064JR.A23(this.A0G);
        this.A0S = C5064JR.A0i(this.A0G);
        this.A0V = A06();
        this.A0P = new C5453Pq(this.A0G, this.A0H, this.A0D);
        if (!this.A0T) {
            C5245MS.A0M(this, -14473425);
        } else {
            C5379Od.A00(c5953Xy, this, abstractC397518.A0O().A0D().A07());
        }
        this.A0K = new View$OnSystemUiVisibilityChangeListenerC5232MF(this);
        this.A0K.A05(EnumC5231ME.A03);
        if (C5064JR.A1X(this.A0G)) {
            this.A0V.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(44, 9, 51), this.A0M.A7C());
        this.A06 = new C5448Pl(this.A0G, this.A0D, this.A0E, this.A0H, new C5674TP(this, null), hashMap);
        A0L();
        this.A0L.A3I(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        this.A0N = new C5679TU(this);
        this.A0O = new C5370OU(this.A0G, this.A0V, this.A0D, (C5483QK) null, this.A0L, this.A0N, this.A05, this.A01, this.A06);
    }

    private AbstractC5268Mp A06() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0G, this.A0L, this.A0I, 0, this.A0D.A0F());
        fullScreenAdToolbar.A04(this.A0D.A0N().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0D.A0R(), this.A0D.A0U(), this.A0E.A07(), this.A0D.A0S());
        fullScreenAdToolbar.setToolbarListener(new C5677TS(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private View$OnClickListenerC5650T1 A09() {
        C5448Pl c5448Pl = this.A06;
        if (c5448Pl == null || c5448Pl.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        View$OnClickListenerC5650T1 view$OnClickListenerC5650T1 = new View$OnClickListenerC5650T1(this.A0G, this.A0M.A64(), this.A0D.A0N().A01(), this.A0H, this.A0L, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        C5245MS.A0K(view$OnClickListenerC5650T1);
        view$OnClickListenerC5650T1.setText(this.A0D.A0O().A0F().A04());
        view$OnClickListenerC5650T1.setTextSize(14.0f);
        view$OnClickListenerC5650T1.setIncludeFontPadding(false);
        int i = A0Y;
        view$OnClickListenerC5650T1.setPadding(i, i, i, i);
        if (!this.A0T) {
            C5245MS.A0N(view$OnClickListenerC5650T1, 8);
        }
        view$OnClickListenerC5650T1.setOnClickListener(new View$OnClickListenerC5280N1(this));
        return view$OnClickListenerC5650T1;
    }

    private C5378Oc A0C() {
        C5378Oc c5378Oc = new C5378Oc(this.A0G, this.A0D.A0N().A01(), true, 16, 14, 0);
        c5378Oc.A01(this.A0D.A0O().A0E().A06(), this.A0D.A0O().A0E().A05(), null, false, true);
        TextView descriptionTextView = c5378Oc.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView titleTextView = c5378Oc.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        return c5378Oc;
    }

    private void A0H() {
        int i = A0b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C5372OW c5372ow = new C5372OW(this.A0G);
        C5245MS.A0M(c5372ow, 0);
        C5245MS.A0K(c5372ow);
        AsyncTaskC5652T3 asyncTaskC5652T3 = new AsyncTaskC5652T3(c5372ow, this.A0G);
        int i2 = A0b;
        asyncTaskC5652T3.A05(i2, i2).A07(this.A0D.A0R().A01());
        TextView ratingCountView = new TextView(this.A0G);
        C5245MS.A0K(ratingCountView);
        ratingCountView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ratingCountView.setTextColor(this.A0D.A0N().A01().A06(true));
        ratingCountView.setText(this.A0D.A0O().A0E().A06());
        ratingCountView.setTextSize(16.0f);
        ratingCountView.setMaxLines(1);
        ratingCountView.setEllipsize(TextUtils.TruncateAt.END);
        C5374OY c5374oy = new C5374OY(this.A0G, A0e, 5, A0d, -1);
        c5374oy.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView = new TextView(this.A0G);
        textView.setTextColor(this.A0D.A0N().A01().A06(true));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0Z;
        LinearLayout linearLayout = new LinearLayout(this.A0G);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0c);
        layoutParams4.topMargin = A0Z / 2;
        layoutParams4.addRule(3, ratingCountView.getId());
        linearLayout.addView(c5374oy, layoutParams2);
        linearLayout.addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0Z;
        layoutParams5.addRule(1, c5372ow.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(ratingCountView);
        RelativeLayout titleAndRatingContainer = this.A02;
        if (titleAndRatingContainer != null) {
            titleAndRatingContainer.removeAllViews();
            RelativeLayout relativeLayout2 = this.A02;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            A0X[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout2.addView(relativeLayout, layoutParams5);
            this.A02.addView(c5372ow, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0D.A0O().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c5374oy.setRating(Float.parseFloat(this.A0D.A0O().A0E().A03()));
        if (this.A0D.A0O().A0E().A02() == null) {
            return;
        }
        textView.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0D.A0O().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0E.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A05(EnumC5231ME.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0B = true;
        if (this.A0D.A0O().A0M()) {
            this.A07.A05();
            this.A0L.A3t(this.A0M.A5a(), new C439788(0, 0));
            if (this.A08) {
                boolean z = this.A0T;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0X;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    C5363ON.A03(this.A0G, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0D.A0O().A0F(), this.A0D.A0U());
                }
            }
        }
    }

    private void A0K() {
        C5428PR A0B = new C5426PP(this.A0G, this.A0D.A0O().A0E(), this.A0D.A0R()).A08(this.A0D.A0N().A01()).A0A(this.A0E.A0G()).A09(this.A0E.A0D()).A07(AdError.SERVER_ERROR_CODE).A0B();
        C5090Jr.A04(A0B, this.A0I, EnumC5087Jo.A0U);
        addView(A0B, A0h);
        A0B.A04(new C5678TT(this));
    }

    private void A0L() {
        this.A05 = A09();
        this.A01 = new RelativeLayout(getContext());
        C5245MS.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0a;
        int i2 = A0g;
        layoutParams.setMargins(i, i2, i, i2);
        layoutParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        C5245MS.A0K(this.A02);
        if (this.A0S) {
            A0H();
        } else {
            RelativeLayout relativeLayout = this.A02;
            C5378Oc A0C = A0C();
            RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0C, adWebViewParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0a, 0);
        this.A01.addView(this.A02, layoutParams2);
        View$OnClickListenerC5650T1 view$OnClickListenerC5650T1 = this.A05;
        if (view$OnClickListenerC5650T1 != null) {
            layoutParams2.addRule(0, view$OnClickListenerC5650T1.getId());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(6, this.A02.getId());
            layoutParams3.addRule(8, this.A02.getId());
            this.A01.addView(this.A05, layoutParams3);
        }
        C5245MS.A0K(this.A0V);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(10);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        int i3 = A0a;
        layoutParams5.setMargins(i3, 0, i3, 0);
        layoutParams5.addRule(3, this.A0V.getId());
        layoutParams5.addRule(2, this.A01.getId());
        this.A0V.setVisibility(4);
        this.A06.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0V, layoutParams4);
        addView(this.A06, layoutParams5);
        addView(this.A01, layoutParams);
        if (this.A0E.A0J()) {
            this.A06.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C5088Jp(this.A0D.A0U(), this.A0H).A02(EnumC5087Jo.A0r, null);
        this.A0Q.set(true);
        C5245MS.A0T(this);
        C5245MS.A0H(this.A06);
        C5245MS.A0Z(this.A0O, this.A00, this.A06);
        C5245MS.A0L(this.A0V);
        C5245MS.A0L(this.A05);
        Pair<EnumC5452Pp, View> A03 = this.A0P.A03(this.A05);
        this.A00 = (View) A03.second;
        int i = C5281N2.A00[((EnumC5452Pp) A03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                C5245MS.A0Z(relativeLayout);
            }
            RelativeLayout.LayoutParams infoParams = new RelativeLayout.LayoutParams(-1, -1);
            addView(this.A00, infoParams);
            return;
        }
        RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
        screenshotParams.setMargins(0, this.A0V.getToolbarHeight(), 0, 0);
        C5245MS.A0L(this.A01);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            screenshotParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, screenshotParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        C5245MS.A0T(this);
        if (!this.A0E.A0J()) {
            C5448Pl c5448Pl = this.A06;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c5448Pl.A0B();
        }
        this.A0V.setVisibility(0);
        this.A06.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.A0J.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0E.A0C(), 1);
        A0Q((int) this.A0J.A03());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        C5245MS.A0Y(this.A03, this.A0E.A0C().replace(A0E(2, 6, 31), String.valueOf(i)), 49, 0, A0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(8, 12, 121), z ? A0E(67, 13, 37) : A0E(32, 12, 100));
        C5363ON c5363on = new C5363ON(this.A0G, this.A0M.A64(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0L);
        if (this.A0T) {
            c5363on.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), hashMap);
            return;
        }
        boolean z2 = !this.A0J.A04();
        c5363on.A0A(!z2);
        c5363on.A08(this.A0D.A0U(), this.A0D.A0O().A0F().A05(), hashMap);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new C5676TR(this));
        }
        this.A08 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0D.A0Y().equals(A0E(53, 14, 61))) {
            if (this.A0D.A0Y().equals(A0E(20, 12, 40))) {
                AbstractC397518 abstractC397518 = this.A0D;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0X[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC397518.A0O().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0U && !this.A0A && !this.A0C && this.A0E.A07() < this.A0D.A0O().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, Bundle bundle, C422159 c422159) {
        this.A04 = c422159;
        this.A04.A0K(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
        this.A0J.A06();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
        if (this.A0U && this.A0C) {
            return;
        }
        boolean z2 = this.A0A;
        if (A0X[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0X[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0R.get() && !this.A0J.A05()) {
            this.A0J.A07();
        }
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
        this.A0K.A03();
        C422159 c422159 = this.A04;
        if (c422159 != null) {
            c422159.A0L(this.A0F);
        }
        if (this.A06 != null) {
            AbstractC397518 abstractC397518 = this.A0D;
            if (A0X[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0X[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC397518.A0U())) {
                this.A0H.A8v(this.A0D.A0U(), new C5356OG().A03(this.A06.getViewabilityChecker()).A02(this.A06.getTouchDataRecorder()).A05());
            }
            this.A06.A0C();
        }
        this.A0J.A06();
        this.A0V.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AC8(false);
        } else {
            ABj(false);
        }
    }

    public void setListener(InterfaceC5269Mq interfaceC5269Mq) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C5454Pr c5454Pr) {
        this.A07 = c5454Pr;
    }
}
