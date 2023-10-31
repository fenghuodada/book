package com.iab.omid.library.applovin.p046b;

import com.iab.omid.library.applovin.adsession.C8773a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: com.iab.omid.library.applovin.b.a */
/* loaded from: classes3.dex */
public class C8775a {

    /* renamed from: a */
    private static C8775a f16693a = new C8775a();

    /* renamed from: b */
    private final ArrayList<C8773a> f16694b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C8773a> f16695c = new ArrayList<>();

    private C8775a() {
    }

    /* renamed from: a */
    public static C8775a m3126a() {
        return f16693a;
    }

    /* renamed from: a */
    public void m3125a(C8773a c8773a) {
        this.f16694b.add(c8773a);
    }

    /* renamed from: b */
    public Collection<C8773a> m3124b() {
        return Collections.unmodifiableCollection(this.f16694b);
    }

    /* renamed from: b */
    public void m3123b(C8773a c8773a) {
        boolean m3120d = m3120d();
        this.f16695c.add(c8773a);
        if (m3120d) {
            return;
        }
        C8782f.m3087a().m3083b();
    }

    /* renamed from: c */
    public Collection<C8773a> m3122c() {
        return Collections.unmodifiableCollection(this.f16695c);
    }

    /* renamed from: c */
    public void m3121c(C8773a c8773a) {
        boolean m3120d = m3120d();
        this.f16694b.remove(c8773a);
        this.f16695c.remove(c8773a);
        if (!m3120d || m3120d()) {
            return;
        }
        C8782f.m3087a().m3082c();
    }

    /* renamed from: d */
    public boolean m3120d() {
        return this.f16695c.size() > 0;
    }
}
