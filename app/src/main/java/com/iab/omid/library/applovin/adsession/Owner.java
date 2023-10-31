package com.iab.omid.library.applovin.adsession;

import io.reactivex.rxjava3.annotations.SchedulerSupport;

/* loaded from: classes3.dex */
public enum Owner {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(SchedulerSupport.NONE);
    
    private final String owner;

    Owner(String str) {
        this.owner = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.owner;
    }
}
