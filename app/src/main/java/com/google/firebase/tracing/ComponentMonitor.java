package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            FirebaseTrace.popTrace();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component<?> component : componentRegistrar.getComponents()) {
            final String name = component.getName();
            if (name != null) {
                component = component.withFactory(new ComponentFactory() { // from class: com.google.firebase.tracing.a
                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        Object lambda$processRegistrar$0;
                        lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(name, component, componentContainer);
                        return lambda$processRegistrar$0;
                    }
                });
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
