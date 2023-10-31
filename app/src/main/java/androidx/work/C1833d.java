package androidx.work;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;

/* renamed from: androidx.work.d */
/* loaded from: classes.dex */
public final class C1833d {

    /* renamed from: i */
    public static final C1833d f4443i = new C1833d(new C1834a());
    @ColumnInfo(name = "required_network_type")

    /* renamed from: a */
    public EnumC2007m f4444a;
    @ColumnInfo(name = "requires_charging")

    /* renamed from: b */
    public boolean f4445b;
    @ColumnInfo(name = "requires_device_idle")

    /* renamed from: c */
    public boolean f4446c;
    @ColumnInfo(name = "requires_battery_not_low")

    /* renamed from: d */
    public boolean f4447d;
    @ColumnInfo(name = "requires_storage_not_low")

    /* renamed from: e */
    public boolean f4448e;
    @ColumnInfo(name = "trigger_content_update_delay")

    /* renamed from: f */
    public long f4449f;
    @ColumnInfo(name = "trigger_max_content_delay")

    /* renamed from: g */
    public long f4450g;
    @ColumnInfo(name = "content_uri_triggers")

    /* renamed from: h */
    public C1835e f4451h;

    /* renamed from: androidx.work.d$a */
    /* loaded from: classes.dex */
    public static final class C1834a {

        /* renamed from: a */
        public EnumC2007m f4452a = EnumC2007m.NOT_REQUIRED;

        /* renamed from: b */
        public final C1835e f4453b = new C1835e();
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public C1833d() {
        this.f4444a = EnumC2007m.NOT_REQUIRED;
        this.f4449f = -1L;
        this.f4450g = -1L;
        this.f4451h = new C1835e();
    }

    public C1833d(C1834a c1834a) {
        this.f4444a = EnumC2007m.NOT_REQUIRED;
        this.f4449f = -1L;
        this.f4450g = -1L;
        this.f4451h = new C1835e();
        this.f4445b = false;
        int i = Build.VERSION.SDK_INT;
        this.f4446c = false;
        this.f4444a = c1834a.f4452a;
        this.f4447d = false;
        this.f4448e = false;
        if (i >= 24) {
            this.f4451h = c1834a.f4453b;
            this.f4449f = -1L;
            this.f4450g = -1L;
        }
    }

    public C1833d(@NonNull C1833d c1833d) {
        this.f4444a = EnumC2007m.NOT_REQUIRED;
        this.f4449f = -1L;
        this.f4450g = -1L;
        this.f4451h = new C1835e();
        this.f4445b = c1833d.f4445b;
        this.f4446c = c1833d.f4446c;
        this.f4444a = c1833d.f4444a;
        this.f4447d = c1833d.f4447d;
        this.f4448e = c1833d.f4448e;
        this.f4451h = c1833d.f4451h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1833d.class != obj.getClass()) {
            return false;
        }
        C1833d c1833d = (C1833d) obj;
        if (this.f4445b == c1833d.f4445b && this.f4446c == c1833d.f4446c && this.f4447d == c1833d.f4447d && this.f4448e == c1833d.f4448e && this.f4449f == c1833d.f4449f && this.f4450g == c1833d.f4450g && this.f4444a == c1833d.f4444a) {
            return this.f4451h.equals(c1833d.f4451h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4449f;
        long j2 = this.f4450g;
        return this.f4451h.hashCode() + (((((((((((((this.f4444a.hashCode() * 31) + (this.f4445b ? 1 : 0)) * 31) + (this.f4446c ? 1 : 0)) * 31) + (this.f4447d ? 1 : 0)) * 31) + (this.f4448e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
