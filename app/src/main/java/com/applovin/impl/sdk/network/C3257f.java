package com.applovin.impl.sdk.network;

import android.content.SharedPreferences;
import androidx.appcompat.widget.C0406q1;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.network.f */
/* loaded from: classes.dex */
public class C3257f {

    /* renamed from: a */
    private final C3214m f8574a;

    /* renamed from: b */
    private final C3349v f8575b;

    /* renamed from: c */
    private final int f8576c;

    /* renamed from: d */
    private final C3261g f8577d;

    /* renamed from: e */
    private final SharedPreferences f8578e;

    /* renamed from: g */
    private final ArrayList<C3262h> f8580g;

    /* renamed from: f */
    private final Object f8579f = new Object();

    /* renamed from: h */
    private final ArrayList<C3262h> f8581h = new ArrayList<>();

    /* renamed from: i */
    private long f8582i = 0;

    /* renamed from: j */
    private final Set<C3262h> f8583j = new HashSet();

    public C3257f(C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8574a = c3214m;
        this.f8575b = c3214m.m7487A();
        int intValue = ((Integer) c3214m.m7456a(C3109b.f7912cL)).intValue();
        this.f8576c = intValue;
        if (c3214m.m7439aa() != null) {
            this.f8578e = c3214m.m7476L().getSharedPreferences("com.applovin.sdk.impl.postbackQueue.domain", 0);
            this.f8580g = m7241d();
            this.f8577d = null;
            return;
        }
        C3261g c3261g = new C3261g(this, c3214m);
        this.f8577d = c3261g;
        this.f8580g = c3261g.m7232a(intValue);
        c3261g.m7233a();
        this.f8578e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7252a(final C3262h c3262h, final AppLovinPostbackListener appLovinPostbackListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8575b;
            c3349v.m6855b("PersistentPostbackManager", "Preparing to submit postback..." + c3262h);
        }
        if (this.f8574a.m7415c()) {
            if (C3349v.m6862a()) {
                this.f8575b.m6855b("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        synchronized (this.f8579f) {
            if (this.f8583j.contains(c3262h)) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f8575b;
                    c3349v2.m6855b("PersistentPostbackManager", "Skip pending postback: " + c3262h.m7229b());
                }
                return;
            }
            c3262h.m7219l();
            if (this.f8574a.m7439aa() != null) {
                m7235f();
            } else {
                m7237e();
            }
            int intValue = ((Integer) this.f8574a.m7456a(C3109b.f7910cJ)).intValue();
            if (c3262h.m7220k() <= intValue) {
                synchronized (this.f8579f) {
                    this.f8583j.add(c3262h);
                }
                this.f8574a.m7464X().dispatchPostbackRequest(C3265i.m7194b(this.f8574a).mo7186a(c3262h.m7229b()).mo7175c(c3262h.m7228c()).mo7185a(c3262h.m7227d()).mo7179b(c3262h.m7230a()).mo7178b(c3262h.m7226e()).mo7184a(c3262h.m7225f() != null ? new JSONObject(c3262h.m7225f()) : null).mo7169d(c3262h.m7223h()).mo7173c(c3262h.m7224g()).m7161g(c3262h.m7222i()).m7162g(c3262h.m7221j()).mo7190a(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.network.f.2
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = C3257f.this.f8575b;
                            StringBuilder m12536b = C0406q1.m12536b("Failed to submit postback with errorCode ", i, ". Will retry later...  Postback: ");
                            m12536b.append(c3262h);
                            c3349v3.m6853c("PersistentPostbackManager", m12536b.toString());
                        }
                        C3257f.this.m7236e(c3262h);
                        C3298j.m6960a(appLovinPostbackListener, str, i);
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        C3257f.this.m7238d(c3262h);
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = C3257f.this.f8575b;
                            c3349v3.m6855b("PersistentPostbackManager", "Successfully submitted postback: " + c3262h);
                        }
                        C3257f.this.m7234g();
                        C3298j.m6961a(appLovinPostbackListener, str);
                    }
                });
                return;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v3 = this.f8575b;
                c3349v3.m6851d("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + intValue + ". Dequeuing postback: " + c3262h);
            }
            m7238d(c3262h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m7246b(C3262h c3262h) {
        synchronized (this.f8579f) {
            if (this.f8574a.m7439aa() != null) {
                this.f8580g.add(c3262h);
                m7235f();
            } else {
                while (this.f8580g.size() > this.f8576c) {
                    this.f8580g.remove(0);
                }
                this.f8580g.add(c3262h);
                m7237e();
            }
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f8575b;
                c3349v.m6855b("PersistentPostbackManager", "Enqueued postback: " + c3262h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m7242c(C3262h c3262h) {
        m7252a(c3262h, (AppLovinPostbackListener) null);
    }

    /* renamed from: d */
    private ArrayList<C3262h> m7241d() {
        Set<String> set = (Set) this.f8574a.m7420b(C3111d.f8080p, new LinkedHashSet(0), this.f8578e);
        ArrayList<C3262h> arrayList = new ArrayList<>(Math.max(1, set.size()));
        int intValue = ((Integer) this.f8574a.m7456a(C3109b.f7910cJ)).intValue();
        C3349v c3349v = this.f8575b;
        c3349v.m6855b("PersistentPostbackManager", "Deserializing " + set.size() + " postback(s).");
        for (String str : set) {
            try {
                C3262h c3262h = new C3262h(new JSONObject(str), this.f8574a);
                if (c3262h.m7220k() < intValue) {
                    arrayList.add(c3262h);
                } else if (C3349v.m6861a(this.f8574a)) {
                    C3349v c3349v2 = this.f8575b;
                    c3349v2.m6855b("PersistentPostbackManager", "Skipping deserialization because maximum attempt count exceeded for postback: " + c3262h);
                }
            } catch (Throwable th) {
                if (C3349v.m6861a(this.f8574a)) {
                    C3349v c3349v3 = this.f8575b;
                    c3349v3.m6854b("PersistentPostbackManager", "Unable to deserialize postback request from json: " + str, th);
                }
            }
        }
        if (C3349v.m6861a(this.f8574a)) {
            C3349v c3349v4 = this.f8575b;
            c3349v4.m6855b("PersistentPostbackManager", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m7238d(C3262h c3262h) {
        synchronized (this.f8579f) {
            this.f8583j.remove(c3262h);
            this.f8580g.remove(c3262h);
            if (this.f8574a.m7439aa() != null) {
                m7235f();
            } else {
                m7237e();
            }
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f8575b;
            c3349v.m6855b("PersistentPostbackManager", "Dequeued successfully transmitted postback: " + c3262h);
        }
    }

    /* renamed from: e */
    private void m7237e() {
        this.f8582i = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m7236e(C3262h c3262h) {
        synchronized (this.f8579f) {
            this.f8583j.remove(c3262h);
            this.f8581h.add(c3262h);
        }
    }

    /* renamed from: f */
    private void m7235f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f8580g.size());
        Iterator<C3262h> it = this.f8580g.iterator();
        while (it.hasNext()) {
            try {
                linkedHashSet.add(it.next().m7217n().toString());
            } catch (Throwable th) {
                this.f8575b.m6854b("PersistentPostbackManager", "Unable to serialize postback request to JSON.", th);
            }
        }
        this.f8574a.m7452a((C3111d<C3111d<HashSet>>) C3111d.f8080p, (C3111d<HashSet>) linkedHashSet, this.f8578e);
        this.f8575b.m6855b("PersistentPostbackManager", "Wrote updated postback queue to disk.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m7234g() {
        synchronized (this.f8579f) {
            Iterator<C3262h> it = this.f8581h.iterator();
            while (it.hasNext()) {
                m7242c(it.next());
            }
            this.f8581h.clear();
        }
    }

    /* renamed from: a */
    public long m7257a() {
        return this.f8582i;
    }

    /* renamed from: a */
    public void m7253a(C3262h c3262h) {
        m7251a(c3262h, true);
    }

    /* renamed from: a */
    public void m7251a(C3262h c3262h, boolean z) {
        m7250a(c3262h, z, (AppLovinPostbackListener) null);
    }

    /* renamed from: a */
    public void m7250a(final C3262h c3262h, boolean z, final AppLovinPostbackListener appLovinPostbackListener) {
        if (StringUtils.isValidString(c3262h.m7229b())) {
            if (z) {
                c3262h.m7218m();
            }
            Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (C3257f.this.f8579f) {
                        C3257f.this.m7246b(c3262h);
                        C3257f.this.m7252a(c3262h, appLovinPostbackListener);
                    }
                }
            };
            if (!Utils.isMainThread()) {
                runnable.run();
                return;
            }
            this.f8574a.m7469S().m7620a(new C3189z(this.f8574a, runnable), C3163o.EnumC3165a.POSTBACKS);
        }
    }

    /* renamed from: b */
    public List<C3262h> m7249b() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f8579f) {
            arrayList.ensureCapacity(this.f8580g.size());
            arrayList.addAll(this.f8580g);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void m7245c() {
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.sdk.network.f.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C3257f.this.f8579f) {
                    if (C3257f.this.f8580g != null) {
                        Iterator it = new ArrayList(C3257f.this.f8580g).iterator();
                        while (it.hasNext()) {
                            C3257f.this.m7242c((C3262h) it.next());
                        }
                    }
                }
            }
        };
        if (!((Boolean) this.f8574a.m7456a(C3109b.f7911cK)).booleanValue()) {
            runnable.run();
            return;
        }
        this.f8574a.m7469S().m7620a(new C3189z(this.f8574a, runnable), C3163o.EnumC3165a.POSTBACKS);
    }
}
