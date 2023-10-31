package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.C10738b;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, m508d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "e", "Lkotlin/p;", "addConnectException", "<set-?>", "lastConnectException", "Ljava/io/IOException;", "getLastConnectException", "()Ljava/io/IOException;", "firstConnectException", "getFirstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RouteException extends RuntimeException {
    @NotNull
    private final IOException firstConnectException;
    @NotNull
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        C10843j.m430f(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void addConnectException(@NotNull IOException e) {
        C10843j.m430f(e, "e");
        C10738b.m502a(this.firstConnectException, e);
        this.lastConnectException = e;
    }

    @NotNull
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    @NotNull
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
