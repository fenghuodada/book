package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.UnityAds;
import com.vungle.warren.VungleApiClient;
import java.util.HashMap;

/* renamed from: com.unity3d.services.core.request.metrics.b */
/* loaded from: classes3.dex */
public class C9593b {

    /* renamed from: com.unity3d.services.core.request.metrics.b$a */
    /* loaded from: classes3.dex */
    public static class C9594a extends HashMap<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f19021a;

        public C9594a(String str) {
            this.f19021a = str;
            put("reason", str);
        }
    }

    /* renamed from: com.unity3d.services.core.request.metrics.b$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9595b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19022a;

        /* renamed from: b */
        static final /* synthetic */ int[] f19023b;

        static {
            int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
            f19023b = iArr;
            try {
                iArr[UnityAds.UnityAdsShowError.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.NOT_READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.VIDEO_PLAYER_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.INVALID_ARGUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.NO_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19023b[UnityAds.UnityAdsShowError.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[UnityAds.UnityAdsLoadError.values().length];
            f19022a = iArr2;
            try {
                iArr2[UnityAds.UnityAdsLoadError.INITIALIZE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19022a[UnityAds.UnityAdsLoadError.INTERNAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19022a[UnityAds.UnityAdsLoadError.INVALID_ARGUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19022a[UnityAds.UnityAdsLoadError.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19022a[UnityAds.UnityAdsLoadError.TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: a */
    private static EnumC9592a m1868a(UnityAds.UnityAdsLoadError unityAdsLoadError) {
        int i = C9595b.f19022a[unityAdsLoadError.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return EnumC9592a.timeout;
                    }
                    return EnumC9592a.no_fill;
                }
                return EnumC9592a.invalid;
            }
            return EnumC9592a.internal;
        }
        return EnumC9592a.init_failed;
    }

    /* renamed from: a */
    private static EnumC9592a m1866a(UnityAds.UnityAdsShowError unityAdsShowError) {
        switch (C9595b.f19023b[unityAdsShowError.ordinal()]) {
            case 1:
                return EnumC9592a.init_failed;
            case 2:
                return EnumC9592a.not_ready;
            case 3:
                return EnumC9592a.player;
            case 4:
                return EnumC9592a.invalid;
            case 5:
                return EnumC9592a.no_connection;
            case 6:
                return EnumC9592a.already_showing;
            case 7:
                return EnumC9592a.internal;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static C9597d m1869a() {
        return new C9597d("native_load_started", null, null);
    }

    /* renamed from: a */
    public static C9597d m1867a(UnityAds.UnityAdsLoadError unityAdsLoadError, Long l) {
        return m1863a(m1868a(unityAdsLoadError), l);
    }

    /* renamed from: a */
    public static C9597d m1865a(UnityAds.UnityAdsShowError unityAdsShowError, Long l) {
        return m1860b(m1866a(unityAdsShowError), l);
    }

    /* renamed from: a */
    public static C9597d m1863a(EnumC9592a enumC9592a, Long l) {
        return new C9597d("native_load_time_failure", l, m1864a(enumC9592a));
    }

    /* renamed from: a */
    public static C9597d m1862a(Long l) {
        return new C9597d("native_load_time_success", l, null);
    }

    /* renamed from: a */
    private static HashMap<String, String> m1864a(EnumC9592a enumC9592a) {
        return new C9594a(enumC9592a == null ? VungleApiClient.ConnectionTypeDetail.UNKNOWN : enumC9592a.toString());
    }

    /* renamed from: b */
    public static C9597d m1861b() {
        return new C9597d("native_show_started", null, null);
    }

    /* renamed from: b */
    public static C9597d m1860b(EnumC9592a enumC9592a, Long l) {
        return new C9597d("native_show_time_failure", l, m1864a(enumC9592a));
    }

    /* renamed from: b */
    public static C9597d m1859b(Long l) {
        return new C9597d("native_show_time_success", l, null);
    }
}
