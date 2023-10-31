package com.iab.omid.library.applovin.walking.p050a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.b */
/* loaded from: classes3.dex */
public abstract class AbstractAsyncTaskC8808b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private InterfaceC8809a f16775a;

    /* renamed from: d */
    protected final InterfaceC8810b f16776d;

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8809a {
        /* renamed from: a */
        void mo2957a(AbstractAsyncTaskC8808b abstractAsyncTaskC8808b);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC8810b {
        /* renamed from: a */
        void mo2948a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo2946b();
    }

    public AbstractAsyncTaskC8808b(InterfaceC8810b interfaceC8810b) {
        this.f16776d = interfaceC8810b;
    }

    /* renamed from: a */
    public void m2960a(InterfaceC8809a interfaceC8809a) {
        this.f16775a = interfaceC8809a;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        InterfaceC8809a interfaceC8809a = this.f16775a;
        if (interfaceC8809a != null) {
            interfaceC8809a.mo2957a(this);
        }
    }

    /* renamed from: a */
    public void m2959a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
