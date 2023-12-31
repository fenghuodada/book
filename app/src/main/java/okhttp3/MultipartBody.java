package okhttp3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.EnumC10735a;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0003(')B'\b\u0000\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, m508d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/BufferedSink;", "sink", "", "countBytes", "", "writeOrCountBytes", "", FirebaseAnalytics.Param.INDEX, "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "Lkotlin/p;", "writeTo", "Lokhttp3/MediaType;", "J", "Lokio/ByteString;", "boundaryByteString", "Lokio/ByteString;", "Ljava/util/List;", "<init>", "(Lokio/ByteString;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {
    @JvmField
    @NotNull
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    @JvmField
    @NotNull
    public static final MediaType DIGEST;
    @JvmField
    @NotNull
    public static final MediaType FORM;
    @JvmField
    @NotNull
    public static final MediaType MIXED;
    @JvmField
    @NotNull
    public static final MediaType PARALLEL;
    private final ByteString boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    @NotNull
    private final List<Part> parts;
    @NotNull
    private final MediaType type;

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003J \u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m508d2 = {"Lokhttp3/MultipartBody$Builder;", "", "boundary", "", "(Ljava/lang/String;)V", "Lokio/ByteString;", "parts", "", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/MediaType;", "addFormDataPart", "name", "value", "filename", "body", "Lokhttp3/RequestBody;", "addPart", "headers", "Lokhttp3/Headers;", "part", "build", "Lokhttp3/MultipartBody;", "setType", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Builder {
        private final ByteString boundary;
        private final List<Part> parts;
        private MediaType type;

        @JvmOverloads
        public Builder() {
            this(null, 1, null);
        }

        @JvmOverloads
        public Builder(@NotNull String boundary) {
            C10843j.m430f(boundary, "boundary");
            this.boundary = ByteString.Companion.encodeUtf8(boundary);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.C10839f r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                kotlin.jvm.internal.C10843j.m431e(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.f):void");
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @NotNull String value) {
            C10843j.m430f(name, "name");
            C10843j.m430f(value, "value");
            addPart(Part.Companion.createFormData(name, value));
            return this;
        }

        @NotNull
        public final Builder addFormDataPart(@NotNull String name, @Nullable String str, @NotNull RequestBody body) {
            C10843j.m430f(name, "name");
            C10843j.m430f(body, "body");
            addPart(Part.Companion.createFormData(name, str, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@Nullable Headers headers, @NotNull RequestBody body) {
            C10843j.m430f(body, "body");
            addPart(Part.Companion.create(headers, body));
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull Part part) {
            C10843j.m430f(part, "part");
            this.parts.add(part);
            return this;
        }

        @NotNull
        public final Builder addPart(@NotNull RequestBody body) {
            C10843j.m430f(body, "body");
            addPart(Part.Companion.create(body));
            return this;
        }

        @NotNull
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final Builder setType(@NotNull MediaType type) {
            C10843j.m430f(type, "type");
            if (C10843j.m435a(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    @Metadata(m509d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, m508d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/p;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        public final void appendQuotedString$okhttp(@NotNull StringBuilder appendQuotedString, @NotNull String key) {
            String str;
            C10843j.m430f(appendQuotedString, "$this$appendQuotedString");
            C10843j.m430f(key, "key");
            appendQuotedString.append('\"');
            int length = key.length();
            for (int i = 0; i < length; i++) {
                char charAt = key.charAt(i);
                if (charAt == '\n') {
                    str = "%0A";
                } else if (charAt == '\r') {
                    str = "%0D";
                } else if (charAt != '\"') {
                    appendQuotedString.append(charAt);
                } else {
                    str = "%22";
                }
                appendQuotedString.append(str);
            }
            appendQuotedString.append('\"');
        }
    }

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, m508d2 = {"Lokhttp3/MultipartBody$Part;", "", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final RequestBody body;
        @Nullable
        private final Headers headers;

        @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, m508d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", "headers", "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", "value", "filename", "okhttp"}, m507k = 1, m506mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C10839f c10839f) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Part create(@Nullable Headers headers, @NotNull RequestBody body) {
                C10843j.m430f(body, "body");
                if ((headers != null ? headers.get("Content-Type") : null) == null) {
                    if ((headers != null ? headers.get("Content-Length") : null) == null) {
                        return new Part(headers, body, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            @JvmStatic
            @NotNull
            public final Part create(@NotNull RequestBody body) {
                C10843j.m430f(body, "body");
                return create(null, body);
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String name, @NotNull String value) {
                C10843j.m430f(name, "name");
                C10843j.m430f(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.Companion, value, (MediaType) null, 1, (Object) null));
            }

            @JvmStatic
            @NotNull
            public final Part createFormData(@NotNull String name, @Nullable String str, @NotNull RequestBody body) {
                C10843j.m430f(name, "name");
                C10843j.m430f(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str);
                }
                String sb2 = sb.toString();
                C10843j.m431e(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), body);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, C10839f c10839f) {
            this(headers, requestBody);
        }

        @JvmStatic
        @NotNull
        public static final Part create(@Nullable Headers headers, @NotNull RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        @JvmStatic
        @NotNull
        public static final Part create(@NotNull RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String str, @NotNull String str2) {
            return Companion.createFormData(str, str2);
        }

        @JvmStatic
        @NotNull
        public static final Part createFormData(@NotNull String str, @Nullable String str2, @NotNull RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
        @JvmName(name = "-deprecated_body")
        @NotNull
        /* renamed from: -deprecated_body  reason: not valid java name */
        public final RequestBody m13175deprecated_body() {
            return this.body;
        }

        @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
        @JvmName(name = "-deprecated_headers")
        @Nullable
        /* renamed from: -deprecated_headers  reason: not valid java name */
        public final Headers m13176deprecated_headers() {
            return this.headers;
        }

        @JvmName(name = "body")
        @NotNull
        public final RequestBody body() {
            return this.body;
        }

        @JvmName(name = "headers")
        @Nullable
        public final Headers headers() {
            return this.headers;
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{(byte) 58, (byte) 32};
        CRLF = new byte[]{(byte) 13, (byte) 10};
        byte b = (byte) 45;
        DASHDASH = new byte[]{b, b};
    }

    public MultipartBody(@NotNull ByteString boundaryByteString, @NotNull MediaType type, @NotNull List<Part> parts) {
        C10843j.m430f(boundaryByteString, "boundaryByteString");
        C10843j.m430f(type, "type");
        C10843j.m430f(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        MediaType.Companion companion = MediaType.Companion;
        this.contentType = companion.get(type + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(BufferedSink bufferedSink, boolean z) throws IOException {
        Buffer buffer;
        if (z) {
            bufferedSink = new Buffer();
            buffer = bufferedSink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            C10843j.m433c(bufferedSink);
            bufferedSink.write(DASHDASH);
            bufferedSink.write(this.boundaryByteString);
            bufferedSink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    bufferedSink.writeUtf8(headers.name(i2)).write(COLONSPACE).writeUtf8(headers.value(i2)).write(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                bufferedSink.writeUtf8("Content-Type: ").writeUtf8(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                bufferedSink.writeUtf8("Content-Length: ").writeDecimalLong(contentLength).write(CRLF);
            } else if (z) {
                C10843j.m433c(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = CRLF;
            bufferedSink.write(bArr);
            if (z) {
                j += contentLength;
            } else {
                body.writeTo(bufferedSink);
            }
            bufferedSink.write(bArr);
        }
        C10843j.m433c(bufferedSink);
        byte[] bArr2 = DASHDASH;
        bufferedSink.write(bArr2);
        bufferedSink.write(this.boundaryByteString);
        bufferedSink.write(bArr2);
        bufferedSink.write(CRLF);
        if (z) {
            C10843j.m433c(buffer);
            long size3 = j + buffer.size();
            buffer.clear();
            return size3;
        }
        return j;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "boundary", imports = {}))
    @JvmName(name = "-deprecated_boundary")
    @NotNull
    /* renamed from: -deprecated_boundary  reason: not valid java name */
    public final String m13171deprecated_boundary() {
        return boundary();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "parts", imports = {}))
    @JvmName(name = "-deprecated_parts")
    @NotNull
    /* renamed from: -deprecated_parts  reason: not valid java name */
    public final List<Part> m13172deprecated_parts() {
        return this.parts;
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m13173deprecated_size() {
        return size();
    }

    @Deprecated(level = EnumC10735a.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "type", imports = {}))
    @JvmName(name = "-deprecated_type")
    @NotNull
    /* renamed from: -deprecated_type  reason: not valid java name */
    public final MediaType m13174deprecated_type() {
        return this.type;
    }

    @JvmName(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    @NotNull
    public MediaType contentType() {
        return this.contentType;
    }

    @NotNull
    public final Part part(int i) {
        return this.parts.get(i);
    }

    @JvmName(name = "parts")
    @NotNull
    public final List<Part> parts() {
        return this.parts;
    }

    @JvmName(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @JvmName(name = "type")
    @NotNull
    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        C10843j.m430f(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
