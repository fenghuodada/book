package com.ambrose.overwall;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.tool.util.util.C2603g;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.internal.observers.C10187b;
import io.reactivex.rxjava3.internal.operators.observable.C10202h;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import io.reactivex.rxjava3.schedulers.C10235a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WelcomeActivity extends Activity {

    /* renamed from: com.ambrose.overwall.WelcomeActivity$a */
    /* loaded from: classes.dex */
    public class C2390a implements InterfaceC10174b<Long> {
        public C2390a() {
        }

        @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
        public final void accept(Long l) throws Throwable {
            ArrayList arrayList;
            String m9338b = C2603g.m9338b("IntroduceV450");
            WelcomeActivity welcomeActivity = WelcomeActivity.this;
            if (m9338b == null) {
                welcomeActivity.startActivity(new Intent(welcomeActivity, AppIntroduceInfoActivity.class));
                arrayList = new ArrayList();
            } else {
                welcomeActivity.startActivity(new Intent(welcomeActivity, MainActivity.class));
                arrayList = new ArrayList();
            }
            arrayList.remove(WelcomeActivity.class);
            welcomeActivity.finish();
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    @SuppressLint({"CheckResult"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C10206b c10206b = C10235a.f20569a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c10206b, "scheduler is null");
        new C10202h(Math.max(0L, 0L), timeUnit, c10206b).m1223b(C10142b.m1225a()).m1221d(new C10187b(new C2390a(), C10179a.f20440d));
    }
}
