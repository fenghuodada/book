package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.concurrent.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8401p implements ComponentFactory {

    /* renamed from: a */
    public final /* synthetic */ int f16254a;

    public /* synthetic */ C8401p(int i) {
        this.f16254a = i;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        ScheduledExecutorService lambda$getComponents$6;
        switch (this.f16254a) {
            case 0:
                lambda$getComponents$6 = ExecutorsRegistrar.lambda$getComponents$6(componentContainer);
                return lambda$getComponents$6;
            default:
                return FirebaseInstallationsRegistrar.m3297a(componentContainer);
        }
    }
}
