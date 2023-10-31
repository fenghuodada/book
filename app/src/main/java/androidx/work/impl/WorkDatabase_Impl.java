package androidx.work.impl;

import android.content.Context;
import androidx.room.C1656a;
import androidx.room.C1663h;
import androidx.room.C1672j;
import androidx.room.util.C1682d;
import androidx.sqlite.p004db.InterfaceC1702c;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.work.impl.model.C1919c;
import androidx.work.impl.model.C1923f;
import androidx.work.impl.model.C1927i;
import androidx.work.impl.model.C1932l;
import androidx.work.impl.model.C1936o;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.C1954u;
import androidx.work.impl.model.InterfaceC1918b;
import androidx.work.impl.model.InterfaceC1922e;
import androidx.work.impl.model.InterfaceC1926h;
import androidx.work.impl.model.InterfaceC1931k;
import androidx.work.impl.model.InterfaceC1935n;
import androidx.work.impl.model.InterfaceC1942q;
import androidx.work.impl.model.InterfaceC1953t;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s */
    public static final /* synthetic */ int f4467s = 0;

    /* renamed from: l */
    public volatile C1943r f4468l;

    /* renamed from: m */
    public volatile C1919c f4469m;

    /* renamed from: n */
    public volatile C1954u f4470n;

    /* renamed from: o */
    public volatile C1927i f4471o;

    /* renamed from: p */
    public volatile C1932l f4472p;

    /* renamed from: q */
    public volatile C1936o f4473q;

    /* renamed from: r */
    public volatile C1923f f4474r;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    /* loaded from: classes.dex */
    public class C1842a extends C1672j.AbstractC1673a {
        public C1842a() {
        }

        @Override // androidx.room.C1672j.AbstractC1673a
        /* renamed from: a */
        public final void mo9891a(C1707a c1707a) {
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c1707a.m10030d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.C1672j.AbstractC1673a
        /* renamed from: b */
        public final C1672j.C1674b mo9890b(C1707a c1707a) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C1682d.C1683a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap.put("prerequisite_id", new C1682d.C1683a(2, "prerequisite_id", "TEXT", null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            hashSet.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C1682d.C1686d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
            hashSet2.add(new C1682d.C1686d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
            C1682d c1682d = new C1682d("Dependency", hashMap, hashSet, hashSet2);
            C1682d m10057a = C1682d.m10057a(c1707a, "Dependency");
            if (!c1682d.equals(m10057a)) {
                return new C1672j.C1674b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c1682d + "\n Found:\n" + m10057a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(FacebookAdapter.KEY_ID, new C1682d.C1683a(1, FacebookAdapter.KEY_ID, "TEXT", null, true, 1));
            hashMap2.put("state", new C1682d.C1683a(0, "state", "INTEGER", null, true, 1));
            hashMap2.put("worker_class_name", new C1682d.C1683a(0, "worker_class_name", "TEXT", null, true, 1));
            hashMap2.put("input_merger_class_name", new C1682d.C1683a(0, "input_merger_class_name", "TEXT", null, false, 1));
            hashMap2.put("input", new C1682d.C1683a(0, "input", "BLOB", null, true, 1));
            hashMap2.put("output", new C1682d.C1683a(0, "output", "BLOB", null, true, 1));
            hashMap2.put("initial_delay", new C1682d.C1683a(0, "initial_delay", "INTEGER", null, true, 1));
            hashMap2.put("interval_duration", new C1682d.C1683a(0, "interval_duration", "INTEGER", null, true, 1));
            hashMap2.put("flex_duration", new C1682d.C1683a(0, "flex_duration", "INTEGER", null, true, 1));
            hashMap2.put("run_attempt_count", new C1682d.C1683a(0, "run_attempt_count", "INTEGER", null, true, 1));
            hashMap2.put("backoff_policy", new C1682d.C1683a(0, "backoff_policy", "INTEGER", null, true, 1));
            hashMap2.put("backoff_delay_duration", new C1682d.C1683a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
            hashMap2.put("period_start_time", new C1682d.C1683a(0, "period_start_time", "INTEGER", null, true, 1));
            hashMap2.put("minimum_retention_duration", new C1682d.C1683a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
            hashMap2.put("schedule_requested_at", new C1682d.C1683a(0, "schedule_requested_at", "INTEGER", null, true, 1));
            hashMap2.put("run_in_foreground", new C1682d.C1683a(0, "run_in_foreground", "INTEGER", null, true, 1));
            hashMap2.put("out_of_quota_policy", new C1682d.C1683a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
            hashMap2.put("required_network_type", new C1682d.C1683a(0, "required_network_type", "INTEGER", null, false, 1));
            hashMap2.put("requires_charging", new C1682d.C1683a(0, "requires_charging", "INTEGER", null, true, 1));
            hashMap2.put("requires_device_idle", new C1682d.C1683a(0, "requires_device_idle", "INTEGER", null, true, 1));
            hashMap2.put("requires_battery_not_low", new C1682d.C1683a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
            hashMap2.put("requires_storage_not_low", new C1682d.C1683a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
            hashMap2.put("trigger_content_update_delay", new C1682d.C1683a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
            hashMap2.put("trigger_max_content_delay", new C1682d.C1683a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
            hashMap2.put("content_uri_triggers", new C1682d.C1683a(0, "content_uri_triggers", "BLOB", null, false, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C1682d.C1686d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
            hashSet4.add(new C1682d.C1686d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
            C1682d c1682d2 = new C1682d("WorkSpec", hashMap2, hashSet3, hashSet4);
            C1682d m10057a2 = C1682d.m10057a(c1707a, "WorkSpec");
            if (!c1682d2.equals(m10057a2)) {
                return new C1672j.C1674b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c1682d2 + "\n Found:\n" + m10057a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C1682d.C1683a(1, "tag", "TEXT", null, true, 1));
            hashMap3.put("work_spec_id", new C1682d.C1683a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C1682d.C1686d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
            C1682d c1682d3 = new C1682d("WorkTag", hashMap3, hashSet5, hashSet6);
            C1682d m10057a3 = C1682d.m10057a(c1707a, "WorkTag");
            if (!c1682d3.equals(m10057a3)) {
                return new C1672j.C1674b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c1682d3 + "\n Found:\n" + m10057a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C1682d.C1683a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap4.put("system_id", new C1682d.C1683a(0, "system_id", "INTEGER", null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            C1682d c1682d4 = new C1682d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C1682d m10057a4 = C1682d.m10057a(c1707a, "SystemIdInfo");
            if (!c1682d4.equals(m10057a4)) {
                return new C1672j.C1674b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c1682d4 + "\n Found:\n" + m10057a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C1682d.C1683a(1, "name", "TEXT", null, true, 1));
            hashMap5.put("work_spec_id", new C1682d.C1683a(2, "work_spec_id", "TEXT", null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C1682d.C1686d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
            C1682d c1682d5 = new C1682d("WorkName", hashMap5, hashSet8, hashSet9);
            C1682d m10057a5 = C1682d.m10057a(c1707a, "WorkName");
            if (!c1682d5.equals(m10057a5)) {
                return new C1672j.C1674b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c1682d5 + "\n Found:\n" + m10057a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C1682d.C1683a(1, "work_spec_id", "TEXT", null, true, 1));
            hashMap6.put("progress", new C1682d.C1683a(0, "progress", "BLOB", null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C1682d.C1684b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookAdapter.KEY_ID)));
            C1682d c1682d6 = new C1682d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C1682d m10057a6 = C1682d.m10057a(c1707a, "WorkProgress");
            if (!c1682d6.equals(m10057a6)) {
                return new C1672j.C1674b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c1682d6 + "\n Found:\n" + m10057a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C1682d.C1683a(1, "key", "TEXT", null, true, 1));
            hashMap7.put("long_value", new C1682d.C1683a(0, "long_value", "INTEGER", null, false, 1));
            C1682d c1682d7 = new C1682d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C1682d m10057a7 = C1682d.m10057a(c1707a, "Preference");
            if (c1682d7.equals(m10057a7)) {
                return new C1672j.C1674b(true, null);
            }
            return new C1672j.C1674b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c1682d7 + "\n Found:\n" + m10057a7);
        }
    }

    @Override // androidx.room.AbstractC1668i
    /* renamed from: d */
    public final C1663h mo9900d() {
        return new C1663h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.AbstractC1668i
    /* renamed from: e */
    public final InterfaceC1702c mo9899e(C1656a c1656a) {
        C1672j c1672j = new C1672j(c1656a, new C1842a());
        Context context = c1656a.f4021b;
        if (context != null) {
            return c1656a.f4020a.mo9821a(new InterfaceC1702c.C1704b(context, c1656a.f4022c, c1672j, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: i */
    public final InterfaceC1918b mo9898i() {
        C1919c c1919c;
        if (this.f4469m != null) {
            return this.f4469m;
        }
        synchronized (this) {
            if (this.f4469m == null) {
                this.f4469m = new C1919c(this);
            }
            c1919c = this.f4469m;
        }
        return c1919c;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: j */
    public final InterfaceC1922e mo9897j() {
        C1923f c1923f;
        if (this.f4474r != null) {
            return this.f4474r;
        }
        synchronized (this) {
            if (this.f4474r == null) {
                this.f4474r = new C1923f(this);
            }
            c1923f = this.f4474r;
        }
        return c1923f;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: k */
    public final InterfaceC1926h mo9896k() {
        C1927i c1927i;
        if (this.f4471o != null) {
            return this.f4471o;
        }
        synchronized (this) {
            if (this.f4471o == null) {
                this.f4471o = new C1927i(this);
            }
            c1927i = this.f4471o;
        }
        return c1927i;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: l */
    public final InterfaceC1931k mo9895l() {
        C1932l c1932l;
        if (this.f4472p != null) {
            return this.f4472p;
        }
        synchronized (this) {
            if (this.f4472p == null) {
                this.f4472p = new C1932l(this);
            }
            c1932l = this.f4472p;
        }
        return c1932l;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: m */
    public final InterfaceC1935n mo9894m() {
        C1936o c1936o;
        if (this.f4473q != null) {
            return this.f4473q;
        }
        synchronized (this) {
            if (this.f4473q == null) {
                this.f4473q = new C1936o(this);
            }
            c1936o = this.f4473q;
        }
        return c1936o;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: n */
    public final InterfaceC1942q mo9893n() {
        C1943r c1943r;
        if (this.f4468l != null) {
            return this.f4468l;
        }
        synchronized (this) {
            if (this.f4468l == null) {
                this.f4468l = new C1943r(this);
            }
            c1943r = this.f4468l;
        }
        return c1943r;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: o */
    public final InterfaceC1953t mo9892o() {
        C1954u c1954u;
        if (this.f4470n != null) {
            return this.f4470n;
        }
        synchronized (this) {
            if (this.f4470n == null) {
                this.f4470n = new C1954u(this);
            }
            c1954u = this.f4470n;
        }
        return c1954u;
    }
}
