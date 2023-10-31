package com.google.firebase.sessions;

import androidx.annotation.Keep;
import com.google.android.datatransport.InterfaceC6467g;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.AbstractC10946b0;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(m509d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, m508d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1}, m504xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.unqualified(FirebaseApp.class);
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);
    private static final Qualified<AbstractC10946b0> backgroundDispatcher = Qualified.qualified(Background.class, AbstractC10946b0.class);
    private static final Qualified<AbstractC10946b0> blockingDispatcher = Qualified.qualified(Blocking.class, AbstractC10946b0.class);
    private static final Qualified<InterfaceC6467g> transportFactory = Qualified.unqualified(InterfaceC6467g.class);

    @Metadata(m509d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R8\u0010\b\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR8\u0010\n\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR8\u0010\f\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\tR8\u0010\u000e\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\r0\r\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR8\u0010\u0010\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0013"}, m508d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", "", "", "LIBRARY_NAME", "Ljava/lang/String;", "Lcom/google/firebase/components/Qualified;", "Lkotlinx/coroutines/b0;", "kotlin.jvm.PlatformType", "backgroundDispatcher", "Lcom/google/firebase/components/Qualified;", "blockingDispatcher", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/android/datatransport/g;", "transportFactory", "<init>", "()V", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final FirebaseSessions m13078getComponents$lambda0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        C10843j.m431e(obj, "container.get(firebaseApp)");
        FirebaseApp firebaseApp2 = (FirebaseApp) obj;
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        C10843j.m431e(obj2, "container.get(firebaseInstallationsApi)");
        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) obj2;
        Object obj3 = componentContainer.get(backgroundDispatcher);
        C10843j.m431e(obj3, "container.get(backgroundDispatcher)");
        AbstractC10946b0 abstractC10946b0 = (AbstractC10946b0) obj3;
        Object obj4 = componentContainer.get(blockingDispatcher);
        C10843j.m431e(obj4, "container.get(blockingDispatcher)");
        AbstractC10946b0 abstractC10946b02 = (AbstractC10946b0) obj4;
        Provider provider = componentContainer.getProvider(transportFactory);
        C10843j.m431e(provider, "container.getProvider(transportFactory)");
        return new FirebaseSessions(firebaseApp2, firebaseInstallationsApi2, abstractC10946b0, abstractC10946b02, provider);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        return C10752h.m485d(Component.builder(FirebaseSessions.class).name(LIBRARY_NAME).add(Dependency.required(firebaseApp)).add(Dependency.required(firebaseInstallationsApi)).add(Dependency.required(backgroundDispatcher)).add(Dependency.required(blockingDispatcher)).add(Dependency.requiredProvider(transportFactory)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions m13078getComponents$lambda0;
                m13078getComponents$lambda0 = FirebaseSessionsRegistrar.m13078getComponents$lambda0(componentContainer);
                return m13078getComponents$lambda0;
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
