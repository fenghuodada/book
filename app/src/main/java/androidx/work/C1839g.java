package androidx.work;

import android.app.Notification;
import androidx.annotation.NonNull;

/* renamed from: androidx.work.g */
/* loaded from: classes.dex */
public final class C1839g {

    /* renamed from: a */
    public final int f4461a;

    /* renamed from: b */
    public final int f4462b;

    /* renamed from: c */
    public final Notification f4463c;

    public C1839g(int i, int i2, @NonNull Notification notification) {
        this.f4461a = i;
        this.f4463c = notification;
        this.f4462b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1839g.class != obj.getClass()) {
            return false;
        }
        C1839g c1839g = (C1839g) obj;
        if (this.f4461a == c1839g.f4461a && this.f4462b == c1839g.f4462b) {
            return this.f4463c.equals(c1839g.f4463c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4463c.hashCode() + (((this.f4461a * 31) + this.f4462b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f4461a + ", mForegroundServiceType=" + this.f4462b + ", mNotification=" + this.f4463c + '}';
    }
}
