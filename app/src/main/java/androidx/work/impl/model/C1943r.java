package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.AbstractC1677m;
import androidx.room.C1675k;
import androidx.room.util.C1680b;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.sqlite.p004db.framework.C1714e;
import androidx.work.C1833d;
import androidx.work.C1837f;
import androidx.work.EnumC2018s;
import androidx.work.impl.model.C1940p;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.work.impl.model.r */
/* loaded from: classes.dex */
public final class C1943r implements InterfaceC1942q {

    /* renamed from: a */
    public final AbstractC1668i f4710a;

    /* renamed from: b */
    public final C1944a f4711b;

    /* renamed from: c */
    public final C1945b f4712c;

    /* renamed from: d */
    public final C1946c f4713d;

    /* renamed from: e */
    public final C1947d f4714e;

    /* renamed from: f */
    public final C1948e f4715f;

    /* renamed from: g */
    public final C1949f f4716g;

    /* renamed from: h */
    public final C1950g f4717h;

    /* renamed from: i */
    public final C1951h f4718i;

    /* renamed from: androidx.work.impl.model.r$a */
    /* loaded from: classes.dex */
    public class C1944a extends AbstractC1657b<C1940p> {
        public C1944a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo9785d(androidx.sqlite.p004db.framework.C1714e r17, androidx.work.impl.model.C1940p r18) {
            /*
                Method dump skipped, instructions count: 525
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C1943r.C1944a.mo9785d(androidx.sqlite.db.framework.e, java.lang.Object):void");
        }
    }

    /* renamed from: androidx.work.impl.model.r$b */
    /* loaded from: classes.dex */
    public class C1945b extends AbstractC1677m {
        public C1945b(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$c */
    /* loaded from: classes.dex */
    public class C1946c extends AbstractC1677m {
        public C1946c(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$d */
    /* loaded from: classes.dex */
    public class C1947d extends AbstractC1677m {
        public C1947d(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$e */
    /* loaded from: classes.dex */
    public class C1948e extends AbstractC1677m {
        public C1948e(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$f */
    /* loaded from: classes.dex */
    public class C1949f extends AbstractC1677m {
        public C1949f(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$g */
    /* loaded from: classes.dex */
    public class C1950g extends AbstractC1677m {
        public C1950g(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.r$h */
    /* loaded from: classes.dex */
    public class C1951h extends AbstractC1677m {
        public C1951h(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public C1943r(AbstractC1668i abstractC1668i) {
        this.f4710a = abstractC1668i;
        this.f4711b = new C1944a(abstractC1668i);
        this.f4712c = new C1945b(abstractC1668i);
        this.f4713d = new C1946c(abstractC1668i);
        this.f4714e = new C1947d(abstractC1668i);
        this.f4715f = new C1948e(abstractC1668i);
        this.f4716g = new C1949f(abstractC1668i);
        this.f4717h = new C1950g(abstractC1668i);
        this.f4718i = new C1951h(abstractC1668i);
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void m9801a(String str) {
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        C1945b c1945b = this.f4712c;
        C1714e m10062a = c1945b.m10062a();
        if (str == null) {
            m10062a.m10018e(1);
        } else {
            m10062a.m10017f(1, str);
        }
        abstractC1668i.m10074c();
        try {
            m10062a.m10016g();
            abstractC1668i.m10071h();
        } finally {
            abstractC1668i.m10073f();
            c1945b.m10061c(m10062a);
        }
    }

    /* renamed from: b */
    public final ArrayList m9800b() {
        C1675k c1675k;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1675k m10068d = C1675k.m10068d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        m10068d.m10067e(1, 200);
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            int m10059a = C1680b.m10059a(m10072g, "required_network_type");
            int m10059a2 = C1680b.m10059a(m10072g, "requires_charging");
            int m10059a3 = C1680b.m10059a(m10072g, "requires_device_idle");
            int m10059a4 = C1680b.m10059a(m10072g, "requires_battery_not_low");
            int m10059a5 = C1680b.m10059a(m10072g, "requires_storage_not_low");
            int m10059a6 = C1680b.m10059a(m10072g, "trigger_content_update_delay");
            int m10059a7 = C1680b.m10059a(m10072g, "trigger_max_content_delay");
            int m10059a8 = C1680b.m10059a(m10072g, "content_uri_triggers");
            int m10059a9 = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            int m10059a10 = C1680b.m10059a(m10072g, "state");
            int m10059a11 = C1680b.m10059a(m10072g, "worker_class_name");
            int m10059a12 = C1680b.m10059a(m10072g, "input_merger_class_name");
            int m10059a13 = C1680b.m10059a(m10072g, "input");
            int m10059a14 = C1680b.m10059a(m10072g, "output");
            c1675k = m10068d;
            try {
                int m10059a15 = C1680b.m10059a(m10072g, "initial_delay");
                int m10059a16 = C1680b.m10059a(m10072g, "interval_duration");
                int m10059a17 = C1680b.m10059a(m10072g, "flex_duration");
                int m10059a18 = C1680b.m10059a(m10072g, "run_attempt_count");
                int m10059a19 = C1680b.m10059a(m10072g, "backoff_policy");
                int m10059a20 = C1680b.m10059a(m10072g, "backoff_delay_duration");
                int m10059a21 = C1680b.m10059a(m10072g, "period_start_time");
                int m10059a22 = C1680b.m10059a(m10072g, "minimum_retention_duration");
                int m10059a23 = C1680b.m10059a(m10072g, "schedule_requested_at");
                int m10059a24 = C1680b.m10059a(m10072g, "run_in_foreground");
                int m10059a25 = C1680b.m10059a(m10072g, "out_of_quota_policy");
                int i = m10059a14;
                ArrayList arrayList = new ArrayList(m10072g.getCount());
                while (m10072g.moveToNext()) {
                    String string = m10072g.getString(m10059a9);
                    int i2 = m10059a9;
                    String string2 = m10072g.getString(m10059a11);
                    int i3 = m10059a11;
                    C1833d c1833d = new C1833d();
                    int i4 = m10059a;
                    c1833d.f4444a = C1956v.m9782c(m10072g.getInt(m10059a));
                    if (m10072g.getInt(m10059a2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1833d.f4445b = z;
                    if (m10072g.getInt(m10059a3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1833d.f4446c = z2;
                    if (m10072g.getInt(m10059a4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1833d.f4447d = z3;
                    if (m10072g.getInt(m10059a5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c1833d.f4448e = z4;
                    int i5 = m10059a2;
                    int i6 = m10059a3;
                    c1833d.f4449f = m10072g.getLong(m10059a6);
                    c1833d.f4450g = m10072g.getLong(m10059a7);
                    c1833d.f4451h = C1956v.m9784a(m10072g.getBlob(m10059a8));
                    C1940p c1940p = new C1940p(string, string2);
                    c1940p.f4691b = C1956v.m9780e(m10072g.getInt(m10059a10));
                    c1940p.f4693d = m10072g.getString(m10059a12);
                    c1940p.f4694e = C1837f.m9904a(m10072g.getBlob(m10059a13));
                    int i7 = i;
                    c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(i7));
                    int i8 = m10059a13;
                    int i9 = m10059a15;
                    c1940p.f4696g = m10072g.getLong(i9);
                    int i10 = m10059a4;
                    int i11 = m10059a16;
                    c1940p.f4697h = m10072g.getLong(i11);
                    int i12 = m10059a17;
                    c1940p.f4698i = m10072g.getLong(i12);
                    int i13 = m10059a18;
                    c1940p.f4700k = m10072g.getInt(i13);
                    int i14 = m10059a19;
                    c1940p.f4701l = C1956v.m9783b(m10072g.getInt(i14));
                    int i15 = m10059a20;
                    c1940p.f4702m = m10072g.getLong(i15);
                    int i16 = m10059a21;
                    c1940p.f4703n = m10072g.getLong(i16);
                    int i17 = m10059a22;
                    c1940p.f4704o = m10072g.getLong(i17);
                    int i18 = m10059a23;
                    c1940p.f4705p = m10072g.getLong(i18);
                    int i19 = m10059a24;
                    if (m10072g.getInt(i19) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c1940p.f4706q = z5;
                    int i20 = m10059a25;
                    c1940p.f4707r = C1956v.m9781d(m10072g.getInt(i20));
                    c1940p.f4699j = c1833d;
                    arrayList.add(c1940p);
                    i = i7;
                    m10059a2 = i5;
                    m10059a15 = i9;
                    m10059a16 = i11;
                    m10059a20 = i15;
                    m10059a21 = i16;
                    m10059a24 = i19;
                    m10059a11 = i3;
                    m10059a = i4;
                    m10059a25 = i20;
                    m10059a23 = i18;
                    m10059a13 = i8;
                    m10059a9 = i2;
                    m10059a3 = i6;
                    m10059a22 = i17;
                    m10059a4 = i10;
                    m10059a17 = i12;
                    m10059a18 = i13;
                    m10059a19 = i14;
                }
                m10072g.close();
                c1675k.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m10072g.close();
                c1675k.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1675k = m10068d;
        }
    }

    /* renamed from: c */
    public final ArrayList m9799c(int i) {
        C1675k c1675k;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1675k m10068d = C1675k.m10068d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        m10068d.m10067e(1, i);
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            int m10059a = C1680b.m10059a(m10072g, "required_network_type");
            int m10059a2 = C1680b.m10059a(m10072g, "requires_charging");
            int m10059a3 = C1680b.m10059a(m10072g, "requires_device_idle");
            int m10059a4 = C1680b.m10059a(m10072g, "requires_battery_not_low");
            int m10059a5 = C1680b.m10059a(m10072g, "requires_storage_not_low");
            int m10059a6 = C1680b.m10059a(m10072g, "trigger_content_update_delay");
            int m10059a7 = C1680b.m10059a(m10072g, "trigger_max_content_delay");
            int m10059a8 = C1680b.m10059a(m10072g, "content_uri_triggers");
            int m10059a9 = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            int m10059a10 = C1680b.m10059a(m10072g, "state");
            int m10059a11 = C1680b.m10059a(m10072g, "worker_class_name");
            int m10059a12 = C1680b.m10059a(m10072g, "input_merger_class_name");
            int m10059a13 = C1680b.m10059a(m10072g, "input");
            int m10059a14 = C1680b.m10059a(m10072g, "output");
            c1675k = m10068d;
            try {
                int m10059a15 = C1680b.m10059a(m10072g, "initial_delay");
                int m10059a16 = C1680b.m10059a(m10072g, "interval_duration");
                int m10059a17 = C1680b.m10059a(m10072g, "flex_duration");
                int m10059a18 = C1680b.m10059a(m10072g, "run_attempt_count");
                int m10059a19 = C1680b.m10059a(m10072g, "backoff_policy");
                int m10059a20 = C1680b.m10059a(m10072g, "backoff_delay_duration");
                int m10059a21 = C1680b.m10059a(m10072g, "period_start_time");
                int m10059a22 = C1680b.m10059a(m10072g, "minimum_retention_duration");
                int m10059a23 = C1680b.m10059a(m10072g, "schedule_requested_at");
                int m10059a24 = C1680b.m10059a(m10072g, "run_in_foreground");
                int m10059a25 = C1680b.m10059a(m10072g, "out_of_quota_policy");
                int i2 = m10059a14;
                ArrayList arrayList = new ArrayList(m10072g.getCount());
                while (m10072g.moveToNext()) {
                    String string = m10072g.getString(m10059a9);
                    int i3 = m10059a9;
                    String string2 = m10072g.getString(m10059a11);
                    int i4 = m10059a11;
                    C1833d c1833d = new C1833d();
                    int i5 = m10059a;
                    c1833d.f4444a = C1956v.m9782c(m10072g.getInt(m10059a));
                    if (m10072g.getInt(m10059a2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1833d.f4445b = z;
                    if (m10072g.getInt(m10059a3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1833d.f4446c = z2;
                    if (m10072g.getInt(m10059a4) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1833d.f4447d = z3;
                    if (m10072g.getInt(m10059a5) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c1833d.f4448e = z4;
                    int i6 = m10059a2;
                    int i7 = m10059a3;
                    c1833d.f4449f = m10072g.getLong(m10059a6);
                    c1833d.f4450g = m10072g.getLong(m10059a7);
                    c1833d.f4451h = C1956v.m9784a(m10072g.getBlob(m10059a8));
                    C1940p c1940p = new C1940p(string, string2);
                    c1940p.f4691b = C1956v.m9780e(m10072g.getInt(m10059a10));
                    c1940p.f4693d = m10072g.getString(m10059a12);
                    c1940p.f4694e = C1837f.m9904a(m10072g.getBlob(m10059a13));
                    int i8 = i2;
                    c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(i8));
                    int i9 = m10059a15;
                    int i10 = m10059a13;
                    c1940p.f4696g = m10072g.getLong(i9);
                    int i11 = m10059a4;
                    int i12 = m10059a16;
                    c1940p.f4697h = m10072g.getLong(i12);
                    int i13 = m10059a17;
                    c1940p.f4698i = m10072g.getLong(i13);
                    int i14 = m10059a18;
                    c1940p.f4700k = m10072g.getInt(i14);
                    int i15 = m10059a19;
                    c1940p.f4701l = C1956v.m9783b(m10072g.getInt(i15));
                    int i16 = m10059a20;
                    c1940p.f4702m = m10072g.getLong(i16);
                    int i17 = m10059a21;
                    c1940p.f4703n = m10072g.getLong(i17);
                    int i18 = m10059a22;
                    c1940p.f4704o = m10072g.getLong(i18);
                    int i19 = m10059a23;
                    c1940p.f4705p = m10072g.getLong(i19);
                    int i20 = m10059a24;
                    if (m10072g.getInt(i20) != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c1940p.f4706q = z5;
                    int i21 = m10059a25;
                    c1940p.f4707r = C1956v.m9781d(m10072g.getInt(i21));
                    c1940p.f4699j = c1833d;
                    arrayList.add(c1940p);
                    i2 = i8;
                    m10059a2 = i6;
                    m10059a24 = i20;
                    m10059a9 = i3;
                    m10059a11 = i4;
                    m10059a = i5;
                    m10059a25 = i21;
                    m10059a13 = i10;
                    m10059a15 = i9;
                    m10059a16 = i12;
                    m10059a20 = i16;
                    m10059a21 = i17;
                    m10059a23 = i19;
                    m10059a3 = i7;
                    m10059a22 = i18;
                    m10059a4 = i11;
                    m10059a17 = i13;
                    m10059a18 = i14;
                    m10059a19 = i15;
                }
                m10072g.close();
                c1675k.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                m10072g.close();
                c1675k.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c1675k = m10068d;
        }
    }

    /* renamed from: d */
    public final ArrayList m9798d() {
        C1675k c1675k;
        int m10059a;
        int m10059a2;
        int m10059a3;
        int m10059a4;
        int m10059a5;
        int m10059a6;
        int m10059a7;
        int m10059a8;
        int m10059a9;
        int m10059a10;
        int m10059a11;
        int m10059a12;
        int m10059a13;
        int m10059a14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1675k m10068d = C1675k.m10068d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            m10059a = C1680b.m10059a(m10072g, "required_network_type");
            m10059a2 = C1680b.m10059a(m10072g, "requires_charging");
            m10059a3 = C1680b.m10059a(m10072g, "requires_device_idle");
            m10059a4 = C1680b.m10059a(m10072g, "requires_battery_not_low");
            m10059a5 = C1680b.m10059a(m10072g, "requires_storage_not_low");
            m10059a6 = C1680b.m10059a(m10072g, "trigger_content_update_delay");
            m10059a7 = C1680b.m10059a(m10072g, "trigger_max_content_delay");
            m10059a8 = C1680b.m10059a(m10072g, "content_uri_triggers");
            m10059a9 = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            m10059a10 = C1680b.m10059a(m10072g, "state");
            m10059a11 = C1680b.m10059a(m10072g, "worker_class_name");
            m10059a12 = C1680b.m10059a(m10072g, "input_merger_class_name");
            m10059a13 = C1680b.m10059a(m10072g, "input");
            m10059a14 = C1680b.m10059a(m10072g, "output");
            c1675k = m10068d;
        } catch (Throwable th) {
            th = th;
            c1675k = m10068d;
        }
        try {
            int m10059a15 = C1680b.m10059a(m10072g, "initial_delay");
            int m10059a16 = C1680b.m10059a(m10072g, "interval_duration");
            int m10059a17 = C1680b.m10059a(m10072g, "flex_duration");
            int m10059a18 = C1680b.m10059a(m10072g, "run_attempt_count");
            int m10059a19 = C1680b.m10059a(m10072g, "backoff_policy");
            int m10059a20 = C1680b.m10059a(m10072g, "backoff_delay_duration");
            int m10059a21 = C1680b.m10059a(m10072g, "period_start_time");
            int m10059a22 = C1680b.m10059a(m10072g, "minimum_retention_duration");
            int m10059a23 = C1680b.m10059a(m10072g, "schedule_requested_at");
            int m10059a24 = C1680b.m10059a(m10072g, "run_in_foreground");
            int m10059a25 = C1680b.m10059a(m10072g, "out_of_quota_policy");
            int i = m10059a14;
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                String string = m10072g.getString(m10059a9);
                int i2 = m10059a9;
                String string2 = m10072g.getString(m10059a11);
                int i3 = m10059a11;
                C1833d c1833d = new C1833d();
                int i4 = m10059a;
                c1833d.f4444a = C1956v.m9782c(m10072g.getInt(m10059a));
                if (m10072g.getInt(m10059a2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1833d.f4445b = z;
                if (m10072g.getInt(m10059a3) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1833d.f4446c = z2;
                if (m10072g.getInt(m10059a4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1833d.f4447d = z3;
                if (m10072g.getInt(m10059a5) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c1833d.f4448e = z4;
                int i5 = m10059a2;
                int i6 = m10059a3;
                c1833d.f4449f = m10072g.getLong(m10059a6);
                c1833d.f4450g = m10072g.getLong(m10059a7);
                c1833d.f4451h = C1956v.m9784a(m10072g.getBlob(m10059a8));
                C1940p c1940p = new C1940p(string, string2);
                c1940p.f4691b = C1956v.m9780e(m10072g.getInt(m10059a10));
                c1940p.f4693d = m10072g.getString(m10059a12);
                c1940p.f4694e = C1837f.m9904a(m10072g.getBlob(m10059a13));
                int i7 = i;
                c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(i7));
                int i8 = m10059a13;
                int i9 = m10059a15;
                c1940p.f4696g = m10072g.getLong(i9);
                int i10 = m10059a4;
                int i11 = m10059a16;
                c1940p.f4697h = m10072g.getLong(i11);
                int i12 = m10059a17;
                c1940p.f4698i = m10072g.getLong(i12);
                int i13 = m10059a18;
                c1940p.f4700k = m10072g.getInt(i13);
                int i14 = m10059a19;
                c1940p.f4701l = C1956v.m9783b(m10072g.getInt(i14));
                int i15 = m10059a20;
                c1940p.f4702m = m10072g.getLong(i15);
                int i16 = m10059a21;
                c1940p.f4703n = m10072g.getLong(i16);
                int i17 = m10059a22;
                c1940p.f4704o = m10072g.getLong(i17);
                int i18 = m10059a23;
                c1940p.f4705p = m10072g.getLong(i18);
                int i19 = m10059a24;
                if (m10072g.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c1940p.f4706q = z5;
                int i20 = m10059a25;
                c1940p.f4707r = C1956v.m9781d(m10072g.getInt(i20));
                c1940p.f4699j = c1833d;
                arrayList.add(c1940p);
                i = i7;
                m10059a2 = i5;
                m10059a15 = i9;
                m10059a16 = i11;
                m10059a20 = i15;
                m10059a21 = i16;
                m10059a24 = i19;
                m10059a11 = i3;
                m10059a = i4;
                m10059a25 = i20;
                m10059a23 = i18;
                m10059a13 = i8;
                m10059a9 = i2;
                m10059a3 = i6;
                m10059a22 = i17;
                m10059a4 = i10;
                m10059a17 = i12;
                m10059a18 = i13;
                m10059a19 = i14;
            }
            m10072g.close();
            c1675k.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m10072g.close();
            c1675k.release();
            throw th;
        }
    }

    /* renamed from: e */
    public final ArrayList m9797e() {
        C1675k c1675k;
        int m10059a;
        int m10059a2;
        int m10059a3;
        int m10059a4;
        int m10059a5;
        int m10059a6;
        int m10059a7;
        int m10059a8;
        int m10059a9;
        int m10059a10;
        int m10059a11;
        int m10059a12;
        int m10059a13;
        int m10059a14;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1675k m10068d = C1675k.m10068d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            m10059a = C1680b.m10059a(m10072g, "required_network_type");
            m10059a2 = C1680b.m10059a(m10072g, "requires_charging");
            m10059a3 = C1680b.m10059a(m10072g, "requires_device_idle");
            m10059a4 = C1680b.m10059a(m10072g, "requires_battery_not_low");
            m10059a5 = C1680b.m10059a(m10072g, "requires_storage_not_low");
            m10059a6 = C1680b.m10059a(m10072g, "trigger_content_update_delay");
            m10059a7 = C1680b.m10059a(m10072g, "trigger_max_content_delay");
            m10059a8 = C1680b.m10059a(m10072g, "content_uri_triggers");
            m10059a9 = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            m10059a10 = C1680b.m10059a(m10072g, "state");
            m10059a11 = C1680b.m10059a(m10072g, "worker_class_name");
            m10059a12 = C1680b.m10059a(m10072g, "input_merger_class_name");
            m10059a13 = C1680b.m10059a(m10072g, "input");
            m10059a14 = C1680b.m10059a(m10072g, "output");
            c1675k = m10068d;
        } catch (Throwable th) {
            th = th;
            c1675k = m10068d;
        }
        try {
            int m10059a15 = C1680b.m10059a(m10072g, "initial_delay");
            int m10059a16 = C1680b.m10059a(m10072g, "interval_duration");
            int m10059a17 = C1680b.m10059a(m10072g, "flex_duration");
            int m10059a18 = C1680b.m10059a(m10072g, "run_attempt_count");
            int m10059a19 = C1680b.m10059a(m10072g, "backoff_policy");
            int m10059a20 = C1680b.m10059a(m10072g, "backoff_delay_duration");
            int m10059a21 = C1680b.m10059a(m10072g, "period_start_time");
            int m10059a22 = C1680b.m10059a(m10072g, "minimum_retention_duration");
            int m10059a23 = C1680b.m10059a(m10072g, "schedule_requested_at");
            int m10059a24 = C1680b.m10059a(m10072g, "run_in_foreground");
            int m10059a25 = C1680b.m10059a(m10072g, "out_of_quota_policy");
            int i = m10059a14;
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                String string = m10072g.getString(m10059a9);
                int i2 = m10059a9;
                String string2 = m10072g.getString(m10059a11);
                int i3 = m10059a11;
                C1833d c1833d = new C1833d();
                int i4 = m10059a;
                c1833d.f4444a = C1956v.m9782c(m10072g.getInt(m10059a));
                if (m10072g.getInt(m10059a2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1833d.f4445b = z;
                if (m10072g.getInt(m10059a3) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1833d.f4446c = z2;
                if (m10072g.getInt(m10059a4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1833d.f4447d = z3;
                if (m10072g.getInt(m10059a5) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c1833d.f4448e = z4;
                int i5 = m10059a2;
                int i6 = m10059a3;
                c1833d.f4449f = m10072g.getLong(m10059a6);
                c1833d.f4450g = m10072g.getLong(m10059a7);
                c1833d.f4451h = C1956v.m9784a(m10072g.getBlob(m10059a8));
                C1940p c1940p = new C1940p(string, string2);
                c1940p.f4691b = C1956v.m9780e(m10072g.getInt(m10059a10));
                c1940p.f4693d = m10072g.getString(m10059a12);
                c1940p.f4694e = C1837f.m9904a(m10072g.getBlob(m10059a13));
                int i7 = i;
                c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(i7));
                int i8 = m10059a13;
                int i9 = m10059a15;
                c1940p.f4696g = m10072g.getLong(i9);
                int i10 = m10059a4;
                int i11 = m10059a16;
                c1940p.f4697h = m10072g.getLong(i11);
                int i12 = m10059a17;
                c1940p.f4698i = m10072g.getLong(i12);
                int i13 = m10059a18;
                c1940p.f4700k = m10072g.getInt(i13);
                int i14 = m10059a19;
                c1940p.f4701l = C1956v.m9783b(m10072g.getInt(i14));
                int i15 = m10059a20;
                c1940p.f4702m = m10072g.getLong(i15);
                int i16 = m10059a21;
                c1940p.f4703n = m10072g.getLong(i16);
                int i17 = m10059a22;
                c1940p.f4704o = m10072g.getLong(i17);
                int i18 = m10059a23;
                c1940p.f4705p = m10072g.getLong(i18);
                int i19 = m10059a24;
                if (m10072g.getInt(i19) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c1940p.f4706q = z5;
                int i20 = m10059a25;
                c1940p.f4707r = C1956v.m9781d(m10072g.getInt(i20));
                c1940p.f4699j = c1833d;
                arrayList.add(c1940p);
                i = i7;
                m10059a2 = i5;
                m10059a15 = i9;
                m10059a16 = i11;
                m10059a20 = i15;
                m10059a21 = i16;
                m10059a24 = i19;
                m10059a11 = i3;
                m10059a = i4;
                m10059a25 = i20;
                m10059a23 = i18;
                m10059a13 = i8;
                m10059a9 = i2;
                m10059a3 = i6;
                m10059a22 = i17;
                m10059a4 = i10;
                m10059a17 = i12;
                m10059a18 = i13;
                m10059a19 = i14;
            }
            m10072g.close();
            c1675k.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            m10072g.close();
            c1675k.release();
            throw th;
        }
    }

    /* renamed from: f */
    public final EnumC2018s m9796f(String str) {
        EnumC2018s enumC2018s;
        C1675k m10068d = C1675k.m10068d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            if (m10072g.moveToFirst()) {
                enumC2018s = C1956v.m9780e(m10072g.getInt(0));
            } else {
                enumC2018s = null;
            }
            return enumC2018s;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: g */
    public final ArrayList m9795g(String str) {
        C1675k m10068d = C1675k.m10068d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                arrayList.add(m10072g.getString(0));
            }
            return arrayList;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: h */
    public final ArrayList m9794h(String str) {
        C1675k m10068d = C1675k.m10068d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                arrayList.add(m10072g.getString(0));
            }
            return arrayList;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: i */
    public final C1940p m9793i(String str) {
        C1675k c1675k;
        int m10059a;
        int m10059a2;
        int m10059a3;
        int m10059a4;
        int m10059a5;
        int m10059a6;
        int m10059a7;
        int m10059a8;
        int m10059a9;
        int m10059a10;
        int m10059a11;
        int m10059a12;
        int m10059a13;
        int m10059a14;
        C1940p c1940p;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1675k m10068d = C1675k.m10068d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            m10059a = C1680b.m10059a(m10072g, "required_network_type");
            m10059a2 = C1680b.m10059a(m10072g, "requires_charging");
            m10059a3 = C1680b.m10059a(m10072g, "requires_device_idle");
            m10059a4 = C1680b.m10059a(m10072g, "requires_battery_not_low");
            m10059a5 = C1680b.m10059a(m10072g, "requires_storage_not_low");
            m10059a6 = C1680b.m10059a(m10072g, "trigger_content_update_delay");
            m10059a7 = C1680b.m10059a(m10072g, "trigger_max_content_delay");
            m10059a8 = C1680b.m10059a(m10072g, "content_uri_triggers");
            m10059a9 = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            m10059a10 = C1680b.m10059a(m10072g, "state");
            m10059a11 = C1680b.m10059a(m10072g, "worker_class_name");
            m10059a12 = C1680b.m10059a(m10072g, "input_merger_class_name");
            m10059a13 = C1680b.m10059a(m10072g, "input");
            m10059a14 = C1680b.m10059a(m10072g, "output");
            c1675k = m10068d;
        } catch (Throwable th) {
            th = th;
            c1675k = m10068d;
        }
        try {
            int m10059a15 = C1680b.m10059a(m10072g, "initial_delay");
            int m10059a16 = C1680b.m10059a(m10072g, "interval_duration");
            int m10059a17 = C1680b.m10059a(m10072g, "flex_duration");
            int m10059a18 = C1680b.m10059a(m10072g, "run_attempt_count");
            int m10059a19 = C1680b.m10059a(m10072g, "backoff_policy");
            int m10059a20 = C1680b.m10059a(m10072g, "backoff_delay_duration");
            int m10059a21 = C1680b.m10059a(m10072g, "period_start_time");
            int m10059a22 = C1680b.m10059a(m10072g, "minimum_retention_duration");
            int m10059a23 = C1680b.m10059a(m10072g, "schedule_requested_at");
            int m10059a24 = C1680b.m10059a(m10072g, "run_in_foreground");
            int m10059a25 = C1680b.m10059a(m10072g, "out_of_quota_policy");
            if (m10072g.moveToFirst()) {
                String string = m10072g.getString(m10059a9);
                String string2 = m10072g.getString(m10059a11);
                C1833d c1833d = new C1833d();
                c1833d.f4444a = C1956v.m9782c(m10072g.getInt(m10059a));
                if (m10072g.getInt(m10059a2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1833d.f4445b = z;
                if (m10072g.getInt(m10059a3) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1833d.f4446c = z2;
                if (m10072g.getInt(m10059a4) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1833d.f4447d = z3;
                if (m10072g.getInt(m10059a5) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c1833d.f4448e = z4;
                c1833d.f4449f = m10072g.getLong(m10059a6);
                c1833d.f4450g = m10072g.getLong(m10059a7);
                c1833d.f4451h = C1956v.m9784a(m10072g.getBlob(m10059a8));
                c1940p = new C1940p(string, string2);
                c1940p.f4691b = C1956v.m9780e(m10072g.getInt(m10059a10));
                c1940p.f4693d = m10072g.getString(m10059a12);
                c1940p.f4694e = C1837f.m9904a(m10072g.getBlob(m10059a13));
                c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(m10059a14));
                c1940p.f4696g = m10072g.getLong(m10059a15);
                c1940p.f4697h = m10072g.getLong(m10059a16);
                c1940p.f4698i = m10072g.getLong(m10059a17);
                c1940p.f4700k = m10072g.getInt(m10059a18);
                c1940p.f4701l = C1956v.m9783b(m10072g.getInt(m10059a19));
                c1940p.f4702m = m10072g.getLong(m10059a20);
                c1940p.f4703n = m10072g.getLong(m10059a21);
                c1940p.f4704o = m10072g.getLong(m10059a22);
                c1940p.f4705p = m10072g.getLong(m10059a23);
                if (m10072g.getInt(m10059a24) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c1940p.f4706q = z5;
                c1940p.f4707r = C1956v.m9781d(m10072g.getInt(m10059a25));
                c1940p.f4699j = c1833d;
            } else {
                c1940p = null;
            }
            m10072g.close();
            c1675k.release();
            return c1940p;
        } catch (Throwable th2) {
            th = th2;
            m10072g.close();
            c1675k.release();
            throw th;
        }
    }

    /* renamed from: j */
    public final ArrayList m9792j(String str) {
        C1675k m10068d = C1675k.m10068d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            int m10059a = C1680b.m10059a(m10072g, FacebookAdapter.KEY_ID);
            int m10059a2 = C1680b.m10059a(m10072g, "state");
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                C1940p.C1941a c1941a = new C1940p.C1941a();
                c1941a.f4708a = m10072g.getString(m10059a);
                c1941a.f4709b = C1956v.m9780e(m10072g.getInt(m10059a2));
                arrayList.add(c1941a);
            }
            return arrayList;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: k */
    public final int m9791k(long j, String str) {
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        C1950g c1950g = this.f4717h;
        C1714e m10062a = c1950g.m10062a();
        m10062a.m10019d(1, j);
        if (str == null) {
            m10062a.m10018e(2);
        } else {
            m10062a.m10017f(2, str);
        }
        abstractC1668i.m10074c();
        try {
            int m10016g = m10062a.m10016g();
            abstractC1668i.m10071h();
            return m10016g;
        } finally {
            abstractC1668i.m10073f();
            c1950g.m10061c(m10062a);
        }
    }

    /* renamed from: l */
    public final void m9790l(String str, C1837f c1837f) {
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        C1946c c1946c = this.f4713d;
        C1714e m10062a = c1946c.m10062a();
        byte[] m9903b = C1837f.m9903b(c1837f);
        if (m9903b == null) {
            m10062a.m10018e(1);
        } else {
            m10062a.m10021a(1, m9903b);
        }
        if (str == null) {
            m10062a.m10018e(2);
        } else {
            m10062a.m10017f(2, str);
        }
        abstractC1668i.m10074c();
        try {
            m10062a.m10016g();
            abstractC1668i.m10071h();
        } finally {
            abstractC1668i.m10073f();
            c1946c.m10061c(m10062a);
        }
    }

    /* renamed from: m */
    public final void m9789m(long j, String str) {
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        C1947d c1947d = this.f4714e;
        C1714e m10062a = c1947d.m10062a();
        m10062a.m10019d(1, j);
        if (str == null) {
            m10062a.m10018e(2);
        } else {
            m10062a.m10017f(2, str);
        }
        abstractC1668i.m10074c();
        try {
            m10062a.m10016g();
            abstractC1668i.m10071h();
        } finally {
            abstractC1668i.m10073f();
            c1947d.m10061c(m10062a);
        }
    }

    /* renamed from: n */
    public final int m9788n(EnumC2018s enumC2018s, String... strArr) {
        AbstractC1668i abstractC1668i = this.f4710a;
        abstractC1668i.m10075b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        abstractC1668i.m10076a();
        abstractC1668i.m10075b();
        C1714e c1714e = new C1714e(((C1707a) abstractC1668i.f4052c.mo10024r()).f4156a.compileStatement(sb2));
        c1714e.m10019d(1, C1956v.m9779f(enumC2018s));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                c1714e.m10018e(i2);
            } else {
                c1714e.m10017f(i2, str);
            }
            i2++;
        }
        abstractC1668i.m10074c();
        try {
            int m10016g = c1714e.m10016g();
            abstractC1668i.m10071h();
            return m10016g;
        } finally {
            abstractC1668i.m10073f();
        }
    }
}
