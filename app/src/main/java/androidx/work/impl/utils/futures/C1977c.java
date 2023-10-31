package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.futures.AbstractC1966a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.futures.c */
/* loaded from: classes.dex */
public final class C1977c<V> extends AbstractC1966a<V> {
    /* renamed from: h */
    public final boolean m9750h(@Nullable V v) {
        if (v == null) {
            v = (V) AbstractC1966a.f4775g;
        }
        if (AbstractC1966a.f4774f.mo9754b(this, null, v)) {
            AbstractC1966a.m9761b(this);
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m9749i(Throwable th) {
        th.getClass();
        if (AbstractC1966a.f4774f.mo9754b(this, null, new AbstractC1966a.C1969c(th))) {
            AbstractC1966a.m9761b(this);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m9748j(InterfaceFutureC8037a<? extends V> interfaceFutureC8037a) {
        AbstractC1966a.C1969c c1969c;
        interfaceFutureC8037a.getClass();
        Object obj = this.f4776a;
        if (obj == null) {
            if (interfaceFutureC8037a.isDone()) {
                if (!AbstractC1966a.f4774f.mo9754b(this, null, AbstractC1966a.m9758e(interfaceFutureC8037a))) {
                    return false;
                }
                AbstractC1966a.m9761b(this);
            } else {
                AbstractC1966a.RunnableC1973f runnableC1973f = new AbstractC1966a.RunnableC1973f(this, interfaceFutureC8037a);
                if (AbstractC1966a.f4774f.mo9754b(this, null, runnableC1973f)) {
                    try {
                        interfaceFutureC8037a.addListener(runnableC1973f, EnumC1976b.f4799a);
                    } catch (Throwable th) {
                        try {
                            c1969c = new AbstractC1966a.C1969c(th);
                        } catch (Throwable unused) {
                            c1969c = AbstractC1966a.C1969c.f4783b;
                        }
                        AbstractC1966a.f4774f.mo9754b(this, runnableC1973f, c1969c);
                    }
                } else {
                    obj = this.f4776a;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractC1966a.C1968b)) {
            return false;
        }
        interfaceFutureC8037a.cancel(((AbstractC1966a.C1968b) obj).f4781a);
        return false;
    }
}
