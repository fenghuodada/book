package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.AbstractC0066g;
import androidx.activity.result.InterfaceC0056b;
import androidx.activity.result.contract.AbstractC0058a;

/* renamed from: androidx.activity.f */
/* loaded from: classes.dex */
public final class RunnableC0044f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f83a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0058a.C0059a f84b;

    /* renamed from: c */
    public final /* synthetic */ ComponentActivity.C0028b f85c;

    public RunnableC0044f(ComponentActivity.C0028b c0028b, int i, AbstractC0058a.C0059a c0059a) {
        this.f85c = c0028b;
        this.f83a = i;
        this.f84b = c0059a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0056b<O> interfaceC0056b;
        T t = this.f84b.f108a;
        ComponentActivity.C0028b c0028b = this.f85c;
        String str = (String) c0028b.f116b.get(Integer.valueOf(this.f83a));
        if (str != null) {
            AbstractC0066g.C0067a c0067a = (AbstractC0066g.C0067a) c0028b.f120f.get(str);
            if (c0067a != null && (interfaceC0056b = c0067a.f123a) != 0) {
                if (c0028b.f119e.remove(str)) {
                    interfaceC0056b.onActivityResult(t);
                    return;
                }
                return;
            }
            c0028b.f122h.remove(str);
            c0028b.f121g.put(str, t);
        }
    }
}
