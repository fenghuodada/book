package com.applovin.impl.mediation.debugger.p021ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C3038a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2918a extends Activity implements AppLovinCommunicatorSubscriber {
    protected List<String> communicatorTopics = new ArrayList();

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2920a<T extends Activity> {
        /* renamed from: a */
        void mo8290a(T t);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return getClass().getSimpleName();
    }

    public abstract C3214m getSdk();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !Utils.isPubInDebugMode(this, getSdk())) {
            setTheme(C3393R.C3400style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        List<String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }

    public void startActivity(final Class cls, final C3038a c3038a, final InterfaceC2920a interfaceC2920a) {
        c3038a.m8069a(new AbstractC3287a() { // from class: com.applovin.impl.mediation.debugger.ui.a.1
            @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (cls.isInstance(activity)) {
                    interfaceC2920a.mo8290a(activity);
                    c3038a.m8067b(this);
                }
            }
        });
        startActivity(new Intent(this, cls));
    }
}
