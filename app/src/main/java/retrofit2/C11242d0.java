package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;

/* renamed from: retrofit2.d0 */
/* loaded from: classes3.dex */
public final class C11242d0 {

    /* renamed from: a */
    public final Method f21960a;

    /* renamed from: b */
    public final HttpUrl f21961b;

    /* renamed from: c */
    public final String f21962c;
    @Nullable

    /* renamed from: d */
    public final String f21963d;
    @Nullable

    /* renamed from: e */
    public final Headers f21964e;
    @Nullable

    /* renamed from: f */
    public final MediaType f21965f;

    /* renamed from: g */
    public final boolean f21966g;

    /* renamed from: h */
    public final boolean f21967h;

    /* renamed from: i */
    public final boolean f21968i;

    /* renamed from: j */
    public final AbstractC11202a0<?>[] f21969j;

    /* renamed from: k */
    public final boolean f21970k;

    /* renamed from: retrofit2.d0$a */
    /* loaded from: classes3.dex */
    public static final class C11243a {

        /* renamed from: x */
        public static final Pattern f21971x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        public static final Pattern f21972y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final C11249g0 f21973a;

        /* renamed from: b */
        public final Method f21974b;

        /* renamed from: c */
        public final Annotation[] f21975c;

        /* renamed from: d */
        public final Annotation[][] f21976d;

        /* renamed from: e */
        public final Type[] f21977e;

        /* renamed from: f */
        public boolean f21978f;

        /* renamed from: g */
        public boolean f21979g;

        /* renamed from: h */
        public boolean f21980h;

        /* renamed from: i */
        public boolean f21981i;

        /* renamed from: j */
        public boolean f21982j;

        /* renamed from: k */
        public boolean f21983k;

        /* renamed from: l */
        public boolean f21984l;

        /* renamed from: m */
        public boolean f21985m;
        @Nullable

        /* renamed from: n */
        public String f21986n;

        /* renamed from: o */
        public boolean f21987o;

        /* renamed from: p */
        public boolean f21988p;

        /* renamed from: q */
        public boolean f21989q;
        @Nullable

        /* renamed from: r */
        public String f21990r;
        @Nullable

        /* renamed from: s */
        public Headers f21991s;
        @Nullable

        /* renamed from: t */
        public MediaType f21992t;
        @Nullable

        /* renamed from: u */
        public LinkedHashSet f21993u;
        @Nullable

        /* renamed from: v */
        public AbstractC11202a0<?>[] f21994v;

        /* renamed from: w */
        public boolean f21995w;

        public C11243a(C11249g0 c11249g0, Method method) {
            this.f21973a = c11249g0;
            this.f21974b = method;
            this.f21975c = method.getAnnotations();
            this.f21977e = method.getGenericParameterTypes();
            this.f21976d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public static Class<?> m41a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* renamed from: b */
        public final void m40b(String str, String str2, boolean z) {
            String str3 = this.f21986n;
            Method method = this.f21974b;
            if (str3 == null) {
                this.f21986n = str;
                this.f21987o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                Pattern pattern = f21971x;
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (pattern.matcher(substring).find()) {
                        throw C11259i0.m20i(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.f21990r = str2;
                Matcher matcher = pattern.matcher(str2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (matcher.find()) {
                    linkedHashSet.add(matcher.group(1));
                }
                this.f21993u = linkedHashSet;
                return;
            }
            throw C11259i0.m20i(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: c */
        public final void m39c(int i, Type type) {
            if (C11259i0.m22g(type)) {
                throw C11259i0.m19j(this.f21974b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public C11242d0(C11243a c11243a) {
        this.f21960a = c11243a.f21974b;
        this.f21961b = c11243a.f21973a.f22004c;
        this.f21962c = c11243a.f21986n;
        this.f21963d = c11243a.f21990r;
        this.f21964e = c11243a.f21991s;
        this.f21965f = c11243a.f21992t;
        this.f21966g = c11243a.f21987o;
        this.f21967h = c11243a.f21988p;
        this.f21968i = c11243a.f21989q;
        this.f21969j = c11243a.f21994v;
        this.f21970k = c11243a.f21995w;
    }
}
