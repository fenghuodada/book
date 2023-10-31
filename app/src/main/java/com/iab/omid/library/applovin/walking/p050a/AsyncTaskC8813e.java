package com.iab.omid.library.applovin.walking.p050a;

import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.e */
/* loaded from: classes3.dex */
public class AsyncTaskC8813e extends AbstractAsyncTaskC8807a {
    public AsyncTaskC8813e(AbstractAsyncTaskC8808b.InterfaceC8810b interfaceC8810b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC8810b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m2953b(String str) {
        C8775a m3126a = C8775a.m3126a();
        if (m3126a != null) {
            for (C8773a c8773a : m3126a.m3124b()) {
                if (((AbstractAsyncTaskC8807a) this).f16772a.contains(c8773a.getAdSessionId())) {
                    c8773a.getAdSessionStatePublisher().m3011b(str, this.f16774c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f16773b.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        m2953b(str);
        super.onPostExecute(str);
    }
}
