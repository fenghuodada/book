package com.vungle.warren.locale;

import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.vungle.warren.locale.b */
/* loaded from: classes3.dex */
public final class C9828b implements InterfaceC9827a {
    @Override // com.vungle.warren.locale.InterfaceC9827a
    /* renamed from: a */
    public final String mo1496a() {
        return TimeZone.getDefault().getID();
    }

    @Override // com.vungle.warren.locale.InterfaceC9827a
    /* renamed from: b */
    public final String mo1495b() {
        return Locale.getDefault().getLanguage();
    }
}
