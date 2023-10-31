package p060j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* renamed from: j$.util.j */
/* loaded from: classes2.dex */
public abstract class AbstractC10473j {
    /* renamed from: a */
    public static Optional m844a(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.m1024d(optional.get()) : Optional.m1027a();
    }

    /* renamed from: b */
    public static C10474k m843b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C10474k.m833d(optionalDouble.getAsDouble()) : C10474k.m836a();
    }

    /* renamed from: c */
    public static C10475l m842c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C10475l.m829d(optionalInt.getAsInt()) : C10475l.m832a();
    }

    /* renamed from: d */
    public static C10476m m841d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C10476m.m825d(optionalLong.getAsLong()) : C10476m.m828a();
    }

    /* renamed from: e */
    public static Optional m840e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.m1025c() ? Optional.of(optional.m1026b()) : Optional.empty();
    }

    /* renamed from: f */
    public static OptionalDouble m839f(C10474k c10474k) {
        if (c10474k == null) {
            return null;
        }
        return c10474k.m834c() ? OptionalDouble.of(c10474k.m835b()) : OptionalDouble.empty();
    }

    /* renamed from: g */
    public static OptionalInt m838g(C10475l c10475l) {
        if (c10475l == null) {
            return null;
        }
        return c10475l.m830c() ? OptionalInt.of(c10475l.m831b()) : OptionalInt.empty();
    }

    /* renamed from: h */
    public static OptionalLong m837h(C10476m c10476m) {
        if (c10476m == null) {
            return null;
        }
        return c10476m.m826c() ? OptionalLong.of(c10476m.m827b()) : OptionalLong.empty();
    }
}
