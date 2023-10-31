package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p060j$.util.Optional;
import retrofit2.InterfaceC11257i;

@IgnoreJRERequirement
/* renamed from: retrofit2.x */
/* loaded from: classes3.dex */
public final class C11288x extends InterfaceC11257i.AbstractC11258a {

    /* renamed from: a */
    public static final C11288x f22070a = new C11288x();

    @IgnoreJRERequirement
    /* renamed from: retrofit2.x$a */
    /* loaded from: classes3.dex */
    public static final class C11289a<T> implements InterfaceC11257i<ResponseBody, Optional<T>> {

        /* renamed from: a */
        public final InterfaceC11257i<ResponseBody, T> f22071a;

        public C11289a(InterfaceC11257i<ResponseBody, T> interfaceC11257i) {
            this.f22071a = interfaceC11257i;
        }

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final Object mo1a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.f22071a.mo1a(responseBody));
        }
    }

    @Override // retrofit2.InterfaceC11257i.AbstractC11258a
    @Nullable
    /* renamed from: b */
    public final InterfaceC11257i<ResponseBody, ?> mo2b(Type type, Annotation[] annotationArr, C11249g0 c11249g0) {
        if (C11259i0.m24e(type) != Optional.class) {
            return null;
        }
        return new C11289a(c11249g0.m32d(C11259i0.m25d(0, (ParameterizedType) type), annotationArr));
    }
}
