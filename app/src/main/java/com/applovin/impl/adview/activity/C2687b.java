package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.b */
/* loaded from: classes.dex */
public class C2687b {

    /* renamed from: a */
    private final Activity f6398a;

    /* renamed from: b */
    private final int f6399b;

    /* renamed from: c */
    private final int f6400c;

    /* renamed from: d */
    private final boolean f6401d;

    /* renamed from: e */
    private final boolean f6402e;

    public C2687b(Activity activity) {
        this.f6398a = activity;
        int rotation = Utils.getRotation(activity);
        this.f6400c = rotation;
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f6401d = isTablet;
        this.f6399b = m9161a(rotation, isTablet);
        this.f6402e = isTablet && 2 == m9160a(activity);
    }

    /* renamed from: a */
    private int m9161a(int i, boolean z) {
        if (z && this.f6402e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        } else if (i == 0) {
            return 1;
        } else {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        }
    }

    /* renamed from: a */
    private static int m9160a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    /* renamed from: a */
    private void m9162a(int i) {
        try {
            this.f6398a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r6 != 3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
        if (r6 != 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
        if (r6 == 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0052, code lost:
        if (r6 == 1) goto L33;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9159a(com.applovin.impl.sdk.p029ad.AbstractC3080e.EnumC3083b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p029ad.AbstractC3080e.EnumC3083b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L2d
            boolean r6 = r5.f6401d
            r0 = 9
            if (r6 == 0) goto L1e
            boolean r6 = r5.f6402e
            if (r6 == 0) goto L1e
            int r6 = r5.f6400c
            if (r6 == r3) goto L18
            if (r6 == r1) goto L18
            goto L24
        L18:
            if (r6 != r3) goto L24
        L1a:
            r5.m9162a(r0)
            goto L55
        L1e:
            int r6 = r5.f6400c
            if (r6 == 0) goto L28
            if (r6 == r2) goto L28
        L24:
            r5.m9162a(r3)
            goto L55
        L28:
            if (r6 != 0) goto L2b
            goto L24
        L2b:
            r3 = r0
            goto L24
        L2d:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.p029ad.AbstractC3080e.EnumC3083b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L55
            boolean r6 = r5.f6401d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L48
            boolean r6 = r5.f6402e
            if (r6 == 0) goto L48
            int r6 = r5.f6400c
            if (r6 == 0) goto L43
            if (r6 == r2) goto L43
            goto L4e
        L43:
            if (r6 != r2) goto L46
            goto L1a
        L46:
            r0 = r4
            goto L1a
        L48:
            int r6 = r5.f6400c
            if (r6 == r3) goto L52
            if (r6 == r1) goto L52
        L4e:
            r5.m9162a(r4)
            goto L55
        L52:
            if (r6 != r3) goto L1a
            goto L46
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.C2687b.m9159a(com.applovin.impl.sdk.ad.e$b):void");
    }

    /* renamed from: a */
    public void m9158a(AbstractC3080e abstractC3080e) {
        int i;
        if (!abstractC3080e.m7970E() || (i = this.f6399b) == -1) {
            m9159a(abstractC3080e.m7883p());
        } else {
            m9162a(i);
        }
    }
}
