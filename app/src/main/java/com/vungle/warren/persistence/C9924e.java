package com.vungle.warren.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.utility.C10083e;
import com.vungle.warren.utility.C10089k;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.warren.persistence.e */
/* loaded from: classes3.dex */
public final class C9924e {

    /* renamed from: a */
    public final File f19919a;

    /* renamed from: b */
    public final Executor f19920b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, Object> f19921c;

    /* renamed from: d */
    public final SharedPreferences f19922d;

    /* renamed from: e */
    public final HashSet<String> f19923e;

    /* renamed from: com.vungle.warren.persistence.e$a */
    /* loaded from: classes3.dex */
    public class RunnableC9925a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Serializable f19924a;

        public RunnableC9925a(HashMap hashMap) {
            this.f19924a = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10089k.m1264f(C9924e.this.f19919a, this.f19924a);
        }
    }

    @SuppressLint({"NewApi"})
    public C9924e(Context context, C10111y c10111y) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.f19921c = concurrentHashMap;
        this.f19923e = new HashSet<>();
        this.f19920b = c10111y;
        File file = new File(context.getNoBackupFilesDir(), "vungle_settings");
        this.f19919a = file;
        File file2 = new File(context.getFilesDir(), "vungle_settings");
        if (file2.exists() && !file2.renameTo(file)) {
            VungleLogger.m1603c("FilePreferences", "Can't move old FilePreferences");
        }
        Object m1266d = C10089k.m1266d(file);
        if (m1266d instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) m1266d);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.vungle.sdk", 0);
        this.f19922d = sharedPreferences;
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Boolean) {
                m1404g(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                m1406e(entry.getKey(), (String) value);
            } else if (value instanceof Integer) {
                m1407d(((Integer) value).intValue(), entry.getKey());
            } else if (value instanceof HashSet) {
                m1405f(entry.getKey(), (HashSet) value);
            }
        }
        sharedPreferences.edit().clear().apply();
        m1410a();
    }

    /* renamed from: a */
    public final void m1410a() {
        this.f19920b.execute(new RunnableC9925a(new HashMap(this.f19921c)));
    }

    /* renamed from: b */
    public final boolean m1409b(String str) {
        Object obj = this.f19921c.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final String m1408c(String str, String str2) {
        Object obj = this.f19921c.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    /* renamed from: d */
    public final void m1407d(int i, @NonNull String str) {
        this.f19921c.put(str, Integer.valueOf(i));
        if (this.f19923e.contains(str)) {
            this.f19922d.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: e */
    public final void m1406e(@NonNull String str, @NonNull String str2) {
        this.f19921c.put(str, str2);
        if (this.f19923e.contains(str)) {
            this.f19922d.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: f */
    public final void m1405f(@NonNull String str, @NonNull HashSet hashSet) {
        this.f19921c.put(str, C10083e.m1274b(hashSet));
        if (this.f19923e.contains(str)) {
            this.f19922d.edit().putStringSet(str, C10083e.m1274b(hashSet)).apply();
        }
    }

    /* renamed from: g */
    public final void m1404g(@NonNull String str, boolean z) {
        this.f19921c.put(str, Boolean.valueOf(z));
        if (this.f19923e.contains(str)) {
            this.f19922d.edit().putBoolean(str, z).apply();
        }
    }
}
