package okio;

import androidx.appcompat.view.menu.C0235r;
import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1194j;
import com.applovin.impl.sdk.p033e.C3132a0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.C10751g;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10910b;
import okhttp3.internal.connection.RealConnection;
import okio.internal.BufferKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0095\u0001B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\b\u0010\u0005\u001a\u00020\u0000H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\u0001H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J$\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J \u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\fJ\u001a\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fJ\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\fH\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020\fH\u0016J\b\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\fH\u0016J\b\u0010,\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010/\u001a\u00020#2\u0006\u0010.\u001a\u00020-H\u0016J\u0018\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00103\u001a\u00020\f2\u0006\u00100\u001a\u000202H\u0016J\b\u00105\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u00108\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016J\u0018\u00108\u001a\u0002042\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u000206H\u0016J\n\u00109\u001a\u0004\u0018\u000104H\u0016J\b\u0010:\u001a\u000204H\u0016J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020#H\u0016J\b\u0010>\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020=H\u0016J\u0010\u00101\u001a\u00020\u000e2\u0006\u00100\u001a\u00020=H\u0016J \u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020=2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010?\u001a\u00020#2\u0006\u00100\u001a\u00020@H\u0016J\u0006\u0010A\u001a\u00020\u000eJ\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020+H\u0016J \u0010D\u001a\u00020\u00002\u0006\u0010C\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u000204H\u0016J \u0010F\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#H\u0016J\u0010\u0010J\u001a\u00020\u00002\u0006\u0010I\u001a\u00020#H\u0016J\u0018\u0010K\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016J(\u0010K\u001a\u00020\u00002\u0006\u0010E\u001a\u0002042\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020=H\u0016J \u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020=2\u0006\u0010\u0015\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\u0010\u0010D\u001a\u00020#2\u0006\u0010L\u001a\u00020@H\u0016J\u0010\u0010N\u001a\u00020\f2\u0006\u0010L\u001a\u00020MH\u0016J\u0018\u0010D\u001a\u00020\u00002\u0006\u0010L\u001a\u00020M2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010P\u001a\u00020\u00002\u0006\u0010O\u001a\u00020#H\u0016J\u0010\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020#H\u0016J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020#H\u0016J\u0010\u0010U\u001a\u00020\u00002\u0006\u0010T\u001a\u00020#H\u0016J\u0010\u0010V\u001a\u00020\u00002\u0006\u0010T\u001a\u00020#H\u0016J\u0010\u0010X\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010Y\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010Z\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0010\u0010[\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\fH\u0016J\u0017\u0010`\u001a\u00020]2\u0006\u0010\\\u001a\u00020#H\u0000¢\u0006\u0004\b^\u0010_J\u0018\u0010D\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010?\u001a\u00020\f2\u0006\u00100\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001bH\u0016J\u0018\u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\fH\u0016J \u0010a\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010a\u001a\u00020\f2\u0006\u0010d\u001a\u00020+H\u0016J\u0018\u0010a\u001a\u00020\f2\u0006\u0010d\u001a\u00020+2\u0006\u0010b\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020+H\u0016J\u0018\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020+2\u0006\u0010b\u001a\u00020\fH\u0016J\u0018\u0010g\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020+H\u0016J(\u0010g\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010d\u001a\u00020+2\u0006\u0010h\u001a\u00020#2\u0006\u0010\r\u001a\u00020#H\u0016J\b\u0010i\u001a\u00020\u000eH\u0016J\b\u0010j\u001a\u00020\nH\u0016J\b\u0010k\u001a\u00020\u000eH\u0016J\b\u0010m\u001a\u00020lH\u0016J\u0006\u0010n\u001a\u00020+J\u0006\u0010o\u001a\u00020+J\u0006\u0010p\u001a\u00020+J\u0006\u0010q\u001a\u00020+J\u000e\u0010s\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u000e\u0010t\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u000e\u0010u\u001a\u00020+2\u0006\u0010r\u001a\u00020+J\u0013\u0010x\u001a\u00020\n2\b\u0010w\u001a\u0004\u0018\u00010vH\u0096\u0002J\b\u0010y\u001a\u00020#H\u0016J\b\u0010z\u001a\u000204H\u0016J\u0006\u0010{\u001a\u00020\u0000J\b\u0010|\u001a\u00020\u0000H\u0016J\u0006\u0010}\u001a\u00020+J\u000e\u0010}\u001a\u00020+2\u0006\u0010\r\u001a\u00020#J\u0013\u0010\u0080\u0001\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0007J\u0013\u0010\u0081\u0001\u001a\u00020~2\b\b\u0002\u0010\u007f\u001a\u00020~H\u0007J\u0019\u0010\u001e\u001a\u00020\u001b2\u0007\u0010\u0082\u0001\u001a\u00020\fH\u0007¢\u0006\u0005\b\u0083\u0001\u0010\u001fJ\u0012\u0010\u0086\u0001\u001a\u00020\fH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0007\u0010\u0087\u0001\u001a\u00020\nH\u0002J\u0012\u0010\u0089\u0001\u001a\u00020+2\u0007\u0010\u0088\u0001\u001a\u000204H\u0002J\u001a\u0010\u008a\u0001\u001a\u00020+2\u0007\u0010\u0088\u0001\u001a\u0002042\u0006\u0010r\u001a\u00020+H\u0002R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R2\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u008d\u0001\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u008e\u0001\u001a\u0006\b\u0086\u0001\u0010\u0085\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0005\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0096\u0001"}, m508d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "buffer", "Ljava/io/OutputStream;", "outputStream", "emitCompleteSegments", "emit", "", "exhausted", "", "byteCount", "Lkotlin/p;", "require", "request", "peek", "Ljava/io/InputStream;", "inputStream", "out", "offset", "copyTo", "writeTo", "input", "readFrom", "completeSegmentByteCount", "", "readByte", "pos", "getByte", "(J)B", "get", "", "readShort", "", "readInt", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lokio/ByteString;", "readByteString", "Lokio/Options;", "options", "select", "sink", "readFully", "Lokio/Sink;", "readAll", "", "readUtf8", "Ljava/nio/charset/Charset;", "charset", "readString", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "read", "Ljava/nio/ByteBuffer;", "clear", "skip", "byteString", "write", "string", "writeUtf8", "beginIndex", "endIndex", "codePoint", "writeUtf8CodePoint", "writeString", FirebaseAnalytics.Param.SOURCE, "Lokio/Source;", "writeAll", "b", "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lokio/Segment;", "writableSegment$okio", "(I)Lokio/Segment;", "writableSegment", "indexOf", "fromIndex", "toIndex", "bytes", "targetBytes", "indexOfElement", "rangeEquals", "bytesOffset", "flush", "isOpen", "close", "Lokio/Timeout;", "timeout", "md5", "sha1", "sha256", "sha512", "key", "hmacSha1", "hmacSha256", "hmacSha512", "", "other", "equals", "hashCode", "toString", "copy", "clone", "snapshot", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "readAndWriteUnsafe", FirebaseAnalytics.Param.INDEX, "-deprecated_getByte", "-deprecated_size", "()J", "size", "forever", "algorithm", "digest", "hmac", "head", "Lokio/Segment;", "<set-?>", "J", "setSize$okio", "(J)V", "getBuffer", "()Lokio/Buffer;", "<init>", "()V", "UnsafeCursor", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    @JvmField
    @Nullable
    public Segment head;
    private long size;

    @Metadata(m509d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001f"}, m508d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "", "next", "", "offset", "seek", "newSize", "resizeBuffer", "minByteCount", "expandBuffer", "Lkotlin/p;", "close", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "", "readWrite", "Z", "Lokio/Segment;", "segment", "Lokio/Segment;", "J", "", "data", "[B", "start", "I", "end", "<init>", "()V", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class UnsafeCursor implements Closeable {
        @JvmField
        @Nullable
        public Buffer buffer;
        @JvmField
        @Nullable
        public byte[] data;
        @JvmField
        public boolean readWrite;
        private Segment segment;
        @JvmField
        public long offset = -1;
        @JvmField
        public int start = -1;
        @JvmField
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int i) {
            boolean z;
            boolean z2 = true;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i > 8192) {
                    z2 = false;
                }
                if (z2) {
                    Buffer buffer = this.buffer;
                    if (buffer != null) {
                        if (this.readWrite) {
                            long size = buffer.size();
                            Segment writableSegment$okio = buffer.writableSegment$okio(i);
                            int i2 = 8192 - writableSegment$okio.limit;
                            writableSegment$okio.limit = 8192;
                            long j = i2;
                            buffer.setSize$okio(size + j);
                            this.segment = writableSegment$okio;
                            this.offset = size;
                            this.data = writableSegment$okio.data;
                            this.start = 8192 - i2;
                            this.end = 8192;
                            return j;
                        }
                        throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
                    }
                    throw new IllegalStateException("not attached to a buffer".toString());
                }
                throw new IllegalArgumentException(C0235r.m12816a("minByteCount > Segment.SIZE: ", i).toString());
            }
            throw new IllegalArgumentException(C0235r.m12816a("minByteCount <= 0: ", i).toString());
        }

        public final int next() {
            long j = this.offset;
            Buffer buffer = this.buffer;
            C10843j.m433c(buffer);
            if (j != buffer.size()) {
                long j2 = this.offset;
                return seek(j2 == -1 ? 0L : j2 + (this.end - this.start));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        public final long resizeBuffer(long j) {
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (this.readWrite) {
                    long size = buffer.size();
                    int i = (j > size ? 1 : (j == size ? 0 : -1));
                    int i2 = 1;
                    if (i <= 0) {
                        if (j < 0) {
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            long j2 = size - j;
                            while (true) {
                                if (j2 <= 0) {
                                    break;
                                }
                                Segment segment = buffer.head;
                                C10843j.m433c(segment);
                                Segment segment2 = segment.prev;
                                C10843j.m433c(segment2);
                                int i3 = segment2.limit;
                                long j3 = i3 - segment2.pos;
                                if (j3 <= j2) {
                                    buffer.head = segment2.pop();
                                    SegmentPool.recycle(segment2);
                                    j2 -= j3;
                                } else {
                                    segment2.limit = i3 - ((int) j2);
                                    break;
                                }
                            }
                            this.segment = null;
                            this.offset = j;
                            this.data = null;
                            this.start = -1;
                            this.end = -1;
                        } else {
                            throw new IllegalArgumentException(C3132a0.m7696a("newSize < 0: ", j).toString());
                        }
                    } else if (i > 0) {
                        long j4 = j - size;
                        boolean z = true;
                        while (j4 > 0) {
                            Segment writableSegment$okio = buffer.writableSegment$okio(i2);
                            int min = (int) Math.min(j4, 8192 - writableSegment$okio.limit);
                            int i4 = writableSegment$okio.limit + min;
                            writableSegment$okio.limit = i4;
                            j4 -= min;
                            if (z) {
                                this.segment = writableSegment$okio;
                                this.offset = size;
                                this.data = writableSegment$okio.data;
                                this.start = i4 - min;
                                this.end = i4;
                                z = false;
                            }
                            i2 = 1;
                        }
                    }
                    buffer.setSize$okio(j);
                    return size;
                }
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        public final int seek(long j) {
            Segment segment;
            Buffer buffer = this.buffer;
            if (buffer != null) {
                if (j < -1 || j > buffer.size()) {
                    String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(buffer.size())}, 2));
                    C10843j.m431e(format, "java.lang.String.format(format, *args)");
                    throw new ArrayIndexOutOfBoundsException(format);
                } else if (j == -1 || j == buffer.size()) {
                    this.segment = null;
                    this.offset = j;
                    this.data = null;
                    this.start = -1;
                    this.end = -1;
                    return -1;
                } else {
                    long size = buffer.size();
                    Segment segment2 = buffer.head;
                    Segment segment3 = this.segment;
                    long j2 = 0;
                    if (segment3 != null) {
                        long j3 = this.offset;
                        int i = this.start;
                        C10843j.m433c(segment3);
                        long j4 = j3 - (i - segment3.pos);
                        if (j4 > j) {
                            segment = segment2;
                            segment2 = this.segment;
                            size = j4;
                        } else {
                            segment = this.segment;
                            j2 = j4;
                        }
                    } else {
                        segment = segment2;
                    }
                    if (size - j > j - j2) {
                        while (true) {
                            C10843j.m433c(segment);
                            int i2 = segment.limit;
                            int i3 = segment.pos;
                            if (j < (i2 - i3) + j2) {
                                break;
                            }
                            j2 += i2 - i3;
                            segment = segment.next;
                        }
                    } else {
                        while (size > j) {
                            C10843j.m433c(segment2);
                            segment2 = segment2.prev;
                            C10843j.m433c(segment2);
                            size -= segment2.limit - segment2.pos;
                        }
                        j2 = size;
                        segment = segment2;
                    }
                    if (this.readWrite) {
                        C10843j.m433c(segment);
                        if (segment.shared) {
                            Segment unsharedCopy = segment.unsharedCopy();
                            if (buffer.head == segment) {
                                buffer.head = unsharedCopy;
                            }
                            segment = segment.push(unsharedCopy);
                            Segment segment4 = segment.prev;
                            C10843j.m433c(segment4);
                            segment4.pop();
                        }
                    }
                    this.segment = segment;
                    this.offset = j;
                    C10843j.m433c(segment);
                    this.data = segment.data;
                    int i4 = segment.pos + ((int) (j - j2));
                    this.start = i4;
                    int i5 = segment.limit;
                    this.end = i5;
                    return i5 - i4;
                }
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = buffer.size - j3;
        }
        return buffer.copyTo(outputStream, j3, j2);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j);
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return buffer.copyTo(buffer2, j, j2);
    }

    private final ByteString digest(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i = segment.pos;
            messageDigest.update(bArr, i, segment.limit - i);
            Segment segment2 = segment.next;
            while (true) {
                C10843j.m433c(segment2);
                if (segment2 == segment) {
                    break;
                }
                byte[] bArr2 = segment2.data;
                int i2 = segment2.pos;
                messageDigest.update(bArr2, i2, segment2.limit - i2);
                segment2 = segment2.next;
            }
        }
        byte[] digest = messageDigest.digest();
        C10843j.m431e(digest, "messageDigest.digest()");
        return new ByteString(digest);
    }

    private final ByteString hmac(String str, ByteString byteString) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i = segment.pos;
                mac.update(bArr, i, segment.limit - i);
                Segment segment2 = segment.next;
                while (true) {
                    C10843j.m433c(segment2);
                    if (segment2 == segment) {
                        break;
                    }
                    byte[] bArr2 = segment2.data;
                    int i2 = segment2.pos;
                    mac.update(bArr2, i2, segment2.limit - i2);
                    segment2 = segment2.next;
                }
            }
            byte[] doFinal = mac.doFinal();
            C10843j.m431e(doFinal, "mac.doFinal()");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    private final void readFrom(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            Segment writableSegment$okio = writableSegment$okio(1);
            int read = inputStream.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
            if (read == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    this.head = writableSegment$okio.pop();
                    SegmentPool.recycle(writableSegment$okio);
                }
                if (!z) {
                    throw new EOFException();
                }
                return;
            }
            writableSegment$okio.limit += read;
            long j2 = read;
            this.size += j2;
            j -= j2;
        }
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i, Object obj) {
        if ((i & 1) != 0) {
            unsafeCursor = new UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = buffer.size;
        }
        return buffer.writeTo(outputStream, j);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m13229deprecated_getByte(long j) {
        return getByte(j);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final long m13230deprecated_size() {
        return this.size;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer buffer() {
        return this;
    }

    public final void clear() {
        skip(size());
    }

    @NotNull
    public Buffer clone() {
        return copy();
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        C10843j.m433c(segment);
        Segment segment2 = segment.prev;
        C10843j.m433c(segment2);
        int i = segment2.limit;
        if (i < 8192 && segment2.owner) {
            size -= i - segment2.pos;
        }
        return size;
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            C10843j.m433c(segment);
            Segment sharedCopy = segment.sharedCopy();
            buffer.head = sharedCopy;
            sharedCopy.prev = sharedCopy;
            sharedCopy.next = sharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = sharedCopy.prev;
                C10843j.m433c(segment3);
                C10843j.m433c(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream) throws IOException {
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream outputStream, long j) throws IOException {
        return copyTo$default(this, outputStream, j, 0L, 4, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j, long j2) throws IOException {
        int i;
        C10843j.m430f(out, "out");
        Util.checkOffsetAndCount(this.size, j, j2);
        if (j2 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            C10843j.m433c(segment);
            int i2 = segment.limit;
            int i3 = segment.pos;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            segment = segment.next;
        }
        while (j2 > 0) {
            C10843j.m433c(segment);
            int min = (int) Math.min(segment.limit - i, j2);
            out.write(segment.data, (int) (segment.pos + j), min);
            j2 -= min;
            segment = segment.next;
            j = 0;
        }
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j) {
        C10843j.m430f(out, "out");
        return copyTo(out, j, this.size - j);
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long j, long j2) {
        C10843j.m430f(out, "out");
        Util.checkOffsetAndCount(size(), j, j2);
        if (j2 != 0) {
            out.setSize$okio(out.size() + j2);
            Segment segment = this.head;
            while (true) {
                C10843j.m433c(segment);
                int i = segment.limit;
                int i2 = segment.pos;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                segment = segment.next;
            }
            while (j2 > 0) {
                C10843j.m433c(segment);
                Segment sharedCopy = segment.sharedCopy();
                int i3 = sharedCopy.pos + ((int) j);
                sharedCopy.pos = i3;
                sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
                Segment segment2 = out.head;
                if (segment2 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    out.head = sharedCopy;
                } else {
                    C10843j.m433c(segment2);
                    Segment segment3 = segment2.prev;
                    C10843j.m433c(segment3);
                    segment3.push(sharedCopy);
                }
                j2 -= sharedCopy.limit - sharedCopy.pos;
                segment = segment.next;
                j = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            if (size() == buffer.size()) {
                if (size() == 0) {
                    return true;
                }
                Segment segment = this.head;
                C10843j.m433c(segment);
                Segment segment2 = buffer.head;
                C10843j.m433c(segment2);
                int i = segment.pos;
                int i2 = segment2.pos;
                long j = 0;
                while (j < size()) {
                    long min = Math.min(segment.limit - i, segment2.limit - i2);
                    long j2 = 0;
                    while (j2 < min) {
                        int i3 = i + 1;
                        int i4 = i2 + 1;
                        if (segment.data[i] == segment2.data[i2]) {
                            j2++;
                            i = i3;
                            i2 = i4;
                        }
                    }
                    if (i == segment.limit) {
                        segment = segment.next;
                        C10843j.m433c(segment);
                        i = segment.pos;
                    }
                    if (i2 == segment2.limit) {
                        segment2 = segment2.next;
                        C10843j.m433c(segment2);
                        i2 = segment2.pos;
                    }
                    j += min;
                }
                return true;
            }
        }
        return false;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    @JvmName(name = "getByte")
    public final byte getByte(long j) {
        Util.checkOffsetAndCount(size(), j, 1L);
        Segment segment = this.head;
        if (segment == null) {
            C10843j.m433c(null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                segment = segment.prev;
                C10843j.m433c(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                int i = segment.limit;
                int i2 = segment.pos;
                long j3 = (i - i2) + j2;
                if (j3 > j) {
                    return segment.data[(int) ((i2 + j) - j2)];
                }
                segment = segment.next;
                C10843j.m433c(segment);
                j2 = j3;
            }
        }
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment != null) {
            int i = 1;
            do {
                int i2 = segment.limit;
                for (int i3 = segment.pos; i3 < i2; i3++) {
                    i = (i * 31) + segment.data[i3];
                }
                segment = segment.next;
                C10843j.m433c(segment);
            } while (segment != this.head);
            return i;
        }
        return 0;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac("HmacSHA1", key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b, long j, long j2) {
        Segment segment;
        int i;
        long j3 = 0;
        if (!(0 <= j && j2 >= j)) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > size()) {
            j2 = size();
        }
        if (j == j2 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j < j) {
            j3 = size();
            while (j3 > j) {
                segment = segment.prev;
                C10843j.m433c(segment);
                j3 -= segment.limit - segment.pos;
            }
            while (j3 < j2) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                C10843j.m433c(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            C10843j.m433c(segment);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            C10843j.m433c(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        C10843j.m430f(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long j) throws IOException {
        boolean z;
        boolean z2;
        int i;
        long j2 = j;
        C10843j.m430f(bytes, "bytes");
        if (bytes.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j3 = 0;
            if (j2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Segment segment = this.head;
                if (segment != null) {
                    if (size() - j2 < j2) {
                        j3 = size();
                        while (j3 > j2) {
                            segment = segment.prev;
                            C10843j.m433c(segment);
                            j3 -= segment.limit - segment.pos;
                        }
                        byte[] internalArray$okio = bytes.internalArray$okio();
                        byte b = internalArray$okio[0];
                        int size = bytes.size();
                        long size2 = (size() - size) + 1;
                        while (j3 < size2) {
                            byte[] bArr = segment.data;
                            long j4 = size2;
                            int min = (int) Math.min(segment.limit, (segment.pos + size2) - j3);
                            i = (int) ((segment.pos + j2) - j3);
                            while (i < min) {
                                if (bArr[i] != b || !BufferKt.rangeEquals(segment, i + 1, internalArray$okio, 1, size)) {
                                    i++;
                                } else {
                                    return (i - segment.pos) + j3;
                                }
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            C10843j.m433c(segment);
                            j2 = j3;
                            size2 = j4;
                        }
                    } else {
                        while (true) {
                            long j5 = (segment.limit - segment.pos) + j3;
                            if (j5 > j2) {
                                break;
                            }
                            segment = segment.next;
                            C10843j.m433c(segment);
                            j3 = j5;
                        }
                        byte[] internalArray$okio2 = bytes.internalArray$okio();
                        byte b2 = internalArray$okio2[0];
                        int size3 = bytes.size();
                        long size4 = (size() - size3) + 1;
                        while (j3 < size4) {
                            byte[] bArr2 = segment.data;
                            long j6 = size4;
                            int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j3);
                            i = (int) ((segment.pos + j2) - j3);
                            while (i < min2) {
                                if (bArr2[i] == b2 && BufferKt.rangeEquals(segment, i + 1, internalArray$okio2, 1, size3)) {
                                    return (i - segment.pos) + j3;
                                }
                                i++;
                            }
                            j3 += segment.limit - segment.pos;
                            segment = segment.next;
                            C10843j.m433c(segment);
                            j2 = j3;
                            size4 = j6;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(C3132a0.m7696a("fromIndex < 0: ", j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        C10843j.m430f(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long j) {
        boolean z;
        int i;
        C10843j.m430f(targetBytes, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    segment = segment.prev;
                    C10843j.m433c(segment);
                    j2 -= segment.limit - segment.pos;
                }
                if (targetBytes.size() == 2) {
                    byte b = targetBytes.getByte(0);
                    byte b2 = targetBytes.getByte(1);
                    while (j2 < size()) {
                        byte[] bArr = segment.data;
                        i = (int) ((segment.pos + j) - j2);
                        int i2 = segment.limit;
                        while (i < i2) {
                            byte b3 = bArr[i];
                            if (b3 != b && b3 != b2) {
                                i++;
                            }
                        }
                        j2 += segment.limit - segment.pos;
                        segment = segment.next;
                        C10843j.m433c(segment);
                        j = j2;
                    }
                    return -1L;
                }
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j2 < size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 != b5) {
                            }
                        }
                        i++;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    C10843j.m433c(segment);
                    j = j2;
                }
                return -1L;
            }
            while (true) {
                long j3 = (segment.limit - segment.pos) + j2;
                if (j3 > j) {
                    break;
                }
                segment = segment.next;
                C10843j.m433c(segment);
                j2 = j3;
            }
            if (targetBytes.size() == 2) {
                byte b6 = targetBytes.getByte(0);
                byte b7 = targetBytes.getByte(1);
                while (j2 < size()) {
                    byte[] bArr3 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b8 = bArr3[i];
                        if (b8 != b6 && b8 != b7) {
                            i++;
                        }
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    C10843j.m433c(segment);
                    j = j2;
                }
                return -1L;
            }
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j2 < size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 != b10) {
                        }
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                C10843j.m433c(segment);
                j = j2;
            }
            return -1L;
            return (i - segment.pos) + j2;
        }
        throw new IllegalArgumentException(C3132a0.m7696a("fromIndex < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int i, int i2) {
                C10843j.m430f(sink, "sink");
                return Buffer.this.read(sink, i, i2);
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer$outputStream$1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int i) {
                Buffer.this.writeByte(i);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int i, int i2) {
                C10843j.m430f(data, "data");
                Buffer.this.write(data, i, i2);
            }
        };
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, @NotNull ByteString bytes) {
        C10843j.m430f(bytes, "bytes");
        return rangeEquals(j, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j, @NotNull ByteString bytes, int i, int i2) {
        C10843j.m430f(bytes, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || bytes.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (getByte(i3 + j) != bytes.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        C10843j.m430f(sink, "sink");
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(sink.remaining(), segment.limit - segment.pos);
            sink.put(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            this.size -= min;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
            return min;
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        C10843j.m430f(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int i, int i2) {
        C10843j.m430f(sink, "sink");
        Util.checkOffsetAndCount(sink.length, i, i2);
        Segment segment = this.head;
        if (segment != null) {
            int min = Math.min(i2, segment.limit - segment.pos);
            byte[] bArr = segment.data;
            int i3 = segment.pos;
            C10751g.m494b(bArr, i, sink, i3, i3 + min);
            segment.pos += min;
            setSize$okio(size() - min);
            if (segment.pos == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long j) {
        boolean z;
        C10843j.m430f(sink, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            sink.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        C10843j.m430f(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        C10843j.m430f(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = true;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            int i3 = i + 1;
            byte b = segment.data[i];
            setSize$okio(size() - 1);
            if (i3 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long j) throws EOFException {
        boolean z;
        if (j >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (size() >= j) {
                if (j >= 4096) {
                    ByteString snapshot = snapshot((int) j);
                    skip(j);
                    return snapshot;
                }
                return new ByteString(readByteArray(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[EDGE_INSN: B:45:0x00ad->B:38:0x00ad ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbb
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        L11:
            okio.Segment r7 = r15.head
            kotlin.jvm.internal.C10843j.m433c(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L1c:
            if (r9 >= r10) goto L99
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6c
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6c
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L42
            if (r13 != 0) goto L3c
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3c
            goto L42
        L3c:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L78
        L42:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            okio.Buffer r0 = r0.writeByte(r11)
            if (r1 != 0) goto L54
            r0.readByte()
        L54:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L7d
            if (r0 != 0) goto L7d
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L78:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1c
        L7d:
            if (r0 == 0) goto L81
            r2 = r13
            goto L99
        L81:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.Util.toHexString(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L99:
            if (r9 != r10) goto La5
            okio.Segment r8 = r7.pop()
            r15.head = r8
            okio.SegmentPool.recycle(r7)
            goto La7
        La5:
            r7.pos = r9
        La7:
            if (r2 != 0) goto Lad
            okio.Segment r7 = r15.head
            if (r7 != 0) goto L11
        Lad:
            long r5 = r15.size()
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.setSize$okio(r5)
            if (r1 == 0) goto Lb9
            goto Lba
        Lb9:
            long r3 = -r3
        Lba:
            return r3
        Lbb:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        C10843j.m430f(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long j) throws IOException {
        boolean z;
        C10843j.m430f(input, "input");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            readFrom(input, j, false);
            return this;
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long j) throws EOFException {
        C10843j.m430f(sink, "sink");
        if (size() >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        C10843j.m430f(sink, "sink");
        int i = 0;
        while (i < sink.length) {
            int read = read(sink, i, sink.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[EDGE_INSN: B:42:0x00a8->B:37:0x00a8 ?: BREAK  , SYNTHETIC] */
    @Override // okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb2
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.C10843j.m433c(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L94
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L29
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L29
            int r11 = r10 - r11
            goto L43
        L29:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L38
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L38
        L33:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L43
        L38:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L78
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L78
            goto L33
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L53
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L53:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L78:
            if (r0 == 0) goto L7c
            r1 = 1
            goto L94
        L7c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.Util.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L94:
            if (r8 != r9) goto La0
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La2
        La0:
            r6.pos = r8
        La2:
            if (r1 != 0) goto La8
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La8:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            setSize$okio(size() - 4);
            if (i8 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return Util.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i3] & 255) << 48) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j2 = j | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
            setSize$okio(size() - 8);
            if (i10 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            return j2;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return Util.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.head;
            C10843j.m433c(segment);
            int i = segment.pos;
            int i2 = segment.limit;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            setSize$okio(size() - 2);
            if (i4 == i2) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return Util.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long j, @NotNull Charset charset) throws EOFException {
        boolean z;
        C10843j.m430f(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.size >= j) {
                if (i == 0) {
                    return "";
                }
                Segment segment = this.head;
                C10843j.m433c(segment);
                int i2 = segment.pos;
                if (i2 + j > segment.limit) {
                    return new String(readByteArray(j), charset);
                }
                int i3 = (int) j;
                String str = new String(segment.data, i2, i3, charset);
                int i4 = segment.pos + i3;
                segment.pos = i4;
                this.size -= j;
                if (i4 == segment.limit) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(C3132a0.m7696a("byteCount: ", j).toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        C10843j.m430f(charset, "charset");
        return readString(this.size, charset);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @JvmOverloads
    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        C10843j.m430f(unsafeCursor, "unsafeCursor");
        if (unsafeCursor.buffer == null) {
            unsafeCursor.buffer = this;
            unsafeCursor.readWrite = false;
            return unsafeCursor;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, C10910b.f21450b);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long j) throws EOFException {
        return readString(j, C10910b.f21450b);
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte b = getByte(0L);
            if ((b & 128) == 0) {
                i = b & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((b & 224) == 192) {
                i = b & 31;
                i2 = 2;
                i3 = 128;
            } else if ((b & 240) == 224) {
                i = b & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((b & 248) == 240) {
                i = b & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte b2 = getByte(j2);
                    if ((b2 & 192) == 128) {
                        i = (i << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
                    } else {
                        skip(j2);
                        return Utf8.REPLACEMENT_CODE_POINT;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return Utf8.REPLACEMENT_CODE_POINT;
                }
                return i;
            }
            StringBuilder m12536b = C0406q1.m12536b("size < ", i2, ": ");
            m12536b.append(size());
            m12536b.append(" (to read code point prefixed 0x");
            m12536b.append(Util.toHexString(b));
            m12536b.append(')');
            throw new EOFException(m12536b.toString());
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return BufferKt.readUtf8Line(this, indexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long j) throws EOFException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j2);
            if (indexOf != -1) {
                return BufferKt.readUtf8Line(this, indexOf);
            }
            if (j2 < size() && getByte(j2 - 1) == ((byte) 13) && getByte(j2) == b) {
                return BufferKt.readUtf8Line(this, j2);
            }
            Buffer buffer = new Buffer();
            copyTo(buffer, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
        }
        throw new IllegalArgumentException(C3132a0.m7696a("limit < 0: ", j).toString());
    }

    @Override // okio.BufferedSource
    public boolean request(long j) {
        return this.size >= j;
    }

    @Override // okio.BufferedSource
    public void require(long j) throws EOFException {
        if (this.size < j) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) {
        C10843j.m430f(options, "options");
        int selectPrefix$default = BufferKt.selectPrefix$default(this, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public final void setSize$okio(long j) {
        this.size = j;
    }

    @NotNull
    public final ByteString sha1() {
        return digest("SHA-1");
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    @JvmName(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j) throws EOFException {
        while (j > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            setSize$okio(size() - j2);
            j -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= ((long) Integer.MAX_VALUE)) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @NotNull
    public final ByteString snapshot(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        Util.checkOffsetAndCount(size(), 0L, i);
        Segment segment = this.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C10843j.m433c(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            segment = segment.next;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = this.head;
        int i7 = 0;
        while (i2 < i) {
            C10843j.m433c(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            Segment segment = this.head;
            if (segment != null) {
                C10843j.m433c(segment);
                Segment segment2 = segment.prev;
                C10843j.m433c(segment2);
                return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
            }
            Segment take = SegmentPool.take();
            this.head = take;
            take.prev = take;
            take.next = take;
            return take;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        C10843j.m430f(source, "source");
        int remaining = source.remaining();
        int i = remaining;
        while (i > 0) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i, 8192 - writableSegment$okio.limit);
            source.get(writableSegment$okio.data, writableSegment$okio.limit, min);
            i -= min;
            writableSegment$okio.limit += min;
        }
        this.size += remaining;
        return remaining;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        C10843j.m430f(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int i, int i2) {
        C10843j.m430f(byteString, "byteString");
        byteString.write$okio(this, i, i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long j) throws IOException {
        C10843j.m430f(source, "source");
        while (j > 0) {
            long read = source.read(this, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        C10843j.m430f(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int i, int i2) {
        C10843j.m430f(source, "source");
        long j = i2;
        Util.checkOffsetAndCount(source.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            C10751g.m494b(source, writableSegment$okio.limit, writableSegment$okio.data, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        setSize$okio(size() + j);
        return this;
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer source, long j) {
        Segment segment;
        Segment segment2;
        C10843j.m430f(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        Util.checkOffsetAndCount(source.size(), 0L, j);
        while (j > 0) {
            Segment segment3 = source.head;
            C10843j.m433c(segment3);
            int i = segment3.limit;
            C10843j.m433c(source.head);
            if (j < i - segment.pos) {
                Segment segment4 = this.head;
                if (segment4 != null) {
                    C10843j.m433c(segment4);
                    segment2 = segment4.prev;
                } else {
                    segment2 = null;
                }
                if (segment2 != null && segment2.owner) {
                    if ((segment2.limit + j) - (segment2.shared ? 0 : segment2.pos) <= 8192) {
                        Segment segment5 = source.head;
                        C10843j.m433c(segment5);
                        segment5.writeTo(segment2, (int) j);
                        source.setSize$okio(source.size() - j);
                        setSize$okio(size() + j);
                        return;
                    }
                }
                Segment segment6 = source.head;
                C10843j.m433c(segment6);
                source.head = segment6.split((int) j);
            }
            Segment segment7 = source.head;
            C10843j.m433c(segment7);
            long j2 = segment7.limit - segment7.pos;
            source.head = segment7.pop();
            Segment segment8 = this.head;
            if (segment8 == null) {
                this.head = segment7;
                segment7.prev = segment7;
                segment7.next = segment7;
            } else {
                C10843j.m433c(segment8);
                Segment segment9 = segment8.prev;
                C10843j.m433c(segment9);
                segment9.push(segment7).compact();
            }
            source.setSize$okio(source.size() - j2);
            setSize$okio(size() + j2);
            j -= j2;
        }
    }

    @Override // okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        C10843j.m430f(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeByte(int i) {
        Segment writableSegment$okio = writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        Segment writableSegment$okio = writableSegment$okio(i2);
        byte[] bArr = writableSegment$okio.data;
        int i3 = writableSegment$okio.limit + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = BufferKt.getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        writableSegment$okio.limit += i2;
        setSize$okio(size() + i2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = BufferKt.getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        setSize$okio(size() + i);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i) {
        Segment writableSegment$okio = writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        writableSegment$okio.limit = i5 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i) {
        return writeInt(Util.reverseBytes(i));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLong(long j) {
        Segment writableSegment$okio = writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        writableSegment$okio.limit = i8 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long j) {
        return writeLong(Util.reverseBytes(j));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShort(int i) {
        Segment writableSegment$okio = writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        writableSegment$okio.limit = i3 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int i) {
        return writeShort((int) Util.reverseBytes((short) i));
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int i, int i2, @NotNull Charset charset) {
        boolean z;
        boolean z2;
        C10843j.m430f(string, "string");
        C10843j.m430f(charset, "charset");
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 > string.length()) {
                    z3 = false;
                }
                if (z3) {
                    if (C10843j.m435a(charset, C10910b.f21450b)) {
                        return writeUtf8(string, i, i2);
                    }
                    String substring = string.substring(i, i2);
                    C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    C10843j.m431e(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                StringBuilder m12536b = C0406q1.m12536b("endIndex > string.length: ", i2, " > ");
                m12536b.append(string.length());
                throw new IllegalArgumentException(m12536b.toString().toString());
            }
            throw new IllegalArgumentException(C1194j.m11060a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0235r.m12816a("beginIndex < 0: ", i).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        C10843j.m430f(string, "string");
        C10843j.m430f(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream outputStream) throws IOException {
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long j) throws IOException {
        C10843j.m430f(out, "out");
        Util.checkOffsetAndCount(this.size, 0L, j);
        Segment segment = this.head;
        while (j > 0) {
            C10843j.m433c(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, min);
            int i = segment.pos + min;
            segment.pos = i;
            long j2 = min;
            this.size -= j2;
            j -= j2;
            if (i == segment.limit) {
                Segment pop = segment.pop();
                this.head = pop;
                SegmentPool.recycle(segment);
                segment = pop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        C10843j.m430f(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        long size;
        long j;
        char c;
        C10843j.m430f(string, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= string.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = string.charAt(i);
                        if (charAt2 < 128) {
                            Segment writableSegment$okio = writableSegment$okio(1);
                            byte[] bArr = writableSegment$okio.data;
                            int i3 = writableSegment$okio.limit - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = string.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = writableSegment$okio.limit;
                            int i6 = (i3 + i) - i5;
                            writableSegment$okio.limit = i5 + i6;
                            setSize$okio(size() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                Segment writableSegment$okio2 = writableSegment$okio(2);
                                byte[] bArr2 = writableSegment$okio2.data;
                                int i7 = writableSegment$okio2.limit;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                writableSegment$okio2.limit = i7 + 2;
                                size = size();
                                j = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = string.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && 57343 >= c) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                    Segment writableSegment$okio3 = writableSegment$okio(4);
                                    byte[] bArr3 = writableSegment$okio3.data;
                                    int i10 = writableSegment$okio3.limit;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    writableSegment$okio3.limit = i10 + 4;
                                    setSize$okio(size() + 4);
                                    i += 2;
                                } else {
                                    writeByte(63);
                                    i = i8;
                                }
                            } else {
                                Segment writableSegment$okio4 = writableSegment$okio(3);
                                byte[] bArr4 = writableSegment$okio4.data;
                                int i11 = writableSegment$okio4.limit;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                writableSegment$okio4.limit = i11 + 3;
                                size = size();
                                j = 3;
                            }
                            setSize$okio(size + j);
                            i++;
                        }
                    }
                    return this;
                }
                StringBuilder m12536b = C0406q1.m12536b("endIndex > string.length: ", i2, " > ");
                m12536b.append(string.length());
                throw new IllegalArgumentException(m12536b.toString().toString());
            }
            throw new IllegalArgumentException(C1194j.m11060a("endIndex < beginIndex: ", i2, " < ", i).toString());
        }
        throw new IllegalArgumentException(C0235r.m12816a("beginIndex < 0: ", i).toString());
    }

    @Override // okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int i) {
        long size;
        long j;
        if (i < 128) {
            writeByte(i);
        } else {
            if (i < 2048) {
                Segment writableSegment$okio = writableSegment$okio(2);
                byte[] bArr = writableSegment$okio.data;
                int i2 = writableSegment$okio.limit;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                writableSegment$okio.limit = i2 + 2;
                size = size();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                writeByte(63);
            } else if (i < 65536) {
                Segment writableSegment$okio2 = writableSegment$okio(3);
                byte[] bArr2 = writableSegment$okio2.data;
                int i3 = writableSegment$okio2.limit;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                writableSegment$okio2.limit = i3 + 3;
                size = size();
                j = 3;
            } else if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + Util.toHexString(i));
            } else {
                Segment writableSegment$okio3 = writableSegment$okio(4);
                byte[] bArr3 = writableSegment$okio3.data;
                int i4 = writableSegment$okio3.limit;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                writableSegment$okio3.limit = i4 + 4;
                size = size();
                j = 4;
            }
            setSize$okio(size + j);
        }
        return this;
    }
}
