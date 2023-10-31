package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.migration.AbstractC1678a;
import androidx.sqlite.p004db.framework.C1707a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.j */
/* loaded from: classes.dex */
public final class C1904j {
    @NonNull

    /* renamed from: a */
    public static final C1905a f4641a = new C1905a();
    @NonNull

    /* renamed from: b */
    public static final C1906b f4642b = new C1906b();
    @NonNull

    /* renamed from: c */
    public static final C1907c f4643c = new C1907c();
    @NonNull

    /* renamed from: d */
    public static final C1908d f4644d = new C1908d();
    @NonNull

    /* renamed from: e */
    public static final C1909e f4645e = new C1909e();
    @NonNull

    /* renamed from: f */
    public static final C1910f f4646f = new C1910f();
    @NonNull

    /* renamed from: g */
    public static final C1911g f4647g = new C1911g();

    /* renamed from: androidx.work.impl.j$a */
    /* loaded from: classes.dex */
    public class C1905a extends AbstractC1678a {
        public C1905a() {
            super(1, 2);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            c1707a.m10030d("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            c1707a.m10030d("DROP TABLE IF EXISTS alarmInfo");
            c1707a.m10030d("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.j$b */
    /* loaded from: classes.dex */
    public class C1906b extends AbstractC1678a {
        public C1906b() {
            super(3, 4);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* renamed from: androidx.work.impl.j$c */
    /* loaded from: classes.dex */
    public class C1907c extends AbstractC1678a {
        public C1907c() {
            super(4, 5);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            c1707a.m10030d("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.j$d */
    /* loaded from: classes.dex */
    public class C1908d extends AbstractC1678a {
        public C1908d() {
            super(6, 7);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.j$e */
    /* loaded from: classes.dex */
    public class C1909e extends AbstractC1678a {
        public C1909e() {
            super(7, 8);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.j$f */
    /* loaded from: classes.dex */
    public class C1910f extends AbstractC1678a {
        public C1910f() {
            super(8, 9);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.j$g */
    /* loaded from: classes.dex */
    public class C1911g extends AbstractC1678a {
        public C1911g() {
            super(11, 12);
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.j$h */
    /* loaded from: classes.dex */
    public static class C1912h extends AbstractC1678a {

        /* renamed from: c */
        public final Context f4648c;

        public C1912h(@NonNull Context context, int i, int i2) {
            super(i, i2);
            this.f4648c = context;
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            if (this.f4092b >= 10) {
                c1707a.f4156a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f4648c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* renamed from: androidx.work.impl.j$i */
    /* loaded from: classes.dex */
    public static class C1913i extends AbstractC1678a {

        /* renamed from: c */
        public final Context f4649c;

        public C1913i(@NonNull Context context) {
            super(9, 10);
            this.f4649c = context;
        }

        @Override // androidx.room.migration.AbstractC1678a
        /* renamed from: a */
        public final void mo9819a(@NonNull C1707a c1707a) {
            c1707a.m10030d("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f4649c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            boolean contains = sharedPreferences.contains("reschedule_needed");
            SQLiteDatabase sQLiteDatabase = c1707a.f4156a;
            if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                c1707a.m10032a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    c1707a.m10026h();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                c1707a.m10032a();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    c1707a.m10026h();
                } finally {
                }
            }
        }
    }
}
