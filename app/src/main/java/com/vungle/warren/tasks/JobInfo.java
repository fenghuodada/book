package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class JobInfo implements Cloneable {

    /* renamed from: a */
    public final String f20050a;

    /* renamed from: b */
    public boolean f20051b;

    /* renamed from: c */
    public long f20052c;

    /* renamed from: d */
    public long f20053d;

    /* renamed from: e */
    public long f20054e;

    /* renamed from: f */
    public Bundle f20055f = new Bundle();

    /* renamed from: g */
    public int f20056g = 1;

    /* renamed from: h */
    public int f20057h = 2;
    @NetworkType

    /* renamed from: i */
    public int f20058i = 0;

    /* loaded from: classes3.dex */
    public @interface NetworkType {
        public static final int ANY = 0;
        public static final int CONNECTED = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Priority {
        public static final int CRITICAL = 5;
        public static final int HIGH = 3;
        public static final int HIGHEST = 4;
        public static final int LOW = 1;
        public static final int LOWEST = 0;
        public static final int NORMAL = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ReschedulePolicy {
        public static final int EXPONENTIAL = 1;
        public static final int LINEAR = 0;
    }

    public JobInfo(@NonNull String str) {
        this.f20050a = str;
    }

    /* renamed from: a */
    public final JobInfo m1361a() {
        try {
            return (JobInfo) clone();
        } catch (CloneNotSupportedException e) {
            Log.e("JobInfo", Log.getStackTraceString(e));
            return null;
        }
    }
}
