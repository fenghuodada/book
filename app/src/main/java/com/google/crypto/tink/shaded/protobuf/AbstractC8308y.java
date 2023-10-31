package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8194a;
import com.google.crypto.tink.shaded.protobuf.AbstractC8244j;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8308y.AbstractC8309a;
import com.google.crypto.tink.shaded.protobuf.C8213e;
import com.google.crypto.tink.shaded.protobuf.C8299u;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y */
/* loaded from: classes3.dex */
public abstract class AbstractC8308y<MessageType extends AbstractC8308y<MessageType, BuilderType>, BuilderType extends AbstractC8309a<MessageType, BuilderType>> extends AbstractC8194a<MessageType, BuilderType> {
    private static Map<Object, AbstractC8308y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C8260m1 unknownFields = C8260m1.f16049f;
    protected int memoizedSerializedSize = -1;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8309a<MessageType extends AbstractC8308y<MessageType, BuilderType>, BuilderType extends AbstractC8309a<MessageType, BuilderType>> extends AbstractC8194a.AbstractC8195a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f16129a;

        /* renamed from: b */
        public MessageType f16130b;

        /* renamed from: c */
        public boolean f16131c = false;

        public AbstractC8309a(MessageType messagetype) {
            this.f16129a = messagetype;
            this.f16130b = (MessageType) messagetype.mo3471l(EnumC8314f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: l */
        public static void m3460l(AbstractC8308y abstractC8308y, AbstractC8308y abstractC8308y2) {
            C8204b1 c8204b1 = C8204b1.f15952c;
            c8204b1.getClass();
            c8204b1.m3924a(abstractC8308y.getClass()).mo3494a(abstractC8308y, abstractC8308y2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0
        /* renamed from: a */
        public final AbstractC8308y mo3464a() {
            return this.f16129a;
        }

        public final Object clone() throws CloneNotSupportedException {
            AbstractC8309a abstractC8309a = (AbstractC8309a) this.f16129a.mo3471l(EnumC8314f.NEW_BUILDER);
            MessageType m3462j = m3462j();
            abstractC8309a.m3461k();
            m3460l(abstractC8309a.f16130b, m3462j);
            return abstractC8309a;
        }

        /* renamed from: i */
        public final MessageType m3463i() {
            MessageType m3462j = m3462j();
            if (m3462j.isInitialized()) {
                return m3462j;
            }
            throw new C8252k1();
        }

        /* renamed from: j */
        public final MessageType m3462j() {
            if (this.f16131c) {
                return this.f16130b;
            }
            MessageType messagetype = this.f16130b;
            messagetype.getClass();
            C8204b1 c8204b1 = C8204b1.f15952c;
            c8204b1.getClass();
            c8204b1.m3924a(messagetype.getClass()).mo3493b(messagetype);
            this.f16131c = true;
            return this.f16130b;
        }

        /* renamed from: k */
        public final void m3461k() {
            if (this.f16131c) {
                MessageType messagetype = (MessageType) this.f16130b.mo3471l(EnumC8314f.NEW_MUTABLE_INSTANCE);
                m3460l(messagetype, this.f16130b);
                this.f16130b = messagetype;
                this.f16131c = false;
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$b */
    /* loaded from: classes3.dex */
    public static class C8310b<T extends AbstractC8308y<T, ?>> extends AbstractC8201b<T> {
        public C8310b(T t) {
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8311c<MessageType extends AbstractC8311c<MessageType, BuilderType>, BuilderType> extends AbstractC8308y<MessageType, BuilderType> implements InterfaceC8295s0 {
        protected C8299u<C8312d> extensions = C8299u.f16094d;
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$d */
    /* loaded from: classes3.dex */
    public static final class C8312d implements C8299u.InterfaceC8300a<C8312d> {
        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        /* renamed from: B */
        public final void mo3459B() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        /* renamed from: C */
        public final void mo3458C() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        /* renamed from: D */
        public final EnumC8296s1 mo3457D() {
            throw null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        /* renamed from: E */
        public final void mo3456E() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((C8312d) obj).getClass();
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        /* renamed from: e */
        public final AbstractC8309a mo3455e(InterfaceC8287r0.InterfaceC8288a interfaceC8288a, InterfaceC8287r0 interfaceC8287r0) {
            AbstractC8309a abstractC8309a = (AbstractC8309a) interfaceC8288a;
            abstractC8309a.m3461k();
            AbstractC8309a.m3460l(abstractC8309a.f16130b, (AbstractC8308y) interfaceC8287r0);
            return abstractC8309a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8299u.InterfaceC8300a
        public final void getNumber() {
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$e */
    /* loaded from: classes3.dex */
    public static class C8313e<ContainingType extends InterfaceC8287r0, Type> extends AbstractC8264o<ContainingType, Type> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$f */
    /* loaded from: classes3.dex */
    public enum EnumC8314f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        /* JADX INFO: Fake field, exist only in values array */
        GET_PARSER
    }

    /* renamed from: m */
    public static <T extends AbstractC8308y<?, ?>> T m3470m(Class<T> cls) {
        AbstractC8308y<?, ?> abstractC8308y = defaultInstanceMap.get(cls);
        if (abstractC8308y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC8308y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC8308y == null) {
            abstractC8308y = (T) ((AbstractC8308y) C8271p1.m3611a(cls)).mo3471l(EnumC8314f.GET_DEFAULT_INSTANCE);
            if (abstractC8308y != null) {
                defaultInstanceMap.put(cls, abstractC8308y);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) abstractC8308y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static Object m3469n(Method method, Object obj, Object... objArr) {
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

    /* renamed from: o */
    public static <T extends AbstractC8308y<T, ?>> T m3468o(T t, AbstractC8228i abstractC8228i, C8277q c8277q) throws C8202b0 {
        try {
            AbstractC8244j.C8245a mo3815n = abstractC8228i.mo3815n();
            T t2 = (T) m3466q(t, mo3815n, c8277q);
            try {
                mo3815n.mo3788a(0);
                if (t2.isInitialized()) {
                    return t2;
                }
                throw new C8202b0(new C8252k1().getMessage());
            } catch (C8202b0 e) {
                throw e;
            }
        } catch (C8202b0 e2) {
            throw e2;
        }
    }

    /* renamed from: p */
    public static <T extends AbstractC8308y<T, ?>> T m3467p(T t, byte[] bArr, C8277q c8277q) throws C8202b0 {
        int length = bArr.length;
        T t2 = (T) t.mo3471l(EnumC8314f.NEW_MUTABLE_INSTANCE);
        try {
            C8204b1 c8204b1 = C8204b1.f15952c;
            c8204b1.getClass();
            InterfaceC8219f1 m3924a = c8204b1.m3924a(t2.getClass());
            m3924a.mo3486i(t2, bArr, 0, length + 0, new C8213e.C8214a(c8277q));
            m3924a.mo3493b(t2);
            if (t2.memoizedHashCode == 0) {
                if (t2.isInitialized()) {
                    return t2;
                }
                throw new C8202b0(new C8252k1().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C8202b0) {
                throw ((C8202b0) e.getCause());
            }
            throw new C8202b0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C8202b0.m3925f();
        }
    }

    /* renamed from: q */
    public static <T extends AbstractC8308y<T, ?>> T m3466q(T t, AbstractC8244j abstractC8244j, C8277q c8277q) throws C8202b0 {
        T t2 = (T) t.mo3471l(EnumC8314f.NEW_MUTABLE_INSTANCE);
        try {
            C8204b1 c8204b1 = C8204b1.f15952c;
            c8204b1.getClass();
            InterfaceC8219f1 m3924a = c8204b1.m3924a(t2.getClass());
            C8250k c8250k = abstractC8244j.f16025c;
            if (c8250k == null) {
                c8250k = new C8250k(abstractC8244j);
            }
            m3924a.mo3485j(t2, c8250k, c8277q);
            m3924a.mo3493b(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C8202b0) {
                throw ((C8202b0) e.getCause());
            }
            throw new C8202b0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C8202b0) {
                throw ((C8202b0) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: r */
    public static <T extends AbstractC8308y<?, ?>> void m3465r(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0
    /* renamed from: a */
    public final AbstractC8308y mo3464a() {
        return (AbstractC8308y) mo3471l(EnumC8314f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: c */
    public final int mo3478c() {
        if (this.memoizedSerializedSize == -1) {
            C8204b1 c8204b1 = C8204b1.f15952c;
            c8204b1.getClass();
            this.memoizedSerializedSize = c8204b1.m3924a(getClass()).mo3490e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: d */
    public final void mo3477d(AbstractC8253l abstractC8253l) throws IOException {
        C8204b1 c8204b1 = C8204b1.f15952c;
        c8204b1.getClass();
        InterfaceC8219f1 m3924a = c8204b1.m3924a(getClass());
        C8258m c8258m = abstractC8253l.f16042a;
        if (c8258m == null) {
            c8258m = new C8258m(abstractC8253l);
        }
        m3924a.mo3487h(this, c8258m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8194a
    /* renamed from: e */
    final int mo3476e() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC8308y) mo3471l(EnumC8314f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        C8204b1 c8204b1 = C8204b1.f15952c;
        c8204b1.getClass();
        return c8204b1.m3924a(getClass()).mo3491d(this, (AbstractC8308y) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: f */
    public final AbstractC8309a mo3475f() {
        AbstractC8309a abstractC8309a = (AbstractC8309a) mo3471l(EnumC8314f.NEW_BUILDER);
        abstractC8309a.m3461k();
        AbstractC8309a.m3460l(abstractC8309a.f16130b, this);
        return abstractC8309a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0
    /* renamed from: h */
    public final AbstractC8309a mo3474h() {
        return (AbstractC8309a) mo3471l(EnumC8314f.NEW_BUILDER);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C8204b1 c8204b1 = C8204b1.f15952c;
        c8204b1.getClass();
        int mo3488g = c8204b1.m3924a(getClass()).mo3488g(this);
        this.memoizedHashCode = mo3488g;
        return mo3488g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8295s0
    public final boolean isInitialized() {
        byte byteValue = ((Byte) mo3471l(EnumC8314f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C8204b1 c8204b1 = C8204b1.f15952c;
        c8204b1.getClass();
        boolean mo3492c = c8204b1.m3924a(getClass()).mo3492c(this);
        mo3471l(EnumC8314f.SET_MEMOIZED_IS_INITIALIZED);
        return mo3492c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8194a
    /* renamed from: j */
    final void mo3473j(int i) {
        this.memoizedSerializedSize = i;
    }

    /* renamed from: k */
    public final <MessageType extends AbstractC8308y<MessageType, BuilderType>, BuilderType extends AbstractC8309a<MessageType, BuilderType>> BuilderType m3472k() {
        return (BuilderType) mo3471l(EnumC8314f.NEW_BUILDER);
    }

    /* renamed from: l */
    public abstract Object mo3471l(EnumC8314f enumC8314f);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C8298t0.m3543c(this, sb, 0);
        return sb.toString();
    }
}
