package com.google.crypto.tink;

import com.google.crypto.tink.proto.C8117a0;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.logging.Logger;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.p */
/* loaded from: classes3.dex */
public final class C8112p {

    /* renamed from: a */
    public static final Logger f15912a = Logger.getLogger(C8112p.class.getName());

    /* renamed from: b */
    public static final ConcurrentHashMap f15913b = new ConcurrentHashMap();

    /* renamed from: c */
    public static final ConcurrentHashMap f15914c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentHashMap f15915d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentHashMap f15916e;

    /* renamed from: com.google.crypto.tink.p$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8113a {
        /* renamed from: a */
        C8074d mo4158a(Class cls) throws GeneralSecurityException;

        /* renamed from: b */
        C8074d mo4157b();

        /* renamed from: c */
        Class<?> mo4156c();

        /* renamed from: d */
        Set<Class<?>> mo4155d();
    }

    static {
        new ConcurrentHashMap();
        f15916e = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static synchronized void m4164a(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (C8112p.class) {
            ConcurrentHashMap concurrentHashMap = f15913b;
            if (concurrentHashMap.containsKey(str)) {
                InterfaceC8113a interfaceC8113a = (InterfaceC8113a) concurrentHashMap.get(str);
                if (!interfaceC8113a.mo4156c().equals(cls)) {
                    Logger logger = f15912a;
                    logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, interfaceC8113a.mo4156c().getName(), cls.getName()));
                }
                if (z && !((Boolean) f15915d.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            }
        }
    }

    /* renamed from: b */
    public static synchronized InterfaceC8113a m4163b(String str) throws GeneralSecurityException {
        InterfaceC8113a interfaceC8113a;
        synchronized (C8112p.class) {
            ConcurrentHashMap concurrentHashMap = f15913b;
            if (!concurrentHashMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            interfaceC8113a = (InterfaceC8113a) concurrentHashMap.get(str);
        }
        return interfaceC8113a;
    }

    /* renamed from: c */
    public static <P> P m4162c(String str, AbstractC8228i abstractC8228i, Class<P> cls) throws GeneralSecurityException {
        InterfaceC8113a m4163b = m4163b(str);
        if (m4163b.mo4155d().contains(cls)) {
            return (P) m4163b.mo4158a(cls).m4207a(abstractC8228i);
        }
        StringBuilder sb = new StringBuilder("Primitive type ");
        sb.append(cls.getName());
        sb.append(" not supported by key manager of type ");
        sb.append(m4163b.mo4156c());
        sb.append(", supported primitives: ");
        Set<Class<?>> mo4155d = m4163b.mo4155d();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : mo4155d) {
            if (!z) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z = false;
        }
        sb.append(sb2.toString());
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: d */
    public static synchronized C8189y m4161d(C8117a0 c8117a0) throws GeneralSecurityException {
        C8189y m4206b;
        synchronized (C8112p.class) {
            C8074d mo4157b = m4163b(c8117a0.m4138y()).mo4157b();
            if (((Boolean) f15915d.get(c8117a0.m4138y())).booleanValue()) {
                m4206b = mo4157b.m4206b(c8117a0.m4137z());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + c8117a0.m4138y());
            }
        }
        return m4206b;
    }

    /* renamed from: e */
    public static synchronized <KeyProtoT extends InterfaceC8287r0> void m4160e(AbstractC8082f<KeyProtoT> abstractC8082f, boolean z) throws GeneralSecurityException {
        synchronized (C8112p.class) {
            String mo4178a = abstractC8082f.mo4178a();
            m4164a(mo4178a, abstractC8082f.getClass(), z);
            ConcurrentHashMap concurrentHashMap = f15913b;
            if (!concurrentHashMap.containsKey(mo4178a)) {
                concurrentHashMap.put(mo4178a, new C8110n(abstractC8082f));
                f15914c.put(mo4178a, new C8111o());
            }
            f15915d.put(mo4178a, Boolean.valueOf(z));
        }
    }

    /* renamed from: f */
    public static synchronized <B, P> void m4159f(InterfaceC8100m<B, P> interfaceC8100m) throws GeneralSecurityException {
        synchronized (C8112p.class) {
            Class<P> mo4166b = interfaceC8100m.mo4166b();
            ConcurrentHashMap concurrentHashMap = f15916e;
            if (concurrentHashMap.containsKey(mo4166b)) {
                InterfaceC8100m interfaceC8100m2 = (InterfaceC8100m) concurrentHashMap.get(mo4166b);
                if (!interfaceC8100m.getClass().equals(interfaceC8100m2.getClass())) {
                    Logger logger = f15912a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + mo4166b);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", mo4166b.getName(), interfaceC8100m2.getClass().getName(), interfaceC8100m.getClass().getName()));
                }
            }
            concurrentHashMap.put(mo4166b, interfaceC8100m);
        }
    }
}
