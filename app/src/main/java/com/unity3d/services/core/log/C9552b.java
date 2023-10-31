package com.unity3d.services.core.log;

import androidx.core.p003os.C0740h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.services.core.log.b */
/* loaded from: classes3.dex */
public class C9552b {

    /* renamed from: a */
    private C9553c f18917a;

    /* renamed from: b */
    private String f18918b;

    /* renamed from: c */
    private StackTraceElement f18919c;

    public C9552b(C9553c c9553c, String str, StackTraceElement stackTraceElement) {
        this.f18917a = c9553c;
        this.f18918b = str;
        this.f18919c = stackTraceElement;
    }

    /* renamed from: a */
    public C9553c m2013a() {
        return this.f18917a;
    }

    /* renamed from: b */
    public String m2012b() {
        String str;
        String str2;
        int i;
        String str3 = this.f18918b;
        StackTraceElement stackTraceElement = this.f18919c;
        if (stackTraceElement != null) {
            str = stackTraceElement.getClassName();
            str2 = this.f18919c.getMethodName();
            i = this.f18919c.getLineNumber();
        } else {
            str = "UnknownClass";
            str2 = "unknownMethod";
            i = -1;
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: ".concat(str3);
        }
        if (str3 == null) {
            str3 = "";
        }
        String m11849a = C0740h.m11849a(" (line:", i, ")");
        return str + "." + str2 + "()" + m11849a + str3;
    }
}
