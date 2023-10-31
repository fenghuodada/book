package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;

/* renamed from: com.unity3d.services.core.device.reader.pii.e */
/* loaded from: classes3.dex */
public enum EnumC9540e {
    APP,
    NONE,
    MIXED,
    UNDEFINED,
    NULL;

    /* renamed from: a */
    public static EnumC9540e m2043a(String str) {
        if (str == null) {
            return NULL;
        }
        EnumC9540e enumC9540e = UNDEFINED;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return enumC9540e;
        }
    }
}
