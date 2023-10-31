package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ze */
/* loaded from: assets/audience_network.dex */
public final class C6057Ze extends C43216m {
    public static PackageManager A00;
    public static String[] A01 = {"mMUsySdK", "G1dnExSQKLbMoTCo5d1h1U5A6G7ndhFt", "GiJYkTHpyeTaf3ywPcthUoX2rTVjWFCb", "0A5FUJ9kDHtL7zu8WVVZPRsd6iFGNBV", "Uxf0Oizk", "zpV62zjrrTP1cgdKU18BbBXv", "Pb6NlhKASELFsFyHLiNoj4ENeXMrfTQa", "RrSFtRYH4qZAbHiyxnUErsMfABxwLq"};

    public C6057Ze(Context context, C42856C c42856c) {
        super(context, c42856c);
        A00 = context.getPackageManager();
    }

    public static /* synthetic */ PackageManager A01() {
        PackageManager packageManager = A00;
        if (A01[1].charAt(22) != 'k') {
            String[] strArr = A01;
            strArr[7] = "gjUVtXXuXbvsWPZLBaiwFqVTuNtnGy";
            strArr[3] = "aaBFOo2Y3N72goZoHRvUb35kO6Lzp1W";
            return packageManager;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public AbstractC43457A A03(HashMap<String, C6058Zf> hashMap) {
        return new C5962Y7(SystemClock.elapsedRealtime(), A02(), hashMap, EnumC434479.A0C);
    }

    public final InterfaceC43306v A0G(List<C43296u> list) {
        return new C6059Zg(this, list);
    }
}
