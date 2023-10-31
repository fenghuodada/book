package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\n"}, m508d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "Ljava/util/logging/LogRecord;", "record", "Lkotlin/p;", "publish", "flush", "close", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord record) {
        int androidLevel;
        C10843j.m430f(record, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = record.getLoggerName();
        C10843j.m431e(loggerName, "record.loggerName");
        androidLevel = AndroidLogKt.getAndroidLevel(record);
        String message = record.getMessage();
        C10843j.m431e(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, androidLevel, message, record.getThrown());
    }
}
