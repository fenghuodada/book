package p060j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* renamed from: j$.util.stream.J3 */
/* loaded from: classes2.dex */
abstract class AbstractC10532J3 {

    /* renamed from: a */
    static final boolean f21027a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.stream.I3
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m799a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
