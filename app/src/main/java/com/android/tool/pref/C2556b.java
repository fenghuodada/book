package com.android.tool.pref;

import com.android.tool.ApplicationC2534a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.android.tool.pref.b */
/* loaded from: classes.dex */
public final class C2556b {

    /* renamed from: a */
    public final C2557c f6052a;

    public C2556b(C2557c c2557c) {
        this.f6052a = c2557c;
    }

    /* renamed from: a */
    public final void m9375a(String str) {
        Set<String> m9373c = m9373c();
        if (!m9373c.contains(str)) {
            return;
        }
        HashSet hashSet = new HashSet(m9373c);
        hashSet.remove(str);
        this.f6052a.getClass();
        ApplicationC2534a.f6025a.getSharedPreferences("DISALLOWED_APPS_PREF", 0).edit().putStringSet("DISALLOWED_PACKAGES_App", hashSet).apply();
    }

    /* renamed from: b */
    public final void m9374b(String str) {
        Set<String> m9373c = m9373c();
        if (str != null && !m9373c.contains(str)) {
            HashSet hashSet = new HashSet(m9373c);
            hashSet.add(str);
            this.f6052a.getClass();
            ApplicationC2534a.f6025a.getSharedPreferences("DISALLOWED_APPS_PREF", 0).edit().putStringSet("DISALLOWED_PACKAGES_App", hashSet).apply();
        }
    }

    /* renamed from: c */
    public final Set<String> m9373c() {
        this.f6052a.getClass();
        return ApplicationC2534a.f6025a.getSharedPreferences("DISALLOWED_APPS_PREF", 0).getStringSet("DISALLOWED_PACKAGES_App", new HashSet());
    }
}
