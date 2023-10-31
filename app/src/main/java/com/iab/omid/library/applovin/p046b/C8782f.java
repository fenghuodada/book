package com.iab.omid.library.applovin.p046b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p045a.C8769b;
import com.iab.omid.library.applovin.p045a.C8771d;
import com.iab.omid.library.applovin.p045a.C8772e;
import com.iab.omid.library.applovin.p045a.InterfaceC8770c;
import com.iab.omid.library.applovin.p046b.C8776b;
import com.iab.omid.library.applovin.walking.TreeWalker;

/* renamed from: com.iab.omid.library.applovin.b.f */
/* loaded from: classes3.dex */
public class C8782f implements InterfaceC8770c, C8776b.InterfaceC8777a {

    /* renamed from: a */
    private static C8782f f16710a;

    /* renamed from: b */
    private float f16711b = 0.0f;

    /* renamed from: c */
    private final C8772e f16712c;

    /* renamed from: d */
    private final C8769b f16713d;

    /* renamed from: e */
    private C8771d f16714e;

    /* renamed from: f */
    private C8775a f16715f;

    public C8782f(C8772e c8772e, C8769b c8769b) {
        this.f16712c = c8772e;
        this.f16713d = c8769b;
    }

    /* renamed from: a */
    public static C8782f m3087a() {
        if (f16710a == null) {
            f16710a = new C8782f(new C8772e(), new C8769b());
        }
        return f16710a;
    }

    /* renamed from: e */
    private C8775a m3080e() {
        if (this.f16715f == null) {
            this.f16715f = C8775a.m3126a();
        }
        return this.f16715f;
    }

    @Override // com.iab.omid.library.applovin.p045a.InterfaceC8770c
    /* renamed from: a */
    public void mo3086a(float f) {
        this.f16711b = f;
        for (C8773a c8773a : m3080e().m3122c()) {
            c8773a.getAdSessionStatePublisher().m3023a(f);
        }
    }

    /* renamed from: a */
    public void m3085a(Context context) {
        this.f16714e = this.f16712c.m3152a(new Handler(), context, this.f16713d.m3158a(), this);
    }

    @Override // com.iab.omid.library.applovin.p046b.C8776b.InterfaceC8777a
    /* renamed from: a */
    public void mo3084a(boolean z) {
        if (z) {
            TreeWalker.getInstance().m2998a();
        } else {
            TreeWalker.getInstance().m2988c();
        }
    }

    /* renamed from: b */
    public void m3083b() {
        C8776b.m3119a().m3117a(this);
        C8776b.m3119a().m3115b();
        TreeWalker.getInstance().m2998a();
        this.f16714e.m3157a();
    }

    /* renamed from: c */
    public void m3082c() {
        TreeWalker.getInstance().m2991b();
        C8776b.m3119a().m3114c();
        this.f16714e.m3155b();
    }

    /* renamed from: d */
    public float m3081d() {
        return this.f16711b;
    }
}
