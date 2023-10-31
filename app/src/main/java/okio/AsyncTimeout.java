package okio;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, m508d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "now", "remainingNanos", "Lkotlin/p;", "enter", "", "exit", "timedOut", "Lokio/Sink;", "sink", "Lokio/Source;", FirebaseAnalytics.Param.SOURCE, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "newTimeoutException", "inQueue", "Z", "next", "Lokio/AsyncTimeout;", "timeoutAt", "J", "<init>", "()V", "Companion", "Watchdog", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static AsyncTimeout head;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    @Metadata(m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m508d2 = {"Lokio/AsyncTimeout$Companion;", "", "Lokio/AsyncTimeout;", "node", "", "timeoutNanos", "", "hasDeadline", "Lkotlin/p;", "scheduleTimeout", "cancelScheduledTimeout", "awaitTimeout$okio", "()Lokio/AsyncTimeout;", "awaitTimeout", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/AsyncTimeout;", "<init>", "()V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            synchronized (AsyncTimeout.class) {
                for (AsyncTimeout asyncTimeout2 = AsyncTimeout.head; asyncTimeout2 != null; asyncTimeout2 = asyncTimeout2.next) {
                    if (asyncTimeout2.next == asyncTimeout) {
                        asyncTimeout2.next = asyncTimeout.next;
                        asyncTimeout.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0019, B:10:0x0025, B:11:0x002e, B:16:0x003f, B:17:0x0047, B:19:0x0050, B:22:0x0060, B:23:0x0065, B:25:0x0075, B:26:0x007a, B:15:0x0038, B:29:0x007e, B:30:0x0083), top: B:34:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0075 A[Catch: all -> 0x0084, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:7:0x0019, B:10:0x0025, B:11:0x002e, B:16:0x003f, B:17:0x0047, B:19:0x0050, B:22:0x0060, B:23:0x0065, B:25:0x0075, B:26:0x007a, B:15:0x0038, B:29:0x007e, B:30:0x0083), top: B:34:0x0003 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[EDGE_INSN: B:36:0x0065->B:23:0x0065 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void scheduleTimeout(okio.AsyncTimeout r6, long r7, boolean r9) {
            /*
                r5 = this;
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)
                okio.AsyncTimeout r1 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L84
                if (r1 != 0) goto L19
                okio.AsyncTimeout r1 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> L84
                r1.<init>()     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout.access$setHead$cp(r1)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout$Watchdog r1 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> L84
                r1.<init>()     // Catch: java.lang.Throwable -> L84
                r1.start()     // Catch: java.lang.Throwable -> L84
            L19:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L84
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L33
                if (r9 == 0) goto L33
                long r3 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L84
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L84
            L2e:
                long r7 = r7 + r1
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)     // Catch: java.lang.Throwable -> L84
                goto L3f
            L33:
                if (r3 == 0) goto L36
                goto L2e
            L36:
                if (r9 == 0) goto L7e
                long r7 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout.access$setTimeoutAt$p(r6, r7)     // Catch: java.lang.Throwable -> L84
            L3f:
                long r7 = okio.AsyncTimeout.access$remainingNanos(r6, r1)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout r9 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L84
            L47:
                kotlin.jvm.internal.C10843j.m433c(r9)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L84
                if (r3 == 0) goto L65
                okio.AsyncTimeout r3 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L84
                kotlin.jvm.internal.C10843j.m433c(r3)     // Catch: java.lang.Throwable -> L84
                long r3 = okio.AsyncTimeout.access$remainingNanos(r3, r1)     // Catch: java.lang.Throwable -> L84
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L60
                goto L65
            L60:
                okio.AsyncTimeout r9 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L84
                goto L47
            L65:
                okio.AsyncTimeout r7 = okio.AsyncTimeout.access$getNext$p(r9)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout.access$setNext$p(r6, r7)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout.access$setNext$p(r9, r6)     // Catch: java.lang.Throwable -> L84
                okio.AsyncTimeout r6 = okio.AsyncTimeout.access$getHead$cp()     // Catch: java.lang.Throwable -> L84
                if (r9 != r6) goto L7a
                java.lang.Class<okio.AsyncTimeout> r6 = okio.AsyncTimeout.class
                r6.notify()     // Catch: java.lang.Throwable -> L84
            L7a:
                kotlin.p r6 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L84
                monitor-exit(r0)
                return
            L7e:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L84
                r6.<init>()     // Catch: java.lang.Throwable -> L84
                throw r6     // Catch: java.lang.Throwable -> L84
            L84:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.AsyncTimeout.Companion.scheduleTimeout(okio.AsyncTimeout, long, boolean):void");
        }

        @Nullable
        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            C10843j.m433c(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            long nanoTime = System.nanoTime();
            if (asyncTimeout2 == null) {
                AsyncTimeout.class.wait(AsyncTimeout.IDLE_TIMEOUT_MILLIS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                C10843j.m433c(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - nanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long remainingNanos = asyncTimeout2.remainingNanos(nanoTime);
            if (remainingNanos > 0) {
                long j = remainingNanos / 1000000;
                AsyncTimeout.class.wait(j, (int) (remainingNanos - (1000000 * j)));
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            C10843j.m433c(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }
    }

    @Metadata(m509d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m508d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "Lkotlin/p;", "run", "<init>", "()V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AsyncTimeout awaitTimeout$okio;
            while (true) {
                try {
                    synchronized (AsyncTimeout.class) {
                        awaitTimeout$okio = AsyncTimeout.Companion.awaitTimeout$okio();
                        if (awaitTimeout$okio == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            return;
                        }
                        C10868p c10868p = C10868p.f21418a;
                    }
                    if (awaitTimeout$okio != null) {
                        awaitTimeout$okio.timedOut();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    @PublishedApi
    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        if (!(!this.inQueue)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            this.inQueue = true;
            Companion.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        if (this.inQueue) {
            this.inQueue = false;
            return Companion.cancelScheduledTimeout(this);
        }
        return false;
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final Sink sink(@NotNull final Sink sink) {
        C10843j.m430f(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout$sink$1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.close();
                    C10868p c10868p = C10868p.f21418a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!asyncTimeout.exit()) {
                        throw e;
                    }
                    throw asyncTimeout.access$newTimeoutException(e);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public void flush() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    sink.flush();
                    C10868p c10868p = C10868p.f21418a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!asyncTimeout.exit()) {
                        throw e;
                    }
                    throw asyncTimeout.access$newTimeoutException(e);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Sink
            @NotNull
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public void write(@NotNull Buffer source, long j) {
                C10843j.m430f(source, "source");
                Util.checkOffsetAndCount(source.size(), 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    Segment segment = source.head;
                    while (true) {
                        C10843j.m433c(segment);
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += segment.limit - segment.pos;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        segment = segment.next;
                    }
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        sink.write(source, j2);
                        C10868p c10868p = C10868p.f21418a;
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!asyncTimeout.exit()) {
                            throw e;
                        }
                        throw asyncTimeout.access$newTimeoutException(e);
                    } finally {
                        asyncTimeout.exit();
                    }
                }
            }
        };
    }

    @NotNull
    public final Source source(@NotNull final Source source) {
        C10843j.m430f(source, "source");
        return new Source() { // from class: okio.AsyncTimeout$source$1
            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    source.close();
                    C10868p c10868p = C10868p.f21418a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!asyncTimeout.exit()) {
                        throw e;
                    }
                    throw asyncTimeout.access$newTimeoutException(e);
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            public long read(@NotNull Buffer sink, long j) {
                C10843j.m430f(sink, "sink");
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    long read = source.read(sink, j);
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    return read;
                } catch (IOException e) {
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(e);
                    }
                    throw e;
                } finally {
                    asyncTimeout.exit();
                }
            }

            @Override // okio.Source
            @NotNull
            public AsyncTimeout timeout() {
                return AsyncTimeout.this;
            }

            @NotNull
            public String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull InterfaceC10809a<? extends T> block) {
        C10843j.m430f(block, "block");
        enter();
        try {
            T invoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return invoke;
        } catch (IOException e) {
            if (exit()) {
                throw access$newTimeoutException(e);
            }
            throw e;
        } finally {
            exit();
        }
    }
}
