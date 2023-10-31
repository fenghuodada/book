package com.google.gson.internal;

import androidx.datastore.preferences.protobuf.C1220m1;
import androidx.recyclerview.C1553a;
import com.google.android.datatransport.cct.C6436d;
import com.google.android.exoplayer2.p038ui.C7321e;
import com.google.gson.InterfaceC8689l;
import com.google.gson.internal.reflect.AbstractC8681b;
import com.google.gson.reflect.C8696a;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* renamed from: com.google.gson.internal.f */
/* loaded from: classes3.dex */
public final class C8658f {

    /* renamed from: a */
    public final Map<Type, InterfaceC8689l<?>> f16451a;

    /* renamed from: b */
    public final AbstractC8681b f16452b = AbstractC8681b.f16485a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.f$a */
    /* loaded from: classes3.dex */
    public class C8659a<T> implements InterfaceC8676o<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8689l f16453a;

        public C8659a(InterfaceC8689l interfaceC8689l, Type type) {
            this.f16453a = interfaceC8689l;
        }

        @Override // com.google.gson.internal.InterfaceC8676o
        /* renamed from: a */
        public final T mo3242a() {
            return (T) this.f16453a.m3225a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.f$b */
    /* loaded from: classes3.dex */
    public class C8660b<T> implements InterfaceC8676o<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC8689l f16454a;

        public C8660b(InterfaceC8689l interfaceC8689l, Type type) {
            this.f16454a = interfaceC8689l;
        }

        @Override // com.google.gson.internal.InterfaceC8676o
        /* renamed from: a */
        public final T mo3242a() {
            return (T) this.f16454a.m3225a();
        }
    }

    public C8658f(Map<Type, InterfaceC8689l<?>> map) {
        this.f16451a = map;
    }

    /* renamed from: a */
    public final <T> InterfaceC8676o<T> m3251a(C8696a<T> c8696a) {
        C8661g c8661g;
        Type type = c8696a.getType();
        Class<? super T> rawType = c8696a.getRawType();
        Map<Type, InterfaceC8689l<?>> map = this.f16451a;
        InterfaceC8689l<?> interfaceC8689l = map.get(type);
        if (interfaceC8689l != null) {
            return new C8659a(interfaceC8689l, type);
        }
        InterfaceC8689l<?> interfaceC8689l2 = map.get(rawType);
        if (interfaceC8689l2 != null) {
            return new C8660b(interfaceC8689l2, type);
        }
        InterfaceC8676o<T> interfaceC8676o = null;
        try {
            Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16452b.mo3240a(declaredConstructor);
            }
            c8661g = new C8661g(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            c8661g = null;
        }
        if (c8661g != null) {
            return c8661g;
        }
        if (Collection.class.isAssignableFrom(rawType)) {
            if (SortedSet.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C6436d();
            } else if (EnumSet.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C8662h(type);
            } else if (Set.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C1220m1();
            } else if (Queue.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C8663i();
            } else {
                interfaceC8676o = new C7321e();
            }
        } else if (Map.class.isAssignableFrom(rawType)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C8664j();
            } else if (ConcurrentMap.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C8597b();
            } else if (SortedMap.class.isAssignableFrom(rawType)) {
                interfaceC8676o = new C8655c();
            } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(C8696a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) {
                interfaceC8676o = new C8656d();
            } else {
                interfaceC8676o = new C1553a();
            }
        }
        if (interfaceC8676o != null) {
            return interfaceC8676o;
        }
        return new C8657e(rawType, type);
    }

    public final String toString() {
        return this.f16451a.toString();
    }
}
