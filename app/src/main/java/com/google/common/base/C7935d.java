package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.nio.charset.Charset;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.base.d */
/* loaded from: classes3.dex */
public final class C7935d {
    @GwtIncompatible

    /* renamed from: a */
    public static final Charset f15691a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f15692b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final Charset f15693c = Charset.forName("UTF-8");
    @GwtIncompatible

    /* renamed from: d */
    public static final Charset f15694d;
    @GwtIncompatible

    /* renamed from: e */
    public static final Charset f15695e;

    static {
        Charset.forName("UTF-16BE");
        f15694d = Charset.forName("UTF-16LE");
        f15695e = Charset.forName("UTF-16");
    }
}
