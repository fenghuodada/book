package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.C6607a;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6557p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6559r f10355a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6522n f10356b;

    /* renamed from: c */
    public final /* synthetic */ int f10357c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f10358d;

    public /* synthetic */ RunnableC6557p(C6559r c6559r, C6496d c6496d, int i, Runnable runnable) {
        this.f10355a = c6559r;
        this.f10356b = c6496d;
        this.f10357c = i;
        this.f10358d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        final AbstractC6522n abstractC6522n = this.f10356b;
        final int i = this.f10357c;
        Runnable runnable = this.f10358d;
        final C6559r c6559r = this.f10355a;
        InterfaceC6608b interfaceC6608b = c6559r.f10365f;
        try {
            try {
                InterfaceC6574d interfaceC6574d = c6559r.f10362c;
                Objects.requireNonNull(interfaceC6574d);
                interfaceC6608b.mo6227c(new C6558q(interfaceC6574d));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) c6559r.f10360a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    interfaceC6608b.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                        public final Object execute() {
                            C6559r.this.f10363d.mo6259a(abstractC6522n, i + 1);
                            return null;
                        }
                    });
                } else {
                    c6559r.m6260a(abstractC6522n, i);
                }
            } catch (C6607a unused) {
                c6559r.f10363d.mo6259a(abstractC6522n, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
