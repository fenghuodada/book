package p060j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.x */
/* loaded from: classes2.dex */
final class C10362x implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
