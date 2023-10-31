package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.AbstractC0476h;
import androidx.collection.C0470b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final C0470b<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(@NonNull C0470b<ApiKey<?>, ConnectionResult> c0470b) {
        this.zaa = c0470b;
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractC0476h.C0479c) this.zaa.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
            z &= !connectionResult.isSuccess();
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb.append(zab);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            str = "None of the queried APIs are available. ";
        } else {
            str = "Some of the queried APIs are unavailable. ";
        }
        sb2.append(str);
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    @NonNull
    public ConnectionResult getConnectionResult(@NonNull HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }
}
