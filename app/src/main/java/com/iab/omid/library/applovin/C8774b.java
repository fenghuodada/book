package com.iab.omid.library.applovin;

import android.content.Context;
import com.iab.omid.library.applovin.p046b.C8776b;
import com.iab.omid.library.applovin.p046b.C8779d;
import com.iab.omid.library.applovin.p046b.C8782f;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.p048d.C8794e;

/* renamed from: com.iab.omid.library.applovin.b */
/* loaded from: classes3.dex */
public class C8774b {

    /* renamed from: a */
    private boolean f16692a;

    /* renamed from: b */
    private void m3127b(Context context) {
        C8794e.m3038a(context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String m3131a() {
        return "1.3.30-Applovin";
    }

    /* renamed from: a */
    public void m3130a(Context context) {
        m3127b(context);
        if (m3128b()) {
            return;
        }
        m3129a(true);
        C8782f.m3087a().m3085a(context);
        C8776b.m3119a().m3118a(context);
        C8790b.m3060a(context);
        C8779d.m3107a().m3106a(context);
    }

    /* renamed from: a */
    public void m3129a(boolean z) {
        this.f16692a = z;
    }

    /* renamed from: b */
    public boolean m3128b() {
        return this.f16692a;
    }
}
