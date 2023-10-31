package p060j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.l */
/* loaded from: classes2.dex */
public final class C10475l {

    /* renamed from: c */
    private static final C10475l f20944c = new C10475l();

    /* renamed from: a */
    private final boolean f20945a;

    /* renamed from: b */
    private final int f20946b;

    private C10475l() {
        this.f20945a = false;
        this.f20946b = 0;
    }

    private C10475l(int i) {
        this.f20945a = true;
        this.f20946b = i;
    }

    /* renamed from: a */
    public static C10475l m832a() {
        return f20944c;
    }

    /* renamed from: d */
    public static C10475l m829d(int i) {
        return new C10475l(i);
    }

    /* renamed from: b */
    public final int m831b() {
        if (this.f20945a) {
            return this.f20946b;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m830c() {
        return this.f20945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10475l) {
            C10475l c10475l = (C10475l) obj;
            boolean z = this.f20945a;
            if (z && c10475l.f20945a) {
                if (this.f20946b == c10475l.f20946b) {
                    return true;
                }
            } else if (z == c10475l.f20945a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20945a) {
            return this.f20946b;
        }
        return 0;
    }

    public final String toString() {
        return this.f20945a ? String.format("OptionalInt[%s]", Integer.valueOf(this.f20946b)) : "OptionalInt.empty";
    }
}
