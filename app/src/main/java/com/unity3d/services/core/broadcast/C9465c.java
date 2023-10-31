package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.C0063d;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.broadcast.c */
/* loaded from: classes3.dex */
public class C9465c extends BroadcastReceiver {

    /* renamed from: a */
    private String f18593a;

    public C9465c(String str) {
        this.f18593a = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (intent.getDataString() != null) {
            str = intent.getDataString();
        } else {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                for (String str2 : extras.keySet()) {
                    jSONObject.put(str2, extras.get(str2));
                }
            }
        } catch (JSONException e) {
            StringBuilder m13052b = C0063d.m13052b("JSONException when composing extras for broadcast action ", action, ": ");
            m13052b.append(e.getMessage());
            C9549a.m2019b(m13052b.toString());
        }
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null && m1774c.m1768i()) {
            m1774c.m1784a(EnumC9627b.BROADCAST, EnumC9464b.ACTION, this.f18593a, action, str, jSONObject);
        }
    }
}
