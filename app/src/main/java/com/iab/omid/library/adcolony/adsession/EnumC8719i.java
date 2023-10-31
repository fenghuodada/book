package com.iab.omid.library.adcolony.adsession;

import io.reactivex.rxjava3.annotations.SchedulerSupport;

/* renamed from: com.iab.omid.library.adcolony.adsession.i */
/* loaded from: classes3.dex */
public enum EnumC8719i {
    NATIVE("native"),
    /* JADX INFO: Fake field, exist only in values array */
    JAVASCRIPT("javascript"),
    NONE(SchedulerSupport.NONE);
    

    /* renamed from: a */
    public final String f16562a;

    EnumC8719i(String str) {
        this.f16562a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16562a;
    }
}
