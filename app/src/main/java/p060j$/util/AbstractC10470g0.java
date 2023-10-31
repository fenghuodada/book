package p060j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: j$.util.g0 */
/* loaded from: classes2.dex */
abstract class AbstractC10470g0 {

    /* renamed from: a */
    static final boolean f20940a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.f0
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m847a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
