package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.AbstractC1668i;
import androidx.room.C1675k;
import androidx.room.util.C1680b;
import androidx.work.AbstractC2005l;
import androidx.work.C1833d;
import androidx.work.C1837f;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1925g;
import androidx.work.impl.model.C1927i;
import androidx.work.impl.model.C1932l;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.C1954u;
import androidx.work.impl.model.C1956v;
import androidx.work.impl.model.InterfaceC1926h;
import androidx.work.impl.model.InterfaceC1931k;
import androidx.work.impl.model.InterfaceC1942q;
import androidx.work.impl.model.InterfaceC1953t;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: a */
    public static final String f4864a = AbstractC2005l.m9732e("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    /* renamed from: a */
    public static String m9734a(@NonNull InterfaceC1931k interfaceC1931k, @NonNull InterfaceC1953t interfaceC1953t, @NonNull InterfaceC1926h interfaceC1926h, @NonNull ArrayList arrayList) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1940p c1940p = (C1940p) it.next();
            C1925g m9806a = ((C1927i) interfaceC1926h).m9806a(c1940p.f4690a);
            if (m9806a != null) {
                num = Integer.valueOf(m9806a.f4676b);
            } else {
                num = null;
            }
            String str = c1940p.f4690a;
            C1932l c1932l = (C1932l) interfaceC1931k;
            c1932l.getClass();
            C1675k m10068d = C1675k.m10068d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                m10068d.m10066f(1);
            } else {
                m10068d.m10065g(1, str);
            }
            AbstractC1668i abstractC1668i = c1932l.f4682a;
            abstractC1668i.m10075b();
            Cursor m10072g = abstractC1668i.m10072g(m10068d);
            try {
                ArrayList arrayList2 = new ArrayList(m10072g.getCount());
                while (m10072g.moveToNext()) {
                    arrayList2.add(m10072g.getString(0));
                }
                m10072g.close();
                m10068d.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c1940p.f4690a, c1940p.f4692c, num, c1940p.f4691b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((C1954u) interfaceC1953t).m9787a(c1940p.f4690a))));
            } catch (Throwable th) {
                m10072g.close();
                m10068d.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.AbstractC1822a doWork() {
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
        ArrayList arrayList;
        InterfaceC1926h interfaceC1926h;
        InterfaceC1931k interfaceC1931k;
        InterfaceC1953t interfaceC1953t;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WorkDatabase workDatabase = C1915l.m9816c(getApplicationContext()).f4657c;
        InterfaceC1942q mo9893n = workDatabase.mo9893n();
        InterfaceC1931k mo9895l = workDatabase.mo9895l();
        InterfaceC1953t mo9892o = workDatabase.mo9892o();
        InterfaceC1926h mo9896k = workDatabase.mo9896k();
        C1943r c1943r = (C1943r) mo9893n;
        c1943r.getClass();
        C1675k m10068d = C1675k.m10068d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        m10068d.m10067e(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        AbstractC1668i abstractC1668i = c1943r.f4710a;
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
            int i2 = m10059a14;
            ArrayList arrayList2 = new ArrayList(m10072g.getCount());
            while (true) {
                arrayList = arrayList2;
                if (!m10072g.moveToNext()) {
                    break;
                }
                String string = m10072g.getString(m10059a9);
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
                int i7 = i2;
                c1940p.f4695f = C1837f.m9904a(m10072g.getBlob(i7));
                i2 = i7;
                int i8 = m10059a12;
                int i9 = m10059a15;
                c1940p.f4696g = m10072g.getLong(i9);
                int i10 = m10059a13;
                int i11 = m10059a16;
                c1940p.f4697h = m10072g.getLong(i11);
                int i12 = m10059a10;
                int i13 = m10059a17;
                c1940p.f4698i = m10072g.getLong(i13);
                int i14 = m10059a18;
                c1940p.f4700k = m10072g.getInt(i14);
                int i15 = m10059a19;
                c1940p.f4701l = C1956v.m9783b(m10072g.getInt(i15));
                m10059a17 = i13;
                int i16 = m10059a20;
                c1940p.f4702m = m10072g.getLong(i16);
                int i17 = m10059a21;
                c1940p.f4703n = m10072g.getLong(i17);
                m10059a21 = i17;
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
                m10059a25 = i21;
                m10059a13 = i10;
                m10059a2 = i5;
                m10059a16 = i11;
                m10059a18 = i14;
                m10059a23 = i19;
                m10059a24 = i20;
                m10059a22 = i18;
                m10059a15 = i9;
                m10059a12 = i8;
                m10059a3 = i6;
                m10059a = i4;
                arrayList2 = arrayList;
                m10059a11 = i3;
                m10059a20 = i16;
                m10059a10 = i12;
                m10059a19 = i15;
            }
            m10072g.close();
            c1675k.release();
            ArrayList m9798d = c1943r.m9798d();
            ArrayList m9800b = c1943r.m9800b();
            boolean isEmpty = arrayList.isEmpty();
            String str = f4864a;
            if (!isEmpty) {
                i = 0;
                AbstractC2005l.m9733c().mo9729d(str, "Recently completed work:\n\n", new Throwable[0]);
                interfaceC1926h = mo9896k;
                interfaceC1931k = mo9895l;
                interfaceC1953t = mo9892o;
                AbstractC2005l.m9733c().mo9729d(str, m9734a(interfaceC1931k, interfaceC1953t, interfaceC1926h, arrayList), new Throwable[0]);
            } else {
                interfaceC1926h = mo9896k;
                interfaceC1931k = mo9895l;
                interfaceC1953t = mo9892o;
                i = 0;
            }
            if (!m9798d.isEmpty()) {
                AbstractC2005l.m9733c().mo9729d(str, "Running work:\n\n", new Throwable[i]);
                AbstractC2005l.m9733c().mo9729d(str, m9734a(interfaceC1931k, interfaceC1953t, interfaceC1926h, m9798d), new Throwable[i]);
            }
            if (!m9800b.isEmpty()) {
                AbstractC2005l.m9733c().mo9729d(str, "Enqueued work:\n\n", new Throwable[i]);
                AbstractC2005l.m9733c().mo9729d(str, m9734a(interfaceC1931k, interfaceC1953t, interfaceC1926h, m9800b), new Throwable[i]);
            }
            return new ListenableWorker.AbstractC1822a.C1825c();
        } catch (Throwable th2) {
            th = th2;
            m10072g.close();
            c1675k.release();
            throw th;
        }
    }
}
