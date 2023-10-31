package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class NotificationCompat$Action {

    /* renamed from: a */
    public final Bundle f2243a;
    @Nullable

    /* renamed from: b */
    public IconCompat f2244b;

    /* renamed from: c */
    public final RemoteInput[] f2245c;

    /* renamed from: d */
    public final boolean f2246d;

    /* renamed from: e */
    public final boolean f2247e;

    /* renamed from: f */
    public final int f2248f;

    /* renamed from: g */
    public final boolean f2249g;
    @Deprecated

    /* renamed from: h */
    public final int f2250h;

    /* renamed from: i */
    public final CharSequence f2251i;

    /* renamed from: j */
    public final PendingIntent f2252j;

    /* renamed from: k */
    public final boolean f2253k;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SemanticAction {
    }

    public NotificationCompat$Action(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        IconCompat m11955b;
        if (i == 0) {
            m11955b = null;
        } else {
            m11955b = IconCompat.m11955b("", i);
        }
        Bundle bundle = new Bundle();
        this.f2247e = true;
        this.f2244b = m11955b;
        if (m11955b != null) {
            int i2 = m11955b.f2392a;
            if ((i2 == -1 ? IconCompat.C0696a.m11950c(m11955b.f2393b) : i2) == 2) {
                this.f2250h = m11955b.m11954c();
            }
        }
        this.f2251i = C0638p.m12059b(str);
        this.f2252j = pendingIntent;
        this.f2243a = bundle;
        this.f2245c = null;
        this.f2246d = true;
        this.f2248f = 0;
        this.f2247e = true;
        this.f2249g = false;
        this.f2253k = false;
    }
}
