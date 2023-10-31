package androidx.room;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.migration.AbstractC1678a;
import androidx.sqlite.p004db.InterfaceC1701b;
import androidx.sqlite.p004db.InterfaceC1702c;
import androidx.sqlite.p004db.InterfaceC1706d;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.room.i */
/* loaded from: classes.dex */
public abstract class AbstractC1668i {
    @Deprecated

    /* renamed from: a */
    public volatile InterfaceC1701b f4050a;

    /* renamed from: b */
    public Executor f4051b;

    /* renamed from: c */
    public InterfaceC1702c f4052c;

    /* renamed from: d */
    public final C1663h f4053d;

    /* renamed from: e */
    public boolean f4054e;

    /* renamed from: f */
    public boolean f4055f;
    @Nullable
    @Deprecated

    /* renamed from: g */
    public List<AbstractC1670b> f4056g;

    /* renamed from: h */
    public final ReentrantReadWriteLock f4057h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal<Integer> f4058i = new ThreadLocal<>();

    /* renamed from: androidx.room.i$a */
    /* loaded from: classes.dex */
    public static class C1669a<T extends AbstractC1668i> {

        /* renamed from: b */
        public final String f4060b;

        /* renamed from: c */
        public final Context f4061c;

        /* renamed from: d */
        public ArrayList<AbstractC1670b> f4062d;

        /* renamed from: e */
        public Executor f4063e;

        /* renamed from: f */
        public Executor f4064f;

        /* renamed from: g */
        public InterfaceC1702c.InterfaceC1705c f4065g;

        /* renamed from: h */
        public boolean f4066h;

        /* renamed from: j */
        public boolean f4068j;

        /* renamed from: l */
        public HashSet f4070l;

        /* renamed from: a */
        public final Class<T> f4059a = WorkDatabase.class;

        /* renamed from: i */
        public boolean f4067i = true;

        /* renamed from: k */
        public final C1671c f4069k = new C1671c();

        public C1669a(@NonNull Context context, @Nullable String str) {
            this.f4061c = context;
            this.f4060b = str;
        }

        @NonNull
        /* renamed from: a */
        public final void m10070a(@NonNull AbstractC1678a... abstractC1678aArr) {
            if (this.f4070l == null) {
                this.f4070l = new HashSet();
            }
            for (AbstractC1678a abstractC1678a : abstractC1678aArr) {
                this.f4070l.add(Integer.valueOf(abstractC1678a.f4091a));
                this.f4070l.add(Integer.valueOf(abstractC1678a.f4092b));
            }
            C1671c c1671c = this.f4069k;
            c1671c.getClass();
            for (AbstractC1678a abstractC1678a2 : abstractC1678aArr) {
                int i = abstractC1678a2.f4091a;
                HashMap<Integer, TreeMap<Integer, AbstractC1678a>> hashMap = c1671c.f4071a;
                TreeMap<Integer, AbstractC1678a> treeMap = hashMap.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    hashMap.put(Integer.valueOf(i), treeMap);
                }
                int i2 = abstractC1678a2.f4092b;
                AbstractC1678a abstractC1678a3 = treeMap.get(Integer.valueOf(i2));
                if (abstractC1678a3 != null) {
                    Log.w("ROOM", "Overriding migration " + abstractC1678a3 + " with " + abstractC1678a2);
                }
                treeMap.put(Integer.valueOf(i2), abstractC1678a2);
            }
        }
    }

    /* renamed from: androidx.room.i$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1670b {
        /* renamed from: a */
        public void mo9820a(@NonNull C1707a c1707a) {
        }
    }

    /* renamed from: androidx.room.i$c */
    /* loaded from: classes.dex */
    public static class C1671c {

        /* renamed from: a */
        public final HashMap<Integer, TreeMap<Integer, AbstractC1678a>> f4071a = new HashMap<>();
    }

    public AbstractC1668i() {
        new ConcurrentHashMap();
        this.f4053d = mo9900d();
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void m10076a() {
        boolean z;
        if (this.f4054e) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: b */
    public final void m10075b() {
        if (!((C1707a) this.f4052c.mo10024r()).f4156a.inTransaction() && this.f4058i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public final void m10074c() {
        m10076a();
        InterfaceC1701b mo10024r = this.f4052c.mo10024r();
        this.f4053d.m10080c(mo10024r);
        ((C1707a) mo10024r).m10032a();
    }

    @NonNull
    /* renamed from: d */
    public abstract C1663h mo9900d();

    @NonNull
    /* renamed from: e */
    public abstract InterfaceC1702c mo9899e(C1656a c1656a);

    @Deprecated
    /* renamed from: f */
    public final void m10073f() {
        ((C1707a) this.f4052c.mo10024r()).m10031c();
        if (!((C1707a) this.f4052c.mo10024r()).f4156a.inTransaction()) {
            C1663h c1663h = this.f4053d;
            if (c1663h.f4038d.compareAndSet(false, true)) {
                c1663h.f4037c.f4051b.execute(c1663h.f4043i);
            }
        }
    }

    @NonNull
    /* renamed from: g */
    public final Cursor m10072g(@NonNull InterfaceC1706d interfaceC1706d) {
        m10076a();
        m10075b();
        return ((C1707a) this.f4052c.mo10024r()).m10028f(interfaceC1706d);
    }

    @Deprecated
    /* renamed from: h */
    public final void m10071h() {
        ((C1707a) this.f4052c.mo10024r()).m10026h();
    }
}
