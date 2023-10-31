package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.View$OnLongClickListenerC0346f2;

/* renamed from: androidx.activity.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0046h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f89a;

    /* renamed from: b */
    public final /* synthetic */ Object f90b;

    public /* synthetic */ RunnableC0046h(Object obj, int i) {
        this.f89a = i;
        this.f90b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f89a;
        Object obj = this.f90b;
        switch (i) {
            case 0:
                ComponentActivity.ViewTreeObserver$OnDrawListenerC0032f viewTreeObserver$OnDrawListenerC0032f = (ComponentActivity.ViewTreeObserver$OnDrawListenerC0032f) obj;
                Runnable runnable = viewTreeObserver$OnDrawListenerC0032f.f53b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserver$OnDrawListenerC0032f.f53b = null;
                    return;
                }
                return;
            default:
                ((View$OnLongClickListenerC0346f2) obj).m12637a();
                return;
        }
    }
}
