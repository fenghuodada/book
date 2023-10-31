package p060j$.time.chrono;

import java.util.Locale;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.chrono.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10243a implements InterfaceC10249g {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new Locale("ja", "JP", "JP");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((InterfaceC10249g) obj).getClass();
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC10243a) {
            ((AbstractC10243a) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ 72805;
    }

    public final String toString() {
        return "ISO";
    }
}
