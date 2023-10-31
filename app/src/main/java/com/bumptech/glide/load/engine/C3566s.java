package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.s */
/* loaded from: classes.dex */
public final class C3566s extends Exception {

    /* renamed from: f */
    public static final StackTraceElement[] f9477f = new StackTraceElement[0];

    /* renamed from: a */
    public final List<Throwable> f9478a;

    /* renamed from: b */
    public InterfaceC3577g f9479b;

    /* renamed from: c */
    public EnumC3444a f9480c;

    /* renamed from: d */
    public Class<?> f9481d;

    /* renamed from: e */
    public final String f9482e;

    /* renamed from: com.bumptech.glide.load.engine.s$a */
    /* loaded from: classes.dex */
    public static final class C3567a implements Appendable {

        /* renamed from: a */
        public final Appendable f9483a;

        /* renamed from: b */
        public boolean f9484b = true;

        public C3567a(Appendable appendable) {
            this.f9483a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.f9484b;
            Appendable appendable = this.f9483a;
            if (z) {
                this.f9484b = false;
                appendable.append("  ");
            }
            this.f9484b = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.f9484b;
            Appendable appendable = this.f9483a;
            boolean z2 = false;
            if (z) {
                this.f9484b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.f9484b = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }

    public C3566s(String str) {
        this(str, Collections.emptyList());
    }

    public C3566s(String str, List<Throwable> list) {
        this.f9482e = str;
        setStackTrace(f9477f);
        this.f9478a = list;
    }

    /* renamed from: a */
    public static void m6618a(Throwable th, ArrayList arrayList) {
        if (th instanceof C3566s) {
            for (Throwable th2 : ((C3566s) th).f9478a) {
                m6618a(th2, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    /* renamed from: b */
    public static void m6617b(List list, C3567a c3567a) {
        try {
            m6616c(list, c3567a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m6616c(List list, C3567a c3567a) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c3567a.append("Cause (");
            int i2 = i + 1;
            c3567a.append(String.valueOf(i2));
            c3567a.append(" of ");
            c3567a.append(String.valueOf(size));
            c3567a.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C3566s) {
                ((C3566s) th).m6613f(c3567a);
            } else {
                m6615d(th, c3567a);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m6615d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: e */
    public final void m6614e() {
        ArrayList arrayList = new ArrayList();
        m6618a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    /* renamed from: f */
    public final void m6613f(Appendable appendable) {
        m6615d(this, appendable);
        m6617b(this.f9478a, new C3567a(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f9482e);
        String str4 = "";
        if (this.f9481d == null) {
            str = "";
        } else {
            str = ", " + this.f9481d;
        }
        sb.append(str);
        if (this.f9480c == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f9480c;
        }
        sb.append(str2);
        if (this.f9479b != null) {
            str4 = ", " + this.f9479b;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        m6618a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        m6613f(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        m6613f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        m6613f(printWriter);
    }
}
