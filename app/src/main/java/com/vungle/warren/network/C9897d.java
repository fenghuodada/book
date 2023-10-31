package com.vungle.warren.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.network.converters.InterfaceC9894a;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;

/* renamed from: com.vungle.warren.network.d */
/* loaded from: classes3.dex */
public final class C9897d<T> implements InterfaceC9891a<T> {

    /* renamed from: c */
    public static final /* synthetic */ int f19874c = 0;

    /* renamed from: a */
    public final InterfaceC9894a<ResponseBody, T> f19875a;

    /* renamed from: b */
    public final Call f19876b;

    /* renamed from: com.vungle.warren.network.d$a */
    /* loaded from: classes3.dex */
    public static final class C9898a extends ResponseBody {

        /* renamed from: a */
        public final ResponseBody f19877a;
        @Nullable

        /* renamed from: b */
        public IOException f19878b;

        /* renamed from: com.vungle.warren.network.d$a$a */
        /* loaded from: classes3.dex */
        public class C9899a extends ForwardingSource {
            public C9899a(BufferedSource bufferedSource) {
                super(bufferedSource);
            }

            @Override // okio.ForwardingSource, okio.Source
            public final long read(@NonNull Buffer buffer, long j) throws IOException {
                try {
                    return super.read(buffer, j);
                } catch (IOException e) {
                    C9898a.this.f19878b = e;
                    throw e;
                }
            }
        }

        public C9898a(ResponseBody responseBody) {
            this.f19877a = responseBody;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f19877a.close();
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f19877a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f19877a.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return Okio.buffer(new C9899a(this.f19877a.source()));
        }
    }

    /* renamed from: com.vungle.warren.network.d$b */
    /* loaded from: classes3.dex */
    public static final class C9900b extends ResponseBody {
        @Nullable

        /* renamed from: a */
        public final MediaType f19880a;

        /* renamed from: b */
        public final long f19881b;

        public C9900b(@Nullable MediaType mediaType, long j) {
            this.f19880a = mediaType;
            this.f19881b = j;
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f19881b;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f19880a;
        }

        @Override // okhttp3.ResponseBody
        @NonNull
        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C9897d(@NonNull Call call, InterfaceC9894a<ResponseBody, T> interfaceC9894a) {
        this.f19876b = call;
        this.f19875a = interfaceC9894a;
    }

    /* renamed from: b */
    public static C9901e m1431b(Response response, InterfaceC9894a interfaceC9894a) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C9900b(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                C9898a c9898a = new C9898a(body);
                try {
                    Object mo1433a = interfaceC9894a.mo1433a(c9898a);
                    if (build.isSuccessful()) {
                        return new C9901e(build, mo1433a);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = c9898a.f19878b;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            body.close();
            if (build.isSuccessful()) {
                return new C9901e(build, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            Buffer buffer = new Buffer();
            body.source().readAll(buffer);
            ResponseBody.create(body.contentType(), body.contentLength(), buffer);
            if (!build.isSuccessful()) {
                return new C9901e(build, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    /* renamed from: a */
    public final C9901e<T> m1432a() throws IOException {
        Call call;
        synchronized (this) {
            call = this.f19876b;
        }
        return m1431b(call.execute(), this.f19875a);
    }
}
