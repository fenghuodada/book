package com.android.tool.util.util;

import com.android.tool.ApplicationC2534a;
import com.android.tool.apps.InterfaceC2547a;
import com.google.gson.C8686j;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.C11195a;
import retrofit2.C11231b0;
import retrofit2.C11247f0;
import retrofit2.C11249g0;
import retrofit2.C11250h;
import retrofit2.C11266m;
import retrofit2.C11288x;
import retrofit2.adapter.rxjava3.C11229h;
import retrofit2.converter.gson.C11238a;

/* renamed from: com.android.tool.util.util.e */
/* loaded from: classes.dex */
public final class C2600e {

    /* renamed from: b */
    public static OkHttpClient f6118b;

    /* renamed from: a */
    public final InterfaceC2547a f6119a;

    /* renamed from: com.android.tool.util.util.e$a */
    /* loaded from: classes.dex */
    public class C2601a implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) throws IOException {
            Response.Builder newBuilder;
            String str;
            Request request = chain.request();
            if (!C2598c.m9342a()) {
                request = request.newBuilder().addHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_1) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Safari/605.1.15").cacheControl(CacheControl.FORCE_CACHE).build();
            }
            Response proceed = chain.proceed(request);
            if (C2598c.m9342a()) {
                str = request.cacheControl().toString();
                newBuilder = proceed.newBuilder();
            } else {
                newBuilder = proceed.newBuilder();
                str = "public, only-if-cached, max-stale=604800";
            }
            return newBuilder.header("Cache-Control", str).removeHeader("Pragma").build();
        }
    }

    public C2600e() {
        List<String> pathSegments;
        List singletonList;
        List emptyList;
        Method[] declaredMethods;
        byte b;
        boolean isDefault;
        C2601a c2601a = new C2601a();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new C2602f());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (f6118b == null) {
            synchronized (C2600e.class) {
                if (f6118b == null) {
                    new Cache(new File(ApplicationC2534a.f6025a.getCacheDir(), "HttpCache"), 104857600L);
                    OkHttpClient.Builder retryOnConnectionFailure = new OkHttpClient.Builder().cache(null).proxy(Proxy.NO_PROXY).addInterceptor(c2601a).addNetworkInterceptor(c2601a).addInterceptor(httpLoggingInterceptor).retryOnConnectionFailure(true);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    f6118b = retryOnConnectionFailure.connectTimeout(15L, timeUnit).readTimeout(20L, timeUnit).writeTimeout(20L, timeUnit).retryOnConnectionFailure(true).build();
                }
            }
        }
        C11231b0 c11231b0 = C11231b0.f21934c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C11229h());
        arrayList.add(new C11238a(new C8686j()));
        HttpUrl httpUrl = HttpUrl.get("https://bitbucket.org/");
        Objects.requireNonNull(httpUrl, "baseUrl == null");
        if ("".equals(httpUrl.pathSegments().get(pathSegments.size() - 1))) {
            OkHttpClient okHttpClient = f6118b;
            Objects.requireNonNull(okHttpClient, "client == null");
            Executor mo45a = c11231b0.mo45a();
            ArrayList arrayList3 = new ArrayList(arrayList2);
            C11266m c11266m = new C11266m(mo45a);
            if (c11231b0.f21935a) {
                singletonList = Arrays.asList(C11250h.f22009a, c11266m);
            } else {
                singletonList = Collections.singletonList(c11266m);
            }
            arrayList3.addAll(singletonList);
            ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + (c11231b0.f21935a ? 1 : 0));
            arrayList4.add(new C11195a());
            arrayList4.addAll(arrayList);
            if (c11231b0.f21935a) {
                emptyList = Collections.singletonList(C11288x.f22070a);
            } else {
                emptyList = Collections.emptyList();
            }
            arrayList4.addAll(emptyList);
            C11249g0 c11249g0 = new C11249g0(okHttpClient, httpUrl, Collections.unmodifiableList(arrayList4), Collections.unmodifiableList(arrayList3), mo45a);
            if (InterfaceC2547a.class.isInterface()) {
                ArrayDeque arrayDeque = new ArrayDeque(1);
                arrayDeque.add(InterfaceC2547a.class);
                while (!arrayDeque.isEmpty()) {
                    Class cls = (Class) arrayDeque.removeFirst();
                    if (cls.getTypeParameters().length != 0) {
                        StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                        sb.append(cls.getName());
                        if (cls != InterfaceC2547a.class) {
                            sb.append(" which is an interface of ");
                            sb.append(InterfaceC2547a.class.getName());
                        }
                        throw new IllegalArgumentException(sb.toString());
                    }
                    Collections.addAll(arrayDeque, cls.getInterfaces());
                }
                if (c11249g0.f22008g) {
                    C11231b0 c11231b02 = C11231b0.f21934c;
                    for (Method method : InterfaceC2547a.class.getDeclaredMethods()) {
                        if (c11231b02.f21935a) {
                            isDefault = method.isDefault();
                            if (isDefault) {
                                b = 1;
                                if (b == 0 && !Modifier.isStatic(method.getModifiers())) {
                                    c11249g0.m34b(method);
                                }
                            }
                        }
                        b = 0;
                        if (b == 0) {
                            c11249g0.m34b(method);
                        }
                    }
                }
                this.f6119a = (InterfaceC2547a) java.lang.reflect.Proxy.newProxyInstance(InterfaceC2547a.class.getClassLoader(), new Class[]{InterfaceC2547a.class}, new C11247f0(c11249g0));
                return;
            }
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
    }
}
