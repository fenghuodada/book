package com.applovin.impl.mediation.debugger.p021ui.p025c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.p025c.C2953b;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2955a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.c.a */
/* loaded from: classes.dex */
public class ActivityC2950a extends AbstractActivityC2918a {

    /* renamed from: a */
    private C2953b f7237a;

    /* renamed from: b */
    private ListView f7238b;

    public ActivityC2950a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        C2953b c2953b = this.f7237a;
        if (c2953b != null) {
            return c2953b.m8288a().m8375v();
        }
        return null;
    }

    public void initialize(final C2911b c2911b) {
        setTitle(c2911b.m8388i());
        C2953b c2953b = new C2953b(c2911b, this);
        this.f7237a = c2953b;
        c2953b.m8236a(new AbstractView$OnClickListenerC2961d.InterfaceC2963a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d.InterfaceC2963a
            /* renamed from: a */
            public void mo8220a(C2955a c2955a, C2957c c2957c) {
                if (c2955a.m8273a() == C2953b.EnumC2954a.TEST_ADS.ordinal()) {
                    C3214m m8375v = c2911b.m8375v();
                    C2911b.EnumC2913b m8394c = c2911b.m8394c();
                    if (C2911b.EnumC2913b.READY == m8394c) {
                        ActivityC2950a.this.startActivity(MaxDebuggerMultiAdActivity.class, m8375v.m7434af(), new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                            @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                            /* renamed from: a  reason: avoid collision after fix types in other method */
                            public void mo8290a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(c2911b);
                            }
                        });
                        return;
                    } else if (C2911b.EnumC2913b.DISABLED == m8394c) {
                        m8375v.m7478J().m8191d();
                        Utils.showAlert("Restart Required", c2957c.m8257m(), ActivityC2950a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", c2957c.m8257m(), ActivityC2950a.this);
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3393R.C3398layout.list_view);
        ListView listView = (ListView) findViewById(C3393R.C3396id.listView);
        this.f7238b = listView;
        listView.setAdapter((ListAdapter) this.f7237a);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f7237a.m8288a().m8384m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f7237a.m8281c();
            this.f7237a.m8233j();
        }
    }
}
