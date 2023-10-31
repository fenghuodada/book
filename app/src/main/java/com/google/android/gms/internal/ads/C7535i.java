package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C7535i {
    /* renamed from: a */
    public static /* synthetic */ boolean m4824a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
