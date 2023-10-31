package p060j$.time.format;

import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.t */
/* loaded from: classes2.dex */
public final class C10273t {

    /* renamed from: a */
    public static final C10273t f20655a = new C10273t();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C10273t() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10273t) {
            ((C10273t) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
