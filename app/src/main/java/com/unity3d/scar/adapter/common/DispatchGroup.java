package com.unity3d.scar.adapter.common;

/* loaded from: classes3.dex */
public class DispatchGroup {

    /* renamed from: a */
    public int f18002a = 0;

    /* renamed from: b */
    public Runnable f18003b;

    public synchronized void enter() {
        this.f18002a++;
    }

    public synchronized void leave() {
        Runnable runnable;
        int i = this.f18002a - 1;
        this.f18002a = i;
        if (i <= 0 && (runnable = this.f18003b) != null) {
            runnable.run();
        }
    }

    public void notify(Runnable runnable) {
        this.f18003b = runnable;
        if (this.f18002a <= 0 && runnable != null) {
            runnable.run();
        }
    }
}
