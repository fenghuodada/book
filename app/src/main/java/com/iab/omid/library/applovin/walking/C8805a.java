package com.iab.omid.library.applovin.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.p046b.C8778c;
import com.iab.omid.library.applovin.p048d.C8795f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.applovin.walking.a */
/* loaded from: classes3.dex */
public class C8805a {

    /* renamed from: a */
    private final HashMap<View, String> f16761a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C8806a> f16762b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f16763c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f16764d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f16765e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f16766f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f16767g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f16768h = new WeakHashMap();

    /* renamed from: i */
    private boolean f16769i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a */
    /* loaded from: classes3.dex */
    public static class C8806a {

        /* renamed from: a */
        private final C8778c f16770a;

        /* renamed from: b */
        private final ArrayList<String> f16771b = new ArrayList<>();

        public C8806a(C8778c c8778c, String str) {
            this.f16770a = c8778c;
            m2962a(str);
        }

        /* renamed from: a */
        public C8778c m2963a() {
            return this.f16770a;
        }

        /* renamed from: a */
        public void m2962a(String str) {
            this.f16771b.add(str);
        }

        /* renamed from: b */
        public ArrayList<String> m2961b() {
            return this.f16771b;
        }
    }

    /* renamed from: a */
    private void m2976a(C8773a c8773a) {
        for (C8778c c8778c : c8773a.m3151a()) {
            m2975a(c8778c, c8773a);
        }
    }

    /* renamed from: a */
    private void m2975a(C8778c c8778c, C8773a c8773a) {
        View view = c8778c.m3111a().get();
        if (view == null) {
            return;
        }
        C8806a c8806a = this.f16762b.get(view);
        if (c8806a != null) {
            c8806a.m2962a(c8773a.getAdSessionId());
        } else {
            this.f16762b.put(view, new C8806a(c8778c, c8773a.getAdSessionId()));
        }
    }

    /* renamed from: e */
    private String m2965e(View view) {
        if (view.isAttachedToWindow()) {
            if (m2964f(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m3024e = C8795f.m3024e(view);
                if (m3024e != null) {
                    return m3024e;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f16764d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: f */
    private Boolean m2964f(View view) {
        if (view.hasWindowFocus()) {
            this.f16768h.remove(view);
            return Boolean.FALSE;
        } else if (this.f16768h.containsKey(view)) {
            return this.f16768h.get(view);
        } else {
            Map<View, Boolean> map = this.f16768h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public String m2977a(View view) {
        if (this.f16761a.size() == 0) {
            return null;
        }
        String str = this.f16761a.get(view);
        if (str != null) {
            this.f16761a.remove(view);
        }
        return str;
    }

    /* renamed from: a */
    public String m2974a(String str) {
        return this.f16767g.get(str);
    }

    /* renamed from: a */
    public HashSet<String> m2978a() {
        return this.f16765e;
    }

    /* renamed from: b */
    public View m2971b(String str) {
        return this.f16763c.get(str);
    }

    /* renamed from: b */
    public C8806a m2972b(View view) {
        C8806a c8806a = this.f16762b.get(view);
        if (c8806a != null) {
            this.f16762b.remove(view);
        }
        return c8806a;
    }

    /* renamed from: b */
    public HashSet<String> m2973b() {
        return this.f16766f;
    }

    /* renamed from: c */
    public EnumC8816c m2969c(View view) {
        return this.f16764d.contains(view) ? EnumC8816c.PARENT_VIEW : this.f16769i ? EnumC8816c.OBSTRUCTION_VIEW : EnumC8816c.UNDERLYING_VIEW;
    }

    /* renamed from: c */
    public void m2970c() {
        C8775a m3126a = C8775a.m3126a();
        if (m3126a != null) {
            for (C8773a c8773a : m3126a.m3122c()) {
                View m3140e = c8773a.m3140e();
                if (c8773a.m3139f()) {
                    String adSessionId = c8773a.getAdSessionId();
                    if (m3140e != null) {
                        String m2965e = m2965e(m3140e);
                        if (m2965e == null) {
                            this.f16765e.add(adSessionId);
                            this.f16761a.put(m3140e, adSessionId);
                            m2976a(c8773a);
                        } else if (m2965e != "noWindowFocus") {
                            this.f16766f.add(adSessionId);
                            this.f16763c.put(adSessionId, m3140e);
                            this.f16767g.put(adSessionId, m2965e);
                        }
                    } else {
                        this.f16766f.add(adSessionId);
                        this.f16767g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m2968d() {
        this.f16761a.clear();
        this.f16762b.clear();
        this.f16763c.clear();
        this.f16764d.clear();
        this.f16765e.clear();
        this.f16766f.clear();
        this.f16767g.clear();
        this.f16769i = false;
    }

    /* renamed from: d */
    public boolean m2967d(View view) {
        if (this.f16768h.containsKey(view)) {
            this.f16768h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m2966e() {
        this.f16769i = true;
    }
}
