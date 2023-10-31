package kotlin.jvm.internal;

import androidx.core.content.C0663f;
import com.adcolony.sdk.C2362x3;
import java.util.Arrays;
import kotlin.C10867o;

/* renamed from: kotlin.jvm.internal.j */
/* loaded from: classes3.dex */
public final class C10843j {
    /* renamed from: a */
    public static boolean m435a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m434b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m426j(C10843j.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    /* renamed from: c */
    public static void m433c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m426j(C10843j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m432d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m426j(C10843j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m431e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m426j(C10843j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m430f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m427i(str));
        m426j(C10843j.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: g */
    public static void m429g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m427i(str));
        m426j(C10843j.class.getName(), illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: h */
    public static int m428h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: i */
    public static String m427i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C10843j.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder m9460b = C2362x3.m9460b("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        m9460b.append(str);
        return m9460b.toString();
    }

    /* renamed from: j */
    public static void m426j(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: k */
    public static String m425k(Object obj, String str) {
        return str + obj;
    }

    /* renamed from: l */
    public static void m424l(String str) {
        C10867o c10867o = new C10867o(C0663f.m12005a("lateinit property ", str, " has not been initialized"));
        m426j(C10843j.class.getName(), c10867o);
        throw c10867o;
    }
}
