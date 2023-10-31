package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.C10941b;

/* renamed from: kotlinx.coroutines.internal.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11035g {
    /* renamed from: a */
    public static /* synthetic */ Iterator m265a() {
        try {
            return Arrays.asList(new C10941b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
