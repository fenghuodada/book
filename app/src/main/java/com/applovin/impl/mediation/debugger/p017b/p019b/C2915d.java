package com.applovin.impl.mediation.debugger.p017b.p019b;

import android.content.Context;
import com.applovin.impl.sdk.utils.C3294g;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.d */
/* loaded from: classes.dex */
public class C2915d {

    /* renamed from: a */
    private final String f7120a;

    /* renamed from: b */
    private final String f7121b;

    /* renamed from: c */
    private final boolean f7122c;

    public C2915d(String str, String str2, Context context) {
        this.f7120a = str.replace("android.permission.", "");
        this.f7121b = str2;
        this.f7122c = C3294g.m7026a(str, context);
    }

    /* renamed from: a */
    public String m8362a() {
        return this.f7120a;
    }

    /* renamed from: b */
    public String m8361b() {
        return this.f7121b;
    }

    /* renamed from: c */
    public boolean m8360c() {
        return this.f7122c;
    }
}
