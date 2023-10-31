package androidx.activity;

import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.widget.Toolbar;

/* renamed from: androidx.activity.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0038b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f76a;

    /* renamed from: b */
    public final /* synthetic */ Object f77b;

    public /* synthetic */ RunnableC0038b(Object obj, int i) {
        this.f76a = i;
        this.f77b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0214i c0214i;
        int i = this.f76a;
        Object obj = this.f77b;
        switch (i) {
            case 0:
                ((ComponentActivity) obj).invalidateMenu();
                return;
            default:
                Toolbar.C0278f c0278f = ((Toolbar) obj).f1022M;
                if (c0278f == null) {
                    c0214i = null;
                } else {
                    c0214i = c0278f.f1061b;
                }
                if (c0214i != null) {
                    c0214i.collapseActionView();
                    return;
                }
                return;
        }
    }
}
