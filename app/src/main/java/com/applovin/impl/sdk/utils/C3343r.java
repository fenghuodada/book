package com.applovin.impl.sdk.utils;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.r */
/* loaded from: classes.dex */
public class C3343r {

    /* renamed from: a */
    public static final C3343r f8813a = new C3343r();

    /* renamed from: b */
    protected String f8814b;

    /* renamed from: c */
    protected final List<C3343r> f8815c;

    /* renamed from: d */
    private final C3343r f8816d;

    /* renamed from: e */
    private final String f8817e;

    /* renamed from: f */
    private final Map<String, String> f8818f;

    private C3343r() {
        this.f8816d = null;
        this.f8817e = "";
        this.f8818f = Collections.emptyMap();
        this.f8814b = "";
        this.f8815c = Collections.emptyList();
    }

    public C3343r(String str, Map<String, String> map, C3343r c3343r) {
        this.f8816d = c3343r;
        this.f8817e = str;
        this.f8818f = Collections.unmodifiableMap(map);
        this.f8815c = new ArrayList();
    }

    /* renamed from: a */
    public String m6884a() {
        return this.f8817e;
    }

    /* renamed from: a */
    public List<C3343r> m6883a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f8815c.size());
            for (C3343r c3343r : this.f8815c) {
                if (str.equalsIgnoreCase(c3343r.m6884a())) {
                    arrayList.add(c3343r);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public C3343r m6881b(String str) {
        if (str != null) {
            for (C3343r c3343r : this.f8815c) {
                if (str.equalsIgnoreCase(c3343r.m6884a())) {
                    return c3343r;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public Map<String, String> m6882b() {
        return this.f8818f;
    }

    @Nullable
    /* renamed from: c */
    public C3343r m6879c(String str) {
        if (str != null) {
            if (this.f8815c.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    C3343r c3343r = (C3343r) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(c3343r.m6884a())) {
                        return c3343r;
                    }
                    arrayList.addAll(c3343r.m6878d());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: c */
    public String m6880c() {
        return this.f8814b;
    }

    /* renamed from: d */
    public List<C3343r> m6878d() {
        return Collections.unmodifiableList(this.f8815c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f8817e + "', text='" + this.f8814b + "', attributes=" + this.f8818f + '}';
    }
}
