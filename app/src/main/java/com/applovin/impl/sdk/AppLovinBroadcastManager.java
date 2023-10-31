package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: f */
    private static AppLovinBroadcastManager f7517f;

    /* renamed from: g */
    private static final Object f7518g = new Object();

    /* renamed from: a */
    private final Context f7519a;

    /* renamed from: b */
    private final HashMap<Receiver, ArrayList<C3034b>> f7520b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C3034b>> f7521c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C3033a> f7522d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f7523e = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.this.m8091a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    /* loaded from: classes.dex */
    public interface Receiver {
        void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map);
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$a */
    /* loaded from: classes.dex */
    public static class C3033a {

        /* renamed from: a */
        final Intent f7525a;
        @Nullable

        /* renamed from: b */
        final Map<String, Object> f7526b;

        /* renamed from: c */
        final List<C3034b> f7527c;

        public C3033a(Intent intent, @Nullable Map<String, Object> map, List<C3034b> list) {
            this.f7525a = intent;
            this.f7526b = map;
            this.f7527c = list;
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$b */
    /* loaded from: classes.dex */
    public static class C3034b {

        /* renamed from: a */
        final IntentFilter f7528a;

        /* renamed from: b */
        final Receiver f7529b;

        /* renamed from: c */
        boolean f7530c;

        /* renamed from: d */
        boolean f7531d;

        public C3034b(IntentFilter intentFilter, Receiver receiver) {
            this.f7528a = intentFilter;
            this.f7529b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.f7519a = context;
    }

    /* renamed from: a */
    private List<C3034b> m8090a(Intent intent) {
        synchronized (this.f7520b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f7519a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<C3034b> arrayList = this.f7521c.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList<C3034b> arrayList2 = null;
            for (C3034b c3034b : arrayList) {
                if (!c3034b.f7530c && c3034b.f7528a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList3.add(c3034b);
                    c3034b.f7530c = true;
                    arrayList2 = arrayList3;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            for (C3034b c3034b2 : arrayList2) {
                c3034b2.f7530c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8091a() {
        int size;
        C3033a[] c3033aArr;
        while (true) {
            synchronized (this.f7520b) {
                size = this.f7522d.size();
                if (size <= 0) {
                    return;
                }
                c3033aArr = new C3033a[size];
                this.f7522d.toArray(c3033aArr);
                this.f7522d.clear();
            }
            for (int i = 0; i < size; i++) {
                C3033a c3033a = c3033aArr[i];
                if (c3033a != null) {
                    for (C3034b c3034b : c3033a.f7527c) {
                        if (c3034b != null && !c3034b.f7531d) {
                            c3034b.f7529b.onReceive(this.f7519a, c3033a.f7525a, c3033a.f7526b);
                        }
                    }
                }
            }
        }
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (f7518g) {
            if (f7517f == null) {
                f7517f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f7517f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.f7520b) {
            C3034b c3034b = new C3034b(intentFilter, receiver);
            ArrayList<C3034b> arrayList = this.f7520b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f7520b.put(receiver, arrayList);
            }
            arrayList.add(c3034b);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList<C3034b> arrayList2 = this.f7521c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f7521c.put(next, arrayList2);
                }
                arrayList2.add(c3034b);
            }
        }
    }

    public boolean sendBroadcast(Intent intent, @Nullable Map<String, Object> map) {
        synchronized (this.f7520b) {
            List<C3034b> m8090a = m8090a(intent);
            if (m8090a == null) {
                return false;
            }
            this.f7522d.add(new C3033a(intent, map, m8090a));
            if (!this.f7523e.hasMessages(1)) {
                this.f7523e.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public void sendBroadcastSync(Intent intent, @Nullable Map<String, Object> map) {
        List<C3034b> m8090a = m8090a(intent);
        if (m8090a == null) {
            return;
        }
        for (C3034b c3034b : m8090a) {
            if (!c3034b.f7531d) {
                c3034b.f7529b.onReceive(this.f7519a, intent, map);
            }
        }
    }

    public void sendBroadcastSyncWithPendingBroadcasts(Intent intent, @Nullable Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            m8091a();
        }
    }

    public boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public void unregisterReceiver(Receiver receiver) {
        synchronized (this.f7520b) {
            ArrayList<C3034b> remove = this.f7520b.remove(receiver);
            if (remove == null) {
                return;
            }
            for (C3034b c3034b : remove) {
                c3034b.f7531d = true;
                Iterator<String> actionsIterator = c3034b.f7528a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    ArrayList<C3034b> arrayList = this.f7521c.get(next);
                    if (arrayList != null) {
                        Iterator<C3034b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().f7529b == receiver) {
                                c3034b.f7531d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f7521c.remove(next);
                        }
                    }
                }
            }
        }
    }
}
