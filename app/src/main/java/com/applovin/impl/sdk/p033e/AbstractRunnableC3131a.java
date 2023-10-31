package com.applovin.impl.sdk.p033e;

import android.content.Context;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;

/* renamed from: com.applovin.impl.sdk.e.a */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC3131a implements Runnable {

    /* renamed from: a */
    private final String f8191a;

    /* renamed from: b */
    protected final C3214m f8192b;

    /* renamed from: c */
    private final C3349v f8193c;

    /* renamed from: d */
    private final Context f8194d;

    /* renamed from: e */
    private final boolean f8195e;

    public AbstractRunnableC3131a(String str, C3214m c3214m) {
        this(str, c3214m, false);
    }

    public AbstractRunnableC3131a(String str, C3214m c3214m, boolean z) {
        this.f8191a = str;
        this.f8192b = c3214m;
        this.f8193c = c3214m.m7487A();
        this.f8194d = c3214m.m7476L();
        this.f8195e = z;
    }

    /* renamed from: a */
    public void m7705a(String str) {
        this.f8193c.m6855b(this.f8191a, str);
    }

    /* renamed from: a */
    public void m7704a(String str, Throwable th) {
        this.f8193c.m6854b(this.f8191a, str, th);
    }

    /* renamed from: b */
    public void m7703b(String str) {
        this.f8193c.m6853c(this.f8191a, str);
    }

    /* renamed from: c */
    public void m7702c(String str) {
        this.f8193c.m6851d(this.f8191a, str);
    }

    /* renamed from: d */
    public C3214m m7701d() {
        return this.f8192b;
    }

    /* renamed from: d */
    public void m7700d(String str) {
        this.f8193c.m6850e(this.f8191a, str);
    }

    /* renamed from: e */
    public String m7699e() {
        return this.f8191a;
    }

    /* renamed from: f */
    public Context m7698f() {
        return this.f8194d;
    }

    /* renamed from: g */
    public boolean m7697g() {
        return this.f8195e;
    }
}
