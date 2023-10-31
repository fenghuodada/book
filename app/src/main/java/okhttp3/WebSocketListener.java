package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, m508d2 = {"Lokhttp3/WebSocketListener;", "", "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lkotlin/p;", "onOpen", "", "text", "onMessage", "Lokio/ByteString;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(@NotNull WebSocket webSocket, int i, @NotNull String reason) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(reason, "reason");
    }

    public void onClosing(@NotNull WebSocket webSocket, int i, @NotNull String reason) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(reason, "reason");
    }

    public void onFailure(@NotNull WebSocket webSocket, @NotNull Throwable t, @Nullable Response response) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(t, "t");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(text, "text");
    }

    public void onMessage(@NotNull WebSocket webSocket, @NotNull ByteString bytes) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(bytes, "bytes");
    }

    public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
        C10843j.m430f(webSocket, "webSocket");
        C10843j.m430f(response, "response");
    }
}
