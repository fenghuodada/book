package androidx.core.p003os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@Deprecated
/* renamed from: androidx.core.os.q */
/* loaded from: classes.dex */
public final class C0749q {

    /* renamed from: a */
    public static final /* synthetic */ int f2431a = 0;

    @RequiresApi(18)
    /* renamed from: androidx.core.os.q$a */
    /* loaded from: classes.dex */
    public static class C0750a {
        @DoNotInline
        /* renamed from: a */
        public static void m11833a(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m11832b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }
}
