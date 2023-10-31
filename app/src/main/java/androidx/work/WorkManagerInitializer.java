package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.InterfaceC1716b;
import androidx.work.C1830c;
import androidx.work.impl.C1915l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC1716b<AbstractC2019t> {

    /* renamed from: a */
    public static final String f4418a = AbstractC2005l.m9732e("WrkMgrInitializer");

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    /* renamed from: a */
    public final AbstractC2019t mo9910a(@NonNull Context context) {
        AbstractC2005l.m9733c().mo9731a(f4418a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        C1915l.m9815d(context, new C1830c(new C1830c.C1831a()));
        return C1915l.m9816c(context);
    }

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    public final List<Class<? extends InterfaceC1716b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
