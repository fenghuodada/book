package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.C1719b;
import com.ambrose.overwall.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.startup.a */
/* loaded from: classes.dex */
public final class C1715a {

    /* renamed from: d */
    public static volatile C1715a f4172d;

    /* renamed from: e */
    public static final Object f4173e = new Object();
    @NonNull

    /* renamed from: c */
    public final Context f4176c;
    @NonNull

    /* renamed from: b */
    public final HashSet f4175b = new HashSet();
    @NonNull

    /* renamed from: a */
    public final HashMap f4174a = new HashMap();

    public C1715a(@NonNull Context context) {
        this.f4176c = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: c */
    public static C1715a m10013c(@NonNull Context context) {
        if (f4172d == null) {
            synchronized (f4173e) {
                if (f4172d == null) {
                    f4172d = new C1715a(context);
                }
            }
        }
        return f4172d;
    }

    /* renamed from: a */
    public final void m10015a(@Nullable Bundle bundle) {
        HashSet hashSet;
        String string = this.f4176c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4175b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1716b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m10014b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C1717c(e);
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public final Object m10014b(@NonNull Class cls, @NonNull HashSet hashSet) {
        Object obj;
        if (C1719b.m10011a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f4174a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                InterfaceC1716b interfaceC1716b = (InterfaceC1716b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC1716b<?>>> dependencies = interfaceC1716b.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends InterfaceC1716b<?>> cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            m10014b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC1716b.mo9910a(this.f4176c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
