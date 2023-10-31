package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class zzgmp extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
