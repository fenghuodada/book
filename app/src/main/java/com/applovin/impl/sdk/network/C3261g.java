package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3277q;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.g */
/* loaded from: classes.dex */
public class C3261g extends AbstractRunnableC3131a {

    /* renamed from: a */
    private static final long f8591a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c */
    private final AtomicLong f8592c;

    /* renamed from: d */
    private final C3257f f8593d;

    /* renamed from: e */
    private final C3349v f8594e;

    public C3261g(C3257f c3257f, C3214m c3214m) {
        super("PersistentPostbackQueueSaveTask", c3214m);
        this.f8592c = new AtomicLong();
        this.f8594e = c3214m.m7487A();
        this.f8593d = c3257f;
    }

    /* renamed from: a */
    private void m7231a(List<C3262h> list) {
        JSONArray jSONArray = new JSONArray();
        for (C3262h c3262h : list) {
            try {
                jSONArray.put(c3262h.m7217n());
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    this.f8594e.m6854b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            C3277q m7438ab = this.f8192b.m7438ab();
            m7438ab.m7098a(byteArrayInputStream, m7438ab.m7097a("persistent_postback_cache.json", this.f8192b.m7476L()));
            if (C3349v.m6862a()) {
                this.f8594e.m6855b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (C3349v.m6862a()) {
                this.f8594e.m6854b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* renamed from: a */
    public ArrayList<C3262h> m7232a(int i) {
        ArrayList<C3262h> arrayList = new ArrayList<>();
        try {
            C3277q m7438ab = this.f8192b.m7438ab();
            if (m7438ab.m7090b("persistent_postback_cache.json", this.f8192b.m7476L())) {
                String m7101a = m7438ab.m7101a(m7438ab.m7097a("persistent_postback_cache.json", this.f8192b.m7476L()));
                if (StringUtils.isValidString(m7101a)) {
                    JSONArray jSONArray = new JSONObject(m7101a).getJSONArray("pb");
                    if (C3349v.m6862a()) {
                        C3349v c3349v = this.f8594e;
                        c3349v.m6855b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f8192b.m7456a(C3109b.f7910cJ)).intValue();
                    for (int i2 = 0; i2 < jSONArray.length() && arrayList.size() < i; i2++) {
                        C3262h c3262h = new C3262h(jSONArray.getJSONObject(i2), this.f8192b);
                        if (c3262h.m7220k() < intValue) {
                            arrayList.add(c3262h);
                        } else if (C3349v.m6862a()) {
                            C3349v c3349v2 = this.f8594e;
                            c3349v2.m6855b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + c3262h);
                        }
                    }
                    if (C3349v.m6862a()) {
                        C3349v c3349v3 = this.f8594e;
                        c3349v3.m6855b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f8594e.m6854b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m7233a() {
        this.f8592c.set(System.currentTimeMillis());
        this.f8192b.m7469S().m7619a(this, C3163o.EnumC3165a.POSTBACKS, f8591a);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8593d.m7257a() > this.f8592c.get()) {
            m7231a(this.f8593d.m7249b());
        }
        m7233a();
    }
}
