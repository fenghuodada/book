package androidx.appcompat.app;

import android.content.Context;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: androidx.appcompat.app.d0 */
/* loaded from: classes.dex */
public final class C0104d0 {

    /* renamed from: d */
    public static C0104d0 f247d;

    /* renamed from: a */
    public final Context f248a;

    /* renamed from: b */
    public final LocationManager f249b;

    /* renamed from: c */
    public final C0105a f250c = new C0105a();

    /* renamed from: androidx.appcompat.app.d0$a */
    /* loaded from: classes.dex */
    public static class C0105a {

        /* renamed from: a */
        public boolean f251a;

        /* renamed from: b */
        public long f252b;
    }

    @VisibleForTesting
    public C0104d0(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f248a = context;
        this.f249b = locationManager;
    }
}
