package retrofit2;

import androidx.constraintlayout.motion.widget.C0552c;
import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* renamed from: retrofit2.c0 */
/* loaded from: classes3.dex */
public final class C11236c0 {

    /* renamed from: l */
    public static final char[] f21938l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f21939m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f21940a;

    /* renamed from: b */
    public final HttpUrl f21941b;
    @Nullable

    /* renamed from: c */
    public String f21942c;
    @Nullable

    /* renamed from: d */
    public HttpUrl.Builder f21943d;

    /* renamed from: e */
    public final Request.Builder f21944e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f21945f;
    @Nullable

    /* renamed from: g */
    public MediaType f21946g;

    /* renamed from: h */
    public final boolean f21947h;
    @Nullable

    /* renamed from: i */
    public final MultipartBody.Builder f21948i;
    @Nullable

    /* renamed from: j */
    public final FormBody.Builder f21949j;
    @Nullable

    /* renamed from: k */
    public RequestBody f21950k;

    /* renamed from: retrofit2.c0$a */
    /* loaded from: classes3.dex */
    public static class C11237a extends RequestBody {

        /* renamed from: a */
        public final RequestBody f21951a;

        /* renamed from: b */
        public final MediaType f21952b;

        public C11237a(RequestBody requestBody, MediaType mediaType) {
            this.f21951a = requestBody;
            this.f21952b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() throws IOException {
            return this.f21951a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            return this.f21952b;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f21951a.writeTo(bufferedSink);
        }
    }

    public C11236c0(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f21940a = str;
        this.f21941b = httpUrl;
        this.f21942c = str2;
        this.f21946g = mediaType;
        this.f21947h = z;
        this.f21945f = headers != null ? headers.newBuilder() : new Headers.Builder();
        if (z2) {
            this.f21949j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f21948i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: a */
    public final void m43a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f21946g = MediaType.get(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(C0552c.m12192b("Malformed content type: ", str2), e);
            }
        }
        this.f21945f.add(str, str2);
    }

    /* renamed from: b */
    public final void m42b(String str, @Nullable String str2, boolean z) {
        String str3 = this.f21942c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f21941b;
            HttpUrl.Builder newBuilder = httpUrl.newBuilder(str3);
            this.f21943d = newBuilder;
            if (newBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f21942c);
            }
            this.f21942c = null;
        }
        if (z) {
            this.f21943d.addEncodedQueryParameter(str, str2);
        } else {
            this.f21943d.addQueryParameter(str, str2);
        }
    }
}
