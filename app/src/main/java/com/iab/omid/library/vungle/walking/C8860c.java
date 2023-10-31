package com.iab.omid.library.vungle.walking;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.p052b.C8832a;
import com.iab.omid.library.vungle.p052b.C8838f;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.publisher.AbstractC8850a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.c */
/* loaded from: classes3.dex */
public final class C8860c {

    /* renamed from: a */
    public final HashMap<View, String> f16874a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, C8861a> f16875b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, View> f16876c = new HashMap<>();

    /* renamed from: d */
    public final HashSet<View> f16877d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f16878e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f16879f = new HashSet<>();

    /* renamed from: g */
    public final HashMap<String, String> f16880g = new HashMap<>();

    /* renamed from: h */
    public boolean f16881h;

    /* renamed from: com.iab.omid.library.vungle.walking.c$a */
    /* loaded from: classes3.dex */
    public static class C8861a {
        public C8861a() {
            throw null;
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractAsyncTaskC8862b extends AbstractAsyncTaskC8863c {

        /* renamed from: c */
        public final HashSet<String> f16882c;

        /* renamed from: d */
        public final JSONObject f16883d;

        /* renamed from: e */
        public final long f16884e;

        public AbstractAsyncTaskC8862b(C8870d c8870d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8870d);
            this.f16882c = new HashSet<>(hashSet);
            this.f16883d = jSONObject;
            this.f16884e = j;
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$c */
    /* loaded from: classes3.dex */
    public abstract class AbstractAsyncTaskC8863c extends AsyncTask<Object, Void, String> {

        /* renamed from: a */
        public InterfaceC8864a f16885a;

        /* renamed from: b */
        public final InterfaceC8865b f16886b;

        /* renamed from: com.iab.omid.library.vungle.walking.c$c$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC8864a {
        }

        /* renamed from: com.iab.omid.library.vungle.walking.c$c$b */
        /* loaded from: classes3.dex */
        public interface InterfaceC8865b {
        }

        public AbstractAsyncTaskC8863c(InterfaceC8865b interfaceC8865b) {
            this.f16886b = interfaceC8865b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            InterfaceC8864a interfaceC8864a = this.f16885a;
            if (interfaceC8864a != null) {
                C8866d c8866d = (C8866d) interfaceC8864a;
                c8866d.f16889c = null;
                c8866d.m2919a();
            }
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$d */
    /* loaded from: classes3.dex */
    public final class C8866d implements AbstractAsyncTaskC8863c.InterfaceC8864a {

        /* renamed from: b */
        public final ArrayDeque<AbstractAsyncTaskC8863c> f16888b = new ArrayDeque<>();

        /* renamed from: c */
        public AbstractAsyncTaskC8863c f16889c = null;

        /* renamed from: a */
        public final ThreadPoolExecutor f16887a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

        /* renamed from: a */
        public final void m2919a() {
            AbstractAsyncTaskC8863c poll = this.f16888b.poll();
            this.f16889c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f16887a, new Object[0]);
            }
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$e */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8867e extends AbstractAsyncTaskC8863c {
        public AsyncTaskC8867e(AbstractAsyncTaskC8863c.InterfaceC8865b interfaceC8865b) {
            super(interfaceC8865b);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            ((C8870d) this.f16886b).f16890a = null;
            return null;
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$f */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8868f extends AbstractAsyncTaskC8862b {
        public AsyncTaskC8868f(C8870d c8870d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8870d, hashSet, jSONObject, j);
        }

        @Override // com.iab.omid.library.vungle.walking.C8860c.AbstractAsyncTaskC8863c, android.os.AsyncTask
        /* renamed from: a */
        public final void onPostExecute(String str) {
            C8832a c8832a = C8832a.f16829c;
            if (c8832a != null) {
                for (C8830i c8830i : Collections.unmodifiableCollection(c8832a.f16830a)) {
                    if (this.f16882c.contains(c8830i.f16827g)) {
                        AbstractC8850a abstractC8850a = c8830i.f16824d;
                        if (this.f16884e >= abstractC8850a.f16856c && abstractC8850a.f16855b != 3) {
                            abstractC8850a.f16855b = 3;
                            C8838f.m2937a(abstractC8850a.m2927e(), "setNativeViewHierarchy", str);
                        }
                    }
                }
            }
            super.onPostExecute(str);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            return this.f16883d.toString();
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.c$g */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8869g extends AbstractAsyncTaskC8862b {
        public AsyncTaskC8869g(C8870d c8870d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8870d, hashSet, jSONObject, j);
        }

        @Override // com.iab.omid.library.vungle.walking.C8860c.AbstractAsyncTaskC8863c, android.os.AsyncTask
        /* renamed from: a */
        public final void onPostExecute(String str) {
            C8832a c8832a;
            if (!TextUtils.isEmpty(str) && (c8832a = C8832a.f16829c) != null) {
                for (C8830i c8830i : Collections.unmodifiableCollection(c8832a.f16830a)) {
                    if (this.f16882c.contains(c8830i.f16827g)) {
                        AbstractC8850a abstractC8850a = c8830i.f16824d;
                        if (this.f16884e >= abstractC8850a.f16856c) {
                            abstractC8850a.f16855b = 2;
                            C8838f.m2937a(abstractC8850a.m2927e(), "setNativeViewHierarchy", str);
                        }
                    }
                }
            }
            super.onPostExecute(str);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            C8870d c8870d = (C8870d) this.f16886b;
            JSONObject jSONObject = c8870d.f16890a;
            JSONObject jSONObject2 = this.f16883d;
            if (C8846a.m2930d(jSONObject2, jSONObject)) {
                return null;
            }
            c8870d.f16890a = jSONObject2;
            return jSONObject2.toString();
        }
    }
}
