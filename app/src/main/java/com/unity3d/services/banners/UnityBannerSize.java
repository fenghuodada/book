package com.unity3d.services.banners;

import android.content.Context;
import android.content.res.Resources;
import com.unity3d.services.core.misc.C9565k;

/* loaded from: classes3.dex */
public class UnityBannerSize {

    /* renamed from: a */
    private int f18487a;

    /* renamed from: b */
    private int f18488b;

    /* renamed from: com.unity3d.services.banners.UnityBannerSize$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9433a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18489a;

        static {
            int[] iArr = new int[EnumC9434b.values().length];
            f18489a = iArr;
            try {
                iArr[EnumC9434b.BANNER_SIZE_STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18489a[EnumC9434b.BANNER_SIZE_LEADERBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18489a[EnumC9434b.BANNER_SIZE_IAB_STANDARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBannerSize$b */
    /* loaded from: classes3.dex */
    public enum EnumC9434b {
        BANNER_SIZE_STANDARD,
        BANNER_SIZE_LEADERBOARD,
        BANNER_SIZE_IAB_STANDARD,
        BANNER_SIZE_DYNAMIC;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public int m2309a(Context context) {
            int i = C9433a.f18489a[m2307b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 50 : 60;
            }
            return 90;
        }

        /* renamed from: b */
        private EnumC9434b m2307b(Context context) {
            if (this == BANNER_SIZE_DYNAMIC) {
                int round = Math.round(C9565k.m1983a(context, Resources.getSystem().getDisplayMetrics().widthPixels));
                return round >= 728 ? BANNER_SIZE_LEADERBOARD : round >= 468 ? BANNER_SIZE_IAB_STANDARD : BANNER_SIZE_STANDARD;
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public int m2305c(Context context) {
            int i = C9433a.f18489a[m2307b(context).ordinal()];
            if (i != 2) {
                return i != 3 ? 320 : 468;
            }
            return 728;
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.f18487a = i;
        this.f18488b = i2;
    }

    public static UnityBannerSize getDynamicSize(Context context) {
        EnumC9434b enumC9434b = EnumC9434b.BANNER_SIZE_DYNAMIC;
        return new UnityBannerSize(enumC9434b.m2305c(context), enumC9434b.m2309a(context));
    }

    public int getHeight() {
        return this.f18488b;
    }

    public int getWidth() {
        return this.f18487a;
    }
}
