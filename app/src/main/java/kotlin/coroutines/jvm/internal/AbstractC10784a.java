package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.C10788e;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.jvm.internal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10784a implements InterfaceC10772d<Object>, InterfaceC10787d, Serializable {
    @Nullable
    private final InterfaceC10772d<Object> completion;

    public AbstractC10784a(@Nullable InterfaceC10772d<Object> interfaceC10772d) {
        this.completion = interfaceC10772d;
    }

    @NotNull
    public InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> completion) {
        C10843j.m430f(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public InterfaceC10772d<C10868p> create(@NotNull InterfaceC10772d<?> completion) {
        C10843j.m430f(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC10787d
    @Nullable
    public InterfaceC10787d getCallerFrame() {
        InterfaceC10772d<Object> interfaceC10772d = this.completion;
        if (interfaceC10772d instanceof InterfaceC10787d) {
            return (InterfaceC10787d) interfaceC10772d;
        }
        return null;
    }

    @Nullable
    public final InterfaceC10772d<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i2;
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str2 = null;
        if (debugMetadata == null) {
            return null;
        }
        int m447v = debugMetadata.m447v();
        if (m447v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = debugMetadata.m451l()[i];
            }
            C10788e.C10789a c10789a = C10788e.f21382b;
            C10788e.C10789a c10789a2 = C10788e.f21381a;
            if (c10789a == null) {
                try {
                    C10788e.C10789a c10789a3 = new C10788e.C10789a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C10788e.f21382b = c10789a3;
                    c10789a = c10789a3;
                } catch (Exception unused2) {
                    C10788e.f21382b = c10789a2;
                    c10789a = c10789a2;
                }
            }
            if (c10789a != c10789a2) {
                Method method = c10789a.f21383a;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = c10789a.f21384b;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = c10789a.f21385c;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = debugMetadata.m454c();
            } else {
                str = str2 + '/' + debugMetadata.m454c();
            }
            return new StackTraceElement(str, debugMetadata.m450m(), debugMetadata.m453f(), i3);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + m447v + ". Please update the Kotlin standard library.").toString());
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.InterfaceC10772d
    public final void resumeWith(@NotNull Object obj) {
        InterfaceC10772d interfaceC10772d = this;
        while (true) {
            AbstractC10784a abstractC10784a = (AbstractC10784a) interfaceC10772d;
            InterfaceC10772d interfaceC10772d2 = abstractC10784a.completion;
            C10843j.m433c(interfaceC10772d2);
            try {
                obj = abstractC10784a.invokeSuspend(obj);
                if (obj == EnumC10782a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = C10864l.m419a(th);
            }
            abstractC10784a.releaseIntercepted();
            if (!(interfaceC10772d2 instanceof AbstractC10784a)) {
                interfaceC10772d2.resumeWith(obj);
                return;
            }
            interfaceC10772d = interfaceC10772d2;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
