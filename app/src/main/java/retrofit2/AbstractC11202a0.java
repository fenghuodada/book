package retrofit2;

import androidx.core.content.C0663f;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.C11195a;

/* renamed from: retrofit2.a0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11202a0<T> {

    /* renamed from: retrofit2.a0$a */
    /* loaded from: classes3.dex */
    public static final class C11203a<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final Method f21871a;

        /* renamed from: b */
        public final int f21872b;

        /* renamed from: c */
        public final InterfaceC11257i<T, RequestBody> f21873c;

        public C11203a(Method method, int i, InterfaceC11257i<T, RequestBody> interfaceC11257i) {
            this.f21871a = method;
            this.f21872b = i;
            this.f21873c = interfaceC11257i;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) {
            int i = this.f21872b;
            Method method = this.f21871a;
            if (t != null) {
                try {
                    c11236c0.f21950k = this.f21873c.mo1a(t);
                    return;
                } catch (IOException e) {
                    throw C11259i0.m18k(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw C11259i0.m19j(method, i, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$b */
    /* loaded from: classes3.dex */
    public static final class C11204b<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final String f21874a;

        /* renamed from: b */
        public final InterfaceC11257i<T, String> f21875b;

        /* renamed from: c */
        public final boolean f21876c;

        public C11204b(String str, boolean z) {
            C11195a.C11199d c11199d = C11195a.C11199d.f21868a;
            Objects.requireNonNull(str, "name == null");
            this.f21874a = str;
            this.f21875b = c11199d;
            this.f21876c = z;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) throws IOException {
            String mo1a;
            if (t == null || (mo1a = this.f21875b.mo1a(t)) == null) {
                return;
            }
            String str = this.f21874a;
            boolean z = this.f21876c;
            FormBody.Builder builder = c11236c0.f21949j;
            if (z) {
                builder.addEncoded(str, mo1a);
            } else {
                builder.add(str, mo1a);
            }
        }
    }

    /* renamed from: retrofit2.a0$c */
    /* loaded from: classes3.dex */
    public static final class C11205c<T> extends AbstractC11202a0<Map<String, T>> {

        /* renamed from: a */
        public final Method f21877a;

        /* renamed from: b */
        public final int f21878b;

        /* renamed from: c */
        public final boolean f21879c;

        public C11205c(Method method, int i, boolean z) {
            this.f21877a = method;
            this.f21878b = i;
            this.f21879c = z;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f21878b;
            Method method = this.f21877a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                boolean z = this.f21879c;
                                FormBody.Builder builder = c11236c0.f21949j;
                                if (z) {
                                    builder.addEncoded(str, obj2);
                                } else {
                                    builder.add(str, obj2);
                                }
                            } else {
                                throw C11259i0.m19j(method, i, "Field map value '" + value + "' converted to null by " + C11195a.C11199d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C11259i0.m19j(method, i, C0663f.m12005a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C11259i0.m19j(method, i, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C11259i0.m19j(method, i, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$d */
    /* loaded from: classes3.dex */
    public static final class C11206d<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final String f21880a;

        /* renamed from: b */
        public final InterfaceC11257i<T, String> f21881b;

        public C11206d(String str) {
            C11195a.C11199d c11199d = C11195a.C11199d.f21868a;
            Objects.requireNonNull(str, "name == null");
            this.f21880a = str;
            this.f21881b = c11199d;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) throws IOException {
            String mo1a;
            if (t == null || (mo1a = this.f21881b.mo1a(t)) == null) {
                return;
            }
            c11236c0.m43a(this.f21880a, mo1a);
        }
    }

    /* renamed from: retrofit2.a0$e */
    /* loaded from: classes3.dex */
    public static final class C11207e<T> extends AbstractC11202a0<Map<String, T>> {

        /* renamed from: a */
        public final Method f21882a;

        /* renamed from: b */
        public final int f21883b;

        public C11207e(Method method, int i) {
            this.f21882a = method;
            this.f21883b = i;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f21883b;
            Method method = this.f21882a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            c11236c0.m43a(str, value.toString());
                        } else {
                            throw C11259i0.m19j(method, i, C0663f.m12005a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C11259i0.m19j(method, i, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C11259i0.m19j(method, i, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$f */
    /* loaded from: classes3.dex */
    public static final class C11208f extends AbstractC11202a0<Headers> {

        /* renamed from: a */
        public final Method f21884a;

        /* renamed from: b */
        public final int f21885b;

        public C11208f(int i, Method method) {
            this.f21884a = method;
            this.f21885b = i;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Headers headers) throws IOException {
            Headers headers2 = headers;
            if (headers2 != null) {
                c11236c0.f21945f.addAll(headers2);
                return;
            }
            throw C11259i0.m19j(this.f21884a, this.f21885b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$g */
    /* loaded from: classes3.dex */
    public static final class C11209g<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final Method f21886a;

        /* renamed from: b */
        public final int f21887b;

        /* renamed from: c */
        public final Headers f21888c;

        /* renamed from: d */
        public final InterfaceC11257i<T, RequestBody> f21889d;

        public C11209g(Method method, int i, Headers headers, InterfaceC11257i<T, RequestBody> interfaceC11257i) {
            this.f21886a = method;
            this.f21887b = i;
            this.f21888c = headers;
            this.f21889d = interfaceC11257i;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                c11236c0.f21948i.addPart(this.f21888c, this.f21889d.mo1a(t));
            } catch (IOException e) {
                throw C11259i0.m19j(this.f21886a, this.f21887b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* renamed from: retrofit2.a0$h */
    /* loaded from: classes3.dex */
    public static final class C11210h<T> extends AbstractC11202a0<Map<String, T>> {

        /* renamed from: a */
        public final Method f21890a;

        /* renamed from: b */
        public final int f21891b;

        /* renamed from: c */
        public final InterfaceC11257i<T, RequestBody> f21892c;

        /* renamed from: d */
        public final String f21893d;

        public C11210h(Method method, int i, InterfaceC11257i<T, RequestBody> interfaceC11257i, String str) {
            this.f21890a = method;
            this.f21891b = i;
            this.f21892c = interfaceC11257i;
            this.f21893d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f21891b;
            Method method = this.f21890a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            c11236c0.f21948i.addPart(Headers.m63of("Content-Disposition", C0663f.m12005a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f21893d), (RequestBody) this.f21892c.mo1a(value));
                        } else {
                            throw C11259i0.m19j(method, i, C0663f.m12005a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C11259i0.m19j(method, i, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C11259i0.m19j(method, i, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$i */
    /* loaded from: classes3.dex */
    public static final class C11211i<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final Method f21894a;

        /* renamed from: b */
        public final int f21895b;

        /* renamed from: c */
        public final String f21896c;

        /* renamed from: d */
        public final InterfaceC11257i<T, String> f21897d;

        /* renamed from: e */
        public final boolean f21898e;

        public C11211i(Method method, int i, String str, boolean z) {
            C11195a.C11199d c11199d = C11195a.C11199d.f21868a;
            this.f21894a = method;
            this.f21895b = i;
            Objects.requireNonNull(str, "name == null");
            this.f21896c = str;
            this.f21897d = c11199d;
            this.f21898e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo0a(retrofit2.C11236c0 r18, @javax.annotation.Nullable T r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.AbstractC11202a0.C11211i.mo0a(retrofit2.c0, java.lang.Object):void");
        }
    }

    /* renamed from: retrofit2.a0$j */
    /* loaded from: classes3.dex */
    public static final class C11212j<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final String f21899a;

        /* renamed from: b */
        public final InterfaceC11257i<T, String> f21900b;

        /* renamed from: c */
        public final boolean f21901c;

        public C11212j(String str, boolean z) {
            C11195a.C11199d c11199d = C11195a.C11199d.f21868a;
            Objects.requireNonNull(str, "name == null");
            this.f21899a = str;
            this.f21900b = c11199d;
            this.f21901c = z;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) throws IOException {
            String mo1a;
            if (t == null || (mo1a = this.f21900b.mo1a(t)) == null) {
                return;
            }
            c11236c0.m42b(this.f21899a, mo1a, this.f21901c);
        }
    }

    /* renamed from: retrofit2.a0$k */
    /* loaded from: classes3.dex */
    public static final class C11213k<T> extends AbstractC11202a0<Map<String, T>> {

        /* renamed from: a */
        public final Method f21902a;

        /* renamed from: b */
        public final int f21903b;

        /* renamed from: c */
        public final boolean f21904c;

        public C11213k(Method method, int i, boolean z) {
            this.f21902a = method;
            this.f21903b = i;
            this.f21904c = z;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.f21903b;
            Method method = this.f21902a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                c11236c0.m42b(str, obj2, this.f21904c);
                            } else {
                                throw C11259i0.m19j(method, i, "Query map value '" + value + "' converted to null by " + C11195a.C11199d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw C11259i0.m19j(method, i, C0663f.m12005a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw C11259i0.m19j(method, i, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C11259i0.m19j(method, i, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$l */
    /* loaded from: classes3.dex */
    public static final class C11214l<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final boolean f21905a;

        public C11214l(boolean z) {
            this.f21905a = z;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            c11236c0.m42b(t.toString(), null, this.f21905a);
        }
    }

    /* renamed from: retrofit2.a0$m */
    /* loaded from: classes3.dex */
    public static final class C11215m extends AbstractC11202a0<MultipartBody.Part> {

        /* renamed from: a */
        public static final C11215m f21906a = new C11215m();

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                c11236c0.f21948i.addPart(part2);
            }
        }
    }

    /* renamed from: retrofit2.a0$n */
    /* loaded from: classes3.dex */
    public static final class C11216n extends AbstractC11202a0<Object> {

        /* renamed from: a */
        public final Method f21907a;

        /* renamed from: b */
        public final int f21908b;

        public C11216n(int i, Method method) {
            this.f21907a = method;
            this.f21908b = i;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable Object obj) {
            if (obj != null) {
                c11236c0.f21942c = obj.toString();
                return;
            }
            int i = this.f21908b;
            throw C11259i0.m19j(this.f21907a, i, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: retrofit2.a0$o */
    /* loaded from: classes3.dex */
    public static final class C11217o<T> extends AbstractC11202a0<T> {

        /* renamed from: a */
        public final Class<T> f21909a;

        public C11217o(Class<T> cls) {
            this.f21909a = cls;
        }

        @Override // retrofit2.AbstractC11202a0
        /* renamed from: a */
        public final void mo0a(C11236c0 c11236c0, @Nullable T t) {
            c11236c0.f21944e.tag(this.f21909a, t);
        }
    }

    /* renamed from: a */
    public abstract void mo0a(C11236c0 c11236c0, @Nullable T t) throws IOException;
}
