package retrofit2.converter.gson;

import com.google.gson.C8686j;
import com.google.gson.reflect.C8696a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.C11249g0;
import retrofit2.InterfaceC11257i;

/* renamed from: retrofit2.converter.gson.a */
/* loaded from: classes3.dex */
public final class C11238a extends InterfaceC11257i.AbstractC11258a {

    /* renamed from: a */
    public final C8686j f21953a;

    public C11238a(C8686j c8686j) {
        this.f21953a = c8686j;
    }

    @Override // retrofit2.InterfaceC11257i.AbstractC11258a
    /* renamed from: a */
    public final InterfaceC11257i mo29a(Type type) {
        C8696a<?> c8696a = C8696a.get(type);
        C8686j c8686j = this.f21953a;
        return new C11239b(c8686j, c8686j.m3233e(c8696a));
    }

    @Override // retrofit2.InterfaceC11257i.AbstractC11258a
    /* renamed from: b */
    public final InterfaceC11257i<ResponseBody, ?> mo2b(Type type, Annotation[] annotationArr, C11249g0 c11249g0) {
        C8696a<?> c8696a = C8696a.get(type);
        C8686j c8686j = this.f21953a;
        return new C11240c(c8686j, c8686j.m3233e(c8696a));
    }
}
