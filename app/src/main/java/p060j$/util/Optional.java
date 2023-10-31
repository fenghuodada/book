package p060j$.util;

import java.util.NoSuchElementException;

/* renamed from: j$.util.Optional */
/* loaded from: classes2.dex */
public final class Optional<T> {

    /* renamed from: b */
    private static final Optional f20725b = new Optional();

    /* renamed from: a */
    private final Object f20726a;

    private Optional() {
        this.f20726a = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.f20726a = obj;
    }

    /* renamed from: a */
    public static Optional m1027a() {
        return f20725b;
    }

    /* renamed from: d */
    public static Optional m1024d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? f20725b : new Optional<>(t);
    }

    /* renamed from: b */
    public final Object m1026b() {
        Object obj = this.f20726a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final boolean m1025c() {
        return this.f20726a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return AbstractC10331a.m1003u(this.f20726a, ((Optional) obj).f20726a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f20726a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f20726a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
