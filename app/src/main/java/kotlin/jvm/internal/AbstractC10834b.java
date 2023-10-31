package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.jvm.C10808b;
import kotlin.reflect.EnumC10897l;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10886d;
import kotlin.reflect.InterfaceC10896k;

/* renamed from: kotlin.jvm.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10834b implements InterfaceC10884b, Serializable {
    @SinceKotlin(version = "1.1")
    public static final Object NO_RECEIVER = C10835a.f21401a;
    @SinceKotlin(version = "1.4")
    private final boolean isTopLevel;
    @SinceKotlin(version = "1.4")
    private final String name;
    @SinceKotlin(version = "1.4")
    private final Class owner;
    @SinceKotlin(version = "1.1")
    protected final Object receiver;
    private transient InterfaceC10884b reflected;
    @SinceKotlin(version = "1.4")
    private final String signature;

    @SinceKotlin(version = "1.2")
    /* renamed from: kotlin.jvm.internal.b$a */
    /* loaded from: classes3.dex */
    public static class C10835a implements Serializable {

        /* renamed from: a */
        public static final C10835a f21401a = new C10835a();
    }

    public AbstractC10834b() {
        this(NO_RECEIVER);
    }

    @SinceKotlin(version = "1.1")
    public AbstractC10834b(Object obj) {
        this(obj, null, null, null, false);
    }

    @SinceKotlin(version = "1.4")
    public AbstractC10834b(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // kotlin.reflect.InterfaceC10884b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.InterfaceC10884b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @SinceKotlin(version = "1.1")
    public InterfaceC10884b compute() {
        InterfaceC10884b interfaceC10884b = this.reflected;
        if (interfaceC10884b == null) {
            InterfaceC10884b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return interfaceC10884b;
    }

    public abstract InterfaceC10884b computeReflected();

    @Override // kotlin.reflect.InterfaceC10883a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @SinceKotlin(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC10886d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            C10860y.f21411a.getClass();
            return new C10850o(cls);
        }
        return C10860y.m422a(cls);
    }

    @Override // kotlin.reflect.InterfaceC10884b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    @SinceKotlin(version = "1.1")
    public InterfaceC10884b getReflected() {
        InterfaceC10884b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C10808b();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    public InterfaceC10896k getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public EnumC10897l getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.InterfaceC10884b
    @SinceKotlin(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
