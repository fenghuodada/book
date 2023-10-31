package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.UB */
/* loaded from: assets/audience_network.dex */
public final class C5721UB implements InterfaceC3877Ad, NativeAdBaseApi, Repairable, InterfaceC5112KD {
    public static C43657U A0k;
    public static byte[] A0l;
    public static String[] A0m = {"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<C5721UB>> A0o;
    public long A00;
    @Nullable
    public Drawable A01;
    @Nullable
    public View.OnTouchListener A02;
    @Nullable
    public View A03;
    @Nullable
    public View A04;
    @Nullable
    public View A05;
    @Nullable
    public View A06;
    @Nullable
    public NativeAdLayout A07;
    public EnumC39660z A08;
    @Nullable
    public C6289dR A09;
    @Nullable
    public C4819FO A0A;
    @Nullable
    public C6258cw A0B;
    @Nullable
    public C43707Z A0C;
    @Nullable
    public C44649I A0D;
    public EnumC5098Jz A0E;
    @Nullable
    public View$OnClickListenerC5723UD A0F;
    @Nullable
    public InterfaceC5720UA A0G;
    @Nullable
    public C5106K7 A0H;
    public EnumC5107K8 A0I;
    public EnumC5119KM A0J;
    @Nullable
    public C5295NH A0K;
    @Nullable
    public C5354OE A0L;
    @Nullable
    @DoNotStrip
    public C5411PA A0M;
    @Nullable
    public C5445Pi A0N;
    @Nullable
    @DoNotStrip
    public AbstractC5520Qv A0O;
    @Nullable
    @DoNotStrip
    public AbstractC5520Qv A0P;
    @Nullable
    public C5521Qw A0Q;
    @Nullable
    public C5521Qw A0R;
    @Nullable
    public String A0S;
    @Nullable
    public String A0T;
    public WeakReference<C6196bt> A0U;
    @Nullable
    public WeakReference<AbstractC5520Qv> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    @Nullable
    public C6298da A0a;
    public final C43657U A0b;
    public final C5953Xy A0c;
    @Nullable
    public final InterfaceC5103K4 A0d;
    public final C5114KF A0e;
    public final C5237MK A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0l, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{86, -112, -100, -107, -108, -91, -88, -42, -41, -40, -87, -92, -38, -76, -26, -70, -77, -28, -27, -30, -76, -25, 10, -58, 20, 21, 26, -58, 18, 21, 7, 10, 11, 10, 125, -96, -112, -95, -87, -84, -88, -99, -80, -95, 92, 99, 97, -81, 99, 92, -91, -81, 92, -86, -85, -80, 92, -99, 92, -86, -99, -80, -91, -78, -95, 92, -99, -96, -62, -66, -67, -15, -32, -27, -31, -22, -33, -31, -54, -31, -16, -13, -21, -18, -25, -105, -78, -70, -67, -74, -75, 113, -59, -64, 113, -67, -64, -78, -75, 113, -98, -74, -75, -70, -78, Byte.MAX_VALUE, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -42, -55, -37, -56, -48, -43, -121, -37, -52, -44, -41, -45, -56, -37, -52, -121, -80, -85, -121, -51, -39, -42, -44, -121, -55, -48, -53, -121, -41, -56, -32, -45, -42, -56, -53, -121, -114, -116, -38, -114, -93, -56, -50, -65, -52, -56, -69, -58, 122, -65, -52, -52, -55, -52, -120, 100, -79, -42, -34, -55, -44, -47, -52, -120, -37, -51, -36, -120, -41, -50, -120, -53, -44, -47, -53, -45, -55, -54, -44, -51, -120, -34, -47, -51, -33, -37, -43, -19, -20, -15, -23, -34, -15, -19, -1, -88, -18, -9, -6, -88, -15, -21, -9, -10, -88, -15, -5, -88, -15, -5, -88, -11, -15, -5, -5, -15, -10, -17, -74, -73, -49, -50, -45, -53, -64, -45, -49, -31, -118, -45, -35, -118, -41, -45, -35, -35, -45, -40, -47, -104, -71, -31, -33, -32, -116, -36, -34, -37, -30, -43, -48, -47, -116, -51, -116, -62, -43, -47, -29, -116, -97, -78, -89, -76, -93, 94, Byte.MAX_VALUE, -94, 94, -75, -97, -79, 94, -97, -86, -80, -93, -97, -94, -73, 94, -80, -93, -91, -89, -79, -78, -93, -80, -93, -94, 94, -75, -89, -78, -90, 94, -97, 94, -108, -89, -93, -75, 108, 94, Byte.MAX_VALUE, -77, -78, -83, 94, -77, -84, -80, -93, -91, -89, -79, -78, -93, -80, -89, -84, -91, 94, -97, -84, -94, 94, -82, -80, -83, -95, -93, -93, -94, -89, -84, -91, 108, -49, -30, -11, -22, -9, -26, -95, -30, -27, -95, -27, -26, -12, -11, -13, -16, -6, -26, -27, -115, -96, -77, -88, -75, -92, 95, -96, -93, 95, -85, -82, -96, -93, 95, -79, -92, -80, -76, -92, -78, -77, -92, -93, -32, -13, -17, 1, -86, -21, -10, -4, -17, -21, -18, 3, -86, -4, -17, -15, -13, -3, -2, -17, -4, -17, -18, -86, 1, -13, -2, -14, -86, -21, -86, -40, -21, -2, -13, 0, -17, -53, -18, -72, -86, -53, -1, -2, -7, -86, -1, -8, -4, -17, -15, -13, -3, -2, -17, -4, -13, -8, -15, -86, -21, -8, -18, -86, -6, -4, -7, -19, -17, -17, -18, -13, -8, -15, -72, -115, -96, -100, -82, 87, -91, -90, -85, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -85, -97, -96, -86, 87, -123, -104, -85, -96, -83, -100, 120, -101, -47, -44, -112, -35, -43, -44, -39, -47, -112, -28, -23, -32, -43, -112, -39, -29, -112, -34, -33, -28, -112, -29, -27, -32, -32, -33, -30, -28, -43, -44, -98, -104, -89, -96, -113, 99, 92, -114, 99, 95, 99, -109, -108, -94, -93, -95, -98, -88, -94, -91, -105, -102, 119, -102, 7, 10, -4, -1, -36, -1, -61, -60, -69, -2, -4, 7, 7, 0, -1, -69, 8, 10, 13, 0, -69, 15, 3, -4, 9, -69, 10, 9, -2, 0, -17, -30, -11, -22, -9, -26};
    }

