package p060j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC10339a {
    /* renamed from: a */
    public static /* synthetic */ boolean m968a(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }
}
