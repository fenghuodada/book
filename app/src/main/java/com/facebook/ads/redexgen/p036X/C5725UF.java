package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.UF */
/* loaded from: assets/audience_network.dex */
public class C5725UF extends AbstractC5520Qv {
    public static String[] A04 = {"oSoBkaWeyKsp", "KBeBF", "kSDces9j50gwfjS4QfNYnWgLw2iPkymV", "EJmszBWYtRUz1Vdq", "qn5qycmxyPd80aqzWiKeSrAoNfum3VnE", "21Cce2q6wYIDkABj", "e4Lw2G3U", "jRNkDTlKn5mABl6KQSYrYYCrXHx6B19g"};
    public final /* synthetic */ View A00;
    public final /* synthetic */ C6298da A01;
    public final /* synthetic */ C5721UB A02;
    public final /* synthetic */ boolean A03;

    public C5725UF(C5721UB c5721ub, View view, boolean z, C6298da c6298da) {
        this.A02 = c5721ub;
        this.A00 = view;
        this.A03 = z;
        this.A01 = c6298da;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A00() {
        C5114KF c5114kf;
        c5114kf = this.A02.A0e;
        c5114kf.A06();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A01() {
        C5114KF c5114kf;
        c5114kf = this.A02.A0e;
        c5114kf.A0A();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5520Qv
    public final void A02() {
        C5114KF c5114kf;
        C5114KF c5114kf2;
        C5953Xy c5953Xy;
        C5521Qw c5521Qw;
        WeakReference weakReference;
        C5237MK c5237mk;
        C5114KF c5114kf3;
        C6289dR c6289dR;
        View view;
        View view2;
        C6289dR c6289dR2;
        View view3;
        C6289dR c6289dR3;
        View view4;
        C6289dR c6289dR4;
        EnumC5107K8 enumC5107K8;
        C6289dR c6289dR5;
        boolean z;
        C6289dR c6289dR6;
        boolean z2;
        C6289dR c6289dR7;
        boolean z3;
        C6289dR c6289dR8;
        boolean A0p;
        C6289dR c6289dR9;
        EnumC39660z enumC39660z;
        C6289dR c6289dR10;
        boolean z4;
        C6289dR c6289dR11;
        NativeAdLayout nativeAdLayout;
        C6289dR c6289dR12;
        String str;
        C6289dR c6289dR13;
        C6289dR c6289dR14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        C5521Qw c5521Qw2;
        Drawable loadedNativeBannerIconDrawable;
        C5521Qw c5521Qw3;
        C5114KF c5114kf4;
        C5521Qw c5521Qw4;
        C5114KF c5114kf5;
        c5114kf = this.A02.A0e;
        c5114kf.A0B();
        if (C5064JR.A1V(this.A02.A11())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C5466Q3) && !((C5466Q3) adContentsView).A02()) {
                    c5521Qw4 = this.A02.A0R;
                    c5521Qw4.A0T();
                    c5114kf5 = this.A02.A0e;
                    c5114kf5.A08();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            if (A04[6].length() != 8) {
                throw new RuntimeException();
            }
            A04[4] = "kV1RqodiW8kqR1rQOQ4NCiAB35VpASKe";
            loadedNativeBannerIconDrawable = this.A02.A01;
            if (loadedNativeBannerIconDrawable == null) {
                c5521Qw3 = this.A02.A0R;
                c5521Qw3.A0T();
                c5114kf4 = this.A02.A0e;
                c5114kf4.A07();
                return;
            }
            C5721UB.A0e(loadedNativeBannerIconDrawable, imageView);
        }
        c5114kf2 = this.A02.A0e;
        c5953Xy = this.A02.A0c;
        c5114kf2.A0C(c5953Xy, this.A01.A0G());
        c5521Qw = this.A02.A0R;
        if (c5521Qw != null) {
            c5521Qw2 = this.A02.A0R;
            c5521Qw2.A0V();
        }
        weakReference = this.A02.A0V;
        if (weakReference != null) {
            weakReference2 = this.A02.A0V;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0V;
                ((AbstractC5520Qv) weakReference3.get()).A02();
            }
        }
        c5237mk = this.A02.A0f;
        if (c5237mk.A07()) {
            c5114kf3 = this.A02.A0e;
            c5114kf3.A04();
            return;
        }
        this.A02.A0b();
        c6289dR = this.A02.A09;
        if (c6289dR != null) {
            view = this.A02.A04;
            if (view != null) {
                view2 = this.A02.A06;
                if (view2 != null) {
                    c6289dR2 = this.A02.A09;
                    view3 = this.A02.A04;
                    c6289dR2.A08(view3);
                    c6289dR3 = this.A02.A09;
                    view4 = this.A02.A06;
                    c6289dR3.A07(view4);
                    c6289dR4 = this.A02.A09;
                    enumC5107K8 = this.A02.A0I;
                    c6289dR4.A0B(enumC5107K8);
                    c6289dR5 = this.A02.A09;
                    z = this.A02.A0W;
                    c6289dR5.A0E(z);
                    c6289dR6 = this.A02.A09;
                    z2 = this.A02.A0Z;
                    c6289dR6.A0I(z2);
                    c6289dR7 = this.A02.A09;
                    z3 = this.A02.A0Y;
                    c6289dR7.A0H(z3);
                    c6289dR8 = this.A02.A09;
                    A0p = this.A02.A0p();
                    c6289dR8.A0F(A0p);
                    c6289dR9 = this.A02.A09;
                    enumC39660z = this.A02.A08;
                    c6289dR9.A09(enumC39660z);
                    c6289dR10 = this.A02.A09;
                    z4 = this.A02.A0X;
                    c6289dR10.A0G(z4);
                    c6289dR11 = this.A02.A09;
                    nativeAdLayout = this.A02.A07;
                    c6289dR11.A0A(C5302NO.A00(nativeAdLayout));
                    c6289dR12 = this.A02.A09;
                    str = this.A02.A0S;
                    c6289dR12.A0C(str);
                    c6289dR13 = this.A02.A09;
                    c6289dR13.A0J(this.A03);
                    c6289dR14 = this.A02.A09;
                    c6289dR14.A02();
                }
            }
        }
    }
}
