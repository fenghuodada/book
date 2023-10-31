package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class InitializationNotificationCenter implements IInitializationNotificationCenter {

    /* renamed from: a */
    private static InitializationNotificationCenter f18688a;

    /* renamed from: b */
    private HashMap<Integer, IInitializationListener> f18689b = new HashMap<>();

    /* renamed from: com.unity3d.services.core.configuration.InitializationNotificationCenter$a */
    /* loaded from: classes3.dex */
    public class RunnableC9477a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f18690a;

        public RunnableC9477a(Map.Entry entry) {
            this.f18690a = entry;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((IInitializationListener) this.f18690a.getValue()).onSdkInitialized();
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializationNotificationCenter$b */
    /* loaded from: classes3.dex */
    public class RunnableC9478b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f18692a;

        /* renamed from: b */
        final /* synthetic */ String f18693b;

        /* renamed from: c */
        final /* synthetic */ ErrorState f18694c;

        /* renamed from: d */
        final /* synthetic */ int f18695d;

        public RunnableC9478b(Map.Entry entry, String str, ErrorState errorState, int i) {
            this.f18692a = entry;
            this.f18693b = str;
            this.f18694c = errorState;
            this.f18695d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((IInitializationListener) this.f18692a.getValue()).onSdkInitializationFailed(this.f18693b, this.f18694c, this.f18695d);
        }
    }

    /* renamed from: a */
    private void m2216a(Integer num) {
        this.f18689b.remove(num);
    }

    public static InitializationNotificationCenter getInstance() {
        if (f18688a == null) {
            f18688a = new InitializationNotificationCenter();
        }
        return f18688a;
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this.f18689b) {
            if (iInitializationListener != null) {
                this.f18689b.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this.f18689b) {
            if (iInitializationListener != null) {
                m2216a(new Integer(iInitializationListener.hashCode()));
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        synchronized (this.f18689b) {
            String str2 = "SDK Failed to Initialize due to " + str;
            C9549a.m2017c(str2);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this.f18689b.entrySet()) {
                if (entry.getValue() != null) {
                    C9564j.m1991a(new RunnableC9478b(entry, str2, errorState, i));
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f18689b.remove((Integer) it.next());
            }
        }
    }

    @Override // com.unity3d.services.core.configuration.IInitializationNotificationCenter
    public void triggerOnSdkInitialized() {
        synchronized (this.f18689b) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<Integer, IInitializationListener> entry : this.f18689b.entrySet()) {
                if (entry.getValue() != null) {
                    C9564j.m1991a(new RunnableC9477a(entry));
                } else {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f18689b.remove((Integer) it.next());
            }
        }
    }
}
