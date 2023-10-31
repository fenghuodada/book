package retrofit2.adapter.rxjava3;

import io.reactivex.rxjava3.core.AbstractC10148a;
import io.reactivex.rxjava3.core.AbstractC10149b;
import io.reactivex.rxjava3.core.AbstractC10150c;
import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.core.AbstractC10159h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.C11245e0;
import retrofit2.C11259i0;
import retrofit2.InterfaceC11234c;

/* renamed from: retrofit2.adapter.rxjava3.h */
/* loaded from: classes3.dex */
public final class C11229h extends InterfaceC11234c.AbstractC11235a {
    @Nullable

    /* renamed from: a */
    public final AbstractC10154g f21932a = null;

    /* renamed from: b */
    public final boolean f21933b = true;

    @Override // retrofit2.InterfaceC11234c.AbstractC11235a
    @Nullable
    /* renamed from: a */
    public final InterfaceC11234c mo12a(Type type, Annotation[] annotationArr) {
        boolean z;
        boolean z2;
        boolean z3;
        Type type2;
        boolean z4;
        boolean z5;
        String str;
        Class<?> m24e = C11259i0.m24e(type);
        if (m24e == AbstractC10148a.class) {
            return new C11228g(Void.class, this.f21932a, this.f21933b, false, true, false, false, false, true);
        }
        if (m24e == AbstractC10149b.class) {
            z = true;
        } else {
            z = false;
        }
        if (m24e == AbstractC10159h.class) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m24e == AbstractC10150c.class) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (m24e != AbstractC10151d.class && !z && !z2 && !z3) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (!z) {
                if (!z2) {
                    if (z3) {
                        str = "Maybe";
                    } else {
                        str = "Observable";
                    }
                } else {
                    str = "Single";
                }
            } else {
                str = "Flowable";
            }
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type m25d = C11259i0.m25d(0, (ParameterizedType) type);
        Class<?> m24e2 = C11259i0.m24e(m25d);
        if (m24e2 == C11245e0.class) {
            if (m25d instanceof ParameterizedType) {
                type2 = C11259i0.m25d(0, (ParameterizedType) m25d);
                z5 = false;
                z4 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (m24e2 == C11225e.class) {
            if (m25d instanceof ParameterizedType) {
                type2 = C11259i0.m25d(0, (ParameterizedType) m25d);
                z5 = true;
                z4 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
        } else {
            type2 = m25d;
            z4 = true;
            z5 = false;
        }
        return new C11228g(type2, this.f21932a, this.f21933b, z5, z4, z, z2, z3, false);
    }
}
