package okhttp3.internal.cache;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m508d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/ForwardingSink;", "Lokio/Buffer;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "Lkotlin/p;", "write", "flush", "close", "", "hasErrors", "Z", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lkotlin/jvm/functions/l;", "getOnException", "()Lkotlin/jvm/functions/l;", "Lokio/Sink;", "delegate", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/l;)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class FaultHidingSink extends ForwardingSink {
    private boolean hasErrors;
    @NotNull
    private final InterfaceC10820l<IOException, C10868p> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(@NotNull Sink delegate, @NotNull InterfaceC10820l<? super IOException, C10868p> onException) {
        super(delegate);
        C10843j.m430f(delegate, "delegate");
        C10843j.m430f(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }

    @NotNull
    public final InterfaceC10820l<IOException, C10868p> getOnException() {
        return this.onException;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j) {
        C10843j.m430f(source, "source");
        if (this.hasErrors) {
            source.skip(j);
            return;
        }
        try {
            super.write(source, j);
        } catch (IOException e) {
            this.hasErrors = true;
            this.onException.invoke(e);
        }
    }
}
