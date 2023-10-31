package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.BuildCompat;
import androidx.work.AbstractC2005l;
import androidx.work.C1839g;
import androidx.work.InterfaceC1840h;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.futures.C1977c;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.UUID;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.o */
/* loaded from: classes.dex */
public final class RunnableC1987o implements Runnable {

    /* renamed from: g */
    public static final String f4819g = AbstractC2005l.m9732e("WorkForegroundRunnable");

    /* renamed from: a */
    public final C1977c<Void> f4820a = new C1977c<>();

    /* renamed from: b */
    public final Context f4821b;

    /* renamed from: c */
    public final C1940p f4822c;

    /* renamed from: d */
    public final ListenableWorker f4823d;

    /* renamed from: e */
    public final InterfaceC1840h f4824e;

    /* renamed from: f */
    public final InterfaceC1998a f4825f;

    /* renamed from: androidx.work.impl.utils.o$a */
    /* loaded from: classes.dex */
    public class RunnableC1988a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1977c f4826a;

        public RunnableC1988a(C1977c c1977c) {
            this.f4826a = c1977c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4826a.m9748j(RunnableC1987o.this.f4823d.getForegroundInfoAsync());
        }
    }

    /* renamed from: androidx.work.impl.utils.o$b */
    /* loaded from: classes.dex */
    public class RunnableC1989b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1977c f4828a;

        public RunnableC1989b(C1977c c1977c) {
            this.f4828a = c1977c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC1987o runnableC1987o = RunnableC1987o.this;
            try {
                C1839g c1839g = (C1839g) this.f4828a.get();
                if (c1839g != null) {
                    AbstractC2005l m9733c = AbstractC2005l.m9733c();
                    String str = RunnableC1987o.f4819g;
                    Object[] objArr = new Object[1];
                    C1940p c1940p = runnableC1987o.f4822c;
                    ListenableWorker listenableWorker = runnableC1987o.f4823d;
                    objArr[0] = c1940p.f4692c;
                    m9733c.mo9731a(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    C1977c<Void> c1977c = runnableC1987o.f4820a;
                    InterfaceC1840h interfaceC1840h = runnableC1987o.f4824e;
                    Context context = runnableC1987o.f4821b;
                    UUID id = listenableWorker.getId();
                    C1991q c1991q = (C1991q) interfaceC1840h;
                    c1991q.getClass();
                    C1977c c1977c2 = new C1977c();
                    ((C1999b) c1991q.f4835a).m9738a(new RunnableC1990p(c1991q, c1977c2, id, c1839g, context));
                    c1977c.m9748j(c1977c2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", runnableC1987o.f4822c.f4692c));
            } catch (Throwable th) {
                runnableC1987o.f4820a.m9749i(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public RunnableC1987o(@NonNull Context context, @NonNull C1940p c1940p, @NonNull ListenableWorker listenableWorker, @NonNull InterfaceC1840h interfaceC1840h, @NonNull InterfaceC1998a interfaceC1998a) {
        this.f4821b = context;
        this.f4822c = c1940p;
        this.f4823d = listenableWorker;
        this.f4824e = interfaceC1840h;
        this.f4825f = interfaceC1998a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.f4822c.f4706q && !BuildCompat.m11867b()) {
            C1977c c1977c = new C1977c();
            C1999b c1999b = (C1999b) this.f4825f;
            c1999b.f4855c.execute(new RunnableC1988a(c1977c));
            c1977c.addListener(new RunnableC1989b(c1977c), c1999b.f4855c);
            return;
        }
        this.f4820a.m9750h(null);
    }
}
