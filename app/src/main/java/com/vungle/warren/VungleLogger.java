package com.vungle.warren;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.measurement.AppMeasurement;
import com.vungle.warren.log.C9835f;

/* loaded from: classes3.dex */
public final class VungleLogger {

    /* renamed from: c */
    public static final VungleLogger f19390c = new VungleLogger();

    /* renamed from: a */
    public LoggerLevel f19391a = LoggerLevel.DEBUG;

    /* renamed from: b */
    public C9835f f19392b;

    @Keep
    /* loaded from: classes3.dex */
    public enum LoggerLevel {
        VERBOSE(0, "verbose"),
        DEBUG(1, "debug"),
        INFO(2, "info"),
        WARNING(3, "warn"),
        ERROR(4, "error"),
        CRASH(5, AppMeasurement.CRASH_ORIGIN);
        
        private int level;
        private String levelString;

        LoggerLevel(int i, @NonNull String str) {
            this.level = i;
            this.levelString = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.levelString;
        }
    }

    /* renamed from: a */
    public static void m1605a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        Log.e(str, "[" + str2 + "] " + str3);
        m1603c(str2, str3);
    }

    /* renamed from: b */
    public static void m1604b(@NonNull String str, @NonNull String str2) {
        m1601e(LoggerLevel.DEBUG, str, str2);
    }

    /* renamed from: c */
    public static void m1603c(@NonNull String str, @NonNull String str2) {
        m1601e(LoggerLevel.ERROR, str, str2);
    }

    /* renamed from: d */
    public static void m1602d(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        Log.e(str, "[" + str2 + "] " + str3);
        m1603c(str2, str3);
    }

    /* renamed from: e */
    public static void m1601e(@NonNull LoggerLevel loggerLevel, @NonNull String str, @NonNull String str2) {
        boolean z;
        VungleLogger vungleLogger = f19390c;
        C9835f c9835f = vungleLogger.f19392b;
        if (c9835f == null) {
            Log.d("VungleLogger", "Please setup Logger first.");
        } else if (!c9835f.f19646f.get()) {
        } else {
            if (loggerLevel.level >= vungleLogger.f19391a.level) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            vungleLogger.f19392b.m1487b(loggerLevel, str, str2, null, null);
        }
    }

    /* renamed from: f */
    public static void m1600f(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        Log.v(str, "[" + str2 + "] " + str3);
        m1601e(LoggerLevel.VERBOSE, str2, str3);
    }

    /* renamed from: g */
    public static void m1599g(@NonNull String str, @NonNull String str2) {
        m1601e(LoggerLevel.WARNING, str, str2);
    }
}
