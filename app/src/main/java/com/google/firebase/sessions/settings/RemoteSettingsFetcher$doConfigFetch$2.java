package com.google.firebase.sessions.settings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.C10859x;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(m509d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m508d2 = {"Lkotlinx/coroutines/e0;", "Lkotlin/p;", "<anonymous>"}, m507k = 3, m506mv = {1, 7, 1})
@DebugMetadata(m454c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m453f = "RemoteSettingsFetcher.kt", m452i = {}, m451l = {68, 70, 73}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* loaded from: classes3.dex */
public final class RemoteSettingsFetcher$doConfigFetch$2 extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {
    final /* synthetic */ Map<String, String> $headerOptions;
    final /* synthetic */ InterfaceC10824p<String, InterfaceC10772d<? super C10868p>, Object> $onFailure;
    final /* synthetic */ InterfaceC10824p<JSONObject, InterfaceC10772d<? super C10868p>, Object> $onSuccess;
    int label;
    final /* synthetic */ RemoteSettingsFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, InterfaceC10824p<? super JSONObject, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p, InterfaceC10824p<? super String, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p2, InterfaceC10772d<? super RemoteSettingsFetcher$doConfigFetch$2> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.this$0 = remoteSettingsFetcher;
        this.$headerOptions = map;
        this.$onSuccess = interfaceC10824p;
        this.$onFailure = interfaceC10824p2;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.this$0, this.$headerOptions, this.$onSuccess, this.$onFailure, interfaceC10772d);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    @Nullable
    public final Object invoke(@NotNull InterfaceC10976e0 interfaceC10976e0, @Nullable InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        URL url;
        EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                C10864l.m418b(obj);
                url = this.this$0.settingsUrl();
                URLConnection openConnection = url.openConnection();
                C10843j.m432d(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    C10859x c10859x = new C10859x();
                    while (true) {
                        ?? readLine = bufferedReader.readLine();
                        c10859x.f21410a = readLine;
                        if (readLine == 0) {
                            break;
                        }
                        sb.append((String) readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    InterfaceC10824p<JSONObject, InterfaceC10772d<? super C10868p>, Object> interfaceC10824p = this.$onSuccess;
                    this.label = 1;
                    if (interfaceC10824p.invoke(jSONObject, this) == enumC10782a) {
                        return enumC10782a;
                    }
                } else {
                    InterfaceC10824p<String, InterfaceC10772d<? super C10868p>, Object> interfaceC10824p2 = this.$onFailure;
                    String str = "Bad response code: " + responseCode;
                    this.label = 2;
                    if (interfaceC10824p2.invoke(str, this) == enumC10782a) {
                        return enumC10782a;
                    }
                }
            } else if (i == 1 || i == 2) {
                C10864l.m418b(obj);
            } else if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C10864l.m418b(obj);
            }
        } catch (Exception e) {
            InterfaceC10824p<String, InterfaceC10772d<? super C10868p>, Object> interfaceC10824p3 = this.$onFailure;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.label = 3;
            if (interfaceC10824p3.invoke(message, this) == enumC10782a) {
                return enumC10782a;
            }
        }
        return C10868p.f21418a;
    }
}
