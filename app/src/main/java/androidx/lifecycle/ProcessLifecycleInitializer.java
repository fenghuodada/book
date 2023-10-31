package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1476j;
import androidx.startup.C1715a;
import androidx.startup.InterfaceC1716b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10759o;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m508d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/b;", "Landroidx/lifecycle/m;", "<init>", "()V", "lifecycle-process_release"}, m507k = 1, m506mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC1716b<InterfaceC1483m> {
    @Override // androidx.startup.InterfaceC1716b
    /* renamed from: a */
    public final InterfaceC1483m mo9910a(Context context) {
        C10843j.m430f(context, "context");
        C1715a m10013c = C1715a.m10013c(context);
        C10843j.m431e(m10013c, "getInstance(context)");
        if (m10013c.f4175b.contains(ProcessLifecycleInitializer.class)) {
            if (!C1476j.f3449a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                C10843j.m432d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1476j.C1477a());
            }
            C1492u c1492u = C1492u.f3464i;
            c1492u.getClass();
            c1492u.f3469e = new Handler();
            c1492u.f3470f.m10534f(AbstractC1464h.EnumC1465a.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            C10843j.m432d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C1495v(c1492u));
            return c1492u;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }

    @Override // androidx.startup.InterfaceC1716b
    @NotNull
    public final List<Class<? extends InterfaceC1716b<?>>> dependencies() {
        return C10759o.f21363a;
    }
}
