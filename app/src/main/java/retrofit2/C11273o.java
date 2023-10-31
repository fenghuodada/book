package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: retrofit2.o */
/* loaded from: classes3.dex */
public final class C11273o {

    /* renamed from: a */
    public final Method f22042a;

    /* renamed from: b */
    public final List<?> f22043b;

    public C11273o(Method method, ArrayList arrayList) {
        this.f22042a = method;
        this.f22043b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f22042a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f22043b);
    }
}
