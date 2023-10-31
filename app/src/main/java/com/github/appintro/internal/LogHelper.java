package com.github.appintro.internal;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import kotlin.reflect.InterfaceC10885c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J$\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J$\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0014¨\u0006\u0017"}, m508d2 = {"Lcom/github/appintro/internal/LogHelper;", "", "Ljava/lang/Class;", "cls", "", "makeLogTag", "tag", "", "length", "cutTagLength", "message", "d", "v", "i", "", "throwable", "Lkotlin/p;", "w", "e", "wtf", "Lkotlin/reflect/c;", "<init>", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class LogHelper {
    @NotNull
    public static final LogHelper INSTANCE = new LogHelper();

    private LogHelper() {
    }

    private final String cutTagLength(String str, int i) {
        if (str.length() > i) {
            String substring = str.substring(0, i - 1);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    @JvmStatic
    /* renamed from: d */
    public static final int m6363d(@NotNull String tag, @NotNull String message) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        return Log.d(tag, message);
    }

    @JvmStatic
    @JvmOverloads
    /* renamed from: e */
    public static final void m6362e(@NotNull String str, @NotNull String str2) {
        e$default(str, str2, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    /* renamed from: e */
    public static final void m6361e(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        Log.e(tag, message, th);
    }

    public static /* synthetic */ void e$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        m6361e(str, str2, th);
    }

    @JvmStatic
    /* renamed from: i */
    public static final int m6360i(@NotNull String tag, @NotNull String message) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        return Log.i(tag, message);
    }

    @JvmStatic
    @NotNull
    public static final String makeLogTag(@NotNull Class<?> cls) {
        C10843j.m430f(cls, "cls");
        return "Log: " + INSTANCE.cutTagLength(cls.getSimpleName(), 18);
    }

    @JvmStatic
    /* renamed from: v */
    public static final int m6359v(@NotNull String tag, @NotNull String message) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        return Log.v(tag, message);
    }

    @JvmStatic
    @JvmOverloads
    /* renamed from: w */
    public static final void m6358w(@NotNull String str, @NotNull String str2) {
        w$default(str, str2, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    /* renamed from: w */
    public static final void m6357w(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        Log.w(tag, message, th);
    }

    public static /* synthetic */ void w$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        m6357w(str, str2, th);
    }

    @JvmStatic
    @JvmOverloads
    public static final void wtf(@NotNull String str, @NotNull String str2) {
        wtf$default(str, str2, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void wtf(@NotNull String tag, @NotNull String message, @Nullable Throwable th) {
        C10843j.m430f(tag, "tag");
        C10843j.m430f(message, "message");
        Log.wtf(tag, message, th);
    }

    public static /* synthetic */ void wtf$default(String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        wtf(str, str2, th);
    }

    @NotNull
    public final String makeLogTag(@NotNull InterfaceC10885c<?> cls) {
        C10843j.m430f(cls, "cls");
        StringBuilder sb = new StringBuilder("Log: ");
        String mo410b = cls.mo410b();
        if (mo410b == null) {
            mo410b = "";
        }
        sb.append(cutTagLength(mo410b, 18));
        return sb.toString();
    }
}
