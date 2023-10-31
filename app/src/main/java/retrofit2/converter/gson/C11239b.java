package retrofit2.converter.gson;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.InterfaceC11257i;

/* renamed from: retrofit2.converter.gson.b */
/* loaded from: classes3.dex */
public final class C11239b<T> implements InterfaceC11257i<T, RequestBody> {

    /* renamed from: c */
    public static final MediaType f21954c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f21955d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C8686j f21956a;

    /* renamed from: b */
    public final AbstractC8576a0<T> f21957b;

    public C11239b(C8686j c8686j, AbstractC8576a0<T> abstractC8576a0) {
        this.f21956a = c8686j;
        this.f21957b = abstractC8576a0;
    }

    @Override // retrofit2.InterfaceC11257i
    /* renamed from: a */
    public final RequestBody mo1a(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter m3231g = this.f21956a.m3231g(new OutputStreamWriter(buffer.outputStream(), f21955d));
        this.f21957b.mo3198b(m3231g, obj);
        m3231g.close();
        return RequestBody.create(f21954c, buffer.readByteString());
    }
}
