package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H&J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, m508d2 = {"Lokhttp3/internal/concurrent/Task;", "", "", "runOnce", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/p;", "initQueue$okhttp", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "initQueue", "", "toString", "Lokhttp3/internal/concurrent/TaskQueue;", "getQueue$okhttp", "()Lokhttp3/internal/concurrent/TaskQueue;", "setQueue$okhttp", "nextExecuteNanoTime", "J", "getNextExecuteNanoTime$okhttp", "()J", "setNextExecuteNanoTime$okhttp", "(J)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "cancelable", "Z", "getCancelable", "()Z", "<init>", "(Ljava/lang/String;Z)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class Task {
    private final boolean cancelable;
    @NotNull
    private final String name;
    private long nextExecuteNanoTime;
    @Nullable
    private TaskQueue queue;

    public Task(@NotNull String name, boolean z) {
        C10843j.m430f(name, "name");
        this.name = name;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ Task(String str, boolean z, int i, C10839f c10839f) {
        this(str, (i & 2) != 0 ? true : z);
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    @Nullable
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(@NotNull TaskQueue queue) {
        C10843j.m430f(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (!(taskQueue == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j) {
        this.nextExecuteNanoTime = j;
    }

    public final void setQueue$okhttp(@Nullable TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