    static {
        A0d();
        A0n = C5721UB.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public C5721UB(Context context, String str, @Nullable InterfaceC5103K4 interfaceC5103K4, boolean z) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = EnumC5119KM.A05;
        this.A0E = EnumC5098Jz.A04;
        this.A08 = EnumC39660z.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new C5237MK();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C5953Xy) {
            this.A0c = (C5953Xy) context;
        } else if (!z) {
            this.A0c = C42285G.A04(context);
        } else {
            this.A0c = C42285G.A02(context);
        }
        this.A0c.A0G(this);
        this.A0g = str;
        this.A0d = interfaceC5103K4;
        C43657U c43657u = A0k;
        if (c43657u != null) {
            this.A0b = c43657u;
        } else {
            this.A0b = new C43657U(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new C5114KF(this.A0c, this);
    }

    public C5721UB(C5721UB c5721ub) {
        this((Context) c5721ub.A0c, (String) null, c5721ub.A0d, true);
        this.A0D = c5721ub.A0D;
        this.A0a = c5721ub.A0a;
        this.A0B = c5721ub.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public C5721UB(C5953Xy c5953Xy, C6298da c6298da, @Nullable C44649I c44649i, @Nullable InterfaceC5103K4 interfaceC5103K4) {
        this((Context) c5953Xy, (String) null, interfaceC5103K4, true);
        this.A0a = c6298da;
        this.A0D = c44649i;
        this.A0j = true;
        this.A05 = new View(c5953Xy);
    }

    public C5721UB(C5953Xy c5953Xy, C6298da c6298da, @Nullable C44649I c44649i, InterfaceC5103K4 interfaceC5103K4, @Nullable C6258cw c6258cw) {
        this(c5953Xy, c6298da, c44649i, interfaceC5103K4);
        this.A0B = c6258cw;
    }

    private int A00() {
        C44649I c44649i = this.A0D;
        if (c44649i != null) {
            return c44649i.A04();
        }
        C4819FO c4819fo = this.A0A;
        if (c4819fo == null || c4819fo.A0D() == null) {
            return 1;
        }
        return this.A0A.A0D().A04();
    }

    private int A01() {
        C44649I c44649i = this.A0D;
        if (c44649i != null) {
            return c44649i.A07();
        }
        C6298da c6298da = this.A0a;
        if (c6298da != null) {
            int A0C = c6298da.A0C();
            String[] strArr = A0m;
            if (strArr[1].charAt(16) != strArr[3].charAt(16)) {
                String[] strArr2 = A0m;
                strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
                strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
                return A0C;
            }
            throw new RuntimeException();
        }
        C4819FO c4819fo = this.A0A;
        if (c4819fo != null && c4819fo.A0D() != null) {
            return this.A0A.A0D().A07();
        }
        return 0;
    }

    private int A02() {
        C44649I c44649i = this.A0D;
        if (c44649i != null) {
            return c44649i.A08();
        }
        C6298da c6298da = this.A0a;
        if (c6298da != null) {
            int A0D = c6298da.A0D();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
                strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
                return A0D;
            }
            throw new RuntimeException();
        }
        C4819FO c4819fo = this.A0A;
        String[] strArr3 = A0m;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0m;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (c4819fo == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0m;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (c4819fo == null) {
                return 1000;
            }
        }
        if (c4819fo.A0D() != null) {
            return this.A0A.A0D().A08();
        }
        return 1000;
    }

    private int A03() {
        C44649I c44649i = this.A0D;
        if (c44649i != null) {
            return c44649i.A09();
        }
        C4819FO c4819fo = this.A0A;
        if (c4819fo == null || c4819fo.A0D() == null) {
            return 0;
        }
        return this.A0A.A0D().A09();
    }

    public static Drawable A05(C5953Xy c5953Xy, Bitmap bitmap, boolean z, @Nullable String str) {
        BitmapDrawable A00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c5953Xy.getResources(), bitmap);
        return (!z || (A00 = C5444Ph.A00(c5953Xy, str)) == null) ? bitmapDrawable : new LayerDrawable(new Drawable[]{bitmapDrawable, A00});
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws C5116KI {
        EnumC5119KM A00 = C5124KR.A00(str2);
        if (A00 != null) {
            EnumC5119KM enumC5119KM = EnumC5119KM.A04;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (A00 == enumC5119KM) {
                return new NativeBannerAd(context, str);
            }
            if (A00 == EnumC5119KM.A05) {
                return new NativeAd(context, str);
            }
            throw new C5116KI(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(34, 34, 20), A00));
        }
        throw new C5116KI(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(106, 50, 63), str2));
    }

    @Nullable
    private final C6298da A0C() {
        C6298da c6298da = this.A0a;
        if (c6298da != null && c6298da.A0T()) {
            return c6298da;
        }
        return null;
    }

    private C396811 A0F() {
        return A0G(false);
    }

    private C396811 A0G(boolean z) {
        C6298da c6298da = this.A0a;
        if (c6298da != null && c6298da.A0T()) {
            if (z) {
                this.A0a.A0I();
            }
            C6298da c6298da2 = this.A0a;
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[7] = "bGIdjP48JCmqHZjd8yMcvy0";
                strArr2[5] = "TixE3qv3ULKos9kbBUakVg1";
                return c6298da2.A0E();
            }
            throw new RuntimeException();
        }
        return new C396811();
    }

    public static InterfaceC5103K4 A0K() {
        return new C5724UE();
    }

    public static C5721UB A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (C5721UB) ((C421250) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (C5721UB) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0M */
    public final C5104K5 getAdChoicesIcon() {
        return A0F().A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A0O */
    public final C5105K6 getAdStarRating() {
        return A0F().A0H();
    }

    private AdPlacementType A0R() {
        if (this.A0J == EnumC5119KM.A05) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (View view : this.A0i) {
            view.setOnClickListener(null);
            view.setOnTouchListener(null);
            view.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            C5190LZ.A0E(new C5190LZ(), this.A0c, C5191La.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        C5521Qw c5521Qw = this.A0Q;
        if (c5521Qw != null) {
            c5521Qw.A0V();
            this.A0c.A0D().A9f();
            this.A0Q = null;
        }
    }

    public static void A0e(@Nullable Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0f(View view, View view2, List<View> list, boolean z) {
        InterfaceC5720UA interfaceC5720UA;
        if (!A0q()) {
            this.A0c.A0D().ADl();
        }
        if (view == null) {
            String A0W = A0W(256, 19, 68);
            if (!A0q()) {
                this.A0c.A0D().ADk(A0W);
            }
            throw new IllegalArgumentException(A0W);
        } else if (list == null || list.size() == 0) {
            String A0W2 = A0W(172, 30, 64);
            if (!A0q()) {
                this.A0c.A0D().ADk(A0W2);
            }
            throw new IllegalArgumentException(A0W2);
        } else {
            C6298da A0C = A0C();
            if (A0C == null) {
                String A0W3 = A0W(21, 13, 126);
                if (!A0q()) {
                    this.A0c.A0D().ADk(A0W3);
                }
                Log.e(A0n, A0W3);
                C5115KH c5115kh = new C5115KH(AdErrorType.NATIVE_AD_IS_NOT_LOADED, A0W3);
                A11().A0D().A2a(C5236MJ.A01(this.A00), c5115kh.A03().getErrorCode(), c5115kh.A04());
                if (C5064JR.A1v(this.A0c) && (interfaceC5720UA = this.A0G) != null) {
                    interfaceC5720UA.AAi(c5115kh);
                    return;
                }
                return;
            }
            String str = this.A0T;
            boolean z2 = view instanceof FrameLayout;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
            strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
            if (z2 && str != null) {
                A0g((FrameLayout) view, str);
            }
            NativeAdLayout nativeAdLayout = this.A07;
            if (nativeAdLayout != null) {
                ((C6179bc) nativeAdLayout.getNativeAdLayoutApi()).A02();
            }
            C6196bt c6196bt = this.A0U.get();
            if (c6196bt != null && A0C.A08() == 1) {
                c6196bt.A03(EnumC5253Ma.AN_INFO_ICON);
            }
            if (view2 == null) {
                if (this.A0J == EnumC5119KM.A05) {
                    AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                    String A0W4 = A0W(235, 21, 66);
                    C5115KH c5115kh2 = new C5115KH(adErrorType, A0W4);
                    A11().A0D().A2a(C5236MJ.A01(this.A00), c5115kh2.A03().getErrorCode(), c5115kh2.A04());
                    InterfaceC5720UA interfaceC5720UA2 = this.A0G;
                    if (interfaceC5720UA2 != null) {
                        interfaceC5720UA2.AAi(c5115kh2);
                    }
                    if (AdInternalSettings.isDebugBuild()) {
                        Log.e(A0n, A0W4);
                        return;
                    }
                    return;
                }
                AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
                String A0W5 = A0W(202, 33, 96);
                C5115KH c5115kh3 = new C5115KH(adErrorType2, A0W5);
                A11().A0D().A2a(C5236MJ.A01(this.A00), c5115kh3.A03().getErrorCode(), c5115kh3.A04());
                InterfaceC5720UA interfaceC5720UA3 = this.A0G;
                if (interfaceC5720UA3 != null) {
                    interfaceC5720UA3.AAi(c5115kh3);
                }
                if (!AdInternalSettings.isDebugBuild()) {
                    return;
                }
                Log.e(A0n, A0W5);
                return;
            }
            boolean z3 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
            boolean z4 = z && (view2 instanceof ImageView);
            if (!z3 && !z4) {
                if (this.A0G != null) {
                    C5115KH c5115kh4 = new C5115KH(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(511, 31, 72));
                    A11().A0D().A2a(C5236MJ.A01(this.A00), c5115kh4.A03().getErrorCode(), c5115kh4.A04());
                    this.A0G.AAi(c5115kh4);
                    return;
                }
                return;
            }
            if (this.A04 != null) {
                Log.w(A0n, A0W(275, 80, 22));
                String[] strArr3 = A0m;
                if (strArr3[7].length() != strArr3[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0m;
                strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
                strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
                unregisterView();
            }
            boolean nativeAdBannerViewIsImageView = A0o.containsKey(view);
            if (nativeAdBannerViewIsImageView && A0o.get(view).get() != null) {
                Log.w(A0n, A0W(398, 75, 98));
                A0o.get(view).get().unregisterView();
            }
            this.A0F = new View$OnClickListenerC5723UD(this, this.A0c, null);
            this.A04 = view;
            this.A06 = view2;
            boolean nativeAdBannerViewIsImageView2 = view instanceof ViewGroup;
            if (nativeAdBannerViewIsImageView2) {
                this.A0K = new C5295NH(this.A0c, new C5727UH(this));
                ((ViewGroup) view).addView(this.A0K);
            }
            boolean nativeAdBannerViewIsImageView3 = A0C.A0U();
            if (nativeAdBannerViewIsImageView3) {
                this.A0O = new C5726UG(this);
                this.A0Q = new C5521Qw(view, 1, new WeakReference(this.A0O), this.A0c);
                this.A0Q.A0Y(false);
                this.A0Q.A0X(A0C.A09());
                this.A0Q.A0U();
                this.A0c.A0D().A9e();
            }
            ArrayList<View> arrayList = new ArrayList(list);
            View view3 = this.A05;
            if (view3 != null) {
                arrayList.add(view3);
            }
            for (View view4 : arrayList) {
                A1K(view4);
            }
            int A00 = A00();
            this.A0P = new C5725UF(this, view2, z4, A0C);
            if (view2 instanceof AdNativeComponentView) {
                this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
            } else {
                this.A03 = view2;
            }
            if (C5064JR.A1I(this.A0c)) {
                String clientToken = A1B();
                InterfaceC5092Jt A09 = A11().A09();
                View view5 = this.A03;
                if (clientToken == null) {
                    clientToken = A0W(0, 0, 21);
                }
                A09.AFQ(view5, clientToken, this.A03 instanceof C5466Q3, true);
            }
            this.A0R = new C5521Qw(this.A03, A00, A03(), true, new WeakReference(this.A0P), this.A0c);
            this.A0R.A0Y(!A0q());
            C5521Qw c5521Qw = this.A0R;
            int viewabilityThreshold = A01();
            c5521Qw.A0W(viewabilityThreshold);
            C5521Qw c5521Qw2 = this.A0R;
            int viewabilityThreshold2 = A02();
            c5521Qw2.A0X(viewabilityThreshold2);
            View view6 = this.A03;
            if (view6 instanceof C5344O4) {
                ((C5344O4) view6).A06(this.A0R);
            }
            this.A09 = new C6289dR(this.A0c, new C5722UC(this, null), this.A0R, this.A0a);
            this.A09.A0D(arrayList);
            A0o.put(view, new WeakReference<>(this));
            if (Build.VERSION.SDK_INT >= 18 && C5064JR.A0w(this.A0c)) {
                this.A0L = new C5354OE();
                this.A0L.A0C(this.A0g);
                this.A0L.A0B(this.A0c.getPackageName());
                this.A0L.A0A(this.A0R);
                C6298da c6298da = this.A0a;
                if (c6298da != null) {
                    int viewabilityThreshold3 = c6298da.A0E().A03();
                    if (viewabilityThreshold3 > 0) {
                        C396811 A0E = this.A0a.A0E();
                        C5354OE c5354oe = this.A0L;
                        int A03 = A0E.A03();
                        int viewabilityThreshold4 = A0E.A04();
                        c5354oe.A08(A03, viewabilityThreshold4);
                    }
                }
                C44649I c44649i = this.A0D;
                if (c44649i != null) {
                    this.A0L.A09(c44649i.A0C());
                } else {
                    C4819FO c4819fo = this.A0A;
                    if (c4819fo != null && c4819fo.A0D() != null) {
                        this.A0L.A09(this.A0A.A0D().A0C());
                    }
                }
                View view7 = this.A04;
                String[] strArr5 = A0m;
                String str2 = strArr5[4];
                String str3 = strArr5[6];
                int length = str2.length();
                int viewabilityThreshold5 = str3.length();
                if (length != viewabilityThreshold5) {
                    String[] strArr6 = A0m;
                    strArr6[4] = "DFdj5aRKmThGOYGM";
                    strArr6[6] = "4rU7VADNdisg";
                    view7.getOverlay().add(this.A0L);
                    return;
                }
                String[] strArr7 = A0m;
                strArr7[7] = "HovrQjOKGOU1glve9p8eAJs";
                strArr7[5] = "lnqkcQfVF9X2NaZpGo2NogE";
                view7.getOverlay().add(this.A0L);
            }
        }
    }

    private void A0g(FrameLayout frameLayout, String str) {
        C5445Pi c5445Pi = this.A0N;
        if (c5445Pi != null) {
            frameLayout.removeView(c5445Pi);
        }
        this.A0N = C5444Ph.A01(C42285G.A02(this.A0c), str);
        C5445Pi c5445Pi2 = this.A0N;
        if (c5445Pi2 != null) {
            frameLayout.addView(c5445Pi2, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(@Nullable C6298da c6298da, boolean z) {
        if (c6298da == null) {
            return;
        }
        boolean equals = this.A0E.equals(EnumC5098Jz.A04);
        String A0W = A0W(595, 6, 89);
        if (equals) {
            C396811 A0E = c6298da.A0E();
            String A65 = c6298da.A65();
            if (!TextUtils.isEmpty(A65)) {
                this.A0b.A0d(new C5088Jp(A65, this.A0c.A08()));
            }
            if (A0E.A0G() != null) {
                C43637S c43637s = new C43637S(A0E.A0G().getUrl(), A0E.A0G().getHeight(), A0E.A0G().getWidth(), c6298da.A0G(), A0W(595, 6, 89));
                c43637s.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c43637s);
            }
            if (!this.A0J.equals(EnumC5119KM.A04)) {
                if (A0E.A0F() != null) {
                    this.A0b.A0b(new C43637S(A0E.A0F().getUrl(), A0E.A0F().getHeight(), A0E.A0F().getWidth(), c6298da.A0G(), A0W(595, 6, 89)));
                }
                List<C5721UB> A0H = c6298da.A0H();
                String[] strArr = A0m;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (A0H != null) {
                    for (C5721UB c5721ub : c6298da.A0H()) {
                        if (c5721ub.getAdCoverImage() != null) {
                            this.A0b.A0b(new C43637S(c5721ub.getAdCoverImage().getUrl(), c5721ub.getAdCoverImage().getHeight(), c5721ub.getAdCoverImage().getWidth(), c6298da.A0G(), A0W(595, 6, 89)));
                        }
                    }
                }
                String A0d = A0E.A0d();
                if (!TextUtils.isEmpty(A0d)) {
                    this.A0b.A0a(new C43617Q(A0d, c6298da.A0G(), A0W(595, 6, 89), A0E.A0A()));
                }
            }
            AbstractC397518 A0D = A0E.A0D();
            if (A0D != null && A0D.A0r()) {
                C43617Q c43617q = new C43617Q(A0D.A0V(), A0D.A0Z(), A0W);
                c43617q.A04 = true;
                c43617q.A03 = A0W(0, 5, 0);
                this.A0b.A0X(c43617q);
            }
        }
        this.A0b.A0W(new C5728UI(this, c6298da, z), new C43587N(c6298da.A0G(), A0W));
    }

    private void A0i(InterfaceC396912 interfaceC396912) {
        C6298da c6298da = this.A0a;
        if (c6298da == null) {
            return;
        }
        c6298da.A0K(interfaceC396912);
    }

    public static void A0j(NativeAdImageApi nativeAdImageApi, ImageView imageView, C5953Xy c5953Xy) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC5652T3(imageView, c5953Xy).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(InterfaceC5720UA interfaceC5720UA) {
        this.A0G = interfaceC5720UA;
    }

    private final void A0n(String str) {
        this.A0S = str;
    }

    private void A0o(List<View> list, View view) {
        InterfaceC5103K4 interfaceC5103K4 = this.A0d;
        if (interfaceC5103K4 != null && interfaceC5103K4.AEn(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                String[] strArr = A0m;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0o(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0p() {
        return A18() == EnumC5109KA.A05 || A18() == EnumC5109KA.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A0F().A0h();
    }

    public final long A0x() {
        return this.A00;
    }

    @Nullable
    public final C6298da A0y() {
        return this.A0a;
    }

    @Nullable
    public final AbstractC397518 A0z() {
        return A0F().A0D();
    }

    public final C43657U A10() {
        return this.A0b;
    }

    public final C5953Xy A11() {
        return this.A0c;
    }

    @Nullable
    public final View$OnClickListenerC5723UD A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A13 */
    public final C5104K5 getAdCoverImage() {
        return A0F().A0F();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    /* renamed from: A14 */
    public final C5104K5 getAdIcon() {
        return A0F().A0G();
    }

    @Nullable
    public final InterfaceC5720UA A15() {
        return this.A0G;
    }

    @Nullable
    public final C5106K7 A16() {
        return this.A0H;
    }

    public final EnumC5107K8 A17() {
        return this.A0I;
    }

    public final EnumC5109KA A18() {
        return A0F().A0I();
    }

    public final C5237MK A19() {
        return this.A0f;
    }

    @Nullable
    public final C5521Qw A1A() {
        return this.A0R;
    }

    @Nullable
    public final String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A65();
    }

    @Nullable
    public final String A1C() {
        return this.A0T;
    }

    @Nullable
    public final String A1D() {
        return A0G(true).A0O();
    }

    @Nullable
    public final String A1E() {
        return A0G(true).A0P();
    }

    @Nullable
    public final String A1F() {
        return A0F().A0c();
    }

    @Nullable
    public final String A1G() {
        C6298da c6298da = this.A0a;
        if (c6298da == null || TextUtils.isEmpty(c6298da.A0E().A0d())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0d());
    }

    @Nullable
    public final List<C5721UB> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!C40432E.A00(this.A0c.A00()).A0O(this.A0c, false)) {
            A0a();
            return;
        }
        C5953Xy c5953Xy = this.A0c;
        AbstractC5301NN A01 = C5302NO.A01(c5953Xy, c5953Xy.A08(), A1B(), this.A07);
        if (A01 == null) {
            A0a();
            return;
        }
        ((C6179bc) this.A07.getNativeAdLayoutApi()).A03(A01);
        A01.A0K();
    }

    public final void A1J(@Nullable Drawable drawable) {
        this.A01 = drawable;
        A1c(drawable != null, true);
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1K(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean A0w = C5064JR.A0w(view.getContext());
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (A0w) {
                view.setOnLongClickListener(this.A0F);
            }
        }
    }

    public final void A1L(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(View view, ImageView imageView, List<View> list) {
        A0f(view, imageView, list, true);
    }

    public final void A1N(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView, List<View> list) {
        A0f(view, adNativeComponentView, list, false);
    }

    public final void A1P(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1Q(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1R(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new C4585BH(nativeAdListener, nativeAdBase));
    }

    public final void A1S(@Nullable NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1T(C6298da c6298da) {
        A0h(c6298da, true);
        if (this.A0G != null) {
            List<C5721UB> A0H = c6298da.A0H();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "OfB2JsewzcYgCxMvn97l0AOaUV28WOmd";
            strArr2[2] = "fN7XzjPm8qHCAEGwTiZWrbsVWAwnjwvJ";
            if (A0H != null) {
                C5730UK c5730uk = new C5730UK(this);
                for (C5721UB childAd : c6298da.A0H()) {
                    childAd.A0i(c5730uk);
                }
            }
        }
    }

    public final void A1U(@Nullable C6196bt c6196bt) {
        this.A0U = new WeakReference<>(c6196bt);
    }

    public final void A1V(EnumC5098Jz enumC5098Jz, @Nullable String str, C43707Z c43707z) {
        if (str == null) {
            this.A0c.A0D().A2d();
        } else {
            this.A0c.A0D().A2c();
        }
        this.A00 = System.currentTimeMillis();
        if (this.A0j) {
            AdSettings.IntegrationErrorMode A00 = C40201r.A00(this.A0c);
            String A0W = A0W(565, 30, 115);
            if (!AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE.equals(A00)) {
                C5115KH c5115kh = new C5115KH(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(565, 30, 115));
                A11().A0D().A2a(C5236MJ.A01(this.A00), c5115kh.A03().getErrorCode(), c5115kh.A04());
                InterfaceC5720UA interfaceC5720UA = this.A0G;
                if (interfaceC5720UA != null) {
                    interfaceC5720UA.AAi(c5115kh);
                } else {
                    Log.e(A0W(68, 17, 84), A0W);
                }
                C444690 c444690 = new C444690(A0W);
                A11().A06().A8y(A0W(542, 3, 15), C44458z.A0c, c444690);
            } else {
                throw new C40251w(A0W);
            }
        }
        this.A0j = true;
        this.A0E = enumC5098Jz;
        if (enumC5098Jz.equals(EnumC5098Jz.A05)) {
            this.A08 = EnumC39660z.A05;
        }
        this.A0C = c43707z;
        C40181p c40181p = new C40181p(this.A0g, this.A0J, A0R(), null, 1);
        c40181p.A05(enumC5098Jz);
        c40181p.A06(this.A0S);
        c40181p.A07(this.A0T);
        this.A0A = new C4819FO(this.A0c, c40181p);
        this.A0A.A0M(new C5731UL(this));
        this.A0A.A0P(str);
    }

    public final void A1W(@Nullable C5106K7 c5106k7) {
        this.A0H = c5106k7;
    }

    public final void A1X(EnumC5107K8 enumC5107K8) {
        this.A0I = enumC5107K8;
    }

    public final void A1Y(EnumC5119KM enumC5119KM) {
        if (!A0q()) {
            if (EnumC5119KM.A04.equals(enumC5119KM)) {
                C5953Xy c5953Xy = this.A0c;
                String[] strArr = A0m;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                c5953Xy.A0D().A2g(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0D().A2g(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = enumC5119KM;
    }

    public final void A1Z(AbstractC5520Qv abstractC5520Qv) {
        this.A0V = new WeakReference<>(abstractC5520Qv);
    }

    public final void A1a(boolean z) {
        this.A0W = z;
    }

    public final void A1b(boolean z) {
        this.A0X = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r2 = r3.A0G();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
        r2 = A0W(0, 0, 21);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1c(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5721UB.A1c(boolean, boolean):void");
    }

    public final boolean A1d() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5112KD
    public final int A6E() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof C5466Q3) {
                return ((C5466Q3) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new C5110KB(this, nativeAdBase);
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final void destroy() {
        C5128KV.A05(A0W(552, 7, 7), A0W(355, 19, 89), A0W(13, 8, 89));
        if (C5064JR.A1I(this.A0c)) {
            A11().A09().AFF(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0D().A2h();
        }
        C4819FO c4819fo = this.A0A;
        if (c4819fo != null) {
            c4819fo.A0R(true);
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC5098Jz.A05)) {
            this.A08 = EnumC39660z.A04;
        }
        this.A0E = EnumC5098Jz.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdBodyText() {
        return A0G(true).A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdCallToAction() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        C5104K5 adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0m;
        if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
            String[] strArr2 = A0m;
            strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
            strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
            return adChoicesIcon.getUrl();
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesLinkUrl() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdChoicesText() {
        return A0F().A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdHeadline() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdLinkDescription() {
        return A0G(true).A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdSocialContext() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getAdvertiserName() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C6298da c6298da = this.A0a;
        if (c6298da != null) {
            C396811 A0E = c6298da.A0E();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
            strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
            C5104K5 A0F = A0E.A0F();
            if (A0F != null) {
                int width = A0F.getWidth();
                int height = A0F.getHeight();
                if (height > 0) {
                    return width / height;
                }
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0h;
        String[] strArr = A0m;
        if (strArr[4].length() != strArr[6].length()) {
            String[] strArr2 = A0m;
            strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
            strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
            return str;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final Drawable getPreloadedIconViewDrawable() {
        C5104K5 adIcon;
        Bitmap A0M;
        if (this.A0a != null && (adIcon = A0F().A0G()) != null && (A0M = this.A0b.A0M(adIcon.getUrl())) != null) {
            C5953Xy A11 = A11();
            boolean A1d = A1d();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) != strArr[2].charAt(5)) {
                String[] strArr2 = A0m;
                strArr2[4] = "5rXv1LFjMRKkpcU7";
                strArr2[6] = "SFgDKFOuseBk";
                return A05(A11, A0M, A1d, A1C());
            }
            throw new RuntimeException();
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getPromotedTranslation() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    @Nullable
    public final String getSponsoredTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        C6298da c6298da = this.A0a;
        return c6298da != null && c6298da.A0S();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final boolean isAdInvalidated() {
        boolean z = true;
        C4819FO c4819fo = this.A0A;
        if (c4819fo != null) {
            z = c4819fo.A0S();
        } else {
            C6258cw c6258cw = this.A0B;
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (c6258cw != null) {
                z = c6258cw.A0A();
            }
        }
        this.A0c.A0D().A4Y(z);
        return z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        C6298da c6298da = this.A0a;
        return c6298da != null && c6298da.A0T();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final void loadAd() {
        C5128KV.A05(A0W(559, 6, 14), A0W(374, 24, 23), A0W(545, 7, 3));
        A1V(EnumC5098Jz.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C43707Z(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        C5128KV.A05(A0W(559, 6, 14), A0W(374, 24, 23), A0W(5, 8, 76));
        ((C5110KB) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        View view = this.A05;
        if (view != null) {
            view.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        View view = this.A04;
        if (view != null) {
            view.post(new C5732UM(this));
        }
        String str = A0W(156, 16, 50) + C5227MA.A03(this.A0c, th);
        A11().A0D().A2a(C5236MJ.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        InterfaceC5720UA interfaceC5720UA = this.A0G;
        if (interfaceC5720UA != null) {
            interfaceC5720UA.AAi(new C5115KH((int) AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (com.facebook.ads.redexgen.p036X.C5064JR.A1I(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        A11().A09().AFF(r6.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        if (com.facebook.ads.redexgen.p036X.C5721UB.A0o.containsKey(r6.A04) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (com.facebook.ads.redexgen.p036X.C5721UB.A0o.get(r6.A04).get() != r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        r4 = r6.A04;
        r5 = r4 instanceof android.view.ViewGroup;
        r3 = com.facebook.ads.redexgen.p036X.C5721UB.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r3[4].length() == r3[6].length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
        r3 = com.facebook.ads.redexgen.p036X.C5721UB.A0m;
        r3[0] = "lVWmVGygxw0UbRbggHe19cSptvLLteak";
        r3[2] = "yD1YSLWVotW9RM3Ng5RpEu8J61bKeSm7";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
        r0 = r6.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
        ((android.view.ViewGroup) r4).removeView(r0);
        r6.A0K = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
        r0 = r6.A0a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r0.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        if (android.os.Build.VERSION.SDK_INT < 18) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        if (r6.A0L == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (com.facebook.ads.redexgen.p036X.C5064JR.A0w(r6.A0c) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
        r6.A0L.A07();
        r6.A04.getOverlay().remove(r6.A0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        com.facebook.ads.redexgen.p036X.C5721UB.A0o.remove(r6.A04);
        A0Z();
        r6.A04 = null;
        r6.A06 = null;
        r0 = r6.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
        if (r0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0103, code lost:
        r0.A0V();
        r6.A0R = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
        A0c();
        r6.A09 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (r5 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
        if (com.facebook.ads.redexgen.p036X.C5064JR.A1I(r4) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
        throw new java.lang.IllegalStateException(A0W(473, 38, 15));
     */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void unregisterView() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5721UB.unregisterView():void");
    }
}
