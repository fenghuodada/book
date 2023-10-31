package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ExperimentsReader {

    /* renamed from: a */
    private static final Set<String> f18684a = new HashSet(Arrays.asList("tsi", "tsi_upii", "tsi_p", "tsi_nt", "tsi_prr", "tsi_prw"));

    /* renamed from: b */
    private Experiments f18685b;

    /* renamed from: c */
    private Experiments f18686c;

    /* renamed from: a */
    private JSONObject m2218a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f18684a.contains(next)) {
                hashMap.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: b */
    private JSONObject m2217b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (f18684a.contains(next)) {
                hashMap.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(hashMap);
    }

    public synchronized Experiments getCurrentlyActiveExperiments() {
        Experiments experiments = this.f18686c;
        if (experiments == null && this.f18685b == null) {
            return new Experiments();
        } else if (experiments == null) {
            return this.f18685b;
        } else {
            if (this.f18685b == null) {
                this.f18685b = new Experiments();
            }
            try {
                return new Experiments(C9564j.m1986a(m2217b(this.f18685b.getExperimentData()), m2218a(this.f18686c.getExperimentData())));
            } catch (JSONException unused) {
                C9549a.m2017c("Couldn't get active experiments, reverting to default experiments");
                return new Experiments();
            }
        }
    }

    public synchronized void updateLocalExperiments(Experiments experiments) {
        this.f18685b = experiments;
    }

    public synchronized void updateRemoteExperiments(Experiments experiments) {
        this.f18686c = experiments;
    }
}
