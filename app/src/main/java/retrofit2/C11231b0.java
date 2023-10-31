package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: retrofit2.b0 */
/* loaded from: classes3.dex */
public class C11231b0 {

    /* renamed from: c */
    public static final C11231b0 f21934c;

    /* renamed from: a */
    public final boolean f21935a;
    @Nullable

    /* renamed from: b */
    public final Constructor<MethodHandles.Lookup> f21936b;

    /* renamed from: retrofit2.b0$a */
    /* loaded from: classes3.dex */
    public static final class C11232a extends C11231b0 {

        /* renamed from: retrofit2.b0$a$a */
        /* loaded from: classes3.dex */
        public static final class ExecutorC11233a implements Executor {

            /* renamed from: a */
            public final Handler f21937a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f21937a.post(runnable);
            }
        }

        public C11232a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.C11231b0
        /* renamed from: a */
        public final Executor mo45a() {
            return new ExecutorC11233a();
        }

        @Override // retrofit2.C11231b0
        @Nullable
        /* renamed from: b */
        public final Object mo44b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo44b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        C11231b0 c11231b0;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            c11231b0 = new C11232a();
        } else {
            c11231b0 = new C11231b0(true);
        }
        f21934c = c11231b0;
    }

    public C11231b0(boolean z) {
        this.f21935a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f21936b = constructor;
    }

    @Nullable
    /* renamed from: a */
    public Executor mo45a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: b */
    public Object mo44b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor<MethodHandles.Lookup> constructor = this.f21936b;
        unreflectSpecial = (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }
}
