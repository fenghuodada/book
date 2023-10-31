package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.annotations.NonNull;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.rxjava3.exceptions.a */
/* loaded from: classes3.dex */
public final class C10164a extends RuntimeException {

    /* renamed from: a */
    public final List<Throwable> f20426a;

    /* renamed from: b */
    public final String f20427b;

    /* renamed from: c */
    public Throwable f20428c;

    /* renamed from: io.reactivex.rxjava3.exceptions.a$a */
    /* loaded from: classes3.dex */
    public static final class C10165a extends RuntimeException {
        public C10165a(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: io.reactivex.rxjava3.exceptions.a$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC10166b {
        /* renamed from: a */
        public abstract void mo1214a(String str);
    }

    /* renamed from: io.reactivex.rxjava3.exceptions.a$c */
    /* loaded from: classes3.dex */
    public static final class C10167c extends AbstractC10166b {

        /* renamed from: a */
        public final PrintStream f20429a;

        public C10167c(PrintStream printStream) {
            this.f20429a = printStream;
        }

        @Override // io.reactivex.rxjava3.exceptions.C10164a.AbstractC10166b
        /* renamed from: a */
        public final void mo1214a(String str) {
            this.f20429a.println((Object) str);
        }
    }

    /* renamed from: io.reactivex.rxjava3.exceptions.a$d */
    /* loaded from: classes3.dex */
    public static final class C10168d extends AbstractC10166b {

        /* renamed from: a */
        public final PrintWriter f20430a;

        public C10168d(PrintWriter printWriter) {
            this.f20430a = printWriter;
        }

        @Override // io.reactivex.rxjava3.exceptions.C10164a.AbstractC10166b
        /* renamed from: a */
        public final void mo1214a(String str) {
            this.f20430a.println((Object) str);
        }
    }

    public C10164a(@NonNull List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            for (Object obj : list) {
                if (obj instanceof C10164a) {
                    linkedHashSet.addAll(((C10164a) obj).f20426a);
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List<Throwable> unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.f20426a = unmodifiableList;
            this.f20427b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public C10164a(@NonNull Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* renamed from: a */
    public static void m1216a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m1216a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final void m1215b(AbstractC10166b abstractC10166b) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f20426a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m1216a(sb, th, "\t");
            i++;
        }
        abstractC10166b.mo1214a(sb.toString());
    }

    @Override // java.lang.Throwable
    @NonNull
    public final synchronized Throwable getCause() {
        Throwable th;
        int i;
        String[] split;
        if (this.f20428c == null) {
            String property = System.getProperty("line.separator");
            if (this.f20426a.size() > 1) {
                IdentityHashMap identityHashMap = new IdentityHashMap();
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple exceptions (");
                sb.append(this.f20426a.size());
                sb.append(")");
                sb.append(property);
                for (Throwable th2 : this.f20426a) {
                    int i2 = 0;
                    while (true) {
                        if (th2 != null) {
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(th2.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = th2.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb.append(message);
                                sb.append(property);
                            } else {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i4 = 0; i4 < i2 + 2; i4++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            }
                            int i5 = 0;
                            while (true) {
                                i = i2 + 2;
                                if (i5 >= i) {
                                    break;
                                }
                                sb.append("  ");
                                i5++;
                            }
                            StackTraceElement[] stackTrace = th2.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (identityHashMap.containsKey(th2)) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    for (int i6 = 0; i6 < i; i6++) {
                                        sb.append("  ");
                                    }
                                    sb.append("|-- ");
                                    sb.append("(cause not expanded again) ");
                                    sb.append(cause.getClass().getCanonicalName());
                                    sb.append(": ");
                                    sb.append(cause.getMessage());
                                    sb.append(property);
                                }
                            } else {
                                identityHashMap.put(th2, Boolean.TRUE);
                                th2 = th2.getCause();
                                i2++;
                            }
                        }
                    }
                }
                th = new C10165a(sb.toString().trim());
            } else {
                th = this.f20426a.get(0);
            }
            this.f20428c = th;
        }
        return this.f20428c;
    }

    @Override // java.lang.Throwable
    @NonNull
    public final String getMessage() {
        return this.f20427b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m1215b(new C10167c(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m1215b(new C10168d(printWriter));
    }
}
