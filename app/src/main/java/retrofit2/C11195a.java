package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.C10868p;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import retrofit2.InterfaceC11257i;
import retrofit2.http.Streaming;

/* renamed from: retrofit2.a */
/* loaded from: classes3.dex */
public final class C11195a extends InterfaceC11257i.AbstractC11258a {

    /* renamed from: a */
    public boolean f21864a = true;

    /* renamed from: retrofit2.a$a */
    /* loaded from: classes3.dex */
    public static final class C11196a implements InterfaceC11257i<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C11196a f21865a = new C11196a();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final ResponseBody mo1a(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                Buffer buffer = new Buffer();
                responseBody2.source().readAll(buffer);
                return ResponseBody.create(responseBody2.contentType(), responseBody2.contentLength(), buffer);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* renamed from: retrofit2.a$b */
    /* loaded from: classes3.dex */
    public static final class C11197b implements InterfaceC11257i<RequestBody, RequestBody> {

        /* renamed from: a */
        public static final C11197b f21866a = new C11197b();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final RequestBody mo1a(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    /* renamed from: retrofit2.a$c */
    /* loaded from: classes3.dex */
    public static final class C11198c implements InterfaceC11257i<ResponseBody, ResponseBody> {

        /* renamed from: a */
        public static final C11198c f21867a = new C11198c();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final ResponseBody mo1a(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    /* renamed from: retrofit2.a$d */
    /* loaded from: classes3.dex */
    public static final class C11199d implements InterfaceC11257i<Object, String> {

        /* renamed from: a */
        public static final C11199d f21868a = new C11199d();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final String mo1a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* renamed from: retrofit2.a$e */
    /* loaded from: classes3.dex */
    public static final class C11200e implements InterfaceC11257i<ResponseBody, C10868p> {

        /* renamed from: a */
        public static final C11200e f21869a = new C11200e();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final C10868p mo1a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return C10868p.f21418a;
        }
    }

    /* renamed from: retrofit2.a$f */
    /* loaded from: classes3.dex */
    public static final class C11201f implements InterfaceC11257i<ResponseBody, Void> {

        /* renamed from: a */
        public static final C11201f f21870a = new C11201f();

        @Override // retrofit2.InterfaceC11257i
        /* renamed from: a */
        public final Void mo1a(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.InterfaceC11257i.AbstractC11258a
    @Nullable
    /* renamed from: a */
    public final InterfaceC11257i mo29a(Type type) {
        if (RequestBody.class.isAssignableFrom(C11259i0.m24e(type))) {
            return C11197b.f21866a;
        }
        return null;
    }

    @Override // retrofit2.InterfaceC11257i.AbstractC11258a
    @Nullable
    /* renamed from: b */
    public final InterfaceC11257i<ResponseBody, ?> mo2b(Type type, Annotation[] annotationArr, C11249g0 c11249g0) {
        if (type == ResponseBody.class) {
            return C11259i0.m21h(annotationArr, Streaming.class) ? C11198c.f21867a : C11196a.f21865a;
        } else if (type == Void.class) {
            return C11201f.f21870a;
        } else {
            if (this.f21864a && type == C10868p.class) {
                try {
                    return C11200e.f21869a;
                } catch (NoClassDefFoundError unused) {
                    this.f21864a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
