package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* renamed from: androidx.core.app.o */
/* loaded from: classes.dex */
public final class C0637o extends AbstractC0639q {

    /* renamed from: b */
    public CharSequence f2301b;

    @Override // androidx.core.app.AbstractC0639q
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void mo12056a(@NonNull Bundle bundle) {
        super.mo12056a(bundle);
    }

    @Override // androidx.core.app.AbstractC0639q
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public final void mo12055b(C0646x c0646x) {
        new Notification.BigTextStyle(c0646x.f2319a).setBigContentTitle(null).bigText(this.f2301b);
    }

    @Override // androidx.core.app.AbstractC0639q
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: c */
    public final String mo12054c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
