package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, m508d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "Ljava/io/IOException;", "cause", "newTimeoutException", "Lkotlin/p;", "timedOut", "Ljava/net/Socket;", "socket", "Ljava/net/Socket;", "<init>", "(Ljava/net/Socket;)V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(@NotNull Socket socket) {
        C10843j.m430f(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // okio.AsyncTimeout
    public void timedOut() {
        Logger logger;
        Level level;
        StringBuilder sb;
        Logger logger2;
        Exception exc;
        Logger logger3;
        try {
            this.socket.close();
        } catch (AssertionError e) {
            if (!Okio.isAndroidGetsocknameError(e)) {
                throw e;
            }
            logger3 = Okio__JvmOkioKt.logger;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            exc = e;
            logger2 = logger3;
            sb.append(this.socket);
            logger2.log(level, sb.toString(), (Throwable) exc);
        } catch (Exception e2) {
            logger = Okio__JvmOkioKt.logger;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            exc = e2;
            logger2 = logger;
            sb.append(this.socket);
            logger2.log(level, sb.toString(), (Throwable) exc);
        }
    }
}
