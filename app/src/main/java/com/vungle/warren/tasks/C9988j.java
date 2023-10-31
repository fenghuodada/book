package com.vungle.warren.tasks;

import android.text.TextUtils;
import com.vungle.warren.AdLoader;
import com.vungle.warren.C10114v0;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.analytics.C9753c;
import com.vungle.warren.analytics.InterfaceC9751a;
import com.vungle.warren.log.C9835f;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.InterfaceC9923d;

/* renamed from: com.vungle.warren.tasks.j */
/* loaded from: classes3.dex */
public final class C9988j implements InterfaceC9981d {

    /* renamed from: a */
    public final C9928h f20077a;

    /* renamed from: b */
    public final InterfaceC9923d f20078b;

    /* renamed from: c */
    public final VungleApiClient f20079c;

    /* renamed from: d */
    public final InterfaceC9751a f20080d;

    /* renamed from: e */
    public final AdLoader f20081e;

    /* renamed from: f */
    public final C9835f f20082f;

    public C9988j(C9928h c9928h, InterfaceC9923d interfaceC9923d, VungleApiClient vungleApiClient, C9753c c9753c, AdLoader adLoader, C9835f c9835f) {
        this.f20077a = c9928h;
        this.f20078b = interfaceC9923d;
        this.f20079c = vungleApiClient;
        this.f20080d = c9753c;
        this.f20081e = adLoader;
        this.f20082f = c9835f;
    }

    @Override // com.vungle.warren.tasks.InterfaceC9981d
    /* renamed from: a */
    public final Job mo1355a(String str) throws C9987i {
        if (TextUtils.isEmpty(str)) {
            throw new C9987i("Job tag is null");
        }
        int i = C9983f.f20070b;
        if (str.startsWith("com.vungle.warren.tasks.f")) {
            return new C9983f(C10114v0.f20359f);
        }
        int i2 = C9980c.f20067c;
        boolean startsWith = str.startsWith("com.vungle.warren.tasks.c");
        AdLoader adLoader = this.f20081e;
        if (startsWith) {
            return new C9980c(adLoader, C10114v0.f20358e);
        }
        int i3 = C9986h.f20074c;
        boolean startsWith2 = str.startsWith("com.vungle.warren.tasks.h");
        VungleApiClient vungleApiClient = this.f20079c;
        C9928h c9928h = this.f20077a;
        if (startsWith2) {
            return new C9986h(vungleApiClient, c9928h);
        }
        int i4 = C9979b.f20063d;
        if (str.startsWith("com.vungle.warren.tasks.b")) {
            return new C9979b(this.f20078b, c9928h, adLoader);
        }
        int i5 = AnalyticsJob.f20047b;
        if (str.startsWith("AnalyticsJob")) {
            return new AnalyticsJob(this.f20080d);
        }
        int i6 = C9985g.f20072b;
        if (str.startsWith("g")) {
            return new C9985g(this.f20082f);
        }
        String[] strArr = C9978a.f20059d;
        if (str.startsWith("com.vungle.warren.tasks.a")) {
            return new C9978a(vungleApiClient, c9928h, adLoader);
        }
        throw new C9987i("Unknown Job Type ".concat(str));
    }
}
