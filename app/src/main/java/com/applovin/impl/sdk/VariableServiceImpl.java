package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p033e.C3157m;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a */
    private final C3214m f7554a;

    /* renamed from: d */
    private AppLovinVariableService.OnVariablesUpdateListener f7557d;

    /* renamed from: e */
    private Bundle f7558e;

    /* renamed from: b */
    private final AtomicBoolean f7555b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f7556c = new AtomicBoolean();

    /* renamed from: f */
    private final Object f7559f = new Object();

    public VariableServiceImpl(C3214m c3214m) {
        this.f7554a = c3214m;
        String str = (String) c3214m.m7454a(C3111d.f8074j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    /* renamed from: a */
    private Object m8072a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            }
            return obj;
        }
        if (C3349v.m6862a() && !this.f7554a.m7411d()) {
            C3349v.m6847h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f7559f) {
            if (this.f7558e == null) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                }
                return obj;
            } else if (cls.equals(String.class)) {
                return this.f7558e.getString(str, (String) obj);
            } else if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.f7558e.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    /* renamed from: a */
    private void m8074a() {
        Bundle bundle;
        synchronized (this.f7559f) {
            if (this.f7557d != null && (bundle = this.f7558e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f7557d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) m8072a(str, Boolean.valueOf(z), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) m8072a(str, str2, String.class);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        String str;
        if (this.f7554a.m7411d()) {
            if (this.f7555b.compareAndSet(false, true)) {
                this.f7554a.m7469S().m7620a(new C3157m(this.f7554a, new C3157m.InterfaceC3159a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // com.applovin.impl.sdk.p033e.C3157m.InterfaceC3159a
                    /* renamed from: a */
                    public void mo7626a() {
                        VariableServiceImpl.this.f7555b.set(false);
                    }
                }), C3163o.EnumC3165a.BACKGROUND);
                return;
            } else if (!C3349v.m6862a()) {
                return;
            } else {
                str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
            }
        } else if (!C3349v.m6862a()) {
            return;
        } else {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        }
        C3349v.m6846i("AppLovinVariableService", str);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f7557d = onVariablesUpdateListener;
        synchronized (this.f7559f) {
            if (onVariablesUpdateListener != null) {
                if (this.f7558e != null && this.f7556c.compareAndSet(false, true)) {
                    if (C3349v.m6862a()) {
                        this.f7554a.m7487A().m6855b("AppLovinVariableService", "Setting initial listener");
                    }
                    m8074a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f7558e + ", listener=" + this.f7557d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f7554a.m7487A();
            m7487A.m6855b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        }
        synchronized (this.f7559f) {
            this.f7558e = JsonUtils.toBundle(jSONObject);
            m8074a();
            this.f7554a.m7453a((C3111d<C3111d<String>>) C3111d.f8074j, (C3111d<String>) jSONObject.toString());
        }
    }
}
