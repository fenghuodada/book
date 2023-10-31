package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.c */
/* loaded from: classes.dex */
public abstract class AbstractC1880c<T> extends AbstractC1882d<T> {

    /* renamed from: h */
    public static final String f4564h = AbstractC2005l.m9732e("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final C1881a f4565g;

    /* renamed from: androidx.work.impl.constraints.trackers.c$a */
    /* loaded from: classes.dex */
    public class C1881a extends BroadcastReceiver {
        public C1881a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC1880c.this.mo9843g(intent);
            }
        }
    }

    public AbstractC1880c(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(context, interfaceC1998a);
        this.f4565g = new C1881a();
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: d */
    public final void mo9848d() {
        AbstractC2005l.m9733c().mo9731a(f4564h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f4569b.registerReceiver(this.f4565g, mo9844f());
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: e */
    public final void mo9847e() {
        AbstractC2005l.m9733c().mo9731a(f4564h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f4569b.unregisterReceiver(this.f4565g);
    }

    /* renamed from: f */
    public abstract IntentFilter mo9844f();

    /* renamed from: g */
    public abstract void mo9843g(@NonNull Intent intent);
}
