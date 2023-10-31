package androidx.core.util;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.InterfaceC1483m;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.b */
/* loaded from: classes.dex */
public final class C0798b {
    /* renamed from: a */
    public static void m11796a(StringBuilder sb, InterfaceC1483m interfaceC1483m) {
        String hexString;
        int lastIndexOf;
        if (interfaceC1483m == null) {
            hexString = "null";
        } else {
            String simpleName = interfaceC1483m.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC1483m.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(interfaceC1483m));
        }
        sb.append(hexString);
    }
}
