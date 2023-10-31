package com.vungle.warren.utility;

import android.util.Log;
import androidx.annotation.NonNull;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;

/* renamed from: com.vungle.warren.utility.g */
/* loaded from: classes3.dex */
public final class C10085g {

    /* renamed from: a */
    public static final /* synthetic */ int f20312a = 0;

    /* renamed from: a */
    public static void m1273a(@NonNull C9928h c9928h, String str, Boolean bool) {
        C9867g c9867g = (C9867g) c9928h.m1383p(C9867g.class, "coppa_cookie").get();
        if (c9867g == null) {
            c9867g = new C9867g("coppa_cookie");
        }
        c9867g.m1445d(bool, str);
        try {
            c9928h.m1376w(c9867g);
        } catch (C9919c.C9920a e) {
            Log.e("g", "DB Exception saving cookie", e);
        }
    }
}
