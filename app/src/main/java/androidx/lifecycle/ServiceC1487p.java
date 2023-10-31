package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.CallSuper;
import androidx.lifecycle.AbstractC1464h;
import kotlin.Deprecated;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class ServiceC1487p extends Service implements InterfaceC1483m {
    @NotNull

    /* renamed from: a */
    public final C1457e0 f3461a = new C1457e0(this);

    @Override // androidx.lifecycle.InterfaceC1483m
    @NotNull
    public final AbstractC1464h getLifecycle() {
        return this.f3461a.f3428a;
    }

    @Override // android.app.Service
    @CallSuper
    @Nullable
    public final IBinder onBind(@NotNull Intent intent) {
        C10843j.m430f(intent, "intent");
        this.f3461a.m10552a(AbstractC1464h.EnumC1465a.ON_START);
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        this.f3461a.m10552a(AbstractC1464h.EnumC1465a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        AbstractC1464h.EnumC1465a enumC1465a = AbstractC1464h.EnumC1465a.ON_STOP;
        C1457e0 c1457e0 = this.f3461a;
        c1457e0.m10552a(enumC1465a);
        c1457e0.m10552a(AbstractC1464h.EnumC1465a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated(message = "Deprecated in Java")
    @CallSuper
    public final void onStart(@Nullable Intent intent, int i) {
        this.f3461a.m10552a(AbstractC1464h.EnumC1465a.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    @CallSuper
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
