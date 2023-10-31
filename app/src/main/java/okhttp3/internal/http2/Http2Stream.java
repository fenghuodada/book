package okhttp3.internal.http2;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u0010]\u001a\u00020\u001e\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\u000f\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010&J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010&J\u001a\u0010/\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R*\u00101\u001a\u00020(2\u0006\u00100\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020(2\u0006\u00100\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R*\u0010:\u001a\u00020(2\u0006\u00100\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R*\u0010=\u001a\u00020(2\u0006\u00100\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010\u001d\u001a\u00060ER\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010F\u001a\u0004\bG\u0010HR\u001e\u0010J\u001a\u00060IR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001e\u0010\u000f\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010\u0010\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bR\u0010QR$\u0010\u001a\u001a\u0004\u0018\u00010\u00158@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0017\u0010]\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010b\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o"}, m508d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "", "outFinished", "flushHeaders", "Lkotlin/p;", "writeHeaders", "enqueueTrailers", "Lokio/Timeout;", "readTimeout", "writeTimeout", "Lokio/Source;", "getSource", "Lokio/Sink;", "getSink", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "errorCode", "closeLater", "Lokio/BufferedSource;", FirebaseAnalytics.Param.SOURCE, "", "length", "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", FacebookAdapter.KEY_ID, "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    @NotNull
    private final Http2Connection connection;
    @Nullable
    private ErrorCode errorCode;
    @Nullable
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;

    /* renamed from: id */
    private final int f21861id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    @NotNull
    private final StreamTimeout readTimeout;
    @NotNull
    private final FramingSink sink;
    @NotNull
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    @NotNull
    private final StreamTimeout writeTimeout;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m508d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    @Metadata(m509d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006#"}, m508d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "", "outFinishedOnLastFrame", "Lkotlin/p;", "emitFrame", "Lokio/Buffer;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "write", "flush", "Lokio/Timeout;", "timeout", "close", "sendBuffer", "Lokio/Buffer;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "finished", "getFinished", "setFinished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;
        @Nullable
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new Buffer();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, C10839f c10839f) {
            this((i & 1) != 0 ? false : z);
        }

        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout$okhttp().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    Http2Stream.this.waitForIo$okhttp();
                }
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.size();
                C10868p c10868p = C10868p.f21418a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder("Thread ");
                Thread currentThread = Thread.currentThread();
                C10843j.m431e(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                boolean z = Http2Stream.this.getErrorCode$okhttp() == null;
                C10868p c10868p = C10868p.f21418a;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    boolean z2 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        C10843j.m433c(headers);
                        connection.writeHeaders$okhttp(id, z, Util.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    C10868p c10868p2 = C10868p.f21418a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder("Thread ");
                Thread currentThread = Thread.currentThread();
                C10843j.m431e(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
                C10868p c10868p = C10868p.f21418a;
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Sink
        @NotNull
        public Timeout timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // okio.Sink
        public void write(@NotNull Buffer source, long j) throws IOException {
            C10843j.m430f(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(source, j);
                while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }
    }

    @Metadata(m509d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$¨\u0006,"}, m508d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "", "read", "Lkotlin/p;", "updateConnectionFlowControl", "Lokio/Buffer;", "sink", "byteCount", "Lokio/BufferedSource;", FirebaseAnalytics.Param.SOURCE, "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/Timeout;", "timeout", "close", "receiveBuffer", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "", "closed", "Z", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "maxByteCount", "J", "finished", "getFinished$okhttp", "setFinished$okhttp", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        @Nullable
        private Headers trailers;
        @NotNull
        private final Buffer receiveBuffer = new Buffer();
        @NotNull
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(http2Stream);
            throw new AssertionError(sb.toString());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Stream.notifyAll();
                C10868p c10868p = C10868p.f21418a;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        @NotNull
        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        @NotNull
        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @Nullable
        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // okio.Source
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long read(@org.jetbrains.annotations.NotNull okio.Buffer r13, long r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(okio.Buffer, long):long");
        }

        public final void receive$okhttp(@NotNull BufferedSource source, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C10843j.m430f(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb = new StringBuilder("Thread ");
                Thread currentThread = Thread.currentThread();
                C10843j.m431e(currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST NOT hold lock on ");
                sb.append(http2Stream);
                throw new AssertionError(sb.toString());
            }
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.size() + j > this.maxByteCount;
                    C10868p c10868p = C10868p.f21418a;
                }
                if (z3) {
                    source.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    source.skip(j);
                    return;
                } else {
                    long read = source.read(this.receiveBuffer, j);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j -= read;
                    synchronized (Http2Stream.this) {
                        if (this.closed) {
                            j2 = this.receiveBuffer.size();
                            this.receiveBuffer.clear();
                        } else {
                            if (this.readBuffer.size() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.writeAll(this.receiveBuffer);
                            if (z2) {
                                Http2Stream http2Stream2 = Http2Stream.this;
                                if (http2Stream2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                                http2Stream2.notifyAll();
                            }
                            j2 = 0;
                        }
                    }
                    if (j2 > 0) {
                        updateConnectionFlowControl(j2);
                    }
                }
            }
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(@Nullable Headers headers) {
            this.trailers = headers;
        }

        @Override // okio.Source
        @NotNull
        public Timeout timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    @Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, m508d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "Lkotlin/p;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
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

        @Override // okio.AsyncTimeout
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, @NotNull Http2Connection connection, boolean z, boolean z2, @Nullable Headers headers) {
        C10843j.m430f(connection, "connection");
        this.f21861id = i;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else if (!(!isLocallyInitiated())) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else {
            arrayDeque.add(headers);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            C10868p c10868p = C10868p.f21418a;
            this.connection.removeStream$okhttp(this.f21861id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            z = !this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed());
            isOpen = isOpen();
            C10868p c10868p = C10868p.f21418a;
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (isOpen) {
        } else {
            this.connection.removeStream$okhttp(this.f21861id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            C10843j.m433c(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(@NotNull ErrorCode rstStatusCode, @Nullable IOException iOException) throws IOException {
        C10843j.m430f(rstStatusCode, "rstStatusCode");
        if (closeInternal(rstStatusCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.f21861id, rstStatusCode);
        }
    }

    public final void closeLater(@NotNull ErrorCode errorCode) {
        C10843j.m430f(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.f21861id, errorCode);
        }
    }

    public final void enqueueTrailers(@NotNull Headers trailers) {
        C10843j.m430f(trailers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            C10868p c10868p = C10868p.f21418a;
        }
    }

    @NotNull
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @Nullable
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @Nullable
    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f21861id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @NotNull
    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okio.Sink getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.p r0 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():okio.Sink");
    }

    @NotNull
    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    @NotNull
    public final Source getSource() {
        return this.source;
    }

    @NotNull
    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @NotNull
    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient$okhttp() == ((this.f21861id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@NotNull BufferedSource source, int i) throws IOException {
        C10843j.m430f(source, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(source, i);
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        Thread currentThread = Thread.currentThread();
        C10843j.m431e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[Catch: all -> 0x006a, TryCatch #0 {, blocks: (B:10:0x003a, B:14:0x0042, B:17:0x0051, B:18:0x0056, B:15:0x0048), top: B:26:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void receiveHeaders(@org.jetbrains.annotations.NotNull okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C10843j.m430f(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L39
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L39
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "Thread.currentThread()"
            kotlin.jvm.internal.C10843j.m431e(r0, r1)
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L39:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L6a
            r1 = 1
            if (r0 == 0) goto L48
            if (r4 != 0) goto L42
            goto L48
        L42:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L6a
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L6a
            goto L4f
        L48:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L6a
            r0.add(r3)     // Catch: java.lang.Throwable -> L6a
        L4f:
            if (r4 == 0) goto L56
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L6a
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L6a
        L56:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L6a
            r2.notifyAll()     // Catch: java.lang.Throwable -> L6a
            kotlin.p r4 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r2)
            if (r3 != 0) goto L69
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.f21861id
            r3.removeStream$okhttp(r4)
        L69:
            return
        L6a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(@NotNull ErrorCode errorCode) {
        C10843j.m430f(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@Nullable ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@Nullable IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    @NotNull
    public final synchronized Headers takeHeaders() throws IOException {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            waitForIo$okhttp();
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!(!this.headersQueue.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            C10843j.m433c(errorCode);
            throw new StreamResetException(errorCode);
        }
        removeFirst = this.headersQueue.removeFirst();
        C10843j.m431e(removeFirst, "headersQueue.removeFirst()");
        return removeFirst;
    }

    @NotNull
    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (!this.source.getFinished$okhttp() || !this.source.getReceiveBuffer().exhausted() || !this.source.getReadBuffer().exhausted()) {
            if (this.errorCode != null) {
                IOException iOException = this.errorException;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = this.errorCode;
                C10843j.m433c(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@NotNull List<Header> responseHeaders, boolean z, boolean z2) throws IOException {
        boolean z3;
        C10843j.m430f(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z) {
                this.sink.setFinished(true);
            }
            C10868p c10868p = C10868p.f21418a;
        }
        if (!z2) {
            synchronized (this.connection) {
                z3 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z2 = z3;
        }
        this.connection.writeHeaders$okhttp(this.f21861id, z, responseHeaders);
        if (z2) {
            this.connection.flush();
        }
    }

    @NotNull
    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
