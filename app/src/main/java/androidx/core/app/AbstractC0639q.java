package androidx.core.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.app.q */
/* loaded from: classes.dex */
public abstract class AbstractC0639q {
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public C0638p f2318a;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo12056a(@NonNull Bundle bundle) {
        String mo12054c = mo12054c();
        if (mo12054c != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo12054c);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public abstract void mo12055b(C0646x c0646x);

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public abstract String mo12054c();
}
