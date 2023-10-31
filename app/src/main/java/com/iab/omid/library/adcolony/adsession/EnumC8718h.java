package com.iab.omid.library.adcolony.adsession;

import com.google.firebase.ktx.BuildConfig;

/* renamed from: com.iab.omid.library.adcolony.adsession.h */
/* loaded from: classes3.dex */
public enum EnumC8718h {
    /* JADX INFO: Fake field, exist only in values array */
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    /* JADX INFO: Fake field, exist only in values array */
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_PIXEL("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWABLE("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIBLE("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other");
    

    /* renamed from: a */
    public final String f16558a;

    EnumC8718h(String str) {
        this.f16558a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16558a;
    }
}
