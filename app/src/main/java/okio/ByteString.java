package okio;

import androidx.appcompat.view.menu.C0235r;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10910b;
import kotlin.text.C10925n;
import okio.internal.ByteStringKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001bB\u0011\b\u0000\u0012\u0006\u0010]\u001a\u00020+¢\u0006\u0004\b`\u0010aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\b\u0010\n\u001a\u00020\u0000H\u0016J\b\u0010\u000b\u001a\u00020\u0000H\u0016J\b\u0010\f\u001a\u00020\u0000H\u0016J\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0016J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\b\u0010\u001a\u001a\u00020\u0000H\u0016J\b\u0010\u001b\u001a\u00020\u0000H\u0016J\u001c\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001cH\u0017J\u0017\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001cH\u0010¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001cH\u0087\u0002¢\u0006\u0004\b&\u0010#J\u000f\u0010*\u001a\u00020\u001cH\u0010¢\u0006\u0004\b(\u0010)J\b\u0010,\u001a\u00020+H\u0016J\u000f\u0010/\u001a\u00020+H\u0010¢\u0006\u0004\b-\u0010.J\b\u00101\u001a\u000200H\u0016J\u0010\u00105\u001a\u0002042\u0006\u00103\u001a\u000202H\u0016J'\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0010¢\u0006\u0004\b:\u0010;J(\u0010?\u001a\u00020>2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016J(\u0010?\u001a\u00020>2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0016J\u000e\u0010A\u001a\u00020>2\u0006\u0010@\u001a\u00020\u0000J\u000e\u0010A\u001a\u00020>2\u0006\u0010@\u001a\u00020+J\u000e\u0010C\u001a\u00020>2\u0006\u0010B\u001a\u00020\u0000J\u000e\u0010C\u001a\u00020>2\u0006\u0010B\u001a\u00020+J\u001a\u0010E\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\b\b\u0002\u0010D\u001a\u00020\u001cH\u0007J\u001a\u0010E\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\b\b\u0002\u0010D\u001a\u00020\u001cH\u0017J\u001a\u0010F\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00002\b\b\u0002\u0010D\u001a\u00020\u001cH\u0007J\u001a\u0010F\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020+2\b\b\u0002\u0010D\u001a\u00020\u001cH\u0017J\u0013\u0010H\u001a\u00020>2\b\u0010<\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010I\u001a\u00020\u001cH\u0016J\u0011\u0010J\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u0000H\u0096\u0002J\b\u0010K\u001a\u00020\u0003H\u0016J\u0017\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020\u001cH\u0007¢\u0006\u0004\bL\u0010#J\u000f\u0010N\u001a\u00020\u001cH\u0007¢\u0006\u0004\bM\u0010)J\u0010\u0010Q\u001a\u0002042\u0006\u0010P\u001a\u00020OH\u0002J\u0010\u0010S\u001a\u0002042\u0006\u00103\u001a\u00020RH\u0002R\"\u0010I\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010T\u001a\u0004\bU\u0010)\"\u0004\bV\u0010WR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001a\u0010]\u001a\u00020+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010.R\u0011\u0010N\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\bN\u0010)¨\u0006c"}, m508d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "", "utf8", "Ljava/nio/charset/Charset;", "charset", "string", "base64", "md5", "sha1", "sha256", "sha512", "algorithm", "digest$okio", "(Ljava/lang/String;)Lokio/ByteString;", "digest", "key", "hmacSha1", "hmacSha256", "hmacSha512", "hmac$okio", "(Ljava/lang/String;Lokio/ByteString;)Lokio/ByteString;", "hmac", "base64Url", "hex", "toAsciiLowercase", "toAsciiUppercase", "", "beginIndex", "endIndex", "substring", "pos", "", "internalGet$okio", "(I)B", "internalGet", FirebaseAnalytics.Param.INDEX, "getByte", "get", "getSize$okio", "()I", "getSize", "", "toByteArray", "internalArray$okio", "()[B", "internalArray", "Ljava/nio/ByteBuffer;", "asByteBuffer", "Ljava/io/OutputStream;", "out", "Lkotlin/p;", "write", "Lokio/Buffer;", "buffer", "offset", "byteCount", "write$okio", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "rangeEquals", "prefix", "startsWith", "suffix", "endsWith", "fromIndex", "indexOf", "lastIndexOf", "", "equals", "hashCode", "compareTo", "toString", "-deprecated_getByte", "-deprecated_size", "size", "Ljava/io/ObjectInputStream;", "in", "readObject", "Ljava/io/ObjectOutputStream;", "writeObject", "I", "getHashCode$okio", "setHashCode$okio", "(I)V", "Ljava/lang/String;", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "data", "[B", "getData$okio", "<init>", "([B)V", "Companion", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final Companion Companion = new Companion(null);
    @JvmField
    @NotNull
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    @NotNull
    private final byte[] data;
    private transient int hashCode;
    @Nullable
    private transient String utf8;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\b\u0016J\u0014\u0010\u0013\u001a\u00020\u00042\n\u0010\u0017\u001a\u00020\u0018\"\u00020\u0019H\u0007J%\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b!J\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\tH\u0007J\u001b\u0010\"\u001a\u00020\u0004*\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\b\rJ\f\u0010\u0011\u001a\u00020\u0004*\u00020\tH\u0007J\u0019\u0010#\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u001eJ\u0011\u0010$\u001a\u00020\u0004*\u00020\u0015H\u0007¢\u0006\u0002\b\u0013J%\u0010$\u001a\u00020\u0004*\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006%"}, m508d2 = {"Lokio/ByteString$Companion;", "", "()V", "EMPTY", "Lokio/ByteString;", "serialVersionUID", "", "decodeBase64", "string", "", "-deprecated_decodeBase64", "decodeHex", "-deprecated_decodeHex", "encodeString", "charset", "Ljava/nio/charset/Charset;", "-deprecated_encodeString", "encodeUtf8", "-deprecated_encodeUtf8", "of", "buffer", "Ljava/nio/ByteBuffer;", "-deprecated_of", "data", "", "", "array", "offset", "", "byteCount", "read", "inputstream", "Ljava/io/InputStream;", "-deprecated_read", "encode", "readByteString", "toByteString", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = C10910b.f21450b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            return companion.m54of(bArr, i, i2);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @JvmName(name = "-deprecated_decodeBase64")
        @Nullable
        /* renamed from: -deprecated_decodeBase64  reason: not valid java name */
        public final ByteString m13234deprecated_decodeBase64(@NotNull String string) {
            C10843j.m430f(string, "string");
            return decodeBase64(string);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        @JvmName(name = "-deprecated_decodeHex")
        @NotNull
        /* renamed from: -deprecated_decodeHex  reason: not valid java name */
        public final ByteString m13235deprecated_decodeHex(@NotNull String string) {
            C10843j.m430f(string, "string");
            return decodeHex(string);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        @JvmName(name = "-deprecated_encodeString")
        @NotNull
        /* renamed from: -deprecated_encodeString  reason: not valid java name */
        public final ByteString m13236deprecated_encodeString(@NotNull String string, @NotNull Charset charset) {
            C10843j.m430f(string, "string");
            C10843j.m430f(charset, "charset");
            return encodeString(string, charset);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        @JvmName(name = "-deprecated_encodeUtf8")
        @NotNull
        /* renamed from: -deprecated_encodeUtf8  reason: not valid java name */
        public final ByteString m13237deprecated_encodeUtf8(@NotNull String string) {
            C10843j.m430f(string, "string");
            return encodeUtf8(string);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m13238deprecated_of(@NotNull ByteBuffer buffer) {
            C10843j.m430f(buffer, "buffer");
            return m56of(buffer);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        @JvmName(name = "-deprecated_of")
        @NotNull
        /* renamed from: -deprecated_of  reason: not valid java name */
        public final ByteString m13239deprecated_of(@NotNull byte[] array, int i, int i2) {
            C10843j.m430f(array, "array");
            return m54of(array, i, i2);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        @JvmName(name = "-deprecated_read")
        @NotNull
        /* renamed from: -deprecated_read  reason: not valid java name */
        public final ByteString m13240deprecated_read(@NotNull InputStream inputstream, int i) {
            C10843j.m430f(inputstream, "inputstream");
            return read(inputstream, i);
        }

        @JvmStatic
        @Nullable
        public final ByteString decodeBase64(@NotNull String decodeBase64) {
            C10843j.m430f(decodeBase64, "$this$decodeBase64");
            byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(decodeBase64);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final ByteString decodeHex(@NotNull String decodeHex) {
            C10843j.m430f(decodeHex, "$this$decodeHex");
            if (decodeHex.length() % 2 == 0) {
                int length = decodeHex.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (ByteStringKt.access$decodeHexDigit(decodeHex.charAt(i2 + 1)) + (ByteStringKt.access$decodeHexDigit(decodeHex.charAt(i2)) << 4));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException("Unexpected hex string: ".concat(decodeHex).toString());
        }

        @JvmStatic
        @JvmName(name = "encodeString")
        @NotNull
        public final ByteString encodeString(@NotNull String encode, @NotNull Charset charset) {
            C10843j.m430f(encode, "$this$encode");
            C10843j.m430f(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            C10843j.m431e(bytes, "(this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @JvmStatic
        @NotNull
        public final ByteString encodeUtf8(@NotNull String encodeUtf8) {
            C10843j.m430f(encodeUtf8, "$this$encodeUtf8");
            ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(encodeUtf8));
            byteString.setUtf8$okio(encodeUtf8);
            return byteString;
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        /* renamed from: of */
        public final ByteString m56of(@NotNull ByteBuffer toByteString) {
            C10843j.m430f(toByteString, "$this$toByteString");
            byte[] bArr = new byte[toByteString.remaining()];
            toByteString.get(bArr);
            return new ByteString(bArr);
        }

        @JvmStatic
        @NotNull
        /* renamed from: of */
        public final ByteString m55of(@NotNull byte... data) {
            C10843j.m430f(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new ByteString(copyOf);
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        /* renamed from: of */
        public final ByteString m54of(@NotNull byte[] toByteString, int i, int i2) {
            C10843j.m430f(toByteString, "$this$toByteString");
            Util.checkOffsetAndCount(toByteString.length, i, i2);
            return new ByteString(C10751g.m492d(i, toByteString, i2 + i));
        }

        @JvmStatic
        @JvmName(name = "read")
        @NotNull
        public final ByteString read(@NotNull InputStream readByteString, int i) throws IOException {
            boolean z;
            C10843j.m430f(readByteString, "$this$readByteString");
            int i2 = 0;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[i];
                while (i2 < i) {
                    int read = readByteString.read(bArr, i2, i - i2);
                    if (read != -1) {
                        i2 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(C0235r.m12816a("byteCount < 0: ", i).toString());
        }
    }

    public ByteString(@NotNull byte[] data) {
        C10843j.m430f(data, "data");
        this.data = data;
    }

    @JvmStatic
    @Nullable
    public static final ByteString decodeBase64(@NotNull String str) {
        return Companion.decodeBase64(str);
    }

    @JvmStatic
    @NotNull
    public static final ByteString decodeHex(@NotNull String str) {
        return Companion.decodeHex(str);
    }

    @JvmStatic
    @JvmName(name = "encodeString")
    @NotNull
    public static final ByteString encodeString(@NotNull String str, @NotNull Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @JvmStatic
    @NotNull
    public static final ByteString encodeUtf8(@NotNull String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return byteString.indexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(byteString2, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = byteString.size();
            }
            return byteString.lastIndexOf(bArr, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    /* renamed from: of */
    public static final ByteString m59of(@NotNull ByteBuffer byteBuffer) {
        return Companion.m56of(byteBuffer);
    }

    @JvmStatic
    @NotNull
    /* renamed from: of */
    public static final ByteString m58of(@NotNull byte... bArr) {
        return Companion.m55of(bArr);
    }

    @JvmStatic
    @JvmName(name = "of")
    @NotNull
    /* renamed from: of */
    public static final ByteString m57of(@NotNull byte[] bArr, int i, int i2) {
        return Companion.m54of(bArr, i, i2);
    }

    @JvmStatic
    @JvmName(name = "read")
    @NotNull
    public static final ByteString read(@NotNull InputStream inputStream, int i) throws IOException {
        return Companion.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field field = ByteString.class.getDeclaredField("data");
        C10843j.m431e(field, "field");
        field.setAccessible(true);
        field.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = byteString.size();
            }
            return byteString.substring(i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to operator function", replaceWith = @ReplaceWith(expression = "this[index]", imports = {}))
    @JvmName(name = "-deprecated_getByte")
    /* renamed from: -deprecated_getByte  reason: not valid java name */
    public final byte m13232deprecated_getByte(int i) {
        return getByte(i);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m13233deprecated_size() {
        return size();
    }

    @NotNull
    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        C10843j.m431e(asReadOnlyBuffer, "ByteBuffer.wrap(data).asReadOnlyBuffer()");
        return asReadOnlyBuffer;
    }

    @NotNull
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @NotNull
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(@org.jetbrains.annotations.NotNull okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.C10843j.m430f(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(okio.ByteString):int");
    }

    @NotNull
    public ByteString digest$okio(@NotNull String algorithm) {
        C10843j.m430f(algorithm, "algorithm");
        byte[] digest = MessageDigest.getInstance(algorithm).digest(this.data);
        C10843j.m431e(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    public final boolean endsWith(@NotNull ByteString suffix) {
        C10843j.m430f(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public final boolean endsWith(@NotNull byte[] suffix) {
        C10843j.m430f(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "getByte")
    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    @NotNull
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @Nullable
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    @NotNull
    public String hex() {
        byte[] data$okio;
        char[] cArr = new char[getData$okio().length * 2];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            cArr[i] = ByteStringKt.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = ByteStringKt.getHEX_DIGIT_CHARS()[b & 15];
        }
        return new String(cArr);
    }

    @NotNull
    public ByteString hmac$okio(@NotNull String algorithm, @NotNull ByteString key) {
        C10843j.m430f(algorithm, "algorithm");
        C10843j.m430f(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] doFinal = mac.doFinal(this.data);
            C10843j.m431e(doFinal, "mac.doFinal(data)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @NotNull
    public ByteString hmacSha1(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @NotNull
    public ByteString hmacSha256(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @NotNull
    public ByteString hmacSha512(@NotNull ByteString key) {
        C10843j.m430f(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString byteString) {
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int indexOf(@NotNull ByteString other, int i) {
        C10843j.m430f(other, "other");
        return indexOf(other.internalArray$okio(), i);
    }

    @JvmOverloads
    public final int indexOf(@NotNull byte[] bArr) {
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @JvmOverloads
    public int indexOf(@NotNull byte[] other, int i) {
        C10843j.m430f(other, "other");
        int length = getData$okio().length - other.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!Util.arrayRangeEquals(getData$okio(), max, other, 0, other.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    @NotNull
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString byteString) {
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull ByteString other, int i) {
        C10843j.m430f(other, "other");
        return lastIndexOf(other.internalArray$okio(), i);
    }

    @JvmOverloads
    public final int lastIndexOf(@NotNull byte[] bArr) {
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    @JvmOverloads
    public int lastIndexOf(@NotNull byte[] other, int i) {
        C10843j.m430f(other, "other");
        for (int min = Math.min(i, getData$okio().length - other.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(getData$okio(), min, other, 0, other.length)) {
                return min;
            }
        }
        return -1;
    }

    @NotNull
    public ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, @NotNull ByteString other, int i2, int i3) {
        C10843j.m430f(other, "other");
        return other.rangeEquals(i2, getData$okio(), i, i3);
    }

    public boolean rangeEquals(int i, @NotNull byte[] other, int i2, int i3) {
        C10843j.m430f(other, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= other.length - i3 && Util.arrayRangeEquals(getData$okio(), i, other, i2, i3);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(@Nullable String str) {
        this.utf8 = str;
    }

    @NotNull
    public ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @NotNull
    public ByteString sha256() {
        return digest$okio("SHA-256");
    }

    @NotNull
    public ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @JvmName(name = "size")
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@NotNull ByteString prefix) {
        C10843j.m430f(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    public final boolean startsWith(@NotNull byte[] prefix) {
        C10843j.m430f(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    @NotNull
    public String string(@NotNull Charset charset) {
        C10843j.m430f(charset, "charset");
        return new String(this.data, charset);
    }

    @JvmOverloads
    @NotNull
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @JvmOverloads
    @NotNull
    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public ByteString substring(int i, int i2) {
        if (i >= 0) {
            if (i2 <= getData$okio().length) {
                if (i2 - i >= 0) {
                    return (i == 0 && i2 == getData$okio().length) ? this : new ByteString(C10751g.m492d(i, getData$okio(), i2));
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    @NotNull
    public ByteString toAsciiLowercase() {
        byte b;
        for (int i = 0; i < getData$okio().length; i++) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public ByteString toAsciiUppercase() {
        byte b;
        for (int i = 0; i < getData$okio().length; i++) {
            byte b2 = getData$okio()[i];
            byte b3 = (byte) 97;
            if (b2 >= b3 && b2 <= (b = (byte) 122)) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    @NotNull
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        C10843j.m431e(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = ByteStringKt.access$codePointIndexToCharIndex(getData$okio(), 64);
        if (access$codePointIndexToCharIndex != -1) {
            String utf8 = utf8();
            if (utf8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String substring = utf8.substring(0, access$codePointIndexToCharIndex);
            C10843j.m431e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String m394i = C10925n.m394i(C10925n.m394i(C10925n.m394i(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (access$codePointIndexToCharIndex < utf8.length()) {
                sb = new StringBuilder("[size=");
                sb.append(getData$okio().length);
                sb.append(" text=");
                sb.append(m394i);
                sb.append("…]");
            } else {
                sb = new StringBuilder("[text=");
                sb.append(m394i);
                sb.append(']');
            }
        } else if (getData$okio().length <= 64) {
            sb = new StringBuilder("[hex=");
            sb.append(hex());
            sb.append(']');
        } else {
            sb = new StringBuilder("[size=");
            sb.append(getData$okio().length);
            sb.append(" hex=");
            if (!(64 <= getData$okio().length)) {
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
            sb.append((64 == getData$okio().length ? this : new ByteString(C10751g.m492d(0, getData$okio(), 64))).hex());
            sb.append("…]");
        }
        return sb.toString();
    }

    @NotNull
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio == null) {
            String utf8String = Platform.toUtf8String(internalArray$okio());
            setUtf8$okio(utf8String);
            return utf8String;
        }
        return utf8$okio;
    }

    public void write(@NotNull OutputStream out) throws IOException {
        C10843j.m430f(out, "out");
        out.write(this.data);
    }

    public void write$okio(@NotNull Buffer buffer, int i, int i2) {
        C10843j.m430f(buffer, "buffer");
        ByteStringKt.commonWrite(this, buffer, i, i2);
    }
}
