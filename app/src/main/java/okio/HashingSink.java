package okio;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C10868p;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001b"}, m508d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Buffer;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "Lkotlin/p;", "write", "Lokio/ByteString;", "-deprecated_hash", "()Lokio/ByteString;", "hash", "Ljava/security/MessageDigest;", "messageDigest", "Ljava/security/MessageDigest;", "Ljavax/crypto/Mac;", "mac", "Ljavax/crypto/Mac;", "Lokio/Sink;", "sink", "", "algorithm", "<init>", "(Lokio/Sink;Ljava/lang/String;)V", "key", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "Companion", "okio"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HashingSink extends ForwardingSink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, m508d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", "key", "Lokio/ByteString;", "hmacSha256", "hmacSha512", "md5", "sha1", "sha256", "sha512", "okio"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString key) {
            C10843j.m430f(sink, "sink");
            C10843j.m430f(key, "key");
            return new HashingSink(sink, key, "HmacSHA1");
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString key) {
            C10843j.m430f(sink, "sink");
            C10843j.m430f(key, "key");
            return new HashingSink(sink, key, "HmacSHA256");
        }

        @JvmStatic
        @NotNull
        public final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString key) {
            C10843j.m430f(sink, "sink");
            C10843j.m430f(key, "key");
            return new HashingSink(sink, key, "HmacSHA512");
        }

        @JvmStatic
        @NotNull
        public final HashingSink md5(@NotNull Sink sink) {
            C10843j.m430f(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha1(@NotNull Sink sink) {
            C10843j.m430f(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha256(@NotNull Sink sink) {
            C10843j.m430f(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        @JvmStatic
        @NotNull
        public final HashingSink sha512(@NotNull Sink sink) {
            C10843j.m430f(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull String algorithm) {
        super(sink);
        C10843j.m430f(sink, "sink");
        C10843j.m430f(algorithm, "algorithm");
        this.messageDigest = MessageDigest.getInstance(algorithm);
        this.mac = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(@NotNull Sink sink, @NotNull ByteString key, @NotNull String algorithm) {
        super(sink);
        C10843j.m430f(sink, "sink");
        C10843j.m430f(key, "key");
        C10843j.m430f(algorithm, "algorithm");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            C10868p c10868p = C10868p.f21418a;
            this.mac = mac;
            this.messageDigest = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha1(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha256(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink hmacSha512(@NotNull Sink sink, @NotNull ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink md5(@NotNull Sink sink) {
        return Companion.md5(sink);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha1(@NotNull Sink sink) {
        return Companion.sha1(sink);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha256(@NotNull Sink sink) {
        return Companion.sha256(sink);
    }

    @JvmStatic
    @NotNull
    public static final HashingSink sha512(@NotNull Sink sink) {
        return Companion.sha512(sink);
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "hash", imports = {}))
    @JvmName(name = "-deprecated_hash")
    @NotNull
    /* renamed from: -deprecated_hash  reason: not valid java name */
    public final ByteString m13245deprecated_hash() {
        return hash();
    }

    @JvmName(name = "hash")
    @NotNull
    public final ByteString hash() {
        byte[] result;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            C10843j.m433c(mac);
            result = mac.doFinal();
        }
        C10843j.m431e(result, "result");
        return new ByteString(result);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(@NotNull Buffer source, long j) throws IOException {
        C10843j.m430f(source, "source");
        Util.checkOffsetAndCount(source.size(), 0L, j);
        Segment segment = source.head;
        C10843j.m433c(segment);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                Mac mac = this.mac;
                C10843j.m433c(mac);
                mac.update(segment.data, segment.pos, min);
            }
            j2 += min;
            segment = segment.next;
            C10843j.m433c(segment);
        }
        super.write(source, j);
    }
}
