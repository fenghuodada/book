package com.iab.omid.library.adcolony.walking;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C8722l;
import com.iab.omid.library.adcolony.p041b.C8728a;
import com.iab.omid.library.adcolony.p041b.C8731c;
import com.iab.omid.library.adcolony.p041b.C8734f;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.publisher.AbstractC8746a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.c */
/* loaded from: classes3.dex */
public final class C8756c {

    /* renamed from: a */
    public final HashMap<View, String> f16649a = new HashMap<>();

    /* renamed from: b */
    public final HashMap<View, C8757a> f16650b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, View> f16651c = new HashMap<>();

    /* renamed from: d */
    public final HashSet<View> f16652d = new HashSet<>();

    /* renamed from: e */
    public final HashSet<String> f16653e = new HashSet<>();

    /* renamed from: f */
    public final HashSet<String> f16654f = new HashSet<>();

    /* renamed from: g */
    public final HashMap<String, String> f16655g = new HashMap<>();

    /* renamed from: h */
    public final WeakHashMap f16656h = new WeakHashMap();

    /* renamed from: i */
    public boolean f16657i;

    /* renamed from: com.iab.omid.library.adcolony.walking.c$a */
    /* loaded from: classes3.dex */
    public static class C8757a {

        /* renamed from: a */
        public final C8731c f16658a;

        /* renamed from: b */
        public final ArrayList<String> f16659b;

        public C8757a(C8731c c8731c, String str) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f16659b = arrayList;
            this.f16658a = c8731c;
            arrayList.add(str);
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$b */
    /* loaded from: classes3.dex */
    public abstract class AbstractAsyncTaskC8758b extends AbstractAsyncTaskC8759c {

        /* renamed from: c */
        public final HashSet<String> f16660c;

        /* renamed from: d */
        public final JSONObject f16661d;

        /* renamed from: e */
        public final long f16662e;

        public AbstractAsyncTaskC8758b(C8766d c8766d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8766d);
            this.f16660c = new HashSet<>(hashSet);
            this.f16661d = jSONObject;
            this.f16662e = j;
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$c */
    /* loaded from: classes3.dex */
    public abstract class AbstractAsyncTaskC8759c extends AsyncTask<Object, Void, String> {

        /* renamed from: a */
        public InterfaceC8760a f16663a;

        /* renamed from: b */
        public final InterfaceC8761b f16664b;

        /* renamed from: com.iab.omid.library.adcolony.walking.c$c$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC8760a {
        }

        /* renamed from: com.iab.omid.library.adcolony.walking.c$c$b */
        /* loaded from: classes3.dex */
        public interface InterfaceC8761b {
        }

        public AbstractAsyncTaskC8759c(InterfaceC8761b interfaceC8761b) {
            this.f16664b = interfaceC8761b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(String str) {
            InterfaceC8760a interfaceC8760a = this.f16663a;
            if (interfaceC8760a != null) {
                C8762d c8762d = (C8762d) interfaceC8760a;
                c8762d.f16667c = null;
                c8762d.m3161a();
            }
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$d */
    /* loaded from: classes3.dex */
    public final class C8762d implements AbstractAsyncTaskC8759c.InterfaceC8760a {

        /* renamed from: b */
        public final ArrayDeque<AbstractAsyncTaskC8759c> f16666b = new ArrayDeque<>();

        /* renamed from: c */
        public AbstractAsyncTaskC8759c f16667c = null;

        /* renamed from: a */
        public final ThreadPoolExecutor f16665a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

        /* renamed from: a */
        public final void m3161a() {
            AbstractAsyncTaskC8759c poll = this.f16666b.poll();
            this.f16667c = poll;
            if (poll != null) {
                poll.executeOnExecutor(this.f16665a, new Object[0]);
            }
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$e */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8763e extends AbstractAsyncTaskC8759c {
        public AsyncTaskC8763e(AbstractAsyncTaskC8759c.InterfaceC8761b interfaceC8761b) {
            super(interfaceC8761b);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            ((C8766d) this.f16664b).f16668a = null;
            return null;
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$f */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8764f extends AbstractAsyncTaskC8758b {
        public AsyncTaskC8764f(C8766d c8766d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8766d, hashSet, jSONObject, j);
        }

        @Override // com.iab.omid.library.adcolony.walking.C8756c.AbstractAsyncTaskC8759c, android.os.AsyncTask
        /* renamed from: a */
        public final void onPostExecute(String str) {
            C8728a c8728a = C8728a.f16591c;
            if (c8728a != null) {
                for (C8722l c8722l : Collections.unmodifiableCollection(c8728a.f16592a)) {
                    if (this.f16660c.contains(c8722l.f16576h)) {
                        AbstractC8746a abstractC8746a = c8722l.f16573e;
                        if (this.f16662e >= abstractC8746a.f16630e && abstractC8746a.f16629d != 3) {
                            abstractC8746a.f16629d = 3;
                            C8734f.m3182a(abstractC8746a.m3169f(), "setNativeViewHierarchy", str);
                        }
                    }
                }
            }
            super.onPostExecute(str);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            return this.f16661d.toString();
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.c$g */
    /* loaded from: classes3.dex */
    public final class AsyncTaskC8765g extends AbstractAsyncTaskC8758b {
        public AsyncTaskC8765g(C8766d c8766d, HashSet hashSet, JSONObject jSONObject, long j) {
            super(c8766d, hashSet, jSONObject, j);
        }

        @Override // com.iab.omid.library.adcolony.walking.C8756c.AbstractAsyncTaskC8759c, android.os.AsyncTask
        /* renamed from: a */
        public final void onPostExecute(String str) {
            C8728a c8728a;
            if (!TextUtils.isEmpty(str) && (c8728a = C8728a.f16591c) != null) {
                for (C8722l c8722l : Collections.unmodifiableCollection(c8728a.f16592a)) {
                    if (this.f16660c.contains(c8722l.f16576h)) {
                        AbstractC8746a abstractC8746a = c8722l.f16573e;
                        if (this.f16662e >= abstractC8746a.f16630e) {
                            abstractC8746a.f16629d = 2;
                            C8734f.m3182a(abstractC8746a.m3169f(), "setNativeViewHierarchy", str);
                        }
                    }
                }
            }
            super.onPostExecute(str);
        }

        @Override // android.os.AsyncTask
        public final String doInBackground(Object[] objArr) {
            C8766d c8766d = (C8766d) this.f16664b;
            JSONObject jSONObject = c8766d.f16668a;
            JSONObject jSONObject2 = this.f16661d;
            if (C8742a.m3173d(jSONObject2, jSONObject)) {
                return null;
            }
            c8766d.f16668a = jSONObject2;
            return jSONObject2.toString();
        }
    }
}
