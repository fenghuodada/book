package com.facebook.ads.redexgen.p036X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Xy */
/* loaded from: assets/audience_network.dex */
public class C5953Xy extends C44148U {
    public static String[] A03 = {"X2XwTp9cKPrsKt8nnsNrr4kzY8H6fo9U", "SYDx4pa2oLtOnCxt4l9slcAsJVX17", "Ktbncp6BUHUyG8VpVa87zDZ4pVgXb", "697llskWaiD0", "zjkPaZGeICZRQbBHOdPJm8zqRs5ofq42", "OjtN7hHvLZrci2lMJuqCcc7IsxYWRGMj", "Pfr7ktMWLkOUKtldLLax33ooDo", "AIe8uS1x9EYXvM4HhYe86uhhSayJeZWe"};
    public WeakHashMap<Repairable, Boolean> A00;
    public final WeakReference<Activity> A01;
    public final AtomicReference<InterfaceC39330R> A02;

    public C5953Xy(Activity activity, InterfaceC44168W interfaceC44168W, InterfaceC39330R interfaceC39330R) {
        super(activity.getApplicationContext(), interfaceC44168W);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(interfaceC39330R);
        this.A01 = new WeakReference<>(activity);
    }

    public C5953Xy(Context context, InterfaceC44168W interfaceC44168W, InterfaceC39330R interfaceC39330R) {
        super(context.getApplicationContext(), interfaceC44168W);
        this.A00 = new WeakHashMap<>();
        this.A02 = new AtomicReference<>();
        this.A02.set(interfaceC39330R);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A01 = new WeakReference<>(A00);
        } else {
            this.A01 = new WeakReference<>(null);
        }
    }

    @Nullable
    public static Activity A00(Context context) {
        while (true) {
            boolean z = context instanceof ContextWrapper;
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            A03[6] = "yJQbBA22nGzLcakEAa6nG1va8g";
            if (z) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                if ((context instanceof C5953Xy) && ((C5953Xy) context).A0C() != null) {
                    return ((C5953Xy) context).A0C();
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return null;
            }
        }
    }

    @Nullable
    public final Activity A0C() {
        return this.A01.get();
    }

    public InterfaceC39330R A0D() {
        InterfaceC39330R interfaceC39330R = this.A02.get();
        if (interfaceC39330R == null) {
            return new C6314dq();
        }
        return interfaceC39330R;
    }

    public final void A0E(InterfaceC39330R interfaceC39330R) {
        this.A02.set(interfaceC39330R);
    }

    public final void A0F(C5953Xy c5953Xy) {
        c5953Xy.A00.putAll(this.A00);
        this.A00 = c5953Xy.A00;
    }

    public final void A0G(Repairable repairable) {
        this.A00.put(repairable, true);
    }

    public final void A0H(Throwable th) {
        for (Map.Entry<Repairable, Boolean> entry : this.A00.entrySet()) {
            if (A03[3].length() != 12) {
                throw new RuntimeException();
            }
            A03[7] = "uNK1zxgBt2FFcnYPdsvApaChXeSIkfOy";
            entry.getKey().repair(th);
        }
    }
}
