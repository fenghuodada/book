package com.iab.omid.library.applovin.walking.p050a;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.p046b.C8775a;
import com.iab.omid.library.applovin.p048d.C8790b;
import com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.f */
/* loaded from: classes3.dex */
public class AsyncTaskC8814f extends AbstractAsyncTaskC8807a {
    public AsyncTaskC8814f(AbstractAsyncTaskC8808b.InterfaceC8810b interfaceC8810b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC8810b, hashSet, jSONObject, j);
    }

    /* renamed from: b */
    private void m2950b(String str) {
        C8775a m3126a = C8775a.m3126a();
        if (m3126a != null) {
            for (C8773a c8773a : m3126a.m3124b()) {
                if (((AbstractAsyncTaskC8807a) this).f16772a.contains(c8773a.getAdSessionId())) {
                    c8773a.getAdSessionStatePublisher().m3015a(str, this.f16774c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C8790b.m3050b(this.f16773b, this.f16776d.mo2946b())) {
            return null;
        }
        this.f16776d.mo2948a(this.f16773b);
        return this.f16773b.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.p050a.AbstractAsyncTaskC8808b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m2950b(str);
        }
        super.onPostExecute(str);
    }
}
