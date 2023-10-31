package com.google.android.material.textfield;

import com.google.firebase.installations.FirebaseInstallations;

/* renamed from: com.google.android.material.textfield.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7880o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f15517a;

    /* renamed from: b */
    public final /* synthetic */ Object f15518b;

    public /* synthetic */ RunnableC7880o(Object obj, int i) {
        this.f15517a = i;
        this.f15518b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15517a;
        Object obj = this.f15518b;
        switch (i) {
            case 0:
                C7884s c7884s = (C7884s) obj;
                boolean isPopupShowing = c7884s.f15525h.isPopupShowing();
                c7884s.m4374t(isPopupShowing);
                c7884s.f15530m = isPopupShowing;
                return;
            default:
                FirebaseInstallations.m3301b((FirebaseInstallations) obj);
                return;
        }
    }
}
