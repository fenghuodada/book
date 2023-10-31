package com.iab.omid.library.adcolony.adsession;

/* renamed from: com.iab.omid.library.adcolony.adsession.c */
/* loaded from: classes3.dex */
public final class C8713c {

    /* renamed from: a */
    public final EnumC8719i f16529a;

    /* renamed from: b */
    public final EnumC8719i f16530b;

    /* renamed from: c */
    public final boolean f16531c;

    /* renamed from: d */
    public final EnumC8716f f16532d;

    /* renamed from: e */
    public final EnumC8718h f16533e;

    public C8713c(EnumC8716f enumC8716f, EnumC8719i enumC8719i) {
        EnumC8718h enumC8718h = EnumC8718h.BEGIN_TO_RENDER;
        EnumC8719i enumC8719i2 = EnumC8719i.NATIVE;
        this.f16532d = enumC8716f;
        this.f16533e = enumC8718h;
        this.f16529a = enumC8719i2;
        if (enumC8719i == null) {
            this.f16530b = EnumC8719i.NONE;
        } else {
            this.f16530b = enumC8719i;
        }
        this.f16531c = false;
    }

    /* renamed from: a */
    public static C8713c m3193a(EnumC8716f enumC8716f, EnumC8719i enumC8719i) {
        if (enumC8716f != EnumC8716f.DEFINED_BY_JAVASCRIPT) {
            return new C8713c(enumC8716f, enumC8719i);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }
}
