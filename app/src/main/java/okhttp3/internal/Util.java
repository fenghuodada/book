package okhttp3.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C10738b;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.AbstractC10762r;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10757m;
import kotlin.collections.C10759o;
import kotlin.collections.C10760p;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10833a0;
import kotlin.jvm.internal.C10843j;
import kotlin.p061io.C10805a;
import kotlin.ranges.C10877b;
import kotlin.ranges.C10878c;
import kotlin.ranges.C10882g;
import kotlin.text.C10910b;
import kotlin.text.C10918g;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.p063io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060j$.util.DesugarTimeZone;

@Metadata(m509d1 = {"\u0000´\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b)\u0010,\u001a\u0012\u00100\u001a\u00020.*\u00020-2\u0006\u0010/\u001a\u00020.\u001a \u00104\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102\u001a\n\u00105\u001a\u00020\u0018*\u00020$\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020706\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020706*\u000208\u001a\u0012\u0010;\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010>\u001a\u00020=*\u00020<\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020?2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020B2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00182\u0006\u0010@\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010F\u001a\u00020\u0018*\u00020-\u001a\u001a\u0010I\u001a\u00020\b*\u00020G2\u0006\u00101\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\u001a\u0010K\u001a\u00020\b*\u00020G2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\n\u0010M\u001a\u00020\u0006*\u00020L\u001a\u0012\u0010O\u001a\u00020\b*\u00020L2\u0006\u0010N\u001a\u00020-\u001a\u001a\u0010R\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\"\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\u0012\u0010I\u001a\u00020\u0018*\u00020T2\u0006\u0010U\u001a\u00020?\u001a\u0014\u0010V\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010X\u001a\u00020\u0000*\u00020W\u001a\u0012\u0010Z\u001a\u00020\u0000*\u00020\u00062\u0006\u0010Y\u001a\u00020\u0000\u001a\u0014\u0010[\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010Y\u001a\u00020\u0018\u001a\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\b\u0012\u0004\u0012\u00028\u000006\u001a/\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b_\u0010`\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010a\"\u0004\b\u0001\u0010b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010f\u001a\u00020\u0004*\u00020L\u001a\n\u0010f\u001a\u00020\u0004*\u00020g\u001a\u0012\u0010k\u001a\u00020\b*\u00020h2\u0006\u0010j\u001a\u00020i\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010m\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010o\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\u0006\u0010p\u001a\u00020*2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000q2\u0006\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010u\u001a'\u0010y\u001a\u00020\u0004\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u00028\u00000w2\u0006\u0010x\u001a\u00028\u0000H\u0000¢\u0006\u0004\by\u0010z\u001a\r\u0010{\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010|\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\"\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u00060}j\u0002`~2\u0010\u0010\u007f\u001a\f\u0012\b\u0012\u00060}j\u0002`~06\u001a@\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u001a\u0010\u0085\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0083\u0001¢\u0006\u0003\b\u0084\u0001H\u0086\bø\u0001\u0000\"\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0017\u0010\u008a\u0001\u001a\u0002088\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0018\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0018\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0017\u0010\u009b\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0017\u0010\u009d\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0017\u0010\u009f\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009e\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 \u0001"}, m508d2 = {"", "arrayLength", "offset", "count", "Lkotlin/p;", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lokio/BufferedSink;", FirebaseAnalytics.Param.MEDIUM, "writeMedium", "readMedium", "Lokio/Source;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", FirebaseAnalytics.Param.SOURCE, "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/Buffer;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", "V", "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "E", "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokio/Options;", "UNICODE_BOMS", "Lokio/Options;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/g;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/g;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, m507k = 2, m506mv = {1, 4, 0})
@JvmName(name = "Util")
/* loaded from: classes3.dex */
public final class Util {
    @JvmField
    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;
    @JvmField
    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.Companion.m61of(new String[0]);
    @JvmField
    @NotNull
    public static final RequestBody EMPTY_REQUEST;
    @JvmField
    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    @JvmField
    @NotNull
    public static final TimeZone UTC;
    private static final C10918g VERIFY_AS_IP_ADDRESS;
    @JvmField
    public static final boolean assertionsEnabled;
    @JvmField
    @NotNull
    public static final String okHttpName;
    @NotNull
    public static final String userAgent = "okhttp/4.9.3";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.m52of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        C10843j.m433c(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new C10918g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        okHttpName = C10929r.m391A("Client", C10929r.m366z("okhttp3.", OkHttpClient.class.getName()));
    }

    public static final <E> void addIfAbsent(@NotNull List<E> addIfAbsent, E e) {
        C10843j.m430f(addIfAbsent, "$this$addIfAbsent");
        if (addIfAbsent.contains(e)) {
            return;
        }
        addIfAbsent.add(e);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull final EventListener asFactory) {
        C10843j.m430f(asFactory, "$this$asFactory");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$asFactory$1
            @Override // okhttp3.EventListener.Factory
            @NotNull
            public final EventListener create(@NotNull Call it) {
                C10843j.m430f(it, "it");
                return EventListener.this;
            }
        };
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object assertThreadDoesntHoldLock) {
        C10843j.m430f(assertThreadDoesntHoldLock, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(assertThreadDoesntHoldLock)) {
            StringBuilder sb = new StringBuilder("Thread ");
            Thread currentThread = Thread.currentThread();
            C10843j.m431e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(assertThreadDoesntHoldLock);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object assertThreadHoldsLock) {
        C10843j.m430f(assertThreadHoldsLock, "$this$assertThreadHoldsLock");
        if (!assertionsEnabled || Thread.holdsLock(assertThreadHoldsLock)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        Thread currentThread = Thread.currentThread();
        C10843j.m431e(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(assertThreadHoldsLock);
        throw new AssertionError(sb.toString());
    }

    public static final boolean canParseAsIpAddress(@NotNull String canParseAsIpAddress) {
        C10843j.m430f(canParseAsIpAddress, "$this$canParseAsIpAddress");
        C10918g c10918g = VERIFY_AS_IP_ADDRESS;
        c10918g.getClass();
        return c10918g.f21470a.matcher(canParseAsIpAddress).matches();
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl canReuseConnectionFor, @NotNull HttpUrl other) {
        C10843j.m430f(canReuseConnectionFor, "$this$canReuseConnectionFor");
        C10843j.m430f(other, "other");
        return C10843j.m435a(canReuseConnectionFor.host(), other.host()) && canReuseConnectionFor.port() == other.port() && C10843j.m435a(canReuseConnectionFor.scheme(), other.scheme());
    }

    public static final int checkDuration(@NotNull String name, long j, @Nullable TimeUnit timeUnit) {
        C10843j.m430f(name, "name");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        boolean z = true;
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(name.concat(" too small.").toString());
                }
                throw new IllegalArgumentException(name.concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(name.concat(" < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeQuietly) {
        C10843j.m430f(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket closeQuietly) {
        C10843j.m430f(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull Socket closeQuietly) {
        C10843j.m430f(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C10843j.m435a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] concat, @NotNull String value) {
        C10843j.m430f(concat, "$this$concat");
        C10843j.m430f(value, "value");
        Object[] copyOf = Arrays.copyOf(concat, concat.length + 1);
        C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr = (String[]) copyOf;
        strArr[strArr.length - 1] = value;
        return strArr;
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, char c, int i, int i2) {
        C10843j.m430f(delimiterOffset, "$this$delimiterOffset");
        while (i < i2) {
            if (delimiterOffset.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int delimiterOffset(@NotNull String delimiterOffset, @NotNull String delimiters, int i, int i2) {
        C10843j.m430f(delimiterOffset, "$this$delimiterOffset");
        C10843j.m430f(delimiters, "delimiters");
        while (i < i2) {
            if (C10929r.m380l(delimiters, delimiterOffset.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(@NotNull Source discard, int i, @NotNull TimeUnit timeUnit) {
        C10843j.m430f(discard, "$this$discard");
        C10843j.m430f(timeUnit, "timeUnit");
        try {
            return skipAll(discard, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> filterList, @NotNull InterfaceC10820l<? super T, Boolean> predicate) {
        C10843j.m430f(filterList, "$this$filterList");
        C10843j.m430f(predicate, "predicate");
        ArrayList arrayList = C10759o.f21363a;
        Iterator<? extends T> it = filterList.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (predicate.invoke(obj).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                C10833a0.m440a(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        C10843j.m430f(format, "format");
        C10843j.m430f(args, "args");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        C10843j.m431e(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    public static final boolean hasIntersection(@NotNull String[] hasIntersection, @Nullable String[] strArr, @NotNull Comparator<? super String> comparator) {
        C10843j.m430f(hasIntersection, "$this$hasIntersection");
        C10843j.m430f(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response headersContentLength) {
        C10843j.m430f(headersContentLength, "$this$headersContentLength");
        String str = headersContentLength.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@NotNull InterfaceC10809a<C10868p> block) {
        C10843j.m430f(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... elements) {
        C10843j.m430f(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C10752h.m485d(Arrays.copyOf(objArr, objArr.length)));
        C10843j.m431e(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(@NotNull String[] indexOf, @NotNull String value, @NotNull Comparator<String> comparator) {
        C10843j.m430f(indexOf, "$this$indexOf");
        C10843j.m430f(value, "value");
        C10843j.m430f(comparator, "comparator");
        int length = indexOf.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(indexOf[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String indexOfControlOrNonAscii) {
        C10843j.m430f(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i = 0; i < length; i++) {
            char charAt = indexOfControlOrNonAscii.charAt(i);
            if (C10843j.m428h(charAt, 31) <= 0 || C10843j.m428h(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String indexOfFirstNonAsciiWhitespace, int i, int i2) {
        C10843j.m430f(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String indexOfLastNonAsciiWhitespace, int i, int i2) {
        C10843j.m430f(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(@NotNull String indexOfNonWhitespace, int i) {
        C10843j.m430f(indexOfNonWhitespace, "$this$indexOfNonWhitespace");
        int length = indexOfNonWhitespace.length();
        while (i < length) {
            char charAt = indexOfNonWhitespace.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return indexOfNonWhitespace.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] intersect, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        C10843j.m430f(intersect, "$this$intersect");
        C10843j.m430f(other, "other");
        C10843j.m430f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final boolean isCivilized(@NotNull FileSystem isCivilized, @NotNull File file) {
        C10843j.m430f(isCivilized, "$this$isCivilized");
        C10843j.m430f(file, "file");
        Sink sink = isCivilized.sink(file);
        try {
            try {
                isCivilized.delete(file);
                C10805a.m443a(sink, null);
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C10805a.m443a(sink, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            C10868p c10868p = C10868p.f21418a;
            C10805a.m443a(sink, null);
            isCivilized.delete(file);
            return false;
        }
    }

    public static final boolean isHealthy(@NotNull Socket isHealthy, @NotNull BufferedSource source) {
        C10843j.m430f(isHealthy, "$this$isHealthy");
        C10843j.m430f(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            try {
                isHealthy.setSoTimeout(1);
                boolean z = !source.exhausted();
                isHealthy.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                isHealthy.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@NotNull String name) {
        C10843j.m430f(name, "name");
        return C10925n.m398e(name, "Authorization") || C10925n.m398e(name, "Cookie") || C10925n.m398e(name, "Proxy-Authorization") || C10925n.m398e(name, "Set-Cookie");
    }

    public static final void notify(@NotNull Object notify) {
        C10843j.m430f(notify, "$this$notify");
        notify.notify();
    }

    public static final void notifyAll(@NotNull Object notifyAll) {
        C10843j.m430f(notifyAll, "$this$notifyAll");
        notifyAll.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    @NotNull
    public static final String peerName(@NotNull Socket peerName) {
        C10843j.m430f(peerName, "$this$peerName");
        SocketAddress remoteSocketAddress = peerName.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
            C10843j.m431e(hostName, "address.hostName");
            return hostName;
        }
        return remoteSocketAddress.toString();
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource readBomAsCharset, @NotNull Charset charset) throws IOException {
        Charset charset2;
        String str;
        Charset charset3;
        C10843j.m430f(readBomAsCharset, "$this$readBomAsCharset");
        C10843j.m430f(charset, "default");
        int select = readBomAsCharset.select(UNICODE_BOMS);
        if (select != -1) {
            if (select != 0) {
                if (select != 1) {
                    if (select != 2) {
                        if (select != 3) {
                            if (select == 4) {
                                C10910b.f21449a.getClass();
                                charset3 = C10910b.f21451c;
                                if (charset3 == null) {
                                    charset3 = Charset.forName("UTF-32LE");
                                    C10843j.m431e(charset3, "forName(\"UTF-32LE\")");
                                    C10910b.f21451c = charset3;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            C10910b.f21449a.getClass();
                            charset3 = C10910b.f21452d;
                            if (charset3 == null) {
                                charset3 = Charset.forName("UTF-32BE");
                                C10843j.m431e(charset3, "forName(\"UTF-32BE\")");
                                C10910b.f21452d = charset3;
                            }
                        }
                        return charset3;
                    }
                    charset2 = StandardCharsets.UTF_16LE;
                    str = "UTF_16LE";
                } else {
                    charset2 = StandardCharsets.UTF_16BE;
                    str = "UTF_16BE";
                }
            } else {
                charset2 = StandardCharsets.UTF_8;
                str = "UTF_8";
            }
            C10843j.m431e(charset2, str);
            return charset2;
        }
        return charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        return r4;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T readFieldOrNull(@org.jetbrains.annotations.NotNull java.lang.Object r5, @org.jetbrains.annotations.NotNull java.lang.Class<T> r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
        /*
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.C10843j.m430f(r5, r0)
            java.lang.String r0 = "fieldType"
            kotlin.jvm.internal.C10843j.m430f(r6, r0)
            java.lang.String r0 = "fieldName"
            kotlin.jvm.internal.C10843j.m430f(r7, r0)
            java.lang.Class r0 = r5.getClass()
        L13:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r2 = kotlin.jvm.internal.C10843j.m435a(r0, r1)
            r3 = 1
            r2 = r2 ^ r3
            r4 = 0
            if (r2 == 0) goto L44
            java.lang.reflect.Field r1 = r0.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.String r2 = "field"
            kotlin.jvm.internal.C10843j.m431e(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L3a
            r1.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L3a
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.NoSuchFieldException -> L3a
            boolean r2 = r6.isInstance(r1)     // Catch: java.lang.NoSuchFieldException -> L3a
            if (r2 != 0) goto L35
            goto L39
        L35:
            java.lang.Object r4 = r6.cast(r1)     // Catch: java.lang.NoSuchFieldException -> L3a
        L39:
            return r4
        L3a:
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r1 = "c.superclass"
            kotlin.jvm.internal.C10843j.m431e(r0, r1)
            goto L13
        L44:
            java.lang.String r0 = "delegate"
            boolean r2 = kotlin.jvm.internal.C10843j.m435a(r7, r0)
            r2 = r2 ^ r3
            if (r2 == 0) goto L58
            java.lang.Object r5 = readFieldOrNull(r5, r1, r0)
            if (r5 == 0) goto L58
            java.lang.Object r5 = readFieldOrNull(r5, r6, r7)
            return r5
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.readFieldOrNull(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public static final int readMedium(@NotNull BufferedSource readMedium) throws IOException {
        C10843j.m430f(readMedium, "$this$readMedium");
        return and(readMedium.readByte(), 255) | (and(readMedium.readByte(), 255) << 16) | (and(readMedium.readByte(), 255) << 8);
    }

    public static final int skipAll(@NotNull Buffer skipAll, byte b) {
        C10843j.m430f(skipAll, "$this$skipAll");
        int i = 0;
        while (!skipAll.exhausted() && skipAll.getByte(0L) == b) {
            i++;
            skipAll.readByte();
        }
        return i;
    }

    public static final boolean skipAll(@NotNull Source skipAll, int i, @NotNull TimeUnit timeUnit) throws IOException {
        C10843j.m430f(skipAll, "$this$skipAll");
        C10843j.m430f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = skipAll.timeout().hasDeadline() ? skipAll.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        skipAll.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (skipAll.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            int i2 = (deadlineNanoTime > Long.MAX_VALUE ? 1 : (deadlineNanoTime == Long.MAX_VALUE ? 0 : -1));
            Timeout timeout = skipAll.timeout();
            if (i2 == 0) {
                timeout.clearDeadline();
            } else {
                timeout.deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (deadlineNanoTime > Long.MAX_VALUE ? 1 : (deadlineNanoTime == Long.MAX_VALUE ? 0 : -1));
            Timeout timeout2 = skipAll.timeout();
            if (i3 == 0) {
                timeout2.clearDeadline();
            } else {
                timeout2.deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (deadlineNanoTime > Long.MAX_VALUE ? 1 : (deadlineNanoTime == Long.MAX_VALUE ? 0 : -1));
            Timeout timeout3 = skipAll.timeout();
            if (i4 == 0) {
                timeout3.clearDeadline();
            } else {
                timeout3.deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String name, final boolean z) {
        C10843j.m430f(name, "name");
        return new ThreadFactory() { // from class: okhttp3.internal.Util$threadFactory$1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, name);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final void threadName(@NotNull String name, @NotNull InterfaceC10809a<C10868p> block) {
        C10843j.m430f(name, "name");
        C10843j.m430f(block, "block");
        Thread currentThread = Thread.currentThread();
        C10843j.m431e(currentThread, "currentThread");
        String name2 = currentThread.getName();
        currentThread.setName(name);
        try {
            block.invoke();
        } finally {
            currentThread.setName(name2);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers toHeaderList) {
        C10843j.m430f(toHeaderList, "$this$toHeaderList");
        C10878c m411c = C10882g.m411c(0, toHeaderList.size());
        ArrayList arrayList = new ArrayList(C10753i.m482g(m411c));
        Iterator<Integer> it = m411c.iterator();
        while (((C10877b) it).f21427c) {
            int nextInt = ((AbstractC10762r) it).nextInt();
            arrayList.add(new Header(toHeaderList.name(nextInt), toHeaderList.value(nextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> toHeaders) {
        C10843j.m430f(toHeaders, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : toHeaders) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        C10843j.m431e(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        C10843j.m431e(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl toHostHeader, boolean z) {
        String host;
        C10843j.m430f(toHostHeader, "$this$toHostHeader");
        if (C10929r.m379m(toHostHeader.host(), ":")) {
            host = "[" + toHostHeader.host() + ']';
        } else {
            host = toHostHeader.host();
        }
        if (z || toHostHeader.port() != HttpUrl.Companion.defaultPort(toHostHeader.scheme())) {
            return host + ':' + toHostHeader.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> toImmutableList) {
        C10843j.m430f(toImmutableList, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C10757m.m470s(toImmutableList));
        C10843j.m431e(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> toImmutableMap) {
        C10843j.m430f(toImmutableMap, "$this$toImmutableMap");
        if (toImmutableMap.isEmpty()) {
            return C10760p.f21364a;
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
        C10843j.m431e(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String toLongOrDefault, long j) {
        C10843j.m430f(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String trimSubstring, int i, int i2) {
        C10843j.m430f(trimSubstring, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(trimSubstring, i, i2);
        String substring = trimSubstring.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(trimSubstring, indexOfFirstNonAsciiWhitespace, i2));
        C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(@NotNull Object wait) {
        C10843j.m430f(wait, "$this$wait");
        wait.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception withSuppressed, @NotNull List<? extends Exception> suppressed) {
        C10843j.m430f(withSuppressed, "$this$withSuppressed");
        C10843j.m430f(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        for (Exception exc : suppressed) {
            C10738b.m502a(withSuppressed, exc);
        }
        return withSuppressed;
    }

    public static final void writeMedium(@NotNull BufferedSink writeMedium, int i) throws IOException {
        C10843j.m430f(writeMedium, "$this$writeMedium");
        writeMedium.writeByte((i >>> 16) & 255);
        writeMedium.writeByte((i >>> 8) & 255);
        writeMedium.writeByte(i & 255);
    }
}
