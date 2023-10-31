package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.C9583h;
import com.unity3d.services.core.request.InterfaceC9579d;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.cache.f */
/* loaded from: classes3.dex */
class HandlerC9472f extends Handler {

    /* renamed from: a */
    private C9583h f18632a = null;

    /* renamed from: b */
    private boolean f18633b = false;

    /* renamed from: c */
    private boolean f18634c = false;

    /* renamed from: com.unity3d.services.core.cache.f$a */
    /* loaded from: classes3.dex */
    public class C9473a implements InterfaceC9579d {

        /* renamed from: a */
        private long f18635a = System.currentTimeMillis();

        /* renamed from: b */
        final /* synthetic */ File f18636b;

        /* renamed from: c */
        final /* synthetic */ int f18637c;

        public C9473a(File file, int i) {
            this.f18636b = file;
            this.f18637c = i;
        }

        @Override // com.unity3d.services.core.request.InterfaceC9579d
        /* renamed from: a */
        public void mo1904a(String str, long j, int i, Map<String, List<String>> map) {
            C9620a.m1774c().m1784a(EnumC9627b.CACHE, EnumC9470d.DOWNLOAD_STARTED, str, Long.valueOf(this.f18636b.length()), Long.valueOf(this.f18636b.length() + j), Integer.valueOf(i), Request.getResponseHeadersMap(map));
        }

        @Override // com.unity3d.services.core.request.InterfaceC9579d
        /* renamed from: a */
        public void mo1903a(String str, long j, long j2) {
            if (this.f18637c <= 0 || System.currentTimeMillis() - this.f18635a <= this.f18637c) {
                return;
            }
            this.f18635a = System.currentTimeMillis();
            C9620a.m1774c().m1784a(EnumC9627b.CACHE, EnumC9470d.DOWNLOAD_PROGRESS, str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: a */
    private C9583h m2230a(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new C9583h(str, "GET", hashMap2, i, i2);
    }

    /* renamed from: a */
    private void m2231a(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            C9549a.m2019b("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            C9549a.m2019b("Unity Ads cache: downloading of " + str + " stopped");
            C9620a.m1774c().m1784a(EnumC9627b.CACHE, EnumC9470d.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        C9549a.m2019b("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
        C9620a.m1774c().m1784a(EnumC9627b.CACHE, EnumC9470d.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Throwable, com.unity3d.services.core.webview.a] */
    /* JADX WARN: Type inference failed for: r16v15, types: [long, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.unity3d.services.core.cache.f] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v10, types: [com.unity3d.services.core.cache.c] */
    /* JADX WARN: Type inference failed for: r6v12, types: [com.unity3d.services.core.cache.c] */
    /* JADX WARN: Type inference failed for: r6v14, types: [com.unity3d.services.core.cache.c] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.unity3d.services.core.cache.c] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.unity3d.services.core.cache.c] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.unity3d.services.core.cache.c] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m2229a(java.lang.String r23, java.lang.String r24, int r25, int r26, int r27, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.HandlerC9472f.m2229a(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean):void");
    }

    /* renamed from: a */
    public void m2228a(boolean z) {
        C9583h c9583h;
        this.f18633b = z;
        if (!z || (c9583h = this.f18632a) == null) {
            return;
        }
        this.f18634c = false;
        c9583h.m1902a();
    }

    /* renamed from: a */
    public boolean m2232a() {
        return this.f18634c;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HashMap<String, List<String>> hashMap;
        Bundle data = message.getData();
        String string = data.getString(FirebaseAnalytics.Param.SOURCE);
        data.remove(FirebaseAnalytics.Param.SOURCE);
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            C9549a.m2019b("There are headers left in data, reading them");
            HashMap<String, List<String>> hashMap2 = new HashMap<>();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this.f18634c = false;
            C9620a.m1774c().m1784a(EnumC9627b.CACHE, EnumC9470d.DOWNLOAD_ERROR, EnumC9469c.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            m2229a(string, string2, i, i2, i3, hashMap, z);
        }
    }
}
