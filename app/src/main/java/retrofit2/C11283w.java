package retrofit2;

import androidx.appcompat.widget.C0406q1;
import androidx.constraintlayout.core.widgets.C0539e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import retrofit2.C11236c0;

/* renamed from: retrofit2.w */
/* loaded from: classes3.dex */
public final class C11283w<T> implements InterfaceC11230b<T> {

    /* renamed from: a */
    public final C11242d0 f22054a;

    /* renamed from: b */
    public final Object[] f22055b;

    /* renamed from: c */
    public final Call.Factory f22056c;

    /* renamed from: d */
    public final InterfaceC11257i<ResponseBody, T> f22057d;

    /* renamed from: e */
    public volatile boolean f22058e;
    @GuardedBy("this")
    @Nullable

    /* renamed from: f */
    public Call f22059f;
    @GuardedBy("this")
    @Nullable

    /* renamed from: g */
    public Throwable f22060g;
    @GuardedBy("this")

    /* renamed from: h */
    public boolean f22061h;

    /* renamed from: retrofit2.w$a */
    /* loaded from: classes3.dex */
    public class C11284a implements Callback {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11241d f22062a;

        public C11284a(InterfaceC11241d interfaceC11241d) {
            this.f22062a = interfaceC11241d;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.f22062a.mo9a(C11283w.this, iOException);
            } catch (Throwable th) {
                C11259i0.m16m(th);
                th.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            InterfaceC11241d interfaceC11241d = this.f22062a;
            C11283w c11283w = C11283w.this;
            try {
                try {
                    interfaceC11241d.mo8c(c11283w, c11283w.m4c(response));
                } catch (Throwable th) {
                    C11259i0.m16m(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C11259i0.m16m(th2);
                try {
                    interfaceC11241d.mo9a(c11283w, th2);
                } catch (Throwable th3) {
                    C11259i0.m16m(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: retrofit2.w$b */
    /* loaded from: classes3.dex */
    public static final class C11285b extends ResponseBody {

        /* renamed from: a */
        public final ResponseBody f22064a;

        /* renamed from: b */
        public final BufferedSource f22065b;
        @Nullable

        /* renamed from: c */
        public IOException f22066c;

        /* renamed from: retrofit2.w$b$a */
        /* loaded from: classes3.dex */
        public class C11286a extends ForwardingSource {
            public C11286a(BufferedSource bufferedSource) {
                super(bufferedSource);
            }

            @Override // okio.ForwardingSource, okio.Source
            public final long read(Buffer buffer, long j) throws IOException {
                try {
                    return super.read(buffer, j);
                } catch (IOException e) {
                    C11285b.this.f22066c = e;
                    throw e;
                }
            }
        }

        public C11285b(ResponseBody responseBody) {
            this.f22064a = responseBody;
            this.f22065b = Okio.buffer(new C11286a(responseBody.source()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f22064a.close();
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f22064a.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f22064a.contentType();
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            return this.f22065b;
        }
    }

    /* renamed from: retrofit2.w$c */
    /* loaded from: classes3.dex */
    public static final class C11287c extends ResponseBody {
        @Nullable

        /* renamed from: a */
        public final MediaType f22068a;

        /* renamed from: b */
        public final long f22069b;

        public C11287c(@Nullable MediaType mediaType, long j) {
            this.f22068a = mediaType;
            this.f22069b = j;
        }

        @Override // okhttp3.ResponseBody
        public final long contentLength() {
            return this.f22069b;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType contentType() {
            return this.f22068a;
        }

        @Override // okhttp3.ResponseBody
        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C11283w(C11242d0 c11242d0, Object[] objArr, Call.Factory factory, InterfaceC11257i<ResponseBody, T> interfaceC11257i) {
        this.f22054a = c11242d0;
        this.f22055b = objArr;
        this.f22056c = factory;
        this.f22057d = interfaceC11257i;
    }

    /* renamed from: a */
    public final Call m6a() throws IOException {
        HttpUrl resolve;
        C11242d0 c11242d0 = this.f22054a;
        c11242d0.getClass();
        Object[] objArr = this.f22055b;
        int length = objArr.length;
        AbstractC11202a0<?>[] abstractC11202a0Arr = c11242d0.f21969j;
        if (length == abstractC11202a0Arr.length) {
            C11236c0 c11236c0 = new C11236c0(c11242d0.f21962c, c11242d0.f21961b, c11242d0.f21963d, c11242d0.f21964e, c11242d0.f21965f, c11242d0.f21966g, c11242d0.f21967h, c11242d0.f21968i);
            if (c11242d0.f21970k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                abstractC11202a0Arr[i].mo0a(c11236c0, objArr[i]);
            }
            HttpUrl.Builder builder = c11236c0.f21943d;
            if (builder != null) {
                resolve = builder.build();
            } else {
                String str = c11236c0.f21942c;
                HttpUrl httpUrl = c11236c0.f21941b;
                resolve = httpUrl.resolve(str);
                if (resolve == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + c11236c0.f21942c);
                }
            }
            C11236c0.C11237a c11237a = c11236c0.f21950k;
            if (c11237a == null) {
                FormBody.Builder builder2 = c11236c0.f21949j;
                if (builder2 != null) {
                    c11237a = builder2.build();
                } else {
                    MultipartBody.Builder builder3 = c11236c0.f21948i;
                    if (builder3 != null) {
                        c11237a = builder3.build();
                    } else if (c11236c0.f21947h) {
                        c11237a = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
            MediaType mediaType = c11236c0.f21946g;
            Headers.Builder builder4 = c11236c0.f21945f;
            if (mediaType != null) {
                if (c11237a != null) {
                    c11237a = new C11236c0.C11237a(c11237a, mediaType);
                } else {
                    builder4.add("Content-Type", mediaType.toString());
                }
            }
            Call newCall = this.f22056c.newCall(c11236c0.f21944e.url(resolve).headers(builder4.build()).method(c11236c0.f21940a, c11237a).tag(C11273o.class, new C11273o(c11242d0.f21960a, arrayList)).build());
            if (newCall != null) {
                return newCall;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(C0539e.m12264b(C0406q1.m12536b("Argument count (", length, ") doesn't match expected count ("), abstractC11202a0Arr.length, ")"));
    }

    @GuardedBy("this")
    /* renamed from: b */
    public final Call m5b() throws IOException {
        Call call = this.f22059f;
        if (call != null) {
            return call;
        }
        Throwable th = this.f22060g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call m6a = m6a();
            this.f22059f = m6a;
            return m6a;
        } catch (IOException | Error | RuntimeException e) {
            C11259i0.m16m(e);
            this.f22060g = e;
            throw e;
        }
    }

    /* renamed from: c */
    public final C11245e0<T> m4c(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new C11287c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                C11285b c11285b = new C11285b(body);
                try {
                    T mo1a = this.f22057d.mo1a(c11285b);
                    if (build.isSuccessful()) {
                        return new C11245e0<>(build, mo1a);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e) {
                    IOException iOException = c11285b.f22066c;
                    if (iOException == null) {
                        throw e;
                    }
                    throw iOException;
                }
            }
            body.close();
            if (build.isSuccessful()) {
                return new C11245e0<>(build, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            Buffer buffer = new Buffer();
            body.source().readAll(buffer);
            Objects.requireNonNull(ResponseBody.create(body.contentType(), body.contentLength(), buffer), "body == null");
            if (!build.isSuccessful()) {
                return new C11245e0<>(build, null);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    @Override // retrofit2.InterfaceC11230b
    public final void cancel() {
        Call call;
        this.f22058e = true;
        synchronized (this) {
            call = this.f22059f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        return new C11283w(this.f22054a, this.f22055b, this.f22056c, this.f22057d);
    }

    @Override // retrofit2.InterfaceC11230b
    /* renamed from: e */
    public final void mo3e(InterfaceC11241d<T> interfaceC11241d) {
        Call call;
        Throwable th;
        synchronized (this) {
            if (this.f22061h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f22061h = true;
            call = this.f22059f;
            th = this.f22060g;
            if (call == null && th == null) {
                Call m6a = m6a();
                this.f22059f = m6a;
                call = m6a;
            }
        }
        if (th != null) {
            interfaceC11241d.mo9a(this, th);
            return;
        }
        if (this.f22058e) {
            call.cancel();
        }
        call.enqueue(new C11284a(interfaceC11241d));
    }

    @Override // retrofit2.InterfaceC11230b
    public final C11245e0<T> execute() throws IOException {
        Call m5b;
        synchronized (this) {
            if (this.f22061h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f22061h = true;
            m5b = m5b();
        }
        if (this.f22058e) {
            m5b.cancel();
        }
        return m4c(m5b.execute());
    }

    @Override // retrofit2.InterfaceC11230b
    public final boolean isCanceled() {
        boolean z = true;
        if (this.f22058e) {
            return true;
        }
        synchronized (this) {
            Call call = this.f22059f;
            if (call == null || !call.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.InterfaceC11230b
    public final synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return m5b().request();
    }

    @Override // retrofit2.InterfaceC11230b
    /* renamed from: clone */
    public final InterfaceC11230b mo13249clone() {
        return new C11283w(this.f22054a, this.f22055b, this.f22056c, this.f22057d);
    }
}
