package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1152a;
import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.AbstractC1273z.AbstractC1274a;
import androidx.datastore.preferences.protobuf.C1263v;
import androidx.datastore.preferences.protobuf.InterfaceC1240s0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
public abstract class AbstractC1273z<MessageType extends AbstractC1273z<MessageType, BuilderType>, BuilderType extends AbstractC1274a<MessageType, BuilderType>> extends AbstractC1152a<MessageType, BuilderType> {
    private static Map<Object, AbstractC1273z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C1229p1 unknownFields = C1229p1.f3062f;
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1274a<MessageType extends AbstractC1273z<MessageType, BuilderType>, BuilderType extends AbstractC1274a<MessageType, BuilderType>> extends AbstractC1152a.AbstractC1153a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f3141a;

        /* renamed from: b */
        public MessageType f3142b;

        /* renamed from: c */
        public boolean f3143c = false;

        public AbstractC1274a(MessageType messagetype) {
            this.f3141a = messagetype;
            this.f3142b = (MessageType) messagetype.mo10711j(EnumC1279f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: l */
        public static void m10702l(AbstractC1273z abstractC1273z, AbstractC1273z abstractC1273z2) {
            C1168d1 c1168d1 = C1168d1.f2962c;
            c1168d1.getClass();
            c1168d1.m11132a(abstractC1273z.getClass()).mo10731a(abstractC1273z, abstractC1273z2);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC1249t0
        /* renamed from: a */
        public final AbstractC1273z mo10701a() {
            return this.f3141a;
        }

        public final Object clone() throws CloneNotSupportedException {
            AbstractC1274a abstractC1274a = (AbstractC1274a) this.f3141a.mo10711j(EnumC1279f.NEW_BUILDER);
            abstractC1274a.m10703k(m10705i());
            return abstractC1274a;
        }

        /* renamed from: h */
        public final MessageType m10706h() {
            MessageType m10705i = m10705i();
            if (m10705i.isInitialized()) {
                return m10705i;
            }
            throw new C1223n1();
        }

        /* renamed from: i */
        public final MessageType m10705i() {
            if (this.f3143c) {
                return this.f3142b;
            }
            MessageType messagetype = this.f3142b;
            messagetype.getClass();
            C1168d1 c1168d1 = C1168d1.f2962c;
            c1168d1.getClass();
            c1168d1.m11132a(messagetype.getClass()).mo10730b(messagetype);
            this.f3143c = true;
            return this.f3142b;
        }

        /* renamed from: j */
        public final void m10704j() {
            if (this.f3143c) {
                MessageType messagetype = (MessageType) this.f3142b.mo10711j(EnumC1279f.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f3142b;
                C1168d1 c1168d1 = C1168d1.f2962c;
                c1168d1.getClass();
                c1168d1.m11132a(messagetype.getClass()).mo10731a(messagetype, messagetype2);
                this.f3142b = messagetype;
                this.f3143c = false;
            }
        }

        /* renamed from: k */
        public final BuilderType m10703k(MessageType messagetype) {
            m10704j();
            m10702l(this.f3142b, messagetype);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$b */
    /* loaded from: classes.dex */
    public static class C1275b<T extends AbstractC1273z<T, ?>> extends AbstractC1156b<T> {
        public C1275b(T t) {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1276c<MessageType extends AbstractC1276c<MessageType, BuilderType>, BuilderType> extends AbstractC1273z<MessageType, BuilderType> implements InterfaceC1249t0 {
        protected C1263v<C1277d> extensions = C1263v.f3095d;

        @Override // androidx.datastore.preferences.protobuf.AbstractC1273z, androidx.datastore.preferences.protobuf.InterfaceC1249t0
        /* renamed from: a */
        public final AbstractC1273z mo10701a() {
            return (AbstractC1273z) mo10711j(EnumC1279f.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1273z, androidx.datastore.preferences.protobuf.InterfaceC1240s0
        /* renamed from: d */
        public final AbstractC1274a mo10700d() {
            AbstractC1274a abstractC1274a = (AbstractC1274a) mo10711j(EnumC1279f.NEW_BUILDER);
            abstractC1274a.m10703k(this);
            return abstractC1274a;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1273z, androidx.datastore.preferences.protobuf.InterfaceC1240s0
        /* renamed from: g */
        public final AbstractC1274a mo10699g() {
            return (AbstractC1274a) mo10711j(EnumC1279f.NEW_BUILDER);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$d */
    /* loaded from: classes.dex */
    public static final class C1277d implements C1263v.InterfaceC1264a<C1277d> {
        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        /* renamed from: B */
        public final void mo10698B() {
        }

        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        /* renamed from: C */
        public final void mo10697C() {
        }

        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        /* renamed from: D */
        public final EnumC1266v1 mo10696D() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        /* renamed from: E */
        public final void mo10695E() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        /* renamed from: H */
        public final AbstractC1274a mo10694H(InterfaceC1240s0.InterfaceC1241a interfaceC1241a, InterfaceC1240s0 interfaceC1240s0) {
            AbstractC1274a abstractC1274a = (AbstractC1274a) interfaceC1241a;
            abstractC1274a.m10703k((AbstractC1273z) interfaceC1240s0);
            return abstractC1274a;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((C1277d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C1263v.InterfaceC1264a
        public final void getNumber() {
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$e */
    /* loaded from: classes.dex */
    public static class C1278e<ContainingType extends InterfaceC1240s0, Type> extends AbstractC1227p<ContainingType, Type> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.z$f */
    /* loaded from: classes.dex */
    public enum EnumC1279f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        /* JADX INFO: Fake field, exist only in values array */
        GET_PARSER
    }

    /* renamed from: k */
    public static <T extends AbstractC1273z<?, ?>> T m10710k(Class<T> cls) {
        AbstractC1273z<?, ?> abstractC1273z = defaultInstanceMap.get(cls);
        if (abstractC1273z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1273z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1273z == null) {
            abstractC1273z = (T) ((AbstractC1273z) C1242s1.m10836a(cls)).mo10711j(EnumC1279f.GET_DEFAULT_INSTANCE);
            if (abstractC1273z != null) {
                defaultInstanceMap.put(cls, abstractC1273z);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC1273z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Object m10709l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: m */
    public static <T extends AbstractC1273z<T, ?>> T m10708m(T t, AbstractC1197k abstractC1197k, C1233r c1233r) throws C1163c0 {
        T t2 = (T) t.mo10711j(EnumC1279f.NEW_MUTABLE_INSTANCE);
        try {
            C1168d1 c1168d1 = C1168d1.f2962c;
            c1168d1.getClass();
            InterfaceC1182h1 m11132a = c1168d1.m11132a(t2.getClass());
            C1210l c1210l = abstractC1197k.f2998d;
            if (c1210l == null) {
                c1210l = new C1210l(abstractC1197k);
            }
            m11132a.mo10724h(t2, c1210l, c1233r);
            m11132a.mo10730b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C1163c0) {
                throw ((C1163c0) e.getCause());
            }
            throw new C1163c0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C1163c0) {
                throw ((C1163c0) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: n */
    public static <T extends AbstractC1273z<?, ?>> void m10707n(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1249t0
    /* renamed from: a */
    public AbstractC1273z mo10701a() {
        return (AbstractC1273z) mo10711j(EnumC1279f.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240s0
    /* renamed from: c */
    public final int mo10715c() {
        if (this.memoizedSerializedSize == -1) {
            C1168d1 c1168d1 = C1168d1.f2962c;
            c1168d1.getClass();
            this.memoizedSerializedSize = c1168d1.m11132a(getClass()).mo10727e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240s0
    /* renamed from: d */
    public AbstractC1274a mo10700d() {
        AbstractC1274a abstractC1274a = (AbstractC1274a) mo10711j(EnumC1279f.NEW_BUILDER);
        abstractC1274a.m10703k(this);
        return abstractC1274a;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152a
    /* renamed from: e */
    final int mo10714e() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC1273z) mo10711j(EnumC1279f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        C1168d1 c1168d1 = C1168d1.f2962c;
        c1168d1.getClass();
        return c1168d1.m11132a(getClass()).mo10728d(this, (AbstractC1273z) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240s0
    /* renamed from: f */
    public final void mo10713f(AbstractC1214m abstractC1214m) throws IOException {
        C1168d1 c1168d1 = C1168d1.f2962c;
        c1168d1.getClass();
        InterfaceC1182h1 m11132a = c1168d1.m11132a(getClass());
        C1221n c1221n = abstractC1214m.f3047a;
        if (c1221n == null) {
            c1221n = new C1221n(abstractC1214m);
        }
        m11132a.mo10723i(this, c1221n);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1240s0
    /* renamed from: g */
    public AbstractC1274a mo10699g() {
        return (AbstractC1274a) mo10711j(EnumC1279f.NEW_BUILDER);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C1168d1 c1168d1 = C1168d1.f2962c;
        c1168d1.getClass();
        int mo10725g = c1168d1.m11132a(getClass()).mo10725g(this);
        this.memoizedHashCode = mo10725g;
        return mo10725g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152a
    /* renamed from: i */
    final void mo10712i(int i) {
        this.memoizedSerializedSize = i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1249t0
    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo10711j(EnumC1279f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C1168d1 c1168d1 = C1168d1.f2962c;
        c1168d1.getClass();
        boolean mo10729c = c1168d1.m11132a(getClass()).mo10729c(this);
        mo10711j(EnumC1279f.SET_MEMOIZED_IS_INITIALIZED);
        return mo10729c;
    }

    /* renamed from: j */
    public abstract Object mo10711j(EnumC1279f enumC1279f);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C1257u0.m10775c(this, sb, 0);
        return sb.toString();
    }
}
