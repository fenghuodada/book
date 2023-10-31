package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.d1 */
/* loaded from: classes.dex */
public final class C1168d1 {

    /* renamed from: c */
    public static final C1168d1 f2962c = new C1168d1();

    /* renamed from: b */
    public final ConcurrentHashMap f2964b = new ConcurrentHashMap();

    /* renamed from: a */
    public final C1200k0 f2963a = new C1200k0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.datastore.preferences.protobuf.w0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.w0] */
    /* renamed from: a */
    public final <T> InterfaceC1182h1<T> m11132a(Class<T> cls) {
        InterfaceC1270x0 interfaceC1270x0;
        AbstractC1190i0 abstractC1190i0;
        AbstractC1226o1<?, ?> abstractC1226o1;
        AbstractC1239s<?> abstractC1239s;
        InterfaceC1222n0 interfaceC1222n0;
        C1265v0 m10738u;
        C1265v0 c1265v0;
        Class<?> cls2;
        Charset charset = C1157b0.f2944a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f2964b;
            InterfaceC1182h1<T> interfaceC1182h1 = (InterfaceC1182h1) concurrentHashMap.get(cls);
            if (interfaceC1182h1 == null) {
                C1200k0 c1200k0 = this.f2963a;
                c1200k0.getClass();
                Class<?> cls3 = C1193i1.f2989a;
                if (!AbstractC1273z.class.isAssignableFrom(cls) && (cls2 = C1193i1.f2989a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                InterfaceC1231q0 mo10718a = c1200k0.f3015a.mo10718a(cls);
                if (mo10718a.mo10863a()) {
                    if (AbstractC1273z.class.isAssignableFrom(cls)) {
                        c1265v0 = new C1268w0(C1193i1.f2992d, C1256u.f3087a, mo10718a.mo10862b());
                    } else {
                        AbstractC1226o1<?, ?> abstractC1226o12 = C1193i1.f2990b;
                        AbstractC1239s<?> abstractC1239s2 = C1256u.f3088b;
                        if (abstractC1239s2 != null) {
                            c1265v0 = new C1268w0(abstractC1226o12, abstractC1239s2, mo10718a.mo10862b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    m10738u = c1265v0;
                } else {
                    boolean z = false;
                    if (AbstractC1273z.class.isAssignableFrom(cls)) {
                        if (mo10718a.mo10861c() == 1) {
                            z = true;
                        }
                        if (z) {
                            interfaceC1270x0 = C1280z0.f3152b;
                            abstractC1190i0 = AbstractC1190i0.f2987b;
                            abstractC1226o1 = C1193i1.f2992d;
                            abstractC1239s = C1256u.f3087a;
                        } else {
                            interfaceC1270x0 = C1280z0.f3152b;
                            abstractC1190i0 = AbstractC1190i0.f2987b;
                            abstractC1226o1 = C1193i1.f2992d;
                            abstractC1239s = null;
                        }
                        interfaceC1222n0 = C1228p0.f3061b;
                    } else {
                        if (mo10718a.mo10861c() == 1) {
                            z = true;
                        }
                        if (z) {
                            interfaceC1270x0 = C1280z0.f3151a;
                            abstractC1190i0 = AbstractC1190i0.f2986a;
                            AbstractC1226o1<?, ?> abstractC1226o13 = C1193i1.f2990b;
                            AbstractC1239s<?> abstractC1239s3 = C1256u.f3088b;
                            if (abstractC1239s3 != null) {
                                abstractC1226o1 = abstractC1226o13;
                                abstractC1239s = abstractC1239s3;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            interfaceC1270x0 = C1280z0.f3151a;
                            abstractC1190i0 = AbstractC1190i0.f2986a;
                            abstractC1226o1 = C1193i1.f2991c;
                            abstractC1239s = null;
                        }
                        interfaceC1222n0 = C1228p0.f3060a;
                    }
                    InterfaceC1270x0 interfaceC1270x02 = interfaceC1270x0;
                    AbstractC1190i0 abstractC1190i02 = abstractC1190i0;
                    AbstractC1226o1<?, ?> abstractC1226o14 = abstractC1226o1;
                    AbstractC1239s<?> abstractC1239s4 = abstractC1239s;
                    InterfaceC1222n0 interfaceC1222n02 = interfaceC1222n0;
                    int[] iArr = C1265v0.f3099r;
                    if (mo10718a instanceof C1176f1) {
                        m10738u = C1265v0.m10738u((C1176f1) mo10718a, interfaceC1270x02, abstractC1190i02, abstractC1226o14, abstractC1239s4, interfaceC1222n02);
                    } else {
                        C1213l1 c1213l1 = (C1213l1) mo10718a;
                        throw null;
                    }
                }
                InterfaceC1182h1<T> interfaceC1182h12 = (InterfaceC1182h1) concurrentHashMap.putIfAbsent(cls, m10738u);
                if (interfaceC1182h12 != null) {
                    return interfaceC1182h12;
                }
                return m10738u;
            }
            return interfaceC1182h1;
        }
        throw new NullPointerException("messageType");
    }
}
