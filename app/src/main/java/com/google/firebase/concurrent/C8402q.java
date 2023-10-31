package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;

/* renamed from: com.google.firebase.concurrent.q */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8402q implements ComponentFactory {

    /* renamed from: a */
    public final /* synthetic */ int f16255a;

    public /* synthetic */ C8402q(int i) {
        this.f16255a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        switch (this.f16255a) {
            case 0:
                return ExecutorsRegistrar.m3363e(componentContainer);
            default:
                return DefaultUserAgentPublisher.m3296a(componentContainer);
        }
    }
}
