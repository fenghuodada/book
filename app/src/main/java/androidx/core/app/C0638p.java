package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* renamed from: androidx.core.app.p */
/* loaded from: classes.dex */
public final class C0638p {
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public final Context f2302a;

    /* renamed from: e */
    public CharSequence f2306e;

    /* renamed from: f */
    public CharSequence f2307f;

    /* renamed from: g */
    public PendingIntent f2308g;

    /* renamed from: h */
    public int f2309h;

    /* renamed from: j */
    public AbstractC0639q f2311j;

    /* renamed from: l */
    public Bundle f2313l;

    /* renamed from: m */
    public String f2314m;

    /* renamed from: n */
    public final boolean f2315n;

    /* renamed from: o */
    public final Notification f2316o;
    @Deprecated

    /* renamed from: p */
    public final ArrayList<String> f2317p;
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b */
    public final ArrayList<NotificationCompat$Action> f2303b = new ArrayList<>();
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})

    /* renamed from: c */
    public final ArrayList<C0624j0> f2304c = new ArrayList<>();

    /* renamed from: d */
    public final ArrayList<NotificationCompat$Action> f2305d = new ArrayList<>();

    /* renamed from: i */
    public boolean f2310i = true;

    /* renamed from: k */
    public boolean f2312k = false;

    public C0638p(@NonNull Context context, @NonNull String str) {
        Notification notification = new Notification();
        this.f2316o = notification;
        this.f2302a = context;
        this.f2314m = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f2309h = 0;
        this.f2317p = new ArrayList<>();
        this.f2315n = true;
    }

    @Nullable
    /* renamed from: b */
    public static CharSequence m12059b(@Nullable CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    @NonNull
    /* renamed from: a */
    public final Notification m12060a() {
        Bundle bundle;
        C0646x c0646x = new C0646x(this);
        C0638p c0638p = c0646x.f2320b;
        AbstractC0639q abstractC0639q = c0638p.f2311j;
        if (abstractC0639q != null) {
            abstractC0639q.mo12055b(c0646x);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = c0646x.f2319a;
        if (i < 26 && i < 24) {
            builder.setExtras(c0646x.f2321c);
        }
        Notification build = builder.build();
        if (abstractC0639q != null) {
            c0638p.f2311j.getClass();
        }
        if (abstractC0639q != null && (bundle = build.extras) != null) {
            abstractC0639q.mo12056a(bundle);
        }
        return build;
    }

    /* renamed from: c */
    public final void m12058c(int i) {
        Notification notification = this.f2316o;
        notification.flags = i | notification.flags;
    }

    @NonNull
    /* renamed from: d */
    public final void m12057d(@Nullable C0637o c0637o) {
        if (this.f2311j != c0637o) {
            this.f2311j = c0637o;
            if (c0637o.f2318a != this) {
                c0637o.f2318a = this;
                m12057d(c0637o);
            }
        }
    }
}
