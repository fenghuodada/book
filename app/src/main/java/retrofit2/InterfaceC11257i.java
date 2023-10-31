package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;

/* renamed from: retrofit2.i */
/* loaded from: classes3.dex */
public interface InterfaceC11257i<F, T> {

    /* renamed from: retrofit2.i$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC11258a {
        @Nullable
        /* renamed from: a */
        public InterfaceC11257i mo29a(Type type) {
            return null;
        }

        @Nullable
        /* renamed from: b */
        public InterfaceC11257i<ResponseBody, ?> mo2b(Type type, Annotation[] annotationArr, C11249g0 c11249g0) {
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    T mo1a(F f) throws IOException;
}
