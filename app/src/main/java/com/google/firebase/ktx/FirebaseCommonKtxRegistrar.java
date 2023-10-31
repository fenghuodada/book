package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.AbstractC10946b0;
import kotlinx.coroutines.C10938a1;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(m509d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m508d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common-ktx"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<?>> getComponents() {
        Component build = Component.builder(Qualified.qualified(Background.class, AbstractC10946b0.class)).add(Dependency.required(Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC10946b0 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                C10843j.m431e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C10938a1.m354a((Executor) obj);
            }
        }).build();
        C10843j.m431e(build, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build2 = Component.builder(Qualified.qualified(Lightweight.class, AbstractC10946b0.class)).add(Dependency.required(Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC10946b0 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                C10843j.m431e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C10938a1.m354a((Executor) obj);
            }
        }).build();
        C10843j.m431e(build2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build3 = Component.builder(Qualified.qualified(Blocking.class, AbstractC10946b0.class)).add(Dependency.required(Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC10946b0 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                C10843j.m431e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C10938a1.m354a((Executor) obj);
            }
        }).build();
        C10843j.m431e(build3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Component build4 = Component.builder(Qualified.qualified(UiThread.class, AbstractC10946b0.class)).add(Dependency.required(Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final AbstractC10946b0 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                C10843j.m431e(obj, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return C10938a1.m354a((Executor) obj);
            }
        }).build();
        C10843j.m431e(build4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C10752h.m485d(LibraryVersionComponent.create(FirebaseKt.LIBRARY_NAME, BuildConfig.VERSION_NAME), build, build2, build3, build4);
    }
}
