package okhttp3.internal.p064ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10925n;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p064ws.RealWebSocket;
import okhttp3.internal.p064ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0005srtuvBA\u0012\u0006\u0010o\u001a\u00020n\u0012\u0006\u0010`\u001a\u00020\u0003\u0012\u0006\u0010c\u001a\u00020b\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010j\u001a\u00020\u0005\u0012\b\u0010k\u001a\u0004\u0018\u00010<\u0012\u0006\u0010m\u001a\u00020\u0005¢\u0006\u0004\bp\u0010qJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0007J\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\u0006\u0010#\u001a\u00020 J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010(\u001a\u00020&H\u0016J\u0018\u0010-\u001a\u00020\u00072\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0013H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016J\u000e\u0010/\u001a\u00020\u00192\u0006\u0010(\u001a\u00020&J\u001a\u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0013H\u0016J \u00100\u001a\u00020\u00192\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u00101\u001a\u00020\u0005J\u000f\u00104\u001a\u00020\u0019H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00107\u001a\u00020\u0007H\u0000¢\u0006\u0004\b5\u00106J\u001c\u0010;\u001a\u00020\u00072\n\u0010:\u001a\u000608j\u0002`92\b\u0010\r\u001a\u0004\u0018\u00010\fJ\f\u0010=\u001a\u00020\u0019*\u00020<H\u0002J\u0018\u0010.\u001a\u00020\u00192\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020 H\u0002J\b\u0010@\u001a\u00020\u0007H\u0002R\u0014\u0010A\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010BR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020&0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020V0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010XR\u0016\u0010Y\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010]\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010BR\u0016\u0010^\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\\R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\\R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\\R\u0016\u0010_\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010ZR\u0014\u0010`\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010XR\u0018\u0010k\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010X¨\u0006w"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/Request;", "request", "", "queueSize", "Lkotlin/p;", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", "", "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "loopReader", "", "processNextFrame", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "tearDown", "", "sentPingCount", "receivedPingCount", "receivedPongCount", "text", "onReadMessage", "Lokio/ByteString;", "bytes", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "send", "pong", "close", "cancelAfterCloseMillis", "writeOneFrame$okhttp", "()Z", "writeOneFrame", "writePingFrame$okhttp", "()V", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "Lokhttp3/internal/ws/WebSocketExtensions;", "isValid", "data", "formatOpcode", "runWriter", "key", "Ljava/lang/String;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "", "messageAndCloseQueue", "J", "enqueuedClose", "Z", "receivedCloseCode", "I", "receivedCloseReason", "failed", "awaitingPong", "originalRequest", "Lokhttp3/Request;", "Lokhttp3/WebSocketListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "pingIntervalMillis", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    @NotNull
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    public static final Companion Companion = new Companion(null);
    private static final List<Protocol> ONLY_HTTP1 = C10752h.m486c(Protocol.HTTP_1_1);

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* loaded from: classes3.dex */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        @Nullable
        private final ByteString reason;

        public Close(int i, @Nullable ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        @Nullable
        public final ByteString getReason() {
            return this.reason;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* loaded from: classes3.dex */
    public static final class Message {
        @NotNull
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i, @NotNull ByteString data) {
            C10843j.m430f(data, "data");
            this.formatOpcode = i;
            this.data = data;
        }

        @NotNull
        public final ByteString getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", FirebaseAnalytics.Param.SOURCE, "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* loaded from: classes3.dex */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        @NotNull
        private final BufferedSink sink;
        @NotNull
        private final BufferedSource source;

        public Streams(boolean z, @NotNull BufferedSource source, @NotNull BufferedSink sink) {
            C10843j.m430f(source, "source");
            C10843j.m430f(sink, "sink");
            this.client = z;
            this.source = source;
            this.sink = sink;
        }

        public final boolean getClient() {
            return this.client;
        }

        @NotNull
        public final BufferedSink getSink() {
            return this.sink;
        }

        @NotNull
        public final BufferedSource getSource() {
            return this.source;
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, m508d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$WriterTask */
    /* loaded from: classes3.dex */
    public final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.this.failWebSocket(e, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(@NotNull TaskRunner taskRunner, @NotNull Request originalRequest, @NotNull WebSocketListener listener, @NotNull Random random, long j, @Nullable WebSocketExtensions webSocketExtensions, long j2) {
        C10843j.m430f(taskRunner, "taskRunner");
        C10843j.m430f(originalRequest, "originalRequest");
        C10843j.m430f(listener, "listener");
        C10843j.m430f(random, "random");
        this.originalRequest = originalRequest;
        this.listener = listener;
        this.random = random;
        this.pingIntervalMillis = j;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j2;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!C10843j.m435a("GET", originalRequest.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + originalRequest.method()).toString());
        }
        ByteString.Companion companion = ByteString.Companion;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C10868p c10868p = C10868p.f21418a;
        this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, null).base64();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.unknownValues && webSocketExtensions.clientMaxWindowBits == null) {
            Integer num = webSocketExtensions.serverMaxWindowBits;
            if (num != null) {
                int intValue = num.intValue();
                return 8 <= intValue && 15 >= intValue;
            }
            return true;
        }
        return false;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        Thread currentThread = Thread.currentThread();
        C10843j.m431e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    private final synchronized boolean send(ByteString byteString, int i) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + byteString.size() > MAX_QUEUE_SIZE) {
                close(1001, null);
                return false;
            }
            this.queueSize += byteString.size();
            this.messageAndCloseQueue.add(new Message(i, byteString));
            runWriter();
            return true;
        }
        return false;
    }

    public final void awaitTermination(long j, @NotNull TimeUnit timeUnit) throws InterruptedException {
        C10843j.m430f(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(j, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        C10843j.m433c(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(@NotNull Response response, @Nullable Exchange exchange) throws IOException {
        C10843j.m430f(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String header$default = Response.header$default(response, "Connection", null, 2, null);
        if (!C10925n.m398e("Upgrade", header$default)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
        }
        String header$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!C10925n.m398e("websocket", header$default2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
        }
        String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        ByteString.Companion companion = ByteString.Companion;
        String base64 = companion.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
        if (!(!C10843j.m435a(base64, header$default3))) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header$default3 + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int i, @Nullable String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final synchronized boolean close(int i, @Nullable String str, long j) {
        ByteString byteString;
        WebSocketProtocol.INSTANCE.validateCloseCode(i);
        if (str != null) {
            byteString = ByteString.Companion.encodeUtf8(str);
            if (!(((long) byteString.size()) <= 123)) {
                throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
            }
        } else {
            byteString = null;
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(i, byteString, j));
            runWriter();
            return true;
        }
        return false;
    }

    public final void connect(@NotNull OkHttpClient client) {
        C10843j.m430f(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient build = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(build, build2, true);
        this.call = realCall;
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket$connect$1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                C10843j.m430f(call, "call");
                C10843j.m430f(e, "e");
                RealWebSocket.this.failWebSocket(e, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                boolean isValid;
                ArrayDeque arrayDeque;
                C10843j.m430f(call, "call");
                C10843j.m430f(response, "response");
                Exchange exchange = response.exchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    C10843j.m433c(exchange);
                    RealWebSocket.Streams newWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions parse = WebSocketExtensions.Companion.parse(response.headers());
                    RealWebSocket.this.extensions = parse;
                    isValid = RealWebSocket.this.isValid(parse);
                    if (!isValid) {
                        synchronized (RealWebSocket.this) {
                            arrayDeque = RealWebSocket.this.messageAndCloseQueue;
                            arrayDeque.clear();
                            RealWebSocket.this.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + build2.url().redact(), newWebSocketStreams);
                        RealWebSocket.this.getListener$okhttp().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e) {
                        RealWebSocket.this.failWebSocket(e, null);
                    }
                } catch (IOException e2) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e2, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(@NotNull Exception e, @Nullable Response response) {
        C10843j.m430f(e, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            C10868p c10868p = C10868p.f21418a;
            try {
                this.listener.onFailure(this, e, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    @NotNull
    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(@NotNull final String name, @NotNull final Streams streams) throws IOException {
        C10843j.m430f(name, "name");
        C10843j.m430f(streams, "streams");
        final WebSocketExtensions webSocketExtensions = this.extensions;
        C10843j.m433c(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j = this.pingIntervalMillis;
            if (j != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                TaskQueue taskQueue = this.taskQueue;
                final String concat = name.concat(" ping");
                taskQueue.schedule(new Task(concat) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            C10868p c10868p = C10868p.f21418a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            C10843j.m433c(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.p064ws.WebSocketReader.FrameCallback
    public void onReadClose(int i, @NotNull String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        C10843j.m430f(reason, "reason");
        boolean z = true;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = i;
            this.receivedCloseReason = reason;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            C10868p c10868p = C10868p.f21418a;
        }
        try {
            this.listener.onClosing(this, i, reason);
            if (streams != null) {
                this.listener.onClosed(this, i, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.p064ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull String text) throws IOException {
        C10843j.m430f(text, "text");
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.p064ws.WebSocketReader.FrameCallback
    public void onReadMessage(@NotNull ByteString bytes) throws IOException {
        C10843j.m430f(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.internal.p064ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(@NotNull ByteString payload) {
        C10843j.m430f(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.p064ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(@NotNull ByteString payload) {
        C10843j.m430f(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(@NotNull ByteString payload) {
        C10843j.m430f(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            C10843j.m433c(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e) {
            failWebSocket(e, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    @NotNull
    public Request request() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull String text) {
        C10843j.m430f(text, "text");
        return send(ByteString.Companion.encodeUtf8(text), 1);
    }

    @Override // okhttp3.WebSocket
    public boolean send(@NotNull ByteString bytes) {
        C10843j.m430f(bytes, "bytes");
        return send(bytes, 2);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb A[Catch: all -> 0x01af, TRY_ENTER, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:92:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106 A[Catch: all -> 0x01af, TryCatch #4 {all -> 0x01af, blocks: (B:30:0x00fb, B:32:0x0106, B:35:0x0110, B:36:0x0120, B:38:0x012f, B:43:0x0134, B:44:0x013b, B:45:0x013c, B:48:0x0142, B:37:0x0121), top: B:92:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [okhttp3.internal.ws.WebSocketWriter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.jvm.internal.x] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.WebSocketReader] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [okio.ByteString] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p064ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter != null) {
                int i = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                C10868p c10868p = C10868p.f21418a;
                if (i == -1) {
                    try {
                        webSocketWriter.writePing(ByteString.EMPTY);
                        return;
                    } catch (IOException e) {
                        failWebSocket(e, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
            }
        }
    }
}
