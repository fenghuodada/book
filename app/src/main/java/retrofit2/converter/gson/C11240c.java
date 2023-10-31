package retrofit2.converter.gson;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.C8693p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.ResponseBody;
import retrofit2.InterfaceC11257i;

/* renamed from: retrofit2.converter.gson.c */
/* loaded from: classes3.dex */
public final class C11240c<T> implements InterfaceC11257i<ResponseBody, T> {

    /* renamed from: a */
    public final C8686j f21958a;

    /* renamed from: b */
    public final AbstractC8576a0<T> f21959b;

    public C11240c(C8686j c8686j, AbstractC8576a0<T> abstractC8576a0) {
        this.f21958a = c8686j;
        this.f21959b = abstractC8576a0;
    }

    @Override // retrofit2.InterfaceC11257i
    /* renamed from: a */
    public final Object mo1a(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        Reader charStream = responseBody2.charStream();
        C8686j c8686j = this.f21958a;
        c8686j.getClass();
        JsonReader jsonReader = new JsonReader(charStream);
        jsonReader.setLenient(c8686j.f16500j);
        try {
            T mo3199a = this.f21959b.mo3199a(jsonReader);
            if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                return mo3199a;
            }
            throw new C8693p("JSON document was not fully consumed.");
        } finally {
            responseBody2.close();
        }
    }
}
