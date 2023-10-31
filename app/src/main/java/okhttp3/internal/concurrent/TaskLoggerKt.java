package okhttp3.internal.concurrent;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.C10843j;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u001a*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m508d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Lkotlin/p;", "taskLog", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/a;)Ljava/lang/Object;", "message", "log", "", "ns", "formatDuration", "okhttp"}, m507k = 2, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    @NotNull
    public static final String formatDuration(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        long j4;
        if (j > -999500000) {
            if (j > -999500) {
                if (j <= 0) {
                    sb = new StringBuilder();
                    j4 = j - 500;
                } else if (j < 999500) {
                    sb = new StringBuilder();
                    j4 = j + 500;
                } else if (j < 999500000) {
                    sb = new StringBuilder();
                    j3 = j + 500000;
                } else {
                    sb = new StringBuilder();
                    j2 = j + 500000000;
                }
                sb.append(j4 / 1000);
                sb.append(" µs");
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
                C10843j.m431e(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb = new StringBuilder();
            j3 = j - 500000;
            sb.append(j3 / 1000000);
            sb.append(" ms");
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
            C10843j.m431e(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb = new StringBuilder();
        j2 = j - 500000000;
        sb.append(j2 / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        sb.append(" s ");
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb.toString()}, 1));
        C10843j.m431e(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C10843j.m431e(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull InterfaceC10809a<? extends T> block) {
        long j;
        C10843j.m430f(task, "task");
        C10843j.m430f(queue, "queue");
        C10843j.m430f(block, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = queue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = block.invoke();
            if (isLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            return invoke;
        } catch (Throwable th) {
            if (isLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull InterfaceC10809a<String> messageBlock) {
        C10843j.m430f(task, "task");
        C10843j.m430f(queue, "queue");
        C10843j.m430f(messageBlock, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, messageBlock.invoke());
        }
    }
}
