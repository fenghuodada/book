package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p060j$.util.concurrent.ConcurrentHashMap;
import retrofit2.InterfaceC11234c;
import retrofit2.InterfaceC11257i;

/* renamed from: retrofit2.g0 */
/* loaded from: classes3.dex */
public final class C11249g0 {

    /* renamed from: b */
    public final Call.Factory f22003b;

    /* renamed from: c */
    public final HttpUrl f22004c;

    /* renamed from: d */
    public final List<InterfaceC11257i.AbstractC11258a> f22005d;

    /* renamed from: e */
    public final List<InterfaceC11234c.AbstractC11235a> f22006e;
    @Nullable

    /* renamed from: f */
    public final Executor f22007f;

    /* renamed from: a */
    public final ConcurrentHashMap f22002a = new ConcurrentHashMap();

    /* renamed from: g */
    public final boolean f22008g = false;

    public C11249g0(Call.Factory factory, HttpUrl httpUrl, List list, List list2, @Nullable Executor executor) {
        this.f22003b = factory;
        this.f22004c = httpUrl;
        this.f22005d = list;
        this.f22006e = list2;
        this.f22007f = executor;
    }

    /* renamed from: a */
    public final InterfaceC11234c<?, ?> m35a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC11234c.AbstractC11235a> list = this.f22006e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC11234c<?, ?> mo12a = list.get(i).mo12a(type, annotationArr);
            if (mo12a != null) {
                return mo12a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final AbstractC11256h0<?> m34b(Method method) {
        AbstractC11256h0<?> abstractC11256h0;
        AbstractC11256h0<?> abstractC11256h02 = (AbstractC11256h0) this.f22002a.get(method);
        if (abstractC11256h02 != null) {
            return abstractC11256h02;
        }
        synchronized (this.f22002a) {
            abstractC11256h0 = (AbstractC11256h0) this.f22002a.get(method);
            if (abstractC11256h0 == null) {
                abstractC11256h0 = AbstractC11256h0.m30b(this, method);
                this.f22002a.put(method, abstractC11256h0);
            }
        }
        return abstractC11256h0;
    }

    /* renamed from: c */
    public final <T> InterfaceC11257i<T, RequestBody> m33c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List<InterfaceC11257i.AbstractC11258a> list = this.f22005d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC11257i<T, RequestBody> mo29a = list.get(i).mo29a(type);
            if (mo29a != null) {
                return mo29a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: d */
    public final <T> InterfaceC11257i<ResponseBody, T> m32d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List<InterfaceC11257i.AbstractC11258a> list = this.f22005d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = indexOf; i < size; i++) {
            InterfaceC11257i<ResponseBody, T> interfaceC11257i = (InterfaceC11257i<ResponseBody, T>) list.get(i).mo2b(type, annotationArr, this);
            if (interfaceC11257i != null) {
                return interfaceC11257i;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(list.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    public final void m31e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List<InterfaceC11257i.AbstractC11258a> list = this.f22005d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).getClass();
        }
    }
}
