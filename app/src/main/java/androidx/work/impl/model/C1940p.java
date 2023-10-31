package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0406q1;
import androidx.concurrent.futures.C0484a;
import androidx.constraintlayout.core.C0511i;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.work.AbstractC2005l;
import androidx.work.C1833d;
import androidx.work.C1837f;
import androidx.work.EnumC2018s;
import com.google.ads.mediation.facebook.FacebookAdapter;

@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.model.p */
/* loaded from: classes.dex */
public final class C1940p {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = FacebookAdapter.KEY_ID)

    /* renamed from: a */
    public String f4690a;
    @NonNull
    @ColumnInfo(name = "state")

    /* renamed from: b */
    public EnumC2018s f4691b;
    @NonNull
    @ColumnInfo(name = "worker_class_name")

    /* renamed from: c */
    public String f4692c;
    @ColumnInfo(name = "input_merger_class_name")

    /* renamed from: d */
    public String f4693d;
    @NonNull
    @ColumnInfo(name = "input")

    /* renamed from: e */
    public C1837f f4694e;
    @NonNull
    @ColumnInfo(name = "output")

    /* renamed from: f */
    public C1837f f4695f;
    @ColumnInfo(name = "initial_delay")

    /* renamed from: g */
    public long f4696g;
    @ColumnInfo(name = "interval_duration")

    /* renamed from: h */
    public long f4697h;
    @ColumnInfo(name = "flex_duration")

    /* renamed from: i */
    public long f4698i;
    @NonNull
    @Embedded

    /* renamed from: j */
    public C1833d f4699j;
    @IntRange(from = 0)
    @ColumnInfo(name = "run_attempt_count")

    /* renamed from: k */
    public int f4700k;
    @NonNull
    @ColumnInfo(name = "backoff_policy")

    /* renamed from: l */
    public int f4701l;
    @ColumnInfo(name = "backoff_delay_duration")

    /* renamed from: m */
    public long f4702m;
    @ColumnInfo(name = "period_start_time")

    /* renamed from: n */
    public long f4703n;
    @ColumnInfo(name = "minimum_retention_duration")

    /* renamed from: o */
    public long f4704o;
    @ColumnInfo(name = "schedule_requested_at")

    /* renamed from: p */
    public long f4705p;
    @ColumnInfo(name = "run_in_foreground")

    /* renamed from: q */
    public boolean f4706q;
    @NonNull
    @ColumnInfo(name = "out_of_quota_policy")

    /* renamed from: r */
    public int f4707r;

    /* renamed from: androidx.work.impl.model.p$a */
    /* loaded from: classes.dex */
    public static class C1941a {
        @ColumnInfo(name = FacebookAdapter.KEY_ID)

        /* renamed from: a */
        public String f4708a;
        @ColumnInfo(name = "state")

        /* renamed from: b */
        public EnumC2018s f4709b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1941a) {
                C1941a c1941a = (C1941a) obj;
                if (this.f4709b != c1941a.f4709b) {
                    return false;
                }
                return this.f4708a.equals(c1941a.f4708a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f4709b.hashCode() + (this.f4708a.hashCode() * 31);
        }
    }

    static {
        AbstractC2005l.m9732e("WorkSpec");
    }

    public C1940p(@NonNull C1940p c1940p) {
        this.f4691b = EnumC2018s.ENQUEUED;
        C1837f c1837f = C1837f.f4458c;
        this.f4694e = c1837f;
        this.f4695f = c1837f;
        this.f4699j = C1833d.f4443i;
        this.f4701l = 1;
        this.f4702m = 30000L;
        this.f4705p = -1L;
        this.f4707r = 1;
        this.f4690a = c1940p.f4690a;
        this.f4692c = c1940p.f4692c;
        this.f4691b = c1940p.f4691b;
        this.f4693d = c1940p.f4693d;
        this.f4694e = new C1837f(c1940p.f4694e);
        this.f4695f = new C1837f(c1940p.f4695f);
        this.f4696g = c1940p.f4696g;
        this.f4697h = c1940p.f4697h;
        this.f4698i = c1940p.f4698i;
        this.f4699j = new C1833d(c1940p.f4699j);
        this.f4700k = c1940p.f4700k;
        this.f4701l = c1940p.f4701l;
        this.f4702m = c1940p.f4702m;
        this.f4703n = c1940p.f4703n;
        this.f4704o = c1940p.f4704o;
        this.f4705p = c1940p.f4705p;
        this.f4706q = c1940p.f4706q;
        this.f4707r = c1940p.f4707r;
    }

    public C1940p(@NonNull String str, @NonNull String str2) {
        this.f4691b = EnumC2018s.ENQUEUED;
        C1837f c1837f = C1837f.f4458c;
        this.f4694e = c1837f;
        this.f4695f = c1837f;
        this.f4699j = C1833d.f4443i;
        this.f4701l = 1;
        this.f4702m = 30000L;
        this.f4705p = -1L;
        this.f4707r = 1;
        this.f4690a = str;
        this.f4692c = str2;
    }

    /* renamed from: a */
    public final long m9804a() {
        boolean z;
        long j;
        long j2;
        long scalb;
        boolean z2 = true;
        boolean z3 = false;
        if (this.f4691b == EnumC2018s.ENQUEUED && this.f4700k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f4701l == 2) {
                z3 = true;
            }
            long j3 = this.f4702m;
            if (z3) {
                scalb = j3 * this.f4700k;
            } else {
                scalb = Math.scalb((float) j3, this.f4700k - 1);
            }
            j2 = this.f4703n;
            j = Math.min(18000000L, scalb);
        } else {
            long j4 = 0;
            if (m9802c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j5 = this.f4703n;
                int i = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
                if (i == 0) {
                    j5 = this.f4696g + currentTimeMillis;
                }
                long j6 = this.f4698i;
                long j7 = this.f4697h;
                if (j6 == j7) {
                    z2 = false;
                }
                if (z2) {
                    if (i == 0) {
                        j4 = j6 * (-1);
                    }
                    return j5 + j7 + j4;
                }
                if (i != 0) {
                    j4 = j7;
                }
                return j5 + j4;
            }
            j = this.f4703n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.f4696g;
        }
        return j + j2;
    }

    /* renamed from: b */
    public final boolean m9803b() {
        return !C1833d.f4443i.equals(this.f4699j);
    }

    /* renamed from: c */
    public final boolean m9802c() {
        return this.f4697h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1940p.class != obj.getClass()) {
            return false;
        }
        C1940p c1940p = (C1940p) obj;
        if (this.f4696g == c1940p.f4696g && this.f4697h == c1940p.f4697h && this.f4698i == c1940p.f4698i && this.f4700k == c1940p.f4700k && this.f4702m == c1940p.f4702m && this.f4703n == c1940p.f4703n && this.f4704o == c1940p.f4704o && this.f4705p == c1940p.f4705p && this.f4706q == c1940p.f4706q && this.f4690a.equals(c1940p.f4690a) && this.f4691b == c1940p.f4691b && this.f4692c.equals(c1940p.f4692c)) {
            String str = this.f4693d;
            if (str == null ? c1940p.f4693d == null : str.equals(c1940p.f4693d)) {
                return this.f4694e.equals(c1940p.f4694e) && this.f4695f.equals(c1940p.f4695f) && this.f4699j.equals(c1940p.f4699j) && this.f4701l == c1940p.f4701l && this.f4707r == c1940p.f4707r;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4691b.hashCode();
        int m12537a = C0406q1.m12537a(this.f4692c, (hashCode + (this.f4690a.hashCode() * 31)) * 31, 31);
        String str = this.f4693d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.f4694e.hashCode();
        int hashCode3 = this.f4695f.hashCode();
        long j = this.f4696g;
        long j2 = this.f4697h;
        long j3 = this.f4698i;
        int hashCode4 = this.f4699j.hashCode();
        int m12337b = C0511i.m12337b(this.f4701l);
        long j4 = this.f4702m;
        long j5 = this.f4703n;
        long j6 = this.f4704o;
        long j7 = this.f4705p;
        return C0511i.m12337b(this.f4707r) + ((((((((((((m12337b + ((((hashCode4 + ((((((((hashCode3 + ((hashCode2 + ((m12537a + i) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f4700k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f4706q ? 1 : 0)) * 31);
    }

    @NonNull
    public final String toString() {
        return C0484a.m12392a(new StringBuilder("{WorkSpec: "), this.f4690a, "}");
    }
}
