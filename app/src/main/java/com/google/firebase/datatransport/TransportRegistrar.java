package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.InterfaceC6467g;
import com.google.android.datatransport.cct.C6431a;
import com.google.android.datatransport.runtime.C6527r;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6467g lambda$getComponents$0(ComponentContainer componentContainer) {
        C6527r.m6270b((Context) componentContainer.get(Context.class));
        return C6527r.m6271a().m6269c(C6431a.f10062e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(InterfaceC6467g.class).name(LIBRARY_NAME).add(Dependency.required(Context.class)).factory(new ComponentFactory() { // from class: com.google.firebase.datatransport.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                InterfaceC6467g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(componentContainer);
                return lambda$getComponents$0;
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
